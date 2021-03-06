package com.example.administrator.bookreader.service;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;

import com.example.administrator.bookreader.other.ChapterLoadTask;

public class ChapterLoadService extends Service {
    public ChapterLoadService() {
    }
private LoadChapterBinder mBinder = new LoadChapterBinder();

    class LoadChapterBinder extends Binder{
        public void startLoading(String url){
            new ChapterLoadTask().execute(url);
        }

    }


    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        return mBinder;
    }
}
