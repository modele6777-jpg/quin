package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import com.adjust.sdk.Constants;
import com.google.android.play.core.assetpacks.f;
import com.google.android.play.core.assetpacks.h;
import com.google.android.play.core.assetpacks.k;
import com.google.android.play.core.assetpacks.l;
import com.google.android.play.core.assetpacks.m;
import com.google.android.play.core.assetpacks.n;
import com.google.android.play.core.assetpacks.o;
import com.google.android.play.core.assetpacks.p;
import com.google.android.play.core.assetpacks.s;
import io.sentry.android.core.b1;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class lp0 implements cfg {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object v;
    public Object w;
    public Object x;

    public lp0(tz3 tz3Var, u99 u99Var, bm3 bm3Var, bu3 bu3Var, otf otfVar, ay0 ay0Var, f04 f04Var, o7f o7fVar, List list) {
        this.a = 1;
        u99Var.getClass();
        bm3Var.getClass();
        otfVar.getClass();
        ay0Var.getClass();
        this.b = tz3Var;
        this.c = u99Var;
        this.d = bm3Var;
        this.e = bu3Var;
        this.f = otfVar;
        this.g = ay0Var;
        this.v = f04Var;
        this.w = new o7f(this, o7fVar, list, "Deserializer for \"" + bm3Var.getName() + '\"', f04Var != null ? f04Var.b() : "[container not found]");
        this.x = new yq8(this);
    }

    @Override // defpackage.cfg
    public Object a() {
        switch (this.a) {
            case 3:
                Context context = (Context) ((ysd) ((oid) this.b).b).b;
                Object objA = ((bfg) this.c).a();
                Object objA2 = ((bfg) this.d).a();
                bfg bfgVar = new bfg(new fnb((yea) this.e));
                Object objA3 = ((bfg) this.f).a();
                Object objA4 = ((bfg) this.g).a();
                return new hfg(context, (k) objA, (h) objA2, bfgVar, (egg) objA3, (sfg) objA4, new bfg(new fnb((bfg) this.v)), new bfg(new fnb((bfg) this.w)), (vgg) ((bfg) this.x).a());
            default:
                Object objA5 = ((bfg) this.b).a();
                return new h((k) objA5, new bfg(new fnb((yea) this.c)), (f) ((bfg) this.d).a(), (s) ((bfg) this.e).a(), (m) ((bfg) this.f).a(), (n) ((bfg) this.g).a(), (o) ((bfg) this.v).a(), (p) ((bfg) this.w).a(), (l) ((bfg) this.x).a());
        }
    }

    public lp0 b(bm3 bm3Var, List list, u99 u99Var, bu3 bu3Var, otf otfVar, ay0 ay0Var) {
        u99Var.getClass();
        otfVar.getClass();
        ay0Var.getClass();
        tz3 tz3Var = (tz3) this.b;
        int i = ay0Var.b;
        if ((i != 1 || ay0Var.c < 4) && i <= 1) {
            otfVar = (otf) this.f;
        }
        return new lp0(tz3Var, u99Var, bm3Var, bu3Var, otfVar, ay0Var, (f04) this.v, (o7f) this.w, list);
    }

    public void d(qq0 qq0Var, int i) {
        byte[] bArr;
        long j;
        fo0 fo0Var;
        String str;
        fo0 fo0Var2;
        int i2;
        ri1 ri1VarM;
        String str2;
        Integer numValueOf;
        lp0 lp0Var;
        final lp0 lp0Var2 = this;
        final qq0 qq0Var2 = qq0Var;
        byte[] bArr2 = qq0Var2.b;
        w8c w8cVar = (w8c) lp0Var2.g;
        x3f x3fVarA = ((uu8) lp0Var2.c).a(qq0Var2.a);
        long jMax = 0;
        while (true) {
            final int i3 = 0;
            if (!((Boolean) w8cVar.E(new zbe(lp0Var2) { // from class: nhf
                public final /* synthetic */ lp0 b;

                {
                    this.b = lp0Var2;
                }

                @Override // defpackage.zbe
                public final Object p() {
                    Boolean bool;
                    int i4 = i3;
                    qq0 qq0Var3 = qq0Var2;
                    lp0 lp0Var3 = this.b;
                    switch (i4) {
                        case 0:
                            w8c w8cVar2 = (w8c) lp0Var3.d;
                            SQLiteDatabase sQLiteDatabaseB = w8cVar2.b();
                            sQLiteDatabaseB.beginTransaction();
                            try {
                                Long lH = w8c.h(sQLiteDatabaseB, qq0Var3);
                                if (lH == null) {
                                    bool = Boolean.FALSE;
                                } else {
                                    Cursor cursorRawQuery = w8cVar2.b().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{lH.toString()});
                                    try {
                                        Boolean boolValueOf = Boolean.valueOf(cursorRawQuery.moveToNext());
                                        cursorRawQuery.close();
                                        bool = boolValueOf;
                                    } catch (Throwable th) {
                                        cursorRawQuery.close();
                                        throw th;
                                    }
                                }
                                sQLiteDatabaseB.setTransactionSuccessful();
                                sQLiteDatabaseB.endTransaction();
                                return bool;
                            } catch (Throwable th2) {
                                sQLiteDatabaseB.endTransaction();
                                throw th2;
                            }
                        default:
                            w8c w8cVar3 = (w8c) lp0Var3.d;
                            w8cVar3.getClass();
                            return (Iterable) w8cVar3.l(new bo1(22, w8cVar3, qq0Var3));
                    }
                }
            })).booleanValue()) {
                w8cVar.E(new zh2(jMax, lp0Var2, qq0Var2));
                return;
            }
            final int i4 = 1;
            Iterable iterable = (Iterable) w8cVar.E(new zbe(lp0Var2) { // from class: nhf
                public final /* synthetic */ lp0 b;

                {
                    this.b = lp0Var2;
                }

                @Override // defpackage.zbe
                public final Object p() {
                    Boolean bool;
                    int i5 = i4;
                    qq0 qq0Var3 = qq0Var2;
                    lp0 lp0Var3 = this.b;
                    switch (i5) {
                        case 0:
                            w8c w8cVar2 = (w8c) lp0Var3.d;
                            SQLiteDatabase sQLiteDatabaseB = w8cVar2.b();
                            sQLiteDatabaseB.beginTransaction();
                            try {
                                Long lH = w8c.h(sQLiteDatabaseB, qq0Var3);
                                if (lH == null) {
                                    bool = Boolean.FALSE;
                                } else {
                                    Cursor cursorRawQuery = w8cVar2.b().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{lH.toString()});
                                    try {
                                        Boolean boolValueOf = Boolean.valueOf(cursorRawQuery.moveToNext());
                                        cursorRawQuery.close();
                                        bool = boolValueOf;
                                    } catch (Throwable th) {
                                        cursorRawQuery.close();
                                        throw th;
                                    }
                                }
                                sQLiteDatabaseB.setTransactionSuccessful();
                                sQLiteDatabaseB.endTransaction();
                                return bool;
                            } catch (Throwable th2) {
                                sQLiteDatabaseB.endTransaction();
                                throw th2;
                            }
                        default:
                            w8c w8cVar3 = (w8c) lp0Var3.d;
                            w8cVar3.getClass();
                            return (Iterable) w8cVar3.l(new bo1(22, w8cVar3, qq0Var3));
                    }
                }
            });
            if (!iterable.iterator().hasNext()) {
                return;
            }
            if (x3fVarA == null) {
                g21.I("Uploader", "Unknown backend for %s, deleting event batch for it...", qq0Var2);
                fo0Var2 = new fo0(3, -1L);
                bArr = bArr2;
                j = jMax;
            } else {
                ArrayList<xo0> arrayList = new ArrayList();
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(((tp0) it.next()).c);
                }
                if (bArr2 != null) {
                    w8c w8cVar2 = (w8c) lp0Var2.x;
                    Objects.requireNonNull(w8cVar2);
                    z42 z42Var = (z42) w8cVar.E(new phf(w8cVar2, i3));
                    wo0 wo0Var = new wo0();
                    wo0Var.w = new HashMap();
                    wo0Var.g = Long.valueOf(((j52) lp0Var2.v).e());
                    wo0Var.v = Long.valueOf(((j52) lp0Var2.w).e());
                    wo0Var.b = "GDT_CLIENT_METRICS";
                    jv4 jv4Var = new jv4("proto");
                    z42Var.getClass();
                    w84 w84Var = o0b.a;
                    w84Var.getClass();
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        w84Var.V0(z42Var, byteArrayOutputStream);
                    } catch (IOException unused) {
                    }
                    wo0Var.f = new cv4(jv4Var, byteArrayOutputStream.toByteArray());
                    arrayList.add(((tu1) x3fVarA).a(wo0Var.c()));
                }
                tu1 tu1Var = (tu1) x3fVarA;
                HashMap map = new HashMap();
                for (xo0 xo0Var : arrayList) {
                    String str3 = xo0Var.a;
                    if (map.containsKey(str3)) {
                        ((List) map.get(str3)).add(xo0Var);
                    } else {
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(xo0Var);
                        map.put(str3, arrayList2);
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                for (Map.Entry entry : map.entrySet()) {
                    xo0 xo0Var2 = (xo0) ((List) entry.getValue()).get(0);
                    w3b w3bVar = w3b.DEFAULT;
                    long jE = tu1Var.f.e();
                    long jE2 = tu1Var.e.e();
                    lo0 lo0Var = new lo0(new do0(Integer.valueOf(xo0Var2.b("sdk-version")), xo0Var2.a("model"), xo0Var2.a("hardware"), xo0Var2.a("device"), xo0Var2.a("product"), xo0Var2.a("os-uild"), xo0Var2.a("manufacturer"), xo0Var2.a("fingerprint"), xo0Var2.a("locale"), xo0Var2.a("country"), xo0Var2.a("mcc_mnc"), xo0Var2.a("application_build")));
                    try {
                        numValueOf = Integer.valueOf(Integer.parseInt((String) entry.getKey()));
                        str2 = null;
                    } catch (NumberFormatException unused2) {
                        str2 = (String) entry.getKey();
                        numValueOf = null;
                    }
                    ArrayList arrayList4 = new ArrayList();
                    for (xo0 xo0Var3 : (List) entry.getValue()) {
                        byte[] bArr3 = bArr2;
                        cv4 cv4Var = xo0Var3.c;
                        byte[] bArr4 = xo0Var3.j;
                        jv4 jv4Var2 = cv4Var.a;
                        byte[] bArr5 = cv4Var.b;
                        long j2 = jMax;
                        if (jv4Var2.equals(new jv4("proto"))) {
                            lp0Var = new lp0();
                            lp0Var.g = bArr5;
                        } else {
                            if (jv4Var2.equals(new jv4("json"))) {
                                String str4 = new String(bArr5, Charset.forName(Constants.ENCODING));
                                lp0 lp0Var3 = new lp0();
                                lp0Var3.v = str4;
                                lp0Var = lp0Var3;
                            } else {
                                String strConcat = "TRuntime.".concat("CctTransportBackend");
                                if (Log.isLoggable(strConcat, 5)) {
                                    b1.l(strConcat, "Received event of unsupported encoding " + jv4Var2 + ". Skipping...");
                                }
                            }
                            bArr2 = bArr3;
                            jMax = j2;
                        }
                        lp0Var.b = Long.valueOf(xo0Var3.d);
                        lp0Var.c = Long.valueOf(xo0Var3.e);
                        String str5 = (String) xo0Var3.f.get("tz-offset");
                        lp0Var.d = Long.valueOf(str5 == null ? 0L : Long.valueOf(str5).longValue());
                        lp0Var.w = new pp0((md9) md9.b.get(xo0Var3.b("net-type")), (ld9) ld9.c.get(xo0Var3.b("mobile-subtype")));
                        Integer num = xo0Var3.b;
                        if (num != null) {
                            lp0Var.e = num;
                        }
                        Integer num2 = xo0Var3.g;
                        if (num2 != null) {
                            bp0 bp0Var = new bp0(new ap0(num2));
                            gb2 gb2Var = gb2.EVENT_OVERRIDE;
                            lp0Var.f = new mo0(bp0Var);
                        }
                        byte[] bArr6 = xo0Var3.i;
                        if (bArr6 != null || bArr4 != null) {
                            if (bArr6 == null) {
                                bArr6 = null;
                            }
                            lp0Var.x = new zo0(bArr6, bArr4 != null ? bArr4 : null);
                        }
                        String strConcat2 = ((Long) lp0Var.b) == null ? " eventTimeMs" : "";
                        if (((Long) lp0Var.c) == null) {
                            strConcat2 = strConcat2.concat(" eventUptimeMs");
                        }
                        if (((Long) lp0Var.d) == null) {
                            strConcat2 = strConcat2.concat(" timezoneOffsetSeconds");
                        }
                        if (!strConcat2.isEmpty()) {
                            qc0.p("Missing required properties:".concat(strConcat2));
                            return;
                        } else {
                            arrayList4.add(new mp0(((Long) lp0Var.b).longValue(), (Integer) lp0Var.e, (mo0) lp0Var.f, ((Long) lp0Var.c).longValue(), (byte[]) lp0Var.g, (String) lp0Var.v, ((Long) lp0Var.d).longValue(), (pp0) lp0Var.w, (zo0) lp0Var.x));
                            bArr2 = bArr3;
                            jMax = j2;
                        }
                    }
                    arrayList3.add(new np0(jE, jE2, lo0Var, numValueOf, str2, arrayList4));
                }
                bArr = bArr2;
                j = jMax;
                go0 go0Var = new go0(arrayList3);
                URL urlB = tu1Var.d;
                if (bArr != null) {
                    try {
                        e71 e71VarA = e71.a(bArr);
                        str = e71VarA.b;
                        if (str == null) {
                            str = null;
                        }
                        String str6 = e71VarA.a;
                        if (str6 != null) {
                            urlB = tu1.b(str6);
                        }
                    } catch (IllegalArgumentException unused3) {
                        fo0Var = new fo0(3, -1L);
                    }
                } else {
                    str = null;
                }
                try {
                    int i5 = 15;
                    ta0 ta0Var = new ta0(urlB, go0Var, str, i5);
                    jv2 jv2Var = new jv2(9, tu1Var);
                    int i6 = 5;
                    do {
                        ri1VarM = jv2Var.m(ta0Var);
                        URL url = (URL) ri1VarM.c;
                        if (url != null) {
                            g21.I("CctTransportBackend", "Following redirect to: %s", url);
                            ta0Var = new ta0(url, (go0) ta0Var.d, (String) ta0Var.b, i5);
                        } else {
                            ta0Var = null;
                        }
                        if (ta0Var == null) {
                            break;
                        } else {
                            i6--;
                        }
                    } while (i6 >= 1);
                    int i7 = ri1VarM.a;
                    if (i7 == 200) {
                        fo0Var2 = new fo0(1, ri1VarM.b);
                    } else {
                        if (i7 >= 500 || i7 == 404) {
                            fo0Var = new fo0(2, -1L);
                        } else if (i7 == 400) {
                            try {
                                fo0Var = new fo0(4, -1L);
                            } catch (IOException e) {
                                e = e;
                                g21.K("CctTransportBackend", "Could not make request to the backend", e);
                                i2 = 2;
                                fo0Var2 = new fo0(2, -1L);
                            }
                        } else {
                            fo0Var = new fo0(3, -1L);
                        }
                        fo0Var2 = fo0Var;
                    }
                } catch (IOException e2) {
                    e = e2;
                }
            }
            i2 = 2;
            int i8 = fo0Var2.a;
            if (i8 == i2) {
                w8cVar.E(new jx2(this, iterable, qq0Var, j));
                ((gg7) this.e).w(qq0Var, i + 1, true);
                return;
            }
            lp0Var2 = this;
            qq0Var2 = qq0Var;
            jMax = j;
            w8cVar.E(new bo1(26, lp0Var2, iterable));
            if (i8 == 1) {
                jMax = Math.max(jMax, fo0Var2.b);
                if (bArr != null) {
                    w8cVar.E(new r45(24, lp0Var2));
                }
            } else if (i8 == 4) {
                HashMap map2 = new HashMap();
                Iterator it2 = iterable.iterator();
                while (it2.hasNext()) {
                    String str7 = ((tp0) it2.next()).c.a;
                    if (map2.containsKey(str7)) {
                        map2.put(str7, Integer.valueOf(((Integer) map2.get(str7)).intValue() + 1));
                    } else {
                        map2.put(str7, 1);
                    }
                }
                w8cVar.E(new bo1(27, lp0Var2, map2));
            }
            bArr2 = bArr;
        }
    }

    public /* synthetic */ lp0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
        this.g = obj6;
        this.v = obj7;
        this.w = obj8;
        this.x = obj9;
    }

    public /* synthetic */ lp0() {
        this.a = 0;
    }
}
