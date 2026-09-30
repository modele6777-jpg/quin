package defpackage;

import ai.askquin.R;
import android.app.RemoteAction;
import android.view.textclassifier.TextClassification;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import tech.chatmind.api.events.model.UserPopupEvent;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z8d implements l26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ z8d(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:172:0x055b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:173:0x055d A[LOOP:3: B:160:0x0524->B:173:0x055d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:220:0x0560 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        Object objQ0;
        int i;
        int i2;
        int i3 = 8;
        qxc qxcVar = null;
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                o5c.e((lf0) this.b, (l46) obj, k99.P(1));
                return wef.a;
            case 1:
                egd egdVar = (egd) this.b;
                l46 l46Var = (l46) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (l46Var.W(iIntValue & 1, (iIntValue & 3) != 2)) {
                    p8c.j(0, l46Var, egdVar.a() == hgd.e);
                } else {
                    l46Var.Z();
                }
                return wef.a;
            case 2:
                rid ridVar = (rid) this.b;
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                for (ol9 ol9Var : ridVar.b) {
                    ol9Var.a.e(obj, Boolean.valueOf(zBooleanValue != pa7.t(ol9Var.a.a.get(obj), Boolean.TRUE)));
                }
                return wef.a;
            case 3:
                nkd nkdVar = (nkd) this.b;
                Set set = (Set) obj;
                synchronized (nkdVar.b) {
                    try {
                        x79 x79Var = nkdVar.e;
                        if (x79Var != null) {
                            Object[] objArr = x79Var.b;
                            long[] jArr = x79Var.a;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i4 = 0;
                                while (true) {
                                    long j = jArr[i4];
                                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i5 = 8 - ((~(i4 - length)) >>> 31);
                                        int i6 = 0;
                                        while (true) {
                                            if (i6 < i5) {
                                                if ((255 & j) >= 128 || !set.contains(objArr[(i4 << 3) + i6])) {
                                                    j >>= 8;
                                                    i6++;
                                                } else {
                                                    qxcVar = nkdVar.g;
                                                }
                                            } else if (i5 == 8) {
                                                if (i4 != length) {
                                                    i4++;
                                                }
                                            }
                                        }
                                    } else if (i4 != length) {
                                        i4++;
                                    }
                                }
                            }
                        } else if (s72.o0(set, nkdVar.c)) {
                            qxcVar = nkdVar.g;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (qxcVar != null) {
                    qxcVar.d(wef.a);
                }
                return wef.a;
            case 4:
                dmd dmdVar = (dmd) this.b;
                l46 l46Var2 = (l46) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (l46Var2.W(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    nte.b(afc.q(dmdVar.b(), l46Var2), null, 0L, 0L, null, null, 0L, null, new jme(3), 0L, 0, false, 0, 0, null, null, l46Var2, 0, 0, 261118);
                } else {
                    l46Var2.Z();
                }
                return wef.a;
            case 5:
                nsd nsdVar = (nsd) this.b;
                Set set2 = (Set) obj;
                AtomicReference atomicReference = nsdVar.b;
                while (true) {
                    Object obj3 = atomicReference.get();
                    if (obj3 == null) {
                        objQ0 = set2;
                    } else if (obj3 instanceof Set) {
                        objQ0 = t72.I(obj3, set2);
                    } else {
                        if (!(obj3 instanceof List)) {
                            wf2.b("Unexpected notification");
                            oo3.f();
                            return null;
                        }
                        objQ0 = s72.Q0((Collection) obj3, t72.H(set2));
                    }
                    do {
                        if (atomicReference.compareAndSet(obj3, objQ0)) {
                            if (nsdVar.c()) {
                                nsdVar.a.d(new hla(28, nsdVar));
                            }
                            return wef.a;
                        }
                    } while (atomicReference.get() == obj3);
                }
                break;
            case 6:
                char[] cArr = (char[]) this.b;
                CharSequence charSequence = (CharSequence) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                charSequence.getClass();
                int iP = v4e.P(charSequence, cArr, iIntValue3, false);
                if (iP < 0) {
                    return null;
                }
                return new iy9(Integer.valueOf(iP), 1);
            case 7:
                s69 s69Var = (s69) this.b;
                l46 l46Var3 = (l46) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (l46Var3.W(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    boolean zG = l46Var3.g(s69Var);
                    Object objR = l46Var3.R();
                    if (zG || objR == sf2.a) {
                        objR = new q50(s69Var, 13);
                        l46Var3.p0(objR);
                    }
                    cgg.m((x16) objR, jgb.Z(g09.a, new agb(i3)), false, null, null, ynb.q(12.0f, 0.0f, 2), db6.f, l46Var3, 817889280, 380);
                } else {
                    l46Var3.Z();
                }
                return wef.a;
            case 8:
                TextClassification textClassification = (TextClassification) this.b;
                l46 l46Var4 = (l46) obj;
                ((Integer) obj2).intValue();
                l46Var4.f0(950061013);
                String strValueOf = String.valueOf(textClassification.getLabel());
                l46Var4.r(false);
                return strValueOf;
            case 9:
                RemoteAction remoteAction = (RemoteAction) this.b;
                l46 l46Var5 = (l46) obj;
                ((Integer) obj2).intValue();
                l46Var5.f0(-1376593684);
                String string = remoteAction.getTitle().toString();
                l46Var5.r(false);
                return string;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                ((Integer) obj2).getClass();
                ((yte) this.b).a(k99.P(1), (l46) obj);
                return wef.a;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                d6f d6fVar = (d6f) this.b;
                l46 l46Var6 = (l46) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (l46Var6.W(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    g09 g09Var = g09.a;
                    j09 j09VarC0 = ynb.c0(g09Var, we6.e(l46Var6) ? 0.0f : 14.0f, 8.0f, 14.0f, 8.0f);
                    t7c t7cVarA = s7c.a(new uc0(6.0f, true, new qc0(false ? 1 : 0)), ndb.z, l46Var6, 54);
                    int iHashCode = Long.hashCode(l46Var6.T);
                    u8a u8aVarM = l46Var6.m();
                    j09 j09VarJ = m93.J(l46Var6, j09VarC0);
                    lf2.q.getClass();
                    ov7 ov7Var = LayoutNode.h1;
                    l46Var6.j0();
                    if (l46Var6.S) {
                        l46Var6.l(ov7Var);
                    } else {
                        l46Var6.s0();
                    }
                    dec.l(hj6.z, l46Var6, t7cVarA);
                    dec.l(hj6.y, l46Var6, u8aVarM);
                    dec.l(hj6.X, l46Var6, Integer.valueOf(iHashCode));
                    dec.k(l46Var6);
                    dec.l(hj6.x, l46Var6, j09VarJ);
                    v7c v7cVar = v7c.a;
                    int iOrdinal = d6fVar.ordinal();
                    if (iOrdinal == 1) {
                        l46Var6.f0(943559987);
                        axa.a(2.0f, 0.0f, 0, 390, 56, ((e8b) l46Var6.k(l8b.a)).r, 0L, l46Var6, b.l(g09Var, 16.0f));
                        l46Var6 = l46Var6;
                        l46Var6.r(false);
                    } else if (iOrdinal == 2) {
                        l46Var6.f0(943762200);
                        q3c.e(b.l(g09Var, 16.0f), l46Var6, 54);
                        l46Var6.r(false);
                    } else if (iOrdinal != 3) {
                        l46Var6.f0(944153327);
                        gu6.b(od4.A(R.drawable.volume_up, 0, l46Var6), null, b.l(g09Var, 16.0f), ((e8b) l46Var6.k(l8b.a)).r, l46Var6, 440, 0);
                        l46Var6.r(false);
                    } else {
                        l46Var6.f0(943920858);
                        gu6.a(af1.X(), null, b.l(g09Var, 16.0f), ((e8b) l46Var6.k(l8b.a)).r, l46Var6, 432, 0);
                        l46Var6.r(false);
                    }
                    l46 l46Var7 = l46Var6;
                    m93.c(v7cVar, d6fVar != d6f.c, null, rw4.f(null, 3), rw4.g(null, 3), null, pa7.d, l46Var7, 1600518, 18);
                    l46Var7.r(true);
                } else {
                    l46Var6.Z();
                }
                return wef.a;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                g09 g09Var2 = g09.a;
                w6f w6fVar = (w6f) this.b;
                l46 l46Var8 = (l46) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (!l46Var8.W(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    l46Var8.Z();
                } else if (w6fVar.b == d6f.c) {
                    l46Var8.f0(358128399);
                    gu6.a(ok8.y(), null, b.l(g09Var2, 28.0f), y72.e, l46Var8, 3504, 0);
                    l46Var8.r(false);
                } else {
                    l46Var8.f0(358375531);
                    gu6.a(af1.X(), null, b.l(g09Var2, 28.0f), y72.e, l46Var8, 3504, 0);
                    l46Var8.r(false);
                }
                return wef.a;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                ((nd8) this.b).d(obj);
                return wef.a;
            case 14:
                pu1 pu1Var = (pu1) this.b;
                l46 l46Var9 = (l46) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (l46Var9.W(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    j09 j09VarC = b.c(g09.a, 1.0f);
                    xn8 xn8VarC = s21.c(ndb.f, false);
                    int iHashCode2 = Long.hashCode(l46Var9.T);
                    u8a u8aVarM2 = l46Var9.m();
                    j09 j09VarJ2 = m93.J(l46Var9, j09VarC);
                    lf2.q.getClass();
                    ov7 ov7Var2 = LayoutNode.h1;
                    l46Var9.j0();
                    if (l46Var9.S) {
                        l46Var9.l(ov7Var2);
                    } else {
                        l46Var9.s0();
                    }
                    dec.l(hj6.z, l46Var9, xn8VarC);
                    dec.l(hj6.y, l46Var9, u8aVarM2);
                    dec.l(hj6.X, l46Var9, Integer.valueOf(iHashCode2));
                    dec.k(l46Var9);
                    dec.l(hj6.x, l46Var9, j09VarJ2);
                    pu1Var.getClass();
                    int iOrdinal2 = pu1Var.ordinal();
                    if (iOrdinal2 == 0) {
                        i = 185422352;
                        i2 = R.string.career_middle_high_school_student;
                    } else if (iOrdinal2 == 1) {
                        i = 185418693;
                        i2 = R.string.career_college_student;
                    } else if (iOrdinal2 == 2) {
                        i = 185412668;
                        i2 = R.string.career_worker;
                    } else {
                        if (iOrdinal2 != 3) {
                            ap.c();
                            return null;
                        }
                        i = 185415647;
                        i2 = R.string.career_freelance;
                    }
                    String strI = tec.i(l46Var9, i, i2, l46Var9, false);
                    mue mueVar = pue.a;
                    nte.b(strI, null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, pue.e(l46Var9), l46Var9, 0, 0, 131070);
                    l46Var9.r(true);
                } else {
                    l46Var9.Z();
                }
                return wef.a;
            case 15:
                Instant instant = (Instant) this.b;
                List list = (List) obj2;
                ((String) obj).getClass();
                list.getClass();
                ArrayList arrayList = new ArrayList();
                for (Object obj4 : list) {
                    if (((UserPopupEvent) obj4).getEndAt().toInstant().isAfter(instant)) {
                        arrayList.add(obj4);
                    }
                }
                return arrayList;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                ((Integer) obj2).getClass();
                v2c.l((u4g) this.b, (l46) obj, k99.P(1));
                return wef.a;
            case 17:
                ((Integer) obj2).getClass();
                v2c.a((s4g) this.b, (l46) obj, k99.P(1));
                return wef.a;
            case 18:
                ((Integer) obj2).getClass();
                v2c.e((t4g) this.b, (l46) obj, k99.P(1));
                return wef.a;
            case 19:
                return new w67(((long) ((jx0) this.b).a(0, (int) (((e77) obj).a >> 32), (cv7) obj2)) << 32);
            case 20:
                return new w67(((long) ((kx0) this.b).a(0, (int) (((e77) obj).a & 4294967295L))) & 4294967295L);
            default:
                return new w67(((yi) this.b).a(0L, ((e77) obj).a, (cv7) obj2));
        }
    }

    public /* synthetic */ z8d(Object obj, int i, int i2) {
        this.a = i2;
        this.b = obj;
    }
}
