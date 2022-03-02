import React, { useState, useEffect } from 'react';
import ReactDOM from 'react-dom';
import { Typography, Button } from 'antd';
import { Line } from '@ant-design/plots';
import './lines.css';
import { BarChartOutlined } from '@ant-design/icons';

const useLines = () => {

    const [displayData, setDisplayData] = useState(true);

    const data = [
        {
            year: '2019Q2',
            value: displayData ? 30.9 : 28.9,
        },
        {
            year: '2019Q3',
            value: displayData ? 23.4 : 35.4,
        },
        {
            year: '2019Q4',
            value: 23.5,
        },
        {
            year: '2020Q1',
            value: 26.9,
        },
        {
            year: '2020Q2',
            value: 29.6,
        },
        {
            year: '2020Q3',
            value: 29.6,
        },
        {
            year: '2020Q4',
            value: 29.6,
        },
        {
            year: '2021Q1',
            value: 29.6,
        },
    ];

    // another approach
    // const data_precent = [
    //     28.9,
    //     35.4,
    //     23.5,
    //     26.9,
    //     29.6,
    //     29.6,
    //     29.6,
    //     29.6,
    // ]
    // const data_name = []
    // const column_x = useSelector(state => state.column.value);
    // const data_y = useSelector(state => state.data.value);

    // {
    //     column_x.slice(1).map((element, index) => {
    //         data_name.push({ x: element.title, y: data_precent[index] });
    //         // console.log(data_name);
    //     })
    // }

    const config = {
        data,
        xField: 'year',
        yField: 'value',
        point: {
            size: 5,
            shape: 'diamond',
        },
    };
    
    return (

        < div className='lines-container' >
            <Typography.Title level={4}>趋势</Typography.Title>
            <Line {...config} className='line' />
            <Button style={{ marginTop: '20px' }} onClick={() => { setDisplayData(!displayData) }} icon={<BarChartOutlined />}>产品</Button>
            <Button style={{ marginTop: '20px' }} onClick={() => { setDisplayData(!displayData) }} icon={<BarChartOutlined />}>地区</Button>
        </div >

    )
};

export default useLines;