import React from 'react';
import { Link } from 'react-router-dom';

// The component receives the list of trainers as a prop
const TrainersList = ({ trainers }) => {
    return (
        <div>
            <h3>List of Trainers</h3>
            <ul>
                {/* Map through the trainers array to create a link for each one */}
                {trainers.map(trainer => (
                    <li key={trainer.trainerId}>
                        <Link to={`/trainer/${trainer.trainerId}`}>
                            {trainer.name}
                        </Link>
                    </li>
                ))}
            </ul>
        </div>
    );
};

export default TrainersList;