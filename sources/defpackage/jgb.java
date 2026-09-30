package defpackage;

import ai.askquin.R;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.Shader;
import android.media.MediaFormat;
import android.os.Build;
import android.text.Layout;
import androidx.compose.foundation.b;
import androidx.compose.ui.node.LayoutNode;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.io.IOException;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import tech.chatmind.api.message.model.InAppMessage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class jgb implements gv4 {
    public static final dd2 g;
    public static final dd2 h;
    public static final dd2 i;
    public static final dd2 j;
    public static final dd2 k;
    public static final dd2 l;
    public static final dd2 m;
    public static final int[] a = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};
    public static final int[] b = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};
    public static final dd2 c = new dd2(new a7(19), false, 1728513551);
    public static final dd2 d = new dd2(new a7(20), false, 55941496);
    public static final dd2 e = new dd2(new a7(21), false, -266596793);
    public static final dd2 f = new dd2(new xd2(14), false, 318575381);
    public static final g04 n = new g04();
    public static final eh7 o = new eh7(2);

    static {
        int i2 = 16;
        int i3 = 15;
        g = new dd2(new xd2(i3), false, 987020492);
        h = new dd2(new xd2(i2), false, 1629660970);
        int i4 = 17;
        i = new dd2(new xd2(i4), false, 876622931);
        j = new dd2(new de2(i4), false, -1990418394);
        k = new dd2(new ce2(i3), false, -2062664570);
        l = new dd2(new ce2(i2), false, -961708204);
        m = new dd2(new ce2(i4), false, -1656234997);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002a  */
    /* JADX WARN: Code duplicated, block: B:12:0x002d  */
    /* JADX WARN: Code duplicated, block: B:15:0x0038  */
    /* JADX WARN: Code duplicated, block: B:16:0x003b  */
    /* JADX WARN: Code duplicated, block: B:19:0x0046  */
    /* JADX WARN: Code duplicated, block: B:20:0x0048  */
    /* JADX WARN: Code duplicated, block: B:23:0x0050  */
    /* JADX WARN: Code duplicated, block: B:30:0x0068  */
    /* JADX WARN: Code duplicated, block: B:32:0x006c  */
    /* JADX WARN: Code duplicated, block: B:35:0x007d  */
    /* JADX WARN: Code duplicated, block: B:36:0x0085  */
    /* JADX WARN: Code duplicated, block: B:39:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:40:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:43:0x0121  */
    /* JADX WARN: Code duplicated, block: B:44:0x0125  */
    /* JADX WARN: Code duplicated, block: B:47:0x0197  */
    /* JADX WARN: Code duplicated, block: B:48:0x0250  */
    /* JADX WARN: Code duplicated, block: B:50:0x0257  */
    /* JADX WARN: Code duplicated, block: B:53:0x0261  */
    /* JADX WARN: Code duplicated, block: B:55:? A[RETURN, SYNTHETIC] */
    public static final void A(j09 j09Var, ac4 ac4Var, x16 x16Var, l46 l46Var, int i2, int i3) {
        j09 j09VarG;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z;
        j09 j09Var2;
        ojb ojbVarV;
        int i8;
        g09 g09Var;
        j09 j09Var3;
        String strI;
        qhe qheVar;
        boolean z2;
        ov7 ov7Var;
        pr4 pr4Var;
        tta ttaVar;
        l46 l46Var2 = l46Var;
        String str = ac4Var.b;
        int i9 = ac4Var.c;
        x16Var.getClass();
        l46Var2.h0(210018210);
        if ((i3 & 1) == 0) {
            j09VarG = j09Var;
            int i10 = l46Var2.g(j09VarG) ? 4 : 2;
            int i11 = i2 | i10;
            if (l46Var2.i(ac4Var)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            int i12 = i11 | i4;
            if (l46Var2.i(x16Var)) {
                i5 = 256;
            } else {
                i5 = UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
            }
            i6 = i12 | i5;
            i7 = 0;
            if ((i6 & 147) != 146) {
                z = true;
            } else {
                z = false;
            }
            if (l46Var2.W(i6 & 1, z)) {
                l46Var2.b0();
                i8 = i2 & 1;
                g09Var = g09.a;
                if (i8 == 0 && !l46Var2.C()) {
                    l46Var2.Z();
                    int i13 = i3 & 1;
                } else if ((i3 & 1) != 0) {
                    j09VarG = k8b.g(g09Var, new ie2(29), l46Var2, 6);
                }
                j09Var3 = j09VarG;
                l46Var2.s();
                if (i9 != 0) {
                    strI = tec.i(l46Var2, -35953405, i9, l46Var2, false);
                } else {
                    l46Var2.f0(-35952023);
                    l46Var2.r(false);
                    strI = str;
                }
                qheVar = new qhe(str, !ac4Var.d ? 1 : 0);
                j09 j09VarA0 = ynb.a0(b.c(j09Var3, false, null, null, x16Var, 15), 24.0f, 20.0f);
                t7c t7cVarA = s7c.a(xc0.a, ndb.z, l46Var2, 48);
                int iHashCode = Long.hashCode(l46Var2.T);
                u8a u8aVarM = l46Var2.m();
                j09 j09VarJ = m93.J(l46Var2, j09VarA0);
                lf2.q.getClass();
                l46Var2.j0();
                z2 = l46Var2.S;
                ov7Var = LayoutNode.h1;
                if (z2) {
                    l46Var2.l(ov7Var);
                } else {
                    l46Var2.s0();
                }
                he2 he2Var = hj6.z;
                dec.l(he2Var, l46Var2, t7cVarA);
                he2 he2Var2 = hj6.y;
                dec.l(he2Var2, l46Var2, u8aVarM);
                Integer numValueOf = Integer.valueOf(iHashCode);
                he2 he2Var3 = hj6.X;
                dec.l(he2Var3, l46Var2, numValueOf);
                dec.k(l46Var2);
                he2 he2Var4 = hj6.x;
                dec.l(he2Var4, l46Var2, j09VarJ);
                jw7 jw7Var = new jw7(1.0f, true);
                c92 c92VarA = a92.a(new uc0(8.0f, true, new qc0(i7)), ndb.Y, l46Var2, 6);
                int iHashCode2 = Long.hashCode(l46Var2.T);
                u8a u8aVarM2 = l46Var2.m();
                j09 j09VarJ2 = m93.J(l46Var2, jw7Var);
                l46Var2.j0();
                if (l46Var2.S) {
                    l46Var2.l(ov7Var);
                } else {
                    l46Var2.s0();
                }
                dec.l(he2Var, l46Var2, c92VarA);
                dec.l(he2Var2, l46Var2, u8aVarM2);
                ib8.s(iHashCode2, l46Var2, he2Var3, l46Var2);
                dec.l(he2Var4, l46Var2, j09VarJ2);
                String strJ = ub3.j(afc.q(R.string.quick_decision_history_prefix, l46Var2), " | ", strI);
                mue mueVar = pue.a;
                mue mueVarP = pue.p(l46Var2);
                pr4Var = x8b.a;
                nte.b(strJ, null, 0L, 0L, null, ((y8b) l46Var2.k(pr4Var)).a, 0L, null, null, 0L, 0, false, 0, 0, null, mueVarP, l46Var, 0, 0, 130942);
                ttaVar = cn1.Q0;
                if (ttaVar != null) {
                    pa7.g0("prettyTime");
                    throw null;
                }
                w57 w57VarC = ac4Var.c();
                w57VarC.getClass();
                Instant instantOfEpochMilli = Instant.ofEpochMilli(w57VarC.e());
                instantOfEpochMilli.getClass();
                String strC = ttaVar.c(ttaVar.b(Date.from(instantOfEpochMilli)));
                strC.getClass();
                nte.b(strC, null, ((e8b) l46Var.k(l8b.a)).t, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, pue.g(l46Var), l46Var, 0, 0, 131066);
                nte.b(ac4Var.e, null, 0L, 0L, null, ((y8b) l46Var.k(pr4Var)).a, 0L, null, null, 0L, 0, false, 0, 0, null, mue.a(pue.m(l46Var), 0L, 0L, ar5.z, null, 0L, null, 0, 0L, null, null, 16777211), l46Var, 0, 0, 130942);
                l46Var2 = l46Var;
                l46Var2.r(true);
                o7c.d(dj6.w(androidx.compose.foundation.layout.b.p(g09Var, 56.0f), ((die) l46Var2.k(snd.a)).a.getAspectRatio()), qheVar, null, false, null, 6.0f, null, false, l46Var2, 196608, 220);
                l46Var2.r(true);
                j09Var2 = j09Var3;
            } else {
                l46Var2.Z();
                j09Var2 = j09VarG;
            }
            ojbVarV = l46Var2.v();
            if (ojbVarV != null) {
                ojbVarV.d = new s48(j09Var2, ac4Var, x16Var, i2, i3, 7);
            }
        }
        j09VarG = j09Var;
        int i14 = i2 | i10;
        if (l46Var2.i(ac4Var)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i15 = i14 | i4;
        if (l46Var2.i(x16Var)) {
            i5 = 256;
        } else {
            i5 = UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        i6 = i15 | i5;
        i7 = 0;
        if ((i6 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (l46Var2.W(i6 & 1, z)) {
            l46Var2.b0();
            i8 = i2 & 1;
            g09Var = g09.a;
            if (i8 == 0) {
                if ((i3 & 1) != 0) {
                    j09VarG = k8b.g(g09Var, new ie2(29), l46Var2, 6);
                }
            } else if ((i3 & 1) != 0) {
                j09VarG = k8b.g(g09Var, new ie2(29), l46Var2, 6);
            }
            j09Var3 = j09VarG;
            l46Var2.s();
            if (i9 != 0) {
                strI = tec.i(l46Var2, -35953405, i9, l46Var2, false);
            } else {
                l46Var2.f0(-35952023);
                l46Var2.r(false);
                strI = str;
            }
            qheVar = new qhe(str, !ac4Var.d ? 1 : 0);
            j09 j09VarA1 = ynb.a0(b.c(j09Var3, false, null, null, x16Var, 15), 24.0f, 20.0f);
            t7c t7cVarA2 = s7c.a(xc0.a, ndb.z, l46Var2, 48);
            int iHashCode3 = Long.hashCode(l46Var2.T);
            u8a u8aVarM3 = l46Var2.m();
            j09 j09VarJ3 = m93.J(l46Var2, j09VarA1);
            lf2.q.getClass();
            l46Var2.j0();
            z2 = l46Var2.S;
            ov7Var = LayoutNode.h1;
            if (z2) {
                l46Var2.l(ov7Var);
            } else {
                l46Var2.s0();
            }
            he2 he2Var5 = hj6.z;
            dec.l(he2Var5, l46Var2, t7cVarA2);
            he2 he2Var6 = hj6.y;
            dec.l(he2Var6, l46Var2, u8aVarM3);
            Integer numValueOf2 = Integer.valueOf(iHashCode3);
            he2 he2Var7 = hj6.X;
            dec.l(he2Var7, l46Var2, numValueOf2);
            dec.k(l46Var2);
            he2 he2Var8 = hj6.x;
            dec.l(he2Var8, l46Var2, j09VarJ3);
            jw7 jw7Var2 = new jw7(1.0f, true);
            c92 c92VarA2 = a92.a(new uc0(8.0f, true, new qc0(i7)), ndb.Y, l46Var2, 6);
            int iHashCode4 = Long.hashCode(l46Var2.T);
            u8a u8aVarM4 = l46Var2.m();
            j09 j09VarJ4 = m93.J(l46Var2, jw7Var2);
            l46Var2.j0();
            if (l46Var2.S) {
                l46Var2.l(ov7Var);
            } else {
                l46Var2.s0();
            }
            dec.l(he2Var5, l46Var2, c92VarA2);
            dec.l(he2Var6, l46Var2, u8aVarM4);
            ib8.s(iHashCode4, l46Var2, he2Var7, l46Var2);
            dec.l(he2Var8, l46Var2, j09VarJ4);
            String strJ2 = ub3.j(afc.q(R.string.quick_decision_history_prefix, l46Var2), " | ", strI);
            mue mueVar2 = pue.a;
            mue mueVarP2 = pue.p(l46Var2);
            pr4Var = x8b.a;
            nte.b(strJ2, null, 0L, 0L, null, ((y8b) l46Var2.k(pr4Var)).a, 0L, null, null, 0L, 0, false, 0, 0, null, mueVarP2, l46Var, 0, 0, 130942);
            ttaVar = cn1.Q0;
            if (ttaVar != null) {
                pa7.g0("prettyTime");
                throw null;
            }
            w57 w57VarC2 = ac4Var.c();
            w57VarC2.getClass();
            Instant instantOfEpochMilli2 = Instant.ofEpochMilli(w57VarC2.e());
            instantOfEpochMilli2.getClass();
            String strC2 = ttaVar.c(ttaVar.b(Date.from(instantOfEpochMilli2)));
            strC2.getClass();
            nte.b(strC2, null, ((e8b) l46Var.k(l8b.a)).t, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, pue.g(l46Var), l46Var, 0, 0, 131066);
            nte.b(ac4Var.e, null, 0L, 0L, null, ((y8b) l46Var.k(pr4Var)).a, 0L, null, null, 0L, 0, false, 0, 0, null, mue.a(pue.m(l46Var), 0L, 0L, ar5.z, null, 0L, null, 0, 0L, null, null, 16777211), l46Var, 0, 0, 130942);
            l46Var2 = l46Var;
            l46Var2.r(true);
            o7c.d(dj6.w(androidx.compose.foundation.layout.b.p(g09Var, 56.0f), ((die) l46Var2.k(snd.a)).a.getAspectRatio()), qheVar, null, false, null, 6.0f, null, false, l46Var2, 196608, 220);
            l46Var2.r(true);
            j09Var2 = j09Var3;
        } else {
            l46Var2.Z();
            j09Var2 = j09VarG;
        }
        ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new s48(j09Var2, ac4Var, x16Var, i2, i3, 7);
        }
    }

    public static final void B(j09 j09Var, l46 l46Var, int i2) {
        l46Var.h0(-1275131065);
        int i3 = i2 | 6;
        int i4 = 2;
        int i5 = 0;
        if (l46Var.W(i3 & 1, (i3 & 3) != 2)) {
            c92 c92VarA = a92.a(new uc0(8.0f, true, new qc0(i5)), ndb.Y, l46Var, 6);
            int iHashCode = Long.hashCode(l46Var.T);
            u8a u8aVarM = l46Var.m();
            g09 g09Var = g09.a;
            j09 j09VarJ = m93.J(l46Var, g09Var);
            lf2.q.getClass();
            l46Var.j0();
            if (l46Var.S) {
                l46Var.l(LayoutNode.h1);
            } else {
                l46Var.s0();
            }
            dec.l(hj6.z, l46Var, c92VarA);
            dec.l(hj6.y, l46Var, u8aVarM);
            dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode));
            dec.k(l46Var);
            dec.l(hj6.x, l46Var, j09VarJ);
            l46Var.f0(-73746818);
            int i6 = 0;
            while (i6 < 3) {
                s21.a(o8c.q(androidx.compose.foundation.layout.b.d(androidx.compose.foundation.layout.b.c(g09Var, i6 == 2 ? 0.34f : 1.0f), 24.0f), 4.0f, l46Var, 48), l46Var, 0);
                i6++;
            }
            l46Var.r(false);
            l46Var.r(true);
            j09Var = g09Var;
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new l50(i2, i4, j09Var);
        }
    }

    public static final void C(j09 j09Var, boolean z, xw9 xw9Var, dd2 dd2Var, l46 l46Var, int i2, int i3) {
        int i4;
        j09 j09Var2;
        boolean z2;
        xw9 xw9Var2;
        l46Var.h0(-281308981);
        int i5 = i3 & 1;
        if (i5 != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (l46Var.g(j09Var) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i6 = i3 & 2;
        if (i6 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= l46Var.h(z) ? 32 : 16;
        }
        int i7 = i3 & 4;
        if (i7 != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            i4 |= l46Var.g(xw9Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if ((i2 & 3072) == 0) {
            i4 |= l46Var.i(dd2Var) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        }
        if (l46Var.W(i4 & 1, (i4 & 1171) != 1170)) {
            if (i5 != 0) {
                j09Var = g09.a;
            }
            j09 j09Var3 = j09Var;
            z2 = i6 != 0 ? true : z;
            if (i7 != 0) {
                xw9Var = new bx9(0.0f, 0.0f, 0.0f, 0.0f);
            }
            xw9Var2 = xw9Var;
            int i8 = i4 << 3;
            E(j09Var3, fbf.Block, z2, xw9Var2, dd2Var, l46Var, (i4 & 14) | 48 | (i8 & 896) | (i8 & 7168) | (i8 & 57344));
            j09Var2 = j09Var3;
        } else {
            l46Var.Z();
            j09Var2 = j09Var;
            z2 = z;
            xw9Var2 = xw9Var;
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new lc2(j09Var2, z2, xw9Var2, dd2Var, i2, i3);
        }
    }

    public static final void D(j09 j09Var, boolean z, xw9 xw9Var, dd2 dd2Var, l46 l46Var, int i2) {
        j09 j09Var2;
        boolean z2;
        xw9 xw9Var2;
        l46Var.h0(-741220467);
        int i3 = i2 | 438;
        if (l46Var.W(i3 & 1, (i3 & 1171) != 1170)) {
            bx9 bx9Var = new bx9(0.0f, 0.0f, 0.0f, 0.0f);
            fbf fbfVar = fbf.Item;
            g09 g09Var = g09.a;
            E(g09Var, fbfVar, true, bx9Var, dd2Var, l46Var, 28086);
            xw9Var2 = bx9Var;
            z2 = true;
            j09Var2 = g09Var;
        } else {
            l46Var.Z();
            j09Var2 = j09Var;
            z2 = z;
            xw9Var2 = xw9Var;
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new o50(j09Var2, z2, xw9Var2, dd2Var, i2, 6);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [boolean, int] */
    public static final void E(j09 j09Var, fbf fbfVar, boolean z, xw9 xw9Var, dd2 dd2Var, l46 l46Var, int i2) {
        int i3;
        fbf fbfVar2;
        int i4;
        ?? r1;
        l46Var.h0(1221313777);
        if ((i2 & 6) == 0) {
            i3 = (l46Var.g(j09Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= l46Var.e(fbfVar.ordinal()) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= l46Var.h(z) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if ((i2 & 3072) == 0) {
            i3 |= l46Var.g(xw9Var) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        }
        if ((i2 & 24576) == 0) {
            i3 |= l46Var.i(dd2Var) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE;
        }
        if (l46Var.W(i3 & 1, (i3 & 9363) != 9362)) {
            jx0 jx0Var = ndb.Y;
            sc0 sc0Var = xc0.c;
            c92 c92VarA = a92.a(sc0Var, jx0Var, l46Var, 0);
            int iHashCode = Long.hashCode(l46Var.T);
            u8a u8aVarM = l46Var.m();
            j09 j09VarJ = m93.J(l46Var, j09Var);
            lf2.q.getClass();
            l46Var.j0();
            boolean z2 = l46Var.S;
            ov7 ov7Var = LayoutNode.h1;
            if (z2) {
                l46Var.l(ov7Var);
            } else {
                l46Var.s0();
            }
            he2 he2Var = hj6.z;
            dec.l(he2Var, l46Var, c92VarA);
            he2 he2Var2 = hj6.y;
            dec.l(he2Var2, l46Var, u8aVarM);
            Integer numValueOf = Integer.valueOf(iHashCode);
            he2 he2Var3 = hj6.X;
            dec.l(he2Var3, l46Var, numValueOf);
            dec.k(l46Var);
            he2 he2Var4 = hj6.x;
            dec.l(he2Var4, l46Var, j09VarJ);
            boolean zF = k8b.f((e8b) l46Var.k(l8b.a));
            e92 e92Var = e92.a;
            if (zF) {
                l46Var.f0(1066738837);
                j09 j09VarY = ynb.Y(g09.a, xw9Var);
                c92 c92VarA2 = a92.a(sc0Var, jx0Var, l46Var, 0);
                i4 = i3;
                int iHashCode2 = Long.hashCode(l46Var.T);
                u8a u8aVarM2 = l46Var.m();
                j09 j09VarJ2 = m93.J(l46Var, j09VarY);
                l46Var.j0();
                if (l46Var.S) {
                    l46Var.l(ov7Var);
                } else {
                    l46Var.s0();
                }
                dec.l(he2Var, l46Var, c92VarA2);
                dec.l(he2Var2, l46Var, u8aVarM2);
                ib8.s(iHashCode2, l46Var, he2Var3, l46Var);
                dec.l(he2Var4, l46Var, j09VarJ2);
                ks0.q(6 | ((i4 >> 9) & 112), dd2Var, e92Var, l46Var, true);
                r1 = 0;
                l46Var.r(false);
            } else {
                i4 = i3;
                r1 = 0;
                l46Var.f0(-1212512316);
                ks0.q(6 | ((i4 >> 9) & 112), dd2Var, e92Var, l46Var, false);
            }
            if (z) {
                l46Var.f0(1066857753);
                fbfVar2 = fbfVar;
                p(fbfVar2, l46Var, (i4 >> 3) & 14, r1);
                l46Var.r(r1);
            } else {
                fbfVar2 = fbfVar;
                l46Var.f0(1066901959);
                l46Var.r(r1);
            }
            l46Var.r(true);
        } else {
            fbfVar2 = fbfVar;
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new dk(j09Var, fbfVar2, z, xw9Var, dd2Var, i2);
        }
    }

    public static final j09 F(j09 j09Var, l26 l26Var) {
        return j09Var.D(new bg(l26Var));
    }

    public static final ev0 G(dd2 dd2Var, l46 l46Var, int i2) {
        boolean z = (((i2 & 14) ^ 6) > 4 && l46Var.g(dd2Var)) || (i2 & 6) == 4;
        Object objR = l46Var.R();
        Object obj = sf2.a;
        if (z || objR == obj) {
            objR = new ev0(dd2Var);
            l46Var.p0(objR);
        }
        ev0 ev0Var = (ev0) objR;
        boolean zG = l46Var.g(ev0Var);
        Object objR2 = l46Var.R();
        if (zG || objR2 == obj) {
            objR2 = new c1(20, ev0Var);
            l46Var.p0(objR2);
        }
        af1.g(ev0Var, (a26) objR2, l46Var);
        return ev0Var;
    }

    public static void H(long j2, f41 f41Var, int i2, ArrayList arrayList, int i3, int i4, ArrayList arrayList2) {
        int i5;
        int i6;
        ArrayList arrayList3;
        long j3;
        int i7;
        int i8 = i2;
        ArrayList arrayList4 = arrayList;
        ArrayList arrayList5 = arrayList2;
        if (i3 >= i4) {
            qc0.j("Failed requirement.");
            return;
        }
        for (int i9 = i3; i9 < i4; i9++) {
            if (((a71) arrayList4.get(i9)).e() < i8) {
                qc0.j("Failed requirement.");
                return;
            }
        }
        a71 a71Var = (a71) arrayList.get(i3);
        a71 a71Var2 = (a71) arrayList4.get(i4 - 1);
        if (i8 == a71Var.e()) {
            int iIntValue = ((Number) arrayList5.get(i3)).intValue();
            int i10 = i3 + 1;
            a71 a71Var3 = (a71) arrayList4.get(i10);
            i5 = i10;
            i6 = iIntValue;
            a71Var = a71Var3;
        } else {
            i5 = i3;
            i6 = -1;
        }
        if (a71Var.k(i8) == a71Var2.k(i8)) {
            int iMin = Math.min(a71Var.e(), a71Var2.e());
            int i11 = 0;
            for (int i12 = i8; i12 < iMin && a71Var.k(i12) == a71Var2.k(i12); i12++) {
                i11++;
            }
            long j4 = (f41Var.b / 4) + j2 + 2 + ((long) i11) + 1;
            f41Var.l1(-i11);
            f41Var.l1(i6);
            int i13 = i8 + i11;
            while (i8 < i13) {
                f41Var.l1(a71Var.k(i8) & 255);
                i8++;
            }
            if (i5 + 1 == i4) {
                if (i13 == ((a71) arrayList4.get(i5)).e()) {
                    f41Var.l1(((Number) arrayList5.get(i5)).intValue());
                    return;
                } else {
                    qc0.p("Check failed.");
                    return;
                }
            }
            f41 f41Var2 = new f41();
            f41Var.l1(((int) ((f41Var2.b / 4) + j4)) * (-1));
            H(j4, f41Var2, i13, arrayList4, i5, i4, arrayList5);
            f41Var.h1(f41Var2);
            return;
        }
        int i14 = 1;
        for (int i15 = i5 + 1; i15 < i4; i15++) {
            if (((a71) arrayList4.get(i15 - 1)).k(i8) != ((a71) arrayList4.get(i15)).k(i8)) {
                i14++;
            }
        }
        long j5 = (f41Var.b / 4) + j2 + 2 + ((long) (i14 * 2));
        f41Var.l1(i14);
        f41Var.l1(i6);
        for (int i16 = i5; i16 < i4; i16++) {
            int iK = ((a71) arrayList4.get(i16)).k(i8);
            if (i16 == i5 || iK != ((a71) arrayList4.get(i16 - 1)).k(i8)) {
                f41Var.l1(iK & 255);
            }
        }
        f41 f41Var3 = new f41();
        int i17 = i5;
        while (i17 < i4) {
            byte bK = ((a71) arrayList4.get(i17)).k(i8);
            int i18 = i17 + 1;
            int i19 = i18;
            while (true) {
                if (i19 >= i4) {
                    i19 = i4;
                    break;
                } else if (bK != ((a71) arrayList4.get(i19)).k(i8)) {
                    break;
                } else {
                    i19++;
                }
            }
            if (i18 == i19 && i8 + 1 == ((a71) arrayList4.get(i17)).e()) {
                f41Var.l1(((Number) arrayList5.get(i17)).intValue());
                arrayList3 = arrayList5;
                j3 = j5;
                i7 = i19;
            } else {
                f41Var.l1(((int) ((f41Var3.b / 4) + j5)) * (-1));
                arrayList3 = arrayList5;
                j3 = j5;
                i7 = i19;
                H(j3, f41Var3, i8 + 1, arrayList, i17, i7, arrayList3);
                arrayList4 = arrayList;
            }
            j5 = j3;
            i17 = i7;
            arrayList5 = arrayList3;
        }
        f41Var.h1(f41Var3);
    }

    public static final void I(aw2 aw2Var, CancellationException cancellationException) {
        dg7 dg7Var = (dg7) aw2Var.getCoroutineContext().F0(ndb.Y0);
        if (dg7Var != null) {
            dg7Var.h(cancellationException);
        } else {
            pd4.i(aw2Var, "Scope cannot be cancelled because it does not have a job: ");
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Serializable M(String str, xn2 xn2Var) {
        igb igbVar;
        Serializable dzbVar;
        if (xn2Var instanceof igb) {
            igbVar = (igb) xn2Var;
            int i2 = igbVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                igbVar.label = i2 - Integer.MIN_VALUE;
            } else {
                igbVar = new igb(xn2Var);
            }
        } else {
            igbVar = new igb(xn2Var);
        }
        Object objB = igbVar.result;
        int i3 = igbVar.label;
        try {
            if (i3 == 0) {
                jzb.q(objB);
                hs3 hs3Var = xqa.l0;
                igbVar.L$0 = null;
                igbVar.label = 1;
                objB = bsa.b(hs3Var, str, igbVar);
                bw2 bw2Var = bw2.a;
                if (objB == bw2Var) {
                    return bw2Var;
                }
            } else {
                if (i3 != 1) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                jzb.q(objB);
            }
            dzbVar = (Boolean) objB;
            dzbVar.getClass();
        } catch (Throwable th) {
            dzbVar = new dzb(th);
        }
        Throwable thA = ezb.a(dzbVar);
        if (thA != null) {
            hf8.Q.getClass();
            ef8.a("ReadingLockedExposureTracker").c("Failed to persist exposure", thA);
        }
        return dzbVar instanceof dzb ? Boolean.FALSE : dzbVar;
    }

    public static final void N(Context context, long j2) {
        Long l2;
        synchronized (f95.a) {
            try {
                List listM = f95.m(context);
                ArrayList arrayList = new ArrayList();
                for (Object obj : listM) {
                    e95 e95Var = (e95) obj;
                    if (e95Var.h == null && pa7.t(e95Var.e, "share") && (l2 = e95Var.i) != null && j2 >= l2.longValue()) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    e95 e95VarC = f95.a.c(((e95) it.next()).a, j2, context);
                    if (e95VarC != null) {
                        arrayList2.add(e95VarC);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        f95 f95Var = f95.a;
        synchronized (f95Var) {
            e95 e95VarF = f95Var.f(context);
            if (e95VarF != null) {
                f95Var.d(e95VarF.a, j2, context);
            }
        }
        f95Var.o(context, j2);
    }

    public static final Object O(l26 l26Var, xn2 xn2Var) {
        pfc pfcVar = new pfc(xn2Var, xn2Var.getContext());
        return gcc.C(pfcVar, true, pfcVar, l26Var);
    }

    public static final zt P(float f2, float f3, float f4, float f5, long j2) {
        zt ztVarA = cu.a();
        if (f5 <= 0.0f || f4 <= f5) {
            hkb hkbVarF = z5c.f(j2, f4);
            hkb hkbVarF2 = z5c.f(j2, 0.0f);
            ztVarA.d(hkbVarF, f2, f3, true);
            ztVarA.d(hkbVarF2, f2 + f3, -f3, false);
            ztVarA.e();
            return ztVarA;
        }
        double radians = Math.toRadians(f2);
        float f6 = f2 + f3;
        double radians2 = Math.toRadians(f6);
        float f7 = f4 - f5;
        float degrees = (float) Math.toDegrees(Math.atan2(f5, f7));
        double d2 = degrees;
        double radians3 = Math.toRadians(d2) + radians;
        int i2 = (int) (j2 >> 32);
        float fCos = (f7 * ((float) Math.cos(radians3))) + Float.intBitsToFloat(i2);
        int i3 = (int) (j2 & 4294967295L);
        float fSin = (((float) Math.sin(radians3)) * f7) + Float.intBitsToFloat(i3);
        double radians4 = radians2 - Math.toRadians(d2);
        float fCos2 = (((float) Math.cos(radians4)) * f7) + Float.intBitsToFloat(i2);
        float fSin2 = (((float) Math.sin(radians4)) * f7) + Float.intBitsToFloat(i3);
        float fCos3 = (((float) Math.cos(radians)) * f7) + Float.intBitsToFloat(i2);
        float fSin3 = (((float) Math.sin(radians)) * f7) + Float.intBitsToFloat(i3);
        float f8 = f5 * 1.0f;
        float f9 = f3 / 2.0f;
        double radians5 = Math.toRadians(f9);
        double d3 = f8;
        float fSin4 = (float) (d3 / Math.sin(radians5));
        double radians6 = Math.toRadians(f2 + f9);
        float fCos4 = (((float) Math.cos(radians6)) * fSin4) + Float.intBitsToFloat(i2);
        float fSin5 = (((float) Math.sin(radians6)) * fSin4) + Float.intBitsToFloat(i3);
        float fTan = (float) (d3 / Math.tan(radians5));
        float fCos5 = (((float) Math.cos(radians)) * fTan) + Float.intBitsToFloat(i2);
        float fSin6 = (((float) Math.sin(radians)) * fTan) + Float.intBitsToFloat(i3);
        float fCos6 = (((float) Math.cos(radians2)) * fTan) + Float.intBitsToFloat(i2);
        float fSin7 = (((float) Math.sin(radians2)) * fTan) + Float.intBitsToFloat(i3);
        ztVarA.h(fCos5, fSin6);
        ztVarA.g(fCos3, fSin3);
        ztVarA.d(z5c.f((((long) Float.floatToRawIntBits(fCos)) << 32) | (((long) Float.floatToRawIntBits(fSin)) & 4294967295L), f5), f2 - 90.0f, 90.0f, false);
        ztVarA.d(z5c.f(j2, f4), f2 + degrees, f3 - (degrees * 2.0f), false);
        ztVarA.d(z5c.f((((long) Float.floatToRawIntBits(fCos2)) << 32) | (((long) Float.floatToRawIntBits(fSin2)) & 4294967295L), f5), f6, 90.0f, false);
        ztVarA.g(fCos6, fSin7);
        ztVarA.d(z5c.f((((long) Float.floatToRawIntBits(fCos4)) << 32) | (((long) Float.floatToRawIntBits(fSin5)) & 4294967295L), f8), f6 + 90.0f, 180.0f - f3, false);
        ztVarA.e();
        return ztVarA;
    }

    public static gj5 Q(boolean z, j18 j18Var, l46 l46Var, int i2) {
        j18Var.getClass();
        Object obj = sf2.a;
        if (!z) {
            l46Var.f0(-843179907);
            ph3 ph3VarA = yud.a(l46Var);
            boolean zG = l46Var.g(ph3VarA);
            Object objR = l46Var.R();
            if (zG || objR == obj) {
                objR = new uq3(ph3VarA);
                l46Var.p0(objR);
            }
            uq3 uq3Var = (uq3) objR;
            l46Var.r(false);
            return uq3Var;
        }
        l46Var.f0(-843180899);
        int i3 = i2 >> 3;
        boolean z2 = (((i3 & 14) ^ 6) > 4 && l46Var.g(j18Var)) || (i3 & 6) == 4;
        Object objR2 = l46Var.R();
        if (z2 || objR2 == obj) {
            Object e91Var = new e91(new e18(j18Var, gec.v), 0);
            l46Var.p0(e91Var);
            objR2 = e91Var;
        }
        ard ardVarE0 = ynb.e0((erd) objR2, l46Var);
        l46Var.r(false);
        return ardVarE0;
    }

    public static bh6 R(SSLSession sSLSession) throws IOException {
        List listK;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            qc0.p("cipherSuite == null");
            return null;
        }
        if (cipherSuite.equals("TLS_NULL_WITH_NULL_NULL") || cipherSuite.equals("SSL_NULL_WITH_NULL_NULL")) {
            yg5.m("cipherSuite == ".concat(cipherSuite));
            return null;
        }
        qz1 qz1VarI0 = qz1.b.I0(cipherSuite);
        String protocol = sSLSession.getProtocol();
        if (protocol == null) {
            qc0.p("tlsVersion == null");
            return null;
        }
        if ("NONE".equals(protocol)) {
            yg5.m("tlsVersion == NONE");
            return null;
        }
        tye.a.getClass();
        tye tyeVarK = w1e.k(protocol);
        try {
            listK = keg.k(sSLSession.getPeerCertificates());
        } catch (SSLPeerUnverifiedException unused) {
            listK = pu4.a;
        }
        return new bh6(tyeVarK, qz1VarI0, keg.k(sSLSession.getLocalCertificates()), new h53(listK, 5));
    }

    public static final ar5 S(l46 l46Var) {
        int iOrdinal = ((e8b) l46Var.k(l8b.a)).C.ordinal();
        if (iOrdinal == 0) {
            return ar5.c;
        }
        if (iOrdinal == 1) {
            return ar5.d;
        }
        ap.c();
        return null;
    }

    public static final mue T(l46 l46Var) {
        mue mueVar = oue.a;
        return mue.a(pue.e(l46Var), ((e8b) l46Var.k(l8b.a)).r, 0L, null, null, 0L, null, 3, w6c.l(24), null, null, 16613374);
    }

    public static final int U(Layout layout, int i2, boolean z) {
        if (i2 <= 0) {
            return 0;
        }
        if (i2 >= layout.getText().length()) {
            return layout.getLineCount() - 1;
        }
        int lineForOffset = layout.getLineForOffset(i2);
        int lineStart = layout.getLineStart(lineForOffset);
        int lineEnd = layout.getLineEnd(lineForOffset);
        if (lineStart == i2 || lineEnd == i2) {
            if (lineStart == i2) {
                if (z) {
                    return lineForOffset - 1;
                }
            } else if (!z) {
                return lineForOffset + 1;
            }
        }
        return lineForOffset;
    }

    public static int V(zu1 zu1Var) throws l0a {
        int iG = zu1Var.g(4);
        if (iG == 15) {
            if (zu1Var.b() >= 24) {
                return zu1Var.g(24);
            }
            throw l0a.a(null, "AAC header insufficient data");
        }
        if (iG < 13) {
            return a[iG];
        }
        throw l0a.a(null, "AAC header wrong Sampling Frequency Index");
    }

    public static final mue W(l46 l46Var) {
        long jL = w6c.l(12);
        long jL2 = w6c.l(16);
        return new mue(y72.b(((m82) l46Var.k(o82.a)).o, 0.48f), jL, null, null, ((y8b) l46Var.k(x8b.a)).b, 0L, 0L, 3, 0, jL2, null, null, 16613340);
    }

    public static void X(List list) throws ju3 {
        if (list.isEmpty()) {
            return;
        }
        int i2 = 0;
        do {
            try {
                ((lu3) list.get(i2)).d();
                i2++;
            } catch (ju3 e2) {
                for (int i3 = i2 - 1; i3 >= 0; i3--) {
                    ((lu3) list.get(i3)).b();
                }
                throw e2;
            }
        } while (i2 < list.size());
    }

    public static final boolean Y(aw2 aw2Var) {
        dg7 dg7Var = (dg7) aw2Var.getCoroutineContext().F0(ndb.Y0);
        if (dg7Var != null) {
            return dg7Var.b();
        }
        return true;
    }

    public static final j09 Z(j09 j09Var, n26 n26Var) {
        return j09Var.D(new dv7(n26Var));
    }

    public static void a0(MediaFormat mediaFormat, String str, int i2) {
        if (i2 != -1) {
            mediaFormat.setInteger(str, i2);
        }
    }

    public static final void b(j09 j09Var, dd2 dd2Var, l46 l46Var, int i2, int i3) {
        j09 j09Var2;
        int i4;
        long jC;
        long j2;
        l46Var.h0(-1107629936);
        int i5 = i3 & 1;
        if (i5 != 0) {
            i4 = i2 | 6;
            j09Var2 = j09Var;
        } else if ((i2 & 6) == 0) {
            j09Var2 = j09Var;
            i4 = i2 | (l46Var.g(j09Var2) ? 4 : 2);
        } else {
            j09Var2 = j09Var;
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= l46Var.i(dd2Var) ? 32 : 16;
        }
        if (l46Var.W(i4 & 1, (i4 & 19) != 18)) {
            g09 g09Var = g09.a;
            if (i5 != 0) {
                j09Var2 = g09Var;
            }
            boolean zS = g21.S(l46Var);
            if (zS) {
                l46Var.f0(719526755);
                jC = ((e8b) l46Var.k(l8b.a)).f;
                l46Var.r(false);
            } else {
                l46Var.f0(719525793);
                l46Var.r(false);
                jC = abg.c(268435455);
            }
            final long j3 = jC;
            if (zS) {
                l46Var.f0(719529476);
                j2 = ((e8b) l46Var.k(l8b.a)).B;
            } else {
                l46Var.f0(719528637);
                j2 = ((e8b) l46Var.k(l8b.a)).m;
            }
            l46Var.r(false);
            final long j4 = j2;
            j09 j09VarC = androidx.compose.foundation.layout.b.c(j09Var2, 1.0f);
            xn8 xn8VarC = s21.c(ndb.e, false);
            int iHashCode = Long.hashCode(l46Var.T);
            u8a u8aVarM = l46Var.m();
            j09 j09VarJ = m93.J(l46Var, j09VarC);
            lf2.q.getClass();
            l46Var.j0();
            boolean z = l46Var.S;
            ov7 ov7Var = LayoutNode.h1;
            if (z) {
                l46Var.l(ov7Var);
            } else {
                l46Var.s0();
            }
            he2 he2Var = hj6.z;
            dec.l(he2Var, l46Var, xn8VarC);
            he2 he2Var2 = hj6.y;
            dec.l(he2Var2, l46Var, u8aVarM);
            Integer numValueOf = Integer.valueOf(iHashCode);
            he2 he2Var3 = hj6.X;
            dec.l(he2Var3, l46Var, numValueOf);
            dec.k(l46Var);
            he2 he2Var4 = hj6.x;
            dec.l(he2Var4, l46Var, j09VarJ);
            final y6c y6cVarC = a7c.c(0.0f, 20.0f, 20.0f, 20.0f);
            j09 j09VarG = k8b.g(k8b.h(g09Var, new a7(5), l46Var, 6), new n26() { // from class: sx1
                @Override // defpackage.n26
                public final Object m(Object obj, Object obj2, Object obj3) {
                    j09 j09Var3 = (j09) obj;
                    l46 l46Var2 = (l46) obj2;
                    ((Integer) obj3).getClass();
                    j09Var3.getClass();
                    l46Var2.f0(617151313);
                    long j5 = j3;
                    y6c y6cVar = y6cVarC;
                    j09 j09VarZ = ynb.Z(db6.w(tm7.o(j09Var3, j5, y6cVar), 0.5f, j4, y6cVar), 20.0f);
                    l46Var2.r(false);
                    return j09VarZ;
                }
            }, l46Var, 0);
            xn8 xn8VarC2 = s21.c(ndb.b, false);
            int iHashCode2 = Long.hashCode(l46Var.T);
            u8a u8aVarM2 = l46Var.m();
            j09 j09VarJ2 = m93.J(l46Var, j09VarG);
            l46Var.j0();
            if (l46Var.S) {
                l46Var.l(ov7Var);
            } else {
                l46Var.s0();
            }
            dec.l(he2Var, l46Var, xn8VarC2);
            dec.l(he2Var2, l46Var, u8aVarM2);
            ib8.s(iHashCode2, l46Var, he2Var3, l46Var);
            dec.l(he2Var4, l46Var, j09VarJ2);
            dd2Var.z(l46Var, Integer.valueOf((i4 >> 3) & 14));
            l46Var.r(true);
            l46Var.r(true);
        } else {
            l46Var.Z();
        }
        j09 j09Var3 = j09Var2;
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new or1(j09Var3, dd2Var, i2, i3, 2);
        }
    }

    public static zr9 b0(a71... a71VarArr) {
        if (a71VarArr.length == 0) {
            return new zr9(new a71[0], new int[]{0, -1});
        }
        ArrayList arrayList = new ArrayList(new yc0(a71VarArr, false));
        w72.e0(arrayList);
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            arrayList2.add(-1);
        }
        int length = a71VarArr.length;
        int i3 = 0;
        int i4 = 0;
        while (i3 < length) {
            arrayList2.set(t72.s(arrayList, a71VarArr[i3]), Integer.valueOf(i4));
            i3++;
            i4++;
        }
        if (((a71) arrayList.get(0)).e() <= 0) {
            qc0.j("the empty byte string is not a supported option");
            return null;
        }
        int i5 = 0;
        while (i5 < arrayList.size()) {
            a71 a71Var = (a71) arrayList.get(i5);
            int i6 = i5 + 1;
            int i7 = i6;
            while (i7 < arrayList.size()) {
                a71 a71Var2 = (a71) arrayList.get(i7);
                a71Var2.getClass();
                a71Var.getClass();
                if (!a71Var2.n(0, a71Var, a71Var.e())) {
                    break;
                }
                if (a71Var2.e() == a71Var.e()) {
                    ho7.y(a71Var2, "duplicate option: ");
                    return null;
                }
                if (((Number) arrayList2.get(i7)).intValue() > ((Number) arrayList2.get(i5)).intValue()) {
                    arrayList.remove(i7);
                    ((Number) arrayList2.remove(i7)).intValue();
                } else {
                    i7++;
                }
            }
            i5 = i6;
        }
        f41 f41Var = new f41();
        H(0L, f41Var, 0, arrayList, 0, arrayList.size(), arrayList2);
        int i8 = (int) (f41Var.b / 4);
        int[] iArr = new int[i8];
        for (int i9 = 0; i9 < i8; i9++) {
            iArr[i9] = f41Var.L0();
        }
        return new zr9((a71[]) Arrays.copyOf(a71VarArr, a71VarArr.length), iArr);
    }

    public static final void c(j09 j09Var, l46 l46Var, int i2) {
        j09 j09Var2;
        l46 l46Var2 = l46Var;
        l46Var2.h0(-1112051382);
        int i3 = i2 | 48;
        if (l46Var2.W(i3 & 1, (i3 & 19) != 18)) {
            j09 j09VarD0 = ynb.d0(0.0f, 12.0f, 0.0f, 0.0f, 13, new mq6(ndb.E0));
            int i4 = g82.z;
            pr4 pr4Var = l8b.a;
            j09 j09VarA0 = ynb.a0(db6.w(j09VarD0, 0.5f, ((e8b) l46Var2.k(pr4Var)).z, a7c.b(12.0f)), 8.0f, 4.0f);
            xn8 xn8VarC = s21.c(ndb.b, false);
            int iHashCode = Long.hashCode(l46Var2.T);
            u8a u8aVarM = l46Var2.m();
            j09 j09VarJ = m93.J(l46Var2, j09VarA0);
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
            String strQ = afc.q(R.string.ai_generated_label, l46Var2);
            mue mueVar = oue.a;
            nte.b(strQ, null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mue.a(pue.g(l46Var2), ((e8b) l46Var2.k(pr4Var)).s, 0L, null, null, 0L, null, 0, 0L, null, null, 16777214), l46Var, 0, 0, 131070);
            l46Var2 = l46Var;
            l46Var2.r(true);
            j09Var2 = g09.a;
        } else {
            l46Var2.Z();
            j09Var2 = j09Var;
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new l50(i2, 4, j09Var2);
        }
    }

    public static i c0(zu1 zu1Var, boolean z) throws l0a {
        int iG = zu1Var.g(5);
        if (iG == 31) {
            iG = zu1Var.g(6) + 32;
        }
        int iV = V(zu1Var);
        int iG2 = zu1Var.g(4);
        String strE = tec.e(iG, "mp4a.40.");
        if (iG == 5 || iG == 29) {
            iV = V(zu1Var);
            int iG3 = zu1Var.g(5);
            if (iG3 == 31) {
                iG3 = zu1Var.g(6) + 32;
            }
            iG = iG3;
            if (iG == 22) {
                iG2 = zu1Var.g(4);
            }
        }
        if (z) {
            if (iG != 1 && iG != 2 && iG != 3 && iG != 4 && iG != 6 && iG != 7 && iG != 17) {
                switch (iG) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        throw l0a.b("Unsupported audio object type: " + iG);
                }
            }
            if (zu1Var.f()) {
                xo1.V("AacUtil", "Unexpected frameLengthFlag = 1");
            }
            if (zu1Var.f()) {
                zu1Var.o(14);
            }
            boolean zF = zu1Var.f();
            if (iG2 == 0) {
                cva.f();
                return null;
            }
            if (iG == 6 || iG == 20) {
                zu1Var.o(3);
            }
            if (zF) {
                if (iG == 22) {
                    zu1Var.o(16);
                }
                if (iG == 17 || iG == 19 || iG == 20 || iG == 23) {
                    zu1Var.o(3);
                }
                zu1Var.o(1);
            }
            switch (iG) {
                case 17:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    int iG4 = zu1Var.g(2);
                    if (iG4 == 2 || iG4 == 3) {
                        throw l0a.b("Unsupported epConfig: " + iG4);
                    }
                    break;
            }
        }
        int i2 = b[iG2];
        if (i2 == -1) {
            throw l0a.a(null, null);
        }
        i iVar = new i();
        iVar.a = iV;
        iVar.b = i2;
        iVar.c = strE;
        return iVar;
    }

    public static final void d(int i2, dd2 dd2Var, l46 l46Var, j09 j09Var, boolean z) {
        j09 j09Var2;
        l46Var.h0(-1774589935);
        int i3 = (l46Var.h(z) ? 4 : 2) | i2 | 48;
        int i4 = 1;
        if (l46Var.W(i3 & 1, (i3 & 147) != 146)) {
            cx4 cx4VarF = rw4.f(b21.T(300, 0, null, 6), 2);
            x6f x6fVarT = b21.T(350, 0, null, 6);
            Object objR = l46Var.R();
            if (objR == sf2.a) {
                objR = new wu0(26);
                l46Var.p0(objR);
            }
            cx4 cx4VarA = cx4VarF.a(rw4.m(x6fVarT, (a26) objR));
            dd2 dd2VarB0 = af1.b0(1630212841, new ec(dd2Var, i4), l46Var);
            int i5 = (i3 & 14) | 197040;
            j09Var2 = g09.a;
            m93.d(z, j09Var2, cx4VarA, null, null, dd2VarB0, l46Var, i5, 24);
        } else {
            l46Var.Z();
            j09Var2 = j09Var;
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new rx1(z, j09Var2, dd2Var, i2);
        }
    }

    public static final void d0(ui7 ui7Var, String str, Boolean bool) {
        ui7Var.getClass();
        str.getClass();
        ui7Var.a(oh7.a(bool), str);
    }

    public static final void e(String str, boolean z, j09 j09Var, l46 l46Var, int i2) {
        str.getClass();
        l46Var.h0(1380287242);
        int i3 = 2;
        int i4 = (l46Var.g(str) ? 4 : 2) | i2 | (l46Var.h(z) ? 32 : 16) | (l46Var.g(j09Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
        if (l46Var.W(i4 & 1, (i4 & 147) != 146)) {
            cx4 cx4VarF = rw4.f(b21.T(300, 0, null, 6), 2);
            x6f x6fVarT = b21.T(350, 0, null, 6);
            Object objR = l46Var.R();
            if (objR == sf2.a) {
                objR = new wu0(25);
                l46Var.p0(objR);
            }
            int i5 = i4 >> 3;
            m93.d(z, j09Var, cx4VarF.a(rw4.m(x6fVarT, (a26) objR)), null, null, af1.b0(-547180750, new ob0(str, i3), l46Var), l46Var, (i5 & 14) | 196992 | (i5 & 112), 24);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new kg(str, z, j09Var, i2, 2);
        }
    }

    public static final void f(int i2, l46 l46Var) {
        dd2 dd2Var = vd0.w;
        l46Var.h0(-1542733250);
        int i3 = 0;
        if (l46Var.W(i2 & 1, (i2 & 3) != 2)) {
            t7c t7cVarA = s7c.a(new uc0(6.0f, true, new qc0(i3)), ndb.z, l46Var, 54);
            int iHashCode = Long.hashCode(l46Var.T);
            u8a u8aVarM = l46Var.m();
            g09 g09Var = g09.a;
            j09 j09VarJ = m93.J(l46Var, g09Var);
            lf2.q.getClass();
            l46Var.j0();
            if (l46Var.S) {
                l46Var.l(LayoutNode.h1);
            } else {
                l46Var.s0();
            }
            dec.l(hj6.z, l46Var, t7cVarA);
            dec.l(hj6.y, l46Var, u8aVarM);
            dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode));
            dec.k(l46Var);
            dec.l(hj6.x, l46Var, j09VarJ);
            dd2Var.z(l46Var, 6);
            pr4 pr4Var = l8b.a;
            if (k8b.f((e8b) l46Var.k(pr4Var))) {
                l46Var.f0(-1605800317);
                gu6.a(if9.v(), null, androidx.compose.foundation.layout.b.l(g09Var, 20.0f), ((e8b) l46Var.k(pr4Var)).q, l46Var, 432, 0);
                l46Var.r(false);
            } else {
                l46Var.f0(-1605612736);
                l46Var.r(false);
            }
            l46Var.r(true);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new ym0(i2, 5);
        }
    }

    public static final void g(j09 j09Var, bx9 bx9Var, dd2 dd2Var, l46 l46Var, int i2) {
        j09 j09Var2;
        boolean z;
        l46Var.h0(1004351991);
        int i3 = i2 | 6;
        if ((i2 & 48) == 0) {
            i3 |= l46Var.g(bx9Var) ? 32 : 16;
        }
        if (l46Var.W(i3 & 1, (i3 & 147) != 146)) {
            jx0 jx0Var = ndb.Y;
            sc0 sc0Var = xc0.c;
            c92 c92VarA = a92.a(sc0Var, jx0Var, l46Var, 0);
            int iHashCode = Long.hashCode(l46Var.T);
            u8a u8aVarM = l46Var.m();
            g09 g09Var = g09.a;
            j09 j09VarJ = m93.J(l46Var, g09Var);
            lf2.q.getClass();
            l46Var.j0();
            boolean z2 = l46Var.S;
            ov7 ov7Var = LayoutNode.h1;
            if (z2) {
                l46Var.l(ov7Var);
            } else {
                l46Var.s0();
            }
            he2 he2Var = hj6.z;
            dec.l(he2Var, l46Var, c92VarA);
            he2 he2Var2 = hj6.y;
            dec.l(he2Var2, l46Var, u8aVarM);
            Integer numValueOf = Integer.valueOf(iHashCode);
            he2 he2Var3 = hj6.X;
            dec.l(he2Var3, l46Var, numValueOf);
            dec.k(l46Var);
            he2 he2Var4 = hj6.x;
            dec.l(he2Var4, l46Var, j09VarJ);
            boolean zF = k8b.f((e8b) l46Var.k(l8b.a));
            e92 e92Var = e92.a;
            if (zF) {
                l46Var.f0(1107228835);
                j09 j09VarY = ynb.Y(g09Var, bx9Var);
                c92 c92VarA2 = a92.a(sc0Var, jx0Var, l46Var, 0);
                int iHashCode2 = Long.hashCode(l46Var.T);
                u8a u8aVarM2 = l46Var.m();
                j09 j09VarJ2 = m93.J(l46Var, j09VarY);
                l46Var.j0();
                if (l46Var.S) {
                    l46Var.l(ov7Var);
                } else {
                    l46Var.s0();
                }
                dec.l(he2Var, l46Var, c92VarA2);
                dec.l(he2Var2, l46Var, u8aVarM2);
                ib8.s(iHashCode2, l46Var, he2Var3, l46Var);
                dec.l(he2Var4, l46Var, j09VarJ2);
                dd2Var.m(e92Var, l46Var, 54);
                z = true;
                l46Var.r(true);
                l46Var.r(false);
            } else {
                z = true;
                l46Var.f0(-102827530);
                dd2Var.m(e92Var, l46Var, 54);
                l46Var.r(false);
            }
            l46Var.r(z);
            j09Var2 = g09Var;
        } else {
            l46Var.Z();
            j09Var2 = j09Var;
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new b8(i2, j09Var2, bx9Var, dd2Var, 7);
        }
    }

    public static void g0(MediaFormat mediaFormat, List list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            mediaFormat.setByteBuffer(tec.e(i2, "csd-"), ByteBuffer.wrap((byte[]) list.get(i2)));
        }
    }

    public static final void h(int i2, x16 x16Var, l46 l46Var, j09 j09Var, String str, String str2) {
        l46 l46Var2;
        String str3;
        str.getClass();
        x16Var.getClass();
        l46Var.h0(148624016);
        int i3 = (l46Var.g(str) ? 4 : 2) | i2 | (l46Var.g(str2) ? 32 : 16) | 384 | (l46Var.i(x16Var) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE);
        if (l46Var.W(i3 & 1, (i3 & 1171) != 1170)) {
            g09 g09Var = g09.a;
            l46Var2 = l46Var;
            str3 = str;
            j(str3, g09Var, af1.b0(233799691, new o8(str2, 9), l46Var), af1.b0(-58586134, new m(12, x16Var), l46Var), l46Var2, (i3 & 14) | 3504, 0);
            j09Var = g09Var;
        } else {
            l46Var2 = l46Var;
            str3 = str;
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new tx1(str3, str2, j09Var, x16Var, i2);
        }
    }

    public static final Shader.TileMode h0(int i2) {
        if (i2 == 0) {
            return Shader.TileMode.CLAMP;
        }
        if (i2 == 1) {
            return Shader.TileMode.REPEAT;
        }
        if (i2 == 2) {
            return Shader.TileMode.MIRROR;
        }
        if (i2 == 3) {
            return Build.VERSION.SDK_INT >= 31 ? xq.n() : Shader.TileMode.CLAMP;
        }
        return Shader.TileMode.CLAMP;
    }

    public static final void i(String str, j09 j09Var, dd2 dd2Var, l46 l46Var, int i2, int i3) {
        int i4;
        j09 j09Var2;
        str.getClass();
        l46Var.h0(-820652695);
        int i5 = i2 | (l46Var.g(str) ? 4 : 2);
        int i6 = i3 & 2;
        if (i6 != 0) {
            i4 = i5 | 48;
        } else {
            i4 = i5 | (l46Var.g(j09Var) ? 32 : 16);
        }
        if (l46Var.W(i4 & 1, (i4 & 147) != 146)) {
            g09 g09Var = g09.a;
            j09 j09Var3 = i6 != 0 ? g09Var : j09Var;
            c92 c92VarA = a92.a(xc0.c, ndb.Y, l46Var, 0);
            int iHashCode = Long.hashCode(l46Var.T);
            u8a u8aVarM = l46Var.m();
            j09 j09VarJ = m93.J(l46Var, j09Var3);
            lf2.q.getClass();
            l46Var.j0();
            if (l46Var.S) {
                l46Var.l(LayoutNode.h1);
            } else {
                l46Var.s0();
            }
            dec.l(hj6.z, l46Var, c92VarA);
            dec.l(hj6.y, l46Var, u8aVarM);
            dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode));
            dec.k(l46Var);
            dec.l(hj6.x, l46Var, j09VarJ);
            n3d.b((i4 << 3) & 112, 0, l46Var, new mq6(ndb.E0), str);
            o5c.f(l46Var, androidx.compose.foundation.layout.b.d(g09Var, 12.0f));
            b(null, dd2Var, l46Var, 48, 1);
            l46Var.r(true);
            j09Var2 = j09Var3;
        } else {
            l46Var.Z();
            j09Var2 = j09Var;
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new px1(str, j09Var2, dd2Var, i2, i3);
        }
    }

    public static final dz6 i0(InAppMessage inAppMessage) {
        return new dz6(inAppMessage.getMessageId(), inAppMessage.getMessageType(), inAppMessage.getRegion(), inAppMessage.getTitle(), inAppMessage.getContent(), inAppMessage.getImageUrl(), inAppMessage.getIntensity(), inAppMessage.getAction(), inAppMessage.getActionTips(), inAppMessage.getAttach(), inAppMessage.getCreatedAt());
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0067  */
    /* JADX WARN: Code duplicated, block: B:38:0x0069  */
    /* JADX WARN: Code duplicated, block: B:41:0x0072  */
    /* JADX WARN: Code duplicated, block: B:43:0x0075  */
    /* JADX WARN: Code duplicated, block: B:46:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:50:0x0102  */
    /* JADX WARN: Code duplicated, block: B:53:0x0112  */
    /* JADX WARN: Code duplicated, block: B:56:0x0120  */
    /* JADX WARN: Code duplicated, block: B:58:0x0136  */
    /* JADX WARN: Code duplicated, block: B:61:0x0144  */
    /* JADX WARN: Code duplicated, block: B:64:0x014e  */
    /* JADX WARN: Code duplicated, block: B:66:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:50:0x0102, please report this as an issue */
    public static final void j(String str, j09 j09Var, dd2 dd2Var, l26 l26Var, l46 l46Var, int i2, int i3) {
        int i4;
        l26 l26Var2;
        int i5;
        boolean z;
        l26 l26Var3;
        ojb ojbVarV;
        str.getClass();
        l46Var.h0(1620077174);
        if ((i2 & 6) == 0) {
            i4 = (l46Var.g(str) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= l46Var.g(j09Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= l46Var.i(dd2Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        int i6 = i3 & 8;
        if (i6 == 0) {
            if ((i2 & 3072) == 0) {
                l26Var2 = l26Var;
                i4 |= l46Var.i(l26Var2) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i5 = 0;
            if ((i4 & 1171) != 1170) {
                z = true;
            } else {
                z = false;
            }
            if (l46Var.W(i4 & 1, z)) {
                if (i6 != 0) {
                    l26Var2 = null;
                }
                j09 j09VarD0 = ynb.d0(0.0f, 24.0f, 0.0f, 0.0f, 13, ynb.b0(20.0f, 0.0f, j09Var.D(androidx.compose.foundation.layout.b.c), 2));
                c92 c92VarA = a92.a(xc0.c, ndb.Y, l46Var, 0);
                int iHashCode = Long.hashCode(l46Var.T);
                u8a u8aVarM = l46Var.m();
                j09 j09VarJ = m93.J(l46Var, j09VarD0);
                lf2.q.getClass();
                l46Var.j0();
                if (l46Var.S) {
                    l46Var.l(LayoutNode.h1);
                } else {
                    l46Var.s0();
                }
                dec.l(hj6.z, l46Var, c92VarA);
                dec.l(hj6.y, l46Var, u8aVarM);
                dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode));
                dec.k(l46Var);
                dec.l(hj6.x, l46Var, j09VarJ);
                n3d.b((i4 << 3) & 112, 0, l46Var, new mq6(ndb.E0), str);
                o5c.f(l46Var, androidx.compose.foundation.layout.b.d(g09.a, 12.0f));
                b(null, af1.b0(1917590254, new qx1(dd2Var, i5), l46Var), l46Var, 48, 1);
                if (l26Var2 != null) {
                    l46Var.f0(2141133534);
                    if (1.0f <= 0.0d) {
                        g37.a("invalid weight; must be greater than zero");
                    }
                    o5c.f(l46Var, new jw7(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
                    l26Var2.z(l46Var, Integer.valueOf((i4 >> 9) & 14));
                    l46Var.r(false);
                } else {
                    l46Var.f0(2141187350);
                    l46Var.r(false);
                }
                l46Var.r(true);
            } else {
                l46Var.Z();
            }
            l26Var3 = l26Var2;
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new vi(str, j09Var, dd2Var, l26Var3, i2, i3);
            }
        }
        i4 |= 3072;
        l26Var2 = l26Var;
        i5 = 0;
        if ((i4 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (l46Var.W(i4 & 1, z)) {
            if (i6 != 0) {
                l26Var2 = null;
            }
            j09 j09VarD1 = ynb.d0(0.0f, 24.0f, 0.0f, 0.0f, 13, ynb.b0(20.0f, 0.0f, j09Var.D(androidx.compose.foundation.layout.b.c), 2));
            c92 c92VarA2 = a92.a(xc0.c, ndb.Y, l46Var, 0);
            int iHashCode2 = Long.hashCode(l46Var.T);
            u8a u8aVarM2 = l46Var.m();
            j09 j09VarJ2 = m93.J(l46Var, j09VarD1);
            lf2.q.getClass();
            l46Var.j0();
            if (l46Var.S) {
                l46Var.l(LayoutNode.h1);
            } else {
                l46Var.s0();
            }
            dec.l(hj6.z, l46Var, c92VarA2);
            dec.l(hj6.y, l46Var, u8aVarM2);
            dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode2));
            dec.k(l46Var);
            dec.l(hj6.x, l46Var, j09VarJ2);
            n3d.b((i4 << 3) & 112, 0, l46Var, new mq6(ndb.E0), str);
            o5c.f(l46Var, androidx.compose.foundation.layout.b.d(g09.a, 12.0f));
            b(null, af1.b0(1917590254, new qx1(dd2Var, i5), l46Var), l46Var, 48, 1);
            if (l26Var2 != null) {
                l46Var.f0(2141133534);
                if (1.0f <= 0.0d) {
                    g37.a("invalid weight; must be greater than zero");
                }
                o5c.f(l46Var, new jw7(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
                l26Var2.z(l46Var, Integer.valueOf((i4 >> 9) & 14));
                l46Var.r(false);
            } else {
                l46Var.f0(2141187350);
                l46Var.r(false);
            }
            l46Var.r(true);
        } else {
            l46Var.Z();
        }
        l26Var3 = l26Var2;
        ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new vi(str, j09Var, dd2Var, l26Var3, i2, i3);
        }
    }

    public static final qn2 k(pv2 pv2Var) {
        if (pv2Var.F0(ndb.Y0) == null) {
            pv2Var = pv2Var.p0(tq.d());
        }
        return new qn2(pv2Var);
    }

    public static final void l(int i2, l46 l46Var) {
        l46 l46Var2;
        l46Var.h0(-1762287082);
        if (!l46Var.W(i2 & 1, i2 != 0)) {
            l46Var2 = l46Var;
            l46Var2.Z();
        } else if (k8b.e((e8b) l46Var.k(l8b.a))) {
            l46Var.f0(1385853554);
            l46Var2 = l46Var;
            feg.j(od4.A(R.drawable.bg_draw_card, 0, l46Var), "", androidx.compose.foundation.layout.b.c, null, an2.a, 0.0f, null, l46Var2, 25016, 104);
            l46Var2.r(false);
        } else {
            l46Var2 = l46Var;
            l46Var2.f0(1386036268);
            l46Var2.r(false);
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new qv2(i2, 22);
        }
    }

    public static final void m(j09 j09Var, l46 l46Var, int i2) {
        l46 l46Var2;
        l46Var.h0(-553625413);
        if (l46Var.W(i2 & 1, (i2 & 3) != 2)) {
            l46Var2 = l46Var;
            feg.j(od4.A(we6.e(l46Var) ? R.drawable.img_notification_tp2_neo_illustration : R.drawable.img_notification_tp2_illustration, 0, l46Var), null, androidx.compose.foundation.layout.b.m(j09Var, 240.0f, 120.0f), null, an2.b, 0.0f, null, l46Var2, 24632, 104);
        } else {
            l46Var2 = l46Var;
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new l50(i2, 25, j09Var);
        }
    }

    public static final void n(String str, String str2, int i2, boolean z, boolean z2, String str3, x16 x16Var, l46 l46Var, int i3) {
        int i4;
        String str4;
        x16 x16Var2;
        boolean z3;
        j09 j09VarH;
        ov7 ov7Var;
        long jB;
        l46 l46Var2 = l46Var;
        l46Var2.h0(575439908);
        if ((i3 & 6) == 0) {
            i4 = (l46Var2.g(str) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= l46Var2.g(str2) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= l46Var2.e(i2) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if ((i3 & 3072) == 0) {
            i4 |= l46Var2.h(z) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        }
        if ((i3 & 24576) == 0) {
            i4 |= l46Var2.h(z2) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE;
        }
        if ((196608 & i3) == 0) {
            i4 |= l46Var2.g(str3) ? 131072 : 65536;
        }
        if ((1572864 & i3) == 0) {
            i4 |= l46Var2.i(x16Var) ? 1048576 : 524288;
        }
        int i5 = i4;
        if (l46Var2.W(i5 & 1, (i5 & 599187) != 599186)) {
            float f2 = we6.e(l46Var2) ? 8.0f : 20.0f;
            boolean zD = l46Var2.d(f2);
            Object objR = l46Var2.R();
            i8c i8cVar = sf2.a;
            if (zD || objR == i8cVar) {
                objR = a7c.b(f2);
                l46Var2.p0(objR);
            }
            y6c y6cVar = (y6c) objR;
            float f3 = we6.e(l46Var2) ? 4.0f : 12.0f;
            boolean zD2 = l46Var2.d(f3);
            Object objR2 = l46Var2.R();
            if (zD2 || objR2 == i8cVar) {
                objR2 = a7c.b(f3);
                l46Var2.p0(objR2);
            }
            y6c y6cVar2 = (y6c) objR2;
            boolean zE = k8b.e((e8b) l46Var2.k(l8b.a));
            long jB2 = l8b.b(l46Var2);
            long jA = l8b.a(l46Var2);
            if (!we6.e(l46Var2)) {
                jB2 = jA;
            }
            float f4 = z ? 1.0f : 0.5f;
            if (z) {
                l46Var2.f0(-1053011945);
            } else {
                l46Var2.f0(-1053010918);
                jB2 = l8b.m(l46Var2);
            }
            l46Var2.r(false);
            long j2 = jB2;
            g09 g09Var = g09.a;
            j09 j09VarF = androidx.compose.foundation.layout.b.f(88.0f, 0.0f, androidx.compose.foundation.layout.b.c(g09Var, 1.0f), 2);
            if (z) {
                l46Var2.f0(1716550076);
                if (zE) {
                    l46Var2.f0(1716701108);
                    jB = y72.b(l8b.a(l46Var2), 0.25f);
                    z3 = false;
                    l46Var2.r(false);
                } else {
                    z3 = false;
                    l46Var2.f0(1716780499);
                    jB = y72.b(l8b.b(l46Var2), 0.25f);
                    l46Var2.r(false);
                }
                j09VarH = rrb.h(g09Var, y6cVar, new n4d(12.0f, jB, 0.0f, 0L, 60));
                l46Var2.r(z3);
            } else {
                y6cVar2 = y6cVar2;
                z3 = false;
                l46Var2.f0(1716897152);
                l46Var2.r(false);
                j09VarH = g09Var;
            }
            j09 j09VarE = oa7.E(j09VarF.D(j09VarH), y6cVar);
            long jH = l8b.h(l46Var2);
            long j3 = l8b.j(l46Var2);
            if (!we6.e(l46Var2)) {
                jH = j3;
            }
            y02 y02Var = g21.f;
            j09 j09VarW = db6.w(tm7.o(j09VarE, jH, y02Var), f4, j2, y6cVar);
            i5c i5cVar = new i5c(1);
            int i6 = i5 & 3670016;
            boolean z4 = i6 == 1048576 ? true : z3;
            Object objR3 = l46Var2.R();
            if (z4 || objR3 == i8cVar) {
                objR3 = new p9(17, x16Var);
                l46Var2.p0(objR3);
            }
            a26 a26Var = (a26) objR3;
            boolean z5 = z3;
            y6c y6cVar3 = y6cVar2;
            j09 j09VarA = androidx.compose.ui.platform.b.a(ynb.Z(b21.R(j09VarW, z, z2, i5cVar, a26Var, 8), 20.0f), str3);
            t7c t7cVarA = s7c.a(new uc0(12.0f, true, new qc0(z5 ? 1 : 0)), ndb.z, l46Var2, 54);
            int iHashCode = Long.hashCode(l46Var2.T);
            u8a u8aVarM = l46Var2.m();
            j09 j09VarJ = m93.J(l46Var2, j09VarA);
            lf2.q.getClass();
            l46Var2.j0();
            boolean z6 = l46Var2.S;
            ov7 ov7Var2 = LayoutNode.h1;
            if (z6) {
                l46Var2.l(ov7Var2);
            } else {
                l46Var2.s0();
            }
            he2 he2Var = hj6.z;
            dec.l(he2Var, l46Var2, t7cVarA);
            he2 he2Var2 = hj6.y;
            dec.l(he2Var2, l46Var2, u8aVarM);
            Integer numValueOf = Integer.valueOf(iHashCode);
            he2 he2Var3 = hj6.X;
            dec.l(he2Var3, l46Var2, numValueOf);
            dec.k(l46Var2);
            he2 he2Var4 = hj6.x;
            dec.l(he2Var4, l46Var2, j09VarJ);
            j09 j09VarO = tm7.o(oa7.E(androidx.compose.foundation.layout.b.l(g09Var, 48.0f), y6cVar3), l8b.i(l46Var), y02Var);
            xn8 xn8VarC = s21.c(ndb.f, z5);
            int iHashCode2 = Long.hashCode(l46Var.T);
            u8a u8aVarM2 = l46Var.m();
            j09 j09VarJ2 = m93.J(l46Var, j09VarO);
            l46Var.j0();
            if (l46Var.S) {
                l46Var.l(ov7Var2);
            } else {
                l46Var.s0();
            }
            dec.l(he2Var, l46Var, xn8VarC);
            dec.l(he2Var2, l46Var, u8aVarM2);
            ib8.s(iHashCode2, l46Var, he2Var3, l46Var);
            dec.l(he2Var4, l46Var, j09VarJ2);
            int i7 = i5 >> 6;
            feg.j(od4.A(i2, i7 & 14, l46Var), null, androidx.compose.foundation.layout.b.l(g09Var, 36.0f), null, an2.b, 0.0f, null, l46Var, 25016, 104);
            l46Var.r(true);
            jw7 jw7Var = new jw7(1.0f, true);
            c92 c92VarA = a92.a(new uc0(4.0f, true, new qc0(0)), ndb.Y, l46Var, 6);
            int iHashCode3 = Long.hashCode(l46Var.T);
            u8a u8aVarM3 = l46Var.m();
            j09 j09VarJ3 = m93.J(l46Var, jw7Var);
            l46Var.j0();
            if (l46Var.S) {
                ov7Var = ov7Var2;
                l46Var.l(ov7Var);
            } else {
                ov7Var = ov7Var2;
                l46Var.s0();
            }
            dec.l(he2Var, l46Var, c92VarA);
            dec.l(he2Var2, l46Var, u8aVarM3);
            ib8.s(iHashCode3, l46Var, he2Var3, l46Var);
            dec.l(he2Var4, l46Var, j09VarJ3);
            mue mueVar = pue.a;
            ov7 ov7Var3 = ov7Var;
            nte.b(str, null, l8b.b(l46Var), 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, pue.b(l46Var), l46Var, i5 & 14, 0, 131066);
            nte.b(str2, null, l8b.d(l46Var), 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, pue.a, l46Var, (i5 >> 3) & 14, 0, 131066);
            l46Var2 = l46Var;
            l46Var2.r(true);
            boolean z7 = (i5 & 458752) == 131072;
            Object objR4 = l46Var2.R();
            if (z7 || objR4 == i8cVar) {
                str4 = str3;
                objR4 = new ia(str4, 29);
                l46Var2.p0(objR4);
            } else {
                str4 = str3;
            }
            j09 j09VarA2 = vwc.a(g09Var, (a26) objR4);
            xn8 xn8VarC2 = s21.c(ndb.b, false);
            int iHashCode4 = Long.hashCode(l46Var2.T);
            u8a u8aVarM4 = l46Var2.m();
            j09 j09VarJ4 = m93.J(l46Var2, j09VarA2);
            l46Var2.j0();
            if (l46Var2.S) {
                l46Var2.l(ov7Var3);
            } else {
                l46Var2.s0();
            }
            dec.l(he2Var, l46Var2, xn8VarC2);
            dec.l(he2Var2, l46Var2, u8aVarM4);
            ib8.s(iHashCode4, l46Var2, he2Var3, l46Var2);
            dec.l(he2Var4, l46Var2, j09VarJ4);
            boolean z8 = i6 == 1048576;
            Object objR5 = l46Var2.R();
            if (z8 || objR5 == i8cVar) {
                x16Var2 = x16Var;
                objR5 = new p9(18, x16Var2);
                l46Var2.p0(objR5);
            } else {
                x16Var2 = x16Var;
            }
            qk2.i(z, null, z2, 20.0f, null, (a26) objR5, l46Var2, ((i5 >> 9) & 14) | 3072 | (i7 & 896), 18);
            l46Var2.r(true);
            l46Var2.r(true);
        } else {
            str4 = str3;
            x16Var2 = x16Var;
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new pb0(str, str2, i2, z, z2, str4, x16Var2, i3);
        }
    }

    public static final void o(final e83 e83Var, final a26 a26Var, j09 j09Var, boolean z, l46 l46Var, int i2) {
        final int i3;
        boolean z2;
        l46 l46Var2 = l46Var;
        e83Var.getClass();
        a26Var.getClass();
        l46Var2.h0(1949957858);
        int i4 = (l46Var2.g(e83Var) ? 4 : 2) | i2;
        if ((i2 & 48) == 0) {
            i4 |= l46Var2.i(a26Var) ? 32 : 16;
        }
        int i5 = i4 | (l46Var2.g(j09Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
        if ((i2 & 3072) == 0) {
            i5 |= l46Var2.h(z) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        }
        int i6 = 0;
        if (l46Var2.W(i5 & 1, (i5 & 1171) != 1170)) {
            j09 j09VarC = androidx.compose.foundation.layout.b.c(j09Var, 1.0f);
            c92 c92VarA = a92.a(new uc0(16.0f, true, new qc0(i6)), ndb.Z, l46Var2, 54);
            int iHashCode = Long.hashCode(l46Var2.T);
            u8a u8aVarM = l46Var2.m();
            j09 j09VarJ = m93.J(l46Var2, j09VarC);
            lf2.q.getClass();
            l46Var2.j0();
            boolean z3 = l46Var2.S;
            ov7 ov7Var = LayoutNode.h1;
            if (z3) {
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
            t7c t7cVarA = s7c.a(new uc0(8.0f, true, new qc0(i6)), ndb.z, l46Var2, 54);
            int iHashCode2 = Long.hashCode(l46Var2.T);
            u8a u8aVarM2 = l46Var2.m();
            g09 g09Var = g09.a;
            j09 j09VarJ2 = m93.J(l46Var2, g09Var);
            l46Var2.j0();
            if (l46Var2.S) {
                l46Var2.l(ov7Var);
            } else {
                l46Var2.s0();
            }
            dec.l(he2Var, l46Var2, t7cVarA);
            dec.l(he2Var2, l46Var2, u8aVarM2);
            ib8.s(iHashCode2, l46Var2, he2Var3, l46Var2);
            dec.l(he2Var4, l46Var2, j09VarJ2);
            String strQ = afc.q(R.string.daily_fortune_reminder_selection_title, l46Var2);
            mue mueVar = pue.a;
            mue mueVarA = mue.a(pue.p(l46Var2), 0L, 0L, null, ((y8b) l46Var2.k(x8b.a)).a, 0L, null, 0, 0L, null, null, 16777183);
            pr4 pr4Var = l8b.a;
            int i7 = i5;
            nte.b(strQ, null, ((e8b) l46Var2.k(pr4Var)).q, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mueVarA, l46Var, 0, 0, 131066);
            nte.b(afc.q(R.string.daily_fortune_reminder_selection_multiple, l46Var), null, ((e8b) l46Var.k(pr4Var)).s, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, pue.g(l46Var), l46Var, 0, 0, 131066);
            l46Var.r(true);
            j09 j09VarC2 = androidx.compose.foundation.layout.b.c(g09Var, 1.0f);
            c92 c92VarA2 = a92.a(new uc0(8.0f, true, new qc0(0)), ndb.Y, l46Var, 6);
            int iHashCode3 = Long.hashCode(l46Var.T);
            u8a u8aVarM3 = l46Var.m();
            j09 j09VarJ3 = m93.J(l46Var, j09VarC2);
            l46Var.j0();
            if (l46Var.S) {
                l46Var.l(ov7Var);
            } else {
                l46Var.s0();
            }
            dec.l(he2Var, l46Var, c92VarA2);
            dec.l(he2Var2, l46Var, u8aVarM3);
            ib8.s(iHashCode3, l46Var, he2Var3, l46Var);
            dec.l(he2Var4, l46Var, j09VarJ3);
            String strQ2 = afc.q(R.string.daily_fortune_reminder_today_title, l46Var);
            String strQ3 = afc.q(R.string.daily_fortune_reminder_today_description, l46Var);
            int i8 = we6.e(l46Var) ? R.drawable.img_home_daily_fortune_today_compact_neo : R.drawable.img_home_daily_fortune_today_compact;
            boolean z4 = e83Var.a;
            int i9 = i7 & 112;
            int i10 = i7 & 14;
            boolean z5 = (i9 == 32) | (i10 == 4);
            Object objR = l46Var.R();
            i8c i8cVar = sf2.a;
            if (z5 || objR == i8cVar) {
                i3 = 0;
                objR = new x16() { // from class: bs5
                    @Override // defpackage.x16
                    public final Object invoke() {
                        int i11 = i3;
                        wef wefVar = wef.a;
                        e83 e83Var2 = e83Var;
                        a26 a26Var2 = a26Var;
                        switch (i11) {
                            case 0:
                                a26Var2.d(e83.a(e83Var2, !e83Var2.a, false, 2));
                                break;
                            default:
                                a26Var2.d(e83.a(e83Var2, false, !e83Var2.b, 1));
                                break;
                        }
                        return wefVar;
                    }
                };
                l46Var.p0(objR);
            } else {
                i3 = 0;
            }
            int i11 = ((i7 << 3) & 57344) | 196608;
            int i12 = i3;
            n(strQ2, strQ3, i8, z4, z, "reminder-option-today", (x16) objR, l46Var, i11);
            String strQ4 = afc.q(R.string.daily_fortune_reminder_tomorrow_title, l46Var);
            String strQ5 = afc.q(R.string.daily_fortune_reminder_tomorrow_description, l46Var);
            int i13 = we6.e(l46Var) ? R.drawable.img_home_daily_fortune_tomorrow_compact_neo : R.drawable.img_home_daily_fortune_tomorrow_compact;
            boolean z6 = e83Var.b;
            int i14 = i9 == 32 ? 1 : i12;
            if (i10 == 4) {
                i12 = 1;
            }
            int i15 = i14 | i12;
            Object objR2 = l46Var.R();
            if (i15 != 0 || objR2 == i8cVar) {
                z2 = true;
                final boolean z7 = true ? 1 : 0;
                objR2 = new x16() { // from class: bs5
                    @Override // defpackage.x16
                    public final Object invoke() {
                        int i16 = z7;
                        wef wefVar = wef.a;
                        e83 e83Var2 = e83Var;
                        a26 a26Var2 = a26Var;
                        switch (i16) {
                            case 0:
                                a26Var2.d(e83.a(e83Var2, !e83Var2.a, false, 2));
                                break;
                            default:
                                a26Var2.d(e83.a(e83Var2, false, !e83Var2.b, 1));
                                break;
                        }
                        return wefVar;
                    }
                };
                l46Var.p0(objR2);
            } else {
                z2 = true;
            }
            n(strQ4, strQ5, i13, z6, z, "reminder-option-tomorrow", (x16) objR2, l46Var, i11);
            l46Var.r(z2);
            nte.b(afc.q(R.string.daily_fortune_reminder_time_hint, l46Var), null, ((e8b) l46Var.k(pr4Var)).s, 0L, null, null, 0L, null, new jme(3), 0L, 0, false, 0, 0, null, pue.a, l46Var, 0, 0, 130042);
            l46Var2 = l46Var;
            l46Var2.r(true);
        } else {
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new a60(e83Var, a26Var, z, j09Var, i2, 5);
        }
    }

    public static final void p(fbf fbfVar, l46 l46Var, int i2, int i3) {
        int i4;
        fbf fbfVar2;
        l46Var.h0(1724532206);
        int i5 = i3 & 1;
        if (i5 != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (l46Var.e(fbfVar == null ? -1 : fbfVar.ordinal()) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i6 = 1;
        if (l46Var.W(i4 & 1, (i4 & 3) != 2)) {
            fbfVar2 = i5 != 0 ? fbf.Item : fbfVar;
            if (k8b.f((e8b) l46Var.k(l8b.a))) {
                l46Var.f0(-859707172);
                oa7.d(null, fbfVar2.b(), y72.b(g82.a(l46Var), fbfVar2.a()), l46Var, 0, 1);
                l46Var.r(false);
            } else {
                l46Var.f0(-859561100);
                l46Var.r(false);
            }
        } else {
            l46Var.Z();
            fbfVar2 = fbfVar;
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new nr1(fbfVar2, i2, i3, i6);
        }
    }

    public static final void q(int i2, int i3, l46 l46Var, j09 j09Var, String str) {
        int i4;
        j09 j09Var2;
        str.getClass();
        l46Var.h0(562215394);
        int i5 = i3 & 1;
        if (i5 != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = i2 | (l46Var.g(j09Var) ? 4 : 2);
        } else {
            i4 = i2;
        }
        int i6 = i4 | (l46Var.g(str) ? 32 : 16);
        if (l46Var.W(i6 & 1, (i6 & 19) != 18)) {
            j09 j09Var3 = i5 != 0 ? g09.a : j09Var;
            mue mueVar = pue.a;
            mue mueVarN = pue.n(l46Var);
            nte.b(str, j09Var3, 0L, 0L, ar5.d, ((y8b) l46Var.k(x8b.a)).a, 0L, null, new jme(3), w6c.k(40.5d), 0, false, 0, 0, null, mueVarN, l46Var, ((i6 >> 3) & 14) | 1572864 | ((i6 << 3) & 112), 48, 127804);
            j09Var2 = j09Var3;
        } else {
            l46Var.Z();
            j09Var2 = j09Var;
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new mc2(j09Var2, str, i2, i3, 0);
        }
    }

    public static final void r(j09 j09Var, k00 k00Var, l46 l46Var, int i2) {
        j09 j09Var2;
        k00Var.getClass();
        l46Var.h0(-380478560);
        int i3 = i2 | 6 | (l46Var.g(k00Var) ? 32 : 16);
        if (l46Var.W(i3 & 1, (i3 & 19) != 18)) {
            mue mueVar = pue.a;
            mue mueVarN = pue.n(l46Var);
            yp5 yp5Var = ((y8b) l46Var.k(x8b.a)).a;
            ar5 ar5Var = ar5.d;
            long jK = w6c.k(40.5d);
            j09Var2 = g09.a;
            nte.c(k00Var, j09Var2, 0L, 0L, ar5Var, yp5Var, 0L, new jme(3), jK, 0, false, 0, 0, null, null, mueVarN, l46Var, ((i3 >> 3) & 14) | 1572912, 48, 258876);
        } else {
            l46Var.Z();
            j09Var2 = j09Var;
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new h8(j09Var2, k00Var, i2, 18);
        }
    }

    public static final void s(int i2, int i3, int i4, l46 l46Var, j09 j09Var, String str) {
        int i5;
        int i6;
        j09 j09Var2;
        str.getClass();
        l46Var.h0(-356321893);
        int i7 = i4 & 1;
        if (i7 != 0) {
            i5 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i5 = i3 | (l46Var.g(j09Var) ? 4 : 2);
        } else {
            i5 = i3;
        }
        int i8 = i5 | (l46Var.g(str) ? 32 : 16) | 384;
        if (l46Var.W(i8 & 1, (i8 & 147) != 146)) {
            j09 j09Var3 = i7 != 0 ? g09.a : j09Var;
            nte.b(str, ynb.b0(32.0f, 0.0f, j09Var3, 2), 0L, 0L, null, null, 0L, null, null, 0L, 2, false, Integer.MAX_VALUE, 0, null, T(l46Var), l46Var, (i8 >> 3) & 14, 24960, 110588);
            i6 = Integer.MAX_VALUE;
            j09Var2 = j09Var3;
        } else {
            l46Var.Z();
            i6 = i2;
            j09Var2 = j09Var;
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new vb(j09Var2, str, i6, i3, i4);
        }
    }

    public static final void t(int i2, int i3, l46 l46Var, j09 j09Var) {
        int i4;
        l46 l46Var2;
        long jB;
        l46Var.h0(1044936599);
        int i5 = i3 & 1;
        if (i5 != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (l46Var.g(j09Var) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i6 = 0;
        if (l46Var.W(i4 & 1, (i4 & 3) != 2)) {
            if (i5 != 0) {
                j09Var = g09.a;
            }
            j09 j09Var2 = j09Var;
            pr4 pr4Var = l8b.a;
            if (k8b.f((e8b) l46Var.k(pr4Var))) {
                l46Var.f0(-216596292);
                jB = y72.b(((e8b) l46Var.k(pr4Var)).A, fbf.Item.a());
                l46Var.r(false);
            } else {
                l46Var.f0(-216512747);
                jB = y72.b(g82.a(l46Var), 0.16f);
                l46Var.r(false);
            }
            l46Var2 = l46Var;
            oa7.d(j09Var2, 0.5f, jB, l46Var2, (i4 & 14) | 48, 0);
            j09Var = j09Var2;
        } else {
            l46Var2 = l46Var;
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new kc2(j09Var, i2, i3, i6);
        }
    }

    public static final void u(int i2, l46 l46Var, j09 j09Var, ArrayList arrayList) {
        Object obj;
        l46Var.h0(2055801240);
        int i3 = (l46Var.g(j09Var) ? 4 : 2) | i2 | (l46Var.g(arrayList) ? 32 : 16);
        if (l46Var.W(i3 & 1, (i3 & 19) != 18)) {
            b1b b1bVar = l8b.a;
            long j2 = ((e8b) l46Var.k(b1bVar)).m;
            long jC = abg.c(1298616822);
            long j3 = ((e8b) l46Var.k(b1bVar)).q;
            mue mueVar = pue.a;
            Object objA = mue.a(pue.i(l46Var), j3, 0L, ar5.c, null, 0L, null, 0, 0L, null, null, 16777210);
            Object objA2 = uyb.A(0, 1, l46Var);
            boolean zF = l46Var.f(j2);
            Object objR = l46Var.R();
            Object obj2 = sf2.a;
            if (zF || objR == obj2) {
                obj = objR;
                Paint paint = new Paint();
                paint.setColor(abg.Z(j2));
                paint.setStyle(Paint.Style.FILL);
                paint.setAntiAlias(true);
                l46Var.p0(paint);
                obj = paint;
            }
            Object obj3 = (Paint) obj;
            Object objR2 = l46Var.R();
            Object obj4 = objR2;
            if (objR2 == obj2) {
                Paint paint2 = new Paint();
                paint2.setColor(abg.Z(jC));
                paint2.setStyle(Paint.Style.FILL);
                paint2.setAntiAlias(true);
                l46Var.p0(paint2);
                obj4 = paint2;
            }
            Object obj5 = (Paint) obj4;
            j09 j09VarZ = ynb.Z(dj6.w(j09Var, 1.0f), 16.0f);
            boolean zI = l46Var.i(obj3) | ((i3 & 112) == 32) | l46Var.i(obj5) | l46Var.g(objA2) | l46Var.g(objA);
            Object objR3 = l46Var.R();
            if (zI || objR3 == obj2) {
                Object kfVar = new kf(arrayList, obj3, obj5, objA2, objA, 18);
                l46Var.p0(kfVar);
                objR3 = kfVar;
            }
            nk8.e(0, (a26) objR3, l46Var, j09VarZ);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new fp9(j09Var, arrayList, i2);
        }
    }

    public static final void v(boolean z, l26 l26Var, l46 l46Var, int i2) {
        l46Var.h0(1818896922);
        int i3 = (l46Var.h(z) ? 4 : 2) | i2 | (l46Var.i(l26Var) ? 32 : 16);
        if ((i3 & 19) == 18 && l46Var.F()) {
            l46Var.Z();
        } else {
            ym8.g(z, l26Var, l46Var, i3 & 126);
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new ha9(z, l26Var, i2);
        }
    }

    public static final void w(j09 j09Var, long j2, float f2, l46 l46Var, final int i2) {
        final j09 j09Var2;
        final long j3;
        final float f3;
        float f4;
        long j4;
        l46Var.h0(2012349750);
        int i3 = i2 | 406;
        int i4 = 1;
        if (l46Var.W(i3 & 1, (i3 & 147) != 146)) {
            l46Var.b0();
            if ((i2 & 1) == 0 || l46Var.C()) {
                long j5 = ((m82) l46Var.k(o82.a)).a;
                j09Var = g09.a;
                f4 = 4.0f;
                j4 = j5;
            } else {
                l46Var.Z();
                j4 = j2;
                f4 = f2;
            }
            j09Var2 = j09Var;
            l46Var.s();
            Object objR = l46Var.R();
            Object obj = sf2.a;
            if (objR == obj) {
                objR = af1.E(l46Var);
                l46Var.p0(objR);
            }
            aw2 aw2Var = (aw2) objR;
            Object objR2 = l46Var.R();
            if (objR2 == obj) {
                objR2 = qk2.d(0.0f);
                l46Var.p0(objR2);
            }
            jx jxVar = (jx) objR2;
            boolean zI = l46Var.i(aw2Var) | l46Var.i(jxVar);
            Object objR3 = l46Var.R();
            if (zI || objR3 == obj) {
                objR3 = new sc2(aw2Var, jxVar, null);
                l46Var.p0(objR3);
            }
            af1.o((l26) objR3, l46Var, wef.a);
            long j6 = y72.k;
            boolean zI2 = l46Var.i(jxVar);
            Object objR4 = l46Var.R();
            if (zI2 || objR4 == obj) {
                objR4 = new wz1(jxVar, i4);
                l46Var.p0(objR4);
            }
            long j7 = j4;
            f3 = f4;
            j3 = j7;
            axa.b((x16) objR4, j09Var2, j3, f3, j6, 0.0f, l46Var, 27696);
        } else {
            l46Var.Z();
            j09Var2 = j09Var;
            j3 = j2;
            f3 = f2;
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new l26(j3, f3, i2) { // from class: nc2
                public final /* synthetic */ long b;
                public final /* synthetic */ float c;

                @Override // defpackage.l26
                public final Object z(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iP = k99.P(1);
                    jgb.w(this.a, this.b, this.c, (l46) obj2, iP);
                    return wef.a;
                }
            };
        }
    }

    public static final void x(j09 j09Var, b1b b1bVar, dd2 dd2Var, l46 l46Var, int i2) {
        int i3;
        dd2 dd2Var2 = pa7.a;
        l46Var.h0(-714464401);
        if ((i2 & 6) == 0) {
            i3 = (l46Var.g(j09Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= l46Var.g(b1bVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= l46Var.i(dd2Var2) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if ((i2 & 3072) == 0) {
            i3 |= l46Var.i(dd2Var) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        }
        if (l46Var.W(i3 & 1, (i3 & 1171) != 1170)) {
            Object objR = l46Var.R();
            if (objR == sf2.a) {
                Object vz9Var = new vz9(null, qk6.L0);
                l46Var.p0(vz9Var);
                objR = vz9Var;
            }
            ev0 ev0VarG = G(dd2Var2, l46Var, (i3 >> 6) & 14);
            mh3.a(b1bVar.a(ev0VarG), af1.b0(274270255, new q8(j09Var, (e89) objR, dd2Var, ev0VarG, 5), l46Var), l46Var, 56);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new b8(i2, j09Var, b1bVar, dd2Var, 4);
        }
    }

    public static final void y(int i2, l46 l46Var, j09 j09Var, String str) {
        l46 l46Var2;
        String str2;
        l46Var.h0(1684483214);
        int i3 = (l46Var.g(str) ? 4 : 2) | i2 | 48;
        int i4 = 1;
        if (l46Var.W(i3 & 1, (i3 & 19) != 18)) {
            g09 g09Var = g09.a;
            l46Var2 = l46Var;
            str2 = str;
            j(str2, g09Var, an1.e, null, l46Var2, (i3 & 14) | 432, 8);
            j09Var = g09Var;
        } else {
            l46Var2 = l46Var;
            str2 = str;
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new p8(str2, j09Var, i2, i4);
        }
    }

    public static final void z(int i2, x16 x16Var, l46 l46Var, j09 j09Var, String str) {
        l46 l46Var2;
        String str2;
        x16Var.getClass();
        l46Var.h0(-188654182);
        int i3 = i2 | 6 | (l46Var.g(str) ? 32 : 16) | (l46Var.i(x16Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
        if (l46Var.W(i3 & 1, (i3 & 147) != 146)) {
            g09 g09Var = g09.a;
            l46Var2 = l46Var;
            str2 = str;
            j(str2, g09Var, an1.f, af1.b0(-958508044, new m(11, x16Var), l46Var), l46Var2, ((i3 >> 3) & 14) | 3504, 0);
            j09Var = g09Var;
        } else {
            l46Var2 = l46Var;
            str2 = str;
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new r(j09Var, str2, x16Var, i2);
        }
    }

    public abstract boolean J(u4 u4Var, q4 q4Var, q4 q4Var2);

    public abstract boolean K(u4 u4Var, Object obj, Object obj2);

    public abstract boolean L(u4 u4Var, t4 t4Var, t4 t4Var2);

    public abstract void e0(t4 t4Var, t4 t4Var2);

    public abstract void f0(t4 t4Var, Thread thread);
}
