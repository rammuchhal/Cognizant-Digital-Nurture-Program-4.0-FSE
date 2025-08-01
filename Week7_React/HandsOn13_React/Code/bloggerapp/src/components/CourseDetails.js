import React from 'react';

// This component receives an array of courses and displays them.
function CourseDetails({ courses }) {
    return (
        <div className="details-card">
            <h2>Course Details</h2>
            {courses.map((course, index) => (
                <div key={index}>
                    <h4>{course.name}</h4>
                    <p>Date: {course.date}</p>
                </div>
            ))}
        </div>
    );
}

export default CourseDetails;
