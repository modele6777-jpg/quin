package com.google.firebase.crashlytics.internal.metadata;

import com.adjust.sdk.Constants;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import defpackage.m6c;
import defpackage.ub3;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
class MetaDataStore {
    private static final String KEY_USER_ID = "userId";
    private static final Charset UTF_8 = Charset.forName(Constants.ENCODING);
    private final FileStore fileStore;

    public MetaDataStore(FileStore fileStore) {
        this.fileStore = fileStore;
    }

    private static Map<String, String> jsonToKeysData(String str) {
        JSONObject jSONObject = new JSONObject(str);
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            map.put(next, valueOrNull(jSONObject, next));
        }
        return map;
    }

    private static List<RolloutAssignment> jsonToRolloutsState(String str) throws JSONException {
        JSONArray jSONArray = new JSONObject(str).getJSONArray("rolloutsState");
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            String string = jSONArray.getString(i);
            try {
                arrayList.add(RolloutAssignment.create(string));
            } catch (Exception e) {
                Logger.getLogger().w("Failed de-serializing rollouts state. " + string, e);
            }
        }
        return arrayList;
    }

    private String jsonToUserId(String str) {
        return valueOrNull(new JSONObject(str), KEY_USER_ID);
    }

    private static String keysDataToJson(Map<String, String> map) {
        return new JSONObject(map).toString();
    }

    private static String rolloutsStateToJson(List<RolloutAssignment> list) {
        HashMap map = new HashMap();
        JSONArray jSONArray = new JSONArray();
        for (int i = 0; i < list.size(); i++) {
            try {
                jSONArray.put(new JSONObject(((m6c) RolloutAssignment.ROLLOUT_ASSIGNMENT_JSON_ENCODER).r(list.get(i))));
            } catch (JSONException e) {
                Logger.getLogger().w("Exception parsing rollout assignment!", e);
            }
        }
        map.put("rolloutsState", jSONArray);
        return new JSONObject(map).toString();
    }

    private static void safeDeleteCorruptFile(File file, String str) {
        if (file.exists() && file.delete()) {
            Logger.getLogger().i("Deleted corrupt file: " + file.getAbsolutePath() + "\nReason: " + str);
        }
    }

    private static String userIdToJson(String str) {
        return new JSONObject(str) { // from class: com.google.firebase.crashlytics.internal.metadata.MetaDataStore.1
            final /* synthetic */ String val$userId;

            {
                this.val$userId = str;
                put(MetaDataStore.KEY_USER_ID, str);
            }
        }.toString();
    }

    private static String valueOrNull(JSONObject jSONObject, String str) {
        if (jSONObject.isNull(str)) {
            return null;
        }
        return jSONObject.optString(str, null);
    }

    public File getInternalKeysFileForSession(String str) {
        return this.fileStore.getSessionFile(str, UserMetadata.INTERNAL_KEYDATA_FILENAME);
    }

    public File getKeysFileForSession(String str) {
        return this.fileStore.getSessionFile(str, UserMetadata.KEYDATA_FILENAME);
    }

    public File getRolloutsStateForSession(String str) {
        return this.fileStore.getSessionFile(str, UserMetadata.ROLLOUTS_STATE_FILENAME);
    }

    public File getUserDataFileForSession(String str) {
        return this.fileStore.getSessionFile(str, UserMetadata.USERDATA_FILENAME);
    }

    public Map<String, String> readKeyData(String str, boolean z) {
        File internalKeysFileForSession = z ? getInternalKeysFileForSession(str) : getKeysFileForSession(str);
        if (!internalKeysFileForSession.exists() || internalKeysFileForSession.length() == 0) {
            safeDeleteCorruptFile(internalKeysFileForSession, ub3.i("The file has a length of zero for session: ", str));
            return Collections.EMPTY_MAP;
        }
        FileInputStream fileInputStreamB = null;
        try {
            fileInputStreamB = io.sentry.config.a.b(internalKeysFileForSession, new FileInputStream(internalKeysFileForSession));
            return jsonToKeysData(CommonUtils.streamToString(fileInputStreamB));
        } catch (Exception e) {
            Logger.getLogger().w("Error deserializing user metadata.", e);
            safeDeleteCorruptFile(internalKeysFileForSession);
            return Collections.EMPTY_MAP;
        } finally {
            CommonUtils.closeOrLog(fileInputStreamB, "Failed to close user metadata file.");
        }
    }

    public List<RolloutAssignment> readRolloutsState(String str) {
        File rolloutsStateForSession = getRolloutsStateForSession(str);
        if (!rolloutsStateForSession.exists() || rolloutsStateForSession.length() == 0) {
            safeDeleteCorruptFile(rolloutsStateForSession, ub3.i("The file has a length of zero for session: ", str));
            return Collections.EMPTY_LIST;
        }
        FileInputStream fileInputStreamB = null;
        try {
            fileInputStreamB = io.sentry.config.a.b(rolloutsStateForSession, new FileInputStream(rolloutsStateForSession));
            List<RolloutAssignment> listJsonToRolloutsState = jsonToRolloutsState(CommonUtils.streamToString(fileInputStreamB));
            Logger.getLogger().d("Loaded rollouts state:\n" + listJsonToRolloutsState + "\nfor session " + str);
            return listJsonToRolloutsState;
        } catch (Exception e) {
            Logger.getLogger().w("Error deserializing rollouts state.", e);
            safeDeleteCorruptFile(rolloutsStateForSession);
            return Collections.EMPTY_LIST;
        } finally {
            CommonUtils.closeOrLog(fileInputStreamB, "Failed to close rollouts state file.");
        }
    }

    public String readUserId(String str) throws Throwable {
        FileInputStream fileInputStreamB;
        File userDataFileForSession = getUserDataFileForSession(str);
        FileInputStream fileInputStream = null;
        if (!userDataFileForSession.exists() || userDataFileForSession.length() == 0) {
            Logger.getLogger().d("No userId set for session " + str);
            safeDeleteCorruptFile(userDataFileForSession);
            return null;
        }
        try {
            fileInputStreamB = io.sentry.config.a.b(userDataFileForSession, new FileInputStream(userDataFileForSession));
            try {
                try {
                    String strJsonToUserId = jsonToUserId(CommonUtils.streamToString(fileInputStreamB));
                    Logger.getLogger().d("Loaded userId " + strJsonToUserId + " for session " + str);
                    CommonUtils.closeOrLog(fileInputStreamB, "Failed to close user metadata file.");
                    return strJsonToUserId;
                } catch (Throwable th) {
                    th = th;
                    fileInputStream = fileInputStreamB;
                    CommonUtils.closeOrLog(fileInputStream, "Failed to close user metadata file.");
                    throw th;
                }
            } catch (Exception e) {
                e = e;
                Logger.getLogger().w("Error deserializing user metadata.", e);
                safeDeleteCorruptFile(userDataFileForSession);
                CommonUtils.closeOrLog(fileInputStreamB, "Failed to close user metadata file.");
                return null;
            }
        } catch (Exception e2) {
            e = e2;
            fileInputStreamB = null;
        } catch (Throwable th2) {
            th = th2;
            CommonUtils.closeOrLog(fileInputStream, "Failed to close user metadata file.");
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r7v0, types: [boolean] */
    public void writeKeyData(String str, Map<String, String> map, boolean z) {
        BufferedWriter bufferedWriter;
        Exception e;
        File internalKeysFileForSession = z != 0 ? getInternalKeysFileForSession(str) : getKeysFileForSession(str);
        ?? r5 = 0;
        try {
            try {
                String strKeysDataToJson = keysDataToJson(map);
                bufferedWriter = new BufferedWriter(new OutputStreamWriter(io.sentry.config.a.e(new FileOutputStream(internalKeysFileForSession), internalKeysFileForSession), UTF_8));
                try {
                    bufferedWriter.write(strKeysDataToJson);
                    bufferedWriter.flush();
                    CommonUtils.closeOrLog(bufferedWriter, "Failed to close key/value metadata file.");
                } catch (Exception e2) {
                    e = e2;
                    Logger.getLogger().w("Error serializing key/value metadata.", e);
                    safeDeleteCorruptFile(internalKeysFileForSession);
                    CommonUtils.closeOrLog(bufferedWriter, "Failed to close key/value metadata file.");
                }
            } catch (Exception e3) {
                bufferedWriter = null;
                e = e3;
            } catch (Throwable th) {
                th = th;
                CommonUtils.closeOrLog(r5, "Failed to close key/value metadata file.");
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            r5 = z;
            CommonUtils.closeOrLog(r5, "Failed to close key/value metadata file.");
            throw th;
        }
    }

    public void writeRolloutState(String str, List<RolloutAssignment> list) {
        BufferedWriter bufferedWriter;
        Exception e;
        File rolloutsStateForSession = getRolloutsStateForSession(str);
        if (list.isEmpty()) {
            safeDeleteCorruptFile(rolloutsStateForSession, ub3.i("Rollout state is empty for session: ", str));
            return;
        }
        BufferedWriter bufferedWriter2 = null;
        try {
            String strRolloutsStateToJson = rolloutsStateToJson(list);
            bufferedWriter = new BufferedWriter(new OutputStreamWriter(io.sentry.config.a.e(new FileOutputStream(rolloutsStateForSession), rolloutsStateForSession), UTF_8));
            try {
                try {
                    bufferedWriter.write(strRolloutsStateToJson);
                    bufferedWriter.flush();
                    CommonUtils.closeOrLog(bufferedWriter, "Failed to close rollouts state file.");
                } catch (Throwable th) {
                    th = th;
                    bufferedWriter2 = bufferedWriter;
                    CommonUtils.closeOrLog(bufferedWriter2, "Failed to close rollouts state file.");
                    throw th;
                }
            } catch (Exception e2) {
                e = e2;
                Logger.getLogger().w("Error serializing rollouts state.", e);
                safeDeleteCorruptFile(rolloutsStateForSession);
                CommonUtils.closeOrLog(bufferedWriter, "Failed to close rollouts state file.");
            }
        } catch (Exception e3) {
            bufferedWriter = null;
            e = e3;
        } catch (Throwable th2) {
            th = th2;
            CommonUtils.closeOrLog(bufferedWriter2, "Failed to close rollouts state file.");
            throw th;
        }
    }

    public void writeUserData(String str, String str2) {
        File userDataFileForSession = getUserDataFileForSession(str);
        BufferedWriter bufferedWriter = null;
        try {
            try {
                String strUserIdToJson = userIdToJson(str2);
                BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(io.sentry.config.a.e(new FileOutputStream(userDataFileForSession), userDataFileForSession), UTF_8));
                try {
                    bufferedWriter2.write(strUserIdToJson);
                    bufferedWriter2.flush();
                    CommonUtils.closeOrLog(bufferedWriter2, "Failed to close user metadata file.");
                } catch (Exception e) {
                    e = e;
                    bufferedWriter = bufferedWriter2;
                    Logger.getLogger().w("Error serializing user metadata.", e);
                    CommonUtils.closeOrLog(bufferedWriter, "Failed to close user metadata file.");
                } catch (Throwable th) {
                    th = th;
                    bufferedWriter = bufferedWriter2;
                    CommonUtils.closeOrLog(bufferedWriter, "Failed to close user metadata file.");
                    throw th;
                }
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private static void safeDeleteCorruptFile(File file) {
        if (file.exists() && file.delete()) {
            Logger.getLogger().i("Deleted corrupt file: " + file.getAbsolutePath());
        }
    }

    public void writeKeyData(String str, Map<String, String> map) {
        writeKeyData(str, map, false);
    }

    public Map<String, String> readKeyData(String str) {
        return readKeyData(str, false);
    }
}
