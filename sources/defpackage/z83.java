package defpackage;

import ai.askquin.R;
import ai.askquin.ui.popup.dailyfortune.v;
import android.content.Context;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.text.DateFormatSymbols;
import java.time.LocalTime;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class z83 {
    public static final y6c a = a7c.b(2.0f);

    public static final void a(x16 x16Var, l46 l46Var, int i) {
        x16Var.getClass();
        l46Var.h0(-691983104);
        int i2 = i | (l46Var.i(x16Var) ? 4 : 2);
        if (l46Var.W(i2 & 1, (i2 & 3) != 2)) {
            Object objR = l46Var.R();
            d83 d83Var = d83.b;
            i8c i8cVar = sf2.a;
            if (objR == i8cVar) {
                objR = q1c.f(ndc.d(d83Var, false, false));
                l46Var.p0(objR);
            }
            e89 e89Var = (e89) objR;
            Object objR2 = l46Var.R();
            if (objR2 == i8cVar) {
                objR2 = n(d83Var);
                l46Var.p0(objR2);
            }
            LocalTime localTime = (LocalTime) objR2;
            Object objR3 = l46Var.R();
            if (objR3 == i8cVar) {
                objR3 = kv2.f(localTime.getHour(), l46Var);
            }
            s69 s69Var = (s69) objR3;
            Object objR4 = l46Var.R();
            if (objR4 == i8cVar) {
                objR4 = kv2.f(localTime.getMinute(), l46Var);
            }
            s69 s69Var2 = (s69) objR4;
            e83 e83Var = (e83) e89Var.getValue();
            int iJ = ((sz9) s69Var).j();
            int iJ2 = ((sz9) s69Var2).j();
            Object objR5 = l46Var.R();
            if (objR5 == i8cVar) {
                objR5 = new pg(e89Var, 22);
                l46Var.p0(objR5);
            }
            a26 a26Var = (a26) objR5;
            Object objR6 = l46Var.R();
            if (objR6 == i8cVar) {
                objR6 = new l83(s69Var, s69Var2, 1);
                l46Var.p0(objR6);
            }
            b(d83Var, f83.a, e83Var, iJ, iJ2, false, a26Var, (l26) objR6, x16Var, x16Var, x16Var, x16Var, l46Var, ((i2 << 24) & 234881024) | 14155830 | ((i2 << 27) & 1879048192), (i2 & 14) | ((i2 << 3) & 112), 32);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new m(i, 20, x16Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x013b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:103:0x013d  */
    /* JADX WARN: Code duplicated, block: B:104:0x013f  */
    /* JADX WARN: Code duplicated, block: B:107:0x0146  */
    /* JADX WARN: Code duplicated, block: B:109:0x018f  */
    /* JADX WARN: Code duplicated, block: B:112:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:113:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:116:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:117:0x021f A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:118:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:56:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:57:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:59:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:62:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:64:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:65:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:67:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:70:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:72:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:73:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:75:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:78:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:80:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:81:0x0100  */
    /* JADX WARN: Code duplicated, block: B:85:0x010a  */
    /* JADX WARN: Code duplicated, block: B:86:0x010d  */
    /* JADX WARN: Code duplicated, block: B:89:0x0117  */
    /* JADX WARN: Code duplicated, block: B:91:0x011d  */
    /* JADX WARN: Code duplicated, block: B:99:0x0132  */
    public static final void b(final d83 d83Var, final f83 f83Var, final e83 e83Var, final int i, final int i2, boolean z, final a26 a26Var, final l26 l26Var, final x16 x16Var, final x16 x16Var2, final x16 x16Var3, final x16 x16Var4, l46 l46Var, final int i3, final int i4, final int i5) {
        int i6;
        boolean z2;
        l26 l26Var2;
        x16 x16Var5;
        int i7;
        int i8;
        boolean z3;
        final boolean z4;
        ojb ojbVarV;
        l26 l26Var3;
        ojb ojbVar;
        final boolean z5;
        ojb ojbVarV2;
        int i9;
        int i10;
        int i11;
        int i12;
        d83Var.getClass();
        f83Var.getClass();
        e83Var.getClass();
        a26Var.getClass();
        l26Var.getClass();
        x16Var.getClass();
        x16Var2.getClass();
        x16Var3.getClass();
        x16Var4.getClass();
        l46Var.h0(-738877780);
        if ((i3 & 6) == 0) {
            i6 = (l46Var.e(d83Var.ordinal()) ? 4 : 2) | i3;
        } else {
            i6 = i3;
        }
        if ((i3 & 48) == 0) {
            i6 |= l46Var.e(f83Var.ordinal()) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i6 |= (i3 & 512) == 0 ? l46Var.g(e83Var) : l46Var.i(e83Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if ((i3 & 3072) == 0) {
            i6 |= l46Var.e(i) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        }
        if ((i3 & 24576) == 0) {
            i6 |= l46Var.e(i2) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE;
        }
        int i13 = i5 & 32;
        if (i13 == 0) {
            if ((196608 & i3) == 0) {
                z2 = z;
                i6 |= l46Var.h(z2) ? 131072 : 65536;
            }
            if ((1572864 & i3) != 0) {
                if (l46Var.i(a26Var)) {
                    i12 = 1048576;
                } else {
                    i12 = 524288;
                }
                i6 |= i12;
            }
            if ((12582912 & i3) == 0) {
                l26Var2 = l26Var;
                if (l46Var.i(l26Var2)) {
                    i11 = 8388608;
                } else {
                    i11 = 4194304;
                }
                i6 |= i11;
            } else {
                l26Var2 = l26Var;
            }
            if ((100663296 & i3) == 0) {
                x16Var5 = x16Var;
                if (l46Var.i(x16Var5)) {
                    i10 = 67108864;
                } else {
                    i10 = 33554432;
                }
                i6 |= i10;
            } else {
                x16Var5 = x16Var;
            }
            if ((i3 & 805306368) == 0) {
                if (l46Var.i(x16Var2)) {
                    i9 = 536870912;
                } else {
                    i9 = 268435456;
                }
                i6 |= i9;
            }
            if (l46Var.i(x16Var3)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i8 = i4 | i7;
            if ((i4 & 48) == 0) {
                i8 |= l46Var.i(x16Var4) ? 32 : 16;
            }
            if ((306783379 & i6) == 306783378 || (i8 & 19) != 18) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (l46Var.W(i6 & 1, z3)) {
                if (i13 != 0) {
                    z4 = false;
                } else {
                    z4 = z2;
                }
                if (d83Var == d83.b) {
                    l46Var.f0(-200047267);
                    int i14 = i6 >> 12;
                    int i15 = ((i6 >> 6) & 14) | 1769472 | (i14 & 112) | (i14 & 896);
                    int i16 = i6 >> 15;
                    z5 = z4;
                    pa7.e(e83Var, z5, a26Var, x16Var5, x16Var2, "reminder-guide-cta", af1.b0(520506079, new mb0(z4, x16Var3, 3), l46Var), l46Var, i15 | (i16 & 7168) | (i16 & 57344), 0);
                    l46Var.r(false);
                    ojbVarV2 = l46Var.v();
                    if (ojbVarV2 != null) {
                        return;
                    }
                    final int i17 = 0;
                    final l26 l26Var4 = l26Var2;
                    l26Var3 = new l26() { // from class: n83
                        @Override // defpackage.l26
                        public final Object z(Object obj, Object obj2) {
                            int i18 = i17;
                            wef wefVar = wef.a;
                            int i19 = i4;
                            int i20 = i3;
                            switch (i18) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    int iP = k99.P(i20 | 1);
                                    int iP2 = k99.P(i19);
                                    z83.b(d83Var, f83Var, e83Var, i, i2, z5, a26Var, l26Var4, x16Var, x16Var2, x16Var3, x16Var4, (l46) obj, iP, iP2, i5);
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    int iP3 = k99.P(i20 | 1);
                                    int iP4 = k99.P(i19);
                                    z83.b(d83Var, f83Var, e83Var, i, i2, z5, a26Var, l26Var4, x16Var, x16Var2, x16Var3, x16Var4, (l46) obj, iP3, iP4, i5);
                                    break;
                            }
                            return wefVar;
                        }
                    };
                    ojbVar = ojbVarV2;
                } else {
                    l46Var.f0(-199654218);
                    l46Var.r(false);
                    rs0.f(b.c, false, af1.b0(1113601321, new n26() { // from class: o83
                        @Override // defpackage.n26
                        public final Object m(Object obj, Object obj2, Object obj3) {
                            c31 c31Var = (c31) obj;
                            l46 l46Var2 = (l46) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            c31Var.getClass();
                            if ((iIntValue & 6) == 0) {
                                iIntValue |= l46Var2.g(c31Var) ? 4 : 2;
                            }
                            if (l46Var2.W(iIntValue & 1, (iIntValue & 19) != 18)) {
                                c8b.h(ynb.d0(9.0f, 9.0f, 0.0f, 0.0f, 12, mh3.W(c31Var.a(g09.a, ndb.b))), false, 0L, 0L, null, x16Var3, l46Var2, 0, 30);
                                int iOrdinal = f83Var.ordinal();
                                e83 e83Var2 = e83Var;
                                int i18 = i;
                                int i19 = i2;
                                if (iOrdinal == 0) {
                                    l46Var2.f0(724020943);
                                    z83.g(e83Var2, i18, i19, z4, l26Var, x16Var, x16Var2, l46Var2, 0);
                                    l46Var2.r(false);
                                } else {
                                    if (iOrdinal != 1) {
                                        throw tec.d(724019864, l46Var2, false);
                                    }
                                    l46Var2.f0(724029995);
                                    boolean z6 = e83Var2.b;
                                    boolean z7 = e83Var2.a;
                                    d83 d83Var2 = d83.a;
                                    d83 d83Var3 = d83Var;
                                    if (z6 && !z7) {
                                        i18 = 20;
                                    } else if (d83Var3 != d83Var2) {
                                        i18 = 9;
                                    }
                                    if ((z6 && !z7) || d83Var3 != d83Var2) {
                                        i19 = 0;
                                    }
                                    z83.h(i18, i19, 0, x16Var4, l46Var2);
                                    l46Var2.r(false);
                                }
                            } else {
                                l46Var2.Z();
                            }
                            return wef.a;
                        }
                    }, l46Var), l46Var, 390, 2);
                }
                ojbVar.d = l26Var3;
            }
            l46Var.Z();
            z4 = z2;
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                final int i18 = 1;
                l26Var3 = new l26() { // from class: n83
                    @Override // defpackage.l26
                    public final Object z(Object obj, Object obj2) {
                        int i19 = i18;
                        wef wefVar = wef.a;
                        int i110 = i4;
                        int i20 = i3;
                        switch (i19) {
                            case 0:
                                ((Integer) obj2).getClass();
                                int iP = k99.P(i20 | 1);
                                int iP2 = k99.P(i110);
                                z83.b(d83Var, f83Var, e83Var, i, i2, z4, a26Var, l26Var, x16Var, x16Var2, x16Var3, x16Var4, (l46) obj, iP, iP2, i5);
                                break;
                            default:
                                ((Integer) obj2).getClass();
                                int iP3 = k99.P(i20 | 1);
                                int iP4 = k99.P(i110);
                                z83.b(d83Var, f83Var, e83Var, i, i2, z4, a26Var, l26Var, x16Var, x16Var2, x16Var3, x16Var4, (l46) obj, iP3, iP4, i5);
                                break;
                        }
                        return wefVar;
                    }
                };
                ojbVar = ojbVarV;
                ojbVar.d = l26Var3;
            }
        }
        i6 |= 196608;
        z2 = z;
        if ((1572864 & i3) != 0) {
            if (l46Var.i(a26Var)) {
                i12 = 1048576;
            } else {
                i12 = 524288;
            }
            i6 |= i12;
        }
        if ((12582912 & i3) == 0) {
            l26Var2 = l26Var;
            if (l46Var.i(l26Var2)) {
                i11 = 8388608;
            } else {
                i11 = 4194304;
            }
            i6 |= i11;
        } else {
            l26Var2 = l26Var;
        }
        if ((100663296 & i3) == 0) {
            x16Var5 = x16Var;
            if (l46Var.i(x16Var5)) {
                i10 = 67108864;
            } else {
                i10 = 33554432;
            }
            i6 |= i10;
        } else {
            x16Var5 = x16Var;
        }
        if ((i3 & 805306368) == 0) {
            if (l46Var.i(x16Var2)) {
                i9 = 536870912;
            } else {
                i9 = 268435456;
            }
            i6 |= i9;
        }
        if (l46Var.i(x16Var3)) {
            i7 = 4;
        } else {
            i7 = 2;
        }
        i8 = i4 | i7;
        if ((i4 & 48) == 0) {
            i8 |= l46Var.i(x16Var4) ? 32 : 16;
        }
        if ((306783379 & i6) == 306783378) {
            z3 = true;
        } else {
            z3 = true;
        }
        if (l46Var.W(i6 & 1, z3)) {
            if (i13 != 0) {
                z4 = false;
            } else {
                z4 = z2;
            }
            if (d83Var == d83.b) {
                l46Var.f0(-200047267);
                int i19 = i6 >> 12;
                int i110 = ((i6 >> 6) & 14) | 1769472 | (i19 & 112) | (i19 & 896);
                int i111 = i6 >> 15;
                z5 = z4;
                pa7.e(e83Var, z5, a26Var, x16Var5, x16Var2, "reminder-guide-cta", af1.b0(520506079, new mb0(z4, x16Var3, 3), l46Var), l46Var, i110 | (i111 & 7168) | (i111 & 57344), 0);
                l46Var.r(false);
                ojbVarV2 = l46Var.v();
                if (ojbVarV2 != null) {
                    return;
                }
                final int i112 = 0;
                final l26 l26Var5 = l26Var2;
                l26Var3 = new l26() { // from class: n83
                    @Override // defpackage.l26
                    public final Object z(Object obj, Object obj2) {
                        int i113 = i112;
                        wef wefVar = wef.a;
                        int i114 = i4;
                        int i20 = i3;
                        switch (i113) {
                            case 0:
                                ((Integer) obj2).getClass();
                                int iP = k99.P(i20 | 1);
                                int iP2 = k99.P(i114);
                                z83.b(d83Var, f83Var, e83Var, i, i2, z5, a26Var, l26Var5, x16Var, x16Var2, x16Var3, x16Var4, (l46) obj, iP, iP2, i5);
                                break;
                            default:
                                ((Integer) obj2).getClass();
                                int iP3 = k99.P(i20 | 1);
                                int iP4 = k99.P(i114);
                                z83.b(d83Var, f83Var, e83Var, i, i2, z5, a26Var, l26Var5, x16Var, x16Var2, x16Var3, x16Var4, (l46) obj, iP3, iP4, i5);
                                break;
                        }
                        return wefVar;
                    }
                };
                ojbVar = ojbVarV2;
            } else {
                l46Var.f0(-199654218);
                l46Var.r(false);
                rs0.f(b.c, false, af1.b0(1113601321, new n26() { // from class: o83
                    @Override // defpackage.n26
                    public final Object m(Object obj, Object obj2, Object obj3) {
                        c31 c31Var = (c31) obj;
                        l46 l46Var2 = (l46) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        c31Var.getClass();
                        if ((iIntValue & 6) == 0) {
                            iIntValue |= l46Var2.g(c31Var) ? 4 : 2;
                        }
                        if (l46Var2.W(iIntValue & 1, (iIntValue & 19) != 18)) {
                            c8b.h(ynb.d0(9.0f, 9.0f, 0.0f, 0.0f, 12, mh3.W(c31Var.a(g09.a, ndb.b))), false, 0L, 0L, null, x16Var3, l46Var2, 0, 30);
                            int iOrdinal = f83Var.ordinal();
                            e83 e83Var2 = e83Var;
                            int i113 = i;
                            int i114 = i2;
                            if (iOrdinal == 0) {
                                l46Var2.f0(724020943);
                                z83.g(e83Var2, i113, i114, z4, l26Var, x16Var, x16Var2, l46Var2, 0);
                                l46Var2.r(false);
                            } else {
                                if (iOrdinal != 1) {
                                    throw tec.d(724019864, l46Var2, false);
                                }
                                l46Var2.f0(724029995);
                                boolean z6 = e83Var2.b;
                                boolean z7 = e83Var2.a;
                                d83 d83Var2 = d83.a;
                                d83 d83Var3 = d83Var;
                                if (z6 && !z7) {
                                    i113 = 20;
                                } else if (d83Var3 != d83Var2) {
                                    i113 = 9;
                                }
                                if ((z6 && !z7) || d83Var3 != d83Var2) {
                                    i114 = 0;
                                }
                                z83.h(i113, i114, 0, x16Var4, l46Var2);
                                l46Var2.r(false);
                            }
                        } else {
                            l46Var2.Z();
                        }
                        return wef.a;
                    }
                }, l46Var), l46Var, 390, 2);
            }
            ojbVar.d = l26Var3;
        }
        l46Var.Z();
        z4 = z2;
        ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            final int i113 = 1;
            l26Var3 = new l26() { // from class: n83
                @Override // defpackage.l26
                public final Object z(Object obj, Object obj2) {
                    int i114 = i113;
                    wef wefVar = wef.a;
                    int i115 = i4;
                    int i20 = i3;
                    switch (i114) {
                        case 0:
                            ((Integer) obj2).getClass();
                            int iP = k99.P(i20 | 1);
                            int iP2 = k99.P(i115);
                            z83.b(d83Var, f83Var, e83Var, i, i2, z4, a26Var, l26Var, x16Var, x16Var2, x16Var3, x16Var4, (l46) obj, iP, iP2, i5);
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            int iP3 = k99.P(i20 | 1);
                            int iP4 = k99.P(i115);
                            z83.b(d83Var, f83Var, e83Var, i, i2, z4, a26Var, l26Var, x16Var, x16Var2, x16Var3, x16Var4, (l46) obj, iP3, iP4, i5);
                            break;
                    }
                    return wefVar;
                }
            };
            ojbVar = ojbVarV;
            ojbVar.d = l26Var3;
        }
    }

    public static final void c(int i, d83 d83Var, x16 x16Var, l46 l46Var, int i2) {
        d83 d83Var2;
        int i3;
        Object s83Var;
        o9 o9Var;
        e89 e89Var;
        int i4;
        final e89 e89Var2;
        a93 a93Var;
        aw2 aw2Var;
        Object y83Var;
        d83 d83Var3;
        x16 x16Var2;
        int i5;
        boolean z;
        x16 x16Var3 = x16Var;
        d83Var.getClass();
        x16Var3.getClass();
        l46Var.h0(720047695);
        int i6 = i2 | (l46Var.e(i) ? 4 : 2) | (l46Var.e(d83Var.ordinal()) ? 32 : 16) | (l46Var.i(x16Var3) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
        if (l46Var.W(i6 & 1, (i6 & 147) != 146)) {
            nfc nfcVarB = kr7.b(l46Var);
            boolean zG = l46Var.g(null) | l46Var.g(nfcVarB);
            Object objR = l46Var.R();
            i8c i8cVar = sf2.a;
            if (zG || objR == i8cVar) {
                objR = nfcVarB.b(job.a.b(gpf.class), null, null);
                l46Var.p0(objR);
            }
            final gpf gpfVar = (gpf) objR;
            nfc nfcVarB2 = kr7.b(l46Var);
            boolean zG2 = l46Var.g(null) | l46Var.g(nfcVarB2);
            Object objR2 = l46Var.R();
            if (zG2 || objR2 == i8cVar) {
                objR2 = nfcVarB2.b(job.a.b(o9.class), null, null);
                l46Var.p0(objR2);
            }
            o9 o9Var2 = (o9) objR2;
            nfc nfcVarB3 = kr7.b(l46Var);
            boolean zG3 = l46Var.g(null) | l46Var.g(nfcVarB3);
            Object objR3 = l46Var.R();
            if (zG3 || objR3 == i8cVar) {
                objR3 = nfcVarB3.b(job.a.b(v.class), null, null);
                l46Var.p0(objR3);
            }
            v vVar = (v) objR3;
            final Context context = (Context) l46Var.k(uq.b);
            Object objR4 = l46Var.R();
            if (objR4 == i8cVar) {
                objR4 = af1.E(l46Var);
                l46Var.p0(objR4);
            }
            aw2 aw2Var2 = (aw2) objR4;
            int i7 = i6 & 112;
            boolean z2 = i7 == 32;
            Object objR5 = l46Var.R();
            if (z2 || objR5 == i8cVar) {
                objR5 = q1c.f(f83.a);
                l46Var.p0(objR5);
            }
            e89 e89Var3 = (e89) objR5;
            boolean z3 = i7 == 32;
            Object objR6 = l46Var.R();
            if (z3 || objR6 == i8cVar) {
                y93 y93Var = y93.a;
                objR6 = q1c.f(ndc.d(d83Var, y93.e() != null, y93.h() != null));
                l46Var.p0(objR6);
            }
            final e89 e89Var4 = (e89) objR6;
            boolean z4 = i7 == 32;
            Object objR7 = l46Var.R();
            if (z4 || objR7 == i8cVar) {
                objR7 = n(d83Var);
                l46Var.p0(objR7);
            }
            LocalTime localTime = (LocalTime) objR7;
            boolean z5 = i7 == 32;
            Object objR8 = l46Var.R();
            if (z5 || objR8 == i8cVar) {
                objR8 = kv2.f(localTime.getHour(), l46Var);
            }
            final s69 s69Var = (s69) objR8;
            boolean z6 = i7 == 32;
            Object objR9 = l46Var.R();
            if (z6 || objR9 == i8cVar) {
                objR9 = kv2.f(localTime.getMinute(), l46Var);
            }
            final s69 s69Var2 = (s69) objR9;
            Object objR10 = l46Var.R();
            if (objR10 == i8cVar) {
                objR10 = q1c.f(Boolean.FALSE);
                l46Var.p0(objR10);
            }
            e89 e89Var5 = (e89) objR10;
            Object[] objArr = {d83Var};
            vea veaVar = a93.b;
            Object objR11 = l46Var.R();
            if (objR11 == i8cVar) {
                objR11 = new os2(18);
                l46Var.p0(objR11);
            }
            a93 a93Var2 = (a93) vfh.J(objArr, veaVar, (x16) objR11, l46Var, 384);
            int i8 = i6 & 14;
            boolean z7 = i8 == 4;
            Object objR12 = l46Var.R();
            if (z7 || objR12 == i8cVar) {
                objR12 = tm7.O(i);
                l46Var.p0(objR12);
            }
            ei9 ei9Var = (ei9) objR12;
            int i9 = i6 & 896;
            boolean zI = (i7 == 32) | l46Var.i(a93Var2) | l46Var.i(aw2Var2) | l46Var.i(context) | l46Var.i(gpfVar) | l46Var.i(o9Var2) | (i9 == 256) | l46Var.g(e89Var3);
            Object objR13 = l46Var.R();
            if (zI || objR13 == i8cVar) {
                o9Var = o9Var2;
                e89Var = e89Var5;
                i4 = i9;
                e89Var2 = e89Var3;
                a93Var = a93Var2;
                aw2Var = aw2Var2;
                s83Var = new s83(a93Var, aw2Var, e89Var, d83Var, context, gpfVar, o9Var, x16Var, e89Var2);
                l46Var.p0(s83Var);
            } else {
                a93Var = a93Var2;
                o9Var = o9Var2;
                i4 = i9;
                e89Var2 = e89Var3;
                s83Var = objR13;
                e89Var = e89Var5;
                aw2Var = aw2Var2;
            }
            final uh9 uh9VarZ = oa7.Z((a26) s83Var, ei9Var, l46Var);
            boolean zI2 = l46Var.i(a93Var) | l46Var.i(aw2Var) | (i7 == 32) | l46Var.i(context) | l46Var.i(gpfVar) | l46Var.i(o9Var) | (i4 == 256) | l46Var.g(e89Var2);
            Object objR14 = l46Var.R();
            if (zI2 || objR14 == i8cVar) {
                d83Var3 = d83Var;
                x16Var2 = x16Var;
                y83Var = new y83(a93Var, aw2Var, e89Var, d83Var3, context, gpfVar, o9Var, x16Var2, e89Var2);
                l46Var.p0(y83Var);
            } else {
                x16Var2 = x16Var;
                y83Var = objR14;
                d83Var3 = d83Var;
            }
            final a93 a93Var3 = a93Var;
            final uo uoVarY = oa7.Y(ei9Var, (x16) ((ym7) y83Var), l46Var, 0);
            Integer numValueOf = Integer.valueOf(i);
            boolean zI3 = (i7 == 32) | (i8 == 4) | l46Var.i(vVar);
            Object objR15 = l46Var.R();
            if (zI3 || objR15 == i8cVar) {
                i5 = i;
                objR15 = new u83(i5, d83Var3, vVar, null);
                l46Var.p0(objR15);
            } else {
                i5 = i;
            }
            af1.p(numValueOf, d83Var3, (l26) objR15, l46Var);
            boolean zF = f(e89Var);
            Object objR16 = l46Var.R();
            if (objR16 == i8cVar) {
                objR16 = new os2(19);
                l46Var.p0(objR16);
            }
            rxg.a(zF, (x16) objR16, l46Var, 48, 0);
            boolean z8 = (i8 == 4) | (i4 == 256);
            Object objR17 = l46Var.R();
            if (z8 || objR17 == i8cVar) {
                z = false;
                objR17 = new i83(i5, x16Var2, e89Var, 0);
                l46Var.p0(objR17);
            } else {
                z = false;
            }
            x16 x16Var4 = (x16) objR17;
            s84 s84Var = new s84(false, d83Var3 != d83.c ? true : z, false, false, 229);
            final int i10 = i5;
            final e89 e89Var6 = e89Var;
            final d83 d83Var4 = d83Var3;
            final o9 o9Var3 = o9Var;
            final x16 x16Var5 = x16Var2;
            final aw2 aw2Var3 = aw2Var;
            l26 l26Var = new l26() { // from class: j83
                @Override // defpackage.l26
                public final Object z(Object obj, Object obj2) {
                    final e89 e89Var7;
                    s69 s69Var3;
                    e89 e89Var8;
                    e89 e89Var9;
                    boolean z9;
                    l46 l46Var2 = (l46) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (l46Var2.W(iIntValue & 1, (iIntValue & 3) != 2)) {
                        final a93 a93Var4 = a93Var3;
                        boolean zI4 = l46Var2.i(a93Var4);
                        final e89 e89Var10 = e89Var4;
                        boolean zG4 = zI4 | l46Var2.g(e89Var10);
                        final s69 s69Var4 = s69Var;
                        boolean zG5 = zG4 | l46Var2.g(s69Var4);
                        final s69 s69Var5 = s69Var2;
                        boolean zG6 = zG5 | l46Var2.g(s69Var5);
                        final int i11 = i10;
                        boolean zE = zG6 | l46Var2.e(i11);
                        final d83 d83Var5 = d83Var4;
                        boolean zE2 = zE | l46Var2.e(d83Var5.ordinal());
                        final uh9 uh9Var = uh9VarZ;
                        boolean zI5 = zE2 | l46Var2.i(uh9Var);
                        final aw2 aw2Var4 = aw2Var3;
                        boolean zI6 = zI5 | l46Var2.i(aw2Var4);
                        final Context context2 = context;
                        boolean zI7 = zI6 | l46Var2.i(context2);
                        final gpf gpfVar2 = gpfVar;
                        boolean zI8 = zI7 | l46Var2.i(gpfVar2);
                        final o9 o9Var4 = o9Var3;
                        boolean zI9 = zI8 | l46Var2.i(o9Var4);
                        final x16 x16Var6 = x16Var5;
                        boolean zG7 = zI9 | l46Var2.g(x16Var6);
                        e89 e89Var11 = e89Var2;
                        boolean zG8 = zG7 | l46Var2.g(e89Var11);
                        final uo uoVar = uoVarY;
                        boolean zI10 = zG8 | l46Var2.i(uoVar);
                        Object objR18 = l46Var2.R();
                        final e89 e89Var12 = e89Var6;
                        i8c i8cVar2 = sf2.a;
                        if (zI10 || objR18 == i8cVar2) {
                            e89Var7 = e89Var11;
                            x16 x16Var7 = new x16() { // from class: k83
                                @Override // defpackage.x16
                                public final Object invoke() {
                                    e89 e89Var13 = e89Var12;
                                    if (!((Boolean) e89Var13.getValue()).booleanValue()) {
                                        e83 e83Var = (e83) e89Var10.getValue();
                                        int iJ = ((sz9) s69Var4).j();
                                        int iJ2 = ((sz9) s69Var5).j();
                                        a93 a93Var5 = a93Var4;
                                        a93Var5.getClass();
                                        e83Var.getClass();
                                        e83 e83VarA = e83.a(e83Var, false, false, 3);
                                        a93Var5.a = new h83(e83VarA, iJ, iJ2);
                                        d83 d83Var6 = d83Var5;
                                        d83Var6.getClass();
                                        x1f x1fVar = x1f.a;
                                        x1f.k(p05.a, new g01(d83Var6, i11, e83VarA, 5), 2);
                                        uh9Var.a(new v83(a93Var5, aw2Var4, e89Var13, d83Var6, context2, gpfVar2, o9Var4, x16Var6, e89Var7), new q83(uoVar, 0));
                                    }
                                    return wef.a;
                                }
                            };
                            s69Var3 = s69Var5;
                            e89Var8 = e89Var12;
                            e89Var9 = e89Var10;
                            l46Var2.p0(x16Var7);
                            objR18 = x16Var7;
                        } else {
                            e89Var8 = e89Var12;
                            e89Var9 = e89Var10;
                            e89Var7 = e89Var11;
                            s69Var3 = s69Var5;
                        }
                        x16 x16Var8 = (x16) objR18;
                        boolean zE3 = l46Var2.e(i11) | l46Var2.g(x16Var6);
                        Object objR19 = l46Var2.R();
                        if (zE3 || objR19 == i8cVar2) {
                            z9 = true;
                            objR19 = new i83(i11, x16Var6, e89Var8, 1);
                            l46Var2.p0(objR19);
                        } else {
                            z9 = true;
                        }
                        x16 x16Var9 = (x16) objR19;
                        if (d83Var5 == d83.c) {
                            l46Var2.f0(161174929);
                            z83.m(((Boolean) e89Var8.getValue()).booleanValue() ^ z9, x16Var8, x16Var9, l46Var2, 0, 0);
                            l46Var2.r(false);
                        } else {
                            l46Var2.f0(161354512);
                            f83 f83Var = (f83) e89Var7.getValue();
                            e83 e83Var = (e83) e89Var9.getValue();
                            int iJ = ((sz9) s69Var4).j();
                            int iJ2 = ((sz9) s69Var3).j();
                            boolean zBooleanValue = ((Boolean) e89Var8.getValue()).booleanValue();
                            boolean zG9 = l46Var2.g(e89Var9);
                            Object objR20 = l46Var2.R();
                            if (zG9 || objR20 == i8cVar2) {
                                objR20 = new pg(e89Var9, 23);
                                l46Var2.p0(objR20);
                            }
                            a26 a26Var = (a26) objR20;
                            boolean zG10 = l46Var2.g(s69Var4) | l46Var2.g(s69Var3);
                            Object objR21 = l46Var2.R();
                            if (zG10 || objR21 == i8cVar2) {
                                objR21 = new l83(s69Var4, s69Var3, 0);
                                l46Var2.p0(objR21);
                            }
                            l26 l26Var2 = (l26) objR21;
                            boolean zE4 = l46Var2.e(i11) | l46Var2.g(x16Var6);
                            Object objR22 = l46Var2.R();
                            if (zE4 || objR22 == i8cVar2) {
                                objR22 = new i83(i11, x16Var6, e89Var8, 2);
                                l46Var2.p0(objR22);
                            }
                            x16 x16Var10 = (x16) objR22;
                            boolean zE5 = l46Var2.e(i11) | l46Var2.g(x16Var6);
                            Object objR23 = l46Var2.R();
                            if (zE5 || objR23 == i8cVar2) {
                                objR23 = new m83(i11, 0, x16Var6);
                                l46Var2.p0(objR23);
                            }
                            z83.b(d83Var5, f83Var, e83Var, iJ, iJ2, zBooleanValue, a26Var, l26Var2, x16Var8, x16Var10, x16Var9, (x16) objR23, l46Var2, 0, 0, 0);
                            l46Var2.r(false);
                        }
                    } else {
                        l46Var2.Z();
                    }
                    return wef.a;
                }
            };
            i3 = i10;
            x16Var3 = x16Var5;
            d83Var2 = d83Var4;
            t72.b(x16Var4, s84Var, af1.b0(-891829992, l26Var, l46Var), l46Var, 384, 0);
        } else {
            d83Var2 = d83Var;
            i3 = i;
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new gc(i3, d83Var2, x16Var3, i2);
        }
    }

    public static final void d(a93 a93Var, aw2 aw2Var, e89 e89Var, d83 d83Var, Context context, gpf gpfVar, o9 o9Var, x16 x16Var, e89 e89Var2) {
        h83 h83Var;
        if (f(e89Var) || (h83Var = a93Var.a) == null) {
            return;
        }
        e89Var.setValue(Boolean.TRUE);
        ynb.V(aw2Var, null, null, new w83(h83Var, d83Var, context, gpfVar, o9Var, x16Var, e89Var2, e89Var, null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:52:0x016f  */
    /* JADX WARN: Code duplicated, block: B:54:0x0175  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00dd, code lost:
    
        if (r7 == r6) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0113, code lost:
    
        if (r7 == r6) goto L48;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object e(defpackage.d83 r17, android.content.Context r18, defpackage.gpf r19, defpackage.o9 r20, defpackage.x16 r21, defpackage.e89 r22, defpackage.h83 r23, defpackage.zn2 r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 377
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z83.e(d83, android.content.Context, gpf, o9, x16, e89, h83, zn2):java.lang.Object");
    }

    public static final boolean f(e89 e89Var) {
        return ((Boolean) e89Var.getValue()).booleanValue();
    }

    public static final void g(e83 e83Var, int i, int i2, boolean z, l26 l26Var, x16 x16Var, x16 x16Var2, l46 l46Var, int i3) {
        l46 l46Var2 = l46Var;
        l46Var2.h0(1087355061);
        int i4 = i3 | (l46Var2.g(e83Var) ? 4 : 2) | (l46Var2.e(i) ? 32 : 16) | (l46Var2.e(i2) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var2.h(z) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE) | (l46Var2.i(l26Var) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE) | (l46Var2.i(x16Var) ? 131072 : 65536) | (l46Var2.i(x16Var2) ? 1048576 : 524288);
        if (l46Var2.W(i4 & 1, (599187 & i4) != 599186)) {
            j09 j09VarD0 = ynb.d0(0.0f, 72.0f, 0.0f, 16.0f, 5, ynb.b0(24.0f, 0.0f, mh3.Y(b.c), 2));
            jx0 jx0Var = ndb.Z;
            c92 c92VarA = a92.a(xc0.g, jx0Var, l46Var2, 54);
            int iHashCode = Long.hashCode(l46Var2.T);
            u8a u8aVarM = l46Var2.m();
            j09 j09VarJ = m93.J(l46Var2, j09VarD0);
            lf2.q.getClass();
            l46Var2.j0();
            boolean z2 = l46Var2.S;
            ov7 ov7Var = LayoutNode.h1;
            if (z2) {
                l46Var2.l(ov7Var);
            } else {
                l46Var2.s0();
            }
            he2 he2Var = hj6.z;
            dec.l(he2Var, l46Var2, c92VarA);
            he2 he2Var2 = hj6.y;
            dec.l(he2Var2, l46Var2, u8aVarM);
            Integer numValueOf = Integer.valueOf(iHashCode);
            he2 he2Var3 = hj6.X;
            dec.l(he2Var3, l46Var2, numValueOf);
            dec.k(l46Var2);
            he2 he2Var4 = hj6.x;
            dec.l(he2Var4, l46Var2, j09VarJ);
            jw7 jw7Var = new jw7(1.0f, true);
            sc0 sc0Var = xc0.c;
            c92 c92VarA2 = a92.a(sc0Var, jx0Var, l46Var2, 48);
            int iHashCode2 = Long.hashCode(l46Var2.T);
            u8a u8aVarM2 = l46Var2.m();
            j09 j09VarJ2 = m93.J(l46Var2, jw7Var);
            l46Var2.j0();
            if (l46Var2.S) {
                l46Var2.l(ov7Var);
            } else {
                l46Var2.s0();
            }
            dec.l(he2Var, l46Var2, c92VarA2);
            dec.l(he2Var2, l46Var2, u8aVarM2);
            ib8.s(iHashCode2, l46Var2, he2Var3, l46Var2);
            dec.l(he2Var4, l46Var2, j09VarJ2);
            c92 c92VarA3 = a92.a(new uc0(8.0f, true, new qc0(0)), jx0Var, l46Var2, 54);
            int iHashCode3 = Long.hashCode(l46Var2.T);
            u8a u8aVarM3 = l46Var2.m();
            g09 g09Var = g09.a;
            j09 j09VarJ3 = m93.J(l46Var2, g09Var);
            l46Var2.j0();
            if (l46Var2.S) {
                l46Var2.l(ov7Var);
            } else {
                l46Var2.s0();
            }
            dec.l(he2Var, l46Var2, c92VarA3);
            dec.l(he2Var2, l46Var2, u8aVarM3);
            ib8.s(iHashCode3, l46Var2, he2Var3, l46Var2);
            dec.l(he2Var4, l46Var2, j09VarJ3);
            String strQ = afc.q(R.string.daily_fortune_reminder_tp_intro_title, l46Var2);
            mue mueVar = pue.a;
            mue mueVarA = mue.a(pue.m(l46Var2), 0L, 0L, null, ((y8b) l46Var2.k(x8b.a)).a, 0L, null, 0, 0L, null, null, 16777183);
            pr4 pr4Var = l8b.a;
            nte.b(strQ, null, ((e8b) l46Var2.k(pr4Var)).q, 0L, null, null, 0L, null, new jme(3), 0L, 0, false, 0, 0, null, mueVarA, l46Var, 0, 0, 130042);
            nte.b(afc.q(R.string.daily_fortune_reminder_tp_intro_subtitle, l46Var), null, ((e8b) l46Var.k(pr4Var)).r, 0L, null, null, 0L, null, new jme(3), 0L, 0, false, 0, 0, null, pue.e(l46Var), l46Var, 0, 0, 130042);
            ib8.t(l46Var, true, g09Var, 16.0f, l46Var);
            feg.j(od4.A(we6.e(l46Var) ? R.drawable.img_notification_tp2_neo_illustration : R.drawable.img_notification_tp2_illustration, 0, l46Var), null, b.m(g09Var, 240.0f, 120.0f), null, an2.b, 0.0f, null, l46Var, 25016, 104);
            o5c.f(l46Var, b.d(g09Var, 24.0f));
            k(i, i2, l26Var, l46Var, ((i4 >> 3) & 126) | ((i4 >> 6) & 896));
            nte.b(ks0.h(24.0f, R.string.daily_fortune_reminder_tp_intro_hint, l46Var, l46Var, g09Var), null, ((e8b) l46Var.k(pr4Var)).r, 0L, null, null, 0L, null, new jme(3), 0L, 0, false, 0, 0, null, pue.g(l46Var), l46Var, 0, 0, 130042);
            l46Var.r(true);
            c92 c92VarA4 = a92.a(sc0Var, jx0Var, l46Var, 48);
            int iHashCode4 = Long.hashCode(l46Var.T);
            u8a u8aVarM4 = l46Var.m();
            j09 j09VarJ4 = m93.J(l46Var, g09Var);
            l46Var.j0();
            if (l46Var.S) {
                l46Var.l(ov7Var);
            } else {
                l46Var.s0();
            }
            dec.l(he2Var, l46Var, c92VarA4);
            dec.l(he2Var2, l46Var, u8aVarM4);
            ib8.s(iHashCode4, l46Var, he2Var3, l46Var);
            dec.l(he2Var4, l46Var, j09VarJ4);
            c8b.i(androidx.compose.ui.platform.b.a(b.f(56.0f, 0.0f, b.c(g09Var, 1.0f), 2), "reminder-guide-cta"), afc.q(R.string.daily_fortune_reminder_tp_intro_cta, l46Var), null, null, 0L, 0.0f, (e83Var.a || e83Var.b) && !z, null, null, false, null, null, x16Var, l46Var, 6, (i4 >> 9) & 896, 4028);
            l46Var2 = l46Var;
            cgg.m(x16Var2, kv2.e(g09Var, 8.0f, l46Var2, g09Var, 1.0f), !z, null, null, null, dj6.a, l46Var2, ((i4 >> 18) & 14) | 805306416, 504);
            l46Var2.r(true);
            l46Var2.r(true);
        } else {
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new jv1(e83Var, i, i2, z, l26Var, x16Var, x16Var2, i3);
        }
    }

    public static final void h(int i, int i2, int i3, x16 x16Var, l46 l46Var) {
        x16 x16Var2 = x16Var;
        l46 l46Var2 = l46Var;
        l46Var2.h0(-2079305118);
        int i4 = i3 | (l46Var2.e(i) ? 4 : 2) | (l46Var2.e(i2) ? 32 : 16) | (l46Var2.i(x16Var2) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
        if (l46Var2.W(i4 & 1, (i4 & 147) != 146)) {
            j09 j09VarD0 = ynb.d0(0.0f, 72.0f, 0.0f, 16.0f, 5, ynb.b0(24.0f, 0.0f, mh3.Y(b.c), 2));
            c92 c92VarA = a92.a(xc0.c, ndb.Z, l46Var2, 48);
            int iHashCode = Long.hashCode(l46Var2.T);
            u8a u8aVarM = l46Var2.m();
            j09 j09VarJ = m93.J(l46Var2, j09VarD0);
            lf2.q.getClass();
            l46Var2.j0();
            if (l46Var2.S) {
                l46Var2.l(LayoutNode.h1);
            } else {
                l46Var2.s0();
            }
            dec.l(hj6.z, l46Var2, c92VarA);
            dec.l(hj6.y, l46Var2, u8aVarM);
            dec.l(hj6.X, l46Var2, Integer.valueOf(iHashCode));
            dec.k(l46Var2);
            dec.l(hj6.x, l46Var2, j09VarJ);
            String strQ = afc.q(R.string.daily_fortune_reminder_tp_success_title, l46Var2);
            mue mueVar = pue.a;
            mue mueVarA = mue.a(pue.m(l46Var2), 0L, 0L, null, ((y8b) l46Var2.k(x8b.a)).a, 0L, null, 0, 0L, null, null, 16777183);
            pr4 pr4Var = l8b.a;
            nte.b(strQ, null, ((e8b) l46Var2.k(pr4Var)).q, 0L, null, null, 0L, null, new jme(3), 0L, 0, false, 0, 0, null, mueVarA, l46Var, 0, 0, 130042);
            g09 g09Var = g09.a;
            o5c.f(l46Var, b.d(g09Var, 32.0f));
            j(i, i2, l46Var, i4 & 126);
            nte.b(ks0.h(32.0f, R.string.daily_fortune_reminder_tp_success_subtitle, l46Var, l46Var, g09Var), null, ((e8b) l46Var.k(pr4Var)).r, 0L, null, null, 0L, null, new jme(3), 0L, 0, false, 0, 0, null, pue.e(l46Var), l46Var, 0, 0, 130042);
            o5c.f(l46Var, new jw7(1.0f, true));
            c8b.i(b.f(56.0f, 0.0f, b.c(g09Var, 1.0f), 2), afc.q(R.string.daily_fortune_reminder_tp_success_cta, l46Var), null, null, 0L, 0.0f, false, null, null, false, null, null, x16Var, l46Var, 6, i4 & 896, 4092);
            x16Var2 = x16Var;
            l46Var2 = l46Var;
            l46Var2.r(true);
        } else {
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new r83(i, i2, x16Var2, i3);
        }
    }

    public static final void i(String str, l46 l46Var, int i) {
        l46 l46Var2 = l46Var;
        l46Var2.h0(-671180770);
        int i2 = i | (l46Var2.g(str) ? 4 : 2);
        if (l46Var2.W(i2 & 1, (i2 & 3) != 2)) {
            y6c y6cVarO = o(l46Var2);
            j09 j09VarE = oa7.E(b.m(g09.a, 72.0f, 96.0f), y6cVarO);
            pr4 pr4Var = l8b.a;
            j09 j09VarW = db6.w(tm7.o(j09VarE, ((e8b) l46Var2.k(pr4Var)).f, g21.f), 0.5f, ((e8b) l46Var2.k(pr4Var)).B, y6cVarO);
            xn8 xn8VarC = s21.c(ndb.f, false);
            int iHashCode = Long.hashCode(l46Var2.T);
            u8a u8aVarM = l46Var2.m();
            j09 j09VarJ = m93.J(l46Var2, j09VarW);
            lf2.q.getClass();
            l46Var2.j0();
            if (l46Var2.S) {
                l46Var2.l(LayoutNode.h1);
            } else {
                l46Var2.s0();
            }
            dec.l(hj6.z, l46Var2, xn8VarC);
            dec.l(hj6.y, l46Var2, u8aVarM);
            dec.l(hj6.X, l46Var2, Integer.valueOf(iHashCode));
            dec.k(l46Var2);
            dec.l(hj6.x, l46Var2, j09VarJ);
            mue mueVar = pue.a;
            nte.b(str, null, ((e8b) l46Var2.k(pr4Var)).q, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, pue.l(l46Var2), l46Var, i2 & 14, 0, 131066);
            l46Var2 = l46Var;
            l46Var2.r(true);
        } else {
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new o8(str, i, 12);
        }
    }

    public static final void j(int i, int i2, l46 l46Var, int i3) {
        int i4;
        int i5;
        int i6 = i;
        l46 l46Var2 = l46Var;
        l46Var2.h0(1243826721);
        int i7 = i3 | (l46Var2.e(i6) ? 4 : 2) | (l46Var2.e(i2) ? 32 : 16);
        if (l46Var2.W(i7 & 1, (i7 & 19) != 18)) {
            if (i6 == 0) {
                i5 = 12;
            } else {
                i5 = i6 > 12 ? i6 - 12 : i6;
            }
            Object objR = l46Var2.R();
            if (objR == sf2.a) {
                DateFormatSymbols dateFormatSymbols = DateFormatSymbols.getInstance();
                String[] strArr = {dateFormatSymbols.getAmPmStrings()[0], dateFormatSymbols.getAmPmStrings()[1]};
                l46Var2.p0(strArr);
                objR = strArr;
            }
            String[] strArr2 = (String[]) objR;
            t7c t7cVarA = s7c.a(xc0.a, ndb.y, l46Var2, 48);
            int iHashCode = Long.hashCode(l46Var2.T);
            u8a u8aVarM = l46Var2.m();
            g09 g09Var = g09.a;
            j09 j09VarJ = m93.J(l46Var2, g09Var);
            lf2.q.getClass();
            l46Var2.j0();
            if (l46Var2.S) {
                l46Var2.l(LayoutNode.h1);
            } else {
                l46Var2.s0();
            }
            dec.l(hj6.z, l46Var2, t7cVarA);
            dec.l(hj6.y, l46Var2, u8aVarM);
            dec.l(hj6.X, l46Var2, Integer.valueOf(iHashCode));
            dec.k(l46Var2);
            dec.l(hj6.x, l46Var2, j09VarJ);
            i(v4e.W(2, String.valueOf(i5)), l46Var2, 0);
            mue mueVar = pue.a;
            mue mueVarL = pue.l(l46Var2);
            pr4 pr4Var = l8b.a;
            nte.b(":", b.s(b.m(ynb.b0(8.0f, 0.0f, g09Var, 2), 12.0f, 96.0f), ndb.f, 2), ((e8b) l46Var2.k(pr4Var)).q, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mueVarL, l46Var, 54, 0, 131064);
            i(v4e.W(2, String.valueOf(i2)), l46Var, 0);
            o5c.f(l46Var, b.p(g09Var, 8.0f));
            j09 j09VarA0 = ynb.a0(tm7.o(oa7.E(ynb.d0(0.0f, 4.0f, 0.0f, 0.0f, 13, g09Var), a), ((e8b) l46Var.k(pr4Var)).m, g21.f), 4.0f, 2.0f);
            String str = strArr2[i < 12 ? (char) 0 : (char) 1];
            str.getClass();
            i6 = i;
            nte.b(str, j09VarA0, ((e8b) l46Var.k(pr4Var)).r, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, pue.a, l46Var, 0, 0, 131064);
            l46Var2 = l46Var;
            i4 = 1;
            l46Var2.r(true);
        } else {
            i4 = 1;
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new dq1(i6, i2, i3, i4);
        }
    }

    public static final void k(int i, int i2, l26 l26Var, l46 l46Var, int i3) {
        int i4;
        l26 l26Var2;
        l46Var.h0(-1377231679);
        if ((i3 & 6) == 0) {
            i4 = (l46Var.e(i) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= l46Var.e(i2) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            l26Var2 = l26Var;
            i4 |= l46Var.i(l26Var2) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        } else {
            l26Var2 = l26Var;
        }
        if (l46Var.W(i4 & 1, (i4 & 147) != 146)) {
            y6c y6cVarO = o(l46Var);
            g09 g09Var = g09.a;
            j09 j09VarE = oa7.E(b.p(g09Var, 240.0f), y6cVarO);
            pr4 pr4Var = l8b.a;
            j09 j09VarZ = ynb.Z(db6.w(tm7.o(j09VarE, ((e8b) l46Var.k(pr4Var)).f, g21.f), 0.5f, ((e8b) l46Var.k(pr4Var)).B, y6cVarO), 20.0f);
            xn8 xn8VarC = s21.c(ndb.b, false);
            int iHashCode = Long.hashCode(l46Var.T);
            u8a u8aVarM = l46Var.m();
            j09 j09VarJ = m93.J(l46Var, j09VarZ);
            lf2.q.getClass();
            l46Var.j0();
            if (l46Var.S) {
                l46Var.l(LayoutNode.h1);
            } else {
                l46Var.s0();
            }
            dec.l(hj6.z, l46Var, xn8VarC);
            dec.l(hj6.y, l46Var, u8aVarM);
            dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode));
            dec.k(l46Var);
            dec.l(hj6.x, l46Var, j09VarJ);
            uyb.f(i, i2, l26Var2, b.c(g09Var, 1.0f), false, null, l46Var, (i4 & 14) | 27648 | (i4 & 112) | (i4 & 896), 32);
            l46Var.r(true);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new zp1(i, i2, i3, 3, l26Var);
        }
    }

    public static final void l(x16 x16Var, l46 l46Var, int i) {
        x16 x16Var2;
        l46 l46Var2;
        x16Var.getClass();
        l46Var.h0(773314836);
        int i2 = (l46Var.i(x16Var) ? 4 : 2) | i;
        if (l46Var.W(i2 & 1, (i2 & 3) != 2)) {
            x16Var2 = x16Var;
            l46Var2 = l46Var;
            m(false, x16Var2, x16Var, l46Var2, ((i2 << 3) & 112) | ((i2 << 6) & 896), 1);
        } else {
            x16Var2 = x16Var;
            l46Var2 = l46Var;
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new m(i, 21, x16Var2);
        }
    }

    public static final void m(boolean z, x16 x16Var, x16 x16Var2, l46 l46Var, int i, int i2) {
        boolean z2;
        int i3;
        x16 x16Var3;
        x16Var.getClass();
        x16Var2.getClass();
        l46Var.h0(-94123550);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            z2 = z;
        } else if ((i & 6) == 0) {
            z2 = z;
            i3 = (l46Var.h(z2) ? 4 : 2) | i;
        } else {
            z2 = z;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= l46Var.i(x16Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            x16Var3 = x16Var2;
            i3 |= l46Var.i(x16Var3) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        } else {
            x16Var3 = x16Var2;
        }
        if (l46Var.W(i3 & 1, (i3 & 147) != 146)) {
            boolean z3 = i4 != 0 ? true : z2;
            int i5 = k8b.e((e8b) l46Var.k(l8b.a)) ? R.drawable.img_home_daily_fortune_tomorrow_classic : R.drawable.img_home_daily_fortune_tomorrow_neo;
            j09 j09VarA0 = ynb.a0(b.c, 12.0f, 32.0f);
            xn8 xn8VarC = s21.c(ndb.w, false);
            int iHashCode = Long.hashCode(l46Var.T);
            u8a u8aVarM = l46Var.m();
            j09 j09VarJ = m93.J(l46Var, j09VarA0);
            lf2.q.getClass();
            l46Var.j0();
            if (l46Var.S) {
                l46Var.l(LayoutNode.h1);
            } else {
                l46Var.s0();
            }
            dec.l(hj6.z, l46Var, xn8VarC);
            dec.l(hj6.y, l46Var, u8aVarM);
            dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode));
            dec.k(l46Var);
            dec.l(hj6.x, l46Var, j09VarJ);
            String strQ = afc.q(R.string.daily_fortune_reminder_tomorrow_only_title, l46Var);
            String strQ2 = afc.q(R.string.daily_fortune_reminder_tomorrow_only_subtitle, l46Var);
            String strQ3 = afc.q(R.string.daily_fortune_reminder_tomorrow_only_cta, l46Var);
            g09 g09Var = g09.a;
            int i6 = i3 << 12;
            x16 x16Var4 = x16Var3;
            nk8.h(strQ, strQ2, strQ3, i5, z3, x16Var, x16Var4, androidx.compose.ui.platform.b.a(g09Var, "reminder-guide-cta"), b.q(0.0f, 369.0f, g09Var, 1), l46Var, (i6 & 3670016) | (57344 & i6) | 113246208 | (458752 & i6), 0);
            l46Var.r(true);
            z2 = z3;
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new p83(z2, x16Var, x16Var2, i, i2, 0);
        }
    }

    public static final LocalTime n(d83 d83Var) {
        d83Var.getClass();
        int iOrdinal = d83Var.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            LocalTime localTimeOf = LocalTime.of(9, 0);
            localTimeOf.getClass();
            return localTimeOf;
        }
        if (iOrdinal != 2) {
            ap.c();
            return null;
        }
        LocalTime localTimeOf2 = LocalTime.of(20, 0);
        localTimeOf2.getClass();
        return localTimeOf2;
    }

    public static final y6c o(l46 l46Var) {
        float f = we6.e(l46Var) ? 4.0f : 12.0f;
        boolean zD = l46Var.d(f);
        Object objR = l46Var.R();
        if (zD || objR == sf2.a) {
            objR = a7c.b(f);
            l46Var.p0(objR);
        }
        return (y6c) objR;
    }
}
