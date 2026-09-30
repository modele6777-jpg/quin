package defpackage;

import ai.askquin.ui.popup.dailyfortune.v;
import android.content.Context;
import java.time.LocalDate;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class kj9 {
    public final Context a;
    public final gd8 b;
    public final e3b c;
    public final v d;

    public kj9(Context context, gd8 gd8Var, e3b e3bVar, v vVar) {
        this.a = context;
        this.b = gd8Var;
        this.c = e3bVar;
        this.d = vVar;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:105:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:107:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:109:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:24:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:67:0x024e  */
    /* JADX WARN: Code duplicated, block: B:69:0x0265  */
    /* JADX WARN: Code duplicated, block: B:71:0x0268  */
    /* JADX WARN: Code duplicated, block: B:72:0x026a  */
    /* JADX WARN: Code duplicated, block: B:74:0x026d  */
    /* JADX WARN: Code duplicated, block: B:75:0x026f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v22 */
    /* JADX WARN: Type inference failed for: r11v25 */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r8v10, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public final Object a(zn2 zn2Var) {
        jj9 jj9Var;
        boolean zBooleanValue;
        boolean z;
        String string;
        boolean zK;
        boolean zBooleanValue2;
        String str;
        lj9 lj9Var;
        boolean z2;
        ?? r11;
        boolean z3;
        lb8 lb8Var;
        String str2;
        ?? r12;
        boolean z4;
        boolean z5;
        boolean zA;
        d83 d83Var;
        boolean z6;
        boolean z7;
        if (zn2Var instanceof jj9) {
            jj9Var = (jj9) zn2Var;
            int i = jj9Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                jj9Var.label = i - Integer.MIN_VALUE;
            } else {
                jj9Var = new jj9(this, zn2Var);
            }
        } else {
            jj9Var = new jj9(this, zn2Var);
        }
        Object objB = jj9Var.result;
        int i2 = jj9Var.label;
        bw2 bw2Var = bw2.a;
        if (i2 != 0) {
            if (i2 == 1) {
                jzb.q(objB);
            } else {
                if (i2 != 2) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z2 = jj9Var.Z$5;
                z3 = jj9Var.Z$4;
                int i3 = jj9Var.I$1;
                int i4 = jj9Var.I$0;
                zBooleanValue2 = jj9Var.Z$3;
                zK = jj9Var.Z$2;
                zBooleanValue = jj9Var.Z$0;
                str2 = (String) jj9Var.L$4;
                lj9Var = (lj9) jj9Var.L$3;
                string = (String) jj9Var.L$2;
                lb8Var = (lb8) jj9Var.L$0;
                jzb.q(objB);
                str = "Quin.TPEval";
                r11 = i3;
                r12 = i4;
            }
            if (((Boolean) objB).booleanValue()) {
                hf8.Q.getClass();
                ef8.a(str).e("evaluate -> launch-cohort tomorrow guide using TP2");
                return new mj9(2, d83.c);
            }
            if (r12 != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (r11 != 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            zA = lj9Var.a(2);
            d83Var = d83.b;
            if (!zA && !pa7.t(str2, string) && lb8Var.p && z2 && (!zK || !z4 || !z5)) {
                hf8.Q.getClass();
                ef8.a(str).e("evaluate -> TP2");
                return new mj9(2, d83Var);
            }
            boolean zA2 = lj9Var.a(3);
            if (!zBooleanValue && !zA2 && lb8Var.k.size() >= 3 && z3 && (!zK || !zBooleanValue2)) {
                hf8.Q.getClass();
                ef8.a(str).e("evaluate -> TP3");
                return new mj9(3, null);
            }
            if (r12 != 0) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (r11 != 0) {
                z7 = true;
            } else {
                z7 = false;
            }
            if (!lj9Var.a(4) && lb8Var.l >= 3 && z2 && !(zK && z6 && z7)) {
                hf8.Q.getClass();
                ef8.a(str).e("evaluate -> TP4");
                return new mj9(4, d83Var);
            }
            hf8.Q.getClass();
            ef8.a(str).e("evaluate -> null");
            return null;
        }
        jzb.q(objB);
        wc8 wc8Var = this.b.d;
        jj9Var.label = 1;
        objB = tm7.B(wc8Var, jj9Var);
        if (objB == bw2Var) {
            return bw2Var;
        }
        lb8 lb8Var2 = (lb8) objB;
        hs3 hs3Var = xqa.P0;
        hj9 hj9Var = new hj9(hs3Var.a, hs3Var.b, null);
        nu4 nu4Var = nu4.a;
        zBooleanValue = ((Boolean) z5c.I(nu4Var, hj9Var)).booleanValue();
        hs3 hs3Var2 = xqa.N;
        if (((Boolean) z5c.I(nu4Var, new ize(hs3Var2.a, hs3Var2.b, null))).booleanValue()) {
            hs3 hs3Var3 = xqa.O;
            if (((Boolean) z5c.I(nu4Var, new jze(hs3Var3.a, hs3Var3.b, null))).booleanValue()) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        LocalDate localDate = e3b.a(this.c).toLocalDate();
        localDate.getClass();
        ma8 ma8Var = new ma8(localDate);
        string = ma8Var.toString();
        zK = uyb.k(this.a);
        hs3 hs3Var4 = xqa.W0;
        zBooleanValue2 = ((Boolean) z5c.I(nu4Var, new ij9(hs3Var4.a, hs3Var4.b, null))).booleanValue();
        y93 y93Var = y93.a;
        ?? r13 = y93.e() != null ? 1 : 0;
        ?? r8 = y93.h() != null ? 1 : 0;
        str = "Quin.TPEval";
        lj9 lj9Var2 = (lj9) z5c.I(nu4Var, new era(new aka(1), new lj9("", xu4.a), null));
        String str3 = lj9Var2.b;
        List list = lb8Var2.k;
        boolean z8 = lb8Var2.q;
        boolean zContains = list.contains(string);
        ma8 ma8Var2 = lb8Var2.o;
        if (ma8Var2 == null) {
            ma8Var2 = lb8Var2.m;
        }
        boolean zT = pa7.t(ma8Var2, ma8Var);
        hf8.Q.getClass();
        m8b m8bVarA = ef8.a(str);
        List list2 = lb8Var2.k;
        jj9 jj9Var2 = jj9Var;
        boolean z9 = lb8Var2.p;
        int i5 = lb8Var2.l;
        boolean zA3 = lj9Var2.a(1);
        boolean zA4 = lj9Var2.a(2);
        boolean zA5 = lj9Var2.a(3);
        boolean zA6 = lj9Var2.a(4);
        StringBuilder sbP = ib8.p("evaluate: isLegacy=", " tomorrowGuideCohort=", " sysOn=", zBooleanValue, z);
        ib8.w(sbP, zK, " msgOn=", zBooleanValue2, " todayReminderOn=");
        ib8.w(sbP, r13, " tomorrowReminderOn=", r8, " lastTp12Date=");
        ub3.v(sbP, str3, " today=", string, " firstDivDone=");
        ib8.w(sbP, z8, " divToday=", zContains, " divDates=");
        sbP.append(list2);
        sbP.append(" firstDailyDone=");
        sbP.append(z9);
        sbP.append(" dailyToday=");
        sbP.append(zT);
        sbP.append(" dailyCount=");
        sbP.append(i5);
        sbP.append(" tp1Shown=");
        ib8.w(sbP, zA3, " tp2Shown=", zA4, " tp3Shown=");
        sbP.append(zA5);
        sbP.append(" tp4Shown=");
        sbP.append(zA6);
        m8bVarA.e(sbP.toString());
        boolean zA7 = lj9Var2.a(1);
        if (zBooleanValue && !zA7 && !pa7.t(str3, string) && z8 && zContains && !(zK && zBooleanValue2)) {
            ef8.a(str).e("evaluate -> TP1");
            return new mj9(1, null);
        }
        boolean zA8 = lj9Var2.a(2);
        boolean zA9 = lj9Var2.a(4);
        jj9Var2.L$0 = lb8Var2;
        jj9Var2.L$1 = null;
        jj9Var2.L$2 = string;
        jj9Var2.L$3 = lj9Var2;
        jj9Var2.L$4 = str3;
        jj9Var2.Z$0 = zBooleanValue;
        jj9Var2.Z$1 = z;
        jj9Var2.Z$2 = zK;
        jj9Var2.Z$3 = zBooleanValue2;
        jj9Var2.I$0 = r13;
        jj9Var2.I$1 = r8;
        jj9Var2.Z$4 = zContains;
        jj9Var2.Z$5 = zT;
        jj9Var2.label = 2;
        Object objS = (z && zA8 && zA9 && !zK) ? this.d.s(jj9Var2) : Boolean.FALSE;
        objB = objS;
        if (objB == bw2Var) {
            return bw2Var;
        }
        lj9Var = lj9Var2;
        z2 = zT;
        r11 = r8;
        z3 = zContains;
        lb8Var = lb8Var2;
        str2 = str3;
        r12 = r13;
        if (((Boolean) objB).booleanValue()) {
            hf8.Q.getClass();
            ef8.a(str).e("evaluate -> launch-cohort tomorrow guide using TP2");
            return new mj9(2, d83.c);
        }
        if (r12 != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (r11 != 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        zA = lj9Var.a(2);
        d83Var = d83.b;
        if (!zA) {
            hf8.Q.getClass();
            ef8.a(str).e("evaluate -> TP2");
            return new mj9(2, d83Var);
        }
        boolean zA10 = lj9Var.a(3);
        if (!zBooleanValue) {
            hf8.Q.getClass();
            ef8.a(str).e("evaluate -> TP3");
            return new mj9(3, null);
        }
        if (r12 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (r11 != 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (lj9Var.a(4)) {
            hf8.Q.getClass();
            ef8.a(str).e("evaluate -> TP4");
            return new mj9(4, d83Var);
        }
        hf8.Q.getClass();
        ef8.a(str).e("evaluate -> null");
        return null;
    }
}
