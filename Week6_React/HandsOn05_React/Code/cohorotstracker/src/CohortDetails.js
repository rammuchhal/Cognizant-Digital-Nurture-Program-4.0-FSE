import React from 'react';
import styles from './CohortDetails.module.css';

const CohortDetails = ({ title, status, startedOn, coach, trainer }) => {


    const titleStyle = {
        color: status === 'Ongoing' ? 'green' : 'blue',
    };

    return (
        <div className={styles.box}>
            <h3 style={titleStyle}>{title}</h3>

            {/* Using a description list for semantic HTML */}
            <dl>
                <div>
                    <dt>Started On</dt>
                    <dd>{startedOn}</dd>
                </div>
                <div>
                    <dt>Current Status</dt>
                    <dd>{status}</dd>
                </div>
                <div>
                    <dt>Coach</dt>
                    <dd>{coach}</dd>
                </div>
                <div>
                    <dt>Trainer</dt>
                    <dd>{trainer}</dd>
                </div>
            </dl>
        </div>
    );
};

export default CohortDetails;
