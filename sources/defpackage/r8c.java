package defpackage;

import ai.askquin.R;
import ai.askquin.model.TarotSkinIdentify;
import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.ui.PlayerView;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import tech.chatmind.api.personality.TarotCard;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class r8c {
    public static String[] a;

    public static int A(Object obj, s3h s3hVar, byte[] bArr, int i, int i2, tlg tlgVar) throws p1h {
        int iW = i + 1;
        int i3 = bArr[i];
        if (i3 < 0) {
            iW = w(i3, bArr, iW, tlgVar);
            i3 = tlgVar.a;
        }
        int i4 = iW;
        if (i3 < 0 || i3 > i2 - i4) {
            s8f.o("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0;
        }
        int i5 = tlgVar.d + 1;
        tlgVar.d = i5;
        C(i5);
        int i6 = i4 + i3;
        s3hVar.e(obj, bArr, i4, i6, tlgVar);
        tlgVar.d--;
        tlgVar.c = obj;
        return i6;
    }

    public static long B(byte[] bArr, int i) {
        return (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48) | ((((long) bArr[i + 7]) & 255) << 56);
    }

    public static void C(int i) throws p1h {
        if (i < 100) {
            return;
        }
        s8f.o("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r27v0 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v23 */
    public static final void a(int i, int i2, l46 l46Var, j09 j09Var) {
        j09 j09Var2;
        ov7 ov7Var;
        l46 l46Var2 = l46Var;
        he2 he2Var = hj6.x;
        he2 he2Var2 = hj6.X;
        he2 he2Var3 = hj6.y;
        he2 he2Var4 = hj6.z;
        l46Var2.h0(561477092);
        int i3 = i2 | 6;
        if ((i2 & 48) == 0) {
            i3 |= l46Var2.e(i) ? 32 : 16;
        }
        if (l46Var2.W(i3 & 1, (i3 & 19) != 18)) {
            float fN = mh3.n((i - 2) / 100.0f, 0.0f, 1.0f);
            g09 g09Var = g09.a;
            j09 j09VarB0 = ynb.b0(16.0f, 0.0f, b.c(g09Var, 1.0f), 2);
            xn8 xn8VarC = s21.c(ndb.b, false);
            int iHashCode = Long.hashCode(l46Var2.T);
            u8a u8aVarM = l46Var2.m();
            j09 j09VarJ = m93.J(l46Var2, j09VarB0);
            lf2.q.getClass();
            l46Var2.j0();
            boolean z = l46Var2.S;
            ov7 ov7Var2 = LayoutNode.h1;
            if (z) {
                l46Var2.l(ov7Var2);
            } else {
                l46Var2.s0();
            }
            dec.l(he2Var4, l46Var2, xn8VarC);
            dec.l(he2Var3, l46Var2, u8aVarM);
            ib8.s(iHashCode, l46Var2, he2Var2, l46Var2);
            dec.l(he2Var, l46Var2, j09VarJ);
            j09 j09VarE = oa7.E(ynb.b0(0.0f, 20.0f, b.d(b.c(g09Var, 1.0f), 48.0f), 1), a7c.a());
            pr4 pr4Var = o82.a;
            long j = ((m82) l46Var2.k(pr4Var)).a;
            long jB = y72.b(((m82) l46Var2.k(pr4Var)).a, 0.2f);
            boolean zD = l46Var2.d(fN);
            Object objR = l46Var2.R();
            i8c i8cVar = sf2.a;
            if (zD || objR == i8cVar) {
                objR = new dxe(fN);
                l46Var2.p0(objR);
            }
            x16 x16Var = (x16) objR;
            Object objR2 = l46Var2.R();
            if (objR2 == i8cVar) {
                objR2 = new ule(20);
                l46Var2.p0(objR2);
            }
            g09 g09Var2 = g09Var;
            float f = 1.0f;
            axa.c(x16Var, j09VarE, j, jB, 2, 0.0f, (a26) objR2, l46Var, 1769472, 0);
            l46Var2 = l46Var;
            j09 j09VarN = tm7.N(16.0f, 0.0f, b.c(g09Var2, 1.0f), 2);
            t7c t7cVarA = s7c.a(xc0.g, ndb.y, l46Var2, 6);
            int iHashCode2 = Long.hashCode(l46Var2.T);
            u8a u8aVarM2 = l46Var2.m();
            j09 j09VarJ2 = m93.J(l46Var2, j09VarN);
            l46Var2.j0();
            if (l46Var2.S) {
                ov7Var = ov7Var2;
                l46Var2.l(ov7Var);
            } else {
                ov7Var = ov7Var2;
                l46Var2.s0();
            }
            he2 he2Var5 = he2Var4;
            dec.l(he2Var5, l46Var2, t7cVarA);
            he2 he2Var6 = he2Var3;
            dec.l(he2Var6, l46Var2, u8aVarM2);
            he2 he2Var7 = he2Var2;
            ib8.s(iHashCode2, l46Var2, he2Var7, l46Var2);
            he2 he2Var8 = he2Var;
            dec.l(he2Var8, l46Var2, j09VarJ2);
            l46Var2.f0(95128937);
            mx4 mx4Var = gc7.b;
            mx4Var.getClass();
            ?? r5 = 0;
            l2 l2Var = new l2(0 == true ? 1 : 0, mx4Var);
            while (l2Var.hasNext()) {
                gc7 gc7Var = (gc7) l2Var.next();
                float f2 = i == 100 ? 0.01f : f;
                if (f2 <= 0.0d) {
                    g37.a("invalid weight; must be greater than zero");
                }
                if (f2 > Float.MAX_VALUE) {
                    f2 = Float.MAX_VALUE;
                }
                j09 j09VarR = b.r(new jw7(f2, true));
                c92 c92VarA = a92.a(xc0.c, ndb.E0, l46Var2, 48);
                int iHashCode3 = Long.hashCode(l46Var2.T);
                u8a u8aVarM3 = l46Var2.m();
                j09 j09VarJ3 = m93.J(l46Var2, j09VarR);
                lf2.q.getClass();
                l46Var2.j0();
                if (l46Var2.S) {
                    l46Var2.l(ov7Var);
                } else {
                    l46Var2.s0();
                }
                dec.l(he2Var5, l46Var2, c92VarA);
                dec.l(he2Var6, l46Var2, u8aVarM3);
                ib8.s(iHashCode3, l46Var2, he2Var7, l46Var2);
                dec.l(he2Var8, l46Var2, j09VarJ3);
                l2 l2Var2 = l2Var;
                he2 he2Var9 = he2Var8;
                he2 he2Var10 = he2Var7;
                feg.j(od4.A(i >= gc7Var.c() ? gc7Var.b() : gc7Var.a(), r5, l46Var2), null, b.l(g09Var2, 48.0f), null, an2.d, 0.0f, null, l46Var2, 25016, 104);
                j09 j09VarP = b.p(g09Var2, 48.0f);
                String strR = afc.r(R.string.invitation_reward_times, new Object[]{Integer.valueOf(gc7Var.c())}, l46Var2);
                mue mueVar = pue.a;
                nte.b(strR, j09VarP, 0L, 0L, null, null, 0L, null, new jme(3), 0L, 0, false, 0, 0, null, pue.j(l46Var2), l46Var, 48, 0, 130044);
                l46Var2 = l46Var;
                l46Var2.r(true);
                he2Var7 = he2Var10;
                l2Var = l2Var2;
                he2Var5 = he2Var5;
                g09Var2 = g09Var2;
                he2Var8 = he2Var9;
                he2Var6 = he2Var6;
                ov7Var = ov7Var;
                f = 1.0f;
                r5 = 0;
            }
            tec.s(l46Var2, r5, true, true);
            j09Var2 = g09Var2;
        } else {
            l46Var2.Z();
            j09Var2 = j09Var;
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new kc2(j09Var2, i, i2, 5);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x022c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:102:0x022e  */
    /* JADX WARN: Code duplicated, block: B:105:0x0266  */
    /* JADX WARN: Code duplicated, block: B:106:0x026c  */
    /* JADX WARN: Code duplicated, block: B:109:0x02a3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:110:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:113:0x02be A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:114:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:117:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:120:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:122:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004a  */
    /* JADX WARN: Code duplicated, block: B:28:0x004f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0053  */
    /* JADX WARN: Code duplicated, block: B:32:0x005b  */
    /* JADX WARN: Code duplicated, block: B:33:0x005e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0065  */
    /* JADX WARN: Code duplicated, block: B:38:0x006b  */
    /* JADX WARN: Code duplicated, block: B:40:0x0073  */
    /* JADX WARN: Code duplicated, block: B:41:0x0076  */
    /* JADX WARN: Code duplicated, block: B:45:0x007d  */
    /* JADX WARN: Code duplicated, block: B:46:0x0083  */
    /* JADX WARN: Code duplicated, block: B:48:0x008b  */
    /* JADX WARN: Code duplicated, block: B:49:0x008e  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ab A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:58:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:66:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:68:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:70:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:74:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:77:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:78:0x0127  */
    /* JADX WARN: Code duplicated, block: B:80:0x014c  */
    /* JADX WARN: Code duplicated, block: B:81:0x014f  */
    /* JADX WARN: Code duplicated, block: B:84:0x015b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:87:0x016c  */
    /* JADX WARN: Code duplicated, block: B:90:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:93:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:97:0x0217  */
    /* JADX WARN: Code duplicated, block: B:98:0x0219  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v2, types: [int] */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r9v11 */
    public static final void b(final Uri uri, final j09 j09Var, boolean z, int i, boolean z2, x16 x16Var, x16 x16Var2, l46 l46Var, final int i2, final int i3) {
        boolean z3;
        int i4;
        int i5;
        int i6;
        int i7;
        x16 x16Var3;
        int i8;
        int i9;
        int i10;
        x16 x16Var4;
        int i11;
        int i12;
        boolean z4;
        final ?? r4;
        final boolean z5;
        final x16 x16Var5;
        ojb ojbVarV;
        boolean z6;
        i8c i8cVar;
        x16 x16Var6;
        x16 x16Var7;
        Context applicationContext;
        x48 x48Var;
        int i13;
        boolean zG;
        Object objR;
        boolean z7;
        boolean z8;
        final ExoPlayer exoPlayer;
        boolean zG2;
        Object objR2;
        i8c i8cVar2;
        ?? r3;
        ?? r5;
        Object objR3;
        final int i14;
        final int i15;
        boolean zI;
        Object objR4;
        boolean zI2;
        Object objR5;
        Object objR6;
        Object objR7;
        l46 l46Var2 = l46Var;
        l46Var2.h0(-1598109360);
        int i16 = 2;
        int i17 = (l46Var2.i(uri) ? 4 : 2) | i2;
        if ((i2 & 48) == 0) {
            i17 |= l46Var2.g(j09Var) ? 32 : 16;
        }
        int i18 = i3 & 4;
        if (i18 == 0) {
            if ((i2 & 384) == 0) {
                z3 = z;
                i17 |= l46Var2.h(z3) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
            }
            i4 = i17 | 3072;
            i5 = i3 & 16;
            if (i5 != 0) {
                if ((i2 & 24576) == 0) {
                    if (l46Var2.h(z2)) {
                        i6 = 16384;
                    } else {
                        i6 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                    }
                    i4 |= i6;
                }
                i7 = i3 & 32;
                if (i7 != 0) {
                    i9 = i4 | 196608;
                    x16Var3 = x16Var;
                } else {
                    x16Var3 = x16Var;
                    if (l46Var2.i(x16Var3)) {
                        i8 = 131072;
                    } else {
                        i8 = 65536;
                    }
                    i9 = i4 | i8;
                }
                i10 = i3 & 64;
                if (i10 != 0) {
                    i12 = i9 | 1572864;
                    x16Var4 = x16Var2;
                } else {
                    x16Var4 = x16Var2;
                    if (l46Var2.i(x16Var4)) {
                        i11 = 1048576;
                    } else {
                        i11 = 524288;
                    }
                    i12 = i9 | i11;
                }
                if ((i12 & 599187) != 599186) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (l46Var2.W(i12 & 1, z4)) {
                    if (i18 != 0) {
                        z3 = true;
                    }
                    if (i5 != 0) {
                        z6 = false;
                    } else {
                        z6 = z2;
                    }
                    i8cVar = sf2.a;
                    if (i7 != 0) {
                        objR7 = l46Var2.R();
                        if (objR7 == i8cVar) {
                            objR7 = new yqf(i16);
                            l46Var2.p0(objR7);
                        }
                        x16Var6 = (x16) objR7;
                    } else {
                        x16Var6 = x16Var3;
                    }
                    if (i10 != 0) {
                        objR6 = l46Var2.R();
                        if (objR6 == i8cVar) {
                            objR6 = new yqf(3);
                            l46Var2.p0(objR6);
                        }
                        x16Var7 = (x16) objR6;
                    } else {
                        x16Var7 = x16Var4;
                    }
                    if (((Boolean) l46Var2.k(h57.a)).booleanValue()) {
                        l46Var2.f0(436811836);
                        nae.a(b.c(j09Var, 1.0f), null, ((e8b) l46Var2.k(l8b.a)).m, 0L, 0.0f, 0.0f, null, ynb.g, l46Var2, 12582912, 122);
                        l46Var2.r(false);
                        x16Var6 = x16Var6;
                        x16Var7 = x16Var7;
                        z8 = true;
                        l46Var2 = l46Var2;
                        z7 = z3;
                    } else {
                        l46Var2.f0(436992721);
                        applicationContext = ((Context) l46Var2.k(uq.b)).getApplicationContext();
                        x48Var = (x48) l46Var2.k(cb8.a);
                        e89 e89VarI = q1c.i(x16Var6, l46Var2);
                        e89 e89VarI2 = q1c.i(x16Var7, l46Var2);
                        if (z6) {
                            i13 = 4;
                        } else {
                            i13 = 0;
                        }
                        zG = l46Var2.g(uri);
                        objR = l46Var2.R();
                        if (!zG || objR == i8cVar) {
                            y45 y45VarA = new h45(applicationContext).a();
                            d82 d82Var = new d82();
                            ey6 ey6Var = jy6.b;
                            yob yobVar = yob.e;
                            List list = Collections.EMPTY_LIST;
                            ey6 ey6Var2 = jy6.b;
                            z7 = z3;
                            z8 = true;
                            y45VarA.M(new op8("", new ip8(d82Var), new lp8(uri, null, null, list, yob.e, -9223372036854775807L), new kp8(new jp8()), rp8.C, mp8.a));
                            y45VarA.Q(1);
                            y45VarA.P(z7);
                            y45VarA.D();
                            l46Var2.p0(y45VarA);
                            objR = y45VarA;
                        } else {
                            z7 = z3;
                            z8 = true;
                        }
                        exoPlayer = (ExoPlayer) objR;
                        exoPlayer.getClass();
                        zG2 = l46Var2.g(e89VarI) | l46Var2.g(e89VarI2) | l46Var2.i(exoPlayer);
                        objR2 = l46Var2.R();
                        if (zG2) {
                            i8cVar2 = i8cVar;
                        } else {
                            i8cVar2 = i8cVar;
                            if (objR2 == i8cVar2) {
                            }
                            af1.g(exoPlayer, (a26) objR2, l46Var2);
                            Boolean boolValueOf = Boolean.valueOf(z7);
                            if ((i12 & 896) == 256) {
                                r3 = z8 ? 1 : 0;
                            } else {
                                r3 = 0;
                            }
                            r5 = r3 | (l46Var2.i(exoPlayer) ? 1 : 0) | (l46Var2.i(x48Var) ? 1 : 0);
                            objR3 = l46Var2.R();
                            if (r5 == 0 || objR3 == i8cVar2) {
                                objR3 = new so2(x48Var, z7, exoPlayer, 11);
                                l46Var2.p0(objR3);
                            }
                            af1.i(exoPlayer, x48Var, boolValueOf, (a26) objR3, l46Var2);
                            j09 j09VarC = b.c(j09Var, 1.0f);
                            i14 = 0;
                            xn8 xn8VarC = s21.c(ndb.b, false);
                            int iHashCode = Long.hashCode(l46Var2.T);
                            u8a u8aVarM = l46Var2.m();
                            j09 j09VarJ = m93.J(l46Var2, j09VarC);
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
                            j09 j09VarB = d31.a.b(g09.a);
                            i15 = i13;
                            zI = l46Var2.i(exoPlayer) | l46Var2.e(i15);
                            objR4 = l46Var2.R();
                            if (zI || objR4 == i8cVar2) {
                                objR4 = new a26() { // from class: ytf
                                    @Override // defpackage.a26
                                    public final Object d(Object obj) {
                                        int i19 = i14;
                                        int i20 = i15;
                                        ExoPlayer exoPlayer2 = exoPlayer;
                                        switch (i19) {
                                            case 0:
                                                Context context = (Context) obj;
                                                context.getClass();
                                                View viewInflate = LayoutInflater.from(context).inflate(R.layout.video_container_player, (ViewGroup) null, false);
                                                viewInflate.getClass();
                                                PlayerView playerView = (PlayerView) viewInflate;
                                                playerView.setPlayer(exoPlayer2);
                                                playerView.setResizeMode(i20);
                                                playerView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                                                return playerView;
                                            default:
                                                PlayerView playerView2 = (PlayerView) obj;
                                                playerView2.getClass();
                                                if (playerView2.getPlayer() != exoPlayer2) {
                                                    playerView2.setPlayer(exoPlayer2);
                                                }
                                                playerView2.setResizeMode(i20);
                                                return wef.a;
                                        }
                                    }
                                };
                                l46Var2.p0(objR4);
                            }
                            a26 a26Var = (a26) objR4;
                            zI2 = l46Var2.i(exoPlayer) | l46Var2.e(i15);
                            objR5 = l46Var2.R();
                            if (zI2 || objR5 == i8cVar2) {
                                final int i19 = z8 ? 1 : 0;
                                objR5 = new a26() { // from class: ytf
                                    @Override // defpackage.a26
                                    public final Object d(Object obj) {
                                        int i110 = i19;
                                        int i20 = i15;
                                        ExoPlayer exoPlayer2 = exoPlayer;
                                        switch (i110) {
                                            case 0:
                                                Context context = (Context) obj;
                                                context.getClass();
                                                View viewInflate = LayoutInflater.from(context).inflate(R.layout.video_container_player, (ViewGroup) null, false);
                                                viewInflate.getClass();
                                                PlayerView playerView = (PlayerView) viewInflate;
                                                playerView.setPlayer(exoPlayer2);
                                                playerView.setResizeMode(i20);
                                                playerView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                                                return playerView;
                                            default:
                                                PlayerView playerView2 = (PlayerView) obj;
                                                playerView2.getClass();
                                                if (playerView2.getPlayer() != exoPlayer2) {
                                                    playerView2.setPlayer(exoPlayer2);
                                                }
                                                playerView2.setResizeMode(i20);
                                                return wef.a;
                                        }
                                    }
                                };
                                l46Var2.p0(objR5);
                            }
                            l46Var2 = l46Var2;
                            xo1.c(a26Var, j09VarB, (a26) objR5, l46Var2, 0, 0);
                            l46Var2.r(z8);
                            l46Var2.r(false);
                        }
                        objR2 = new bv9(exoPlayer, e89VarI, e89VarI2, 23);
                        l46Var2.p0(objR2);
                        af1.g(exoPlayer, (a26) objR2, l46Var2);
                        Boolean boolValueOf2 = Boolean.valueOf(z7);
                        if ((i12 & 896) == 256) {
                            r3 = z8 ? 1 : 0;
                        } else {
                            r3 = 0;
                        }
                        r5 = r3 | (l46Var2.i(exoPlayer) ? 1 : 0) | (l46Var2.i(x48Var) ? 1 : 0);
                        objR3 = l46Var2.R();
                        if (r5 == 0) {
                            objR3 = new so2(x48Var, z7, exoPlayer, 11);
                            l46Var2.p0(objR3);
                        } else {
                            objR3 = new so2(x48Var, z7, exoPlayer, 11);
                            l46Var2.p0(objR3);
                        }
                        af1.i(exoPlayer, x48Var, boolValueOf2, (a26) objR3, l46Var2);
                        j09 j09VarC2 = b.c(j09Var, 1.0f);
                        i14 = 0;
                        xn8 xn8VarC2 = s21.c(ndb.b, false);
                        int iHashCode2 = Long.hashCode(l46Var2.T);
                        u8a u8aVarM2 = l46Var2.m();
                        j09 j09VarJ2 = m93.J(l46Var2, j09VarC2);
                        lf2.q.getClass();
                        l46Var2.j0();
                        if (l46Var2.S) {
                            l46Var2.l(LayoutNode.h1);
                        } else {
                            l46Var2.s0();
                        }
                        dec.l(hj6.z, l46Var2, xn8VarC2);
                        dec.l(hj6.y, l46Var2, u8aVarM2);
                        dec.l(hj6.X, l46Var2, Integer.valueOf(iHashCode2));
                        dec.k(l46Var2);
                        dec.l(hj6.x, l46Var2, j09VarJ2);
                        j09 j09VarB2 = d31.a.b(g09.a);
                        i15 = i13;
                        zI = l46Var2.i(exoPlayer) | l46Var2.e(i15);
                        objR4 = l46Var2.R();
                        if (zI) {
                            objR4 = new a26() { // from class: ytf
                                @Override // defpackage.a26
                                public final Object d(Object obj) {
                                    int i110 = i14;
                                    int i20 = i15;
                                    ExoPlayer exoPlayer2 = exoPlayer;
                                    switch (i110) {
                                        case 0:
                                            Context context = (Context) obj;
                                            context.getClass();
                                            View viewInflate = LayoutInflater.from(context).inflate(R.layout.video_container_player, (ViewGroup) null, false);
                                            viewInflate.getClass();
                                            PlayerView playerView = (PlayerView) viewInflate;
                                            playerView.setPlayer(exoPlayer2);
                                            playerView.setResizeMode(i20);
                                            playerView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                                            return playerView;
                                        default:
                                            PlayerView playerView2 = (PlayerView) obj;
                                            playerView2.getClass();
                                            if (playerView2.getPlayer() != exoPlayer2) {
                                                playerView2.setPlayer(exoPlayer2);
                                            }
                                            playerView2.setResizeMode(i20);
                                            return wef.a;
                                    }
                                }
                            };
                            l46Var2.p0(objR4);
                        } else {
                            objR4 = new a26() { // from class: ytf
                                @Override // defpackage.a26
                                public final Object d(Object obj) {
                                    int i110 = i14;
                                    int i20 = i15;
                                    ExoPlayer exoPlayer2 = exoPlayer;
                                    switch (i110) {
                                        case 0:
                                            Context context = (Context) obj;
                                            context.getClass();
                                            View viewInflate = LayoutInflater.from(context).inflate(R.layout.video_container_player, (ViewGroup) null, false);
                                            viewInflate.getClass();
                                            PlayerView playerView = (PlayerView) viewInflate;
                                            playerView.setPlayer(exoPlayer2);
                                            playerView.setResizeMode(i20);
                                            playerView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                                            return playerView;
                                        default:
                                            PlayerView playerView2 = (PlayerView) obj;
                                            playerView2.getClass();
                                            if (playerView2.getPlayer() != exoPlayer2) {
                                                playerView2.setPlayer(exoPlayer2);
                                            }
                                            playerView2.setResizeMode(i20);
                                            return wef.a;
                                    }
                                }
                            };
                            l46Var2.p0(objR4);
                        }
                        a26 a26Var2 = (a26) objR4;
                        zI2 = l46Var2.i(exoPlayer) | l46Var2.e(i15);
                        objR5 = l46Var2.R();
                        if (zI2) {
                            final int i110 = z8 ? 1 : 0;
                            objR5 = new a26() { // from class: ytf
                                @Override // defpackage.a26
                                public final Object d(Object obj) {
                                    int i111 = i110;
                                    int i20 = i15;
                                    ExoPlayer exoPlayer2 = exoPlayer;
                                    switch (i111) {
                                        case 0:
                                            Context context = (Context) obj;
                                            context.getClass();
                                            View viewInflate = LayoutInflater.from(context).inflate(R.layout.video_container_player, (ViewGroup) null, false);
                                            viewInflate.getClass();
                                            PlayerView playerView = (PlayerView) viewInflate;
                                            playerView.setPlayer(exoPlayer2);
                                            playerView.setResizeMode(i20);
                                            playerView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                                            return playerView;
                                        default:
                                            PlayerView playerView2 = (PlayerView) obj;
                                            playerView2.getClass();
                                            if (playerView2.getPlayer() != exoPlayer2) {
                                                playerView2.setPlayer(exoPlayer2);
                                            }
                                            playerView2.setResizeMode(i20);
                                            return wef.a;
                                    }
                                }
                            };
                            l46Var2.p0(objR5);
                        } else {
                            final int i111 = z8 ? 1 : 0;
                            objR5 = new a26() { // from class: ytf
                                @Override // defpackage.a26
                                public final Object d(Object obj) {
                                    int i112 = i111;
                                    int i20 = i15;
                                    ExoPlayer exoPlayer2 = exoPlayer;
                                    switch (i112) {
                                        case 0:
                                            Context context = (Context) obj;
                                            context.getClass();
                                            View viewInflate = LayoutInflater.from(context).inflate(R.layout.video_container_player, (ViewGroup) null, false);
                                            viewInflate.getClass();
                                            PlayerView playerView = (PlayerView) viewInflate;
                                            playerView.setPlayer(exoPlayer2);
                                            playerView.setResizeMode(i20);
                                            playerView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                                            return playerView;
                                        default:
                                            PlayerView playerView2 = (PlayerView) obj;
                                            playerView2.getClass();
                                            if (playerView2.getPlayer() != exoPlayer2) {
                                                playerView2.setPlayer(exoPlayer2);
                                            }
                                            playerView2.setResizeMode(i20);
                                            return wef.a;
                                    }
                                }
                            };
                            l46Var2.p0(objR5);
                        }
                        l46Var2 = l46Var2;
                        xo1.c(a26Var2, j09VarB2, (a26) objR5, l46Var2, 0, 0);
                        l46Var2.r(z8);
                        l46Var2.r(false);
                    }
                    z3 = z7;
                    r4 = z8;
                    x16Var5 = x16Var6;
                    x16Var4 = x16Var7;
                    z5 = z6;
                } else {
                    l46Var2.Z();
                    r4 = i;
                    z5 = z2;
                    x16Var5 = x16Var3;
                }
                ojbVarV = l46Var2.v();
                if (ojbVarV != null) {
                    final boolean z9 = z3;
                    final x16 x16Var8 = x16Var4;
                    ojbVarV.d = new l26() { // from class: ztf
                        @Override // defpackage.l26
                        public final Object z(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            r8c.b(uri, j09Var, z9, r4, z5, x16Var5, x16Var8, (l46) obj, k99.P(i2 | 1), i3);
                            return wef.a;
                        }
                    };
                }
            }
            i4 = i17 | 27648;
            i7 = i3 & 32;
            if (i7 != 0) {
                i9 = i4 | 196608;
                x16Var3 = x16Var;
            } else {
                x16Var3 = x16Var;
                if (l46Var2.i(x16Var3)) {
                    i8 = 131072;
                } else {
                    i8 = 65536;
                }
                i9 = i4 | i8;
            }
            i10 = i3 & 64;
            if (i10 != 0) {
                i12 = i9 | 1572864;
                x16Var4 = x16Var2;
            } else {
                x16Var4 = x16Var2;
                if (l46Var2.i(x16Var4)) {
                    i11 = 1048576;
                } else {
                    i11 = 524288;
                }
                i12 = i9 | i11;
            }
            if ((i12 & 599187) != 599186) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (l46Var2.W(i12 & 1, z4)) {
                if (i18 != 0) {
                    z3 = true;
                }
                if (i5 != 0) {
                    z6 = false;
                } else {
                    z6 = z2;
                }
                i8cVar = sf2.a;
                if (i7 != 0) {
                    objR7 = l46Var2.R();
                    if (objR7 == i8cVar) {
                        objR7 = new yqf(i16);
                        l46Var2.p0(objR7);
                    }
                    x16Var6 = (x16) objR7;
                } else {
                    x16Var6 = x16Var3;
                }
                if (i10 != 0) {
                    objR6 = l46Var2.R();
                    if (objR6 == i8cVar) {
                        objR6 = new yqf(3);
                        l46Var2.p0(objR6);
                    }
                    x16Var7 = (x16) objR6;
                } else {
                    x16Var7 = x16Var4;
                }
                if (((Boolean) l46Var2.k(h57.a)).booleanValue()) {
                    l46Var2.f0(436811836);
                    nae.a(b.c(j09Var, 1.0f), null, ((e8b) l46Var2.k(l8b.a)).m, 0L, 0.0f, 0.0f, null, ynb.g, l46Var2, 12582912, 122);
                    l46Var2.r(false);
                    x16Var6 = x16Var6;
                    x16Var7 = x16Var7;
                    z8 = true;
                    l46Var2 = l46Var2;
                    z7 = z3;
                } else {
                    l46Var2.f0(436992721);
                    applicationContext = ((Context) l46Var2.k(uq.b)).getApplicationContext();
                    x48Var = (x48) l46Var2.k(cb8.a);
                    e89 e89VarI3 = q1c.i(x16Var6, l46Var2);
                    e89 e89VarI4 = q1c.i(x16Var7, l46Var2);
                    if (z6) {
                        i13 = 4;
                    } else {
                        i13 = 0;
                    }
                    zG = l46Var2.g(uri);
                    objR = l46Var2.R();
                    if (zG) {
                        y45 y45VarA2 = new h45(applicationContext).a();
                        d82 d82Var2 = new d82();
                        ey6 ey6Var3 = jy6.b;
                        yob yobVar2 = yob.e;
                        List list2 = Collections.EMPTY_LIST;
                        ey6 ey6Var4 = jy6.b;
                        z7 = z3;
                        z8 = true;
                        y45VarA2.M(new op8("", new ip8(d82Var2), new lp8(uri, null, null, list2, yob.e, -9223372036854775807L), new kp8(new jp8()), rp8.C, mp8.a));
                        y45VarA2.Q(1);
                        y45VarA2.P(z7);
                        y45VarA2.D();
                        l46Var2.p0(y45VarA2);
                        objR = y45VarA2;
                    } else {
                        y45 y45VarA3 = new h45(applicationContext).a();
                        d82 d82Var3 = new d82();
                        ey6 ey6Var5 = jy6.b;
                        yob yobVar3 = yob.e;
                        List list3 = Collections.EMPTY_LIST;
                        ey6 ey6Var6 = jy6.b;
                        z7 = z3;
                        z8 = true;
                        y45VarA3.M(new op8("", new ip8(d82Var3), new lp8(uri, null, null, list3, yob.e, -9223372036854775807L), new kp8(new jp8()), rp8.C, mp8.a));
                        y45VarA3.Q(1);
                        y45VarA3.P(z7);
                        y45VarA3.D();
                        l46Var2.p0(y45VarA3);
                        objR = y45VarA3;
                    }
                    exoPlayer = (ExoPlayer) objR;
                    exoPlayer.getClass();
                    zG2 = l46Var2.g(e89VarI3) | l46Var2.g(e89VarI4) | l46Var2.i(exoPlayer);
                    objR2 = l46Var2.R();
                    if (zG2) {
                        i8cVar2 = i8cVar;
                        if (objR2 == i8cVar2) {
                        }
                        af1.g(exoPlayer, (a26) objR2, l46Var2);
                        Boolean boolValueOf3 = Boolean.valueOf(z7);
                        if ((i12 & 896) == 256) {
                            r3 = z8 ? 1 : 0;
                        } else {
                            r3 = 0;
                        }
                        r5 = r3 | (l46Var2.i(exoPlayer) ? 1 : 0) | (l46Var2.i(x48Var) ? 1 : 0);
                        objR3 = l46Var2.R();
                        if (r5 == 0) {
                            objR3 = new so2(x48Var, z7, exoPlayer, 11);
                            l46Var2.p0(objR3);
                        } else {
                            objR3 = new so2(x48Var, z7, exoPlayer, 11);
                            l46Var2.p0(objR3);
                        }
                        af1.i(exoPlayer, x48Var, boolValueOf3, (a26) objR3, l46Var2);
                        j09 j09VarC3 = b.c(j09Var, 1.0f);
                        i14 = 0;
                        xn8 xn8VarC3 = s21.c(ndb.b, false);
                        int iHashCode3 = Long.hashCode(l46Var2.T);
                        u8a u8aVarM3 = l46Var2.m();
                        j09 j09VarJ3 = m93.J(l46Var2, j09VarC3);
                        lf2.q.getClass();
                        l46Var2.j0();
                        if (l46Var2.S) {
                            l46Var2.l(LayoutNode.h1);
                        } else {
                            l46Var2.s0();
                        }
                        dec.l(hj6.z, l46Var2, xn8VarC3);
                        dec.l(hj6.y, l46Var2, u8aVarM3);
                        dec.l(hj6.X, l46Var2, Integer.valueOf(iHashCode3));
                        dec.k(l46Var2);
                        dec.l(hj6.x, l46Var2, j09VarJ3);
                        j09 j09VarB3 = d31.a.b(g09.a);
                        i15 = i13;
                        zI = l46Var2.i(exoPlayer) | l46Var2.e(i15);
                        objR4 = l46Var2.R();
                        if (zI) {
                            objR4 = new a26() { // from class: ytf
                                @Override // defpackage.a26
                                public final Object d(Object obj) {
                                    int i112 = i14;
                                    int i20 = i15;
                                    ExoPlayer exoPlayer2 = exoPlayer;
                                    switch (i112) {
                                        case 0:
                                            Context context = (Context) obj;
                                            context.getClass();
                                            View viewInflate = LayoutInflater.from(context).inflate(R.layout.video_container_player, (ViewGroup) null, false);
                                            viewInflate.getClass();
                                            PlayerView playerView = (PlayerView) viewInflate;
                                            playerView.setPlayer(exoPlayer2);
                                            playerView.setResizeMode(i20);
                                            playerView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                                            return playerView;
                                        default:
                                            PlayerView playerView2 = (PlayerView) obj;
                                            playerView2.getClass();
                                            if (playerView2.getPlayer() != exoPlayer2) {
                                                playerView2.setPlayer(exoPlayer2);
                                            }
                                            playerView2.setResizeMode(i20);
                                            return wef.a;
                                    }
                                }
                            };
                            l46Var2.p0(objR4);
                        } else {
                            objR4 = new a26() { // from class: ytf
                                @Override // defpackage.a26
                                public final Object d(Object obj) {
                                    int i112 = i14;
                                    int i20 = i15;
                                    ExoPlayer exoPlayer2 = exoPlayer;
                                    switch (i112) {
                                        case 0:
                                            Context context = (Context) obj;
                                            context.getClass();
                                            View viewInflate = LayoutInflater.from(context).inflate(R.layout.video_container_player, (ViewGroup) null, false);
                                            viewInflate.getClass();
                                            PlayerView playerView = (PlayerView) viewInflate;
                                            playerView.setPlayer(exoPlayer2);
                                            playerView.setResizeMode(i20);
                                            playerView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                                            return playerView;
                                        default:
                                            PlayerView playerView2 = (PlayerView) obj;
                                            playerView2.getClass();
                                            if (playerView2.getPlayer() != exoPlayer2) {
                                                playerView2.setPlayer(exoPlayer2);
                                            }
                                            playerView2.setResizeMode(i20);
                                            return wef.a;
                                    }
                                }
                            };
                            l46Var2.p0(objR4);
                        }
                        a26 a26Var3 = (a26) objR4;
                        zI2 = l46Var2.i(exoPlayer) | l46Var2.e(i15);
                        objR5 = l46Var2.R();
                        if (zI2) {
                            final int i112 = z8 ? 1 : 0;
                            objR5 = new a26() { // from class: ytf
                                @Override // defpackage.a26
                                public final Object d(Object obj) {
                                    int i113 = i112;
                                    int i20 = i15;
                                    ExoPlayer exoPlayer2 = exoPlayer;
                                    switch (i113) {
                                        case 0:
                                            Context context = (Context) obj;
                                            context.getClass();
                                            View viewInflate = LayoutInflater.from(context).inflate(R.layout.video_container_player, (ViewGroup) null, false);
                                            viewInflate.getClass();
                                            PlayerView playerView = (PlayerView) viewInflate;
                                            playerView.setPlayer(exoPlayer2);
                                            playerView.setResizeMode(i20);
                                            playerView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                                            return playerView;
                                        default:
                                            PlayerView playerView2 = (PlayerView) obj;
                                            playerView2.getClass();
                                            if (playerView2.getPlayer() != exoPlayer2) {
                                                playerView2.setPlayer(exoPlayer2);
                                            }
                                            playerView2.setResizeMode(i20);
                                            return wef.a;
                                    }
                                }
                            };
                            l46Var2.p0(objR5);
                        } else {
                            final int i113 = z8 ? 1 : 0;
                            objR5 = new a26() { // from class: ytf
                                @Override // defpackage.a26
                                public final Object d(Object obj) {
                                    int i114 = i113;
                                    int i20 = i15;
                                    ExoPlayer exoPlayer2 = exoPlayer;
                                    switch (i114) {
                                        case 0:
                                            Context context = (Context) obj;
                                            context.getClass();
                                            View viewInflate = LayoutInflater.from(context).inflate(R.layout.video_container_player, (ViewGroup) null, false);
                                            viewInflate.getClass();
                                            PlayerView playerView = (PlayerView) viewInflate;
                                            playerView.setPlayer(exoPlayer2);
                                            playerView.setResizeMode(i20);
                                            playerView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                                            return playerView;
                                        default:
                                            PlayerView playerView2 = (PlayerView) obj;
                                            playerView2.getClass();
                                            if (playerView2.getPlayer() != exoPlayer2) {
                                                playerView2.setPlayer(exoPlayer2);
                                            }
                                            playerView2.setResizeMode(i20);
                                            return wef.a;
                                    }
                                }
                            };
                            l46Var2.p0(objR5);
                        }
                        l46Var2 = l46Var2;
                        xo1.c(a26Var3, j09VarB3, (a26) objR5, l46Var2, 0, 0);
                        l46Var2.r(z8);
                        l46Var2.r(false);
                    } else {
                        i8cVar2 = i8cVar;
                    }
                    objR2 = new bv9(exoPlayer, e89VarI3, e89VarI4, 23);
                    l46Var2.p0(objR2);
                    af1.g(exoPlayer, (a26) objR2, l46Var2);
                    Boolean boolValueOf4 = Boolean.valueOf(z7);
                    if ((i12 & 896) == 256) {
                        r3 = z8 ? 1 : 0;
                    } else {
                        r3 = 0;
                    }
                    r5 = r3 | (l46Var2.i(exoPlayer) ? 1 : 0) | (l46Var2.i(x48Var) ? 1 : 0);
                    objR3 = l46Var2.R();
                    if (r5 == 0) {
                        objR3 = new so2(x48Var, z7, exoPlayer, 11);
                        l46Var2.p0(objR3);
                    } else {
                        objR3 = new so2(x48Var, z7, exoPlayer, 11);
                        l46Var2.p0(objR3);
                    }
                    af1.i(exoPlayer, x48Var, boolValueOf4, (a26) objR3, l46Var2);
                    j09 j09VarC4 = b.c(j09Var, 1.0f);
                    i14 = 0;
                    xn8 xn8VarC4 = s21.c(ndb.b, false);
                    int iHashCode4 = Long.hashCode(l46Var2.T);
                    u8a u8aVarM4 = l46Var2.m();
                    j09 j09VarJ4 = m93.J(l46Var2, j09VarC4);
                    lf2.q.getClass();
                    l46Var2.j0();
                    if (l46Var2.S) {
                        l46Var2.l(LayoutNode.h1);
                    } else {
                        l46Var2.s0();
                    }
                    dec.l(hj6.z, l46Var2, xn8VarC4);
                    dec.l(hj6.y, l46Var2, u8aVarM4);
                    dec.l(hj6.X, l46Var2, Integer.valueOf(iHashCode4));
                    dec.k(l46Var2);
                    dec.l(hj6.x, l46Var2, j09VarJ4);
                    j09 j09VarB4 = d31.a.b(g09.a);
                    i15 = i13;
                    zI = l46Var2.i(exoPlayer) | l46Var2.e(i15);
                    objR4 = l46Var2.R();
                    if (zI) {
                        objR4 = new a26() { // from class: ytf
                            @Override // defpackage.a26
                            public final Object d(Object obj) {
                                int i114 = i14;
                                int i20 = i15;
                                ExoPlayer exoPlayer2 = exoPlayer;
                                switch (i114) {
                                    case 0:
                                        Context context = (Context) obj;
                                        context.getClass();
                                        View viewInflate = LayoutInflater.from(context).inflate(R.layout.video_container_player, (ViewGroup) null, false);
                                        viewInflate.getClass();
                                        PlayerView playerView = (PlayerView) viewInflate;
                                        playerView.setPlayer(exoPlayer2);
                                        playerView.setResizeMode(i20);
                                        playerView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                                        return playerView;
                                    default:
                                        PlayerView playerView2 = (PlayerView) obj;
                                        playerView2.getClass();
                                        if (playerView2.getPlayer() != exoPlayer2) {
                                            playerView2.setPlayer(exoPlayer2);
                                        }
                                        playerView2.setResizeMode(i20);
                                        return wef.a;
                                }
                            }
                        };
                        l46Var2.p0(objR4);
                    } else {
                        objR4 = new a26() { // from class: ytf
                            @Override // defpackage.a26
                            public final Object d(Object obj) {
                                int i114 = i14;
                                int i20 = i15;
                                ExoPlayer exoPlayer2 = exoPlayer;
                                switch (i114) {
                                    case 0:
                                        Context context = (Context) obj;
                                        context.getClass();
                                        View viewInflate = LayoutInflater.from(context).inflate(R.layout.video_container_player, (ViewGroup) null, false);
                                        viewInflate.getClass();
                                        PlayerView playerView = (PlayerView) viewInflate;
                                        playerView.setPlayer(exoPlayer2);
                                        playerView.setResizeMode(i20);
                                        playerView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                                        return playerView;
                                    default:
                                        PlayerView playerView2 = (PlayerView) obj;
                                        playerView2.getClass();
                                        if (playerView2.getPlayer() != exoPlayer2) {
                                            playerView2.setPlayer(exoPlayer2);
                                        }
                                        playerView2.setResizeMode(i20);
                                        return wef.a;
                                }
                            }
                        };
                        l46Var2.p0(objR4);
                    }
                    a26 a26Var4 = (a26) objR4;
                    zI2 = l46Var2.i(exoPlayer) | l46Var2.e(i15);
                    objR5 = l46Var2.R();
                    if (zI2) {
                        final int i114 = z8 ? 1 : 0;
                        objR5 = new a26() { // from class: ytf
                            @Override // defpackage.a26
                            public final Object d(Object obj) {
                                int i115 = i114;
                                int i20 = i15;
                                ExoPlayer exoPlayer2 = exoPlayer;
                                switch (i115) {
                                    case 0:
                                        Context context = (Context) obj;
                                        context.getClass();
                                        View viewInflate = LayoutInflater.from(context).inflate(R.layout.video_container_player, (ViewGroup) null, false);
                                        viewInflate.getClass();
                                        PlayerView playerView = (PlayerView) viewInflate;
                                        playerView.setPlayer(exoPlayer2);
                                        playerView.setResizeMode(i20);
                                        playerView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                                        return playerView;
                                    default:
                                        PlayerView playerView2 = (PlayerView) obj;
                                        playerView2.getClass();
                                        if (playerView2.getPlayer() != exoPlayer2) {
                                            playerView2.setPlayer(exoPlayer2);
                                        }
                                        playerView2.setResizeMode(i20);
                                        return wef.a;
                                }
                            }
                        };
                        l46Var2.p0(objR5);
                    } else {
                        final int i115 = z8 ? 1 : 0;
                        objR5 = new a26() { // from class: ytf
                            @Override // defpackage.a26
                            public final Object d(Object obj) {
                                int i116 = i115;
                                int i20 = i15;
                                ExoPlayer exoPlayer2 = exoPlayer;
                                switch (i116) {
                                    case 0:
                                        Context context = (Context) obj;
                                        context.getClass();
                                        View viewInflate = LayoutInflater.from(context).inflate(R.layout.video_container_player, (ViewGroup) null, false);
                                        viewInflate.getClass();
                                        PlayerView playerView = (PlayerView) viewInflate;
                                        playerView.setPlayer(exoPlayer2);
                                        playerView.setResizeMode(i20);
                                        playerView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                                        return playerView;
                                    default:
                                        PlayerView playerView2 = (PlayerView) obj;
                                        playerView2.getClass();
                                        if (playerView2.getPlayer() != exoPlayer2) {
                                            playerView2.setPlayer(exoPlayer2);
                                        }
                                        playerView2.setResizeMode(i20);
                                        return wef.a;
                                }
                            }
                        };
                        l46Var2.p0(objR5);
                    }
                    l46Var2 = l46Var2;
                    xo1.c(a26Var4, j09VarB4, (a26) objR5, l46Var2, 0, 0);
                    l46Var2.r(z8);
                    l46Var2.r(false);
                }
                z3 = z7;
                r4 = z8;
                x16Var5 = x16Var6;
                x16Var4 = x16Var7;
                z5 = z6;
            } else {
                l46Var2.Z();
                r4 = i;
                z5 = z2;
                x16Var5 = x16Var3;
            }
            ojbVarV = l46Var2.v();
            if (ojbVarV != null) {
                final boolean z10 = z3;
                final x16 x16Var9 = x16Var4;
                ojbVarV.d = new l26() { // from class: ztf
                    @Override // defpackage.l26
                    public final Object z(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        r8c.b(uri, j09Var, z10, r4, z5, x16Var5, x16Var9, (l46) obj, k99.P(i2 | 1), i3);
                        return wef.a;
                    }
                };
            }
        }
        i17 |= 384;
        z3 = z;
        i4 = i17 | 3072;
        i5 = i3 & 16;
        if (i5 != 0) {
            if ((i2 & 24576) == 0) {
                if (l46Var2.h(z2)) {
                    i6 = 16384;
                } else {
                    i6 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                }
                i4 |= i6;
            }
            i7 = i3 & 32;
            if (i7 != 0) {
                i9 = i4 | 196608;
                x16Var3 = x16Var;
            } else {
                x16Var3 = x16Var;
                if (l46Var2.i(x16Var3)) {
                    i8 = 131072;
                } else {
                    i8 = 65536;
                }
                i9 = i4 | i8;
            }
            i10 = i3 & 64;
            if (i10 != 0) {
                i12 = i9 | 1572864;
                x16Var4 = x16Var2;
            } else {
                x16Var4 = x16Var2;
                if (l46Var2.i(x16Var4)) {
                    i11 = 1048576;
                } else {
                    i11 = 524288;
                }
                i12 = i9 | i11;
            }
            if ((i12 & 599187) != 599186) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (l46Var2.W(i12 & 1, z4)) {
                if (i18 != 0) {
                    z3 = true;
                }
                if (i5 != 0) {
                    z6 = false;
                } else {
                    z6 = z2;
                }
                i8cVar = sf2.a;
                if (i7 != 0) {
                    objR7 = l46Var2.R();
                    if (objR7 == i8cVar) {
                        objR7 = new yqf(i16);
                        l46Var2.p0(objR7);
                    }
                    x16Var6 = (x16) objR7;
                } else {
                    x16Var6 = x16Var3;
                }
                if (i10 != 0) {
                    objR6 = l46Var2.R();
                    if (objR6 == i8cVar) {
                        objR6 = new yqf(3);
                        l46Var2.p0(objR6);
                    }
                    x16Var7 = (x16) objR6;
                } else {
                    x16Var7 = x16Var4;
                }
                if (((Boolean) l46Var2.k(h57.a)).booleanValue()) {
                    l46Var2.f0(436811836);
                    nae.a(b.c(j09Var, 1.0f), null, ((e8b) l46Var2.k(l8b.a)).m, 0L, 0.0f, 0.0f, null, ynb.g, l46Var2, 12582912, 122);
                    l46Var2.r(false);
                    x16Var6 = x16Var6;
                    x16Var7 = x16Var7;
                    z8 = true;
                    l46Var2 = l46Var2;
                    z7 = z3;
                } else {
                    l46Var2.f0(436992721);
                    applicationContext = ((Context) l46Var2.k(uq.b)).getApplicationContext();
                    x48Var = (x48) l46Var2.k(cb8.a);
                    e89 e89VarI5 = q1c.i(x16Var6, l46Var2);
                    e89 e89VarI6 = q1c.i(x16Var7, l46Var2);
                    if (z6) {
                        i13 = 4;
                    } else {
                        i13 = 0;
                    }
                    zG = l46Var2.g(uri);
                    objR = l46Var2.R();
                    if (zG) {
                        y45 y45VarA4 = new h45(applicationContext).a();
                        d82 d82Var4 = new d82();
                        ey6 ey6Var7 = jy6.b;
                        yob yobVar4 = yob.e;
                        List list4 = Collections.EMPTY_LIST;
                        ey6 ey6Var8 = jy6.b;
                        z7 = z3;
                        z8 = true;
                        y45VarA4.M(new op8("", new ip8(d82Var4), new lp8(uri, null, null, list4, yob.e, -9223372036854775807L), new kp8(new jp8()), rp8.C, mp8.a));
                        y45VarA4.Q(1);
                        y45VarA4.P(z7);
                        y45VarA4.D();
                        l46Var2.p0(y45VarA4);
                        objR = y45VarA4;
                    } else {
                        y45 y45VarA5 = new h45(applicationContext).a();
                        d82 d82Var5 = new d82();
                        ey6 ey6Var9 = jy6.b;
                        yob yobVar5 = yob.e;
                        List list5 = Collections.EMPTY_LIST;
                        ey6 ey6Var10 = jy6.b;
                        z7 = z3;
                        z8 = true;
                        y45VarA5.M(new op8("", new ip8(d82Var5), new lp8(uri, null, null, list5, yob.e, -9223372036854775807L), new kp8(new jp8()), rp8.C, mp8.a));
                        y45VarA5.Q(1);
                        y45VarA5.P(z7);
                        y45VarA5.D();
                        l46Var2.p0(y45VarA5);
                        objR = y45VarA5;
                    }
                    exoPlayer = (ExoPlayer) objR;
                    exoPlayer.getClass();
                    zG2 = l46Var2.g(e89VarI5) | l46Var2.g(e89VarI6) | l46Var2.i(exoPlayer);
                    objR2 = l46Var2.R();
                    if (zG2) {
                        i8cVar2 = i8cVar;
                        if (objR2 == i8cVar2) {
                        }
                        af1.g(exoPlayer, (a26) objR2, l46Var2);
                        Boolean boolValueOf5 = Boolean.valueOf(z7);
                        if ((i12 & 896) == 256) {
                            r3 = z8 ? 1 : 0;
                        } else {
                            r3 = 0;
                        }
                        r5 = r3 | (l46Var2.i(exoPlayer) ? 1 : 0) | (l46Var2.i(x48Var) ? 1 : 0);
                        objR3 = l46Var2.R();
                        if (r5 == 0) {
                            objR3 = new so2(x48Var, z7, exoPlayer, 11);
                            l46Var2.p0(objR3);
                        } else {
                            objR3 = new so2(x48Var, z7, exoPlayer, 11);
                            l46Var2.p0(objR3);
                        }
                        af1.i(exoPlayer, x48Var, boolValueOf5, (a26) objR3, l46Var2);
                        j09 j09VarC5 = b.c(j09Var, 1.0f);
                        i14 = 0;
                        xn8 xn8VarC5 = s21.c(ndb.b, false);
                        int iHashCode5 = Long.hashCode(l46Var2.T);
                        u8a u8aVarM5 = l46Var2.m();
                        j09 j09VarJ5 = m93.J(l46Var2, j09VarC5);
                        lf2.q.getClass();
                        l46Var2.j0();
                        if (l46Var2.S) {
                            l46Var2.l(LayoutNode.h1);
                        } else {
                            l46Var2.s0();
                        }
                        dec.l(hj6.z, l46Var2, xn8VarC5);
                        dec.l(hj6.y, l46Var2, u8aVarM5);
                        dec.l(hj6.X, l46Var2, Integer.valueOf(iHashCode5));
                        dec.k(l46Var2);
                        dec.l(hj6.x, l46Var2, j09VarJ5);
                        j09 j09VarB5 = d31.a.b(g09.a);
                        i15 = i13;
                        zI = l46Var2.i(exoPlayer) | l46Var2.e(i15);
                        objR4 = l46Var2.R();
                        if (zI) {
                            objR4 = new a26() { // from class: ytf
                                @Override // defpackage.a26
                                public final Object d(Object obj) {
                                    int i116 = i14;
                                    int i20 = i15;
                                    ExoPlayer exoPlayer2 = exoPlayer;
                                    switch (i116) {
                                        case 0:
                                            Context context = (Context) obj;
                                            context.getClass();
                                            View viewInflate = LayoutInflater.from(context).inflate(R.layout.video_container_player, (ViewGroup) null, false);
                                            viewInflate.getClass();
                                            PlayerView playerView = (PlayerView) viewInflate;
                                            playerView.setPlayer(exoPlayer2);
                                            playerView.setResizeMode(i20);
                                            playerView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                                            return playerView;
                                        default:
                                            PlayerView playerView2 = (PlayerView) obj;
                                            playerView2.getClass();
                                            if (playerView2.getPlayer() != exoPlayer2) {
                                                playerView2.setPlayer(exoPlayer2);
                                            }
                                            playerView2.setResizeMode(i20);
                                            return wef.a;
                                    }
                                }
                            };
                            l46Var2.p0(objR4);
                        } else {
                            objR4 = new a26() { // from class: ytf
                                @Override // defpackage.a26
                                public final Object d(Object obj) {
                                    int i116 = i14;
                                    int i20 = i15;
                                    ExoPlayer exoPlayer2 = exoPlayer;
                                    switch (i116) {
                                        case 0:
                                            Context context = (Context) obj;
                                            context.getClass();
                                            View viewInflate = LayoutInflater.from(context).inflate(R.layout.video_container_player, (ViewGroup) null, false);
                                            viewInflate.getClass();
                                            PlayerView playerView = (PlayerView) viewInflate;
                                            playerView.setPlayer(exoPlayer2);
                                            playerView.setResizeMode(i20);
                                            playerView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                                            return playerView;
                                        default:
                                            PlayerView playerView2 = (PlayerView) obj;
                                            playerView2.getClass();
                                            if (playerView2.getPlayer() != exoPlayer2) {
                                                playerView2.setPlayer(exoPlayer2);
                                            }
                                            playerView2.setResizeMode(i20);
                                            return wef.a;
                                    }
                                }
                            };
                            l46Var2.p0(objR4);
                        }
                        a26 a26Var5 = (a26) objR4;
                        zI2 = l46Var2.i(exoPlayer) | l46Var2.e(i15);
                        objR5 = l46Var2.R();
                        if (zI2) {
                            final int i116 = z8 ? 1 : 0;
                            objR5 = new a26() { // from class: ytf
                                @Override // defpackage.a26
                                public final Object d(Object obj) {
                                    int i117 = i116;
                                    int i20 = i15;
                                    ExoPlayer exoPlayer2 = exoPlayer;
                                    switch (i117) {
                                        case 0:
                                            Context context = (Context) obj;
                                            context.getClass();
                                            View viewInflate = LayoutInflater.from(context).inflate(R.layout.video_container_player, (ViewGroup) null, false);
                                            viewInflate.getClass();
                                            PlayerView playerView = (PlayerView) viewInflate;
                                            playerView.setPlayer(exoPlayer2);
                                            playerView.setResizeMode(i20);
                                            playerView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                                            return playerView;
                                        default:
                                            PlayerView playerView2 = (PlayerView) obj;
                                            playerView2.getClass();
                                            if (playerView2.getPlayer() != exoPlayer2) {
                                                playerView2.setPlayer(exoPlayer2);
                                            }
                                            playerView2.setResizeMode(i20);
                                            return wef.a;
                                    }
                                }
                            };
                            l46Var2.p0(objR5);
                        } else {
                            final int i117 = z8 ? 1 : 0;
                            objR5 = new a26() { // from class: ytf
                                @Override // defpackage.a26
                                public final Object d(Object obj) {
                                    int i118 = i117;
                                    int i20 = i15;
                                    ExoPlayer exoPlayer2 = exoPlayer;
                                    switch (i118) {
                                        case 0:
                                            Context context = (Context) obj;
                                            context.getClass();
                                            View viewInflate = LayoutInflater.from(context).inflate(R.layout.video_container_player, (ViewGroup) null, false);
                                            viewInflate.getClass();
                                            PlayerView playerView = (PlayerView) viewInflate;
                                            playerView.setPlayer(exoPlayer2);
                                            playerView.setResizeMode(i20);
                                            playerView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                                            return playerView;
                                        default:
                                            PlayerView playerView2 = (PlayerView) obj;
                                            playerView2.getClass();
                                            if (playerView2.getPlayer() != exoPlayer2) {
                                                playerView2.setPlayer(exoPlayer2);
                                            }
                                            playerView2.setResizeMode(i20);
                                            return wef.a;
                                    }
                                }
                            };
                            l46Var2.p0(objR5);
                        }
                        l46Var2 = l46Var2;
                        xo1.c(a26Var5, j09VarB5, (a26) objR5, l46Var2, 0, 0);
                        l46Var2.r(z8);
                        l46Var2.r(false);
                    } else {
                        i8cVar2 = i8cVar;
                    }
                    objR2 = new bv9(exoPlayer, e89VarI5, e89VarI6, 23);
                    l46Var2.p0(objR2);
                    af1.g(exoPlayer, (a26) objR2, l46Var2);
                    Boolean boolValueOf6 = Boolean.valueOf(z7);
                    if ((i12 & 896) == 256) {
                        r3 = z8 ? 1 : 0;
                    } else {
                        r3 = 0;
                    }
                    r5 = r3 | (l46Var2.i(exoPlayer) ? 1 : 0) | (l46Var2.i(x48Var) ? 1 : 0);
                    objR3 = l46Var2.R();
                    if (r5 == 0) {
                        objR3 = new so2(x48Var, z7, exoPlayer, 11);
                        l46Var2.p0(objR3);
                    } else {
                        objR3 = new so2(x48Var, z7, exoPlayer, 11);
                        l46Var2.p0(objR3);
                    }
                    af1.i(exoPlayer, x48Var, boolValueOf6, (a26) objR3, l46Var2);
                    j09 j09VarC6 = b.c(j09Var, 1.0f);
                    i14 = 0;
                    xn8 xn8VarC6 = s21.c(ndb.b, false);
                    int iHashCode6 = Long.hashCode(l46Var2.T);
                    u8a u8aVarM6 = l46Var2.m();
                    j09 j09VarJ6 = m93.J(l46Var2, j09VarC6);
                    lf2.q.getClass();
                    l46Var2.j0();
                    if (l46Var2.S) {
                        l46Var2.l(LayoutNode.h1);
                    } else {
                        l46Var2.s0();
                    }
                    dec.l(hj6.z, l46Var2, xn8VarC6);
                    dec.l(hj6.y, l46Var2, u8aVarM6);
                    dec.l(hj6.X, l46Var2, Integer.valueOf(iHashCode6));
                    dec.k(l46Var2);
                    dec.l(hj6.x, l46Var2, j09VarJ6);
                    j09 j09VarB6 = d31.a.b(g09.a);
                    i15 = i13;
                    zI = l46Var2.i(exoPlayer) | l46Var2.e(i15);
                    objR4 = l46Var2.R();
                    if (zI) {
                        objR4 = new a26() { // from class: ytf
                            @Override // defpackage.a26
                            public final Object d(Object obj) {
                                int i118 = i14;
                                int i20 = i15;
                                ExoPlayer exoPlayer2 = exoPlayer;
                                switch (i118) {
                                    case 0:
                                        Context context = (Context) obj;
                                        context.getClass();
                                        View viewInflate = LayoutInflater.from(context).inflate(R.layout.video_container_player, (ViewGroup) null, false);
                                        viewInflate.getClass();
                                        PlayerView playerView = (PlayerView) viewInflate;
                                        playerView.setPlayer(exoPlayer2);
                                        playerView.setResizeMode(i20);
                                        playerView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                                        return playerView;
                                    default:
                                        PlayerView playerView2 = (PlayerView) obj;
                                        playerView2.getClass();
                                        if (playerView2.getPlayer() != exoPlayer2) {
                                            playerView2.setPlayer(exoPlayer2);
                                        }
                                        playerView2.setResizeMode(i20);
                                        return wef.a;
                                }
                            }
                        };
                        l46Var2.p0(objR4);
                    } else {
                        objR4 = new a26() { // from class: ytf
                            @Override // defpackage.a26
                            public final Object d(Object obj) {
                                int i118 = i14;
                                int i20 = i15;
                                ExoPlayer exoPlayer2 = exoPlayer;
                                switch (i118) {
                                    case 0:
                                        Context context = (Context) obj;
                                        context.getClass();
                                        View viewInflate = LayoutInflater.from(context).inflate(R.layout.video_container_player, (ViewGroup) null, false);
                                        viewInflate.getClass();
                                        PlayerView playerView = (PlayerView) viewInflate;
                                        playerView.setPlayer(exoPlayer2);
                                        playerView.setResizeMode(i20);
                                        playerView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                                        return playerView;
                                    default:
                                        PlayerView playerView2 = (PlayerView) obj;
                                        playerView2.getClass();
                                        if (playerView2.getPlayer() != exoPlayer2) {
                                            playerView2.setPlayer(exoPlayer2);
                                        }
                                        playerView2.setResizeMode(i20);
                                        return wef.a;
                                }
                            }
                        };
                        l46Var2.p0(objR4);
                    }
                    a26 a26Var6 = (a26) objR4;
                    zI2 = l46Var2.i(exoPlayer) | l46Var2.e(i15);
                    objR5 = l46Var2.R();
                    if (zI2) {
                        final int i118 = z8 ? 1 : 0;
                        objR5 = new a26() { // from class: ytf
                            @Override // defpackage.a26
                            public final Object d(Object obj) {
                                int i119 = i118;
                                int i20 = i15;
                                ExoPlayer exoPlayer2 = exoPlayer;
                                switch (i119) {
                                    case 0:
                                        Context context = (Context) obj;
                                        context.getClass();
                                        View viewInflate = LayoutInflater.from(context).inflate(R.layout.video_container_player, (ViewGroup) null, false);
                                        viewInflate.getClass();
                                        PlayerView playerView = (PlayerView) viewInflate;
                                        playerView.setPlayer(exoPlayer2);
                                        playerView.setResizeMode(i20);
                                        playerView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                                        return playerView;
                                    default:
                                        PlayerView playerView2 = (PlayerView) obj;
                                        playerView2.getClass();
                                        if (playerView2.getPlayer() != exoPlayer2) {
                                            playerView2.setPlayer(exoPlayer2);
                                        }
                                        playerView2.setResizeMode(i20);
                                        return wef.a;
                                }
                            }
                        };
                        l46Var2.p0(objR5);
                    } else {
                        final int i119 = z8 ? 1 : 0;
                        objR5 = new a26() { // from class: ytf
                            @Override // defpackage.a26
                            public final Object d(Object obj) {
                                int i1110 = i119;
                                int i20 = i15;
                                ExoPlayer exoPlayer2 = exoPlayer;
                                switch (i1110) {
                                    case 0:
                                        Context context = (Context) obj;
                                        context.getClass();
                                        View viewInflate = LayoutInflater.from(context).inflate(R.layout.video_container_player, (ViewGroup) null, false);
                                        viewInflate.getClass();
                                        PlayerView playerView = (PlayerView) viewInflate;
                                        playerView.setPlayer(exoPlayer2);
                                        playerView.setResizeMode(i20);
                                        playerView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                                        return playerView;
                                    default:
                                        PlayerView playerView2 = (PlayerView) obj;
                                        playerView2.getClass();
                                        if (playerView2.getPlayer() != exoPlayer2) {
                                            playerView2.setPlayer(exoPlayer2);
                                        }
                                        playerView2.setResizeMode(i20);
                                        return wef.a;
                                }
                            }
                        };
                        l46Var2.p0(objR5);
                    }
                    l46Var2 = l46Var2;
                    xo1.c(a26Var6, j09VarB6, (a26) objR5, l46Var2, 0, 0);
                    l46Var2.r(z8);
                    l46Var2.r(false);
                }
                z3 = z7;
                r4 = z8;
                x16Var5 = x16Var6;
                x16Var4 = x16Var7;
                z5 = z6;
            } else {
                l46Var2.Z();
                r4 = i;
                z5 = z2;
                x16Var5 = x16Var3;
            }
            ojbVarV = l46Var2.v();
            if (ojbVarV != null) {
                final boolean z11 = z3;
                final x16 x16Var10 = x16Var4;
                ojbVarV.d = new l26() { // from class: ztf
                    @Override // defpackage.l26
                    public final Object z(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        r8c.b(uri, j09Var, z11, r4, z5, x16Var5, x16Var10, (l46) obj, k99.P(i2 | 1), i3);
                        return wef.a;
                    }
                };
            }
        }
        i4 = i17 | 27648;
        i7 = i3 & 32;
        if (i7 != 0) {
            i9 = i4 | 196608;
            x16Var3 = x16Var;
        } else {
            x16Var3 = x16Var;
            if (l46Var2.i(x16Var3)) {
                i8 = 131072;
            } else {
                i8 = 65536;
            }
            i9 = i4 | i8;
        }
        i10 = i3 & 64;
        if (i10 != 0) {
            i12 = i9 | 1572864;
            x16Var4 = x16Var2;
        } else {
            x16Var4 = x16Var2;
            if (l46Var2.i(x16Var4)) {
                i11 = 1048576;
            } else {
                i11 = 524288;
            }
            i12 = i9 | i11;
        }
        if ((i12 & 599187) != 599186) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (l46Var2.W(i12 & 1, z4)) {
            if (i18 != 0) {
                z3 = true;
            }
            if (i5 != 0) {
                z6 = false;
            } else {
                z6 = z2;
            }
            i8cVar = sf2.a;
            if (i7 != 0) {
                objR7 = l46Var2.R();
                if (objR7 == i8cVar) {
                    objR7 = new yqf(i16);
                    l46Var2.p0(objR7);
                }
                x16Var6 = (x16) objR7;
            } else {
                x16Var6 = x16Var3;
            }
            if (i10 != 0) {
                objR6 = l46Var2.R();
                if (objR6 == i8cVar) {
                    objR6 = new yqf(3);
                    l46Var2.p0(objR6);
                }
                x16Var7 = (x16) objR6;
            } else {
                x16Var7 = x16Var4;
            }
            if (((Boolean) l46Var2.k(h57.a)).booleanValue()) {
                l46Var2.f0(436811836);
                nae.a(b.c(j09Var, 1.0f), null, ((e8b) l46Var2.k(l8b.a)).m, 0L, 0.0f, 0.0f, null, ynb.g, l46Var2, 12582912, 122);
                l46Var2.r(false);
                x16Var6 = x16Var6;
                x16Var7 = x16Var7;
                z8 = true;
                l46Var2 = l46Var2;
                z7 = z3;
            } else {
                l46Var2.f0(436992721);
                applicationContext = ((Context) l46Var2.k(uq.b)).getApplicationContext();
                x48Var = (x48) l46Var2.k(cb8.a);
                e89 e89VarI7 = q1c.i(x16Var6, l46Var2);
                e89 e89VarI8 = q1c.i(x16Var7, l46Var2);
                if (z6) {
                    i13 = 4;
                } else {
                    i13 = 0;
                }
                zG = l46Var2.g(uri);
                objR = l46Var2.R();
                if (zG) {
                    y45 y45VarA6 = new h45(applicationContext).a();
                    d82 d82Var6 = new d82();
                    ey6 ey6Var11 = jy6.b;
                    yob yobVar6 = yob.e;
                    List list6 = Collections.EMPTY_LIST;
                    ey6 ey6Var12 = jy6.b;
                    z7 = z3;
                    z8 = true;
                    y45VarA6.M(new op8("", new ip8(d82Var6), new lp8(uri, null, null, list6, yob.e, -9223372036854775807L), new kp8(new jp8()), rp8.C, mp8.a));
                    y45VarA6.Q(1);
                    y45VarA6.P(z7);
                    y45VarA6.D();
                    l46Var2.p0(y45VarA6);
                    objR = y45VarA6;
                } else {
                    y45 y45VarA7 = new h45(applicationContext).a();
                    d82 d82Var7 = new d82();
                    ey6 ey6Var13 = jy6.b;
                    yob yobVar7 = yob.e;
                    List list7 = Collections.EMPTY_LIST;
                    ey6 ey6Var14 = jy6.b;
                    z7 = z3;
                    z8 = true;
                    y45VarA7.M(new op8("", new ip8(d82Var7), new lp8(uri, null, null, list7, yob.e, -9223372036854775807L), new kp8(new jp8()), rp8.C, mp8.a));
                    y45VarA7.Q(1);
                    y45VarA7.P(z7);
                    y45VarA7.D();
                    l46Var2.p0(y45VarA7);
                    objR = y45VarA7;
                }
                exoPlayer = (ExoPlayer) objR;
                exoPlayer.getClass();
                zG2 = l46Var2.g(e89VarI7) | l46Var2.g(e89VarI8) | l46Var2.i(exoPlayer);
                objR2 = l46Var2.R();
                if (zG2) {
                    i8cVar2 = i8cVar;
                    if (objR2 == i8cVar2) {
                    }
                    af1.g(exoPlayer, (a26) objR2, l46Var2);
                    Boolean boolValueOf7 = Boolean.valueOf(z7);
                    if ((i12 & 896) == 256) {
                        r3 = z8 ? 1 : 0;
                    } else {
                        r3 = 0;
                    }
                    r5 = r3 | (l46Var2.i(exoPlayer) ? 1 : 0) | (l46Var2.i(x48Var) ? 1 : 0);
                    objR3 = l46Var2.R();
                    if (r5 == 0) {
                        objR3 = new so2(x48Var, z7, exoPlayer, 11);
                        l46Var2.p0(objR3);
                    } else {
                        objR3 = new so2(x48Var, z7, exoPlayer, 11);
                        l46Var2.p0(objR3);
                    }
                    af1.i(exoPlayer, x48Var, boolValueOf7, (a26) objR3, l46Var2);
                    j09 j09VarC7 = b.c(j09Var, 1.0f);
                    i14 = 0;
                    xn8 xn8VarC7 = s21.c(ndb.b, false);
                    int iHashCode7 = Long.hashCode(l46Var2.T);
                    u8a u8aVarM7 = l46Var2.m();
                    j09 j09VarJ7 = m93.J(l46Var2, j09VarC7);
                    lf2.q.getClass();
                    l46Var2.j0();
                    if (l46Var2.S) {
                        l46Var2.l(LayoutNode.h1);
                    } else {
                        l46Var2.s0();
                    }
                    dec.l(hj6.z, l46Var2, xn8VarC7);
                    dec.l(hj6.y, l46Var2, u8aVarM7);
                    dec.l(hj6.X, l46Var2, Integer.valueOf(iHashCode7));
                    dec.k(l46Var2);
                    dec.l(hj6.x, l46Var2, j09VarJ7);
                    j09 j09VarB7 = d31.a.b(g09.a);
                    i15 = i13;
                    zI = l46Var2.i(exoPlayer) | l46Var2.e(i15);
                    objR4 = l46Var2.R();
                    if (zI) {
                        objR4 = new a26() { // from class: ytf
                            @Override // defpackage.a26
                            public final Object d(Object obj) {
                                int i1110 = i14;
                                int i20 = i15;
                                ExoPlayer exoPlayer2 = exoPlayer;
                                switch (i1110) {
                                    case 0:
                                        Context context = (Context) obj;
                                        context.getClass();
                                        View viewInflate = LayoutInflater.from(context).inflate(R.layout.video_container_player, (ViewGroup) null, false);
                                        viewInflate.getClass();
                                        PlayerView playerView = (PlayerView) viewInflate;
                                        playerView.setPlayer(exoPlayer2);
                                        playerView.setResizeMode(i20);
                                        playerView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                                        return playerView;
                                    default:
                                        PlayerView playerView2 = (PlayerView) obj;
                                        playerView2.getClass();
                                        if (playerView2.getPlayer() != exoPlayer2) {
                                            playerView2.setPlayer(exoPlayer2);
                                        }
                                        playerView2.setResizeMode(i20);
                                        return wef.a;
                                }
                            }
                        };
                        l46Var2.p0(objR4);
                    } else {
                        objR4 = new a26() { // from class: ytf
                            @Override // defpackage.a26
                            public final Object d(Object obj) {
                                int i1110 = i14;
                                int i20 = i15;
                                ExoPlayer exoPlayer2 = exoPlayer;
                                switch (i1110) {
                                    case 0:
                                        Context context = (Context) obj;
                                        context.getClass();
                                        View viewInflate = LayoutInflater.from(context).inflate(R.layout.video_container_player, (ViewGroup) null, false);
                                        viewInflate.getClass();
                                        PlayerView playerView = (PlayerView) viewInflate;
                                        playerView.setPlayer(exoPlayer2);
                                        playerView.setResizeMode(i20);
                                        playerView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                                        return playerView;
                                    default:
                                        PlayerView playerView2 = (PlayerView) obj;
                                        playerView2.getClass();
                                        if (playerView2.getPlayer() != exoPlayer2) {
                                            playerView2.setPlayer(exoPlayer2);
                                        }
                                        playerView2.setResizeMode(i20);
                                        return wef.a;
                                }
                            }
                        };
                        l46Var2.p0(objR4);
                    }
                    a26 a26Var7 = (a26) objR4;
                    zI2 = l46Var2.i(exoPlayer) | l46Var2.e(i15);
                    objR5 = l46Var2.R();
                    if (zI2) {
                        final int i1110 = z8 ? 1 : 0;
                        objR5 = new a26() { // from class: ytf
                            @Override // defpackage.a26
                            public final Object d(Object obj) {
                                int i1111 = i1110;
                                int i20 = i15;
                                ExoPlayer exoPlayer2 = exoPlayer;
                                switch (i1111) {
                                    case 0:
                                        Context context = (Context) obj;
                                        context.getClass();
                                        View viewInflate = LayoutInflater.from(context).inflate(R.layout.video_container_player, (ViewGroup) null, false);
                                        viewInflate.getClass();
                                        PlayerView playerView = (PlayerView) viewInflate;
                                        playerView.setPlayer(exoPlayer2);
                                        playerView.setResizeMode(i20);
                                        playerView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                                        return playerView;
                                    default:
                                        PlayerView playerView2 = (PlayerView) obj;
                                        playerView2.getClass();
                                        if (playerView2.getPlayer() != exoPlayer2) {
                                            playerView2.setPlayer(exoPlayer2);
                                        }
                                        playerView2.setResizeMode(i20);
                                        return wef.a;
                                }
                            }
                        };
                        l46Var2.p0(objR5);
                    } else {
                        final int i1111 = z8 ? 1 : 0;
                        objR5 = new a26() { // from class: ytf
                            @Override // defpackage.a26
                            public final Object d(Object obj) {
                                int i1112 = i1111;
                                int i20 = i15;
                                ExoPlayer exoPlayer2 = exoPlayer;
                                switch (i1112) {
                                    case 0:
                                        Context context = (Context) obj;
                                        context.getClass();
                                        View viewInflate = LayoutInflater.from(context).inflate(R.layout.video_container_player, (ViewGroup) null, false);
                                        viewInflate.getClass();
                                        PlayerView playerView = (PlayerView) viewInflate;
                                        playerView.setPlayer(exoPlayer2);
                                        playerView.setResizeMode(i20);
                                        playerView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                                        return playerView;
                                    default:
                                        PlayerView playerView2 = (PlayerView) obj;
                                        playerView2.getClass();
                                        if (playerView2.getPlayer() != exoPlayer2) {
                                            playerView2.setPlayer(exoPlayer2);
                                        }
                                        playerView2.setResizeMode(i20);
                                        return wef.a;
                                }
                            }
                        };
                        l46Var2.p0(objR5);
                    }
                    l46Var2 = l46Var2;
                    xo1.c(a26Var7, j09VarB7, (a26) objR5, l46Var2, 0, 0);
                    l46Var2.r(z8);
                    l46Var2.r(false);
                } else {
                    i8cVar2 = i8cVar;
                }
                objR2 = new bv9(exoPlayer, e89VarI7, e89VarI8, 23);
                l46Var2.p0(objR2);
                af1.g(exoPlayer, (a26) objR2, l46Var2);
                Boolean boolValueOf8 = Boolean.valueOf(z7);
                if ((i12 & 896) == 256) {
                    r3 = z8 ? 1 : 0;
                } else {
                    r3 = 0;
                }
                r5 = r3 | (l46Var2.i(exoPlayer) ? 1 : 0) | (l46Var2.i(x48Var) ? 1 : 0);
                objR3 = l46Var2.R();
                if (r5 == 0) {
                    objR3 = new so2(x48Var, z7, exoPlayer, 11);
                    l46Var2.p0(objR3);
                } else {
                    objR3 = new so2(x48Var, z7, exoPlayer, 11);
                    l46Var2.p0(objR3);
                }
                af1.i(exoPlayer, x48Var, boolValueOf8, (a26) objR3, l46Var2);
                j09 j09VarC8 = b.c(j09Var, 1.0f);
                i14 = 0;
                xn8 xn8VarC8 = s21.c(ndb.b, false);
                int iHashCode8 = Long.hashCode(l46Var2.T);
                u8a u8aVarM8 = l46Var2.m();
                j09 j09VarJ8 = m93.J(l46Var2, j09VarC8);
                lf2.q.getClass();
                l46Var2.j0();
                if (l46Var2.S) {
                    l46Var2.l(LayoutNode.h1);
                } else {
                    l46Var2.s0();
                }
                dec.l(hj6.z, l46Var2, xn8VarC8);
                dec.l(hj6.y, l46Var2, u8aVarM8);
                dec.l(hj6.X, l46Var2, Integer.valueOf(iHashCode8));
                dec.k(l46Var2);
                dec.l(hj6.x, l46Var2, j09VarJ8);
                j09 j09VarB8 = d31.a.b(g09.a);
                i15 = i13;
                zI = l46Var2.i(exoPlayer) | l46Var2.e(i15);
                objR4 = l46Var2.R();
                if (zI) {
                    objR4 = new a26() { // from class: ytf
                        @Override // defpackage.a26
                        public final Object d(Object obj) {
                            int i1112 = i14;
                            int i20 = i15;
                            ExoPlayer exoPlayer2 = exoPlayer;
                            switch (i1112) {
                                case 0:
                                    Context context = (Context) obj;
                                    context.getClass();
                                    View viewInflate = LayoutInflater.from(context).inflate(R.layout.video_container_player, (ViewGroup) null, false);
                                    viewInflate.getClass();
                                    PlayerView playerView = (PlayerView) viewInflate;
                                    playerView.setPlayer(exoPlayer2);
                                    playerView.setResizeMode(i20);
                                    playerView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                                    return playerView;
                                default:
                                    PlayerView playerView2 = (PlayerView) obj;
                                    playerView2.getClass();
                                    if (playerView2.getPlayer() != exoPlayer2) {
                                        playerView2.setPlayer(exoPlayer2);
                                    }
                                    playerView2.setResizeMode(i20);
                                    return wef.a;
                            }
                        }
                    };
                    l46Var2.p0(objR4);
                } else {
                    objR4 = new a26() { // from class: ytf
                        @Override // defpackage.a26
                        public final Object d(Object obj) {
                            int i1112 = i14;
                            int i20 = i15;
                            ExoPlayer exoPlayer2 = exoPlayer;
                            switch (i1112) {
                                case 0:
                                    Context context = (Context) obj;
                                    context.getClass();
                                    View viewInflate = LayoutInflater.from(context).inflate(R.layout.video_container_player, (ViewGroup) null, false);
                                    viewInflate.getClass();
                                    PlayerView playerView = (PlayerView) viewInflate;
                                    playerView.setPlayer(exoPlayer2);
                                    playerView.setResizeMode(i20);
                                    playerView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                                    return playerView;
                                default:
                                    PlayerView playerView2 = (PlayerView) obj;
                                    playerView2.getClass();
                                    if (playerView2.getPlayer() != exoPlayer2) {
                                        playerView2.setPlayer(exoPlayer2);
                                    }
                                    playerView2.setResizeMode(i20);
                                    return wef.a;
                            }
                        }
                    };
                    l46Var2.p0(objR4);
                }
                a26 a26Var8 = (a26) objR4;
                zI2 = l46Var2.i(exoPlayer) | l46Var2.e(i15);
                objR5 = l46Var2.R();
                if (zI2) {
                    final int i1112 = z8 ? 1 : 0;
                    objR5 = new a26() { // from class: ytf
                        @Override // defpackage.a26
                        public final Object d(Object obj) {
                            int i1113 = i1112;
                            int i20 = i15;
                            ExoPlayer exoPlayer2 = exoPlayer;
                            switch (i1113) {
                                case 0:
                                    Context context = (Context) obj;
                                    context.getClass();
                                    View viewInflate = LayoutInflater.from(context).inflate(R.layout.video_container_player, (ViewGroup) null, false);
                                    viewInflate.getClass();
                                    PlayerView playerView = (PlayerView) viewInflate;
                                    playerView.setPlayer(exoPlayer2);
                                    playerView.setResizeMode(i20);
                                    playerView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                                    return playerView;
                                default:
                                    PlayerView playerView2 = (PlayerView) obj;
                                    playerView2.getClass();
                                    if (playerView2.getPlayer() != exoPlayer2) {
                                        playerView2.setPlayer(exoPlayer2);
                                    }
                                    playerView2.setResizeMode(i20);
                                    return wef.a;
                            }
                        }
                    };
                    l46Var2.p0(objR5);
                } else {
                    final int i1113 = z8 ? 1 : 0;
                    objR5 = new a26() { // from class: ytf
                        @Override // defpackage.a26
                        public final Object d(Object obj) {
                            int i1114 = i1113;
                            int i20 = i15;
                            ExoPlayer exoPlayer2 = exoPlayer;
                            switch (i1114) {
                                case 0:
                                    Context context = (Context) obj;
                                    context.getClass();
                                    View viewInflate = LayoutInflater.from(context).inflate(R.layout.video_container_player, (ViewGroup) null, false);
                                    viewInflate.getClass();
                                    PlayerView playerView = (PlayerView) viewInflate;
                                    playerView.setPlayer(exoPlayer2);
                                    playerView.setResizeMode(i20);
                                    playerView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                                    return playerView;
                                default:
                                    PlayerView playerView2 = (PlayerView) obj;
                                    playerView2.getClass();
                                    if (playerView2.getPlayer() != exoPlayer2) {
                                        playerView2.setPlayer(exoPlayer2);
                                    }
                                    playerView2.setResizeMode(i20);
                                    return wef.a;
                            }
                        }
                    };
                    l46Var2.p0(objR5);
                }
                l46Var2 = l46Var2;
                xo1.c(a26Var8, j09VarB8, (a26) objR5, l46Var2, 0, 0);
                l46Var2.r(z8);
                l46Var2.r(false);
            }
            z3 = z7;
            r4 = z8;
            x16Var5 = x16Var6;
            x16Var4 = x16Var7;
            z5 = z6;
        } else {
            l46Var2.Z();
            r4 = i;
            z5 = z2;
            x16Var5 = x16Var3;
        }
        ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            final boolean z12 = z3;
            final x16 x16Var11 = x16Var4;
            ojbVarV.d = new l26() { // from class: ztf
                @Override // defpackage.l26
                public final Object z(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    r8c.b(uri, j09Var, z12, r4, z5, x16Var5, x16Var11, (l46) obj, k99.P(i2 | 1), i3);
                    return wef.a;
                }
            };
        }
    }

    public static final List c(mfc mfcVar) {
        mfcVar.getClass();
        int iOrdinal = mfcVar.ordinal();
        if (iOrdinal == 0) {
            return t72.I(TarotSkinIdentify.Classic, TarotSkinIdentify.Transformation, TarotSkinIdentify.MagicAwakening, TarotSkinIdentify.SecretManor, TarotSkinIdentify.ZenithDay, TarotSkinIdentify.EternalNight, TarotSkinIdentify.Fable, TarotSkinIdentify.Woodcut, TarotSkinIdentify.Dream, TarotSkinIdentify.Prism, TarotSkinIdentify.Cat, TarotSkinIdentify.Love, TarotSkinIdentify.Puppet, TarotSkinIdentify.Symbolism, TarotSkinIdentify.Minimalism, TarotSkinIdentify.Midnight, TarotSkinIdentify.DarkGold);
        }
        if (iOrdinal == 1) {
            return t72.I(TarotSkinIdentify.NeoRiderWaite, TarotSkinIdentify.Transformation, TarotSkinIdentify.MagicAwakening, TarotSkinIdentify.SecretManor, TarotSkinIdentify.ZenithDay, TarotSkinIdentify.EternalNight, TarotSkinIdentify.Symbolism, TarotSkinIdentify.Minimalism, TarotSkinIdentify.Midnight, TarotSkinIdentify.DarkGold, TarotSkinIdentify.Fable, TarotSkinIdentify.Woodcut, TarotSkinIdentify.Dream, TarotSkinIdentify.Prism, TarotSkinIdentify.Cat, TarotSkinIdentify.Love, TarotSkinIdentify.Puppet);
        }
        ap.c();
        return null;
    }

    public static final TarotSkinIdentify d() {
        ca2.a.getClass();
        return ca2.c ? TarotSkinIdentify.NeoRiderWaite : TarotSkinIdentify.Classic;
    }

    public static final TarotSkinIdentify e(mfc mfcVar) {
        mfcVar.getClass();
        int iOrdinal = mfcVar.ordinal();
        if (iOrdinal == 0) {
            return TarotSkinIdentify.Classic;
        }
        if (iOrdinal == 1) {
            return TarotSkinIdentify.NeoRiderWaite;
        }
        ap.c();
        return null;
    }

    public static final int f(qhe qheVar) {
        qheVar.getClass();
        Map map = aie.a;
        String str = qheVar.a;
        str.getClass();
        Integer num = (Integer) aie.a.get(str);
        return num != null ? num.intValue() : R.string.card_the_fool;
    }

    public static final rtc g(Object obj) {
        if (obj != kh2.a) {
            return (rtc) obj;
        }
        qc0.p("Does not contain segment");
        return null;
    }

    public static final int h(q8c q8cVar) {
        q8cVar.getClass();
        x8c x8cVarW0 = q8cVar.W0("SELECT changes()");
        try {
            x8cVarW0.R0();
            int i = (int) x8cVarW0.getLong(0);
            cgg.t(x8cVarW0, null);
            return i;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                cgg.t(x8cVarW0, th);
                throw th2;
            }
        }
    }

    public static final boolean i(Object obj) {
        return obj == kh2.a;
    }

    public static final boolean j(TarotSkinIdentify tarotSkinIdentify, mfc mfcVar) {
        tarotSkinIdentify.getClass();
        mfcVar.getClass();
        int i = yke.a[tarotSkinIdentify.ordinal()];
        if (i != 1) {
            return i != 2 || mfcVar == mfc.b;
        }
        return mfcVar == mfc.a;
    }

    public static final boolean k(TarotSkinIdentify tarotSkinIdentify) {
        tarotSkinIdentify.getClass();
        return tarotSkinIdentify == TarotSkinIdentify.Classic || tarotSkinIdentify == TarotSkinIdentify.NeoRiderWaite;
    }

    public static boolean l(int i) {
        int type = Character.getType(i);
        return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
    }

    public static final List m(List list) {
        list.getClass();
        lx4 entries = TarotSkinIdentify.getEntries();
        ArrayList arrayList = new ArrayList();
        for (Object obj : entries) {
            if (k((TarotSkinIdentify) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(t72.u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            n2f n2fVar = (n2f) it.next();
            TarotSkinIdentify.Companion.getClass();
            arrayList2.add(xke.a(n2fVar));
        }
        return s72.j1(s72.n1(s72.Q0(arrayList, arrayList2)));
    }

    public static final TarotSkinIdentify n(String str, mfc mfcVar) {
        mfcVar.getClass();
        TarotSkinIdentify tarotSkinIdentifyA = null;
        if (str != null) {
            try {
                xke xkeVar = TarotSkinIdentify.Companion;
                n2f n2fVarValueOf = n2f.valueOf(str);
                xkeVar.getClass();
                tarotSkinIdentifyA = xke.a(n2fVarValueOf);
            } catch (Exception unused) {
            }
        }
        return (tarotSkinIdentifyA == null || !j(tarotSkinIdentifyA, mfcVar)) ? e(mfcVar) : tarotSkinIdentifyA;
    }

    public static final wj5 o(wg7 wg7Var, a26 a26Var) {
        wg7Var.getClass();
        a26Var.getClass();
        al5 al5Var = new al5(new ybc(new sxd(a26Var, wg7Var, null)), new txd(3, null));
        js3 js3Var = ga4.a;
        return ym8.x(al5Var, hr3.c);
    }

    public static final qhe p(TarotCard tarotCard) {
        int i;
        tarotCard.getClass();
        String name = tarotCard.getName();
        int direction = tarotCard.getDirection();
        if (direction != 0) {
            i = 1;
            if (direction != 1) {
                qc0.j(tec.e(direction, "Invalid orientation value: "));
                return null;
            }
        } else {
            i = 0;
        }
        return new qhe(name, i);
    }

    public static int q(byte[] bArr, int i, tlg tlgVar) throws p1h {
        int iV = v(bArr, i, tlgVar);
        int i2 = tlgVar.a;
        if (i2 < 0) {
            s8f.o("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return 0;
        }
        if (i2 > bArr.length - iV) {
            s8f.o("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0;
        }
        if (i2 == 0) {
            tlgVar.c = vyg.a;
            return iV;
        }
        tlgVar.c = vyg.m(bArr, iV, i2);
        return iV + i2;
    }

    public static int r(byte[] bArr, int i) {
        int i2 = bArr[i] & 255;
        int i3 = bArr[i + 1] & 255;
        int i4 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i3 << 8) | i2 | (i4 << 16);
    }

    public static int s(s3h s3hVar, int i, byte[] bArr, int i2, int i3, v0h v0hVar, tlg tlgVar) throws p1h {
        l0h l0hVarA = s3hVar.a();
        s3h s3hVar2 = s3hVar;
        byte[] bArr2 = bArr;
        int i4 = i3;
        tlg tlgVar2 = tlgVar;
        int iA = A(l0hVarA, s3hVar2, bArr2, i2, i4, tlgVar2);
        s3hVar2.b(l0hVarA);
        tlgVar2.c = l0hVarA;
        v0hVar.add(l0hVarA);
        while (iA < i4) {
            tlg tlgVar3 = tlgVar2;
            int i5 = i4;
            int iV = v(bArr2, iA, tlgVar3);
            if (i != tlgVar3.a) {
                break;
            }
            byte[] bArr3 = bArr2;
            s3h s3hVar3 = s3hVar2;
            l0h l0hVarA2 = s3hVar3.a();
            iA = A(l0hVarA2, s3hVar3, bArr3, iV, i5, tlgVar3);
            s3hVar2 = s3hVar3;
            bArr2 = bArr3;
            i4 = i5;
            tlgVar2 = tlgVar3;
            s3hVar2.b(l0hVarA2);
            tlgVar2.c = l0hVarA2;
            v0hVar.add(l0hVarA2);
        }
        return iA;
    }

    public static int t(byte[] bArr, int i, v0h v0hVar, tlg tlgVar) throws p1h {
        n0h n0hVar = (n0h) v0hVar;
        int iV = v(bArr, i, tlgVar);
        int i2 = tlgVar.a;
        if (i2 < 0) {
            s8f.o("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return 0;
        }
        if (i2 > bArr.length - iV) {
            s8f.o("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0;
        }
        int i3 = i2 + iV;
        while (iV < i3) {
            iV = v(bArr, iV, tlgVar);
            n0hVar.e(tlgVar.a);
        }
        if (iV == i3) {
            return iV;
        }
        s8f.o("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        return 0;
    }

    public static int u(int i, byte[] bArr, int i2, int i3, l4h l4hVar, tlg tlgVar) throws p1h {
        if ((i >>> 3) == 0) {
            s8f.o("Protocol message contained an invalid tag (zero).");
            return 0;
        }
        int i4 = i & 7;
        if (i4 == 0) {
            int iY = y(bArr, i2, tlgVar);
            l4hVar.c(i, Long.valueOf(tlgVar.b));
            return iY;
        }
        if (i4 == 1) {
            l4hVar.c(i, Long.valueOf(B(bArr, i2)));
            return i2 + 8;
        }
        if (i4 == 2) {
            int iV = v(bArr, i2, tlgVar);
            int i5 = tlgVar.a;
            if (i5 < 0) {
                s8f.o("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                return 0;
            }
            if (i5 > bArr.length - iV) {
                s8f.o("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                return 0;
            }
            if (i5 == 0) {
                l4hVar.c(i, vyg.a);
            } else {
                l4hVar.c(i, vyg.m(bArr, iV, i5));
            }
            return iV + i5;
        }
        if (i4 != 3) {
            if (i4 == 5) {
                l4hVar.c(i, Integer.valueOf(r(bArr, i2)));
                return i2 + 4;
            }
            s8f.o("Protocol message contained an invalid tag (zero).");
            return 0;
        }
        int i6 = (i & (-8)) | 4;
        l4h l4hVarB = l4h.b();
        int i7 = tlgVar.d + 1;
        tlgVar.d = i7;
        C(i7);
        int i8 = 0;
        while (i2 < i3) {
            int iV2 = v(bArr, i2, tlgVar);
            int i9 = tlgVar.a;
            if (i9 == i6) {
                i8 = i9;
                i2 = iV2;
                break;
            }
            i2 = u(i9, bArr, iV2, i3, l4hVarB, tlgVar);
            i8 = i9;
        }
        tlgVar.d--;
        if (i2 > i3 || i8 != i6) {
            s8f.o("Failed to parse the message.");
            return 0;
        }
        l4hVar.c(i, l4hVarB);
        return i2;
    }

    public static int v(byte[] bArr, int i, tlg tlgVar) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return w(b, bArr, i2, tlgVar);
        }
        tlgVar.a = b;
        return i2;
    }

    public static int w(int i, byte[] bArr, int i2, tlg tlgVar) {
        byte b = bArr[i2];
        int i3 = i2 + 1;
        int i4 = i & 127;
        if (b >= 0) {
            tlgVar.a = i4 | (b << 7);
            return i3;
        }
        int i5 = i4 | ((b & 127) << 7);
        int i6 = i2 + 2;
        byte b2 = bArr[i3];
        if (b2 >= 0) {
            tlgVar.a = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & 127) << 14);
        int i8 = i2 + 3;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            tlgVar.a = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & 127) << 21);
        int i10 = i2 + 4;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            tlgVar.a = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & 127) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                tlgVar.a = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    public static int x(int i, byte[] bArr, int i2, int i3, v0h v0hVar, tlg tlgVar) {
        n0h n0hVar = (n0h) v0hVar;
        int iV = v(bArr, i2, tlgVar);
        n0hVar.e(tlgVar.a);
        while (iV < i3) {
            int iV2 = v(bArr, iV, tlgVar);
            if (i != tlgVar.a) {
                break;
            }
            iV = v(bArr, iV2, tlgVar);
            n0hVar.e(tlgVar.a);
        }
        return iV;
    }

    public static int y(byte[] bArr, int i, tlg tlgVar) {
        long j = bArr[i];
        int i2 = i + 1;
        if (j >= 0) {
            tlgVar.b = j;
            return i2;
        }
        int i3 = i + 2;
        byte b = bArr[i2];
        long j2 = (j & 127) | (((long) (b & 127)) << 7);
        int i4 = 7;
        while (b < 0) {
            int i5 = i3 + 1;
            byte b2 = bArr[i3];
            i4 += 7;
            j2 |= ((long) (b2 & 127)) << i4;
            b = b2;
            i3 = i5;
        }
        tlgVar.b = j2;
        return i3;
    }

    public static int z(Object obj, s3h s3hVar, byte[] bArr, int i, int i2, int i3, tlg tlgVar) throws p1h {
        int i4 = tlgVar.d + 1;
        tlgVar.d = i4;
        C(i4);
        int iR = ((a3h) s3hVar).r(obj, bArr, i, i2, i3, tlgVar);
        tlgVar.d--;
        tlgVar.c = obj;
        return iR;
    }
}
