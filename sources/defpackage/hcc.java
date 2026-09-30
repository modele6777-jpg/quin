package defpackage;

import ai.askquin.R;
import ai.askquin.model.TarotSkinIdentify;
import ai.askquin.ui.conversation.r0;
import ai.askquin.ui.draw.mixed.MixedDeckSnapshot;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;
import com.google.android.gms.common.api.Status;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class hcc {
    public static byte[] A(byte[]... bArr) {
        int i = 0;
        int length = 0;
        while (true) {
            if (i >= bArr.length) {
                break;
            }
            length += bArr[i].length;
            i++;
        }
        byte[] bArr2 = new byte[length];
        int i2 = 0;
        for (byte[] bArr3 : bArr) {
            int length2 = bArr3.length;
            System.arraycopy(bArr3, 0, bArr2, i2, length2);
            i2 += length2;
        }
        return bArr2;
    }

    public static int B(Parcel parcel, int i) {
        parcel.writeInt(i | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static void C(Parcel parcel, int i) {
        int iDataPosition = parcel.dataPosition();
        parcel.setDataPosition(i - 4);
        parcel.writeInt(iDataPosition - i);
        parcel.setDataPosition(iDataPosition);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final boolean z, final boolean z2, final String str, final x16 x16Var, final x16 x16Var2, final x16 x16Var3, final az1 az1Var, final boolean z3, final boolean z4, final boolean z5, final x16 x16Var4, j09 j09Var, l46 l46Var, final int i) {
        final j09 j09Var2;
        g09 g09Var;
        boolean z6;
        boolean z7;
        l46 l46Var2 = l46Var;
        y02 y02Var = g21.f;
        x16Var.getClass();
        x16Var2.getClass();
        l46Var2.h0(460239705);
        int i2 = i | (l46Var2.h(z) ? 4 : 2) | (l46Var2.h(z2) ? 32 : 16) | (l46Var2.g(str) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var2.i(x16Var) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE) | (l46Var2.i(x16Var2) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE) | (l46Var2.i(x16Var3) ? 131072 : 65536) | (l46Var2.g(az1Var) ? 1048576 : 524288) | (l46Var2.h(z3) ? 8388608 : 4194304) | (l46Var2.h(z4) ? 67108864 : 33554432) | (l46Var2.h(z5) ? 536870912 : 268435456);
        if (l46Var2.W(i2 & 1, ((i2 & 306783379) == 306783378 && ((((l46Var2.i(x16Var4) ? 4 : 2) | 48) == true ? 1 : 0) & 19) == 18) ? false : true)) {
            g09 g09Var2 = g09.a;
            j09 j09VarD0 = ynb.d0(0.0f, 0.0f, 0.0f, 24.0f, 7, ynb.b0(24.0f, 0.0f, ynb.d0(0.0f, 16.0f, 0.0f, 0.0f, 13, mh3.N(b.c(g09Var2, 1.0f))), 2));
            c92 c92VarA = a92.a(new uc0(12.0f, true, new qc0(0)), ndb.Y, l46Var2, 6);
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
            if (z && z3) {
                l46Var2.f0(-172676350);
                j09 j09VarD = b.d(b.c(g09Var2, 1.0f), 56.0f);
                String strQ = afc.q(x16Var4 != null ? R.string.button_retry : R.string.quick_draw_ask_for_reading, l46Var2);
                boolean z8 = z5 || x16Var4 != null;
                kn2 kn2Var = z4 ? ed.E0 : dd.E0;
                x16 x16Var5 = x16Var4 == null ? x16Var2 : x16Var4;
                x4d x4dVar = eze.a(l46Var2).a.a;
                x4dVar.getClass();
                c8b.j(j09VarD, strQ, z8, kn2Var, 0.0f, we6.e(l46Var2) ? y02Var : x4dVar, null, null, false, x16Var5, l46Var2, 4102, 464);
                l46Var2 = l46Var2;
                l46Var2.r(false);
            } else {
                g09Var2 = g09Var2;
                if (z && z2) {
                    l46Var2.f0(-172168074);
                    hfc.a(((i2 >> 6) & 14) | 48, l46Var2, b.c(g09Var2, 1.0f), str);
                    l46Var2.r(false);
                } else {
                    i8c i8cVar = sf2.a;
                    if (z) {
                        l46Var2.f0(-171967256);
                        if (x16Var3 != null) {
                            l46Var2.f0(-171937930);
                            j09 j09VarD2 = b.d(b.c(g09Var2, 1.0f), 56.0f);
                            String strQ2 = afc.q(R.string.add_more_info_for_reading, l46Var2);
                            x4d x4dVar2 = eze.a(l46Var2).a.a;
                            x4dVar2.getClass();
                            if (we6.e(l46Var2)) {
                                x4dVar2 = y02Var;
                            }
                            int i3 = i2 & 3670016;
                            boolean z9 = (i3 == 1048576) | ((i2 & 458752) == 131072);
                            Object objR = l46Var2.R();
                            if (z9 || objR == i8cVar) {
                                final int i4 = 0;
                                objR = new x16() { // from class: xbf
                                    @Override // defpackage.x16
                                    public final Object invoke() {
                                        int i5 = i4;
                                        wef wefVar = wef.a;
                                        p05 p05Var = p05.a;
                                        az1 az1Var2 = az1Var;
                                        x16 x16Var6 = x16Var3;
                                        switch (i5) {
                                            case 0:
                                                x1f x1fVar = x1f.a;
                                                x1f.k(p05Var, new xna(az1Var2, 3), 2);
                                                x16Var6.invoke();
                                                break;
                                            default:
                                                x1f x1fVar2 = x1f.a;
                                                x1f.k(p05Var, new xna(az1Var2, 4), 2);
                                                x16Var6.invoke();
                                                break;
                                        }
                                        return wefVar;
                                    }
                                };
                                l46Var2.p0(objR);
                            }
                            c8b.i(j09VarD2, strQ2, null, null, 0L, 0.0f, false, x4dVar2, null, false, null, null, (x16) objR, l46Var, 6, 0, 3964);
                            j09 j09VarD3 = b.d(b.c(g09Var2, 1.0f), 56.0f);
                            String strQ3 = afc.q(R.string.start_reading_directly, l46Var);
                            x4d x4dVar3 = eze.a(l46Var).a.a;
                            x4dVar3.getClass();
                            x4d x4dVar4 = we6.e(l46Var) ? y02Var : x4dVar3;
                            u51 u51VarL = c8b.l(l46Var);
                            boolean z10 = ((57344 & i2) == 16384) | (i3 == 1048576);
                            Object objR2 = l46Var.R();
                            if (z10 || objR2 == i8cVar) {
                                z6 = true;
                                final boolean z11 = true ? 1 : 0;
                                objR2 = new x16() { // from class: xbf
                                    @Override // defpackage.x16
                                    public final Object invoke() {
                                        int i5 = z11;
                                        wef wefVar = wef.a;
                                        p05 p05Var = p05.a;
                                        az1 az1Var2 = az1Var;
                                        x16 x16Var6 = x16Var2;
                                        switch (i5) {
                                            case 0:
                                                x1f x1fVar = x1f.a;
                                                x1f.k(p05Var, new xna(az1Var2, 3), 2);
                                                x16Var6.invoke();
                                                break;
                                            default:
                                                x1f x1fVar2 = x1f.a;
                                                x1f.k(p05Var, new xna(az1Var2, 4), 2);
                                                x16Var6.invoke();
                                                break;
                                        }
                                        return wefVar;
                                    }
                                };
                                l46Var.p0(objR2);
                            } else {
                                z6 = true;
                            }
                            c8b.i(j09VarD3, strQ3, null, null, 0L, 0.0f, false, x4dVar4, u51VarL, false, null, null, (x16) objR2, l46Var, 6, 0, 3708);
                            l46Var2 = l46Var;
                            l46Var2.r(false);
                            g09Var = g09Var2;
                            z7 = false;
                        } else {
                            z6 = true;
                            l46Var2.f0(-170625173);
                            j09 j09VarD4 = b.d(b.c(g09Var2, 1.0f), 56.0f);
                            String strQ4 = afc.q(R.string.photo_start_reading, l46Var2);
                            x4d x4dVar5 = eze.a(l46Var2).a.a;
                            x4dVar5.getClass();
                            g09Var = g09Var2;
                            z7 = false;
                            c8b.i(j09VarD4, strQ4, null, null, 0L, 0.0f, false, we6.e(l46Var2) ? y02Var : x4dVar5, null, false, null, null, x16Var2, l46Var, 6, (i2 >> 6) & 896, 3964);
                            l46Var2 = l46Var;
                            l46Var2.r(false);
                        }
                        l46Var2.r(z7);
                    } else {
                        g09Var = g09Var2;
                        z6 = true;
                        l46Var2.f0(-170339353);
                        String strQ5 = afc.q(R.string.draw_click_to_pick, l46Var2);
                        byte b = (i2 & 7168) == 2048;
                        Object objR3 = l46Var2.R();
                        if (b != false || objR3 == i8cVar) {
                            objR3 = new yca(17, x16Var);
                            l46Var2.p0(objR3);
                        }
                        ym8.h(null, false, strQ5, false, (x16) objR3, l46Var, 0, 11);
                        l46Var2 = l46Var;
                        l46Var2.r(false);
                    }
                }
                l46Var2.r(z6);
                j09Var2 = g09Var;
            }
            g09Var = g09Var2;
            z6 = true;
            l46Var2.r(z6);
            j09Var2 = g09Var;
        } else {
            l46Var2.Z();
            j09Var2 = j09Var;
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new l26(z, z2, str, x16Var, x16Var2, x16Var3, az1Var, z3, z4, z5, x16Var4, j09Var2, i) { // from class: ybf
                public final /* synthetic */ boolean a;
                public final /* synthetic */ boolean b;
                public final /* synthetic */ String c;
                public final /* synthetic */ x16 d;
                public final /* synthetic */ x16 e;
                public final /* synthetic */ x16 f;
                public final /* synthetic */ az1 g;
                public final /* synthetic */ boolean v;
                public final /* synthetic */ boolean w;
                public final /* synthetic */ boolean x;
                public final /* synthetic */ x16 y;
                public final /* synthetic */ j09 z;

                @Override // defpackage.l26
                public final Object z(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP = k99.P(1);
                    hcc.a(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.v, this.w, this.x, this.y, this.z, (l46) obj, iP);
                    return wef.a;
                }
            };
        }
    }

    public static final void b(dd2 dd2Var, x16 x16Var, x16 x16Var2, x16 x16Var3, x16 x16Var4, x16 x16Var5, boolean z, l46 l46Var, int i) {
        x16Var.getClass();
        x16Var2.getClass();
        x16Var3.getClass();
        x16Var4.getClass();
        x16Var5.getClass();
        l46Var.h0(331381493);
        int i2 = i | (l46Var.i(x16Var) ? 32 : 16) | (l46Var.i(x16Var2) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var.i(x16Var3) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE) | (l46Var.i(x16Var4) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE) | (l46Var.i(x16Var5) ? 131072 : 65536);
        if (l46Var.W(i2 & 1, (599187 & i2) != 599186)) {
            egd egdVarU = p8c.u(l46Var);
            rxg.a(false, x16Var, l46Var, i2 & 112, 1);
            hgd hgdVarA = egdVarU.a();
            boolean zG = l46Var.g(egdVarU) | ((i2 & 458752) == 131072);
            Object objR = l46Var.R();
            if (zG || objR == sf2.a) {
                objR = new ojd(egdVarU, x16Var5, null);
                l46Var.p0(objR);
            }
            af1.o((l26) objR, l46Var, hgdVarA);
            xdc.a(b.c, dd2Var, null, null, null, 0, 0L, 0L, null, af1.b0(605803012, new cl(egdVarU, x16Var3, x16Var4, z, x16Var2), l46Var), l46Var, 805306422, 508);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new dj3(dd2Var, x16Var, x16Var2, x16Var3, x16Var4, x16Var5, z, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0129  */
    /* JADX WARN: Code duplicated, block: B:102:0x0133  */
    /* JADX WARN: Code duplicated, block: B:103:0x0136  */
    /* JADX WARN: Code duplicated, block: B:107:0x0142  */
    /* JADX WARN: Code duplicated, block: B:108:0x0145  */
    /* JADX WARN: Code duplicated, block: B:110:0x014f  */
    /* JADX WARN: Code duplicated, block: B:111:0x0152  */
    /* JADX WARN: Code duplicated, block: B:119:0x016e  */
    /* JADX WARN: Code duplicated, block: B:122:0x0177 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:123:0x0179  */
    /* JADX WARN: Code duplicated, block: B:124:0x017c  */
    /* JADX WARN: Code duplicated, block: B:126:0x0180  */
    /* JADX WARN: Code duplicated, block: B:127:0x0182  */
    /* JADX WARN: Code duplicated, block: B:129:0x0186  */
    /* JADX WARN: Code duplicated, block: B:130:0x0189  */
    /* JADX WARN: Code duplicated, block: B:137:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:141:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:144:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:146:0x0203  */
    /* JADX WARN: Code duplicated, block: B:149:0x0212  */
    /* JADX WARN: Code duplicated, block: B:151:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x007a  */
    /* JADX WARN: Code duplicated, block: B:43:0x0082  */
    /* JADX WARN: Code duplicated, block: B:44:0x0085  */
    /* JADX WARN: Code duplicated, block: B:46:0x008a  */
    /* JADX WARN: Code duplicated, block: B:49:0x0094  */
    /* JADX WARN: Code duplicated, block: B:51:0x009a  */
    /* JADX WARN: Code duplicated, block: B:52:0x009d  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:58:0x00af  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:63:0x00be  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:70:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:73:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:77:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:79:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:80:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:84:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:86:0x0101  */
    /* JADX WARN: Code duplicated, block: B:87:0x0104  */
    /* JADX WARN: Code duplicated, block: B:89:0x0109  */
    /* JADX WARN: Code duplicated, block: B:92:0x0111  */
    /* JADX WARN: Code duplicated, block: B:94:0x0117  */
    /* JADX WARN: Code duplicated, block: B:95:0x011a  */
    /* JADX WARN: Code duplicated, block: B:99:0x0126  */
    public static final void c(final sdd sddVar, final rcf rcfVar, final egd egdVar, float f, final xw9 xw9Var, final bx9 bx9Var, final ft1 ft1Var, final dd2 dd2Var, final dd2 dd2Var2, final x16 x16Var, final x16 x16Var2, final boolean z, int i, a26 a26Var, l46 l46Var, final int i2, final int i3, final int i4) {
        int i5;
        xw9 xw9Var2;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        boolean z2;
        boolean z3;
        final float f2;
        final int i15;
        final a26 a26Var2;
        ojb ojbVarV;
        final float f3;
        final int i16;
        final a26 a26Var3;
        Object objR;
        i8c i8cVar;
        Object objR2;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        rcfVar.getClass();
        egdVar.getClass();
        x16Var.getClass();
        x16Var2.getClass();
        l46Var.h0(5965030);
        if ((i2 & 6) == 0) {
            i5 = (l46Var.g(sddVar) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            i5 |= (i2 & 64) == 0 ? l46Var.g(rcfVar) : l46Var.i(rcfVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i5 |= l46Var.g(egdVar) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        int i25 = i4 & 4;
        if (i25 == 0) {
            if ((i2 & 3072) == 0) {
                i5 |= l46Var.d(f) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            if ((i2 & 24576) == 0) {
                xw9Var2 = xw9Var;
                if (l46Var.g(xw9Var2)) {
                    i24 = 16384;
                } else {
                    i24 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                }
                i5 |= i24;
            } else {
                xw9Var2 = xw9Var;
            }
            if ((i2 & 196608) == 0) {
                if (l46Var.g(bx9Var)) {
                    i23 = 131072;
                } else {
                    i23 = 65536;
                }
                i5 |= i23;
            }
            if ((i2 & 1572864) == 0) {
                if (l46Var.g(ft1Var)) {
                    i22 = 1048576;
                } else {
                    i22 = 524288;
                }
                i5 |= i22;
            }
            if ((i2 & 12582912) == 0) {
                if (l46Var.i(dd2Var)) {
                    i21 = 8388608;
                } else {
                    i21 = 4194304;
                }
                i5 |= i21;
            }
            if ((i2 & 100663296) == 0) {
                if (l46Var.i(dd2Var2)) {
                    i20 = 67108864;
                } else {
                    i20 = 33554432;
                }
                i5 |= i20;
            }
            if ((i2 & 805306368) == 0) {
                if (l46Var.i(x16Var)) {
                    i19 = 536870912;
                } else {
                    i19 = 268435456;
                }
                i5 |= i19;
            }
            if ((i3 & 6) == 0) {
                if (l46Var.i(x16Var2)) {
                    i18 = 4;
                } else {
                    i18 = 2;
                }
                i6 = i3 | i18;
            } else {
                i6 = i3;
            }
            if ((i3 & 48) == 0) {
                if (l46Var.h(z)) {
                    i17 = 32;
                } else {
                    i17 = 16;
                }
                i6 |= i17;
            }
            i7 = i6;
            i8 = i5;
            i9 = i4 & 2048;
            if (i9 != 0) {
                i11 = i7 | 384;
            } else {
                if (l46Var.e(i)) {
                    i10 = 256;
                } else {
                    i10 = UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                }
                i11 = i7 | i10;
            }
            i12 = i4 & 4096;
            if (i12 != 0) {
                i14 = i11 | 3072;
            } else {
                int i26 = i11;
                if (l46Var.g(a26Var)) {
                    i13 = 2048;
                } else {
                    i13 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                }
                i14 = i26 | i13;
            }
            z2 = false;
            if ((i8 & 306783379) == 306783378 || (i14 & 1171) != 1170) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (l46Var.W(i8 & 1, z3)) {
                if (i25 != 0) {
                    f3 = 0.0f;
                } else {
                    f3 = f;
                }
                if (i9 != 0) {
                    i16 = 0;
                } else {
                    i16 = i;
                }
                if (i12 != 0) {
                    a26Var3 = null;
                } else {
                    a26Var3 = a26Var;
                }
                final p3f p3fVarI0 = g21.i0(rcfVar.g(), "drawing_step", l46Var, 48, 0);
                if ((i8 & 112) != 32 || ((i8 & 64) != 0 && l46Var.g(rcfVar))) {
                    z2 = true;
                }
                objR = l46Var.R();
                i8cVar = sf2.a;
                if (z2 || objR == i8cVar) {
                    objR = kv2.f(rcfVar.f.size(), l46Var);
                }
                final s69 s69Var = (s69) objR;
                objR2 = l46Var.R();
                if (objR2 == i8cVar) {
                    objR2 = new k8f(1);
                    l46Var.p0(objR2);
                }
                final xw9 xw9Var3 = xw9Var2;
                kn2.b(p3fVarI0, null, (a26) objR2, null, null, af1.b0(-240692943, new o26() { // from class: vbf
                    @Override // defpackage.o26
                    public final Object t(Object obj, Object obj2, Object obj3, Object obj4) {
                        int i27;
                        boolean z4;
                        Boolean bool;
                        Object gcfVar;
                        float f4;
                        sdd sddVar2;
                        ly lyVar = (ly) obj;
                        tn4 tn4Var = (tn4) obj2;
                        l46 l46Var2 = (l46) obj3;
                        int iIntValue = ((Integer) obj4).intValue();
                        lyVar.getClass();
                        tn4Var.getClass();
                        if ((iIntValue & 6) == 0) {
                            i27 = ((iIntValue & 8) == 0 ? l46Var2.g(lyVar) : l46Var2.i(lyVar) ? 4 : 2) | iIntValue;
                        } else {
                            i27 = iIntValue;
                        }
                        if ((iIntValue & 48) == 0) {
                            i27 |= l46Var2.e(tn4Var.ordinal()) ? 32 : 16;
                        }
                        if (l46Var2.W(i27 & 1, (i27 & 147) != 146)) {
                            int iOrdinal = tn4Var.ordinal();
                            rcf rcfVar2 = rcfVar;
                            xw9 xw9Var4 = xw9Var3;
                            i8c i8cVar2 = sf2.a;
                            if (iOrdinal != 0) {
                                int i28 = i27;
                                sdd sddVar3 = sddVar;
                                if (iOrdinal == 1) {
                                    l46Var2.f0(2113042756);
                                    cv7 cv7Var = (cv7) l46Var2.k(zg2.n);
                                    tn4 tn4VarG = rcfVar2.g();
                                    jsd jsdVar = rcfVar2.f;
                                    float f5 = tn4VarG == tn4.b ? f3 : 0.0f;
                                    bx9 bx9Var2 = new bx9(ynb.B(xw9Var4, cv7Var), xw9Var4.d(), ynb.A(xw9Var4, cv7Var), ((yi4) mh3.l(new yi4(xw9Var4.a() - f5), new yi4(0.0f))).a);
                                    boolean zE = l46Var2.e(jsdVar.size());
                                    Object objR3 = l46Var2.R();
                                    s69 s69Var2 = s69Var;
                                    if (zE || objR3 == i8cVar2) {
                                        objR3 = Boolean.valueOf(jsdVar.size() > ((sz9) s69Var2).j());
                                        l46Var2.p0(objR3);
                                    }
                                    boolean zBooleanValue = ((Boolean) objR3).booleanValue();
                                    Integer numValueOf = Integer.valueOf(jsdVar.size());
                                    boolean zG = l46Var2.g(s69Var2) | l46Var2.i(rcfVar2);
                                    Object objR4 = l46Var2.R();
                                    if (zG || objR4 == i8cVar2) {
                                        objR4 = new dcf(rcfVar2, s69Var2, null);
                                        l46Var2.p0(objR4);
                                    }
                                    af1.o((l26) objR4, l46Var2, numValueOf);
                                    Object objR5 = l46Var2.R();
                                    if (objR5 == i8cVar2) {
                                        objR5 = q1c.f(Boolean.FALSE);
                                        l46Var2.p0(objR5);
                                    }
                                    e89 e89Var = (e89) objR5;
                                    a26 a26Var4 = a26Var3;
                                    e89 e89VarI = q1c.i(a26Var4, l46Var2);
                                    Boolean boolValueOf = Boolean.valueOf(rcfVar2.k());
                                    Integer numValueOf2 = Integer.valueOf(i16);
                                    Boolean boolValueOf2 = Boolean.valueOf(a26Var4 != null);
                                    boolean zI = l46Var2.i(rcfVar2) | l46Var2.g(e89VarI);
                                    p3f p3fVar = p3fVarI0;
                                    boolean zG2 = zI | l46Var2.g(p3fVar) | l46Var2.g(sddVar3);
                                    Object objR6 = l46Var2.R();
                                    if (zG2 || objR6 == i8cVar2) {
                                        bool = boolValueOf;
                                        f4 = 0.0f;
                                        gcfVar = new gcf(rcfVar2, e89VarI, e89Var, p3fVar, sddVar3, null);
                                        rcfVar2 = rcfVar2;
                                        sddVar2 = sddVar3;
                                        l46Var2.p0(gcfVar);
                                    } else {
                                        gcfVar = objR6;
                                        bool = boolValueOf;
                                        sddVar2 = sddVar3;
                                        f4 = 0.0f;
                                    }
                                    af1.q(bool, numValueOf2, boolValueOf2, (l26) gcfVar, l46Var2);
                                    Object objR7 = l46Var2.R();
                                    if (objR7 == i8cVar2) {
                                        objR7 = new w77(e89Var, 19);
                                        l46Var2.p0(objR7);
                                    }
                                    j09 j09VarW = nk8.w(g09.a, (a26) objR7);
                                    boolean zK = rcfVar2.k();
                                    List listI = rcfVar2.i();
                                    bx9 bx9VarR = ynb.r(f4, 12.0f, f4, f5, 5);
                                    boolean zI2 = l46Var2.i(rcfVar2);
                                    Object objR8 = l46Var2.R();
                                    if (zI2 || objR8 == i8cVar2) {
                                        objR8 = new yv9(0, rcfVar2, rcf.class, "onPatternDrawClick", "onPatternDrawClick()V", 0, 23);
                                        l46Var2.p0(objR8);
                                    }
                                    tm7.j(sddVar2, j09VarW, bx9Var2, lyVar, jsdVar, listI, bx9VarR, zK, zBooleanValue, dd2Var, (x16) ((ym7) objR8), l46Var2, ((i28 << 9) & 7168) | 48, 0, 0);
                                    l46Var2.r(false);
                                } else {
                                    if (iOrdinal != 2) {
                                        throw tec.d(622319968, l46Var2, false);
                                    }
                                    l46Var2.f0(2115290845);
                                    jsd jsdVar2 = rcfVar2.g;
                                    Integer numH = rcfVar2.h();
                                    boolean zIsEmpty = rcfVar2.f.isEmpty();
                                    boolean zI3 = l46Var2.i(rcfVar2);
                                    Object objR9 = l46Var2.R();
                                    if (zI3 || objR9 == i8cVar2) {
                                        dne dneVar = new dne(1, rcfVar2, rcf.class, "onCardSelected", "onCardSelected(I)V", 0, 2);
                                        l46Var2.p0(dneVar);
                                        objR9 = dneVar;
                                    }
                                    kn2.h(sddVar3, null, xw9Var4, 0.0f, jsdVar2, numH, zIsEmpty, false, false, null, null, null, 0.0f, ft1Var, (a26) ((ym7) objR9), dd2Var2, l46Var2, 0, 0, 4037);
                                    l46Var2.r(false);
                                }
                            } else {
                                l46Var2.f0(2112003326);
                                cv7 cv7Var2 = (cv7) l46Var2.k(zg2.n);
                                boolean zG3 = l46Var2.g((Configuration) l46Var2.k(uq.a)) | l46Var2.e(cv7Var2.ordinal());
                                Object objR10 = l46Var2.R();
                                if (zG3 || objR10 == i8cVar2) {
                                    bx9 bx9Var3 = new bx9(ynb.B(xw9Var4, cv7Var2), xw9Var4.d(), ynb.A(xw9Var4, cv7Var2), xw9Var4.a());
                                    l46Var2.p0(bx9Var3);
                                    objR10 = bx9Var3;
                                }
                                FillElement fillElement = b.c;
                                bx9 bx9VarW = g21.W((xw9) objR10, bx9Var, l46Var2);
                                boolean zI4 = l46Var2.i(rcfVar2);
                                Object objR11 = l46Var2.R();
                                if (zI4 || objR11 == i8cVar2) {
                                    z4 = false;
                                    yv9 yv9Var = new yv9(0, rcfVar2, rcf.class, "onShuffleComplete", "onShuffleComplete()V", 0, 22);
                                    l46Var2.p0(yv9Var);
                                    objR11 = yv9Var;
                                } else {
                                    z4 = false;
                                }
                                p8c.i(fillElement, bx9VarW, egdVar, 0, 0, false, false, null, false, null, null, x16Var, x16Var2, z, (x16) ((ym7) objR11), l46Var2, 6, 0, 2040);
                                l46Var2.r(z4);
                            }
                        } else {
                            l46Var2.Z();
                        }
                        return wef.a;
                    }
                }, l46Var), l46Var, 196992, 13);
                f2 = f3;
                a26Var2 = a26Var3;
                i15 = i16;
            } else {
                l46Var.Z();
                f2 = f;
                i15 = i;
                a26Var2 = a26Var;
            }
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new l26() { // from class: acf
                    @Override // defpackage.l26
                    public final Object z(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iP = k99.P(i2 | 1);
                        int iP2 = k99.P(i3);
                        hcc.c(sddVar, rcfVar, egdVar, f2, xw9Var, bx9Var, ft1Var, dd2Var, dd2Var2, x16Var, x16Var2, z, i15, a26Var2, (l46) obj, iP, iP2, i4);
                        return wef.a;
                    }
                };
            }
        }
        i5 |= 3072;
        if ((i2 & 24576) == 0) {
            xw9Var2 = xw9Var;
            if (l46Var.g(xw9Var2)) {
                i24 = 16384;
            } else {
                i24 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
            }
            i5 |= i24;
        } else {
            xw9Var2 = xw9Var;
        }
        if ((i2 & 196608) == 0) {
            if (l46Var.g(bx9Var)) {
                i23 = 131072;
            } else {
                i23 = 65536;
            }
            i5 |= i23;
        }
        if ((i2 & 1572864) == 0) {
            if (l46Var.g(ft1Var)) {
                i22 = 1048576;
            } else {
                i22 = 524288;
            }
            i5 |= i22;
        }
        if ((i2 & 12582912) == 0) {
            if (l46Var.i(dd2Var)) {
                i21 = 8388608;
            } else {
                i21 = 4194304;
            }
            i5 |= i21;
        }
        if ((i2 & 100663296) == 0) {
            if (l46Var.i(dd2Var2)) {
                i20 = 67108864;
            } else {
                i20 = 33554432;
            }
            i5 |= i20;
        }
        if ((i2 & 805306368) == 0) {
            if (l46Var.i(x16Var)) {
                i19 = 536870912;
            } else {
                i19 = 268435456;
            }
            i5 |= i19;
        }
        if ((i3 & 6) == 0) {
            if (l46Var.i(x16Var2)) {
                i18 = 4;
            } else {
                i18 = 2;
            }
            i6 = i3 | i18;
        } else {
            i6 = i3;
        }
        if ((i3 & 48) == 0) {
            if (l46Var.h(z)) {
                i17 = 32;
            } else {
                i17 = 16;
            }
            i6 |= i17;
        }
        i7 = i6;
        i8 = i5;
        i9 = i4 & 2048;
        if (i9 != 0) {
            i11 = i7 | 384;
        } else {
            if (l46Var.e(i)) {
                i10 = 256;
            } else {
                i10 = UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
            }
            i11 = i7 | i10;
        }
        i12 = i4 & 4096;
        if (i12 != 0) {
            i14 = i11 | 3072;
        } else {
            int i27 = i11;
            if (l46Var.g(a26Var)) {
                i13 = 2048;
            } else {
                i13 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i14 = i27 | i13;
        }
        z2 = false;
        if ((i8 & 306783379) == 306783378) {
            z3 = true;
        } else {
            z3 = true;
        }
        if (l46Var.W(i8 & 1, z3)) {
            if (i25 != 0) {
                f3 = 0.0f;
            } else {
                f3 = f;
            }
            if (i9 != 0) {
                i16 = 0;
            } else {
                i16 = i;
            }
            if (i12 != 0) {
                a26Var3 = null;
            } else {
                a26Var3 = a26Var;
            }
            final p3f p3fVarI1 = g21.i0(rcfVar.g(), "drawing_step", l46Var, 48, 0);
            if ((i8 & 112) != 32) {
                z2 = true;
            } else {
                z2 = true;
            }
            objR = l46Var.R();
            i8cVar = sf2.a;
            if (z2) {
                objR = kv2.f(rcfVar.f.size(), l46Var);
            } else {
                objR = kv2.f(rcfVar.f.size(), l46Var);
            }
            final s69 s69Var2 = (s69) objR;
            objR2 = l46Var.R();
            if (objR2 == i8cVar) {
                objR2 = new k8f(1);
                l46Var.p0(objR2);
            }
            final xw9 xw9Var4 = xw9Var2;
            kn2.b(p3fVarI1, null, (a26) objR2, null, null, af1.b0(-240692943, new o26() { // from class: vbf
                @Override // defpackage.o26
                public final Object t(Object obj, Object obj2, Object obj3, Object obj4) {
                    int i28;
                    boolean z4;
                    Boolean bool;
                    Object gcfVar;
                    float f4;
                    sdd sddVar2;
                    ly lyVar = (ly) obj;
                    tn4 tn4Var = (tn4) obj2;
                    l46 l46Var2 = (l46) obj3;
                    int iIntValue = ((Integer) obj4).intValue();
                    lyVar.getClass();
                    tn4Var.getClass();
                    if ((iIntValue & 6) == 0) {
                        i28 = ((iIntValue & 8) == 0 ? l46Var2.g(lyVar) : l46Var2.i(lyVar) ? 4 : 2) | iIntValue;
                    } else {
                        i28 = iIntValue;
                    }
                    if ((iIntValue & 48) == 0) {
                        i28 |= l46Var2.e(tn4Var.ordinal()) ? 32 : 16;
                    }
                    if (l46Var2.W(i28 & 1, (i28 & 147) != 146)) {
                        int iOrdinal = tn4Var.ordinal();
                        rcf rcfVar2 = rcfVar;
                        xw9 xw9Var5 = xw9Var4;
                        i8c i8cVar2 = sf2.a;
                        if (iOrdinal != 0) {
                            int i29 = i28;
                            sdd sddVar3 = sddVar;
                            if (iOrdinal == 1) {
                                l46Var2.f0(2113042756);
                                cv7 cv7Var = (cv7) l46Var2.k(zg2.n);
                                tn4 tn4VarG = rcfVar2.g();
                                jsd jsdVar = rcfVar2.f;
                                float f5 = tn4VarG == tn4.b ? f3 : 0.0f;
                                bx9 bx9Var2 = new bx9(ynb.B(xw9Var5, cv7Var), xw9Var5.d(), ynb.A(xw9Var5, cv7Var), ((yi4) mh3.l(new yi4(xw9Var5.a() - f5), new yi4(0.0f))).a);
                                boolean zE = l46Var2.e(jsdVar.size());
                                Object objR3 = l46Var2.R();
                                s69 s69Var3 = s69Var2;
                                if (zE || objR3 == i8cVar2) {
                                    objR3 = Boolean.valueOf(jsdVar.size() > ((sz9) s69Var3).j());
                                    l46Var2.p0(objR3);
                                }
                                boolean zBooleanValue = ((Boolean) objR3).booleanValue();
                                Integer numValueOf = Integer.valueOf(jsdVar.size());
                                boolean zG = l46Var2.g(s69Var3) | l46Var2.i(rcfVar2);
                                Object objR4 = l46Var2.R();
                                if (zG || objR4 == i8cVar2) {
                                    objR4 = new dcf(rcfVar2, s69Var3, null);
                                    l46Var2.p0(objR4);
                                }
                                af1.o((l26) objR4, l46Var2, numValueOf);
                                Object objR5 = l46Var2.R();
                                if (objR5 == i8cVar2) {
                                    objR5 = q1c.f(Boolean.FALSE);
                                    l46Var2.p0(objR5);
                                }
                                e89 e89Var = (e89) objR5;
                                a26 a26Var4 = a26Var3;
                                e89 e89VarI = q1c.i(a26Var4, l46Var2);
                                Boolean boolValueOf = Boolean.valueOf(rcfVar2.k());
                                Integer numValueOf2 = Integer.valueOf(i16);
                                Boolean boolValueOf2 = Boolean.valueOf(a26Var4 != null);
                                boolean zI = l46Var2.i(rcfVar2) | l46Var2.g(e89VarI);
                                p3f p3fVar = p3fVarI1;
                                boolean zG2 = zI | l46Var2.g(p3fVar) | l46Var2.g(sddVar3);
                                Object objR6 = l46Var2.R();
                                if (zG2 || objR6 == i8cVar2) {
                                    bool = boolValueOf;
                                    f4 = 0.0f;
                                    gcfVar = new gcf(rcfVar2, e89VarI, e89Var, p3fVar, sddVar3, null);
                                    rcfVar2 = rcfVar2;
                                    sddVar2 = sddVar3;
                                    l46Var2.p0(gcfVar);
                                } else {
                                    gcfVar = objR6;
                                    bool = boolValueOf;
                                    sddVar2 = sddVar3;
                                    f4 = 0.0f;
                                }
                                af1.q(bool, numValueOf2, boolValueOf2, (l26) gcfVar, l46Var2);
                                Object objR7 = l46Var2.R();
                                if (objR7 == i8cVar2) {
                                    objR7 = new w77(e89Var, 19);
                                    l46Var2.p0(objR7);
                                }
                                j09 j09VarW = nk8.w(g09.a, (a26) objR7);
                                boolean zK = rcfVar2.k();
                                List listI = rcfVar2.i();
                                bx9 bx9VarR = ynb.r(f4, 12.0f, f4, f5, 5);
                                boolean zI2 = l46Var2.i(rcfVar2);
                                Object objR8 = l46Var2.R();
                                if (zI2 || objR8 == i8cVar2) {
                                    objR8 = new yv9(0, rcfVar2, rcf.class, "onPatternDrawClick", "onPatternDrawClick()V", 0, 23);
                                    l46Var2.p0(objR8);
                                }
                                tm7.j(sddVar2, j09VarW, bx9Var2, lyVar, jsdVar, listI, bx9VarR, zK, zBooleanValue, dd2Var, (x16) ((ym7) objR8), l46Var2, ((i29 << 9) & 7168) | 48, 0, 0);
                                l46Var2.r(false);
                            } else {
                                if (iOrdinal != 2) {
                                    throw tec.d(622319968, l46Var2, false);
                                }
                                l46Var2.f0(2115290845);
                                jsd jsdVar2 = rcfVar2.g;
                                Integer numH = rcfVar2.h();
                                boolean zIsEmpty = rcfVar2.f.isEmpty();
                                boolean zI3 = l46Var2.i(rcfVar2);
                                Object objR9 = l46Var2.R();
                                if (zI3 || objR9 == i8cVar2) {
                                    dne dneVar = new dne(1, rcfVar2, rcf.class, "onCardSelected", "onCardSelected(I)V", 0, 2);
                                    l46Var2.p0(dneVar);
                                    objR9 = dneVar;
                                }
                                kn2.h(sddVar3, null, xw9Var5, 0.0f, jsdVar2, numH, zIsEmpty, false, false, null, null, null, 0.0f, ft1Var, (a26) ((ym7) objR9), dd2Var2, l46Var2, 0, 0, 4037);
                                l46Var2.r(false);
                            }
                        } else {
                            l46Var2.f0(2112003326);
                            cv7 cv7Var2 = (cv7) l46Var2.k(zg2.n);
                            boolean zG3 = l46Var2.g((Configuration) l46Var2.k(uq.a)) | l46Var2.e(cv7Var2.ordinal());
                            Object objR10 = l46Var2.R();
                            if (zG3 || objR10 == i8cVar2) {
                                bx9 bx9Var3 = new bx9(ynb.B(xw9Var5, cv7Var2), xw9Var5.d(), ynb.A(xw9Var5, cv7Var2), xw9Var5.a());
                                l46Var2.p0(bx9Var3);
                                objR10 = bx9Var3;
                            }
                            FillElement fillElement = b.c;
                            bx9 bx9VarW = g21.W((xw9) objR10, bx9Var, l46Var2);
                            boolean zI4 = l46Var2.i(rcfVar2);
                            Object objR11 = l46Var2.R();
                            if (zI4 || objR11 == i8cVar2) {
                                z4 = false;
                                yv9 yv9Var = new yv9(0, rcfVar2, rcf.class, "onShuffleComplete", "onShuffleComplete()V", 0, 22);
                                l46Var2.p0(yv9Var);
                                objR11 = yv9Var;
                            } else {
                                z4 = false;
                            }
                            p8c.i(fillElement, bx9VarW, egdVar, 0, 0, false, false, null, false, null, null, x16Var, x16Var2, z, (x16) ((ym7) objR11), l46Var2, 6, 0, 2040);
                            l46Var2.r(z4);
                        }
                    } else {
                        l46Var2.Z();
                    }
                    return wef.a;
                }
            }, l46Var), l46Var, 196992, 13);
            f2 = f3;
            a26Var2 = a26Var3;
            i15 = i16;
        } else {
            l46Var.Z();
            f2 = f;
            i15 = i;
            a26Var2 = a26Var;
        }
        ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new l26() { // from class: acf
                @Override // defpackage.l26
                public final Object z(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP = k99.P(i2 | 1);
                    int iP2 = k99.P(i3);
                    hcc.c(sddVar, rcfVar, egdVar, f2, xw9Var, bx9Var, ft1Var, dd2Var, dd2Var2, x16Var, x16Var2, z, i15, a26Var2, (l46) obj, iP, iP2, i4);
                    return wef.a;
                }
            };
        }
    }

    public static final void d(final rcf rcfVar, final r0 r0Var, final az1 az1Var, final boolean z, final boolean z2, final boolean z3, final l26 l26Var, final boolean z4, final String str, final a26 a26Var, final a26 a26Var2, final x16 x16Var, l46 l46Var, final int i) {
        final r0 r0Var2;
        TarotSkinIdentify tarotSkinIdentify;
        Object h20Var;
        rcf rcfVar2 = rcfVar;
        a26Var.getClass();
        x16Var.getClass();
        l46Var.h0(78303985);
        int i2 = i | (l46Var.i(rcfVar2) ? 4 : 2) | (l46Var.i(r0Var) ? 32 : 16) | (l46Var.g(az1Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var.h(z) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE) | (l46Var.h(z2) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE) | (l46Var.h(z3) ? 131072 : 65536) | (l46Var.g(l26Var) ? 1048576 : 524288) | (l46Var.h(z4) ? 8388608 : 4194304) | (l46Var.g(str) ? 67108864 : 33554432) | (l46Var.i(a26Var) ? 536870912 : 268435456);
        int i3 = (l46Var.i(a26Var2) ? (char) 4 : (char) 2) | (l46Var.i(x16Var) ? ' ' : (char) 16);
        if (l46Var.W(i2 & 1, ((306783379 & i2) == 306783378 && (i3 & 19) == 18) ? false : true)) {
            final boolean zK = rcfVar2.k();
            final boolean z5 = l26Var != null;
            int i4 = i2 & 14;
            boolean z6 = i4 == 4 || l46Var.g(rcfVar2);
            Object objR = l46Var.R();
            Object obj = sf2.a;
            if (z6 || objR == obj) {
                objR = q1c.f(Boolean.FALSE);
                l46Var.p0(objR);
            }
            final e89 e89Var = (e89) objR;
            boolean z7 = i4 == 4 || l46Var.g(rcfVar2);
            Object objR2 = l46Var.R();
            if (z7 || objR2 == obj) {
                objR2 = q1c.f(Boolean.FALSE);
                l46Var.p0(objR2);
            }
            final e89 e89Var2 = (e89) objR2;
            boolean z8 = i4 == 4 || l46Var.g(rcfVar2);
            Object objR3 = l46Var.R();
            if (z8 || objR3 == obj) {
                objR3 = kv2.f(0, l46Var);
            }
            final s69 s69Var = (s69) objR3;
            e89 e89VarI = q1c.i(l26Var, l46Var);
            boolean z9 = z5 && zK && (!((Boolean) e89Var.getValue()).booleanValue() || z3);
            final egd egdVarU = p8c.u(l46Var);
            Context context = (Context) l46Var.k(uq.b);
            TarotSkinIdentify tarotSkinIdentify2 = ((die) l46Var.k(snd.a)).a;
            if (!zK || z9) {
                r0Var2 = r0Var;
                tarotSkinIdentify = tarotSkinIdentify2;
                l46Var.f0(588519345);
                l46Var.r(false);
            } else {
                l46Var.f0(587993678);
                boolean zI = ((i2 & 7168) == 2048) | (i4 == 4 || l46Var.i(rcfVar2)) | l46Var.i(context) | ((i2 & 112) == 32 || l46Var.i(r0Var)) | l46Var.e(tarotSkinIdentify2.ordinal());
                Object objR4 = l46Var.R();
                if (zI || objR4 == obj) {
                    rcfVar2 = rcfVar;
                    tarotSkinIdentify = tarotSkinIdentify2;
                    h20Var = new h20(rcfVar2, context, r0Var, tarotSkinIdentify, z);
                    r0Var2 = r0Var;
                    l46Var.p0(h20Var);
                } else {
                    h20Var = objR4;
                    r0Var2 = r0Var;
                    tarotSkinIdentify = tarotSkinIdentify2;
                    rcfVar2 = rcfVar;
                }
                hgc.a("shuffle_result", "shuffle_result", (x16) h20Var, l46Var, 54);
                l46Var.r(false);
            }
            boolean z10 = r0Var2 != null && r0Var2.m0();
            boolean z11 = !(r0Var2 != null && r0Var2.U() != null) || (az1Var != null);
            boolean zH = l46Var.h(z9) | (i4 == 4 || l46Var.i(rcfVar2)) | ((i3 & 112) == 32);
            Object objR5 = l46Var.R();
            if (zH || objR5 == obj) {
                objR5 = new va4(z9, rcfVar2, x16Var, 9);
                l46Var.p0(objR5);
            }
            final x16 x16Var2 = (x16) objR5;
            int i5 = r0.j2;
            h0e h0eVarK = rs0.K(r0Var2, l46Var, ((i2 >> 3) & 14) | 8);
            n2f key = tarotSkinIdentify.getKey();
            MixedDeckSnapshot mixedDeckSnapshotR = r0Var2 != null ? r0Var2.R() : null;
            int i6 = i2 & 112;
            final boolean z12 = z10;
            boolean zE = (i6 == 32 || l46Var.i(r0Var2)) | l46Var.e(tarotSkinIdentify.ordinal());
            Object objR6 = l46Var.R();
            if (zE || objR6 == obj) {
                objR6 = new hcf(r0Var2, tarotSkinIdentify, null);
                l46Var.p0(objR6);
            }
            ix8 ix8Var = MixedDeckSnapshot.Companion;
            af1.p(key, mixedDeckSnapshotR, (l26) objR6, l46Var);
            boolean z13 = i6 == 32 || l46Var.i(r0Var2);
            Object objR7 = l46Var.R();
            if (z13 || objR7 == obj) {
                objR7 = new icf(r0Var2, null);
                l46Var.p0(objR7);
            }
            af1.o((l26) objR7, l46Var, wef.a);
            tn4 tn4VarG = rcfVar2.g();
            boolean z14 = (i6 == 32 || l46Var.i(r0Var2)) | (i4 == 4 || l46Var.i(rcfVar2));
            Object objR8 = l46Var.R();
            if (z14 || objR8 == obj) {
                objR8 = new jcf(null, rcfVar2, r0Var2);
                l46Var.p0(objR8);
            }
            af1.o((l26) objR8, l46Var, tn4VarG);
            rxg.a(false, x16Var2, l46Var, 0, 1);
            boolean z15 = i4 == 4 || l46Var.i(rcfVar2);
            Object objR9 = l46Var.R();
            if (z15 || objR9 == obj) {
                objR9 = new trd(23, rcfVar2);
                l46Var.p0(objR9);
            }
            int i7 = rcf.x;
            af1.g(rcfVar2, (a26) objR9, l46Var);
            final rcf rcfVar3 = rcfVar2;
            final boolean z16 = z9;
            xdc.a(b.c, af1.b0(597119157, new l26() { // from class: bcf
                @Override // defpackage.l26
                public final Object z(Object obj2, Object obj3) {
                    l46 l46Var2 = (l46) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    if (l46Var2.W(iIntValue & 1, (iIntValue & 3) != 2)) {
                        j09 j09VarC = b.c(g09.a, 1.0f);
                        boolean z17 = !z16;
                        rcf rcfVar4 = rcfVar3;
                        tn4 tn4VarG2 = rcfVar4.g();
                        tn4VarG2.getClass();
                        boolean z18 = z12;
                        boolean z19 = !z18 || tn4VarG2 == tn4.c;
                        boolean zI2 = l46Var2.i(rcfVar4);
                        Object objR10 = l46Var2.R();
                        if (zI2 || objR10 == sf2.a) {
                            objR10 = new h2e(16, rcfVar4);
                            l46Var2.p0(objR10);
                        }
                        tq.c(j09VarC, (x16) objR10, z19, z17, x16Var2, af1.b0(-351060339, new dh3(z2, rcfVar4, egdVarU, z18, z, zK), l46Var2), l46Var2, 196614, 0);
                    } else {
                        l46Var2.Z();
                    }
                    return wef.a;
                }
            }, l46Var), af1.b0(-1637925642, new l26() { // from class: ccf
                @Override // defpackage.l26
                public final Object z(Object obj2, Object obj3) {
                    l46 l46Var2 = (l46) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    if (l46Var2.W(iIntValue & 1, (iIntValue & 3) != 2)) {
                        final rcf rcfVar4 = rcfVar;
                        if (rcfVar4.g() == tn4.b) {
                            l46Var2.f0(-319256662);
                            final boolean z17 = z3;
                            final boolean z18 = z16;
                            final s69 s69Var2 = s69Var;
                            final a26 a26Var3 = a26Var2;
                            final boolean z19 = z4;
                            final String str2 = str;
                            final a26 a26Var4 = a26Var;
                            final az1 az1Var2 = az1Var;
                            final boolean z20 = z5;
                            final e89 e89Var3 = e89Var2;
                            final e89 e89Var4 = e89Var;
                            final boolean z21 = z12;
                            final r0 r0Var3 = r0Var2;
                            oa7.b(null, 0L, 0.0f, af1.b0(-809783915, new n26() { // from class: ubf
                                @Override // defpackage.n26
                                public final Object m(Object obj4, Object obj5, Object obj6) {
                                    x16 x16Var3;
                                    i8c i8cVar;
                                    x16 x16Var4;
                                    x16 x16Var5;
                                    l46 l46Var3 = (l46) obj5;
                                    int iIntValue2 = ((Integer) obj6).intValue();
                                    ((c31) obj4).getClass();
                                    boolean z22 = true;
                                    if (l46Var3.W(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                        rcf rcfVar5 = rcfVar4;
                                        boolean zK2 = rcfVar5.k();
                                        boolean z23 = z17;
                                        boolean z24 = z18;
                                        e89 e89Var5 = e89Var3;
                                        if (!z23 && (!z24 || ((Boolean) e89Var5.getValue()).booleanValue())) {
                                            z22 = false;
                                        }
                                        boolean zBooleanValue = ((Boolean) e89Var4.getValue()).booleanValue();
                                        boolean zBooleanValue2 = ((Boolean) e89Var5.getValue()).booleanValue();
                                        i8c i8cVar2 = sf2.a;
                                        if (zBooleanValue2) {
                                            l46Var3.f0(559019864);
                                            s69 s69Var3 = s69Var2;
                                            boolean zG = l46Var3.g(s69Var3);
                                            Object objR10 = l46Var3.R();
                                            if (zG || objR10 == i8cVar2) {
                                                objR10 = new q50(s69Var3, 14);
                                                l46Var3.p0(objR10);
                                            }
                                            l46Var3.r(false);
                                            x16Var3 = (x16) objR10;
                                        } else {
                                            l46Var3.f0(559046120);
                                            l46Var3.r(false);
                                            x16Var3 = null;
                                        }
                                        boolean zI2 = l46Var3.i(rcfVar5);
                                        Object objR11 = l46Var3.R();
                                        if (zI2 || objR11 == i8cVar2) {
                                            i8cVar = i8cVar2;
                                            yv9 yv9Var = new yv9(0, rcfVar5, rcf.class, "onPatternDrawClick", "onPatternDrawClick()V", 0, 25);
                                            l46Var3.p0(yv9Var);
                                            objR11 = yv9Var;
                                        } else {
                                            i8cVar = i8cVar2;
                                        }
                                        ym7 ym7Var = (ym7) objR11;
                                        a26 a26Var5 = a26Var3;
                                        if (a26Var5 == null) {
                                            l46Var3.f0(559390499);
                                            l46Var3.r(false);
                                            x16Var5 = null;
                                        } else {
                                            l46Var3.f0(559390500);
                                            if (z21) {
                                                l46Var3.f0(736825061);
                                                l46Var3.r(false);
                                                x16Var4 = null;
                                            } else {
                                                l46Var3.f0(736650717);
                                                r0 r0Var4 = r0Var3;
                                                boolean zI3 = l46Var3.i(r0Var4) | l46Var3.g(a26Var5) | l46Var3.i(rcfVar5);
                                                Object objR12 = l46Var3.R();
                                                if (zI3 || objR12 == i8cVar) {
                                                    objR12 = new smc(r0Var4, a26Var5, rcfVar5, 6);
                                                    l46Var3.p0(objR12);
                                                }
                                                x16Var4 = (x16) objR12;
                                                l46Var3.r(false);
                                            }
                                            l46Var3.r(false);
                                            x16Var5 = x16Var4;
                                        }
                                        x16 x16Var6 = (x16) ym7Var;
                                        boolean zH2 = l46Var3.h(z24);
                                        a26 a26Var6 = a26Var4;
                                        boolean zG2 = zH2 | l46Var3.g(a26Var6) | l46Var3.i(rcfVar5);
                                        Object objR13 = l46Var3.R();
                                        if (zG2 || objR13 == i8cVar) {
                                            objR13 = new va4(z24, a26Var6, rcfVar5, 8);
                                            l46Var3.p0(objR13);
                                        }
                                        hcc.a(zK2, z19, str2, x16Var6, (x16) objR13, x16Var5, az1Var2, z20, z22, zBooleanValue, x16Var3, null, l46Var3, 0);
                                    } else {
                                        l46Var3.Z();
                                    }
                                    return wef.a;
                                }
                            }, l46Var2), l46Var2, 3072, 7);
                            l46Var2.r(false);
                        } else {
                            l46Var2.f0(-318147668);
                            l46Var2.r(false);
                        }
                    } else {
                        l46Var2.Z();
                    }
                    return wef.a;
                }
            }, l46Var), af1.b0(421996855, new zbf(rcfVar, 2), l46Var), null, 0, 0L, 0L, null, af1.b0(1669868608, new e8(rcfVar, r0Var, egdVarU, z11, z5, e89VarI, e89Var2, e89Var, h0eVarK, s69Var), l46Var), l46Var, 805309878, 496);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new l26(r0Var, az1Var, z, z2, z3, l26Var, z4, str, a26Var, a26Var2, x16Var, i) { // from class: sbf
                public final /* synthetic */ r0 b;
                public final /* synthetic */ az1 c;
                public final /* synthetic */ boolean d;
                public final /* synthetic */ boolean e;
                public final /* synthetic */ boolean f;
                public final /* synthetic */ l26 g;
                public final /* synthetic */ boolean v;
                public final /* synthetic */ String w;
                public final /* synthetic */ a26 x;
                public final /* synthetic */ a26 y;
                public final /* synthetic */ x16 z;

                @Override // defpackage.l26
                public final Object z(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iP = k99.P(73);
                    hcc.d(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.v, this.w, this.x, this.y, this.z, (l46) obj2, iP);
                    return wef.a;
                }
            };
        }
    }

    public static final nyc e(nyc nycVar, hzc hzcVar) {
        nyc nycVarE;
        xn7 xn7VarC;
        nycVar.getClass();
        hzcVar.getClass();
        if (!pa7.t(nycVar.g(), qyc.c)) {
            return nycVar.isInline() ? e(nycVar.i(0), hzcVar) : nycVar;
        }
        em7 em7VarC = k99.C(nycVar);
        nyc nycVarE2 = null;
        if (em7VarC != null && (xn7VarC = hzcVar.c(em7VarC, pu4.a)) != null) {
            nycVarE2 = xn7VarC.e();
        }
        return (nycVarE2 == null || (nycVarE = e(nycVarE2, hzcVar)) == null) ? nycVar : nycVarE;
    }

    public static StaticLayout f(CharSequence charSequence, TextPaint textPaint, int i, int i2, TextDirectionHeuristic textDirectionHeuristic, Layout.Alignment alignment, int i3, TextUtils.TruncateAt truncateAt, int i4, int i5, boolean z, int i6, int i7, int i8, int i9) {
        if (i2 < 0) {
            j37.a("invalid start value");
        }
        int length = charSequence.length();
        if (i2 < 0 || i2 > length) {
            j37.a("invalid end value");
        }
        if (i3 < 0) {
            j37.a("invalid maxLines value");
        }
        if (i < 0) {
            j37.a("invalid width value");
        }
        if (i4 < 0) {
            j37.a("invalid ellipsizedWidth value");
        }
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequence, 0, i2, textPaint, i);
        builderObtain.setTextDirection(textDirectionHeuristic);
        builderObtain.setAlignment(alignment);
        builderObtain.setMaxLines(i3);
        builderObtain.setEllipsize(truncateAt);
        builderObtain.setEllipsizedWidth(i4);
        builderObtain.setLineSpacing(0.0f, 1.0f);
        builderObtain.setIncludePad(z);
        builderObtain.setBreakStrategy(i6);
        builderObtain.setHyphenationFrequency(i9);
        builderObtain.setIndents(null, null);
        builderObtain.setJustificationMode(i5);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            s.g0(builderObtain);
        }
        if (i10 >= 33) {
            q6.K(builderObtain, i7, i8);
        }
        if (i10 >= 35) {
            v60.a(builderObtain);
        }
        return builderObtain.build();
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:42:0x00d6 A[LOOP:2: B:31:0x007f->B:42:0x00d6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:50:0x00dd A[EDGE_INSN: B:50:0x00dd->B:43:0x00dd BREAK  A[LOOP:2: B:31:0x007f->B:42:0x00d6], SYNTHETIC] */
    public static final y69 g(vuc vucVar, ArrayList arrayList, a26 a26Var, l26 l26Var, o26 o26Var) {
        long j;
        vuc vucVar2;
        a26 a26Var2 = a26Var;
        long j2 = vucVar.a.c;
        uuc uucVar = vucVar.b;
        long j3 = uucVar.c;
        if (j2 == j3) {
            y69 y69Var = of8.a;
            y69 y69Var2 = new y69();
            y69Var2.i(j2, vucVar);
            return y69Var2;
        }
        Iterator it = arrayList.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (((Number) a26Var2.d(it.next())).longValue() == j2) {
                break;
            }
            i++;
        }
        Iterator it2 = arrayList.iterator();
        int i2 = 0;
        while (true) {
            if (!it2.hasNext()) {
                i2 = -1;
                break;
            }
            if (((Number) a26Var2.d(it2.next())).longValue() == j3) {
                break;
            }
            i2++;
        }
        if (i == -1 || i2 == -1) {
            y69 y69Var3 = of8.a;
            y69Var3.getClass();
            return y69Var3;
        }
        int iMin = Math.min(i, i2);
        int iMax = Math.max(i, i2);
        boolean z = i > i2;
        y69 y69Var4 = of8.a;
        y69 y69Var5 = new y69();
        if (iMin <= iMax) {
            while (true) {
                Object obj = arrayList.get(iMin);
                long jLongValue = ((Number) a26Var2.d(obj)).longValue();
                if (jLongValue != j2) {
                    j = j2;
                    if (jLongValue == j3) {
                        vucVar2 = (vuc) o26Var.t(obj, Boolean.FALSE, Integer.valueOf(uucVar.b), Boolean.valueOf(z));
                    } else {
                        vucVar2 = (vuc) l26Var.z(obj, Boolean.valueOf(z));
                    }
                    if (vucVar2 != null) {
                        y69Var5.i(jLongValue, vucVar2);
                    }
                    if (iMin != iMax) {
                        break;
                    }
                    iMin++;
                    a26Var2 = a26Var;
                    j2 = j;
                } else {
                    j = j2;
                    vucVar2 = (vuc) o26Var.t(obj, Boolean.TRUE, Integer.valueOf(vucVar.a.b), Boolean.valueOf(z));
                }
                if (vucVar2 != null) {
                    y69Var5.i(jLongValue, vucVar2);
                }
                if (iMin != iMax) {
                    break;
                    break;
                }
                iMin++;
                a26Var2 = a26Var;
                j2 = j;
            }
        }
        return y69Var5;
    }

    public static final mkd h(ste steVar, int i, int i2, int i3, long j, boolean z, boolean z2) {
        vuc vucVar;
        if (z) {
            vucVar = null;
        } else {
            int i4 = eue.c;
            int i5 = (int) (j >> 32);
            int i6 = (int) (4294967295L & j);
            vucVar = new vuc(new uuc(gcc.q(steVar, i5), i5, 1L), new uuc(gcc.q(steVar, i6), i6, 1L), eue.h(j));
        }
        return new mkd(z2, 1, 1, vucVar, new guc(1L, 1, i, i2, i3, steVar));
    }

    public static final gy2 i(pwf pwfVar) {
        return pwfVar instanceof lh6 ? ((lh6) pwfVar).e() : ey2.b;
    }

    public static final jwf j(pwf pwfVar) {
        return pwfVar instanceof lh6 ? ((lh6) pwfVar).c() : hu3.b;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002a  */
    /* JADX WARN: Code duplicated, block: B:16:0x002c  */
    public static final boolean k(tn4 tn4Var, egd egdVar, boolean z, l46 l46Var, int i) {
        boolean z2;
        tn4Var.getClass();
        egdVar.getClass();
        if (z) {
            z2 = false;
        } else {
            int iOrdinal = tn4Var.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        ap.c();
                        return false;
                    }
                    z2 = false;
                } else {
                    z2 = true;
                }
            } else if (egdVar.a() == hgd.a || egdVar.a() == hgd.d) {
                z2 = false;
            } else {
                z2 = true;
            }
        }
        Object objR = l46Var.R();
        i8c i8cVar = sf2.a;
        if (objR == i8cVar) {
            objR = q1c.f(Boolean.FALSE);
            l46Var.p0(objR);
        }
        e89 e89Var = (e89) objR;
        Boolean boolValueOf = Boolean.valueOf(z);
        boolean z3 = ((((i & 896) ^ 384) > 256 && l46Var.h(z)) || (i & 384) == 256) | ((((i & 14) ^ 6) > 4 && l46Var.e(tn4Var.ordinal())) || (i & 6) == 4);
        Object objR2 = l46Var.R();
        if (z3 || objR2 == i8cVar) {
            objR2 = new qcf(tn4Var, z, e89Var, null);
            l46Var.p0(objR2);
        }
        af1.p(tn4Var, boolValueOf, (l26) objR2, l46Var);
        if (pcf.a[tn4Var.ordinal()] == 2) {
            return z2 && ((Boolean) e89Var.getValue()).booleanValue();
        }
        return z2;
    }

    public static final i94 l(i94 i94Var, i94 i94Var2) {
        int iOrdinal = i94Var2.ordinal();
        i94 i94Var3 = i94.a;
        if (iOrdinal != 0) {
            i94 i94Var4 = i94.c;
            if (iOrdinal != 1) {
                if (iOrdinal == 2) {
                    return i94Var4;
                }
                ap.c();
                return null;
            }
            int iOrdinal2 = i94Var.ordinal();
            if (iOrdinal2 != 0) {
                if (iOrdinal2 == 1) {
                    return i94.b;
                }
                if (iOrdinal2 == 2) {
                    return i94Var4;
                }
                ap.c();
                return null;
            }
        }
        return i94Var3;
    }

    public static void m(Status status, Object obj, gle gleVar) {
        if (status.c()) {
            gleVar.a(obj);
        } else {
            gleVar.a.r(status.c != null ? new pxb(status) : new x60(status));
        }
    }

    public static final ucg n(wg7 wg7Var, nyc nycVar) {
        nycVar.getClass();
        iec iecVarG = nycVar.g();
        if (iecVarG instanceof zia) {
            return ucg.POLY_OBJ;
        }
        if (pa7.t(iecVarG, g5e.d)) {
            return ucg.LIST;
        }
        if (!pa7.t(iecVarG, g5e.e)) {
            return ucg.OBJ;
        }
        nyc nycVarE = e(nycVar.i(0), wg7Var.b);
        iec iecVarG2 = nycVarE.g();
        if ((iecVarG2 instanceof fua) || pa7.t(iecVarG2, ryc.c)) {
            return ucg.MAP;
        }
        throw kj0.v(nycVarE);
    }

    public static final void o(CharSequence charSequence, char[] cArr, int i, int i2, int i3) {
        if (charSequence instanceof vne) {
            o(((vne) charSequence).c, cArr, i, i2, i3);
            return;
        }
        while (i2 < i3) {
            cArr[i] = charSequence.charAt(i2);
            i2++;
            i++;
        }
    }

    public static void p(Parcel parcel, int i, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        int iB = B(parcel, i);
        parcel.writeBundle(bundle);
        C(parcel, iB);
    }

    public static void q(Parcel parcel, int i, byte[] bArr) {
        if (bArr == null) {
            return;
        }
        int iB = B(parcel, i);
        parcel.writeByteArray(bArr);
        C(parcel, iB);
    }

    public static void r(Parcel parcel, int i, byte[][] bArr) {
        if (bArr == null) {
            return;
        }
        int iB = B(parcel, i);
        parcel.writeInt(bArr.length);
        for (byte[] bArr2 : bArr) {
            parcel.writeByteArray(bArr2);
        }
        C(parcel, iB);
    }

    public static void s(Parcel parcel, int i, IBinder iBinder) {
        if (iBinder == null) {
            return;
        }
        int iB = B(parcel, i);
        parcel.writeStrongBinder(iBinder);
        C(parcel, iB);
    }

    public static void t(Parcel parcel, int i, int[] iArr) {
        if (iArr == null) {
            return;
        }
        int iB = B(parcel, i);
        parcel.writeIntArray(iArr);
        C(parcel, iB);
    }

    public static void u(Parcel parcel, int i, Parcelable parcelable, int i2) {
        if (parcelable == null) {
            return;
        }
        int iB = B(parcel, i);
        parcelable.writeToParcel(parcel, i2);
        C(parcel, iB);
    }

    public static void v(Parcel parcel, int i, String str) {
        if (str == null) {
            return;
        }
        int iB = B(parcel, i);
        parcel.writeString(str);
        C(parcel, iB);
    }

    public static void w(Parcel parcel, int i, List list) {
        if (list == null) {
            return;
        }
        int iB = B(parcel, i);
        parcel.writeStringList(list);
        C(parcel, iB);
    }

    public static void x(Parcel parcel, int i, Parcelable[] parcelableArr, int i2) {
        if (parcelableArr == null) {
            return;
        }
        int iB = B(parcel, i);
        parcel.writeInt(parcelableArr.length);
        for (Parcelable parcelable : parcelableArr) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int iDataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int iDataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, i2);
                int iDataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(iDataPosition);
                parcel.writeInt(iDataPosition3 - iDataPosition2);
                parcel.setDataPosition(iDataPosition3);
            }
        }
        C(parcel, iB);
    }

    public static void y(Parcel parcel, int i, List list) {
        if (list == null) {
            return;
        }
        int iB = B(parcel, i);
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            Parcelable parcelable = (Parcelable) list.get(i2);
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int iDataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int iDataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, 0);
                int iDataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(iDataPosition);
                parcel.writeInt(iDataPosition3 - iDataPosition2);
                parcel.setDataPosition(iDataPosition3);
            }
        }
        C(parcel, iB);
    }

    public static void z(Parcel parcel, int i, int i2) {
        parcel.writeInt(i | (i2 << 16));
    }
}
