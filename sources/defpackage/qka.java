package defpackage;

import android.content.Context;
import android.graphics.ColorMatrixColorFilter;
import android.util.Patterns;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.Iterator;
import java.util.List;
import tech.chatmind.api.events.model.Background;
import tech.chatmind.api.events.model.Popup;
import tech.chatmind.api.events.model.PopupAction;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class qka {
    /* JADX WARN: Code duplicated, block: B:101:0x017f  */
    /* JADX WARN: Code duplicated, block: B:103:0x0185  */
    /* JADX WARN: Code duplicated, block: B:105:0x019c  */
    /* JADX WARN: Code duplicated, block: B:107:0x01b8 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:108:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:111:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:112:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:115:0x01e0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:116:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:119:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:120:0x0201  */
    /* JADX WARN: Code duplicated, block: B:124:0x0217  */
    /* JADX WARN: Code duplicated, block: B:127:0x0221 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:128:0x0223  */
    /* JADX WARN: Code duplicated, block: B:132:0x027e  */
    /* JADX WARN: Code duplicated, block: B:135:0x028b  */
    /* JADX WARN: Code duplicated, block: B:137:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:138:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004f  */
    /* JADX WARN: Code duplicated, block: B:28:0x0054  */
    /* JADX WARN: Code duplicated, block: B:30:0x0058  */
    /* JADX WARN: Code duplicated, block: B:32:0x0060  */
    /* JADX WARN: Code duplicated, block: B:33:0x0063  */
    /* JADX WARN: Code duplicated, block: B:37:0x006a  */
    /* JADX WARN: Code duplicated, block: B:39:0x0072  */
    /* JADX WARN: Code duplicated, block: B:40:0x0075  */
    /* JADX WARN: Code duplicated, block: B:42:0x0079  */
    /* JADX WARN: Code duplicated, block: B:45:0x007f  */
    /* JADX WARN: Code duplicated, block: B:47:0x0087  */
    /* JADX WARN: Code duplicated, block: B:48:0x008a  */
    /* JADX WARN: Code duplicated, block: B:50:0x008e  */
    /* JADX WARN: Code duplicated, block: B:53:0x0096  */
    /* JADX WARN: Code duplicated, block: B:54:0x009c  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:64:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:69:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:73:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:74:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:77:0x00e9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:78:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:80:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:81:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:86:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:87:0x0100  */
    /* JADX WARN: Code duplicated, block: B:90:0x010d  */
    /* JADX WARN: Code duplicated, block: B:93:0x012b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:94:0x012d  */
    /* JADX WARN: Code duplicated, block: B:97:0x0164 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:98:0x0166  */
    public static final void a(final uma umaVar, x16 x16Var, boolean z, final a26 a26Var, final x16 x16Var2, long j, a26 a26Var2, l46 l46Var, final int i, final int i2) {
        int i3;
        x16 x16Var3;
        int i4;
        boolean z2;
        int i5;
        x16 x16Var4;
        int i6;
        int i7;
        long j2;
        int i8;
        int i9;
        a26 a26Var3;
        int i10;
        boolean z3;
        final x16 x16Var5;
        final boolean z4;
        final long j3;
        final a26 a26Var4;
        ojb ojbVarV;
        boolean z5;
        final x16 x16Var6;
        int i11;
        final long j4;
        a26 a26Var5;
        Popup popup;
        Object objR;
        Object obj;
        e89 e89Var;
        boolean zG;
        Object objR2;
        e89 e89Var2;
        e89 e89VarI;
        final boolean z6;
        boolean zG2;
        Object objR3;
        final a26 a26Var6;
        int i12;
        e89 e89VarI2;
        boolean zH;
        Object objR4;
        ted tedVarF;
        boolean z7;
        boolean z8;
        Object objR5;
        boolean z9;
        boolean zG3;
        Object objR6;
        e89 e89Var3;
        e89 e89Var4;
        ojb ojbVarV2;
        int i13;
        int i14;
        umaVar.getClass();
        Object obj2 = umaVar.a;
        a26Var.getClass();
        x16Var2.getClass();
        l46Var.h0(2040344019);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? l46Var.g(umaVar) : l46Var.i(umaVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i15 = i2 & 2;
        if (i15 == 0) {
            if ((i & 48) == 0) {
                x16Var3 = x16Var;
                i3 |= l46Var.i(x16Var3) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    z2 = z;
                    if (l46Var.h(z2)) {
                        i5 = 256;
                    } else {
                        i5 = UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                    }
                    i3 |= i5;
                }
                if ((i & 3072) != 0) {
                    if (l46Var.i(a26Var)) {
                        i14 = 2048;
                    } else {
                        i14 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                    }
                    i3 |= i14;
                }
                if ((i & 24576) == 0) {
                    x16Var4 = x16Var2;
                    if (l46Var.i(x16Var4)) {
                        i13 = 16384;
                    } else {
                        i13 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                    }
                    i3 |= i13;
                } else {
                    x16Var4 = x16Var2;
                }
                i6 = i2 & 32;
                if (i6 != 0) {
                    i3 |= 196608;
                    i7 = i6;
                    j2 = j;
                } else {
                    i7 = i6;
                    j2 = j;
                    if ((196608 & i) == 0) {
                        if (l46Var.f(j2)) {
                            i8 = 131072;
                        } else {
                            i8 = 65536;
                        }
                        i3 |= i8;
                    }
                }
                i9 = i2 & 64;
                if (i9 != 0) {
                    i3 |= 1572864;
                    a26Var3 = a26Var2;
                } else {
                    a26Var3 = a26Var2;
                    if ((i & 1572864) == 0) {
                        if (l46Var.i(a26Var3)) {
                            i10 = 1048576;
                        } else {
                            i10 = 524288;
                        }
                        i3 |= i10;
                    }
                }
                if ((i3 & 599187) != 599186) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (l46Var.W(i3 & 1, z3)) {
                    if (i15 != 0) {
                        x16Var3 = null;
                    }
                    if (i4 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    if (i7 != 0) {
                        j2 = 0;
                    }
                    x16Var6 = x16Var3;
                    i11 = i3;
                    j4 = j2;
                    if (i9 != 0) {
                        a26Var5 = null;
                    } else {
                        a26Var5 = a26Var3;
                    }
                    popup = umaVar.c;
                    Object[] objArr = new Object[0];
                    objR = l46Var.R();
                    obj = sf2.a;
                    if (objR == obj) {
                        objR = new bca(17);
                        l46Var.p0(objR);
                    }
                    e89Var = (e89) vfh.I(objArr, (x16) objR, l46Var, 48);
                    zG = l46Var.g(obj2);
                    objR2 = l46Var.R();
                    if (zG || objR2 == obj) {
                        objR2 = q1c.f(Boolean.FALSE);
                        l46Var.p0(objR2);
                    }
                    e89Var2 = (e89) objR2;
                    e89VarI = q1c.i(a26Var5, l46Var);
                    z6 = z5;
                    Boolean bool = (Boolean) e89Var.getValue();
                    bool.getClass();
                    Long lValueOf = Long.valueOf(j4);
                    zG2 = l46Var.g(e89VarI) | l46Var.g(e89Var);
                    objR3 = l46Var.R();
                    a26Var6 = a26Var5;
                    i12 = 6;
                    if (zG2 || objR3 == obj) {
                        objR3 = new ls2(e89VarI, e89Var, i12);
                        l46Var.p0(objR3);
                    }
                    af1.h(bool, lValueOf, (a26) objR3, l46Var);
                    if (!((Boolean) e89Var.getValue()).booleanValue()) {
                        ojbVarV2 = l46Var.v();
                        if (ojbVarV2 != null) {
                            final int i16 = 1;
                            final x16 x16Var7 = x16Var4;
                            ojbVarV2.d = new l26() { // from class: eka
                                @Override // defpackage.l26
                                public final Object z(Object obj3, Object obj4) {
                                    int i17 = i16;
                                    wef wefVar = wef.a;
                                    int i18 = i;
                                    switch (i17) {
                                        case 0:
                                            ((Integer) obj4).getClass();
                                            int iP = k99.P(i18 | 1);
                                            qka.a(umaVar, x16Var6, z6, a26Var, x16Var7, j4, a26Var6, (l46) obj3, iP, i2);
                                            break;
                                        default:
                                            ((Integer) obj4).getClass();
                                            int iP2 = k99.P(i18 | 1);
                                            qka.a(umaVar, x16Var6, z6, a26Var, x16Var7, j4, a26Var6, (l46) obj3, iP2, i2);
                                            break;
                                    }
                                    return wefVar;
                                }
                            };
                            return;
                        }
                        return;
                    }
                    e89VarI2 = q1c.i(Boolean.valueOf(z6), l46Var);
                    zH = l46Var.h(popup.getCanClose());
                    objR4 = l46Var.R();
                    if (zH || objR4 == obj) {
                        objR4 = new kz8(24, popup, e89VarI2);
                        l46Var.p0(objR4);
                    }
                    tedVarF = zz8.f(6, 0, (a26) objR4, l46Var);
                    boolean zG4 = l46Var.g(tedVarF);
                    if ((i11 & 112) == 32) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    z8 = zG4 | z7;
                    objR5 = l46Var.R();
                    if (z8 || objR5 == obj) {
                        objR5 = new mka(null, x16Var6, tedVarF);
                        l46Var.p0(objR5);
                    }
                    af1.p(obj2, tedVarF, (l26) objR5, l46Var);
                    long j5 = y72.j;
                    boolean zI = l46Var.i(popup);
                    if ((i11 & 896) == 256) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    zG3 = zI | z9 | l46Var.g(e89Var2) | l46Var.g(e89Var) | ((57344 & i11) == 16384);
                    objR6 = l46Var.R();
                    if (!zG3 || objR6 == obj) {
                        e89Var3 = e89Var2;
                        e89Var4 = e89Var;
                        Object h20Var = new h20(popup, z6, x16Var2, e89Var3, e89Var4);
                        l46Var.p0(h20Var);
                        objR6 = h20Var;
                    } else {
                        e89Var4 = e89Var;
                        e89Var3 = e89Var2;
                    }
                    zz8.a((x16) objR6, null, tedVarF, 0.0f, false, null, j5, 0L, 0L, null, null, null, af1.b0(2036024757, new g30(popup, z6, e89Var3, e89Var4, tedVarF, a26Var, x16Var2), l46Var), l46Var, 1572864, 3078, 7098);
                    x16Var5 = x16Var6;
                    a26Var4 = a26Var6;
                    z4 = z6;
                    j3 = j4;
                } else {
                    l46Var.Z();
                    x16Var5 = x16Var3;
                    z4 = z2;
                    j3 = j2;
                    a26Var4 = a26Var3;
                }
                ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    final int i17 = 0;
                    ojbVarV.d = new l26() { // from class: eka
                        @Override // defpackage.l26
                        public final Object z(Object obj3, Object obj4) {
                            int i18 = i17;
                            wef wefVar = wef.a;
                            int i19 = i;
                            switch (i18) {
                                case 0:
                                    ((Integer) obj4).getClass();
                                    int iP = k99.P(i19 | 1);
                                    qka.a(umaVar, x16Var5, z4, a26Var, x16Var2, j3, a26Var4, (l46) obj3, iP, i2);
                                    break;
                                default:
                                    ((Integer) obj4).getClass();
                                    int iP2 = k99.P(i19 | 1);
                                    qka.a(umaVar, x16Var5, z4, a26Var, x16Var2, j3, a26Var4, (l46) obj3, iP2, i2);
                                    break;
                            }
                            return wefVar;
                        }
                    };
                }
            }
            i3 |= 384;
            z2 = z;
            if ((i & 3072) != 0) {
                if (l46Var.i(a26Var)) {
                    i14 = 2048;
                } else {
                    i14 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                }
                i3 |= i14;
            }
            if ((i & 24576) == 0) {
                x16Var4 = x16Var2;
                if (l46Var.i(x16Var4)) {
                    i13 = 16384;
                } else {
                    i13 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                }
                i3 |= i13;
            } else {
                x16Var4 = x16Var2;
            }
            i6 = i2 & 32;
            if (i6 != 0) {
                i3 |= 196608;
                i7 = i6;
                j2 = j;
            } else {
                i7 = i6;
                j2 = j;
                if ((196608 & i) == 0) {
                    if (l46Var.f(j2)) {
                        i8 = 131072;
                    } else {
                        i8 = 65536;
                    }
                    i3 |= i8;
                }
            }
            i9 = i2 & 64;
            if (i9 != 0) {
                i3 |= 1572864;
                a26Var3 = a26Var2;
            } else {
                a26Var3 = a26Var2;
                if ((i & 1572864) == 0) {
                    if (l46Var.i(a26Var3)) {
                        i10 = 1048576;
                    } else {
                        i10 = 524288;
                    }
                    i3 |= i10;
                }
            }
            if ((i3 & 599187) != 599186) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (l46Var.W(i3 & 1, z3)) {
                if (i15 != 0) {
                    x16Var3 = null;
                }
                if (i4 != 0) {
                    z5 = true;
                } else {
                    z5 = z2;
                }
                if (i7 != 0) {
                    j2 = 0;
                }
                x16Var6 = x16Var3;
                i11 = i3;
                j4 = j2;
                if (i9 != 0) {
                    a26Var5 = null;
                } else {
                    a26Var5 = a26Var3;
                }
                popup = umaVar.c;
                Object[] objArr2 = new Object[0];
                objR = l46Var.R();
                obj = sf2.a;
                if (objR == obj) {
                    objR = new bca(17);
                    l46Var.p0(objR);
                }
                e89Var = (e89) vfh.I(objArr2, (x16) objR, l46Var, 48);
                zG = l46Var.g(obj2);
                objR2 = l46Var.R();
                if (zG) {
                    objR2 = q1c.f(Boolean.FALSE);
                    l46Var.p0(objR2);
                } else {
                    objR2 = q1c.f(Boolean.FALSE);
                    l46Var.p0(objR2);
                }
                e89Var2 = (e89) objR2;
                e89VarI = q1c.i(a26Var5, l46Var);
                z6 = z5;
                Boolean bool2 = (Boolean) e89Var.getValue();
                bool2.getClass();
                Long lValueOf2 = Long.valueOf(j4);
                zG2 = l46Var.g(e89VarI) | l46Var.g(e89Var);
                objR3 = l46Var.R();
                a26Var6 = a26Var5;
                i12 = 6;
                if (zG2) {
                    objR3 = new ls2(e89VarI, e89Var, i12);
                    l46Var.p0(objR3);
                } else {
                    objR3 = new ls2(e89VarI, e89Var, i12);
                    l46Var.p0(objR3);
                }
                af1.h(bool2, lValueOf2, (a26) objR3, l46Var);
                if (!((Boolean) e89Var.getValue()).booleanValue()) {
                    ojbVarV2 = l46Var.v();
                    if (ojbVarV2 != null) {
                        final int i18 = 1;
                        final x16 x16Var8 = x16Var4;
                        ojbVarV2.d = new l26() { // from class: eka
                            @Override // defpackage.l26
                            public final Object z(Object obj3, Object obj4) {
                                int i19 = i18;
                                wef wefVar = wef.a;
                                int i110 = i;
                                switch (i19) {
                                    case 0:
                                        ((Integer) obj4).getClass();
                                        int iP = k99.P(i110 | 1);
                                        qka.a(umaVar, x16Var6, z6, a26Var, x16Var8, j4, a26Var6, (l46) obj3, iP, i2);
                                        break;
                                    default:
                                        ((Integer) obj4).getClass();
                                        int iP2 = k99.P(i110 | 1);
                                        qka.a(umaVar, x16Var6, z6, a26Var, x16Var8, j4, a26Var6, (l46) obj3, iP2, i2);
                                        break;
                                }
                                return wefVar;
                            }
                        };
                        return;
                    }
                    return;
                }
                e89VarI2 = q1c.i(Boolean.valueOf(z6), l46Var);
                zH = l46Var.h(popup.getCanClose());
                objR4 = l46Var.R();
                if (zH) {
                    objR4 = new kz8(24, popup, e89VarI2);
                    l46Var.p0(objR4);
                } else {
                    objR4 = new kz8(24, popup, e89VarI2);
                    l46Var.p0(objR4);
                }
                tedVarF = zz8.f(6, 0, (a26) objR4, l46Var);
                boolean zG5 = l46Var.g(tedVarF);
                if ((i11 & 112) == 32) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                z8 = zG5 | z7;
                objR5 = l46Var.R();
                if (z8) {
                    objR5 = new mka(null, x16Var6, tedVarF);
                    l46Var.p0(objR5);
                } else {
                    objR5 = new mka(null, x16Var6, tedVarF);
                    l46Var.p0(objR5);
                }
                af1.p(obj2, tedVarF, (l26) objR5, l46Var);
                long j6 = y72.j;
                boolean zI2 = l46Var.i(popup);
                if ((i11 & 896) == 256) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                zG3 = zI2 | z9 | l46Var.g(e89Var2) | l46Var.g(e89Var) | ((57344 & i11) == 16384);
                objR6 = l46Var.R();
                if (zG3) {
                    e89Var3 = e89Var2;
                    e89Var4 = e89Var;
                    Object h20Var2 = new h20(popup, z6, x16Var2, e89Var3, e89Var4);
                    l46Var.p0(h20Var2);
                    objR6 = h20Var2;
                } else {
                    e89Var3 = e89Var2;
                    e89Var4 = e89Var;
                    Object h20Var3 = new h20(popup, z6, x16Var2, e89Var3, e89Var4);
                    l46Var.p0(h20Var3);
                    objR6 = h20Var3;
                }
                zz8.a((x16) objR6, null, tedVarF, 0.0f, false, null, j6, 0L, 0L, null, null, null, af1.b0(2036024757, new g30(popup, z6, e89Var3, e89Var4, tedVarF, a26Var, x16Var2), l46Var), l46Var, 1572864, 3078, 7098);
                x16Var5 = x16Var6;
                a26Var4 = a26Var6;
                z4 = z6;
                j3 = j4;
            } else {
                l46Var.Z();
                x16Var5 = x16Var3;
                z4 = z2;
                j3 = j2;
                a26Var4 = a26Var3;
            }
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                final int i19 = 0;
                ojbVarV.d = new l26() { // from class: eka
                    @Override // defpackage.l26
                    public final Object z(Object obj3, Object obj4) {
                        int i110 = i19;
                        wef wefVar = wef.a;
                        int i111 = i;
                        switch (i110) {
                            case 0:
                                ((Integer) obj4).getClass();
                                int iP = k99.P(i111 | 1);
                                qka.a(umaVar, x16Var5, z4, a26Var, x16Var2, j3, a26Var4, (l46) obj3, iP, i2);
                                break;
                            default:
                                ((Integer) obj4).getClass();
                                int iP2 = k99.P(i111 | 1);
                                qka.a(umaVar, x16Var5, z4, a26Var, x16Var2, j3, a26Var4, (l46) obj3, iP2, i2);
                                break;
                        }
                        return wefVar;
                    }
                };
            }
        }
        i3 |= 48;
        x16Var3 = x16Var;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 384) == 0) {
                z2 = z;
                if (l46Var.h(z2)) {
                    i5 = 256;
                } else {
                    i5 = UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                }
                i3 |= i5;
            }
            if ((i & 3072) != 0) {
                if (l46Var.i(a26Var)) {
                    i14 = 2048;
                } else {
                    i14 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                }
                i3 |= i14;
            }
            if ((i & 24576) == 0) {
                x16Var4 = x16Var2;
                if (l46Var.i(x16Var4)) {
                    i13 = 16384;
                } else {
                    i13 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                }
                i3 |= i13;
            } else {
                x16Var4 = x16Var2;
            }
            i6 = i2 & 32;
            if (i6 != 0) {
                i3 |= 196608;
                i7 = i6;
                j2 = j;
            } else {
                i7 = i6;
                j2 = j;
                if ((196608 & i) == 0) {
                    if (l46Var.f(j2)) {
                        i8 = 131072;
                    } else {
                        i8 = 65536;
                    }
                    i3 |= i8;
                }
            }
            i9 = i2 & 64;
            if (i9 != 0) {
                i3 |= 1572864;
                a26Var3 = a26Var2;
            } else {
                a26Var3 = a26Var2;
                if ((i & 1572864) == 0) {
                    if (l46Var.i(a26Var3)) {
                        i10 = 1048576;
                    } else {
                        i10 = 524288;
                    }
                    i3 |= i10;
                }
            }
            if ((i3 & 599187) != 599186) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (l46Var.W(i3 & 1, z3)) {
                if (i15 != 0) {
                    x16Var3 = null;
                }
                if (i4 != 0) {
                    z5 = true;
                } else {
                    z5 = z2;
                }
                if (i7 != 0) {
                    j2 = 0;
                }
                x16Var6 = x16Var3;
                i11 = i3;
                j4 = j2;
                if (i9 != 0) {
                    a26Var5 = null;
                } else {
                    a26Var5 = a26Var3;
                }
                popup = umaVar.c;
                Object[] objArr3 = new Object[0];
                objR = l46Var.R();
                obj = sf2.a;
                if (objR == obj) {
                    objR = new bca(17);
                    l46Var.p0(objR);
                }
                e89Var = (e89) vfh.I(objArr3, (x16) objR, l46Var, 48);
                zG = l46Var.g(obj2);
                objR2 = l46Var.R();
                if (zG) {
                    objR2 = q1c.f(Boolean.FALSE);
                    l46Var.p0(objR2);
                } else {
                    objR2 = q1c.f(Boolean.FALSE);
                    l46Var.p0(objR2);
                }
                e89Var2 = (e89) objR2;
                e89VarI = q1c.i(a26Var5, l46Var);
                z6 = z5;
                Boolean bool3 = (Boolean) e89Var.getValue();
                bool3.getClass();
                Long lValueOf3 = Long.valueOf(j4);
                zG2 = l46Var.g(e89VarI) | l46Var.g(e89Var);
                objR3 = l46Var.R();
                a26Var6 = a26Var5;
                i12 = 6;
                if (zG2) {
                    objR3 = new ls2(e89VarI, e89Var, i12);
                    l46Var.p0(objR3);
                } else {
                    objR3 = new ls2(e89VarI, e89Var, i12);
                    l46Var.p0(objR3);
                }
                af1.h(bool3, lValueOf3, (a26) objR3, l46Var);
                if (!((Boolean) e89Var.getValue()).booleanValue()) {
                    ojbVarV2 = l46Var.v();
                    if (ojbVarV2 != null) {
                        final int i110 = 1;
                        final x16 x16Var9 = x16Var4;
                        ojbVarV2.d = new l26() { // from class: eka
                            @Override // defpackage.l26
                            public final Object z(Object obj3, Object obj4) {
                                int i111 = i110;
                                wef wefVar = wef.a;
                                int i112 = i;
                                switch (i111) {
                                    case 0:
                                        ((Integer) obj4).getClass();
                                        int iP = k99.P(i112 | 1);
                                        qka.a(umaVar, x16Var6, z6, a26Var, x16Var9, j4, a26Var6, (l46) obj3, iP, i2);
                                        break;
                                    default:
                                        ((Integer) obj4).getClass();
                                        int iP2 = k99.P(i112 | 1);
                                        qka.a(umaVar, x16Var6, z6, a26Var, x16Var9, j4, a26Var6, (l46) obj3, iP2, i2);
                                        break;
                                }
                                return wefVar;
                            }
                        };
                        return;
                    }
                    return;
                }
                e89VarI2 = q1c.i(Boolean.valueOf(z6), l46Var);
                zH = l46Var.h(popup.getCanClose());
                objR4 = l46Var.R();
                if (zH) {
                    objR4 = new kz8(24, popup, e89VarI2);
                    l46Var.p0(objR4);
                } else {
                    objR4 = new kz8(24, popup, e89VarI2);
                    l46Var.p0(objR4);
                }
                tedVarF = zz8.f(6, 0, (a26) objR4, l46Var);
                boolean zG6 = l46Var.g(tedVarF);
                if ((i11 & 112) == 32) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                z8 = zG6 | z7;
                objR5 = l46Var.R();
                if (z8) {
                    objR5 = new mka(null, x16Var6, tedVarF);
                    l46Var.p0(objR5);
                } else {
                    objR5 = new mka(null, x16Var6, tedVarF);
                    l46Var.p0(objR5);
                }
                af1.p(obj2, tedVarF, (l26) objR5, l46Var);
                long j7 = y72.j;
                boolean zI3 = l46Var.i(popup);
                if ((i11 & 896) == 256) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                zG3 = zI3 | z9 | l46Var.g(e89Var2) | l46Var.g(e89Var) | ((57344 & i11) == 16384);
                objR6 = l46Var.R();
                if (zG3) {
                    e89Var3 = e89Var2;
                    e89Var4 = e89Var;
                    Object h20Var4 = new h20(popup, z6, x16Var2, e89Var3, e89Var4);
                    l46Var.p0(h20Var4);
                    objR6 = h20Var4;
                } else {
                    e89Var3 = e89Var2;
                    e89Var4 = e89Var;
                    Object h20Var5 = new h20(popup, z6, x16Var2, e89Var3, e89Var4);
                    l46Var.p0(h20Var5);
                    objR6 = h20Var5;
                }
                zz8.a((x16) objR6, null, tedVarF, 0.0f, false, null, j7, 0L, 0L, null, null, null, af1.b0(2036024757, new g30(popup, z6, e89Var3, e89Var4, tedVarF, a26Var, x16Var2), l46Var), l46Var, 1572864, 3078, 7098);
                x16Var5 = x16Var6;
                a26Var4 = a26Var6;
                z4 = z6;
                j3 = j4;
            } else {
                l46Var.Z();
                x16Var5 = x16Var3;
                z4 = z2;
                j3 = j2;
                a26Var4 = a26Var3;
            }
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                final int i111 = 0;
                ojbVarV.d = new l26() { // from class: eka
                    @Override // defpackage.l26
                    public final Object z(Object obj3, Object obj4) {
                        int i112 = i111;
                        wef wefVar = wef.a;
                        int i113 = i;
                        switch (i112) {
                            case 0:
                                ((Integer) obj4).getClass();
                                int iP = k99.P(i113 | 1);
                                qka.a(umaVar, x16Var5, z4, a26Var, x16Var2, j3, a26Var4, (l46) obj3, iP, i2);
                                break;
                            default:
                                ((Integer) obj4).getClass();
                                int iP2 = k99.P(i113 | 1);
                                qka.a(umaVar, x16Var5, z4, a26Var, x16Var2, j3, a26Var4, (l46) obj3, iP2, i2);
                                break;
                        }
                        return wefVar;
                    }
                };
            }
        }
        i3 |= 384;
        z2 = z;
        if ((i & 3072) != 0) {
            if (l46Var.i(a26Var)) {
                i14 = 2048;
            } else {
                i14 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i3 |= i14;
        }
        if ((i & 24576) == 0) {
            x16Var4 = x16Var2;
            if (l46Var.i(x16Var4)) {
                i13 = 16384;
            } else {
                i13 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
            }
            i3 |= i13;
        } else {
            x16Var4 = x16Var2;
        }
        i6 = i2 & 32;
        if (i6 != 0) {
            i3 |= 196608;
            i7 = i6;
            j2 = j;
        } else {
            i7 = i6;
            j2 = j;
            if ((196608 & i) == 0) {
                if (l46Var.f(j2)) {
                    i8 = 131072;
                } else {
                    i8 = 65536;
                }
                i3 |= i8;
            }
        }
        i9 = i2 & 64;
        if (i9 != 0) {
            i3 |= 1572864;
            a26Var3 = a26Var2;
        } else {
            a26Var3 = a26Var2;
            if ((i & 1572864) == 0) {
                if (l46Var.i(a26Var3)) {
                    i10 = 1048576;
                } else {
                    i10 = 524288;
                }
                i3 |= i10;
            }
        }
        if ((i3 & 599187) != 599186) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (l46Var.W(i3 & 1, z3)) {
            if (i15 != 0) {
                x16Var3 = null;
            }
            if (i4 != 0) {
                z5 = true;
            } else {
                z5 = z2;
            }
            if (i7 != 0) {
                j2 = 0;
            }
            x16Var6 = x16Var3;
            i11 = i3;
            j4 = j2;
            if (i9 != 0) {
                a26Var5 = null;
            } else {
                a26Var5 = a26Var3;
            }
            popup = umaVar.c;
            Object[] objArr4 = new Object[0];
            objR = l46Var.R();
            obj = sf2.a;
            if (objR == obj) {
                objR = new bca(17);
                l46Var.p0(objR);
            }
            e89Var = (e89) vfh.I(objArr4, (x16) objR, l46Var, 48);
            zG = l46Var.g(obj2);
            objR2 = l46Var.R();
            if (zG) {
                objR2 = q1c.f(Boolean.FALSE);
                l46Var.p0(objR2);
            } else {
                objR2 = q1c.f(Boolean.FALSE);
                l46Var.p0(objR2);
            }
            e89Var2 = (e89) objR2;
            e89VarI = q1c.i(a26Var5, l46Var);
            z6 = z5;
            Boolean bool4 = (Boolean) e89Var.getValue();
            bool4.getClass();
            Long lValueOf4 = Long.valueOf(j4);
            zG2 = l46Var.g(e89VarI) | l46Var.g(e89Var);
            objR3 = l46Var.R();
            a26Var6 = a26Var5;
            i12 = 6;
            if (zG2) {
                objR3 = new ls2(e89VarI, e89Var, i12);
                l46Var.p0(objR3);
            } else {
                objR3 = new ls2(e89VarI, e89Var, i12);
                l46Var.p0(objR3);
            }
            af1.h(bool4, lValueOf4, (a26) objR3, l46Var);
            if (!((Boolean) e89Var.getValue()).booleanValue()) {
                ojbVarV2 = l46Var.v();
                if (ojbVarV2 != null) {
                    final int i112 = 1;
                    final x16 x16Var10 = x16Var4;
                    ojbVarV2.d = new l26() { // from class: eka
                        @Override // defpackage.l26
                        public final Object z(Object obj3, Object obj4) {
                            int i113 = i112;
                            wef wefVar = wef.a;
                            int i114 = i;
                            switch (i113) {
                                case 0:
                                    ((Integer) obj4).getClass();
                                    int iP = k99.P(i114 | 1);
                                    qka.a(umaVar, x16Var6, z6, a26Var, x16Var10, j4, a26Var6, (l46) obj3, iP, i2);
                                    break;
                                default:
                                    ((Integer) obj4).getClass();
                                    int iP2 = k99.P(i114 | 1);
                                    qka.a(umaVar, x16Var6, z6, a26Var, x16Var10, j4, a26Var6, (l46) obj3, iP2, i2);
                                    break;
                            }
                            return wefVar;
                        }
                    };
                    return;
                }
                return;
            }
            e89VarI2 = q1c.i(Boolean.valueOf(z6), l46Var);
            zH = l46Var.h(popup.getCanClose());
            objR4 = l46Var.R();
            if (zH) {
                objR4 = new kz8(24, popup, e89VarI2);
                l46Var.p0(objR4);
            } else {
                objR4 = new kz8(24, popup, e89VarI2);
                l46Var.p0(objR4);
            }
            tedVarF = zz8.f(6, 0, (a26) objR4, l46Var);
            boolean zG7 = l46Var.g(tedVarF);
            if ((i11 & 112) == 32) {
                z7 = true;
            } else {
                z7 = false;
            }
            z8 = zG7 | z7;
            objR5 = l46Var.R();
            if (z8) {
                objR5 = new mka(null, x16Var6, tedVarF);
                l46Var.p0(objR5);
            } else {
                objR5 = new mka(null, x16Var6, tedVarF);
                l46Var.p0(objR5);
            }
            af1.p(obj2, tedVarF, (l26) objR5, l46Var);
            long j8 = y72.j;
            boolean zI4 = l46Var.i(popup);
            if ((i11 & 896) == 256) {
                z9 = true;
            } else {
                z9 = false;
            }
            zG3 = zI4 | z9 | l46Var.g(e89Var2) | l46Var.g(e89Var) | ((57344 & i11) == 16384);
            objR6 = l46Var.R();
            if (zG3) {
                e89Var3 = e89Var2;
                e89Var4 = e89Var;
                Object h20Var6 = new h20(popup, z6, x16Var2, e89Var3, e89Var4);
                l46Var.p0(h20Var6);
                objR6 = h20Var6;
            } else {
                e89Var3 = e89Var2;
                e89Var4 = e89Var;
                Object h20Var7 = new h20(popup, z6, x16Var2, e89Var3, e89Var4);
                l46Var.p0(h20Var7);
                objR6 = h20Var7;
            }
            zz8.a((x16) objR6, null, tedVarF, 0.0f, false, null, j8, 0L, 0L, null, null, null, af1.b0(2036024757, new g30(popup, z6, e89Var3, e89Var4, tedVarF, a26Var, x16Var2), l46Var), l46Var, 1572864, 3078, 7098);
            x16Var5 = x16Var6;
            a26Var4 = a26Var6;
            z4 = z6;
            j3 = j4;
        } else {
            l46Var.Z();
            x16Var5 = x16Var3;
            z4 = z2;
            j3 = j2;
            a26Var4 = a26Var3;
        }
        ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            final int i113 = 0;
            ojbVarV.d = new l26() { // from class: eka
                @Override // defpackage.l26
                public final Object z(Object obj3, Object obj4) {
                    int i114 = i113;
                    wef wefVar = wef.a;
                    int i115 = i;
                    switch (i114) {
                        case 0:
                            ((Integer) obj4).getClass();
                            int iP = k99.P(i115 | 1);
                            qka.a(umaVar, x16Var5, z4, a26Var, x16Var2, j3, a26Var4, (l46) obj3, iP, i2);
                            break;
                        default:
                            ((Integer) obj4).getClass();
                            int iP2 = k99.P(i115 | 1);
                            qka.a(umaVar, x16Var5, z4, a26Var, x16Var2, j3, a26Var4, (l46) obj3, iP2, i2);
                            break;
                    }
                    return wefVar;
                }
            };
        }
    }

    public static final void b(final Popup popup, final boolean z, a26 a26Var, x16 x16Var, l46 l46Var, int i) {
        int i2;
        a26 a26Var2;
        x16 x16Var2;
        Object obj;
        Object obj2;
        popup.getClass();
        a26Var.getClass();
        x16Var.getClass();
        l46Var.h0(392375562);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? l46Var.g(popup) : l46Var.i(popup) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= l46Var.h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            a26Var2 = a26Var;
            i2 |= l46Var.i(a26Var2) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        } else {
            a26Var2 = a26Var;
        }
        if ((i & 3072) == 0) {
            x16Var2 = x16Var;
            i2 |= l46Var.i(x16Var2) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        } else {
            x16Var2 = x16Var;
        }
        if (l46Var.W(i2 & 1, (i2 & 1171) != 1170)) {
            b1b b1bVar = l8b.a;
            final boolean zF = k8b.f((e8b) l46Var.k(b1bVar));
            boolean z2 = g21.S(l46Var) && !zF;
            Background background = popup.getBackground();
            final xja xjaVar = new xja(z2 ? background.getLight() : background.getDark(), z2 ? popup.getIcon().getLight() : popup.getIcon().getDark());
            boolean zH = l46Var.h(zF);
            Object objR = l46Var.R();
            if (zH || objR == sf2.a) {
                if (zF) {
                    float[] fArrX = feg.x();
                    feg.T(fArrX);
                    i82 i82Var = new i82(new ColorMatrixColorFilter(fArrX));
                    i82Var.b = fArrX;
                    obj = i82Var;
                } else {
                    obj = null;
                }
                l46Var.p0(obj);
                obj2 = obj;
            }
            obj2 = objR;
            final c82 c82Var = (c82) obj2;
            y6c y6cVar = eze.a(l46Var).a.i;
            j09 j09VarW = g09.a;
            j09 j09VarO = tm7.o(oa7.E(ynb.a0(b.r(b.c(j09VarW, 1.0f)), 24.0f, 32.0f), y6cVar), ((e8b) l46Var.k(b1bVar)).a, g21.f);
            if (zF) {
                l46Var.f0(-1639821792);
                j09VarW = db6.w(j09VarW, 1.0f, ((e8b) l46Var.k(b1bVar)).z, y6cVar);
                l46Var.r(false);
            } else {
                l46Var.f0(-1639730342);
                l46Var.r(false);
            }
            j09 j09VarD = j09VarO.D(j09VarW);
            final a26 a26Var3 = a26Var2;
            final x16 x16Var3 = x16Var2;
            nk8.d(j09VarD, null, af1.b0(79490528, new n26() { // from class: fka
                /* JADX WARN: Code duplicated, block: B:36:0x00ea  */
                @Override // defpackage.n26
                public final Object m(Object obj3, Object obj4, Object obj5) {
                    float f;
                    boolean z3;
                    y6c y6cVarB;
                    Integer num;
                    Integer num2;
                    e31 e31Var = (e31) obj3;
                    l46 l46Var2 = (l46) obj4;
                    int iIntValue = ((Integer) obj5).intValue();
                    e31Var.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= l46Var2.g(e31Var) ? 4 : 2;
                    }
                    if (l46Var2.W(iIntValue & 1, (iIntValue & 19) != 18)) {
                        g09 g09Var = g09.a;
                        j09 j09VarP = pa7.p(e31Var.b(g09Var), zF ? 0.42f : 1.0f);
                        xja xjaVar2 = xjaVar;
                        String str = xjaVar2.a;
                        m8c m8cVar = an2.a;
                        c82 c82Var2 = c82Var;
                        gdc.a(str, null, j09VarP, m8cVar, c82Var2, l46Var2, 1572912, 1720);
                        j09 j09VarZ = ynb.Z(mh3.d0(b.f(0.0f, e31Var.c(), b.c(g09Var, 1.0f), 1), mh3.T(l46Var2), false, 14), 32.0f);
                        c92 c92VarA = a92.a(xc0.c, ndb.Z, l46Var2, 48);
                        int iHashCode = Long.hashCode(l46Var2.T);
                        u8a u8aVarM = l46Var2.m();
                        j09 j09VarJ = m93.J(l46Var2, j09VarZ);
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
                        Popup popup2 = popup;
                        List<Integer> iconSize = popup2.getIconSize();
                        float f2 = 128.0f;
                        if (iconSize == null || (num2 = (Integer) s72.y0(0, iconSize)) == null) {
                            f = 128.0f;
                        } else {
                            if (num2.intValue() <= 0) {
                                num2 = null;
                            }
                            if (num2 != null) {
                                int iIntValue2 = num2.intValue();
                                if (iIntValue2 > 280) {
                                    iIntValue2 = 280;
                                }
                                f = iIntValue2;
                            } else {
                                f = 128.0f;
                            }
                        }
                        List<Integer> iconSize2 = popup2.getIconSize();
                        if (iconSize2 != null && (num = (Integer) s72.y0(1, iconSize2)) != null) {
                            if (num.intValue() <= 0) {
                                num = null;
                            }
                            if (num != null) {
                                int iIntValue3 = num.intValue();
                                if (iIntValue3 > 240) {
                                    iIntValue3 = 240;
                                }
                                f2 = iIntValue3;
                            }
                        }
                        gdc.a(xjaVar2.b, null, b.m(g09Var, f, f2), null, c82Var2, l46Var2, 48, 1784);
                        String title = popup2.getTitle();
                        mue mueVar = pue.a;
                        mue mueVarN = pue.n(l46Var2);
                        pr4 pr4Var = l8b.a;
                        nte.b(title, null, ((e8b) l46Var2.k(pr4Var)).q, 0L, ar5.y, ((y8b) l46Var2.k(x8b.a)).a, 0L, null, new jme(3), 0L, 0, false, 0, 0, null, mueVarN, l46Var2, 1572864, 0, 129850);
                        o5c.f(l46Var2, b.d(g09Var, 8.0f));
                        nte.b(popup2.getDesc(), null, ((e8b) l46Var2.k(pr4Var)).r, 0L, null, null, 0L, null, new jme(3), 0L, 0, false, 0, 0, null, pue.e(l46Var2), l46Var2, 0, 0, 130042);
                        l46 l46Var3 = l46Var2;
                        o5c.f(l46Var3, b.d(g09Var, 24.0f));
                        l46Var3.f0(1143217790);
                        Iterator it = popup2.getActions().iterator();
                        int i3 = 0;
                        while (true) {
                            boolean zHasNext = it.hasNext();
                            boolean z4 = z;
                            if (!zHasNext) {
                                l46Var3.r(false);
                                l46Var3.r(true);
                                if (!popup2.getCanClose()) {
                                    l46Var3.f0(1577995138);
                                    l46Var3.r(false);
                                    break;
                                }
                                l46Var3.f0(1577799869);
                                l46 l46Var4 = l46Var3;
                                c8b.h(ynb.d0(0.0f, 9.0f, 9.0f, 0.0f, 9, e31Var.a(g09Var, ndb.d)), z4, 0L, 0L, null, x16Var3, l46Var4, 0, 28);
                                l46Var4.r(false);
                                break;
                            }
                            Object next = it.next();
                            int i4 = i3 + 1;
                            if (i3 < 0) {
                                t72.Z();
                                throw null;
                            }
                            final PopupAction popupAction = (PopupAction) next;
                            if (i3 > 0) {
                                ib8.r(12.0f, -59891644, l46Var3, l46Var3, g09Var);
                                z3 = false;
                            } else {
                                z3 = false;
                                l46Var3.f0(-1856601561);
                            }
                            l46Var3.r(z3);
                            int i5 = pka.b[popupAction.getType().ordinal()];
                            final a26 a26Var4 = a26Var3;
                            i8c i8cVar = sf2.a;
                            final int i6 = 1;
                            if (i5 == 1) {
                                l46Var3.f0(-1856510855);
                                j09 j09VarC = b.c(g09Var, 1.0f);
                                if (k8b.f((e8b) l46Var3.k(l8b.a))) {
                                    l46Var3.f0(-1856391567);
                                    y6cVarB = eze.a(l46Var3).a.j;
                                    l46Var3.r(false);
                                } else {
                                    l46Var3.f0(-1856331892);
                                    l46Var3.r(false);
                                    y6cVarB = a7c.b(20.0f);
                                }
                                boolean zG = l46Var3.g(a26Var4) | l46Var3.i(popupAction);
                                Object objR2 = l46Var3.R();
                                if (zG || objR2 == i8cVar) {
                                    final int i7 = 0;
                                    objR2 = new x16() { // from class: gka
                                        @Override // defpackage.x16
                                        public final Object invoke() {
                                            int i8 = i7;
                                            wef wefVar = wef.a;
                                            PopupAction popupAction2 = popupAction;
                                            a26 a26Var5 = a26Var4;
                                            switch (i8) {
                                                case 0:
                                                    a26Var5.d(popupAction2);
                                                    break;
                                                default:
                                                    a26Var5.d(popupAction2);
                                                    break;
                                            }
                                            return wefVar;
                                        }
                                    };
                                    l46Var3.p0(objR2);
                                }
                                l46 l46Var5 = l46Var3;
                                cgg.m((x16) objR2, j09VarC, z4, y6cVarB, null, null, af1.b0(477136134, new b39(popupAction, i6), l46Var3), l46Var5, 805306416, 496);
                                l46Var3 = l46Var5;
                                l46Var3.r(false);
                            } else {
                                l46Var3.f0(-1856056209);
                                j09 j09VarB = b.b(0.0f, 56.0f, b.c(g09Var, 1.0f), 1);
                                String strD = qka.d(popupAction.getText());
                                boolean zG2 = l46Var3.g(a26Var4) | l46Var3.i(popupAction);
                                Object objR3 = l46Var3.R();
                                if (zG2 || objR3 == i8cVar) {
                                    objR3 = new x16() { // from class: gka
                                        @Override // defpackage.x16
                                        public final Object invoke() {
                                            int i8 = i6;
                                            wef wefVar = wef.a;
                                            PopupAction popupAction2 = popupAction;
                                            a26 a26Var5 = a26Var4;
                                            switch (i8) {
                                                case 0:
                                                    a26Var5.d(popupAction2);
                                                    break;
                                                default:
                                                    a26Var5.d(popupAction2);
                                                    break;
                                            }
                                            return wefVar;
                                        }
                                    };
                                    l46Var3.p0(objR3);
                                }
                                l46 l46Var6 = l46Var3;
                                c8b.i(j09VarB, strD, null, null, 0L, 0.0f, z4, null, null, false, null, null, (x16) objR3, l46Var6, 6, 0, 4028);
                                l46Var3 = l46Var6;
                                l46Var3.r(false);
                            }
                            it = it;
                            i3 = i4;
                        }
                    } else {
                        l46Var2.Z();
                    }
                    return wef.a;
                }
            }, l46Var), l46Var, 3072, 6);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new a60(popup, z, a26Var, x16Var, i);
        }
    }

    public static final void c(final q7b q7bVar, final long j, final a26 a26Var, l46 l46Var, final int i) {
        l46 l46Var2 = l46Var;
        a26Var.getClass();
        l46Var2.h0(-1694418209);
        int i2 = i | (l46Var2.g(q7bVar) ? 4 : 2) | (l46Var2.f(j) ? 32 : 16) | (l46Var2.i(a26Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
        if (l46Var2.W(i2 & 1, (i2 & 147) != 146)) {
            pwf pwfVarA = qd8.a(l46Var2);
            if (pwfVarA == null) {
                qc0.p("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            fla flaVar = (fla) z5c.G(job.a.b(fla.class), pwfVarA.g(), null, b21.r(pwfVarA), kr7.b(l46Var2), null);
            e89 e89VarT = tm7.t(flaVar.c, l46Var2);
            e89 e89VarI = q1c.i(a26Var, l46Var);
            tka tkaVar = (tka) e89VarT.getValue();
            ska skaVar = tkaVar instanceof ska ? (ska) tkaVar : null;
            List<uma> list = skaVar != null ? skaVar.a : null;
            if (list == null) {
                list = pu4.a;
            }
            boolean z = ((tka) e89VarT.getValue()) instanceof ska;
            boolean zIsEmpty = true ^ list.isEmpty();
            Boolean boolValueOf = Boolean.valueOf(z);
            Boolean boolValueOf2 = Boolean.valueOf(zIsEmpty);
            Long lValueOf = Long.valueOf(j);
            boolean zH = l46Var2.h(z) | l46Var2.h(zIsEmpty) | l46Var2.g(e89VarI);
            Object objR = l46Var2.R();
            i8c i8cVar = sf2.a;
            if (zH || objR == i8cVar) {
                objR = new oka(z, zIsEmpty, e89VarI, null);
                l46Var2.p0(objR);
            }
            af1.q(boolValueOf, boolValueOf2, lValueOf, (l26) objR, l46Var2);
            if (!z || list.isEmpty()) {
                ojb ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    final int i3 = 0;
                    ojbVarV.d = new l26(q7bVar, j, a26Var, i, i3) { // from class: dka
                        public final /* synthetic */ int a;
                        public final /* synthetic */ q7b b;
                        public final /* synthetic */ long c;
                        public final /* synthetic */ a26 d;

                        {
                            this.a = i3;
                        }

                        @Override // defpackage.l26
                        public final Object z(Object obj, Object obj2) {
                            int i4 = this.a;
                            wef wefVar = wef.a;
                            switch (i4) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    int iP = k99.P(1);
                                    qka.c(this.b, this.c, this.d, (l46) obj, iP);
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    int iP2 = k99.P(1);
                                    qka.c(this.b, this.c, this.d, (l46) obj, iP2);
                                    break;
                            }
                            return wefVar;
                        }
                    };
                    return;
                }
                return;
            }
            a26 a26VarF = f(hc9.a, q7bVar, l46Var2);
            for (uma umaVar : list) {
                boolean zI = l46Var2.i(umaVar) | l46Var2.g(a26VarF) | l46Var2.i(flaVar);
                Object objR2 = l46Var2.R();
                if (zI || objR2 == i8cVar) {
                    objR2 = new bv9(a26VarF, umaVar, flaVar, 3);
                    l46Var2.p0(objR2);
                }
                a26 a26Var2 = (a26) objR2;
                boolean zI2 = l46Var2.i(flaVar) | l46Var2.i(umaVar);
                Object objR3 = l46Var2.R();
                if (zI2 || objR3 == i8cVar) {
                    objR3 = new ek9(18, flaVar, umaVar);
                    l46Var2.p0(objR3);
                }
                a(umaVar, null, false, a26Var2, (x16) objR3, j, (a26) e89VarI.getValue(), l46Var2, uma.d | ((i2 << 12) & 458752), 6);
                l46Var2 = l46Var;
                a26VarF = a26VarF;
                i8cVar = i8cVar;
            }
        } else {
            l46Var.Z();
        }
        ojb ojbVarV2 = l46Var.v();
        if (ojbVarV2 != null) {
            final int i4 = 1;
            ojbVarV2.d = new l26(q7bVar, j, a26Var, i, i4) { // from class: dka
                public final /* synthetic */ int a;
                public final /* synthetic */ q7b b;
                public final /* synthetic */ long c;
                public final /* synthetic */ a26 d;

                {
                    this.a = i4;
                }

                @Override // defpackage.l26
                public final Object z(Object obj, Object obj2) {
                    int i5 = this.a;
                    wef wefVar = wef.a;
                    switch (i5) {
                        case 0:
                            ((Integer) obj2).getClass();
                            int iP = k99.P(1);
                            qka.c(this.b, this.c, this.d, (l46) obj, iP);
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            int iP2 = k99.P(1);
                            qka.c(this.b, this.c, this.d, (l46) obj, iP2);
                            break;
                    }
                    return wefVar;
                }
            };
        }
    }

    public static final String d(String str) {
        if (str.length() <= 0) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        char cCharAt = str.charAt(0);
        sb.append((Object) (Character.isLowerCase(cCharAt) ? dec.n(cCharAt) : String.valueOf(cCharAt)));
        sb.append(str.substring(1));
        return sb.toString();
    }

    public static final boolean e(String str) {
        if (v4e.F(str, "test-report", false) || v4e.F(str, "/invite", false) || v4e.F(str, "/new-tarot-card", false) || str.equals("qixi2025")) {
            return true;
        }
        if (v4e.F(str, "/app", false)) {
            return v4e.F(str, "/app/new-tarot-card", false) || v4e.F(str, "/app/settings", false) || v4e.F(str, "/app/themes", false) || v4e.F(str, "/app/invite", false) || v4e.F(str, "/app/annual-report-2025", false) || v4e.F(str, "/app/fortune-report-2026", false) || v4e.F(str, "/app/seasonal-fortune-entry", false) || v4e.F(str, "/app/test-report", false) || v4e.F(str, "/app/index", false) || v4e.F(str, "/app/chat", false) || v4e.F(str, "/app/paywall/2510", false) || v4e.F(str, "/app/paywall", false);
        }
        return Patterns.WEB_URL.matcher(str).matches();
    }

    public static final a26 f(hc9 hc9Var, q7b q7bVar, l46 l46Var) {
        Object next;
        pwf pwfVarH;
        jr2 jr2Var = q7bVar.b;
        pr4 pr4Var = uq.b;
        Context context = (Context) l46Var.k(pr4Var);
        nfc nfcVarB = kr7.b(l46Var);
        boolean zBooleanValue = ((Boolean) l46Var.k(h57.a)).booleanValue();
        i8c i8cVar = sf2.a;
        if (zBooleanValue) {
            pwfVarH = ib8.h(l46Var, 1471494079, l46Var, false);
        } else {
            l46Var.f0(1471494731);
            Object objK = l46Var.k(pr4Var);
            Object objR = l46Var.R();
            if (objR == i8cVar) {
                objR = d5a.g;
                l46Var.p0(objR);
            }
            Iterator it = fyc.u((a26) objR, objK).iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!(((Context) next) instanceof pwf));
            pwfVarH = (pwf) next;
            l46Var.r(false);
        }
        if (pwfVarH == null) {
            qc0.p("No ViewModelStoreOwner found in the context chain");
            return null;
        }
        dc9 dc9Var = (dc9) z5c.G(job.a.b(dc9.class), pwfVarH.g(), null, b21.r(pwfVarH), nfcVarB, null);
        Object objR2 = l46Var.R();
        if (objR2 == i8cVar) {
            objR2 = new kf(dc9Var, hc9Var, context, q7bVar, jr2Var, 19);
            l46Var.p0(objR2);
        }
        return (a26) objR2;
    }
}
