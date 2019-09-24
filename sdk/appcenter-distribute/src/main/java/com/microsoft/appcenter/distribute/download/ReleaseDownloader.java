package com.microsoft.appcenter.distribute.download;

import android.support.annotation.NonNull;

import com.microsoft.appcenter.distribute.ReleaseDetails;

/**
 * Interface for downloading release.
 */
public interface ReleaseDownloader {

    // TODO rename download to ?
    /**
     * Start or resume downloading the installer for the release.
     *
     * @param releaseDetails TODO
     * @param listener       Download listener.
     */
    void download(ReleaseDetails releaseDetails, Listener listener);

    /**
     * Remove previously downloaded release.
     */
    void delete();

    /**
     * TODO
     */
    interface Listener {

        /**
         * Called periodically during download to display current progress.
         *
         * @param downloadProgress //todo
         */
        void onProgress(DownloadProgress downloadProgress);

        /**
         * Called when the downloading is completed.
         *
         * @param localUri The local URI of the file.
         */
        void onComplete(@NonNull String localUri);

        /**
         * Called when an error occurs during the downloading.
         *
         * @param errorMessage The message of the exception.
         */
        void onError(@NonNull String errorMessage);
    }

}
