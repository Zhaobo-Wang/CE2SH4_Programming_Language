import { createSlice } from "@reduxjs/toolkit";
import { Space, Button } from 'antd';
import { BarChartOutlined } from '@ant-design/icons';

const initialStateValue = [
    {
        title: '投资主体',
        dataIndex: 'name',
        key: 'name',
    },
    {
        title: '2019Q2',
        dataIndex: 'Value2019Q2',
        key: 'Value2019Q2',
    },
    {
        title: '2019Q3',
        dataIndex: 'Value2019Q3',
        key: 'Value2019Q3',
    },
    {
        title: '2019Q4',
        dataIndex: 'Value2019Q4',
        key: 'Value2019Q4',
    },
    {
        title: '2020Q1',
        dataIndex: 'Value2020Q1',
        key: 'Value2020Q1',
    },
    {
        title: '2020Q2',
        dataIndex: 'Value2020Q2',
        key: 'Value2020Q2',
    },
    {
        title: '2020Q3',
        dataIndex: 'Value2020Q3',
        key: 'Value2020Q3',
    },
    {
        title: '2020Q4',
        dataIndex: 'Value2020Q4',
        key: 'Value2020Q4',
    },
    {
        title: '2021Q1',
        dataIndex: 'Value2021Q1',
        key: 'Value2021Q1',
    },
];

export const columnSlice = createSlice({
    name: 'column',
    initialState: { value: initialStateValue },
    reducers: {
        add: (state, action) => {
            state.value = action.payload;
        }
    }
})

export default columnSlice.reducer;
export const { add } = columnSlice.actions;