package com.techzen.techlearn.entity;

import com.techzen.techlearn.enums.CalendarStatus;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "teacher_calendar")
public class TeacherCalendar extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String title;

    @Column(name = "startTime")
    private LocalDateTime startTime;

    @Column(name = "endTime")
    private LocalDateTime endTime;

    @Column(name = "isAllDay")
    private boolean isAllDay;

    @Column(length = 36)
    private String guid;

    @Column(name = "description", columnDefinition = "TEXT")
    private String description;

    @Column(name = "startTimezone")
    private String startTimezone;

    @Column(name = "endTimezone")
    private String endTimezone;

    @ManyToOne
    @JoinColumn(name = "teacher_id", referencedColumnName = "id")
    private Teacher teacher;

    @Enumerated(EnumType.STRING)
    @Column(name = "status", nullable = false)
    private CalendarStatus status;

    @Column(name = "course_id")
    private long courseId;

    @Column(name = "chapter_id")
    private long chapterId;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private UserEntity user;
}