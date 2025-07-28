import React from 'react';
import { useParams } from 'react-router-dom';

// It receives the mock data array as a prop
const TrainerDetail = ({ trainers }) => {
    // Get the 'id' parameter from the URL (e.g., 't-syed')
    const { id } = useParams();

    // Find the trainer in the array whose trainerId matches the id from the URL
    const trainer = trainers.find(t => t.trainerId === id);

    // If no trainer is found, display a message
    if (!trainer) {
        return <div>Trainer not found!</div>;
    }

    // If a trainer is found, display their details
    return (
        <div>
            <h3>Trainer Details</h3>
            <p><strong>Name:</strong> {trainer.name}</p>
            <p><strong>Email:</strong> {trainer.email}</p>
            <p><strong>Phone:</strong> {trainer.phone}</p>
            <p><strong>Stream:</strong> {trainer.technology}</p>
            <p><strong>Skills:</strong> {trainer.skills.join(', ')}</p>
        </div>
    );
};

export default TrainerDetail;
