package com.matmazur.timeregistratordemo.model;

import javax.persistence.*;
import java.time.LocalTime;
import java.util.Objects;

@Entity
public class TimeStamp {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_time_stamp")
    private Long id;
    private String name;
    private String surname;
    private LocalTime time;

    private TimeStamp(String name, String surname, LocalTime time) {
        this.name = name;
        this.surname = surname;
        this.time = time;
    }

    public TimeStamp() {
    }

    public static Builder builder() {
        return new Builder();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TimeStamp timeStamp = (TimeStamp) o;
        return Objects.equals(id, timeStamp.id) &&
                Objects.equals(name, timeStamp.name) &&
                Objects.equals(surname, timeStamp.surname) &&
                Objects.equals(time, timeStamp.time);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, surname, time);
    }

    @Override
    public String toString() {
        return "TimeStamp{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", time=" + time +
                '}';
    }

    public static class Builder {

        private String name;
        private String surname;
        private LocalTime time;

        public Builder withName(String name) {
            this.name = name;
            return this;
        }

        public Builder withSurname(String surname) {
            this.surname = surname;
            return this;
        }

        public Builder withTime(LocalTime time) {
            this.time = time;
            return this;
        }

        public TimeStamp build() {
            return new TimeStamp(name, surname, time);
        }
    }
}
