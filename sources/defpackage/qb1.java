package defpackage;

import ai.askquin.data.InAppMessageUiModel;
import ai.askquin.model.TarotSkinIdentify;
import ai.askquin.ui.account.component.AuthOption;
import android.content.Context;
import android.graphics.Rect;
import android.util.Log;
import androidx.compose.material.ripple.RippleNode;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class qb1 implements xj5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ qb1(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.xj5
    public final Object a(Object obj, xn2 xn2Var) throws Exception {
        float f = 0.0f;
        int i = 1;
        switch (this.a) {
            case 0:
                String str = ((ig1) obj).a;
                wef wefVar = wef.a;
                if (pa7.t(str, (String) this.b)) {
                    Log.d("CXCP", ((Object) ig1.b(str)) + " has become available! Notifying listeners...");
                    Iterator it = ((ub1) this.c).b.iterator();
                    it.getClass();
                    while (it.hasNext()) {
                        ((za2) ((ya2) it.next())).R(wefVar);
                    }
                }
                return wefVar;
            case 1:
                yi1 yi1Var = (yi1) obj;
                if (!(yi1Var instanceof dj1)) {
                    if (yi1Var instanceof cj1) {
                        ((qo1) ((mmb) this.b).element).n();
                    } else if (yi1Var instanceof bj1) {
                        ((qo1) ((mmb) this.b).element).n();
                        gc1 gc1Var = (gc1) this.c;
                        bj1 bj1Var = (bj1) yi1Var;
                        synchronized (gc1Var.q) {
                            try {
                                if (!gc1Var.c()) {
                                    nf1 nf1Var = bj1Var.i;
                                    if (nf1Var != null) {
                                        gc1Var.u = nf1Var;
                                        int i2 = nf1Var.a;
                                        if (i2 == 6 || i2 == 1 || i2 == 2) {
                                            gc1Var.s = gf1.r;
                                            Log.d("CXCP", gc1Var + " is disconnected");
                                        } else {
                                            gc1Var.s = gf1.s;
                                            Log.d("CXCP", gc1Var + " encountered error: " + ((Object) nf1.a(bj1Var.i.a)));
                                        }
                                    } else {
                                        gc1Var.s = gf1.u;
                                    }
                                    gc1Var.f.l();
                                    gc1Var.g();
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    break;
                } else {
                    qo1 qo1Var = (qo1) ((mmb) this.b).element;
                    lf1 lf1Var = ((dj1) yi1Var).a;
                    synchronized (qo1Var.k) {
                        ho1 ho1Var = qo1Var.u;
                        if (ho1Var != ho1.d && ho1Var != ho1.e) {
                            qo1Var.q = lf1Var;
                            ynb.V(qo1Var.i, null, null, new io1(qo1Var, null), 3);
                        }
                        break;
                    }
                }
                return wef.a;
            case 2:
                iy9 iy9Var = (iy9) obj;
                wy6 wy6Var = (wy6) iy9Var.a();
                lq0 lq0Var = (lq0) iy9Var.b();
                xva xvaVar = (xva) this.b;
                wae waeVar = (wae) this.c;
                int i3 = lq0Var.b;
                boolean z = lq0Var.f;
                Rect rect = lq0Var.a;
                ((yva) xvaVar).setValue(new axf(waeVar, wy6Var, new t2f(rect.left, rect.top, rect.right, rect.bottom, i3, z)));
                return wef.a;
            case 3:
                int iIntValue = ((Number) obj).intValue();
                List list = (List) this.b;
                float f2 = xj3.e;
                TarotSkinIdentify tarotSkinIdentify = list.isEmpty() ? null : (TarotSkinIdentify) list.get(iIntValue % list.size());
                if (tarotSkinIdentify != null) {
                    ((a26) this.c).d(tarotSkinIdentify);
                }
                return wef.a;
            case 4:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                imb imbVar = (imb) this.b;
                if (zBooleanValue) {
                    imbVar.element = true;
                } else if (imbVar.element) {
                    imbVar.element = false;
                    ((x16) this.c).invoke();
                }
                return wef.a;
            case 5:
                LinkedHashMap linkedHashMap = (LinkedHashMap) this.b;
                v07 v07Var = (v07) this.c;
                Iterator it2 = ((List) obj).iterator();
                while (it2.hasNext()) {
                    InAppMessageUiModel inAppMessageUiModel = (InAppMessageUiModel) linkedHashMap.get(it2.next());
                    if (inAppMessageUiModel != null) {
                        String messageId = inAppMessageUiModel.getMessageId();
                        v07Var.getClass();
                        messageId.getClass();
                        if (!v4e.Q(messageId) && v07Var.a.add(messageId)) {
                            x1f x1fVar = x1f.a;
                            x1f.h("element_show", m1f.a, new wz6(inAppMessageUiModel, i));
                        }
                    }
                }
                return wef.a;
            case 6:
                l77 l77Var = (l77) obj;
                ArrayList arrayList = (ArrayList) this.b;
                if (l77Var instanceof rn5) {
                    arrayList.add(l77Var);
                } else if (l77Var instanceof sn5) {
                    arrayList.remove(((sn5) l77Var).a);
                }
                boolean z2 = !arrayList.isEmpty();
                x17 x17Var = (x17) this.c;
                if (z2 != x17Var.J0) {
                    x17Var.J0 = z2;
                    x17Var.o1();
                }
                return wef.a;
            case 7:
                l77 l77Var2 = (l77) obj;
                r68 r68Var = (r68) this.c;
                i79 i79Var = (i79) this.b;
                if ((l77Var2 instanceof yq6) || (l77Var2 instanceof rn5) || (l77Var2 instanceof pta)) {
                    i79Var.h(l77Var2);
                } else if (l77Var2 instanceof zq6) {
                    i79Var.l(((zq6) l77Var2).a);
                } else if (l77Var2 instanceof sn5) {
                    i79Var.l(((sn5) l77Var2).a);
                } else if (l77Var2 instanceof qta) {
                    i79Var.l(((qta) l77Var2).a);
                } else if (l77Var2 instanceof ota) {
                    i79Var.l(((ota) l77Var2).a);
                }
                Object[] objArr = i79Var.a;
                int i4 = i79Var.b;
                int i5 = 0;
                for (int i6 = 0; i6 < i4; i6++) {
                    l77 l77Var3 = (l77) objArr[i6];
                    if (l77Var3 instanceof yq6) {
                        r68Var.getClass();
                        i5 |= 2;
                    } else if (l77Var3 instanceof rn5) {
                        r68Var.getClass();
                        i5 |= 1;
                    } else if (l77Var3 instanceof pta) {
                        r68Var.getClass();
                        i5 |= 4;
                    }
                }
                r68Var.b.k(i5);
                return wef.a;
            case 8:
                ((e89) this.b).setValue(Boolean.TRUE);
                ((qz9) ((n69) this.c)).k(((wr0) obj).c);
                return wef.a;
            case 9:
                if (((Boolean) obj).booleanValue() && ((Boolean) ((x16) this.b).invoke()).booleanValue()) {
                    ((x16) this.c).invoke();
                }
                return wef.a;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                float fFloatValue = ((Number) obj).floatValue();
                jmb jmbVar = (jmb) this.b;
                float f3 = fFloatValue - jmbVar.element;
                if (f3 > 0.0f) {
                    ((j18) this.c).e(f3);
                }
                jmbVar.element = fFloatValue;
                return wef.a;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                l77 l77Var4 = (l77) obj;
                boolean z3 = l77Var4 instanceof rta;
                RippleNode rippleNode = (RippleNode) this.b;
                if (!z3) {
                    aw2 aw2Var = (aw2) this.c;
                    x0e x0eVar = rippleNode.H0;
                    if (x0eVar == null) {
                        x0eVar = new x0e(rippleNode.E0, rippleNode.G0);
                        qn4.G(rippleNode);
                        rippleNode.H0 = x0eVar;
                    }
                    ArrayList arrayList2 = x0eVar.d;
                    if (l77Var4 instanceof yq6) {
                        arrayList2.add(l77Var4);
                    } else if (l77Var4 instanceof zq6) {
                        arrayList2.remove(((zq6) l77Var4).a);
                    } else if (l77Var4 instanceof rn5) {
                        arrayList2.add(l77Var4);
                    } else if (l77Var4 instanceof sn5) {
                        arrayList2.remove(((sn5) l77Var4).a);
                    } else if (l77Var4 instanceof al4) {
                        arrayList2.add(l77Var4);
                    } else if (l77Var4 instanceof bl4) {
                        arrayList2.remove(((bl4) l77Var4).a);
                    } else if (l77Var4 instanceof zk4) {
                        arrayList2.remove(((zk4) l77Var4).a);
                    }
                    l77 l77Var5 = (l77) s72.H0(arrayList2);
                    if (!pa7.t(x0eVar.e, l77Var5)) {
                        if (l77Var5 != null) {
                            x0eVar.b.invoke();
                            boolean z4 = l77Var5 instanceof yq6;
                            if (z4) {
                                f = 0.08f;
                            } else if (l77Var5 instanceof rn5) {
                                f = 0.1f;
                            } else if (l77Var5 instanceof al4) {
                                f = 0.16f;
                            }
                            x6f x6fVar = e5c.a;
                            if (!z4 && ((l77Var5 instanceof rn5) || (l77Var5 instanceof al4))) {
                                x6fVar = new x6f(45, 0, hs4.c);
                            }
                            ynb.V(aw2Var, null, null, new v0e(x0eVar, f, x6fVar, null), 3);
                        } else {
                            l77 l77Var6 = x0eVar.e;
                            x6f x6fVar2 = e5c.a;
                            if (!(l77Var6 instanceof yq6) && !(l77Var6 instanceof rn5) && (l77Var6 instanceof al4)) {
                                x6fVar2 = new x6f(150, 0, hs4.c);
                            }
                            ynb.V(aw2Var, null, null, new w0e(x0eVar, x6fVar2, null), 3);
                        }
                        x0eVar.e = l77Var5;
                    }
                } else if (rippleNode.K0) {
                    rippleNode.l1((rta) l77Var4);
                } else {
                    rippleNode.L0.h(l77Var4);
                }
                return wef.a;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                hl9 hl9Var = (hl9) obj;
                long j = hl9Var.a;
                wef wefVar2 = wef.a;
                jx jxVar = (jx) this.b;
                if ((((hl9) jxVar.e()).a & 9223372034707292159L) == 9205357640488583168L || (9223372034707292159L & j) == 9205357640488583168L || Float.intBitsToFloat((int) (((hl9) jxVar.e()).a & 4294967295L)) == Float.intBitsToFloat((int) (j & 4294967295L))) {
                    Object objG = jxVar.g(xn2Var, hl9Var);
                    return objG == bw2.a ? objG : wefVar2;
                }
                ynb.V((aw2) this.c, null, null, new vvc(jxVar, j, null), 3);
                return wefVar2;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                oyb oybVar = (oyb) obj;
                StringBuilder sb = (StringBuilder) this.c;
                xj5 xj5Var = (xj5) this.b;
                if (oybVar instanceof lyb) {
                    return xj5Var.a(new lyb(((lyb) oybVar).a), xn2Var);
                }
                if (!(oybVar instanceof myb)) {
                    if (oybVar instanceof nyb) {
                        String string = sb.toString();
                        Object obj2 = ((nyb) oybVar).a;
                        kxd kxdVar = obj2 instanceof kxd ? (kxd) obj2 : null;
                        return xj5Var.a(new nyb(new lp5(string, kxdVar != null ? kxdVar.a : null)), xn2Var);
                    }
                    if (oybVar instanceof kyb) {
                        return xj5Var.a(new kyb(((kyb) oybVar).a), xn2Var);
                    }
                    if (oybVar instanceof jyb) {
                        return xj5Var.a(new jyb(null), xn2Var);
                    }
                    ap.c();
                    return null;
                }
                myb mybVar = (myb) oybVar;
                aw2 aw2Var2 = mybVar.b;
                oxd oxdVar = (oxd) mybVar.a;
                if (oxdVar instanceof nxd) {
                    sb.append(((nxd) oxdVar).a);
                    return xj5Var.a(new myb(new np5(sb.toString()), aw2Var2), xn2Var);
                }
                if (oxdVar instanceof lxd) {
                    return xj5Var.a(new myb(new mp5(((lxd) oxdVar).a), aw2Var2), xn2Var);
                }
                if ((oxdVar instanceof mxd) || (oxdVar instanceof kxd)) {
                    return wef.a;
                }
                ap.c();
                return null;
            case 14:
                hl9 hl9Var2 = (hl9) obj;
                long j2 = hl9Var2.a;
                wef wefVar3 = wef.a;
                fqe fqeVar = (fqe) this.b;
                jx jxVar2 = fqeVar.K0;
                if ((((hl9) jxVar2.e()).a & 9223372034707292159L) == 9205357640488583168L || (j2 & 9223372034707292159L) == 9205357640488583168L || Float.intBitsToFloat((int) (((hl9) jxVar2.e()).a & 4294967295L)) == Float.intBitsToFloat((int) (j2 & 4294967295L))) {
                    Object objG2 = jxVar2.g(xn2Var, hl9Var2);
                    return objG2 == bw2.a ? objG2 : wefVar3;
                }
                ynb.V((aw2) this.c, null, null, new dqe(fqeVar, j2, null), 3);
                return wefVar3;
            case 15:
                l77 l77Var7 = (l77) obj;
                kmb kmbVar = (kmb) this.b;
                if (l77Var7 instanceof pta) {
                    kmbVar.element++;
                } else if ((l77Var7 instanceof qta) || (l77Var7 instanceof ota)) {
                    kmbVar.element--;
                }
                boolean z5 = kmbVar.element > 0;
                zwe zweVar = (zwe) this.c;
                if (zweVar.G0 != z5) {
                    zweVar.G0 = z5;
                    rs0.F(zweVar);
                }
                return wef.a;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                AuthOption authOption = (AuthOption) obj;
                qmf qmfVar = (qmf) this.c;
                if (authOption.getLoginWay() != null) {
                    vb2 vb2VarH = kn2.H((Context) this.b);
                    if (vb2VarH != null) {
                        xkf xkfVar = new xkf(qmfVar, vb2VarH, authOption, 1);
                        if (((Boolean) qmfVar.y.getValue()).booleanValue()) {
                            xkfVar.invoke();
                        } else {
                            qmfVar.z.setValue(xkfVar);
                        }
                    }
                } else {
                    int i7 = qmf.Z;
                    qmfVar.n("", authOption);
                }
                return wef.a;
            default:
                ((ym9) this.b).a((lbg) this.c, (ql2) obj);
                return wef.a;
        }
    }
}
