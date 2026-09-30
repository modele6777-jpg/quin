package defpackage;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class y2h extends wbh implements pqg {
    public final kd0 E0;
    public final oid X;
    public final kd0 Y;
    public final kd0 Z;
    public final kd0 e;
    public final kd0 f;
    public final kd0 g;
    public final kd0 v;
    public final kd0 w;
    public final kd0 x;
    public final kd0 y;
    public final lk2 z;

    public y2h(ich ichVar) {
        super(ichVar);
        this.e = new kd0(0);
        this.f = new kd0(0);
        this.g = new kd0(0);
        this.v = new kd0(0);
        this.w = new kd0(0);
        this.x = new kd0(0);
        this.Y = new kd0(0);
        this.Z = new kd0(0);
        this.E0 = new kd0(0);
        this.y = new kd0(0);
        this.z = new lk2(this);
        this.X = new oid(12, this);
    }

    public static final kd0 K0(d0h d0hVar) {
        kd0 kd0Var = new kd0(0);
        for (u0h u0hVar : d0hVar.v()) {
            kd0Var.put(u0hVar.r(), u0hVar.s());
        }
        return kd0Var;
    }

    public static final o5h L0(int i) {
        int i2 = i - 1;
        if (i2 == 1) {
            return o5h.AD_STORAGE;
        }
        if (i2 == 2) {
            return o5h.ANALYTICS_STORAGE;
        }
        if (i2 == 3) {
            return o5h.AD_USER_DATA;
        }
        if (i2 != 4) {
            return null;
        }
        return o5h.AD_PERSONALIZATION;
    }

    public final k5h E0(String str, o5h o5hVar) {
        A0();
        G0(str);
        szg szgVarW0 = W0(str);
        if (szgVarW0 != null) {
            for (xyg xygVar : szgVarW0.w()) {
                if (L0(xygVar.r()) == o5hVar) {
                    int iS = xygVar.s() - 1;
                    if (iS == 1) {
                        return k5h.GRANTED;
                    }
                    if (iS != 2) {
                        break;
                    }
                    return k5h.DENIED;
                }
            }
        }
        return k5h.UNINITIALIZED;
    }

    public final boolean F0(String str) {
        A0();
        G0(str);
        szg szgVarW0 = W0(str);
        if (szgVarW0 == null) {
            return false;
        }
        for (xyg xygVar : szgVarW0.r()) {
            if (xygVar.r() == 3 && xygVar.t() == 3) {
                return true;
            }
        }
        return false;
    }

    public final void G0(String str) {
        B0();
        A0();
        oa7.x(str);
        kd0 kd0Var = this.x;
        if (kd0Var.get(str) == null) {
            krg krgVar = this.c.c;
            ich.S(krgVar);
            psd psdVarI1 = krgVar.I1(str);
            kd0 kd0Var2 = this.E0;
            kd0 kd0Var3 = this.Z;
            kd0 kd0Var4 = this.Y;
            kd0 kd0Var5 = this.e;
            if (psdVarI1 != null) {
                a0h a0hVar = (a0h) J0(str, (byte[]) psdVarI1.b).i();
                H0(str, a0hVar);
                kd0Var5.put(str, K0((d0h) a0hVar.e()));
                kd0Var.put(str, (d0h) a0hVar.e());
                I0(str, (d0h) a0hVar.e());
                kd0Var4.put(str, ((d0h) a0hVar.b).C());
                kd0Var3.put(str, (String) psdVarI1.c);
                kd0Var2.put(str, (String) psdVarI1.d);
                return;
            }
            kd0Var5.put(str, null);
            this.g.put(str, null);
            this.f.put(str, null);
            this.v.put(str, null);
            this.w.put(str, null);
            kd0Var.put(str, null);
            kd0Var4.put(str, null);
            kd0Var3.put(str, null);
            kd0Var2.put(str, null);
            this.y.put(str, null);
        }
    }

    public final void H0(String str, a0h a0hVar) {
        ArrayList arrayList;
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        int i = 0;
        kd0 kd0Var = new kd0(0);
        kd0 kd0Var2 = new kd0(0);
        kd0 kd0Var3 = new kd0(0);
        Iterator it = Collections.unmodifiableList(((d0h) a0hVar.b).B()).iterator();
        while (it.hasNext()) {
            hashSet.add(((uzg) it.next()).r());
        }
        w3h w3hVar = (w3h) this.b;
        qqg qqgVar = w3hVar.d;
        w0h w0hVar = w3hVar.f;
        azg azgVar = bzg.V0;
        if (qqgVar.L0(null, azgVar)) {
            arrayList2.addAll(Collections.unmodifiableList(((d0h) a0hVar.b).H()));
        }
        while (i < ((d0h) a0hVar.b).w()) {
            yzg yzgVar = (yzg) ((d0h) a0hVar.b).x(i).i();
            if (yzgVar.h().isEmpty()) {
                w3h.h(w0hVar);
                w0hVar.x.a("EventConfig contained null event name");
                arrayList = arrayList2;
            } else {
                String strH = yzgVar.h();
                arrayList = arrayList2;
                String strU = rfc.u(yzgVar.h(), ok8.t, ok8.y);
                if (!TextUtils.isEmpty(strU)) {
                    yzgVar.c();
                    ((zzg) yzgVar.b).y(strU);
                    a0hVar.c();
                    ((d0h) a0hVar.b).K(i, (zzg) yzgVar.e());
                }
                if (((zzg) yzgVar.b).s() && ((zzg) yzgVar.b).t()) {
                    kd0Var.put(strH, Boolean.TRUE);
                }
                if (((zzg) yzgVar.b).u() && ((zzg) yzgVar.b).v()) {
                    kd0Var2.put(yzgVar.h(), Boolean.TRUE);
                }
                if (((zzg) yzgVar.b).w()) {
                    if (((zzg) yzgVar.b).x() < 2 || ((zzg) yzgVar.b).x() > 65535) {
                        w3h.h(w0hVar);
                        w0hVar.x.c(yzgVar.h(), Integer.valueOf(((zzg) yzgVar.b).x()), "Invalid sampling rate. Event name, sample rate");
                    } else {
                        kd0Var3.put(yzgVar.h(), Integer.valueOf(((zzg) yzgVar.b).x()));
                    }
                }
            }
            i++;
            arrayList2 = arrayList;
        }
        ArrayList arrayList3 = arrayList2;
        this.f.put(str, hashSet);
        if (w3hVar.d.L0(null, azgVar)) {
            this.w.put(str, arrayList3);
        }
        this.g.put(str, kd0Var);
        this.v.put(str, kd0Var2);
        this.y.put(str, kd0Var3);
    }

    public final void I0(String str, d0h d0hVar) {
        w3h w3hVar = (w3h) this.b;
        int iA = d0hVar.A();
        lk2 lk2Var = this.z;
        if (iA == 0) {
            lk2Var.e(str);
            return;
        }
        w0h w0hVar = w3hVar.f;
        w3h.h(w0hVar);
        w0hVar.Z.b(Integer.valueOf(d0hVar.A()), "EES programs found");
        int i = 0;
        b5h b5hVar = (b5h) d0hVar.z().get(0);
        try {
            ktg ktgVar = new ktg();
            kxa kxaVar = ktgVar.a;
            ((HashMap) ((ysd) kxaVar.d).b).put("internal.remoteConfig", new q2h(this, str, 2));
            ((HashMap) ((ysd) kxaVar.d).b).put("internal.appMetadata", new q2h(this, str, i));
            ((HashMap) ((ysd) kxaVar.d).b).put("internal.logger", new yg6(5, this));
            ktgVar.b(b5hVar);
            lk2Var.d(str, ktgVar);
            w3h.h(w0hVar);
            tz0 tz0Var = w0hVar.Z;
            tz0Var.c(str, Integer.valueOf(b5hVar.s().s()), "EES program loaded for appId, activities");
            for (u4h u4hVar : b5hVar.s().r()) {
                w3h.h(w0hVar);
                tz0Var.b(u4hVar.r(), "EES program activity");
            }
        } catch (awg unused) {
            w0h w0hVar2 = w3hVar.f;
            w3h.h(w0hVar2);
            w0hVar2.g.b(str, "Failed to load EES program. appId");
        }
    }

    public final d0h J0(String str, byte[] bArr) {
        w3h w3hVar = (w3h) this.b;
        if (bArr == null) {
            return d0h.J();
        }
        try {
            d0h d0hVar = (d0h) ((a0h) lch.l1(d0h.I(), bArr)).e();
            w0h w0hVar = w3hVar.f;
            w3h.h(w0hVar);
            w0hVar.Z.c(d0hVar.r() ? Long.valueOf(d0hVar.s()) : null, d0hVar.t() ? d0hVar.u() : null, "Parsed config. version, gmp_app_id");
            return d0hVar;
        } catch (bng e) {
            w0h w0hVar2 = w3hVar.f;
            w3h.h(w0hVar2);
            w0hVar2.x.c(w0h.E0(str), e, "Unable to merge remote config. appId");
            return d0h.J();
        } catch (RuntimeException e2) {
            w0h w0hVar3 = w3hVar.f;
            w3h.h(w0hVar3);
            w0hVar3.x.c(w0h.E0(str), e2, "Unable to merge remote config. appId");
            return d0h.J();
        }
    }

    @Override // defpackage.pqg
    public final String M(String str, String str2) {
        A0();
        G0(str);
        Map map = (Map) this.e.get(str);
        if (map != null) {
            return (String) map.get(str2);
        }
        return null;
    }

    public final d0h M0(String str) {
        B0();
        A0();
        oa7.x(str);
        G0(str);
        return (d0h) this.x.get(str);
    }

    public final String N0(String str) {
        A0();
        G0(str);
        return (String) this.Y.get(str);
    }

    public final void O0(String str, String str2, String str3, byte[] bArr) throws Throwable {
        SQLiteDatabase sQLiteDatabase;
        a0h a0hVar;
        byte[] bArrA;
        Iterator it;
        int i;
        boolean z;
        B0();
        A0();
        oa7.x(str);
        a0h a0hVar2 = (a0h) J0(str, bArr).i();
        H0(str, a0hVar2);
        I0(str, (d0h) a0hVar2.e());
        d0h d0hVar = (d0h) a0hVar2.e();
        kd0 kd0Var = this.x;
        kd0Var.put(str, d0hVar);
        this.Y.put(str, ((d0h) a0hVar2.b).C());
        this.Z.put(str, str2);
        this.E0.put(str, str3);
        this.e.put(str, K0((d0h) a0hVar2.e()));
        ich ichVar = this.c;
        krg krgVar = ichVar.c;
        ich.S(krgVar);
        ArrayList<jyg> arrayList = new ArrayList(Collections.unmodifiableList(((d0h) a0hVar2.b).y()));
        w3h w3hVar = (w3h) krgVar.b;
        int i2 = 0;
        while (i2 < arrayList.size()) {
            iyg iygVar = (iyg) ((jyg) arrayList.get(i2)).i();
            kd0 kd0Var2 = kd0Var;
            if (((jyg) iygVar.b).x() != 0) {
                int i3 = 0;
                while (i3 < ((jyg) iygVar.b).x()) {
                    kyg kygVar = (kyg) ((jyg) iygVar.b).y(i3).i();
                    kyg kygVar2 = (kyg) kygVar.clone();
                    ich ichVar2 = ichVar;
                    a0h a0hVar3 = a0hVar2;
                    String strU = rfc.u(((lyg) kygVar.b).t(), ok8.t, ok8.y);
                    if (strU != null) {
                        kygVar2.c();
                        ((lyg) kygVar2.b).E(strU);
                        z = true;
                    } else {
                        z = false;
                    }
                    int i4 = 0;
                    while (i4 < ((lyg) kygVar.b).v()) {
                        nyg nygVarW = ((lyg) kygVar.b).w(i4);
                        boolean z2 = z;
                        kyg kygVar3 = kygVar;
                        String strU2 = rfc.u(nygVarW.y(), ym8.h, ym8.i);
                        if (strU2 != null) {
                            myg mygVar = (myg) nygVarW.i();
                            mygVar.c();
                            ((nyg) mygVar.b).A(strU2);
                            nyg nygVar = (nyg) mygVar.e();
                            kygVar2.c();
                            ((lyg) kygVar2.b).F(i4, nygVar);
                            z = true;
                        } else {
                            z = z2;
                        }
                        i4++;
                        kygVar = kygVar3;
                    }
                    if (z) {
                        iygVar.c();
                        ((jyg) iygVar.b).A(i3, (lyg) kygVar2.e());
                        arrayList.set(i2, (jyg) iygVar.e());
                    }
                    i3++;
                    ichVar = ichVar2;
                    a0hVar2 = a0hVar3;
                }
            }
            a0h a0hVar4 = a0hVar2;
            ich ichVar3 = ichVar;
            if (((jyg) iygVar.b).u() != 0) {
                for (int i5 = 0; i5 < ((jyg) iygVar.b).u(); i5++) {
                    uyg uygVarV = ((jyg) iygVar.b).v(i5);
                    String strU3 = rfc.u(uygVarV.t(), if9.q, if9.r);
                    if (strU3 != null) {
                        syg sygVar = (syg) uygVarV.i();
                        sygVar.c();
                        ((uyg) sygVar.b).A(strU3);
                        iygVar.c();
                        ((jyg) iygVar.b).z(i5, (uyg) sygVar.e());
                        arrayList.set(i2, (jyg) iygVar.e());
                    }
                }
            }
            i2++;
            kd0Var = kd0Var2;
            ichVar = ichVar3;
            a0hVar2 = a0hVar4;
        }
        a0h a0hVar5 = a0hVar2;
        kd0 kd0Var3 = kd0Var;
        ich ichVar4 = ichVar;
        krgVar.B0();
        krgVar.A0();
        oa7.x(str);
        SQLiteDatabase sQLiteDatabaseR1 = krgVar.r1();
        sQLiteDatabaseR1.beginTransaction();
        try {
            krgVar.B0();
            krgVar.A0();
            oa7.x(str);
            SQLiteDatabase sQLiteDatabaseR2 = krgVar.r1();
            sQLiteDatabaseR2.delete("property_filters", "app_id=?", new String[]{str});
            sQLiteDatabaseR2.delete("event_filters", "app_id=?", new String[]{str});
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                jyg jygVar = (jyg) it2.next();
                krgVar.B0();
                krgVar.A0();
                oa7.x(str);
                oa7.A(jygVar);
                if (jygVar.r()) {
                    int iS = jygVar.s();
                    Iterator it3 = jygVar.w().iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            if (!((lyg) it3.next()).r()) {
                                w0h w0hVar = w3hVar.f;
                                w3h.h(w0hVar);
                                w0hVar.x.c(w0h.E0(str), Integer.valueOf(iS), "Event filter with no ID. Audience definition ignored. appId, audienceId");
                                break;
                            }
                        } else {
                            Iterator it4 = jygVar.t().iterator();
                            while (true) {
                                if (!it4.hasNext()) {
                                    Iterator it5 = jygVar.w().iterator();
                                    while (true) {
                                        jyg jygVar2 = jygVar;
                                        String str4 = "audience_id";
                                        sQLiteDatabase = sQLiteDatabaseR1;
                                        String str5 = "app_id";
                                        if (!it5.hasNext()) {
                                            it = it2;
                                            i = iS;
                                            for (uyg uygVar : jygVar2.t()) {
                                                krgVar.B0();
                                                krgVar.A0();
                                                oa7.x(str);
                                                oa7.A(uygVar);
                                                if (uygVar.t().isEmpty()) {
                                                    w0h w0hVar2 = w3hVar.f;
                                                    w3h.h(w0hVar2);
                                                    w0hVar2.x.d("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", w0h.E0(str), Integer.valueOf(i), String.valueOf(uygVar.r() ? Integer.valueOf(uygVar.s()) : null));
                                                } else {
                                                    byte[] bArrA2 = uygVar.a();
                                                    ContentValues contentValues = new ContentValues();
                                                    contentValues.put(str5, str);
                                                    String str6 = str5;
                                                    contentValues.put(str4, Integer.valueOf(i));
                                                    contentValues.put("filter_id", uygVar.r() ? Integer.valueOf(uygVar.s()) : null);
                                                    String str7 = str4;
                                                    contentValues.put("property_name", uygVar.t());
                                                    contentValues.put("session_scoped", uygVar.x() ? Boolean.valueOf(uygVar.y()) : null);
                                                    contentValues.put("data", bArrA2);
                                                    try {
                                                        if (krgVar.r1().insertWithOnConflict("property_filters", null, contentValues, 5) == -1) {
                                                            w0h w0hVar3 = w3hVar.f;
                                                            w3h.h(w0hVar3);
                                                            w0hVar3.g.b(w0h.E0(str), "Failed to insert property filter (got -1). appId");
                                                        } else {
                                                            str5 = str6;
                                                            str4 = str7;
                                                        }
                                                    } catch (SQLiteException e) {
                                                        w0h w0hVar4 = w3hVar.f;
                                                        w3h.h(w0hVar4);
                                                        w0hVar4.g.c(w0h.E0(str), e, "Error storing property filter. appId");
                                                    }
                                                }
                                            }
                                            break;
                                        }
                                        try {
                                            lyg lygVar = (lyg) it5.next();
                                            krgVar.B0();
                                            krgVar.A0();
                                            oa7.x(str);
                                            oa7.A(lygVar);
                                            if (lygVar.t().isEmpty()) {
                                                w0h w0hVar5 = w3hVar.f;
                                                w3h.h(w0hVar5);
                                                w0hVar5.x.d("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", w0h.E0(str), Integer.valueOf(iS), String.valueOf(lygVar.r() ? Integer.valueOf(lygVar.s()) : null));
                                                it = it2;
                                                i = iS;
                                            } else {
                                                it = it2;
                                                byte[] bArrA3 = lygVar.a();
                                                i = iS;
                                                ContentValues contentValues2 = new ContentValues();
                                                contentValues2.put("app_id", str);
                                                contentValues2.put("audience_id", Integer.valueOf(i));
                                                contentValues2.put("filter_id", lygVar.r() ? Integer.valueOf(lygVar.s()) : null);
                                                contentValues2.put("event_name", lygVar.t());
                                                contentValues2.put("session_scoped", lygVar.B() ? Boolean.valueOf(lygVar.C()) : null);
                                                contentValues2.put("data", bArrA3);
                                                try {
                                                    if (krgVar.r1().insertWithOnConflict("event_filters", null, contentValues2, 5) == -1) {
                                                        w0h w0hVar6 = w3hVar.f;
                                                        w3h.h(w0hVar6);
                                                        w0hVar6.g.b(w0h.E0(str), "Failed to insert event filter (got -1). appId");
                                                    }
                                                    jygVar = jygVar2;
                                                    sQLiteDatabaseR1 = sQLiteDatabase;
                                                    it2 = it;
                                                    iS = i;
                                                } catch (SQLiteException e2) {
                                                    w0h w0hVar7 = w3hVar.f;
                                                    w3h.h(w0hVar7);
                                                    w0hVar7.g.c(w0h.E0(str), e2, "Error storing event filter. appId");
                                                }
                                            }
                                        } catch (Throwable th) {
                                            th = th;
                                            sQLiteDatabase.endTransaction();
                                            throw th;
                                        }
                                        krgVar.B0();
                                        krgVar.A0();
                                        oa7.x(str);
                                        SQLiteDatabase sQLiteDatabaseR3 = krgVar.r1();
                                        sQLiteDatabaseR3.delete("property_filters", "app_id=? and audience_id=?", new String[]{str, String.valueOf(i)});
                                        sQLiteDatabaseR3.delete("event_filters", "app_id=? and audience_id=?", new String[]{str, String.valueOf(i)});
                                        break;
                                    }
                                    sQLiteDatabaseR1 = sQLiteDatabase;
                                    it2 = it;
                                    break;
                                }
                                if (!((uyg) it4.next()).r()) {
                                    w0h w0hVar8 = w3hVar.f;
                                    w3h.h(w0hVar8);
                                    w0hVar8.x.c(w0h.E0(str), Integer.valueOf(iS), "Property filter with no ID. Audience definition ignored. appId, audienceId");
                                    break;
                                }
                            }
                        }
                    }
                } else {
                    w0h w0hVar9 = w3hVar.f;
                    w3h.h(w0hVar9);
                    w0hVar9.x.b(w0h.E0(str), "Audience with no ID. appId");
                }
            }
            sQLiteDatabase = sQLiteDatabaseR1;
            ArrayList arrayList2 = new ArrayList();
            for (jyg jygVar3 : arrayList) {
                arrayList2.add(jygVar3.r() ? Integer.valueOf(jygVar3.s()) : null);
            }
            oa7.x(str);
            krgVar.B0();
            krgVar.A0();
            SQLiteDatabase sQLiteDatabaseR4 = krgVar.r1();
            try {
                long jW0 = krgVar.W0("select count(1) from audience_filter_values where app_id=?", new String[]{str});
                int iMax = Math.max(0, Math.min(2000, w3hVar.d.J0(str, bzg.U)));
                if (jW0 > iMax) {
                    ArrayList arrayList3 = new ArrayList();
                    int i6 = 0;
                    while (true) {
                        if (i6 >= arrayList2.size()) {
                            String strJoin = TextUtils.join(",", arrayList3);
                            StringBuilder sb = new StringBuilder(String.valueOf(strJoin).length() + 2);
                            sb.append("(");
                            sb.append(strJoin);
                            sb.append(")");
                            String string = sb.toString();
                            StringBuilder sb2 = new StringBuilder(string.length() + 140);
                            sb2.append("audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in ");
                            sb2.append(string);
                            sb2.append(" order by rowid desc limit -1 offset ?)");
                            sQLiteDatabaseR4.delete("audience_filter_values", sb2.toString(), new String[]{str, Integer.toString(iMax)});
                            break;
                        }
                        Integer num = (Integer) arrayList2.get(i6);
                        if (num == null) {
                            break;
                        }
                        arrayList3.add(Integer.toString(num.intValue()));
                        i6++;
                    }
                }
            } catch (SQLiteException e3) {
                w0h w0hVar10 = w3hVar.f;
                w3h.h(w0hVar10);
                w0hVar10.g.c(w0h.E0(str), e3, "Database error querying filters. appId");
            }
            sQLiteDatabase.setTransactionSuccessful();
            sQLiteDatabase.endTransaction();
            try {
                a0hVar5.c();
                a0hVar = a0hVar5;
                try {
                    ((d0h) a0hVar.b).L();
                    bArrA = ((d0h) a0hVar.e()).a();
                } catch (RuntimeException e4) {
                    e = e4;
                    w0h w0hVar11 = ((w3h) this.b).f;
                    w3h.h(w0hVar11);
                    w0hVar11.x.c(w0h.E0(str), e, "Unable to serialize reduced-size config. Storing full config instead. appId");
                    bArrA = bArr;
                }
            } catch (RuntimeException e5) {
                e = e5;
                a0hVar = a0hVar5;
            }
            krg krgVar2 = ichVar4.c;
            ich.S(krgVar2);
            w3h w3hVar2 = (w3h) krgVar2.b;
            oa7.x(str);
            krgVar2.A0();
            krgVar2.B0();
            ContentValues contentValues3 = new ContentValues();
            contentValues3.put("remote_config", bArrA);
            contentValues3.put("config_last_modified_time", str2);
            contentValues3.put("e_tag", str3);
            try {
                if (krgVar2.r1().update("apps", contentValues3, "app_id = ?", new String[]{str}) == 0) {
                    w0h w0hVar12 = w3hVar2.f;
                    w3h.h(w0hVar12);
                    w0hVar12.g.b(w0h.E0(str), "Failed to update remote config (got 0). appId");
                }
            } catch (SQLiteException e6) {
                w0h w0hVar13 = w3hVar2.f;
                w3h.h(w0hVar13);
                w0hVar13.g.c(w0h.E0(str), e6, "Error storing remote config. appId");
            }
            a0hVar.c();
            ((d0h) a0hVar.b).M();
            kd0Var3.put(str, (d0h) a0hVar.e());
        } catch (Throwable th2) {
            th = th2;
            sQLiteDatabase = sQLiteDatabaseR1;
        }
    }

    public final boolean P0(String str, String str2) {
        Boolean bool;
        A0();
        G0(str);
        if ("1".equals(M(str, "measurement.upload.blacklist_internal")) && qch.f1(str2)) {
            return true;
        }
        if ("1".equals(M(str, "measurement.upload.blacklist_public")) && qch.B1(str2)) {
            return true;
        }
        Map map = (Map) this.g.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final boolean Q0(String str, String str2) {
        Boolean bool;
        A0();
        G0(str);
        if ("ecommerce_purchase".equals(str2) || "purchase".equals(str2) || "refund".equals(str2)) {
            return true;
        }
        Map map = (Map) this.v.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final List R0(String str) {
        A0();
        G0(str);
        return (List) this.w.get(str);
    }

    public final int S0(String str, String str2) {
        Integer num;
        A0();
        G0(str);
        Map map = (Map) this.y.get(str);
        if (map == null || (num = (Integer) map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    public final boolean T0(String str) {
        A0();
        G0(str);
        kd0 kd0Var = this.f;
        if (kd0Var.get(str) != null) {
            return ((Set) kd0Var.get(str)).contains("os_version") || ((Set) kd0Var.get(str)).contains("device_info");
        }
        return false;
    }

    public final boolean U0(String str) {
        A0();
        G0(str);
        kd0 kd0Var = this.f;
        return kd0Var.get(str) != null && ((Set) kd0Var.get(str)).contains("app_instance_id");
    }

    public final boolean V0(String str, o5h o5hVar) {
        A0();
        G0(str);
        szg szgVarW0 = W0(str);
        if (szgVarW0 == null) {
            return false;
        }
        for (xyg xygVar : szgVarW0.r()) {
            if (o5hVar == L0(xygVar.r())) {
                return xygVar.s() == 2;
            }
        }
        return false;
    }

    public final szg W0(String str) {
        A0();
        G0(str);
        d0h d0hVarM0 = M0(str);
        if (d0hVarM0 == null || !d0hVarM0.D()) {
            return null;
        }
        return d0hVarM0.E();
    }

    @Override // defpackage.wbh
    public final void D0() {
    }
}
