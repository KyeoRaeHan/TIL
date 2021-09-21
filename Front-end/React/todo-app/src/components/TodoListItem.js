import React from 'react';
import {MdCheckBoxOutlineBlank, MdCheckBox, MdRemoveCircleOutline,} from 'react-icons/md';
// import './TodoListItem.scss';

const TodoListItem = () => {
    return (
        <div className='TodoListItem'>

            {/* 이건뭐지? */}
            <div className = "checkbox">
                <MdCheckBoxOutlineBlank />
                <div className = 'text'>할 일 </div>
            </div>
            <div className="remove">
                <MdRemoveCircleOutline />
            </div>
        </div>
    );
};

export default TodoListItem;