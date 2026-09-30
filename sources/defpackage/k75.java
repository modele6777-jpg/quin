package defpackage;

import ai.askquin.model.TarotSkinIdentify;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import tech.chatmind.api.ArcanaGroup;
import tech.chatmind.api.dailycard.model.DailyCard;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class k75 extends ewf {
    public final d43 b;
    public final gd8 c;
    public final o9 d;
    public final cmd e;
    public final xof f;
    public final gpf g;
    public final s0e v;
    public final whb w;
    public final s0e x;
    public final whb y;
    public final whb z;

    public k75(TarotSkinIdentify tarotSkinIdentify, nb4 nb4Var, s7 s7Var, d43 d43Var, gd8 gd8Var, o9 o9Var, cmd cmdVar, xof xofVar, gpf gpfVar) {
        this.b = d43Var;
        this.c = gd8Var;
        this.d = o9Var;
        this.e = cmdVar;
        this.f = xofVar;
        this.g = gpfVar;
        ArcanaGroup arcanaGroup = ArcanaGroup.Major;
        qu4 qu4Var = qu4.a;
        pu4 pu4Var = pu4.a;
        s0e s0eVarA = t0e.a(new t65(tarotSkinIdentify, arcanaGroup, 0, pu4Var, qu4Var, null));
        this.v = s0eVarA;
        this.w = if9.n(s0eVarA);
        s0e s0eVarA2 = t0e.a(null);
        this.x = s0eVarA2;
        whb whbVarF = if9.F(am5.a(s7.b(), new f75(null, nb4Var, this)), hwf.a(this), med.a(), pu4Var);
        int i = 0;
        this.y = if9.F(new wm5(dj6.I(new hl5(s0eVarA2, 1)), whbVarF, new c75(3, null), i), hwf.a(this), med.a(), 0);
        this.z = if9.F(new tm5(new wj5[]{dj6.I(new hl5(s0eVarA2, 1)), dj6.I(new j75(s0eVarA)), whbVarF}, new d75(4, null), i), hwf.a(this), med.a(), 0);
        ok8.C(new kl5(o9Var.a.b, new v65(this, null), 1), hwf.a(this));
        ok8.C(new kl5(((ys3) cmdVar).v, new w65(this, null), 1), hwf.a(this));
        ynb.V(hwf.a(this), null, null, new x65(this, null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:40:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:42:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:46:0x010e A[LOOP:0: B:44:0x0108->B:46:0x010e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:53:0x014f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(zn2 zn2Var) {
        y65 y65Var;
        String strName;
        Object objB;
        String str;
        List list;
        int iF;
        LinkedHashMap linkedHashMap;
        Iterator it;
        Object objH;
        if (zn2Var instanceof y65) {
            y65Var = (y65) zn2Var;
            int i = y65Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                y65Var.label = i - Integer.MIN_VALUE;
            } else {
                y65Var = new y65(this, zn2Var);
            }
        } else {
            y65Var = new y65(this, zn2Var);
        }
        Object objB2 = y65Var.result;
        int i2 = y65Var.label;
        gd8 gd8Var = this.c;
        bw2 bw2Var = bw2.a;
        if (i2 == 0) {
            jzb.q(objB2);
            wc8 wc8Var = gd8Var.d;
            y65Var.label = 1;
            objB2 = tm7.B(wc8Var, y65Var);
            if (objB2 != bw2Var) {
            }
            return bw2Var;
        }
        if (i2 == 1) {
            jzb.q(objB2);
        } else {
            if (i2 == 2) {
                jzb.q(objB2);
                strName = ((yof) objB2).g.name();
                ma8 ma8Var = f63.a;
                th5 th5Var = cye.b;
                wj5 wj5VarA = d43.a(this.b, ma8Var, gcc.E(z57.a.a(), fbc.d()).a());
                y65Var.L$0 = null;
                y65Var.L$1 = null;
                y65Var.L$2 = strName;
                y65Var.label = 3;
                objB = tm7.B(wj5VarA, y65Var);
                if (objB != bw2Var) {
                    objB2 = objB;
                    str = strName;
                    list = (List) objB2;
                    if (!list.isEmpty()) {
                        iF = bm8.F(t72.u(list, 10));
                        if (iF < 16) {
                            iF = 16;
                        }
                        linkedHashMap = new LinkedHashMap(iF);
                        it = list.iterator();
                        while (it.hasNext()) {
                            iy9 iy9Var = new iy9(((DailyCard) it.next()).getDate(), str);
                            linkedHashMap.put(iy9Var.d(), iy9Var.e());
                        }
                        y65Var.L$0 = null;
                        y65Var.L$1 = null;
                        y65Var.L$2 = null;
                        y65Var.L$3 = null;
                        y65Var.L$4 = null;
                        y65Var.label = 4;
                        if (gd8Var.b(linkedHashMap, y65Var) != bw2Var) {
                        }
                    }
                    return wef.a;
                }
                return bw2Var;
            }
            if (i2 == 3) {
                str = (String) y65Var.L$2;
                jzb.q(objB2);
                list = (List) objB2;
                if (!list.isEmpty()) {
                    iF = bm8.F(t72.u(list, 10));
                    if (iF < 16) {
                        iF = 16;
                    }
                    linkedHashMap = new LinkedHashMap(iF);
                    it = list.iterator();
                    while (it.hasNext()) {
                        iy9 iy9Var2 = new iy9(((DailyCard) it.next()).getDate(), str);
                        linkedHashMap.put(iy9Var2.d(), iy9Var2.e());
                    }
                    y65Var.L$0 = null;
                    y65Var.L$1 = null;
                    y65Var.L$2 = null;
                    y65Var.L$3 = null;
                    y65Var.L$4 = null;
                    y65Var.label = 4;
                    if (gd8Var.b(linkedHashMap, y65Var) != bw2Var) {
                    }
                    return bw2Var;
                }
                return wef.a;
            }
            if (i2 != 4) {
                if (i2 != 5) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                jzb.q(objB2);
                return objB2;
            }
            jzb.q(objB2);
        }
        y65Var.L$0 = null;
        y65Var.L$1 = null;
        y65Var.L$2 = null;
        y65Var.L$3 = null;
        y65Var.L$4 = null;
        y65Var.label = 5;
        objH = gd8Var.h(y65Var);
        if (objH != bw2Var) {
            return bw2Var;
        }
        return objH;
        if (!((lb8) objB2).v) {
            wj5 wj5Var = this.d.a.b;
            y65Var.L$0 = null;
            y65Var.label = 2;
            objB2 = tm7.B(wj5Var, y65Var);
            if (objB2 != bw2Var) {
                strName = ((yof) objB2).g.name();
                ma8 ma8Var2 = f63.a;
                th5 th5Var2 = cye.b;
                wj5 wj5VarA2 = d43.a(this.b, ma8Var2, gcc.E(z57.a.a(), fbc.d()).a());
                y65Var.L$0 = null;
                y65Var.L$1 = null;
                y65Var.L$2 = strName;
                y65Var.label = 3;
                objB = tm7.B(wj5VarA2, y65Var);
                if (objB != bw2Var) {
                    objB2 = objB;
                    str = strName;
                    list = (List) objB2;
                    if (!list.isEmpty()) {
                        iF = bm8.F(t72.u(list, 10));
                        if (iF < 16) {
                            iF = 16;
                        }
                        linkedHashMap = new LinkedHashMap(iF);
                        it = list.iterator();
                        while (it.hasNext()) {
                            iy9 iy9Var3 = new iy9(((DailyCard) it.next()).getDate(), str);
                            linkedHashMap.put(iy9Var3.d(), iy9Var3.e());
                        }
                        y65Var.L$0 = null;
                        y65Var.L$1 = null;
                        y65Var.L$2 = null;
                        y65Var.L$3 = null;
                        y65Var.L$4 = null;
                        y65Var.label = 4;
                        if (gd8Var.b(linkedHashMap, y65Var) != bw2Var) {
                            y65Var.L$0 = null;
                            y65Var.L$1 = null;
                            y65Var.L$2 = null;
                            y65Var.L$3 = null;
                            y65Var.L$4 = null;
                            y65Var.label = 5;
                            objH = gd8Var.h(y65Var);
                            if (objH != bw2Var) {
                                return objH;
                            }
                        }
                    }
                }
            }
            return bw2Var;
        }
        return wef.a;
    }

    public final void g(int i) {
        s0e s0eVar;
        Object value;
        ArcanaGroup arcanaGroupS = nk8.s(i);
        int iT = i - nk8.t(arcanaGroupS);
        do {
            s0eVar = this.v;
            value = s0eVar.getValue();
        } while (!s0eVar.l(value, t65.a((t65) value, null, arcanaGroupS, iT, null, null, null, 57)));
    }
}
