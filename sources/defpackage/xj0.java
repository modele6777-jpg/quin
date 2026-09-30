package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import io.sentry.android.core.b1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class xj0 implements oe1 {
    public long a;
    public Object b;
    public Object c;

    public xj0(int i) {
        switch (i) {
            case 1:
                this.b = new btf();
                this.c = new btf();
                break;
            default:
                this.a = 0L;
                this.b = gye.a;
                this.c = null;
                break;
        }
    }

    public static String f(String str, String str2, long j) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("token", str);
            jSONObject.put("appVersion", str2);
            jSONObject.put("timestamp", j);
            return jSONObject.toString();
        } catch (JSONException e) {
            b1.l("FirebaseMessaging", "Failed to encode token: " + e);
            return null;
        }
    }

    public static xj0 g(String str) {
        Object obj = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!str.startsWith("{")) {
            return new xj0(0L, str, obj);
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new xj0(jSONObject.getLong("timestamp"), jSONObject.getString("token"), jSONObject.getString("appVersion"));
        } catch (JSONException e) {
            b1.l("FirebaseMessaging", "Failed to parse token: " + e);
            return null;
        }
    }

    public void a(long j, long j2) {
        ((btf) this.b).a(j, Float.intBitsToFloat((int) (j2 >> 32)));
        ((btf) this.c).a(j, Float.intBitsToFloat((int) (j2 & 4294967295L)));
    }

    @Override // defpackage.oe1
    public wde c() {
        return (wde) this.c;
    }

    public yj0 d() {
        Object obj;
        if (!((gye) this.b).p() && (obj = this.c) != null) {
            pa7.A(((gye) this.b).b(obj) != -1);
        }
        return new yj0(this);
    }

    @Override // defpackage.oe1
    public int e() {
        oe1 oe1Var = (oe1) this.b;
        if (oe1Var != null) {
            return oe1Var.e();
        }
        return 1;
    }

    public void h(gr8 gr8Var, bv6 bv6Var, Map map, long j) {
        y21 y21Var = (y21) this.c;
        long j2 = y21Var.a;
        LinkedHashMap linkedHashMap = (LinkedHashMap) y21Var.c;
        if (j > j2) {
            Object objRemove = linkedHashMap.remove(gr8Var);
            if (objRemove != null) {
                y21Var.b = y21Var.g() - y21Var.k(gr8Var, objRemove);
                y21Var.e(gr8Var, objRemove, null);
            }
            ((sug) this.b).x(gr8Var, bv6Var, map, j);
            return;
        }
        uib uibVar = new uib(bv6Var, map, j);
        Object objPut = linkedHashMap.put(gr8Var, uibVar);
        y21Var.b = y21Var.k(gr8Var, uibVar) + y21Var.g();
        if (objPut != null) {
            y21Var.b = y21Var.g() - y21Var.k(gr8Var, objPut);
            y21Var.e(gr8Var, objPut, uibVar);
        }
        y21Var.m(y21Var.a);
    }

    @Override // defpackage.oe1
    public long i() {
        oe1 oe1Var = (oe1) this.b;
        if (oe1Var != null) {
            return oe1Var.i();
        }
        long j = this.a;
        if (j != -1) {
            return j;
        }
        qc0.p("No timestamp is available.");
        return 0L;
    }

    public List j() {
        List list;
        List list2;
        krg krgVar = (krg) this.c;
        w3h w3hVar = (w3h) krgVar.b;
        ArrayList arrayList = new ArrayList();
        String str = (String) this.b;
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = krgVar.r1().query("raw_events", new String[]{"rowid", "name", "timestamp", "metadata_fingerprint", "data", "realtime", "elapsed_time"}, "app_id = ? and rowid > ?", new String[]{str, String.valueOf(this.a)}, null, null, "rowid", "1000");
                if (cursorQuery.moveToFirst()) {
                    do {
                        long j = cursorQuery.getLong(0);
                        long j2 = cursorQuery.getLong(3);
                        boolean z = cursorQuery.getLong(5) == 1;
                        long j3 = cursorQuery.getLong(6);
                        byte[] blob = cursorQuery.getBlob(4);
                        if (j > this.a) {
                            this.a = j;
                        }
                        try {
                            t2h t2hVar = (t2h) lch.l1(v2h.H(), blob);
                            String string = cursorQuery.getString(1);
                            if (string == null) {
                                string = "";
                            }
                            t2hVar.o(string);
                            long j4 = cursorQuery.getLong(2);
                            t2hVar.c();
                            ((v2h) t2hVar.b).O(j4);
                            t2hVar.c();
                            ((v2h) t2hVar.b).r(j3);
                            arrayList.add(new frg(j, j2, z, (v2h) t2hVar.e()));
                        } catch (IOException e) {
                            w0h w0hVar = w3hVar.f;
                            w3h.h(w0hVar);
                            w0hVar.g.c(w0h.E0(str), e, "Data loss. Failed to merge raw event. appId");
                        }
                    } while (cursorQuery.moveToNext());
                    list = arrayList;
                } else {
                    list2 = Collections.EMPTY_LIST;
                }
            } catch (SQLiteException e2) {
                w0h w0hVar2 = w3hVar.f;
                w3h.h(w0hVar2);
                w0hVar2.g.c(w0h.E0(str), e2, "Data loss. Error querying raw events batch. appId");
                list = arrayList;
            }
            list = list2;
            return list;
        } finally {
            if (0 != 0) {
                cursorQuery.close();
            }
        }
    }

    @Override // defpackage.oe1
    public me1 n() {
        oe1 oe1Var = (oe1) this.b;
        return oe1Var != null ? oe1Var.n() : me1.a;
    }

    @Override // defpackage.oe1
    public ke1 t() {
        oe1 oe1Var = (oe1) this.b;
        return oe1Var != null ? oe1Var.t() : ke1.a;
    }

    @Override // defpackage.oe1
    public le1 y() {
        oe1 oe1Var = (oe1) this.b;
        return oe1Var != null ? oe1Var.y() : le1.a;
    }

    public /* synthetic */ xj0(long j, Object obj, Object obj2) {
        this.b = obj;
        this.c = obj2;
        this.a = j;
    }
}
