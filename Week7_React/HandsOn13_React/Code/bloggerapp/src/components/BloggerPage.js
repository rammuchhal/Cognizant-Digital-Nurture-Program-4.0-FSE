import React from 'react';
import BookDetails from './BookDetails';
import BlogDetails from './BlogDetails';
import CourseDetails from './CourseDetails';

// This component holds the data and arranges the detail components.
function BloggerPage() {
    // Data for the components
    const books = [
        { id: 101, bname: 'Master React', price: 670 },
        { id: 102, bname: 'Deep Dive into Angular 11', price: 800 },
        { id: 103, bname: 'Mongo Essentials', price: 450 },
    ];

    const blogs = [
        { title: 'React Learning', content: 'Welcome to learning React!' },
        { title: 'Installation', content: 'You can install React from npm.' },
    ];

    const courses = [
        { name: 'Angular', date: '4/5/2021' },
        { name: 'React', date: '6/3/2021' },
    ];

    return (
        <div className="blogger-container">
            <CourseDetails courses={courses} />
            <BookDetails books={books} />
            <BlogDetails blogs={blogs} />
        </div>
    );
}

export default BloggerPage;
