package com.darren.test.wordcount;

import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;
import org.apache.log4j.Logger;

public class WordCoundReducer extends Reducer<Text, IntWritable, Text, IntWritable> {
    private static final Logger LOG = Logger.getLogger(WordCoundReducer.class);
    @Override
    protected void reduce(Text key, Iterable<IntWritable> values, Context context)
            throws IOException, InterruptedException {
        int sum = 0;
        for (IntWritable value : values) {
            LOG.info("value.get() = " + value.get());
            sum += value.get();
        }
        LOG.info("key = " + key);
        context.write(key, new IntWritable(sum));
    }

}
