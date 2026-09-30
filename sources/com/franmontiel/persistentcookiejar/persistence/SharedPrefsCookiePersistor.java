package com.franmontiel.persistentcookiejar.persistence;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.adjust.sdk.Constants;
import defpackage.eu2;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public class SharedPrefsCookiePersistor implements CookiePersistor {
    public final SharedPreferences a;

    public SharedPrefsCookiePersistor(Context context) {
        this.a = context.getSharedPreferences("CookiePersistence", 0);
    }

    public static String a(eu2 eu2Var) {
        return (eu2Var.f ? Constants.SCHEME : "http") + "://" + eu2Var.d + eu2Var.e + "|" + eu2Var.a;
    }

    public final void b(ArrayList arrayList) throws Throwable {
        ObjectOutputStream objectOutputStream;
        SharedPreferences.Editor editorEdit = this.a.edit();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            eu2 eu2Var = (eu2) it.next();
            String strA = a(eu2Var);
            SerializableCookie serializableCookie = new SerializableCookie();
            serializableCookie.a = eu2Var;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ObjectOutputStream objectOutputStream2 = null;
            string = null;
            string = null;
            String string = null;
            try {
                objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                try {
                    try {
                        objectOutputStream.writeObject(serializableCookie);
                        try {
                            objectOutputStream.close();
                        } catch (IOException e) {
                            Log.d("SerializableCookie", "Stream not closed in encodeCookie", e);
                        }
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        StringBuilder sb = new StringBuilder(byteArray.length * 2);
                        for (byte b : byteArray) {
                            int i = b & 255;
                            if (i < 16) {
                                sb.append('0');
                            }
                            sb.append(Integer.toHexString(i));
                        }
                        string = sb.toString();
                    } catch (Throwable th) {
                        th = th;
                        objectOutputStream2 = objectOutputStream;
                        if (objectOutputStream2 != null) {
                            try {
                                objectOutputStream2.close();
                            } catch (IOException e2) {
                                Log.d("SerializableCookie", "Stream not closed in encodeCookie", e2);
                            }
                        }
                        throw th;
                    }
                } catch (IOException e3) {
                    e = e3;
                    Log.d("SerializableCookie", "IOException in encodeCookie", e);
                    if (objectOutputStream != null) {
                        try {
                            objectOutputStream.close();
                        } catch (IOException e4) {
                            Log.d("SerializableCookie", "Stream not closed in encodeCookie", e4);
                        }
                    }
                }
            } catch (IOException e5) {
                e = e5;
                objectOutputStream = null;
            } catch (Throwable th2) {
                th = th2;
            }
            editorEdit.putString(strA, string);
        }
        editorEdit.commit();
    }
}
