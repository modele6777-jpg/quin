package defpackage;

import android.view.Choreographer;
import android.view.InputDevice;
import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class d5 implements a26 {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public /* synthetic */ d5(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:266:0x0613 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:267:0x0615  */
    /* JADX WARN: Code duplicated, block: B:283:0x065c  */
    /* JADX WARN: Code duplicated, block: B:8:0x0030  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.a26
    public final Object d(Object obj) {
        y22 y22VarM;
        wf7 wf7Var;
        InputConnection inputConnection;
        long j;
        Class<?> cls;
        ssg ssgVarP;
        Class<?> cls2;
        String str;
        int i = 2;
        boolean zH = true;
        byte b = 0;
        b68 b68VarJ = null;
        switch (this.a) {
            case 0:
                xs6 xs6Var = (xs6) this.b;
                szc szcVar = (szc) xs6Var.d;
                f5 f5Var = (f5) this.c;
                obj.getClass();
                xt7 xt7Var = f5Var.a;
                u00 u00Var = (u00) obj;
                if (u00Var instanceof ox7) {
                    Object obj2 = szcVar.b;
                    if (!((ox7) u00Var).g && ((y00) xs6Var.e) != y00.TYPE_PARAMETER_BOUNDS) {
                        if (xt7Var != null) {
                            t99 t99Var = xr7.e;
                            y22VarM = ((tt7) xt7Var).c0().m();
                            if (y22VarM != null || xr7.s(y22VarM) == null) {
                                zH = false;
                            } else {
                                Object obj3 = szcVar.b;
                                LinkedHashMap linkedHashMap = b10.c;
                                Object objD = b10.d(u00Var, syd.t);
                                if (objD == null) {
                                    zH = false;
                                } else {
                                    ArrayList arrayListA = b10.a(objD, false);
                                    if (arrayListA.isEmpty()) {
                                        zH = false;
                                    } else {
                                        Iterator it = arrayListA.iterator();
                                        while (it.hasNext()) {
                                            if (pa7.t((String) it.next(), "TYPE")) {
                                                Object obj4 = szcVar.b;
                                            }
                                        }
                                        zH = false;
                                    }
                                }
                            }
                        } else {
                            zH = false;
                        }
                    }
                } else if (xt7Var != null) {
                    t99 t99Var2 = xr7.e;
                    y22VarM = ((tt7) xt7Var).c0().m();
                    if (y22VarM != null) {
                        zH = false;
                    } else {
                        zH = false;
                    }
                } else {
                    zH = false;
                }
                return Boolean.valueOf(zH);
            case 1:
                q7f q7fVar = (q7f) this.b;
                wf7[] wf7VarArr = (wf7[]) this.c;
                int iIntValue = ((Number) obj).intValue();
                if (q7fVar == null || (wf7Var = (wf7) q7fVar.a.get(Integer.valueOf(iIntValue))) == null) {
                    return (iIntValue < 0 || iIntValue >= wf7VarArr.length) ? wf7.f : wf7VarArr[iIntValue];
                }
                return wf7Var;
            case 2:
                l47 l47Var = (l47) this.b;
                synchronized (l47Var.c) {
                    try {
                        l47Var.e = true;
                        p89 p89Var = l47Var.d;
                        Object[] objArr = p89Var.a;
                        int i2 = p89Var.c;
                        for (int i3 = 0; i3 < i2; i3++) {
                            wj9 wj9Var = (wj9) ((g0g) objArr[i3]).get();
                            if (wj9Var != null && (inputConnection = wj9Var.b) != null) {
                                inputConnection.closeConnection();
                                wj9Var.b = null;
                            }
                        }
                        l47Var.d.g();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                gte gteVar = ((iu) this.c).b;
                gteVar.b.set(null);
                gteVar.a.c();
                return wef.a;
            case 3:
                mw mwVar = (mw) this.b;
                nw nwVar = (nw) this.c;
                synchronized (mwVar.e) {
                    mwVar.g.remove(nwVar);
                }
                return wef.a;
            case 4:
                ((Choreographer) ((ow) this.b).b).removeFrameCallback((nw) this.c);
                return wef.a;
            case 5:
                KeyEvent keyEvent = ((mo7) obj).a;
                e89 e89Var = (e89) this.c;
                if (!((h0f) ((d0f) this.b)).b()) {
                    e89Var.setValue(Boolean.FALSE);
                }
                return Boolean.FALSE;
            case 6:
                x16 x16Var = (x16) obj;
                x16Var.getClass();
                ((l26) this.b).z(((bod) this.c).a, x16Var);
                return wef.a;
            case 7:
                return ((wu0) this.b).d(((List) this.c).get(((Number) obj).intValue()));
            case 8:
                KeyEvent keyEvent2 = ((mo7) obj).a;
                if (((r38) this.b).a() == ug6.b && keyEvent2.getKeyCode() == 4 && nk8.r(keyEvent2) == 1) {
                    ((cre) this.c).d(null);
                } else {
                    zH = false;
                }
                return Boolean.valueOf(zH);
            case 9:
                return ((i73) this.b).d(((List) this.c).get(((Number) obj).intValue()));
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                szc szcVar2 = (szc) this.b;
                d04 d04Var = (d04) this.c;
                lp0 lp0Var = d04Var.z;
                t99 t99Var3 = (t99) obj;
                t99Var3.getClass();
                yya yyaVar = (yya) ((LinkedHashMap) szcVar2.b).get(t99Var3);
                if (yyaVar != null) {
                    return qx4.u0(((tz3) lp0Var.b).a, d04Var, t99Var3, (ee8) szcVar2.d, new uz3(((tz3) lp0Var.b).a, new n5(d04Var, yyaVar, b == true ? 1 : 0, 9)), ntd.T);
                }
                return null;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                int iIntValue2 = ((Number) obj).intValue();
                return ((sz5) this.b).z(Integer.valueOf(iIntValue2), ((List) this.c).get(iIntValue2));
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                ord ordVar = (ord) obj;
                synchronized (qrd.c) {
                    j = qrd.e;
                    qrd.e = 1 + j;
                }
                return new c89(j, ordVar, (a26) this.b, (a26) this.c);
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                int iIntValue3 = ((Number) obj).intValue();
                return ((sz5) this.b).z(Integer.valueOf(iIntValue3), ((List) this.c).get(iIntValue3));
            case 14:
                return ((oz5) this.b).d(((List) this.c).get(((Number) obj).intValue()));
            case 15:
                return ((oz5) this.b).d(((List) this.c).get(((Number) obj).intValue()));
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                return ((tk6) this.b).d(((List) this.c).get(((Number) obj).intValue()));
            case 17:
                return ((tk6) this.b).d(((List) this.c).get(((Number) obj).intValue()));
            case 18:
                return ((tk6) this.b).d(((List) this.c).get(((Number) obj).intValue()));
            case 19:
                return ((tb7) this.b).d(((Object[]) this.c)[((Number) obj).intValue()]);
            case 20:
                zi0 zi0Var = (zi0) this.b;
                Object obj5 = zi0Var.b;
                pl1 pl1Var = (pl1) this.c;
                synchronized (obj5) {
                    ((ArrayList) zi0Var.c).remove(pl1Var);
                }
                return wef.a;
            case 21:
                wx7 wx7Var = (wx7) this.b;
                szc szcVar3 = (szc) this.c;
                t99 t99Var4 = (t99) obj;
                t99Var4.getClass();
                ee8 ee8Var = wx7Var.r;
                u09 u09Var = wx7Var.n;
                if (!((Set) ee8Var.invoke()).contains(t99Var4)) {
                    if (!((Set) wx7Var.s.invoke()).contains(t99Var4)) {
                        lnb lnbVar = (lnb) ((Map) wx7Var.t.invoke()).get(t99Var4);
                        if (lnbVar == null) {
                            return null;
                        }
                        ge8 ge8Var = ((mf7) szcVar3.b).a;
                        return qx4.u0(ge8Var, wx7Var.n, t99Var4, new ee8(ge8Var, new tx7(wx7Var, i)), kn2.V(szcVar3, lnbVar), m8c.B(lnbVar));
                    }
                    c78 c78VarW = t72.w();
                    u09Var.getClass();
                    szcVar3.getClass();
                    c78 c78VarN = c78VarW.n();
                    int iC = c78VarN.c();
                    if (iC == 0) {
                        return null;
                    }
                    if (iC == 1) {
                        return (u09) s72.X0(c78VarN);
                    }
                    ho7.w(c78VarN, "Multiple classes with same name are generated: ");
                    return null;
                }
                fnb fnbVar = ((mf7) szcVar3.b).b;
                j22 j22VarF = qz3.f(u09Var);
                j22VarF.getClass();
                j22 j22VarD = j22VarF.d(t99Var4);
                dx5 dx5Var = j22VarD.a;
                String strZ = c5e.z(j22VarD.b.a.a, '.', '$');
                if (!dx5Var.a.c()) {
                    strZ = dx5Var.a.a + '.' + strZ;
                }
                try {
                    cls = Class.forName(strZ, false, (ClassLoader) fnbVar.a);
                    break;
                } catch (ClassNotFoundException unused) {
                    cls = null;
                }
                enb enbVar = cls != null ? new enb(cls) : null;
                if (enbVar != null) {
                    return new rx7(szcVar3, u09Var, enbVar, null);
                }
                return null;
            case 22:
                hjd hjdVar = (hjd) this.b;
                wx7 wx7Var2 = (wx7) this.c;
                t99 t99Var5 = (t99) obj;
                t99Var5.getClass();
                return pa7.t(hjdVar.getName(), t99Var5) ? t72.H(hjdVar) : s72.Q0(wx7Var2.N(t99Var5), wx7Var2.O(t99Var5));
            case 23:
                ey7 ey7Var = (ey7) this.b;
                szc szcVar4 = ey7Var.b;
                szc szcVar5 = (szc) this.c;
                ay7 ay7Var = (ay7) obj;
                ay7Var.getClass();
                yx7 yx7Var = ey7Var.o;
                dx5 dx5Var2 = yx7Var.f;
                t99 t99Var6 = ay7Var.a;
                dx5Var2.getClass();
                ex5 ex5Var = dx5Var2.a;
                t99Var6.getClass();
                dx5 dx5Var3 = dx5.c;
                ex5 ex5Var2 = cn1.V(t99Var6).a;
                ex5Var2.c();
                String str2 = ex5Var2.a;
                enb enbVar2 = ay7Var.b;
                mf7 mf7Var = (mf7) szcVar5.b;
                if (enbVar2 != null) {
                    g5b g5bVar = mf7Var.c;
                    ((mf7) szcVar4.b).d.c().c.getClass();
                    fv8.g.getClass();
                    dx5 dx5VarC = enbVar2.c();
                    ssgVarP = (dx5VarC == null || (str = dx5VarC.a.a) == null) ? null : g5bVar.p(str);
                } else {
                    g5b g5bVar2 = mf7Var.c;
                    ((mf7) szcVar4.b).d.c().c.getClass();
                    fv8.g.getClass();
                    String strZ2 = c5e.z(str2, '.', '$');
                    if (!ex5Var.c()) {
                        strZ2 = dx5Var2 + '.' + strZ2;
                    }
                    ssgVarP = g5bVar2.p(strZ2);
                }
                cob cobVar = ssgVarP != null ? (cob) ssgVarP.b : null;
                j22 j22VarA = cobVar != null ? smb.a(cobVar.a) : null;
                if (j22VarA != null && (j22VarA.g() || j22VarA.c)) {
                    return null;
                }
                Object by7Var = cy7.r;
                if (cobVar != null) {
                    if (cobVar.b.a == yr7.CLASS) {
                        h04 h04Var = ((mf7) szcVar4.b).d;
                        a22 a22VarG = h04Var.g(cobVar);
                        u09 u09VarA = a22VarG == null ? null : h04Var.c().t.a(smb.a(cobVar.a), a22VarG);
                        if (u09VarA != null) {
                            by7Var = new by7(u09VarA);
                        }
                    } else {
                        by7Var = dy7.r;
                    }
                }
                if (by7Var instanceof by7) {
                    return ((by7) by7Var).r;
                }
                if (by7Var instanceof dy7) {
                    return null;
                }
                if (!(by7Var instanceof cy7)) {
                    ap.c();
                    return null;
                }
                if (enbVar2 == null) {
                    fnb fnbVar2 = mf7Var.b;
                    String strZ3 = c5e.z(str2, '.', '$');
                    if (!ex5Var.c()) {
                        strZ3 = ex5Var.a + '.' + strZ3;
                    }
                    try {
                        cls2 = Class.forName(strZ3, false, (ClassLoader) fnbVar2.a);
                    } catch (ClassNotFoundException unused2) {
                        cls2 = null;
                    }
                    enbVar2 = cls2 != null ? new enb(cls2) : null;
                    break;
                }
                dx5 dx5VarC2 = enbVar2 != null ? enbVar2.c() : null;
                if (dx5VarC2 == null || dx5VarC2.a.c() || !dx5VarC2.b().equals(yx7Var.f)) {
                    return null;
                }
                return new rx7(szcVar5, yx7Var, enbVar2, null);
            case 24:
                ya2 ya2Var = (ya2) this.b;
                dj8 dj8Var = (dj8) this.c;
                if (pa7.t(ya2Var, dj8Var.h)) {
                    dj8Var.h = null;
                }
                return wef.a;
            case 25:
                ea1 ea1Var = (ea1) obj;
                x57 x57Var = (x57) this.b;
                ea1 ea1Var2 = (ea1) this.c;
                ea1Var.getClass();
                x57Var.I(ea1Var2, ea1Var);
                return wef.a;
            case 26:
                sn4 sn4Var = (sn4) obj;
                sn4Var.getClass();
                li6 li6Var = (li6) this.b;
                xh6 xh6Var = ((ogc) this.c).a;
                b68 b68Var = xh6Var.T0;
                if (b68Var == null) {
                    ci6 ci6Var = xh6Var.Y0;
                    if (ci6Var != null) {
                        b68VarJ = urg.j(ci6Var);
                    }
                } else {
                    b68VarJ = b68Var;
                }
                eb3.J(sn4Var, li6Var, xh6Var, 0L, sn4Var.f(), b68VarJ);
                return wef.a;
            case 27:
                return ((pdc) this.b).d(((List) this.c).get(((Number) obj).intValue()));
            case 28:
                KeyEvent keyEvent3 = ((mo7) obj).a;
                xn5 xn5Var = (xn5) this.b;
                InputDevice device = keyEvent3.getDevice();
                if (device == null || !device.supportsSource(513) || ((device.isVirtual() && keyEvent3.getSource() != 33554433) || nk8.r(keyEvent3) != 2 || keyEvent3.getSource() == 257)) {
                    zH = false;
                } else if (eec.r(19, keyEvent3)) {
                    zH = ((bo5) xn5Var).h(5, true);
                } else if (eec.r(20, keyEvent3)) {
                    zH = ((bo5) xn5Var).h(6, true);
                } else if (eec.r(21, keyEvent3)) {
                    zH = ((bo5) xn5Var).h(3, true);
                } else if (eec.r(22, keyEvent3)) {
                    zH = ((bo5) xn5Var).h(4, true);
                } else if (eec.r(23, keyEvent3)) {
                    vsd vsdVar = ((r38) this.c).c;
                    if (vsdVar != null) {
                        ((dw3) vsdVar).b();
                    }
                } else {
                    zH = false;
                }
                return Boolean.valueOf(zH);
            default:
                ((z2f) this.b).a.h.j((xv) this.c);
                return wef.a;
        }
    }
}
