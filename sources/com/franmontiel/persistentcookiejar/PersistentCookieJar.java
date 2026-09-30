package com.franmontiel.persistentcookiejar;

import android.content.SharedPreferences;
import com.franmontiel.persistentcookiejar.cache.SetCookieCache;
import com.franmontiel.persistentcookiejar.persistence.SharedPrefsCookiePersistor;
import defpackage.ct6;
import defpackage.eu2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public class PersistentCookieJar implements ClearableCookieJar {
    public SetCookieCache a;
    public SharedPrefsCookiePersistor b;

    public final synchronized void a() {
        this.a.a.clear();
        this.b.a.edit().clear().commit();
    }

    @Override // defpackage.fu2
    public final synchronized void c(ct6 ct6Var, List list) {
        this.a.a(list);
        SharedPrefsCookiePersistor sharedPrefsCookiePersistor = this.b;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            eu2 eu2Var = (eu2) it.next();
            if (eu2Var.h) {
                arrayList.add(eu2Var);
            }
        }
        sharedPrefsCookiePersistor.b(arrayList);
    }

    @Override // defpackage.fu2
    public final synchronized List d(ct6 ct6Var) {
        ArrayList arrayList;
        try {
            ArrayList arrayList2 = new ArrayList();
            arrayList = new ArrayList();
            Iterator<eu2> it = this.a.iterator();
            while (it.hasNext()) {
                eu2 next = it.next();
                if (next.c < System.currentTimeMillis()) {
                    arrayList2.add(next);
                    it.remove();
                } else if (next.a(ct6Var)) {
                    arrayList.add(next);
                }
            }
            SharedPreferences.Editor editorEdit = this.b.a.edit();
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                editorEdit.remove(SharedPrefsCookiePersistor.a((eu2) it2.next()));
            }
            editorEdit.commit();
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }
}
