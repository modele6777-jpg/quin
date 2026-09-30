package defpackage;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class xu0 {
    public static final qfc a = new qfc();

    public static final void a(c4c c4cVar, rf0 rf0Var, af0 af0Var, l46 l46Var, int i) {
        int i2;
        rf0Var.getClass();
        l46Var.h0(-928065917);
        if ((i & 6) == 0) {
            i2 = (l46Var.g(c4cVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= l46Var.g(rf0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? l46Var.g(af0Var) : l46Var.i(af0Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if (l46Var.W(i2 & 1, (i2 & 147) != 146)) {
            b(c4cVar, rf0Var, af0Var, l46Var, i2 & 1022);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new su0(c4cVar, rf0Var, af0Var, i, 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:45:0x009f  */
    public static final void b(c4c c4cVar, rf0 rf0Var, final af0 af0Var, l46 l46Var, int i) {
        int i2;
        final c4c c4cVar2;
        rf0 rf0Var2;
        l46 l46Var2;
        int i3;
        l46Var.h0(366594227);
        if ((i & 6) == 0) {
            i2 = (l46Var.g(c4cVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= l46Var.g(rf0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? l46Var.g(af0Var) : l46Var.i(af0Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        final int i4 = 0;
        final int i5 = 1;
        if (!l46Var.W(i2 & 1, (i2 & 147) != 146)) {
            c4cVar2 = c4cVar;
            rf0Var2 = rf0Var;
            l46Var2 = l46Var;
            i3 = i;
            l46Var2.Z();
        } else {
            if (rf0Var == null) {
                ojb ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    ojbVarV.d = new su0(c4cVar, rf0Var, af0Var, i, 1);
                    return;
                }
                return;
            }
            c4cVar2 = c4cVar;
            rf0Var2 = rf0Var;
            i3 = i;
            if (af0Var != null) {
                z5c z5cVar = rf0Var2.a;
                if ((z5cVar instanceof df0) && af0Var.d((df0) z5cVar)) {
                    l46Var.f0(-892961605);
                    l46Var2 = l46Var;
                    af0Var.y0(c4cVar2, rf0Var2, af1.b0(822898537, new n26() { // from class: tu0
                        @Override // defpackage.n26
                        public final Object m(Object obj, Object obj2, Object obj3) {
                            int i6 = i4;
                            wef wefVar = wef.a;
                            af0 af0Var2 = af0Var;
                            c4c c4cVar3 = c4cVar2;
                            rf0 rf0Var3 = (rf0) obj;
                            l46 l46Var3 = (l46) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            switch (i6) {
                                case 0:
                                    rf0Var3.getClass();
                                    if ((iIntValue & 6) == 0) {
                                        iIntValue |= l46Var3.g(rf0Var3) ? 4 : 2;
                                    }
                                    if (!l46Var3.W(iIntValue & 1, (iIntValue & 19) != 18)) {
                                        l46Var3.Z();
                                    } else {
                                        xu0.c(c4cVar3, rf0Var3, af0Var2, l46Var3, (iIntValue << 3) & 112);
                                    }
                                    break;
                                default:
                                    rf0Var3.getClass();
                                    if ((iIntValue & 6) == 0) {
                                        iIntValue |= l46Var3.g(rf0Var3) ? 4 : 2;
                                    }
                                    if (!l46Var3.W(iIntValue & 1, (iIntValue & 19) != 18)) {
                                        l46Var3.Z();
                                    } else {
                                        xu0.c(c4cVar3, rf0Var3, af0Var2, l46Var3, (iIntValue << 3) & 112);
                                    }
                                    break;
                            }
                            return wefVar;
                        }
                    }, l46Var), l46Var2, (i2 & 14) | 384 | (i2 & 112));
                    af0Var = af0Var;
                    l46Var2.r(false);
                } else {
                    l46Var2 = l46Var;
                    af0Var = af0Var;
                    l46Var2.f0(-892838659);
                    a.y0(c4cVar2, rf0Var2, af1.b0(1712110702, new n26() { // from class: tu0
                        @Override // defpackage.n26
                        public final Object m(Object obj, Object obj2, Object obj3) {
                            int i6 = i5;
                            wef wefVar = wef.a;
                            af0 af0Var2 = af0Var;
                            c4c c4cVar3 = c4cVar2;
                            rf0 rf0Var3 = (rf0) obj;
                            l46 l46Var3 = (l46) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            switch (i6) {
                                case 0:
                                    rf0Var3.getClass();
                                    if ((iIntValue & 6) == 0) {
                                        iIntValue |= l46Var3.g(rf0Var3) ? 4 : 2;
                                    }
                                    if (!l46Var3.W(iIntValue & 1, (iIntValue & 19) != 18)) {
                                        l46Var3.Z();
                                    } else {
                                        xu0.c(c4cVar3, rf0Var3, af0Var2, l46Var3, (iIntValue << 3) & 112);
                                    }
                                    break;
                                default:
                                    rf0Var3.getClass();
                                    if ((iIntValue & 6) == 0) {
                                        iIntValue |= l46Var3.g(rf0Var3) ? 4 : 2;
                                    }
                                    if (!l46Var3.W(iIntValue & 1, (iIntValue & 19) != 18)) {
                                        l46Var3.Z();
                                    } else {
                                        xu0.c(c4cVar3, rf0Var3, af0Var2, l46Var3, (iIntValue << 3) & 112);
                                    }
                                    break;
                            }
                            return wefVar;
                        }
                    }, l46Var2), l46Var2, (i2 & 14) | 384 | (i2 & 112));
                    l46Var2.r(false);
                }
            } else {
                l46Var2 = l46Var;
                af0Var = af0Var;
                l46Var2.f0(-892838659);
                a.y0(c4cVar2, rf0Var2, af1.b0(1712110702, new n26() { // from class: tu0
                    @Override // defpackage.n26
                    public final Object m(Object obj, Object obj2, Object obj3) {
                        int i6 = i5;
                        wef wefVar = wef.a;
                        af0 af0Var2 = af0Var;
                        c4c c4cVar3 = c4cVar2;
                        rf0 rf0Var3 = (rf0) obj;
                        l46 l46Var3 = (l46) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        switch (i6) {
                            case 0:
                                rf0Var3.getClass();
                                if ((iIntValue & 6) == 0) {
                                    iIntValue |= l46Var3.g(rf0Var3) ? 4 : 2;
                                }
                                if (!l46Var3.W(iIntValue & 1, (iIntValue & 19) != 18)) {
                                    l46Var3.Z();
                                } else {
                                    xu0.c(c4cVar3, rf0Var3, af0Var2, l46Var3, (iIntValue << 3) & 112);
                                }
                                break;
                            default:
                                rf0Var3.getClass();
                                if ((iIntValue & 6) == 0) {
                                    iIntValue |= l46Var3.g(rf0Var3) ? 4 : 2;
                                }
                                if (!l46Var3.W(iIntValue & 1, (iIntValue & 19) != 18)) {
                                    l46Var3.Z();
                                } else {
                                    xu0.c(c4cVar3, rf0Var3, af0Var2, l46Var3, (iIntValue << 3) & 112);
                                }
                                break;
                        }
                        return wefVar;
                    }
                }, l46Var2), l46Var2, (i2 & 14) | 384 | (i2 & 112));
                l46Var2.r(false);
            }
        }
        ojb ojbVarV2 = l46Var2.v();
        if (ojbVarV2 != null) {
            ojbVarV2.d = new su0(c4cVar2, rf0Var2, af0Var, i3, 2);
        }
    }

    public static final void c(c4c c4cVar, rf0 rf0Var, af0 af0Var, l46 l46Var, int i) {
        int i2;
        l46Var.h0(1194519785);
        if ((i & 6) == 0) {
            i2 = (l46Var.g(c4cVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= l46Var.g(rf0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? l46Var.g(af0Var) : l46Var.i(af0Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if (l46Var.W(i2 & 1, (i2 & 147) != 146)) {
            cyc cycVarG = arb.g(rf0Var, false);
            l46Var.f0(2134994460);
            Iterator it = cycVarG.iterator();
            while (it.hasNext()) {
                b(c4cVar, (rf0) it.next(), af0Var, l46Var, i2 & 910);
            }
            l46Var.r(false);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new su0(c4cVar, rf0Var, af0Var, i, 3);
        }
    }
}
