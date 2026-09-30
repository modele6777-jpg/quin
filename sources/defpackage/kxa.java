package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class kxa implements b22, ssf, h1b {
    public Object a;
    public Object b;
    public Object c;
    public Object d;

    public kxa(owf owfVar, jwf jwfVar, gy2 gy2Var) {
        owfVar.getClass();
        jwfVar.getClass();
        gy2Var.getClass();
        this.a = owfVar;
        this.b = jwfVar;
        this.c = gy2Var;
        this.d = new pzd(2);
    }

    public void a(String str, String str2) {
        this.d = ((String) this.d) + (((String) this.d).length() == 0 ? "?" : "&") + str + '=' + str2;
    }

    @Override // defpackage.psf
    public long c(b00 b00Var, b00 b00Var2, b00 b00Var3) {
        int iB = b00Var.b();
        long jMax = 0;
        for (int i = 0; i < iB; i++) {
            jMax = Math.max(jMax, ((c00) this.a).get(i).c(b00Var.a(i), b00Var2.a(i), b00Var3.a(i)));
        }
        return jMax;
    }

    public void d(nzd nzdVar) {
        Runnable runnable;
        nzdVar.getClass();
        synchronized (this.c) {
            runnable = (Runnable) ((LinkedHashMap) this.d).remove(nzdVar);
        }
        if (runnable != null) {
            ((Handler) ((mjg) this.a).a).removeCallbacks(runnable);
        }
    }

    public y8e e(cd cdVar) {
        ArrayList arrayList = (ArrayList) this.c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            y8e y8eVar = (y8e) arrayList.get(i);
            if (y8eVar != null && y8eVar.b == cdVar) {
                return y8eVar;
            }
        }
        y8e y8eVar2 = new y8e((Context) this.b, cdVar);
        arrayList.add(y8eVar2);
        return y8eVar2;
    }

    public ewf f(em7 em7Var, String str) {
        ewf ewfVar;
        ewf ewfVarA;
        em7Var.getClass();
        synchronized (((pzd) this.d)) {
            try {
                ewfVar = (ewf) ((owf) this.a).a.get(str);
                if (em7Var.D(ewfVar)) {
                    jwf jwfVar = (jwf) this.b;
                    if (jwfVar instanceof ldc) {
                        ldc ldcVar = (ldc) jwfVar;
                        ewfVar.getClass();
                        h48 h48Var = ldcVar.d;
                        if (h48Var != null) {
                            vea veaVar = ldcVar.e;
                            veaVar.getClass();
                            bm8.s(ewfVar, veaVar, h48Var);
                        }
                    }
                    ewfVar.getClass();
                } else {
                    m69 m69Var = new m69((gy2) this.c);
                    m69Var.a.put(lwf.a, str);
                    jwf jwfVar2 = (jwf) this.b;
                    jwfVar2.getClass();
                    try {
                        try {
                            ewfVarA = jwfVar2.c(em7Var, m69Var);
                        } catch (AbstractMethodError unused) {
                            ewfVarA = jwfVar2.a(af1.R(em7Var));
                        }
                    } catch (AbstractMethodError unused2) {
                        ewfVarA = jwfVar2.b(af1.R(em7Var), m69Var);
                    }
                    ewfVar = ewfVarA;
                    owf owfVar = (owf) this.a;
                    owfVar.getClass();
                    ewfVar.getClass();
                    ewf ewfVar2 = (ewf) owfVar.a.put(str, ewfVar);
                    if (ewfVar2 != null) {
                        ewfVar2.b();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return ewfVar;
    }

    public boolean g(s04 s04Var) {
        if (((s04) this.b).equals(s04Var)) {
            return true;
        }
        kxa kxaVar = (kxa) this.a;
        return kxaVar != null ? kxaVar.g(s04Var) : false;
    }

    @Override // defpackage.h1b
    public Object get() {
        return new kxa((Executor) ((h1b) this.a).get(), (w8c) ((h1b) this.b).get(), (gg7) ((gg7) this.c).get(), (w8c) ((h1b) this.d).get());
    }

    public boolean h(cd cdVar, MenuItem menuItem) {
        return ((ActionMode.Callback) this.a).onActionItemClicked(e(cdVar), new zr8((Context) this.b, (d9e) menuItem));
    }

    @Override // defpackage.psf
    public b00 i(long j, b00 b00Var, b00 b00Var2, b00 b00Var3) {
        b00 b00VarC = (b00) this.c;
        if (b00VarC == null) {
            b00VarC = b00Var3.c();
            this.c = b00VarC;
        }
        int iB = b00VarC.b();
        int i = 0;
        while (true) {
            b00 b00Var4 = (b00) this.c;
            if (i >= iB) {
                if (b00Var4 != null) {
                    return b00Var4;
                }
                pa7.g0("velocityVector");
                throw null;
            }
            if (b00Var4 == null) {
                pa7.g0("velocityVector");
                throw null;
            }
            long j2 = j;
            b00Var4.e(i, ((c00) this.a).get(i).b(j2, b00Var.a(i), b00Var2.a(i), b00Var3.a(i)));
            i++;
            j = j2;
        }
    }

    public boolean j(cd cdVar, qr8 qr8Var) {
        ActionMode.Callback callback = (ActionMode.Callback) this.a;
        y8e y8eVarE = e(cdVar);
        wid widVar = (wid) this.d;
        Menu ps8Var = (Menu) widVar.get(qr8Var);
        if (ps8Var == null) {
            ps8Var = new ps8((Context) this.b, qr8Var);
            widVar.put(qr8Var, ps8Var);
        }
        return callback.onCreateActionMode(y8eVarE, ps8Var);
    }

    public void k(nzd nzdVar) {
        nzdVar.getClass();
        xu8 xu8Var = new xu8(21, this, nzdVar);
        synchronized (this.c) {
        }
        ((Handler) ((mjg) this.a).a).postDelayed(xu8Var, 5400000L);
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00fe A[Catch: NumberFormatException | JSONException -> 0x010b, NumberFormatException | JSONException -> 0x010b, TRY_LEAVE, TryCatch #0 {NumberFormatException | JSONException -> 0x010b, blocks: (B:10:0x0031, B:24:0x0065, B:24:0x0065, B:26:0x0072, B:26:0x0072, B:28:0x0084, B:28:0x0084, B:29:0x008d, B:29:0x008d, B:51:0x00fe, B:51:0x00fe, B:33:0x009a, B:33:0x009a, B:35:0x00a7, B:35:0x00a7, B:37:0x00b9, B:37:0x00b9, B:38:0x00c2, B:38:0x00c2, B:42:0x00ce, B:42:0x00ce, B:46:0x00de, B:46:0x00de, B:50:0x00f2, B:50:0x00f2), top: B:63:0x0031, outer: #1 }] */
    public Bundle l() {
        c2h c2hVar = (c2h) this.d;
        w3h w3hVar = (w3h) c2hVar.b;
        if (((Bundle) this.c) == null) {
            String string = c2hVar.E0().getString((String) this.a, null);
            if (string != null) {
                try {
                    Bundle bundle = new Bundle();
                    JSONArray jSONArray = new JSONArray(string);
                    for (int i = 0; i < jSONArray.length(); i++) {
                        try {
                            JSONObject jSONObject = jSONArray.getJSONObject(i);
                            String string2 = jSONObject.getString("n");
                            String string3 = jSONObject.getString("t");
                            int iHashCode = string3.hashCode();
                            if (iHashCode != 100) {
                                if (iHashCode != 108) {
                                    if (iHashCode != 115) {
                                        if (iHashCode != 3352) {
                                            if (iHashCode == 3445 && string3.equals("la")) {
                                                upg.a();
                                                if (w3hVar.d.L0(null, bzg.P0)) {
                                                    JSONArray jSONArray2 = new JSONArray(jSONObject.getString("v"));
                                                    int length = jSONArray2.length();
                                                    long[] jArr = new long[length];
                                                    for (int i2 = 0; i2 < length; i2++) {
                                                        jArr[i2] = jSONArray2.optLong(i2);
                                                    }
                                                    bundle.putLongArray(string2, jArr);
                                                }
                                            } else {
                                                w0h w0hVar = w3hVar.f;
                                                w3h.h(w0hVar);
                                                w0hVar.g.b(string3, "Unrecognized persisted bundle type. Type");
                                            }
                                        } else if (string3.equals("ia")) {
                                            upg.a();
                                            if (w3hVar.d.L0(null, bzg.P0)) {
                                                JSONArray jSONArray3 = new JSONArray(jSONObject.getString("v"));
                                                int length2 = jSONArray3.length();
                                                int[] iArr = new int[length2];
                                                for (int i3 = 0; i3 < length2; i3++) {
                                                    iArr[i3] = jSONArray3.optInt(i3);
                                                }
                                                bundle.putIntArray(string2, iArr);
                                            }
                                        } else {
                                            w0h w0hVar2 = w3hVar.f;
                                            w3h.h(w0hVar2);
                                            w0hVar2.g.b(string3, "Unrecognized persisted bundle type. Type");
                                        }
                                    } else if (string3.equals("s")) {
                                        bundle.putString(string2, jSONObject.getString("v"));
                                    } else {
                                        w0h w0hVar3 = w3hVar.f;
                                        w3h.h(w0hVar3);
                                        w0hVar3.g.b(string3, "Unrecognized persisted bundle type. Type");
                                    }
                                } else if (string3.equals("l")) {
                                    bundle.putLong(string2, Long.parseLong(jSONObject.getString("v")));
                                } else {
                                    w0h w0hVar4 = w3hVar.f;
                                    w3h.h(w0hVar4);
                                    w0hVar4.g.b(string3, "Unrecognized persisted bundle type. Type");
                                }
                            } else if (string3.equals("d")) {
                                bundle.putDouble(string2, Double.parseDouble(jSONObject.getString("v")));
                            } else {
                                w0h w0hVar5 = w3hVar.f;
                                w3h.h(w0hVar5);
                                w0hVar5.g.b(string3, "Unrecognized persisted bundle type. Type");
                            }
                        } catch (NumberFormatException | JSONException unused) {
                            w0h w0hVar6 = w3hVar.f;
                            w3h.h(w0hVar6);
                            w0hVar6.g.a("Error reading value from SharedPreferences. Value dropped");
                        }
                    }
                    this.c = bundle;
                } catch (JSONException unused2) {
                    w0h w0hVar7 = w3hVar.f;
                    w3h.h(w0hVar7);
                    w0hVar7.g.a("Error loading bundle from SharedPreferences. Values will be lost");
                }
            }
            if (((Bundle) this.c) == null) {
                this.c = (Bundle) this.b;
            }
        }
        Bundle bundle2 = (Bundle) this.c;
        oa7.A(bundle2);
        return new Bundle(bundle2);
    }

    public vqg m(kxa kxaVar, f5h... f5hVarArr) {
        vqg vqgVarZ = vqg.v0;
        for (f5h f5hVar : f5hVarArr) {
            vqgVarZ = xdc.z(f5hVar);
            jcc.w((kxa) this.c);
            if ((vqgVarZ instanceof yqg) || (vqgVarZ instanceof uqg)) {
                vqgVarZ = ((vea) this.a).G(kxaVar, vqgVarZ);
            }
        }
        return vqgVarZ;
    }

    public vqg n(vqg vqgVar) {
        return ((vea) this.b).G(this, vqgVar);
    }

    public vqg o(smg smgVar) {
        vqg vqgVarG = vqg.v0;
        Iterator itO = smgVar.o();
        while (itO.hasNext()) {
            vqgVarG = ((vea) this.b).G(this, smgVar.q(((Integer) itO.next()).intValue()));
            if (vqgVarG instanceof fog) {
                break;
            }
        }
        return vqgVarG;
    }

    public void q(Bundle bundle) {
        c2h c2hVar = (c2h) this.d;
        w3h w3hVar = (w3h) c2hVar.b;
        Bundle bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
        SharedPreferences.Editor editorEdit = c2hVar.E0().edit();
        int size = bundle2.size();
        String str = (String) this.a;
        if (size == 0) {
            editorEdit.remove(str);
        } else {
            JSONArray jSONArray = new JSONArray();
            for (String str2 : bundle2.keySet()) {
                Object obj = bundle2.get(str2);
                if (obj != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("n", str2);
                        upg.a();
                        if (w3hVar.d.L0(null, bzg.P0)) {
                            if (obj instanceof String) {
                                jSONObject.put("v", obj.toString());
                                jSONObject.put("t", "s");
                            } else if (obj instanceof Long) {
                                jSONObject.put("v", obj.toString());
                                jSONObject.put("t", "l");
                            } else if (obj instanceof int[]) {
                                jSONObject.put("v", Arrays.toString((int[]) obj));
                                jSONObject.put("t", "ia");
                            } else if (obj instanceof long[]) {
                                jSONObject.put("v", Arrays.toString((long[]) obj));
                                jSONObject.put("t", "la");
                            } else if (obj instanceof Double) {
                                jSONObject.put("v", obj.toString());
                                jSONObject.put("t", "d");
                            } else {
                                w0h w0hVar = w3hVar.f;
                                w3h.h(w0hVar);
                                w0hVar.g.b(obj.getClass(), "Cannot serialize bundle value to SharedPreferences. Type");
                            }
                            jSONArray.put(jSONObject);
                        } else {
                            jSONObject.put("v", obj.toString());
                            if (obj instanceof String) {
                                jSONObject.put("t", "s");
                            } else if (obj instanceof Long) {
                                jSONObject.put("t", "l");
                            } else if (obj instanceof Double) {
                                jSONObject.put("t", "d");
                            } else {
                                w0h w0hVar2 = w3hVar.f;
                                w3h.h(w0hVar2);
                                w0hVar2.g.b(obj.getClass(), "Cannot serialize bundle value to SharedPreferences. Type");
                            }
                            jSONArray.put(jSONObject);
                        }
                    } catch (JSONException e) {
                        w0h w0hVar3 = w3hVar.f;
                        w3h.h(w0hVar3);
                        w0hVar3.g.b(e, "Cannot serialize bundle value to SharedPreferences");
                    }
                }
            }
            editorEdit.putString(str, jSONArray.toString());
        }
        editorEdit.apply();
        this.c = bundle2;
    }

    @Override // defpackage.b22
    public a22 r(j22 j22Var) {
        j22Var.getClass();
        nya nyaVar = (nya) ((LinkedHashMap) this.d).get(j22Var);
        if (nyaVar == null) {
            return null;
        }
        return new a22((v99) this.a, nyaVar, (ay0) this.b, (ntd) ((qqf) this.c).d(j22Var));
    }

    @Override // defpackage.psf
    public b00 t(long j, b00 b00Var, b00 b00Var2, b00 b00Var3) {
        b00 b00VarC = (b00) this.b;
        if (b00VarC == null) {
            b00VarC = b00Var.c();
            this.b = b00VarC;
        }
        int iB = b00VarC.b();
        int i = 0;
        while (true) {
            b00 b00Var4 = (b00) this.b;
            if (i >= iB) {
                if (b00Var4 != null) {
                    return b00Var4;
                }
                pa7.g0("valueVector");
                throw null;
            }
            if (b00Var4 == null) {
                pa7.g0("valueVector");
                throw null;
            }
            long j2 = j;
            b00Var4.e(i, ((c00) this.a).get(i).e(j2, b00Var.a(i), b00Var2.a(i), b00Var3.a(i)));
            i++;
            j = j2;
        }
    }

    @Override // defpackage.psf
    public b00 u(b00 b00Var, b00 b00Var2, b00 b00Var3) {
        b00 b00VarC = (b00) this.d;
        if (b00VarC == null) {
            b00VarC = b00Var3.c();
            this.d = b00VarC;
        }
        int iB = b00VarC.b();
        int i = 0;
        while (true) {
            b00 b00Var4 = (b00) this.d;
            if (i >= iB) {
                if (b00Var4 != null) {
                    return b00Var4;
                }
                pa7.g0("endVelocityVector");
                throw null;
            }
            if (b00Var4 == null) {
                pa7.g0("endVelocityVector");
                throw null;
            }
            b00Var4.e(i, ((c00) this.a).get(i).d(b00Var.a(i), b00Var2.a(i), b00Var3.a(i)));
            i++;
        }
    }

    public kxa v() {
        return new kxa(this, (vea) this.b);
    }

    public boolean w(String str) {
        if (((HashMap) this.c).containsKey(str)) {
            return true;
        }
        kxa kxaVar = (kxa) this.a;
        if (kxaVar != null) {
            return kxaVar.w(str);
        }
        return false;
    }

    public void x(String str, vqg vqgVar) {
        kxa kxaVar;
        HashMap map = (HashMap) this.c;
        if (!map.containsKey(str) && (kxaVar = (kxa) this.a) != null && kxaVar.w(str)) {
            kxaVar.x(str, vqgVar);
        } else {
            if (((HashMap) this.d).containsKey(str)) {
                return;
            }
            if (vqgVar == null) {
                map.remove(str);
            } else {
                map.put(str, vqgVar);
            }
        }
    }

    public void y(String str, vqg vqgVar) {
        if (((HashMap) this.d).containsKey(str)) {
            return;
        }
        HashMap map = (HashMap) this.c;
        if (vqgVar == null) {
            map.remove(str);
        } else {
            map.put(str, vqgVar);
        }
    }

    public vqg z(String str) {
        HashMap map = (HashMap) this.c;
        if (map.containsKey(str)) {
            return (vqg) map.get(str);
        }
        kxa kxaVar = (kxa) this.a;
        if (kxaVar != null) {
            return kxaVar.z(str);
        }
        qc0.j(tec.l(str, " is not defined"));
        return null;
    }

    public kxa(kxa kxaVar, vea veaVar) {
        this.c = new HashMap();
        this.d = new HashMap();
        this.a = kxaVar;
        this.b = veaVar;
    }

    public kxa(c2h c2hVar, String str) {
        this.d = c2hVar;
        oa7.x(str);
        this.a = str;
        this.b = new Bundle();
    }

    public /* synthetic */ kxa(Object obj, Object obj2, Object obj3, Object obj4) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
    }

    public kxa(xn7 xn7Var) {
        this.c = "";
        this.d = "";
        this.a = xn7Var;
        this.b = xn7Var.e().a();
    }

    public kxa(c00 c00Var) {
        this.a = c00Var;
    }

    public kxa(mj5 mj5Var) {
        this(new vrb(9, mj5Var));
    }
}
