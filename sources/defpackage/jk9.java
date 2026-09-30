package defpackage;

import android.content.SharedPreferences;
import android.util.Log;
import com.franmontiel.persistentcookiejar.PersistentCookieJar;
import com.franmontiel.persistentcookiejar.cache.SetCookieCache;
import com.franmontiel.persistentcookiejar.persistence.SerializableCookie;
import com.franmontiel.persistentcookiejar.persistence.SharedPrefsCookiePersistor;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class jk9 {
    public static final PersistentCookieJar a;
    public static final ace b;

    /* JADX WARN: Code duplicated, block: B:52:0x00b6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x0039 A[SYNTHETIC] */
    static {
        ObjectInputStream objectInputStream;
        SetCookieCache setCookieCache = new SetCookieCache();
        setCookieCache.a = new HashSet();
        SharedPrefsCookiePersistor sharedPrefsCookiePersistor = new SharedPrefsCookiePersistor(cn1.z());
        PersistentCookieJar persistentCookieJar = new PersistentCookieJar();
        persistentCookieJar.a = setCookieCache;
        persistentCookieJar.b = sharedPrefsCookiePersistor;
        SharedPreferences sharedPreferences = sharedPrefsCookiePersistor.a;
        ArrayList arrayList = new ArrayList(sharedPreferences.getAll().size());
        Iterator<Map.Entry<String, ?>> it = sharedPreferences.getAll().entrySet().iterator();
        while (true) {
            int i = 0;
            if (!it.hasNext()) {
                setCookieCache.a(arrayList);
                a = persistentCookieJar;
                b = new ace(new ik9(i));
                return;
            }
            String str = (String) it.next().getValue();
            int length = str.length();
            byte[] bArr = new byte[length / 2];
            while (i < length) {
                bArr[i / 2] = (byte) (Character.digit(str.charAt(i + 1), 16) + (Character.digit(str.charAt(i), 16) << 4));
                i += 2;
            }
            ObjectInputStream objectInputStream2 = null;
            eu2Var = null;
            eu2Var = null;
            eu2Var = null;
            eu2 eu2Var = null;
            try {
                objectInputStream = new ObjectInputStream(new ByteArrayInputStream(bArr));
                try {
                    try {
                        eu2Var = ((SerializableCookie) objectInputStream.readObject()).a;
                    } catch (IOException e) {
                        e = e;
                        Log.d("SerializableCookie", "IOException in decodeCookie", e);
                        if (objectInputStream != null) {
                        }
                        if (eu2Var != null) {
                            arrayList.add(eu2Var);
                        }
                    } catch (ClassNotFoundException e2) {
                        e = e2;
                        Log.d("SerializableCookie", "ClassNotFoundException in decodeCookie", e);
                        if (objectInputStream != null) {
                        }
                        if (eu2Var != null) {
                            arrayList.add(eu2Var);
                        }
                    }
                    try {
                        objectInputStream.close();
                    } catch (IOException e3) {
                        Log.d("SerializableCookie", "Stream not closed in decodeCookie", e3);
                    }
                    if (eu2Var != null) {
                        arrayList.add(eu2Var);
                    }
                } catch (Throwable th) {
                    th = th;
                    objectInputStream2 = objectInputStream;
                    if (objectInputStream2 != null) {
                        try {
                            objectInputStream2.close();
                        } catch (IOException e4) {
                            Log.d("SerializableCookie", "Stream not closed in decodeCookie", e4);
                        }
                    }
                    throw th;
                }
            } catch (IOException e5) {
                e = e5;
                objectInputStream = null;
            } catch (ClassNotFoundException e6) {
                e = e6;
                objectInputStream = null;
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    public static final hm9 a() {
        return (hm9) b.getValue();
    }
}
