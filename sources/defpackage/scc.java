package defpackage;

import ai.askquin.R;
import android.content.Context;
import android.hardware.camera2.CaptureRequest;
import android.os.Build;
import android.view.View;
import androidx.camera.camera2.compat.quirk.StillCaptureFlashStopRepeatingQuirk;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;
import com.adjust.sdk.network.ErrorCodes;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class scc {
    public static final void a(x48 x48Var, cs3 cs3Var, vad vadVar, l46 l46Var, int i) {
        l46Var.h0(365028183);
        int i2 = (l46Var.g(x48Var) ? 4 : 2) | i | (l46Var.g(cs3Var) ? 32 : 16) | (l46Var.i(vadVar) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
        if (l46Var.W(i2 & 1, (i2 & 147) != 146)) {
            int i3 = i2 & 896;
            boolean z = ((i2 & 14) == 4) | (i3 == 256 || l46Var.i(vadVar));
            Object objR = l46Var.R();
            i8c i8cVar = sf2.a;
            if (z || objR == i8cVar) {
                objR = new i2e(21, x48Var, vadVar);
                l46Var.p0(objR);
            }
            af1.h(x48Var, vadVar, (a26) objR, l46Var);
            int i4 = i2 & 112;
            boolean z2 = (i4 == 32) | (i3 == 256 || l46Var.i(vadVar));
            Object objR2 = l46Var.R();
            if (z2 || objR2 == i8cVar) {
                objR2 = new jdf(cs3Var, vadVar, null);
                l46Var.p0(objR2);
            }
            af1.p(cs3Var, vadVar, (l26) objR2, l46Var);
            boolean z3 = (i4 == 32) | (i3 == 256 || l46Var.i(vadVar));
            Object objR3 = l46Var.R();
            if (z3 || objR3 == i8cVar) {
                objR3 = new kdf(cs3Var, vadVar, null);
                l46Var.p0(objR3);
            }
            af1.p(cs3Var, vadVar, (l26) objR3, l46Var);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new o7b(i, x48Var, cs3Var, vadVar, 17);
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0066  */
    /* JADX WARN: Code duplicated, block: B:35:0x006c  */
    /* JADX WARN: Code duplicated, block: B:36:0x006e  */
    /* JADX WARN: Code duplicated, block: B:40:0x0079  */
    /* JADX WARN: Code duplicated, block: B:42:0x007f  */
    /* JADX WARN: Code duplicated, block: B:43:0x0082  */
    /* JADX WARN: Code duplicated, block: B:47:0x008a  */
    /* JADX WARN: Code duplicated, block: B:49:0x0090  */
    /* JADX WARN: Code duplicated, block: B:50:0x0093  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ae A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:59:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:66:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:68:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:69:0x0101  */
    /* JADX WARN: Code duplicated, block: B:73:0x011e  */
    /* JADX WARN: Code duplicated, block: B:74:0x0120  */
    /* JADX WARN: Code duplicated, block: B:79:0x012b  */
    /* JADX WARN: Code duplicated, block: B:82:0x0182  */
    /* JADX WARN: Code duplicated, block: B:83:0x0184  */
    /* JADX WARN: Code duplicated, block: B:85:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:88:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:93:? A[RETURN, SYNTHETIC] */
    public static final void b(j09 j09Var, int i, boolean z, n26 n26Var, n26 n26Var2, int i2, a26 a26Var, l46 l46Var, int i3, int i4) {
        j09 j09Var2;
        int i5;
        boolean z2;
        int i6;
        int i7;
        boolean z3;
        j09 j09Var3;
        n26 n26Var3;
        ojb ojbVarV;
        boolean z4;
        aue aueVarA;
        Object objM;
        int i8;
        sw3 sw3Var;
        boolean z5;
        Object objR;
        float f;
        j09 j09VarP;
        int i9;
        int i10;
        int i11;
        int i12;
        a26Var.getClass();
        l46Var.h0(82434202);
        int i13 = i4 & 1;
        if (i13 != 0) {
            i5 = i3 | 6;
            j09Var2 = j09Var;
        } else if ((i3 & 6) == 0) {
            j09Var2 = j09Var;
            i5 = (l46Var.g(j09Var2) ? 4 : 2) | i3;
        } else {
            j09Var2 = j09Var;
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= l46Var.e(i) ? 32 : 16;
        }
        int i14 = i5 | 384;
        int i15 = i4 & 8;
        if (i15 == 0) {
            if ((i3 & 3072) == 0) {
                z2 = z;
                i14 |= l46Var.h(z2) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            if ((i3 & 24576) == 0) {
                if (l46Var.i(n26Var)) {
                    i12 = 16384;
                } else {
                    i12 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                }
                i14 |= i12;
            }
            i6 = i14 | 196608;
            if ((1572864 & i3) == 0) {
                if (l46Var.e(i2)) {
                    i11 = 1048576;
                } else {
                    i11 = 524288;
                }
                i6 |= i11;
            }
            if ((12582912 & i3) == 0) {
                if (l46Var.i(a26Var)) {
                    i10 = 8388608;
                } else {
                    i10 = 4194304;
                }
                i6 |= i10;
            }
            i7 = 1;
            if ((4793491 & i6) != 4793490) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (l46Var.W(i6 & 1, z3)) {
                if (i13 != 0) {
                    j09Var3 = g09.a;
                } else {
                    j09Var3 = j09Var2;
                }
                if (i15 != 0) {
                    z4 = true;
                } else {
                    z4 = z2;
                }
                dd2 dd2Var = g21.d;
                aueVarA = uyb.A(0, 1, l46Var);
                l46Var.f0(1909867617);
                objM = "";
                for (i8 = 0; i8 < i; i8++) {
                    i9 = (i6 >> 9) & 112;
                    if (((String) n26Var.m(Integer.valueOf(i8), l46Var, Integer.valueOf(i9))).length() > ((String) objM).length()) {
                        l46Var.f0(-923582713);
                        objM = n26Var.m(Integer.valueOf(i8), l46Var, Integer.valueOf(i9));
                        l46Var.r(false);
                    } else {
                        l46Var.f0(-923551000);
                        l46Var.r(false);
                    }
                }
                l46Var.r(false);
                sw3Var = (sw3) l46Var.k(zg2.h);
                if ((57344 & i6) == 16384) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                objR = l46Var.R();
                if (z5 || objR == sf2.a) {
                    objR = new yi4(sw3Var.Z(((int) (aue.a(aueVarA, (String) objM, new mue(0L, w6c.l(15), ar5.c, null, null, 0L, 0L, 0, 0, w6c.l(22), null, null, 16646137), 0L, ErrorCodes.PROTOCOL_EXCEPTION).c >> 32)) * i) + (i * 20));
                    l46Var.p0(objR);
                }
                f = ((yi4) objR).a;
                l46Var.f0(1909885538);
                l46Var.r(false);
                if (z4) {
                    j09VarP = b.p(j09Var3, f + 16.0f);
                } else {
                    j09VarP = j09Var3;
                }
                j09 j09VarE = oa7.E(j09VarP, eze.a(l46Var).a.a);
                q11 q11VarB = x57.b(eze.a(l46Var).b.x(l46Var), 1.0f);
                jzb.f(i2, db6.x(j09VarE, q11VarB.a, q11VarB.b, g21.f), ((e8b) l46Var.k(l8b.a)).m, 0L, af1.b0(-1478644734, new qs1(i2, i7), l46Var), g21.e, af1.b0(-336872958, new or1(i, i2, a26Var, n26Var), l46Var), l46Var, ((i6 >> 18) & 14) | 1794048);
                z2 = z4;
                n26Var3 = dd2Var;
            } else {
                l46Var.Z();
                j09Var3 = j09Var2;
                n26Var3 = n26Var2;
            }
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new rjd(j09Var3, i, z2, n26Var, n26Var3, i2, a26Var, i3, i4);
            }
        }
        i14 = i5 | 3456;
        z2 = z;
        if ((i3 & 24576) == 0) {
            if (l46Var.i(n26Var)) {
                i12 = 16384;
            } else {
                i12 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
            }
            i14 |= i12;
        }
        i6 = i14 | 196608;
        if ((1572864 & i3) == 0) {
            if (l46Var.e(i2)) {
                i11 = 1048576;
            } else {
                i11 = 524288;
            }
            i6 |= i11;
        }
        if ((12582912 & i3) == 0) {
            if (l46Var.i(a26Var)) {
                i10 = 8388608;
            } else {
                i10 = 4194304;
            }
            i6 |= i10;
        }
        i7 = 1;
        if ((4793491 & i6) != 4793490) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (l46Var.W(i6 & 1, z3)) {
            if (i13 != 0) {
                j09Var3 = g09.a;
            } else {
                j09Var3 = j09Var2;
            }
            if (i15 != 0) {
                z4 = true;
            } else {
                z4 = z2;
            }
            dd2 dd2Var2 = g21.d;
            aueVarA = uyb.A(0, 1, l46Var);
            l46Var.f0(1909867617);
            objM = "";
            while (i8 < i) {
                i9 = (i6 >> 9) & 112;
                if (((String) n26Var.m(Integer.valueOf(i8), l46Var, Integer.valueOf(i9))).length() > ((String) objM).length()) {
                    l46Var.f0(-923582713);
                    objM = n26Var.m(Integer.valueOf(i8), l46Var, Integer.valueOf(i9));
                    l46Var.r(false);
                } else {
                    l46Var.f0(-923551000);
                    l46Var.r(false);
                }
            }
            l46Var.r(false);
            sw3Var = (sw3) l46Var.k(zg2.h);
            if ((57344 & i6) == 16384) {
                z5 = true;
            } else {
                z5 = false;
            }
            objR = l46Var.R();
            if (z5) {
                objR = new yi4(sw3Var.Z(((int) (aue.a(aueVarA, (String) objM, new mue(0L, w6c.l(15), ar5.c, null, null, 0L, 0L, 0, 0, w6c.l(22), null, null, 16646137), 0L, ErrorCodes.PROTOCOL_EXCEPTION).c >> 32)) * i) + (i * 20));
                l46Var.p0(objR);
            } else {
                objR = new yi4(sw3Var.Z(((int) (aue.a(aueVarA, (String) objM, new mue(0L, w6c.l(15), ar5.c, null, null, 0L, 0L, 0, 0, w6c.l(22), null, null, 16646137), 0L, ErrorCodes.PROTOCOL_EXCEPTION).c >> 32)) * i) + (i * 20));
                l46Var.p0(objR);
            }
            f = ((yi4) objR).a;
            l46Var.f0(1909885538);
            l46Var.r(false);
            if (z4) {
                j09VarP = j09Var3;
            } else {
                j09VarP = b.p(j09Var3, f + 16.0f);
            }
            j09 j09VarE2 = oa7.E(j09VarP, eze.a(l46Var).a.a);
            q11 q11VarB2 = x57.b(eze.a(l46Var).b.x(l46Var), 1.0f);
            jzb.f(i2, db6.x(j09VarE2, q11VarB2.a, q11VarB2.b, g21.f), ((e8b) l46Var.k(l8b.a)).m, 0L, af1.b0(-1478644734, new qs1(i2, i7), l46Var), g21.e, af1.b0(-336872958, new or1(i, i2, a26Var, n26Var), l46Var), l46Var, ((i6 >> 18) & 14) | 1794048);
            z2 = z4;
            n26Var3 = dd2Var2;
        } else {
            l46Var.Z();
            j09Var3 = j09Var2;
            n26Var3 = n26Var2;
        }
        ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new rjd(j09Var3, i, z2, n26Var, n26Var3, i2, a26Var, i3, i4);
        }
    }

    public static final void c(int i, a26 a26Var, l46 l46Var, j09 j09Var, boolean z) {
        j09 j09Var2;
        l46 l46Var2 = l46Var;
        l46Var2.h0(2077714670);
        int i2 = i | (l46Var2.h(z) ? 4 : 2) | 48 | (l46Var2.i(a26Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
        if (l46Var2.W(i2 & 1, (i2 & 147) != 146)) {
            t7c t7cVarA = s7c.a(new uc0(4.0f, true, new qc0(0)), ndb.z, l46Var2, 54);
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
            qk2.i(z, null, false, 0.0f, null, a26Var, l46Var2, (i2 & 14) | ((i2 << 9) & 458752), 30);
            l46Var2.f0(17065774);
            i00 i00Var = new i00();
            l46Var2.f0(17065615);
            pr4 pr4Var = o82.a;
            int iK = i00Var.k(new xtd(y72.b(((m82) l46Var2.k(pr4Var)).o, 0.48f), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534));
            try {
                i00Var.f(afc.q(R.string.auth_terms_privacy_check_desc, l46Var2));
                i00Var.f(" ");
                i00Var.h(iK);
                l46Var2.r(false);
                l46Var2.f0(17072361);
                String strB = z5c.B();
                long jC = p8c.q(l46Var2).c();
                yp5 yp5Var = p8c.q(l46Var2).a.f;
                mne mneVar = mne.c;
                xtd xtdVar = new xtd(jC, 0L, null, null, null, yp5Var, null, 0L, null, null, null, 0L, mneVar, null, 61406);
                xtd xtdVar2 = null;
                int i3 = 14;
                int i4 = i00Var.i(new k68(strB, new zte(xtdVar, xtdVar2, i3)));
                try {
                    i00Var.f(afc.q(R.string.auth_terms_of_service, l46Var2));
                    i00Var.h(i4);
                    l46Var2.r(false);
                    l46Var2.f0(17085651);
                    int iK2 = i00Var.k(new xtd(y72.b(((m82) l46Var2.k(pr4Var)).o, 0.48f), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534));
                    try {
                        i00Var.f(" ");
                        i00Var.f(afc.q(R.string.auth_text_and, l46Var2));
                        i00Var.f(" ");
                        i00Var.h(iK2);
                        l46Var2.r(false);
                        l46Var2.f0(17092521);
                        int i5 = i00Var.i(new k68(z5c.y(), new zte(new xtd(p8c.q(l46Var2).c(), 0L, null, null, null, p8c.q(l46Var2).a.f, null, 0L, null, null, null, 0L, mneVar, null, 61406), xtdVar2, i3)));
                        try {
                            i00Var.f(afc.q(R.string.auth_privacy_policy, l46Var2));
                            i00Var.h(i5);
                            l46Var2.r(false);
                            k00 k00VarL = i00Var.l();
                            l46Var2.r(false);
                            nte.c(k00VarL, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, mue.a((mue) l46Var2.k(nte.a), 0L, w6c.l(12), null, null, 0L, null, 0, w6c.l(14), null, null, 16646141), l46Var, 0, 0, 262142);
                            l46Var2 = l46Var;
                            l46Var2.r(true);
                            j09Var2 = g09Var;
                        } catch (Throwable th) {
                            i00Var.h(i5);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        i00Var.h(iK2);
                        throw th2;
                    }
                } catch (Throwable th3) {
                    i00Var.h(i4);
                    throw th3;
                }
            } catch (Throwable th4) {
                i00Var.h(iK);
                throw th4;
            }
        } else {
            l46Var2.Z();
            j09Var2 = j09Var;
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new kg(z, j09Var2, a26Var, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:251:0x0613  */
    /* JADX WARN: Code duplicated, block: B:254:0x0653  */
    /* JADX WARN: Code duplicated, block: B:255:0x0665  */
    /* JADX WARN: Code duplicated, block: B:258:0x067e  */
    /* JADX WARN: Code duplicated, block: B:259:0x0689  */
    /* JADX WARN: Code duplicated, block: B:263:0x069c  */
    /* JADX WARN: Code duplicated, block: B:268:0x06a5  */
    /* JADX WARN: Code duplicated, block: B:271:0x06a9  */
    /* JADX WARN: Code duplicated, block: B:274:0x06b2  */
    /* JADX WARN: Code duplicated, block: B:277:0x06cd  */
    /* JADX WARN: Code duplicated, block: B:278:0x06d0  */
    /* JADX WARN: Code duplicated, block: B:281:0x06da  */
    /* JADX WARN: Code duplicated, block: B:282:0x06dd  */
    /* JADX WARN: Code duplicated, block: B:284:0x06e1  */
    /* JADX WARN: Code duplicated, block: B:288:0x06eb  */
    /* JADX WARN: Code duplicated, block: B:290:0x06ef  */
    /* JADX WARN: Code duplicated, block: B:292:0x0710  */
    /* JADX WARN: Code duplicated, block: B:294:0x0713  */
    /* JADX WARN: Code duplicated, block: B:295:0x0725  */
    /* JADX WARN: Code duplicated, block: B:298:0x075e  */
    /* JADX WARN: Code duplicated, block: B:299:0x0764  */
    /* JADX WARN: Code duplicated, block: B:302:0x078a  */
    /* JADX WARN: Code duplicated, block: B:304:0x07bb  */
    /* JADX WARN: Code duplicated, block: B:307:0x07c3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:310:0x07c9  */
    /* JADX WARN: Code duplicated, block: B:312:0x083e  */
    /* JADX WARN: Instruction removed from duplicated block: B:302:0x078a, please report this as an issue */
    public static final void d(j09 j09Var, String str, final x6d x6dVar, final n26 n26Var, x16 x16Var, final dd2 dd2Var, l46 l46Var, int i) {
        int i2;
        l46 l46Var2;
        Object obj;
        Object objB;
        Object obj2;
        int i3;
        x6d x6dVar2;
        pad padVar;
        boolean z;
        int i4;
        boolean zG;
        int i5;
        Object objR;
        e89 e89Var;
        boolean z2;
        o6a o6aVar;
        mmb mmbVar;
        pad padVar2;
        e89 e89Var2;
        oad oadVar;
        boolean z3;
        cv6 cv6VarJ0;
        ii6 ii6VarB0;
        boolean z4;
        ii6 ii6Var;
        g09 g09Var;
        boolean z5;
        final bad badVar;
        pad padVar3;
        e89 e89Var3;
        cv6 cv6Var;
        j09 j09Var2;
        cv6 cv6Var2;
        j09 j09Var3;
        boolean z6;
        long jR;
        final jef jefVar;
        j09 j09VarW;
        Object obj3;
        boolean zI;
        Object objR2;
        x16 x16Var2;
        j09 j09VarP;
        j09 j09VarJ;
        l46 l46Var3 = l46Var;
        j09Var.getClass();
        str.getClass();
        x6dVar.getClass();
        String str2 = x6dVar.b;
        xad xadVar = x6dVar.a;
        x16Var.getClass();
        l46Var3.h0(-1858747669);
        if ((i & 6) == 0) {
            i2 = (l46Var3.g(j09Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= l46Var3.g(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? l46Var3.g(x6dVar) : l46Var3.i(x6dVar) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if ((i & 3072) == 0) {
            i2 |= l46Var3.i(n26Var) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        }
        if ((i & 24576) == 0) {
            i2 |= l46Var3.i(x16Var) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE;
        }
        if ((196608 & i) == 0) {
            i2 |= l46Var3.i(dd2Var) ? 131072 : 65536;
        }
        if (l46Var3.W(i2 & 1, (74899 & i2) != 74898)) {
            final l26 l26Var = (l26) l46Var3.k(vgb.a);
            Object objR3 = l46Var3.R();
            i8c i8cVar = sf2.a;
            if (objR3 == i8cVar) {
                objR3 = q1c.f(Boolean.FALSE);
                l46Var3.p0(objR3);
            }
            final e89 e89Var4 = (e89) objR3;
            int iIndexOf = x6dVar.c.indexOf(x6dVar.d);
            Object objR4 = l46Var3.R();
            if (objR4 == i8cVar) {
                objR4 = af1.E(l46Var3);
                l46Var3.p0(objR4);
            }
            final aw2 aw2Var = (aw2) objR4;
            Context context = (Context) l46Var3.k(uq.b);
            x48 x48Var = (x48) l46Var3.k(cb8.a);
            nfc nfcVarB = kr7.b(l46Var3);
            boolean zG2 = l46Var3.g(null) | l46Var3.g(nfcVarB);
            Object objR5 = l46Var3.R();
            if (zG2 || objR5 == i8cVar) {
                objR5 = nfcVarB.b(job.a.b(wt6.class), null, null);
                l46Var3.p0(objR5);
            }
            wt6 wt6Var = (wt6) objR5;
            boolean zG3 = l46Var3.g(context) | l46Var3.g(wt6Var);
            Object objR6 = l46Var3.R();
            Object obj4 = objR6;
            if (zG3 || objR6 == i8cVar) {
                wt6Var.getClass();
                context.getClass();
                List listH = t72.H(gbd.e);
                ArrayList arrayList = new ArrayList();
                Iterator it = listH.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    Iterator it2 = it;
                    if (((gbd) next) != gbd.b) {
                        arrayList.add(next);
                    }
                    it = it2;
                }
                l46Var3.p0(arrayList);
                obj4 = arrayList;
            }
            final List list = (List) obj4;
            list.getClass();
            x48Var.getClass();
            boolean zE = l46Var3.e(xadVar.ordinal()) | l46Var3.g(str2) | l46Var3.g(list) | l46Var3.e(iIndexOf) | l46Var3.g(x48Var);
            Object objR7 = l46Var3.R();
            if (zE || objR7 == i8cVar) {
                wad wadVar = wad.a;
                objR7 = new vad(x6dVar, list, iIndexOf, ((a58) x48Var.k()).i.compareTo(g48.e) >= 0);
                l46Var3.p0(objR7);
            }
            final vad vadVar = (vad) objR7;
            Object[] objArr = {x48Var, xadVar, str2, list};
            int i6 = i2 & 896;
            boolean zI2 = l46Var3.i(x48Var) | (i6 == 256 || ((i2 & 512) != 0 && l46Var3.i(x6dVar))) | l46Var3.i(list);
            Object objR8 = l46Var3.R();
            if (zI2 || objR8 == i8cVar) {
                objR8 = new mdf(x48Var, x6dVar, list, null);
                l46Var3.p0(objR8);
            }
            af1.r(objArr, (l26) objR8, l46Var3);
            mmb mmbVar2 = new mmb();
            e89 e89VarI = q1c.i(new i2e(22, vadVar, mmbVar2), l46Var3);
            Object objR9 = l46Var3.R();
            if (objR9 == i8cVar) {
                objR9 = new w77(e89VarI, 10);
                l46Var3.p0(objR9);
            }
            mmbVar2.element = zz8.f(6, 0, (a26) objR9, l46Var3);
            boolean z7 = i6 == 256 || ((i2 & 512) != 0 && l46Var3.i(x6dVar));
            Object objR10 = l46Var3.R();
            if (z7 || objR10 == i8cVar) {
                objR10 = new h2e(17, x6dVar);
                l46Var3.p0(objR10);
            }
            final cs3 cs3VarB = ay9.b(iIndexOf, 0, 2, (x16) objR10, l46Var3);
            final int iO = cs3VarB.o();
            Object objR11 = l46Var3.R();
            if (objR11 == i8cVar) {
                objR11 = new pad();
                l46Var3.p0(objR11);
            }
            final pad padVar4 = (pad) objR11;
            Object objR12 = l46Var3.R();
            if (objR12 == i8cVar) {
                objR12 = new pad();
                l46Var3.p0(objR12);
            }
            pad padVar5 = (pad) objR12;
            int i7 = i2 >> 3;
            int i8 = i2;
            int i9 = (i7 & 14) | 448 | (i7 & 112);
            padVar5.getClass();
            Context context2 = (Context) l46Var3.k(uq.b);
            x48 x48Var2 = (x48) l46Var3.k(cb8.a);
            Object objR13 = l46Var3.R();
            if (objR13 == i8cVar) {
                objR13 = af1.E(l46Var3);
                l46Var3.p0(objR13);
            }
            aw2 aw2Var2 = (aw2) objR13;
            nfc nfcVarB2 = kr7.b(l46Var3);
            boolean zG4 = l46Var3.g(null) | l46Var3.g(nfcVarB2);
            Object objR14 = l46Var3.R();
            if (zG4 || objR14 == i8cVar) {
                obj = null;
                objB = nfcVarB2.b(job.a.b(wt6.class), null, null);
                l46Var3.p0(objB);
            } else {
                objB = objR14;
                obj = null;
            }
            wt6 wt6Var2 = (wt6) objB;
            nfc nfcVarB3 = kr7.b(l46Var3);
            boolean zG5 = l46Var3.g(obj) | l46Var3.g(nfcVarB3);
            Object objR15 = l46Var3.R();
            if (zG5 || objR15 == i8cVar) {
                obj2 = null;
                objR15 = nfcVarB3.b(job.a.b(fcb.class), null, null);
                l46Var3.p0(objR15);
            } else {
                obj2 = null;
            }
            fcb fcbVar = (fcb) objR15;
            nfc nfcVarB4 = kr7.b(l46Var3);
            boolean zG6 = l46Var3.g(obj2) | l46Var3.g(nfcVarB4);
            Object objR16 = l46Var3.R();
            if (zG6 || objR16 == i8cVar) {
                objR16 = nfcVarB4.b(job.a.b(t7.class), null, null);
                l46Var3.p0(objR16);
            }
            t7 t7Var = (t7) objR16;
            Object[] objArr2 = {xadVar, str2};
            vea veaVar = p7a.a;
            Object objR17 = l46Var3.R();
            if (objR17 == i8cVar) {
                objR17 = new gpc(29);
                l46Var3.p0(objR17);
            }
            e89 e89VarH = vfh.H(objArr2, veaVar, (x16) objR17, l46Var3);
            mmb mmbVar3 = new mmb();
            yk8 yk8VarP = qn4.P(new af(3), new up(mmbVar3, 7), l46Var3);
            boolean zI3 = l46Var3.i(yk8VarP);
            Object objR18 = l46Var3.R();
            if (zI3 || objR18 == i8cVar) {
                i3 = 4;
                objR18 = new u11(yk8VarP, i3);
                l46Var3.p0(objR18);
            } else {
                i3 = 4;
            }
            e89 e89VarI2 = q1c.i((x16) objR18, l46Var3);
            boolean zG7 = l46Var3.g(str2) | ((((i9 & 14) ^ 6) > i3 && l46Var3.g(str)) || (i9 & 6) == i3) | l46Var3.g(context2) | l46Var3.e(xadVar.ordinal()) | l46Var3.g(wt6Var2) | l46Var3.g(t7Var) | l46Var3.g(fcbVar) | l46Var3.g(aw2Var2) | l46Var3.g(e89VarH);
            Object objR19 = l46Var3.R();
            if (zG7 || objR19 == i8cVar) {
                bad badVar2 = new bad(context2, str, x6dVar, padVar5, wt6Var2, new hla(25, t7Var), new yv9(0, fcbVar, fcb.class, "doPayOrShare", "doPayOrShare()V", 0, 12), new xfc(e89VarI2, 7), e89VarH, aw2Var2);
                x6dVar2 = x6dVar;
                padVar = padVar5;
                l46Var3.p0(badVar2);
                objR19 = badVar2;
            } else {
                x6dVar2 = x6dVar;
                padVar = padVar5;
            }
            bad badVar3 = (bad) objR19;
            mmbVar3.element = badVar3;
            if (badVar3 == null) {
                pa7.g0("controller");
                throw null;
            }
            af1.g(badVar3, new up(mmbVar3, 8), l46Var3);
            Object obj5 = mmbVar3.element;
            if (obj5 == null) {
                pa7.g0("controller");
                throw null;
            }
            af1.h(x48Var2, (bad) obj5, new h6b(21, (Object) 
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0441: INVOKE 
                  (r6v6 'x48Var2' x48)
                  (wrap bad:0x0438: CHECK_CAST (bad) (r3v12 'obj5' java.lang.Object))
                  (wrap h6b:0x043e: CONSTRUCTOR (21 int), (wrap java.lang.Object:?: CAST (java.lang.Object) (r31v0 ?? I:??[OBJECT, ARRAY])), (r14v12 'mmbVar3' mmb) A[MD:(int, java.lang.Object, java.lang.Object):void (m), WRAPPED] (LINE:1087) call: h6b.<init>(int, java.lang.Object, java.lang.Object):void type: CONSTRUCTOR)
                  (r13v0 'l46Var3' l46)
                 STATIC call: af1.h(java.lang.Object, java.lang.Object, a26, l46):void A[MD:(java.lang.Object, java.lang.Object, a26, l46):void (m)] (LINE:1090) in method: scc.d(j09, java.lang.String, x6d, n26, x16, dd2, l46, int):void, file: classes.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:284)
                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:632)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:295)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:284)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:268)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:160)
                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:104)
                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
                	at jadx.core.ProcessClass.process(ProcessClass.java:89)
                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:127)
                	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
                	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r31v0 ??
                	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                */
            /*
                Method dump skipped, instruction units count: 2177
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.scc.d(j09, java.lang.String, x6d, n26, x16, dd2, l46, int):void");
        }

        public static final void e(x6d x6dVar, bad badVar, o6a o6aVar) {
            w7d w7dVarA;
            e8d e8dVar = (e8d) x6dVar.c.get(o6aVar.a());
            if (!(o6aVar instanceof m6a)) {
                if (!(o6aVar instanceof n6a)) {
                    ap.c();
                    return;
                }
                n6a n6aVar = (n6a) o6aVar;
                int i = n6aVar.a;
                gbd gbdVar = n6aVar.b;
                badVar.getClass();
                e8dVar.getClass();
                if (badVar.f()) {
                    return;
                }
                badVar.o(true);
                w6c.y(uyb.n(x6dVar, e8dVar, w6c.v(((n6a) o6aVar).b)));
                ynb.V(badVar.j, null, null, new aad(badVar, e8dVar, gbdVar, i, null), 3);
                return;
            }
            int i2 = ((m6a) o6aVar).a;
            badVar.getClass();
            e8dVar.getClass();
            if (badVar.f() || (w7dVarA = badVar.d.a(i2)) == null) {
                return;
            }
            badVar.o(true);
            w6c.y(uyb.n(x6dVar, e8dVar, "save"));
            if (Build.VERSION.SDK_INT >= 29 || bp.c(badVar.a, "android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
                ynb.V(badVar.j, null, null, new y9d(badVar, w7dVarA, null), 3);
                return;
            }
            w7dVarA.close();
            badVar.i.setValue(new l7a(new m7a(e8dVar), null));
            badVar.o(false);
            badVar.h.invoke();
        }

        public static ys0 f(fsf fsfVar) {
            long jI = 0;
            String strF = "";
            String strF2 = "";
            while (true) {
                int iG = fsfVar.g();
                if (iG == 0) {
                    return new ys0(strF, strF2, jI);
                }
                int i = iG >>> 3;
                int i2 = iG & 7;
                switch (i) {
                    case 1:
                        fsf.b(i, 0, i2);
                        fsfVar.i();
                        break;
                    case 2:
                        fsf.b(i, 0, i2);
                        jI = fsfVar.i();
                        break;
                    case 3:
                        fsf.b(i, 0, i2);
                        fsfVar.i();
                        break;
                    case 4:
                        fsf.b(i, 2, i2);
                        strF = fsfVar.f();
                        break;
                    case 5:
                        fsf.b(i, 0, i2);
                        fsfVar.i();
                        break;
                    case 6:
                        fsf.b(i, 2, i2);
                        strF2 = fsfVar.f();
                        break;
                    case 7:
                        fsf.b(i, 0, i2);
                        fsfVar.i();
                        break;
                    case 8:
                        fsf.b(i, 2, i2);
                        fsfVar.f();
                        break;
                    default:
                        fsfVar.j(i2);
                        break;
                }
            }
        }

        public static yx4 g(fsf fsfVar) {
            while (true) {
                int iG = fsfVar.g();
                if (iG == 0) {
                    return new yx4(13);
                }
                int i = iG >>> 3;
                int i2 = iG & 7;
                if (i == 1) {
                    fsf.b(i, 2, i2);
                    fsfVar.f();
                } else if (i == 2) {
                    fsf.b(i, 2, i2);
                    fsfVar.f();
                } else if (i == 3) {
                    fsf.b(i, 0, i2);
                    fsfVar.i();
                } else if (i == 4) {
                    fsf.b(i, 2, i2);
                    fsfVar.d();
                } else if (i != 6) {
                    fsfVar.j(i2);
                } else {
                    fsf.b(i, 2, i2);
                    fsf fsfVarE = fsfVar.e();
                    while (true) {
                        int iG2 = fsfVarE.g();
                        if (iG2 != 0) {
                            int i3 = iG2 >>> 3;
                            int i4 = iG2 & 7;
                            if (i3 != 1) {
                                fsfVarE.j(i4);
                            } else {
                                fsf.b(i3, 2, i4);
                                fsfVarE.d();
                            }
                        }
                    }
                }
            }
        }

        public static void h(fsf fsfVar, HashMap map) {
            int i;
            int i2;
            fsf fsfVar2;
            int i3 = 0;
            fze fzeVar = null;
            int i4 = 0;
            while (true) {
                int iG = fsfVar.g();
                if (iG == 0) {
                    if (fzeVar != null) {
                        map.put(Integer.valueOf(i4), fzeVar);
                        return;
                    }
                    return;
                }
                int i5 = iG >>> 3;
                int i6 = iG & 7;
                int i7 = 1;
                if (i5 == 1) {
                    i = i3;
                    fsf.b(i5, i, i6);
                    i4 = (int) fsfVar.i();
                } else if (i5 != 2) {
                    fsfVar.j(i6);
                    i = i3;
                } else {
                    fsf.b(i5, 2, i6);
                    fsf fsfVarE = fsfVar.e();
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    ArrayList arrayList4 = new ArrayList();
                    ArrayList arrayList5 = new ArrayList();
                    int i8 = i3;
                    String strF = "";
                    while (true) {
                        int iG2 = fsfVarE.g();
                        if (iG2 != 0) {
                            int i9 = iG2 >>> 3;
                            int i10 = iG2 & 7;
                            switch (i9) {
                                case 1:
                                    i2 = i3;
                                    fsfVar2 = fsfVarE;
                                    fsf.b(i9, i2, i10);
                                    i8 = (int) fsfVar2.i();
                                    break;
                                case 2:
                                    fsfVar2 = fsfVarE;
                                    fsf.b(i9, 2, i10);
                                    strF = fsfVar2.f();
                                    i2 = 0;
                                    break;
                                case 3:
                                    fsf.b(i9, 2, i10);
                                    fsf fsfVarE2 = fsfVarE.e();
                                    String strF2 = "";
                                    long jI = 0;
                                    while (true) {
                                        int iG3 = fsfVarE2.g();
                                        if (iG3 == 0) {
                                            fsfVar2 = fsfVarE;
                                            arrayList.add(new tob(strF2, jI));
                                            i2 = 0;
                                        } else {
                                            int i11 = iG3 >>> 3;
                                            fsf fsfVar3 = fsfVarE;
                                            int i12 = iG3 & 7;
                                            if (i11 == i7) {
                                                fsf.b(i11, 2, i12);
                                                strF2 = fsfVarE2.f();
                                            } else if (i11 != 2) {
                                                fsfVarE2.j(i12);
                                            } else {
                                                fsf.b(i11, 0, i12);
                                                jI = fsfVarE2.i();
                                            }
                                            fsfVarE = fsfVar3;
                                            i7 = 1;
                                        }
                                        break;
                                    }
                                    break;
                                case 4:
                                    fsf.b(i9, 2, i10);
                                    arrayList4.add(f(fsfVarE.e()));
                                    fsfVar2 = fsfVarE;
                                    i2 = 0;
                                    break;
                                case 5:
                                    fsf.b(i9, 2, i10);
                                    arrayList5.add(g(fsfVarE.e()));
                                    fsfVar2 = fsfVarE;
                                    i2 = 0;
                                    break;
                                case 6:
                                    fsf.b(i9, i3, i10);
                                    fsfVarE.i();
                                    i2 = i3;
                                    fsfVar2 = fsfVarE;
                                    break;
                                case 7:
                                    fsf.b(i9, 2, i10);
                                    arrayList2.add(fsfVarE.f());
                                    fsfVar2 = fsfVarE;
                                    i2 = 0;
                                    break;
                                case 8:
                                    fsf.b(i9, i3, i10);
                                    fsfVarE.i();
                                    i2 = i3;
                                    fsfVar2 = fsfVarE;
                                    break;
                                case 9:
                                    fsf.b(i9, 2, i10);
                                    arrayList3.add(fsfVarE.f());
                                    fsfVar2 = fsfVarE;
                                    i2 = 0;
                                    break;
                                default:
                                    fsfVarE.j(i10);
                                    fsfVar2 = fsfVarE;
                                    i2 = 0;
                                    break;
                            }
                            i3 = i2;
                            fsfVarE = fsfVar2;
                            i7 = 1;
                        } else {
                            i = i3;
                            fzeVar = new fze(i8, strF, arrayList, arrayList2, arrayList3, arrayList4, arrayList5);
                        }
                    }
                }
                i3 = i;
            }
        }

        public static final hkb i(i09 i09Var, boolean z, boolean z2) {
            if (!i09Var.a.Y) {
                return hkb.e;
            }
            if (z) {
                return vd0.p0(i09Var, 8).E1();
            }
            yf9 yf9VarP0 = vd0.p0(i09Var, 8);
            return vd0.S(yf9VarP0).M(yf9VarP0, z2);
        }

        public static final x48 j(View view) {
            view.getClass();
            while (view != null) {
                Object tag = view.getTag(R.id.view_tree_lifecycle_owner);
                x48 x48Var = tag instanceof x48 ? (x48) tag : null;
                if (x48Var != null) {
                    return x48Var;
                }
                Object objG = jcc.g(view);
                view = objG instanceof View ? (View) objG : null;
            }
            return null;
        }

        public static final void k(wwc wwcVar) {
            vd0.s0(wwcVar).U();
        }

        public static final rcc l(l46 l46Var) {
            l46Var.f0(1967007413);
            Object[] objArr = new Object[0];
            Object objR = l46Var.R();
            if (objR == sf2.a) {
                objR = new zib(24);
                l46Var.p0(objR);
            }
            rcc rccVar = (rcc) vfh.J(objArr, rcc.e, (x16) objR, l46Var, 384);
            rccVar.c = (ucc) l46Var.k(wcc.a);
            l46Var.r(false);
            return rccVar;
        }

        public static final boolean m(List list) {
            list.getClass();
            k9b k9bVar = s74.a;
            if (((StillCaptureFlashStopRepeatingQuirk) s74.a().b(StillCaptureFlashStopRepeatingQuirk.class)) == null) {
                return false;
            }
            Iterator it = list.iterator();
            boolean z = false;
            boolean z2 = false;
            while (it.hasNext()) {
                ctb ctbVar = (ctb) it.next();
                ttb ttbVar = ctbVar.e;
                if (ttbVar != null && ttbVar.a == 2) {
                    z = true;
                }
                CaptureRequest.Key key = CaptureRequest.CONTROL_AE_MODE;
                key.getClass();
                Integer num = (Integer) ctbVar.b.get(key);
                if ((num != null && num.intValue() == 2) || (num != null && num.intValue() == 3)) {
                    z2 = true;
                }
            }
            return z && z2;
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        public static final Object n(zn2 zn2Var) {
            Object obj;
            pv2 context = zn2Var.getContext();
            tq.v(context);
            xn2 xn2VarD = k99.D(zn2Var);
            z94 z94Var = xn2VarD instanceof z94 ? (z94) xn2VarD : null;
            bw2 bw2Var = bw2.a;
            wef wefVar = wef.a;
            if (z94Var == null) {
                obj = wefVar;
            } else {
                sv2 sv2Var = z94Var.d;
                if (aa4.c(sv2Var, context)) {
                    z94Var.f = wefVar;
                    z94Var.c = 1;
                    sv2Var.a1(context, z94Var);
                } else {
                    ldg ldgVar = new ldg(ldg.c);
                    pv2 pv2VarP0 = context.p0(ldgVar);
                    z94Var.f = wefVar;
                    z94Var.c = 1;
                    sv2Var.a1(pv2VarP0, z94Var);
                    if (ldgVar.b) {
                        vz4 vz4VarA = gwe.a();
                        ad0 ad0Var = vz4VarA.e;
                        if (!(ad0Var != null ? ad0Var.isEmpty() : true)) {
                            if (vz4VarA.c >= 4294967296L) {
                                z94Var.f = wefVar;
                                z94Var.c = 1;
                                vz4VarA.e1(z94Var);
                            } else {
                                vz4VarA.f1(true);
                                try {
                                    z94Var.run();
                                    do {
                                    } while (vz4VarA.h1());
                                } catch (Throwable th) {
                                    try {
                                        z94Var.h(th);
                                    } catch (Throwable th2) {
                                        vz4VarA.d1(true);
                                        throw th2;
                                    }
                                }
                                vz4VarA.d1(true);
                            }
                        }
                        obj = wefVar;
                    }
                }
                obj = bw2Var;
            }
            return obj == bw2Var ? obj : wefVar;
        }

        public static String o(d1h d1hVar) {
            StringBuilder sb = new StringBuilder(d1hVar.d());
            for (int i = 0; i < d1hVar.d(); i++) {
                byte bA = d1hVar.a(i);
                if (bA == 34) {
                    sb.append("\\\"");
                } else if (bA == 39) {
                    sb.append("\\'");
                } else if (bA != 92) {
                    switch (bA) {
                        case 7:
                            sb.append("\\a");
                            break;
                        case 8:
                            sb.append("\\b");
                            break;
                        case 9:
                            sb.append("\\t");
                            break;
                        case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                            sb.append("\\n");
                            break;
                        case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                            sb.append("\\v");
                            break;
                        case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                            sb.append("\\f");
                            break;
                        case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                            sb.append("\\r");
                            break;
                        default:
                            if (bA < 32 || bA > 126) {
                                sb.append('\\');
                                sb.append((char) (((bA >>> 6) & 3) + 48));
                                sb.append((char) (((bA >>> 3) & 7) + 48));
                                sb.append((char) ((bA & 7) + 48));
                            } else {
                                sb.append((char) bA);
                            }
                            break;
                    }
                } else {
                    sb.append("\\\\");
                }
            }
            return sb.toString();
        }
    }
