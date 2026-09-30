package com.google.firebase.crashlytics.internal.settings;

import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import io.sentry.instrumentation.file.e;
import io.sentry.instrumentation.file.g;
import java.io.File;
import java.io.FileInputStream;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public class CachedSettingsIo {
    private static final String SETTINGS_CACHE_FILENAME = "com.crashlytics.settings.json";
    private final File cachedSettingsFile;

    public CachedSettingsIo(FileStore fileStore) {
        this.cachedSettingsFile = fileStore.getCommonFile(SETTINGS_CACHE_FILENAME);
    }

    private File getSettingsFile() {
        return this.cachedSettingsFile;
    }

    public JSONObject readCachedSettings() {
        Throwable th;
        FileInputStream fileInputStreamB;
        JSONObject jSONObject;
        Logger.getLogger().d("Checking for cached settings...");
        FileInputStream fileInputStream = null;
        try {
            File settingsFile = getSettingsFile();
            if (settingsFile.exists()) {
                fileInputStreamB = io.sentry.config.a.b(settingsFile, new FileInputStream(settingsFile));
                try {
                    try {
                        jSONObject = new JSONObject(CommonUtils.streamToString(fileInputStreamB));
                        fileInputStream = fileInputStreamB;
                    } catch (Throwable th2) {
                        th = th2;
                        CommonUtils.closeOrLog(fileInputStreamB, "Error while closing settings cache file.");
                        throw th;
                    }
                } catch (Exception e) {
                    e = e;
                    Logger.getLogger().e("Failed to fetch cached settings", e);
                    CommonUtils.closeOrLog(fileInputStreamB, "Error while closing settings cache file.");
                    return null;
                }
            } else {
                Logger.getLogger().v("Settings file does not exist.");
                jSONObject = null;
            }
            CommonUtils.closeOrLog(fileInputStream, "Error while closing settings cache file.");
            return jSONObject;
        } catch (Exception e2) {
            e = e2;
            fileInputStreamB = null;
        } catch (Throwable th3) {
            th = th3;
            fileInputStreamB = null;
            CommonUtils.closeOrLog(fileInputStreamB, "Error while closing settings cache file.");
            throw th;
        }
    }

    public void writeCachedSettings(long j, JSONObject jSONObject) {
        Logger.getLogger().v("Writing settings to cache file...");
        if (jSONObject == null) {
            return;
        }
        g gVar = null;
        try {
            try {
                jSONObject.put("expires_at", j);
                g gVar2 = new g(new e(e.b(getSettingsFile(), null, false)));
                try {
                    gVar2.write(jSONObject.toString());
                    gVar2.flush();
                    CommonUtils.closeOrLog(gVar2, "Failed to close settings writer.");
                } catch (Exception e) {
                    e = e;
                    gVar = gVar2;
                    Logger.getLogger().e("Failed to cache settings", e);
                    CommonUtils.closeOrLog(gVar, "Failed to close settings writer.");
                } catch (Throwable th) {
                    th = th;
                    gVar = gVar2;
                    CommonUtils.closeOrLog(gVar, "Failed to close settings writer.");
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e2) {
            e = e2;
        }
    }
}
