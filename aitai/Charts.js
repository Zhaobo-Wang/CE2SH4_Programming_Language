import React from 'react';
import { Select, Typography, Cascader } from 'antd';
import { Bar } from '@ant-design/plots';
import './charts.css';

const select_choice = [
    '2020Q1',
    '2020Q2',
    '2020Q3',
    '2020Q4'
];
const { Option } = Select;

const Charts = () => {
    
    const data = [
        {
            name: '实际',
            value: 38,
        },
        {
            name: '预测',
            value: 52,
        },
    ];
    const config = {
        data,
        xField: 'value',
        yField: 'name',
        seriesField: 'name',
        legend: {
            position: 'bottom-right',
        },
    };


    return (
        <div className='charts-container'>
            <Typography.Title level={4} style={{ display: 'inline', marginRight: '20px' }}>构成</Typography.Title>
            <Select defaultValue={select_choice[0]}>
                {
                    select_choice?.map((element) => {
                        return (
                            <Option>
                                {element}
                            </Option>
                        )
                    })
                }
            </Select>
            <Bar {...config} className='bar' />
        </div>
    )

}

export default Charts