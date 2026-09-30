package defpackage;

import ai.askquin.R;
import ai.askquin.data.InAppMessageUiModel;
import android.app.NotificationChannel;
import android.content.Context;
import android.content.res.Resources;
import android.media.AudioManager;
import android.os.Build;
import android.os.Looper;
import android.view.View;
import androidx.camera.camera2.compat.quirk.ExtraSupportedSurfaceCombinationsQuirk;
import androidx.compose.foundation.b;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.ui.node.LayoutNode;
import com.adjust.sdk.Constants;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.io.InterruptedIOException;
import java.net.ConnectException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.DecimalStyle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import tech.chatmind.api.InvitationInfo;
import tech.chatmind.api.TarotCardType;
import tech.chatmind.api.message.model.InAppMessageType;
import tech.chatmind.api.personality.PersonalitySection;
import tech.chatmind.api.seasonal.model.SolarTerm;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class kj0 {
    public static AudioManager a;
    public static final z4 b;
    public static final dd2 c;
    public static final dd2 d = new dd2(new hd2(1), false, -2145794324);
    public static final dd2 e = new dd2(new yd2(3), false, 682632771);
    public static final dd2 f = new dd2(new de2(23), false, 493543542);
    public static final n82 g = n82.y;
    public static final float h = 1.0f;
    public static final kz7[] i = new kz7[0];
    public static final n82 j;
    public static final n82 k;
    public static final float l;
    public static final n82 m;
    public static final float n;
    public static final n82 o;
    public static final ju p;

    static {
        int i2 = 0;
        b = new z4(i2);
        c = new dd2(new hd2(i2), false, -1282818314);
        n82 n82Var = n82.v;
        j = n82Var;
        k = n82Var;
        l = 20.0f;
        m = n82.z;
        n = 40.0f;
        o = n82.w;
        p = new ju(1022);
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0073  */
    /* JADX WARN: Code duplicated, block: B:46:0x0077  */
    /* JADX WARN: Code duplicated, block: B:48:0x007a  */
    /* JADX WARN: Code duplicated, block: B:50:0x0082  */
    /* JADX WARN: Code duplicated, block: B:51:0x0085  */
    /* JADX WARN: Code duplicated, block: B:55:0x008d  */
    /* JADX WARN: Code duplicated, block: B:57:0x0095  */
    /* JADX WARN: Code duplicated, block: B:58:0x0098  */
    /* JADX WARN: Code duplicated, block: B:60:0x009c  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:64:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:70:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:72:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:73:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:76:0x0122  */
    /* JADX WARN: Code duplicated, block: B:77:0x0128  */
    /* JADX WARN: Code duplicated, block: B:79:0x017d  */
    /* JADX WARN: Code duplicated, block: B:82:0x0188  */
    /* JADX WARN: Code duplicated, block: B:84:? A[RETURN, SYNTHETIC] */
    public static final void A(final c31 c31Var, final int i2, final String str, final lx0 lx0Var, float f2, float f3, final x16 x16Var, l46 l46Var, final int i3, final int i4) {
        int i5;
        float f4;
        int i6;
        float f5;
        int i7;
        x16 x16Var2;
        boolean z;
        final float f6;
        final float f7;
        ojb ojbVarV;
        float f8;
        float f9;
        int i8;
        l46Var.h0(19304314);
        if ((i3 & 6) == 0) {
            i5 = (l46Var.g(c31Var) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= l46Var.e(i2) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i5 |= l46Var.g(str) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if ((i3 & 3072) == 0) {
            i5 |= l46Var.g(lx0Var) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        }
        int i9 = i4 & 8;
        if (i9 == 0) {
            if ((i3 & 24576) == 0) {
                f4 = f2;
                i5 |= l46Var.d(f4) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE;
            }
            i6 = i4 & 16;
            if (i6 != 0) {
                if ((196608 & i3) == 0) {
                    f5 = f3;
                    if (l46Var.d(f5)) {
                        i7 = 131072;
                    } else {
                        i7 = 65536;
                    }
                    i5 |= i7;
                }
                if ((1572864 & i3) == 0) {
                    x16Var2 = x16Var;
                    if (l46Var.i(x16Var2)) {
                        i8 = 1048576;
                    } else {
                        i8 = 524288;
                    }
                    i5 |= i8;
                } else {
                    x16Var2 = x16Var;
                }
                if ((599187 & i5) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (l46Var.W(i5 & 1, z)) {
                    if (i9 != 0) {
                        f8 = 0.0f;
                    } else {
                        f8 = f4;
                    }
                    if (i6 != 0) {
                        f9 = 0.0f;
                    } else {
                        f9 = f5;
                    }
                    g09 g09Var = g09.a;
                    j09 j09VarD0 = ynb.d0(f8, 0.0f, f9, 0.0f, 10, c31Var.a(g09Var, lx0Var));
                    float f10 = f9;
                    float f11 = f8;
                    pr4 pr4Var = l8b.a;
                    long j2 = ((e8b) l46Var.k(pr4Var)).m;
                    y6c y6cVar = a7c.a;
                    j09 j09VarC = b.c(oa7.E(db6.w(tm7.o(j09VarD0, j2, y6cVar), 0.0f, ((e8b) l46Var.k(pr4Var)).A, y6cVar), y6cVar), false, null, null, x16Var2, 15);
                    xn8 xn8VarC = s21.c(ndb.b, false);
                    int iHashCode = Long.hashCode(l46Var.T);
                    u8a u8aVarM = l46Var.m();
                    j09 j09VarJ = m93.J(l46Var, j09VarC);
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
                    int i10 = i5 >> 3;
                    gu6.b(od4.A(i2, i10 & 14, l46Var), str, pa7.p(androidx.compose.foundation.layout.b.l(g09Var, 32.0f), 0.6f), ((e8b) l46Var.k(pr4Var)).t, l46Var, (i10 & 112) | 392, 0);
                    l46Var.r(true);
                    f6 = f11;
                    f7 = f10;
                } else {
                    l46Var.Z();
                    f6 = f4;
                    f7 = f5;
                }
                ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    ojbVarV.d = new l26() { // from class: rt5
                        @Override // defpackage.l26
                        public final Object z(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            kj0.A(c31Var, i2, str, lx0Var, f6, f7, x16Var, (l46) obj, k99.P(i3 | 1), i4);
                            return wef.a;
                        }
                    };
                }
            }
            i5 |= 196608;
            f5 = f3;
            if ((1572864 & i3) == 0) {
                x16Var2 = x16Var;
                if (l46Var.i(x16Var2)) {
                    i8 = 1048576;
                } else {
                    i8 = 524288;
                }
                i5 |= i8;
            } else {
                x16Var2 = x16Var;
            }
            if ((599187 & i5) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (l46Var.W(i5 & 1, z)) {
                if (i9 != 0) {
                    f8 = 0.0f;
                } else {
                    f8 = f4;
                }
                if (i6 != 0) {
                    f9 = 0.0f;
                } else {
                    f9 = f5;
                }
                g09 g09Var2 = g09.a;
                j09 j09VarD1 = ynb.d0(f8, 0.0f, f9, 0.0f, 10, c31Var.a(g09Var2, lx0Var));
                float f12 = f9;
                float f13 = f8;
                pr4 pr4Var2 = l8b.a;
                long j3 = ((e8b) l46Var.k(pr4Var2)).m;
                y6c y6cVar2 = a7c.a;
                j09 j09VarC2 = b.c(oa7.E(db6.w(tm7.o(j09VarD1, j3, y6cVar2), 0.0f, ((e8b) l46Var.k(pr4Var2)).A, y6cVar2), y6cVar2), false, null, null, x16Var2, 15);
                xn8 xn8VarC2 = s21.c(ndb.b, false);
                int iHashCode2 = Long.hashCode(l46Var.T);
                u8a u8aVarM2 = l46Var.m();
                j09 j09VarJ2 = m93.J(l46Var, j09VarC2);
                lf2.q.getClass();
                l46Var.j0();
                if (l46Var.S) {
                    l46Var.l(LayoutNode.h1);
                } else {
                    l46Var.s0();
                }
                dec.l(hj6.z, l46Var, xn8VarC2);
                dec.l(hj6.y, l46Var, u8aVarM2);
                dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode2));
                dec.k(l46Var);
                dec.l(hj6.x, l46Var, j09VarJ2);
                int i11 = i5 >> 3;
                gu6.b(od4.A(i2, i11 & 14, l46Var), str, pa7.p(androidx.compose.foundation.layout.b.l(g09Var2, 32.0f), 0.6f), ((e8b) l46Var.k(pr4Var2)).t, l46Var, (i11 & 112) | 392, 0);
                l46Var.r(true);
                f6 = f13;
                f7 = f12;
            } else {
                l46Var.Z();
                f6 = f4;
                f7 = f5;
            }
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new l26() { // from class: rt5
                    @Override // defpackage.l26
                    public final Object z(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        kj0.A(c31Var, i2, str, lx0Var, f6, f7, x16Var, (l46) obj, k99.P(i3 | 1), i4);
                        return wef.a;
                    }
                };
            }
        }
        i5 |= 24576;
        f4 = f2;
        i6 = i4 & 16;
        if (i6 != 0) {
            if ((196608 & i3) == 0) {
                f5 = f3;
                if (l46Var.d(f5)) {
                    i7 = 131072;
                } else {
                    i7 = 65536;
                }
                i5 |= i7;
            }
            if ((1572864 & i3) == 0) {
                x16Var2 = x16Var;
                if (l46Var.i(x16Var2)) {
                    i8 = 1048576;
                } else {
                    i8 = 524288;
                }
                i5 |= i8;
            } else {
                x16Var2 = x16Var;
            }
            if ((599187 & i5) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (l46Var.W(i5 & 1, z)) {
                if (i9 != 0) {
                    f8 = 0.0f;
                } else {
                    f8 = f4;
                }
                if (i6 != 0) {
                    f9 = 0.0f;
                } else {
                    f9 = f5;
                }
                g09 g09Var3 = g09.a;
                j09 j09VarD2 = ynb.d0(f8, 0.0f, f9, 0.0f, 10, c31Var.a(g09Var3, lx0Var));
                float f14 = f9;
                float f15 = f8;
                pr4 pr4Var3 = l8b.a;
                long j4 = ((e8b) l46Var.k(pr4Var3)).m;
                y6c y6cVar3 = a7c.a;
                j09 j09VarC3 = b.c(oa7.E(db6.w(tm7.o(j09VarD2, j4, y6cVar3), 0.0f, ((e8b) l46Var.k(pr4Var3)).A, y6cVar3), y6cVar3), false, null, null, x16Var2, 15);
                xn8 xn8VarC3 = s21.c(ndb.b, false);
                int iHashCode3 = Long.hashCode(l46Var.T);
                u8a u8aVarM3 = l46Var.m();
                j09 j09VarJ3 = m93.J(l46Var, j09VarC3);
                lf2.q.getClass();
                l46Var.j0();
                if (l46Var.S) {
                    l46Var.l(LayoutNode.h1);
                } else {
                    l46Var.s0();
                }
                dec.l(hj6.z, l46Var, xn8VarC3);
                dec.l(hj6.y, l46Var, u8aVarM3);
                dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode3));
                dec.k(l46Var);
                dec.l(hj6.x, l46Var, j09VarJ3);
                int i12 = i5 >> 3;
                gu6.b(od4.A(i2, i12 & 14, l46Var), str, pa7.p(androidx.compose.foundation.layout.b.l(g09Var3, 32.0f), 0.6f), ((e8b) l46Var.k(pr4Var3)).t, l46Var, (i12 & 112) | 392, 0);
                l46Var.r(true);
                f6 = f15;
                f7 = f14;
            } else {
                l46Var.Z();
                f6 = f4;
                f7 = f5;
            }
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new l26() { // from class: rt5
                    @Override // defpackage.l26
                    public final Object z(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        kj0.A(c31Var, i2, str, lx0Var, f6, f7, x16Var, (l46) obj, k99.P(i3 | 1), i4);
                        return wef.a;
                    }
                };
            }
        }
        i5 |= 196608;
        f5 = f3;
        if ((1572864 & i3) == 0) {
            x16Var2 = x16Var;
            if (l46Var.i(x16Var2)) {
                i8 = 1048576;
            } else {
                i8 = 524288;
            }
            i5 |= i8;
        } else {
            x16Var2 = x16Var;
        }
        if ((599187 & i5) != 599186) {
            z = true;
        } else {
            z = false;
        }
        if (l46Var.W(i5 & 1, z)) {
            if (i9 != 0) {
                f8 = 0.0f;
            } else {
                f8 = f4;
            }
            if (i6 != 0) {
                f9 = 0.0f;
            } else {
                f9 = f5;
            }
            g09 g09Var4 = g09.a;
            j09 j09VarD3 = ynb.d0(f8, 0.0f, f9, 0.0f, 10, c31Var.a(g09Var4, lx0Var));
            float f16 = f9;
            float f17 = f8;
            pr4 pr4Var4 = l8b.a;
            long j5 = ((e8b) l46Var.k(pr4Var4)).m;
            y6c y6cVar4 = a7c.a;
            j09 j09VarC4 = b.c(oa7.E(db6.w(tm7.o(j09VarD3, j5, y6cVar4), 0.0f, ((e8b) l46Var.k(pr4Var4)).A, y6cVar4), y6cVar4), false, null, null, x16Var2, 15);
            xn8 xn8VarC4 = s21.c(ndb.b, false);
            int iHashCode4 = Long.hashCode(l46Var.T);
            u8a u8aVarM4 = l46Var.m();
            j09 j09VarJ4 = m93.J(l46Var, j09VarC4);
            lf2.q.getClass();
            l46Var.j0();
            if (l46Var.S) {
                l46Var.l(LayoutNode.h1);
            } else {
                l46Var.s0();
            }
            dec.l(hj6.z, l46Var, xn8VarC4);
            dec.l(hj6.y, l46Var, u8aVarM4);
            dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode4));
            dec.k(l46Var);
            dec.l(hj6.x, l46Var, j09VarJ4);
            int i13 = i5 >> 3;
            gu6.b(od4.A(i2, i13 & 14, l46Var), str, pa7.p(androidx.compose.foundation.layout.b.l(g09Var4, 32.0f), 0.6f), ((e8b) l46Var.k(pr4Var4)).t, l46Var, (i13 & 112) | 392, 0);
            l46Var.r(true);
            f6 = f17;
            f7 = f16;
        } else {
            l46Var.Z();
            f6 = f4;
            f7 = f5;
        }
        ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new l26() { // from class: rt5
                @Override // defpackage.l26
                public final Object z(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    kj0.A(c31Var, i2, str, lx0Var, f6, f7, x16Var, (l46) obj, k99.P(i3 | 1), i4);
                    return wef.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x003f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:16:? A[LOOP:0: B:7:0x002d->B:16:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:6:0x0019  */
    /* JADX WARN: Code duplicated, block: B:9:0x0033  */
    public static boolean A0() {
        String upperCase;
        Iterator it;
        String str = Build.MANUFACTURER;
        str.getClass();
        if (str.equalsIgnoreCase("Samsung")) {
            String str2 = Build.MODEL;
            str2.getClass();
            upperCase = str2.toUpperCase(Locale.ROOT);
            upperCase.getClass();
            it = ExtraSupportedSurfaceCombinationsQuirk.d.iterator();
            while (it.hasNext()) {
                if (c5e.C(upperCase, (String) it.next(), false)) {
                    return true;
                }
            }
        } else {
            String str3 = Build.BRAND;
            str3.getClass();
            if (str3.equalsIgnoreCase("Samsung")) {
                String str4 = Build.MODEL;
                str4.getClass();
                upperCase = str4.toUpperCase(Locale.ROOT);
                upperCase.getClass();
                it = ExtraSupportedSurfaceCombinationsQuirk.d.iterator();
                while (it.hasNext()) {
                    if (c5e.C(upperCase, (String) it.next(), false)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final void B(j09 j09Var, boolean z, iwa iwaVar, x16 x16Var, a26 a26Var, l46 l46Var, int i2) {
        x16Var.getClass();
        a26Var.getClass();
        l46Var.h0(874792170);
        int i3 = i2 | (l46Var.g(j09Var) ? 4 : 2) | (l46Var.i(iwaVar) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var.i(a26Var) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE);
        if (l46Var.W(i3 & 1, (i3 & 8323) != 8322)) {
            bzd.d(j09Var, a7c.b(32.0f), z5c.p(((e8b) l46Var.k(l8b.a)).a, 0L, l46Var, 24576, 14), z5c.q(62), null, af1.b0(1992899548, new w7(27, iwaVar, a26Var), l46Var), l46Var, (i3 & 14) | 196608, 16);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new l30(j09Var, z, iwaVar, x16Var, a26Var, i2);
        }
    }

    public static final long B0(long j2) {
        return ll2.a(kl2.j(j2), kl2.h(j2), kl2.i(j2), kl2.g(j2));
    }

    public static final void C(String str, x16 x16Var, l46 l46Var, int i2) {
        l46Var.h0(-1984687853);
        int i3 = i2 | (l46Var.g(str) ? 4 : 2) | (l46Var.i(x16Var) ? 32 : 16);
        if (l46Var.W(i3 & 1, (i3 & 19) != 18)) {
            int i4 = i3 << 3;
            c8b.i(androidx.compose.foundation.layout.b.b(0.0f, 56.0f, androidx.compose.foundation.layout.b.c(g09.a, 1.0f), 1), str, null, null, 0L, 0.0f, false, null, bx5.c(l46Var), false, null, null, x16Var, l46Var, (i4 & 112) | 6, i4 & 896, 3836);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new mb(str, x16Var, i2, 4);
        }
    }

    public static final void D(final n07 n07Var, boolean z, int i2, a26 a26Var, a26 a26Var2, final Integer num, l46 l46Var, int i3) {
        int i4;
        final int i5;
        l46Var.h0(833171858);
        if ((i3 & 6) == 0) {
            i4 = ((i3 & 8) == 0 ? l46Var.g(n07Var) : l46Var.i(n07Var) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= l46Var.h(z) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i5 = i2;
            i4 |= l46Var.e(i5) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        } else {
            i5 = i2;
        }
        if ((i3 & 3072) == 0) {
            i4 |= l46Var.i(a26Var) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        }
        if ((i3 & 24576) == 0) {
            i4 |= l46Var.i(a26Var2) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE;
        }
        if ((196608 & i3) == 0) {
            i4 |= l46Var.g(num) ? 131072 : 65536;
        }
        if (l46Var.W(i4 & 1, (74899 & i4) != 74898)) {
            final long j2 = bx5.b(l46Var).a;
            j09 j09VarR = o8c.r(((i4 << 3) & 896) | 6, l46Var, androidx.compose.foundation.layout.b.b(0.0f, 56.0f, androidx.compose.foundation.layout.b.c(g09.a, 1.0f), 1), z);
            boolean z2 = (n07Var == null || z) ? false : true;
            bx9 bx9Var = v51.a;
            u51 u51VarA = v51.a(y72.j, j2, 0L, 0L, l46Var, 12);
            q11 q11VarB = x57.b(j2, 1.0f);
            x4d x4dVar = eze.a(l46Var).a.a;
            boolean z3 = ((i4 & 14) == 4 || ((i4 & 8) != 0 && l46Var.i(n07Var))) | ((57344 & i4) == 16384) | ((i4 & 7168) == 2048);
            Object objR = l46Var.R();
            if (z3 || objR == sf2.a) {
                objR = new n25(a26Var2, n07Var, a26Var, 3);
                l46Var.p0(objR);
            }
            cgg.a((x16) objR, j09VarR, z2, x4dVar, u51VarA, null, q11VarB, null, af1.b0(981281154, new n26() { // from class: ot5
                @Override // defpackage.n26
                public final Object m(Object obj, Object obj2, Object obj3) {
                    String strR;
                    l46 l46Var2 = (l46) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((u7c) obj).getClass();
                    if (l46Var2.W(iIntValue & 1, (iIntValue & 17) != 16)) {
                        c92 c92VarA = a92.a(xc0.e, ndb.Z, l46Var2, 54);
                        int iHashCode = Long.hashCode(l46Var2.T);
                        u8a u8aVarM = l46Var2.m();
                        j09 j09VarJ = m93.J(l46Var2, g09.a);
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
                        n07 n07Var2 = n07Var;
                        if (n07Var2 == null) {
                            l46Var2.f0(564193539);
                            l46Var2.r(false);
                            strR = null;
                        } else {
                            l46Var2.f0(564193540);
                            strR = afc.r(i5, new Object[]{n07Var2.y()}, l46Var2);
                            l46Var2.r(false);
                        }
                        if (strR == null) {
                            strR = "";
                        }
                        mue mueVar = pue.a;
                        nte.b(strR, null, 0L, 0L, null, null, 0L, null, new jme(3), 0L, 0, false, 0, 0, null, pue.a(l46Var2), l46Var2, 0, 0, 130046);
                        l46 l46Var3 = l46Var2;
                        String strB = n07Var2 != null ? n07Var2.b() : null;
                        Integer num2 = num;
                        if (num2 == null || strB == null || strB.length() == 0) {
                            l46Var3.f0(564647318);
                            l46Var3.r(false);
                        } else {
                            l46Var3.f0(564470246);
                            nte.b(afc.r(num2.intValue(), new Object[]{strB}, l46Var3), null, j2, 0L, null, null, 0L, null, new jme(3), 0L, 0, false, 0, 0, null, pue.j(l46Var3), l46Var3, 0, 0, 130042);
                            l46Var3 = l46Var3;
                            l46Var3.r(false);
                        }
                        l46Var3.r(true);
                    } else {
                        l46Var2.Z();
                    }
                    return wef.a;
                }
            }, l46Var), l46Var, 805502976, 384);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new jv1(n07Var, z, i2, a26Var, a26Var2, num, i3);
        }
    }

    public static final void E(int i2, l46 l46Var) {
        l46 l46Var2 = l46Var;
        l46Var2.h0(1988458516);
        int i3 = 0;
        if (l46Var2.W(i2 & 1, i2 != 0)) {
            j09 j09VarB0 = ynb.b0(32.0f, 0.0f, androidx.compose.foundation.layout.b.c(g09.a, 1.0f), 2);
            c92 c92VarA = a92.a(new uc0(8.0f, true, new qc0(i3)), ndb.Y, l46Var2, 6);
            int iHashCode = Long.hashCode(l46Var2.T);
            u8a u8aVarM = l46Var2.m();
            j09 j09VarJ = m93.J(l46Var2, j09VarB0);
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
            String strQ = afc.q(R.string.four_seasons_purchase_notes_title, l46Var2);
            mue mueVar = pue.a;
            nte.b(strQ, null, ((e8b) l46Var2.k(l8b.a)).s, 0L, ar5.c, null, 0L, null, null, 0L, 0, false, 0, 0, null, pue.f(l46Var2), l46Var, 1572864, 0, 131002);
            l46Var2 = l46Var;
            l46Var2.f0(-1688402198);
            int i4 = 0;
            for (Object obj : t72.I(Integer.valueOf(R.string.four_seasons_purchase_note_1), Integer.valueOf(R.string.four_seasons_purchase_note_2), Integer.valueOf(R.string.four_seasons_purchase_note_3), Integer.valueOf(R.string.four_seasons_purchase_note_4))) {
                int i5 = i4 + 1;
                if (i4 < 0) {
                    t72.Z();
                    throw null;
                }
                String str = i5 + ". " + afc.q(((Number) obj).intValue(), l46Var2);
                mue mueVar2 = pue.a;
                nte.b(str, null, ((e8b) l46Var2.k(l8b.a)).t, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, pue.g(l46Var2), l46Var, 0, 0, 131066);
                l46Var2 = l46Var;
                i4 = i5;
            }
            l46Var2.r(false);
            l46Var2.r(true);
        } else {
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new qv2(i2, 28);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x011a  */
    /* JADX WARN: Code duplicated, block: B:103:0x0123  */
    /* JADX WARN: Code duplicated, block: B:105:0x012a  */
    /* JADX WARN: Code duplicated, block: B:114:0x0140 A[PHI: r3 r5 r6 r8 r10 r14
  0x0140: PHI (r3v26 int) = (r3v18 int), (r3v27 int), (r3v28 int) binds: [B:128:0x017a, B:112:0x013c, B:113:0x013e] A[DONT_GENERATE, DONT_INLINE]
  0x0140: PHI (r5v19 java.lang.String) = (r5v5 java.lang.String), (r5v2 java.lang.String), (r5v2 java.lang.String) binds: [B:128:0x017a, B:112:0x013c, B:113:0x013e] A[DONT_GENERATE, DONT_INLINE]
  0x0140: PHI (r6v16 java.lang.String) = (r6v5 java.lang.String), (r6v2 java.lang.String), (r6v2 java.lang.String) binds: [B:128:0x017a, B:112:0x013c, B:113:0x013e] A[DONT_GENERATE, DONT_INLINE]
  0x0140: PHI (r8v9 boolean) = (r8v5 boolean), (r8v2 boolean), (r8v2 boolean) binds: [B:128:0x017a, B:112:0x013c, B:113:0x013e] A[DONT_GENERATE, DONT_INLINE]
  0x0140: PHI (r10v8 boolean) = (r10v5 boolean), (r10v3 boolean), (r10v3 boolean) binds: [B:128:0x017a, B:112:0x013c, B:113:0x013e] A[DONT_GENERATE, DONT_INLINE]
  0x0140: PHI (r14v10 s84) = (r14v5 s84), (r14v3 s84), (r14v3 s84) binds: [B:128:0x017a, B:112:0x013c, B:113:0x013e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:116:0x014c  */
    /* JADX WARN: Code duplicated, block: B:118:0x0150  */
    /* JADX WARN: Code duplicated, block: B:121:0x015e  */
    /* JADX WARN: Code duplicated, block: B:123:0x016b  */
    /* JADX WARN: Code duplicated, block: B:125:0x016f  */
    /* JADX WARN: Code duplicated, block: B:127:0x0173  */
    /* JADX WARN: Code duplicated, block: B:129:0x017c  */
    /* JADX WARN: Code duplicated, block: B:131:0x0184  */
    /* JADX WARN: Code duplicated, block: B:135:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:137:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:140:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:143:0x020d  */
    /* JADX WARN: Code duplicated, block: B:146:0x021d  */
    /* JADX WARN: Code duplicated, block: B:148:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x0092  */
    /* JADX WARN: Code duplicated, block: B:55:0x0096  */
    /* JADX WARN: Code duplicated, block: B:57:0x0099  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:70:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:71:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:75:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:76:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:80:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:81:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:85:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:87:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:88:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:92:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:94:0x0103  */
    /* JADX WARN: Code duplicated, block: B:95:0x0106  */
    /* JADX WARN: Code duplicated, block: B:99:0x0117  */
    public static final void F(final String str, final l26 l26Var, String str2, String str3, boolean z, boolean z2, s84 s84Var, x16 x16Var, final x16 x16Var2, final x16 x16Var3, l46 l46Var, int i2, int i3) {
        int i4;
        String strQ;
        String strQ2;
        boolean z3;
        int i5;
        boolean z4;
        int i6;
        int i7;
        s84 s84Var2;
        int i8;
        int i9;
        int i10;
        boolean z5;
        boolean z6;
        String str4;
        String str5;
        boolean z7;
        boolean z8;
        x16 x16Var4;
        s84 s84Var3;
        ojb ojbVarV;
        Object objR;
        x16 x16Var5;
        final boolean zF;
        y6c y6cVarB;
        int i11;
        int i12;
        int i13;
        int i14;
        byte b2;
        byte b3;
        l26Var.getClass();
        x16Var3.getClass();
        l46Var.h0(976988231);
        if ((i2 & 6) == 0) {
            i4 = (l46Var.g(str) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= l46Var.i(l26Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            if ((i3 & 4) == 0) {
                strQ = str2;
                if (l46Var.g(strQ)) {
                    i14 = 256;
                }
                i4 |= i14;
            } else {
                strQ = str2;
            }
            i14 = UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
            i4 |= i14;
        } else {
            strQ = str2;
        }
        if ((i2 & 3072) == 0) {
            if ((i3 & 8) == 0) {
                strQ2 = str3;
                if (l46Var.g(strQ2)) {
                    i13 = 2048;
                }
                i4 |= i13;
            } else {
                strQ2 = str3;
            }
            i13 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            i4 |= i13;
        } else {
            strQ2 = str3;
        }
        int i15 = i3 & 16;
        if (i15 == 0) {
            if ((i2 & 24576) == 0) {
                z3 = z;
                i4 |= l46Var.h(z3) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE;
            }
            i5 = i3 & 32;
            if (i5 != 0) {
                if ((196608 & i2) == 0) {
                    z4 = z2;
                    if (l46Var.h(z4)) {
                        i6 = 131072;
                    } else {
                        i6 = 65536;
                    }
                    i4 |= i6;
                }
                i7 = i3 & 64;
                if (i7 != 0) {
                    if ((1572864 & i2) == 0) {
                        s84Var2 = s84Var;
                        if (l46Var.g(s84Var2)) {
                            i8 = 1048576;
                        } else {
                            i8 = 524288;
                        }
                        i4 |= i8;
                    }
                    i9 = i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                    if (i9 != 0) {
                        i4 |= 12582912;
                    } else if ((i2 & 12582912) == 0) {
                        if (l46Var.i(x16Var)) {
                            i10 = 8388608;
                        } else {
                            i10 = 4194304;
                        }
                        i4 |= i10;
                    }
                    if ((i2 & 100663296) == 0) {
                        if (l46Var.i(x16Var2)) {
                            i12 = 67108864;
                        } else {
                            i12 = 33554432;
                        }
                        i4 |= i12;
                    }
                    if ((i2 & 805306368) == 0) {
                        if (l46Var.i(x16Var3)) {
                            i11 = 536870912;
                        } else {
                            i11 = 268435456;
                        }
                        i4 |= i11;
                    }
                    z5 = false;
                    b3 = 0;
                    b2 = 0;
                    if ((i4 & 306783379) != 306783378) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    if (l46Var.W(i4 & 1, z6)) {
                        l46Var.b0();
                        if ((i2 & 1) != 0 || l46Var.C()) {
                            if ((i3 & 4) != 0) {
                                i4 &= -897;
                                strQ = afc.q(R.string.button_continue, l46Var);
                            }
                            if ((i3 & 8) != 0) {
                                strQ2 = afc.q(R.string.button_cancel, l46Var);
                                i4 &= -7169;
                            }
                            if (i15 != 0) {
                                z3 = true;
                            }
                            if (i5 != 0) {
                                z4 = true;
                            }
                            if (i7 != 0) {
                                s84Var2 = new s84(z5, (boolean) (b2 == true ? 1 : 0), 4);
                            }
                            if (i9 != 0) {
                                objR = l46Var.R();
                                if (objR == sf2.a) {
                                    objR = new i7b(b3 == true ? 1 : 0);
                                    l46Var.p0(objR);
                                }
                                x16Var5 = (x16) objR;
                            }
                            final String str6 = strQ;
                            final String str7 = strQ2;
                            final boolean z9 = z3;
                            final boolean z10 = z4;
                            s84 s84Var4 = s84Var2;
                            l46Var.s();
                            zF = k8b.f((e8b) l46Var.k(l8b.a));
                            if (zF) {
                                l46Var.f0(-1712128979);
                                y6cVarB = eze.a(l46Var).a.j;
                                l46Var.r(false);
                            } else {
                                l46Var.f0(-1712128512);
                                l46Var.r(false);
                                y6cVarB = a7c.b(24.0f);
                            }
                            final y6c y6cVar = y6cVarB;
                            final float f2 = zF ? 24.0f : 32.0f;
                            final gh6 gh6VarW0 = w0(l46Var);
                            x16 x16Var6 = x16Var5;
                            t72.b(x16Var6, s84Var4, af1.b0(1044811230, new l26() { // from class: j7b
                                /* JADX WARN: Multi-variable type inference failed */
                                /* JADX WARN: Type inference failed for: r0v13 */
                                /* JADX WARN: Type inference failed for: r0v2 */
                                /* JADX WARN: Type inference failed for: r0v3, types: [boolean, int] */
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
                                @Override // defpackage.l26
                                public final Object z(Object obj, Object obj2) {
                                    he2 he2Var;
                                    he2 he2Var2;
                                    he2 he2Var3;
                                    he2 he2Var4;
                                    ov7 ov7Var;
                                    ?? r0;
                                    g09 g09Var;
                                    pr4 pr4Var;
                                    jx0 jx0Var;
                                    l46 l46Var2;
                                    y6c y6cVar2;
                                    y6c y6cVar3;
                                    x16 x16Var7;
                                    float f3;
                                    j09 j09VarA;
                                    l46 l46Var3 = (l46) obj;
                                    int iIntValue = ((Integer) obj2).intValue();
                                    if (l46Var3.W(iIntValue & 1, (iIntValue & 3) != 2)) {
                                        g09 g09Var2 = g09.a;
                                        j09 j09VarE = oa7.E(androidx.compose.foundation.layout.b.c(g09Var2, 1.0f), y6cVar);
                                        pr4 pr4Var2 = o82.a;
                                        j09 j09VarA0 = ynb.a0(tm7.o(j09VarE, ((m82) l46Var3.k(pr4Var2)).p, g21.f), f2, 24.0f);
                                        jx0 jx0Var2 = ndb.Z;
                                        c92 c92VarA = a92.a(xc0.c, jx0Var2, l46Var3, 48);
                                        int iHashCode = Long.hashCode(l46Var3.T);
                                        u8a u8aVarM = l46Var3.m();
                                        j09 j09VarJ = m93.J(l46Var3, j09VarA0);
                                        lf2.q.getClass();
                                        l46Var3.j0();
                                        boolean z11 = l46Var3.S;
                                        ov7 ov7Var2 = LayoutNode.h1;
                                        if (z11) {
                                            l46Var3.l(ov7Var2);
                                        } else {
                                            l46Var3.s0();
                                        }
                                        he2 he2Var5 = hj6.z;
                                        dec.l(he2Var5, l46Var3, c92VarA);
                                        he2 he2Var6 = hj6.y;
                                        dec.l(he2Var6, l46Var3, u8aVarM);
                                        Integer numValueOf = Integer.valueOf(iHashCode);
                                        he2 he2Var7 = hj6.X;
                                        dec.l(he2Var7, l46Var3, numValueOf);
                                        dec.k(l46Var3);
                                        he2 he2Var8 = hj6.x;
                                        dec.l(he2Var8, l46Var3, j09VarJ);
                                        String str8 = str;
                                        if (str8 == null) {
                                            l46Var3.f0(1527905729);
                                            l46Var3.r(false);
                                            r0 = 0;
                                            g09Var = g09Var2;
                                            pr4Var = pr4Var2;
                                            jx0Var = jx0Var2;
                                            he2Var = he2Var6;
                                            he2Var2 = he2Var8;
                                            he2Var3 = he2Var7;
                                            he2Var4 = he2Var5;
                                            ov7Var = ov7Var2;
                                            l46Var2 = l46Var3;
                                        } else {
                                            l46Var3.f0(1527905730);
                                            he2Var = he2Var6;
                                            he2Var2 = he2Var8;
                                            he2Var3 = he2Var7;
                                            he2Var4 = he2Var5;
                                            ov7Var = ov7Var2;
                                            r0 = 0;
                                            g09Var = g09Var2;
                                            pr4Var = pr4Var2;
                                            jx0Var = jx0Var2;
                                            nte.b(str8, null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mue.a((mue) l46Var3.k(nte.a), 0L, w6c.l(23), new ar5(700), cr5.h, 0L, null, 0, w6c.l(32), null, null, 16646105), l46Var3, 0, 0, 131070);
                                            l46 l46Var4 = l46Var3;
                                            l46Var4.r(false);
                                            l46Var2 = l46Var4;
                                        }
                                        g09 g09Var3 = g09Var;
                                        o5c.f(l46Var2, androidx.compose.foundation.layout.b.d(g09Var3, 12.0f));
                                        l26Var.z(l46Var2, Integer.valueOf((int) r0));
                                        o5c.f(l46Var2, androidx.compose.foundation.layout.b.d(g09Var3, 20.0f));
                                        if (zF) {
                                            l46Var2.f0(-1613267814);
                                            y6cVar2 = eze.a(l46Var2).a.j;
                                        } else {
                                            l46Var2.f0(-1613266759);
                                            y6cVar2 = ((s5d) l46Var2.k(u5d.a)).d;
                                        }
                                        l46Var2.r(r0);
                                        y6c y6cVar4 = y6cVar2;
                                        j09 j09VarF = urg.F(new mq6(jx0Var), ia7.a);
                                        t7c t7cVarA = s7c.a(new uc0(8.0f, true, new qc0(r0)), ndb.z, l46Var2, 54);
                                        int iHashCode2 = Long.hashCode(l46Var2.T);
                                        u8a u8aVarM2 = l46Var2.m();
                                        j09 j09VarJ2 = m93.J(l46Var2, j09VarF);
                                        l46Var2.j0();
                                        if (l46Var2.S) {
                                            l46Var2.l(ov7Var);
                                        } else {
                                            l46Var2.s0();
                                        }
                                        dec.l(he2Var4, l46Var2, t7cVarA);
                                        dec.l(he2Var, l46Var2, u8aVarM2);
                                        ib8.s(iHashCode2, l46Var2, he2Var3, l46Var2);
                                        dec.l(he2Var2, l46Var2, j09VarJ2);
                                        x16 x16Var8 = x16Var2;
                                        if (x16Var8 != null) {
                                            l46Var2.f0(-324977123);
                                            if (1.0f <= 0.0d) {
                                                g37.a("invalid weight; must be greater than zero");
                                            }
                                            j09 j09VarD = androidx.compose.foundation.layout.b.b(0.0f, 48.0f, new jw7(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), 1).D(androidx.compose.foundation.layout.b.b);
                                            bx9 bx9VarQ = ynb.q(12.0f, 0.0f, 2);
                                            bx9 bx9Var = v51.a;
                                            x16Var7 = x16Var8;
                                            f3 = 1.0f;
                                            cgg.k(x16Var7, j09VarD, z10, y6cVar4, v51.g(0L, ((m82) l46Var2.k(pr4Var)).o, l46Var2, 13), null, bx9VarQ, af1.b0(366212805, new ob0(str7, 19), l46Var2), l46Var2, 817889280, 352);
                                            y6cVar3 = y6cVar4;
                                            l46Var2.r(r0);
                                        } else {
                                            y6cVar3 = y6cVar4;
                                            x16Var7 = x16Var8;
                                            f3 = 1.0f;
                                            l46Var2.f0(-324401174);
                                            l46Var2.r(r0);
                                        }
                                        if (x16Var7 != null) {
                                            if (f3 <= 0.0d) {
                                                g37.a("invalid weight; must be greater than zero");
                                            }
                                            j09VarA = androidx.compose.foundation.layout.b.b(0.0f, 48.0f, new jw7(f3 > Float.MAX_VALUE ? Float.MAX_VALUE : f3, true), 1).D(androidx.compose.foundation.layout.b.b);
                                        } else {
                                            j09VarA = androidx.compose.foundation.layout.b.a(g09Var3, 180.0f, 48.0f);
                                        }
                                        bx9 bx9Var2 = v51.a;
                                        u51 u51VarA = v51.a(eze.a(l46Var2).b.z(l46Var2), eze.a(l46Var2).b.A(l46Var2), 0L, 0L, l46Var2, 12);
                                        bx9 bx9Var3 = new bx9(12.0f, 4.0f, 12.0f, 4.0f);
                                        gh6 gh6Var = gh6VarW0;
                                        boolean zI = l46Var2.i(gh6Var);
                                        x16 x16Var9 = x16Var3;
                                        boolean zG = zI | l46Var2.g(x16Var9);
                                        Object objR2 = l46Var2.R();
                                        if (zG || objR2 == sf2.a) {
                                            objR2 = new sj2(gh6Var, x16Var9, 5);
                                            l46Var2.p0(objR2);
                                        }
                                        cgg.a((x16) objR2, j09VarA, z9, y6cVar3, u51VarA, null, null, bx9Var3, af1.b0(1124396200, new ob0(str6, 20), l46Var2), l46Var2, 817889280, 352);
                                        l46Var2.r(true);
                                        l46Var2.r(true);
                                    } else {
                                        l46Var3.Z();
                                    }
                                    return wef.a;
                                }
                            }, l46Var), l46Var, ((i4 >> 15) & 112) | ((i4 >> 21) & 14) | 384, 0);
                            s84Var2 = s84Var4;
                            x16Var4 = x16Var6;
                            z8 = z10;
                            z7 = z9;
                            str5 = str7;
                            str4 = str6;
                        } else {
                            l46Var.Z();
                            if ((i3 & 4) != 0) {
                                i4 &= -897;
                            }
                            if ((i3 & 8) != 0) {
                                i4 &= -7169;
                            }
                        }
                        x16Var5 = x16Var;
                        final String str8 = strQ;
                        final String str9 = strQ2;
                        final boolean z11 = z3;
                        final boolean z12 = z4;
                        s84 s84Var5 = s84Var2;
                        l46Var.s();
                        zF = k8b.f((e8b) l46Var.k(l8b.a));
                        if (zF) {
                            l46Var.f0(-1712128979);
                            y6cVarB = eze.a(l46Var).a.j;
                            l46Var.r(false);
                        } else {
                            l46Var.f0(-1712128512);
                            l46Var.r(false);
                            y6cVarB = a7c.b(24.0f);
                        }
                        final y6c y6cVar2 = y6cVarB;
                        final float f3 = zF ? 24.0f : 32.0f;
                        final gh6 gh6VarW1 = w0(l46Var);
                        x16 x16Var7 = x16Var5;
                        t72.b(x16Var7, s84Var5, af1.b0(1044811230, new l26() { // from class: j7b
                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Type inference failed for: r0v13 */
                            /* JADX WARN: Type inference failed for: r0v2 */
                            /* JADX WARN: Type inference failed for: r0v3, types: [boolean, int] */
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
                            @Override // defpackage.l26
                            public final Object z(Object obj, Object obj2) {
                                he2 he2Var;
                                he2 he2Var2;
                                he2 he2Var3;
                                he2 he2Var4;
                                ov7 ov7Var;
                                ?? r0;
                                g09 g09Var;
                                pr4 pr4Var;
                                jx0 jx0Var;
                                l46 l46Var2;
                                y6c y6cVar3;
                                y6c y6cVar4;
                                x16 x16Var8;
                                float f4;
                                j09 j09VarA;
                                l46 l46Var3 = (l46) obj;
                                int iIntValue = ((Integer) obj2).intValue();
                                if (l46Var3.W(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    g09 g09Var2 = g09.a;
                                    j09 j09VarE = oa7.E(androidx.compose.foundation.layout.b.c(g09Var2, 1.0f), y6cVar2);
                                    pr4 pr4Var2 = o82.a;
                                    j09 j09VarA0 = ynb.a0(tm7.o(j09VarE, ((m82) l46Var3.k(pr4Var2)).p, g21.f), f3, 24.0f);
                                    jx0 jx0Var2 = ndb.Z;
                                    c92 c92VarA = a92.a(xc0.c, jx0Var2, l46Var3, 48);
                                    int iHashCode = Long.hashCode(l46Var3.T);
                                    u8a u8aVarM = l46Var3.m();
                                    j09 j09VarJ = m93.J(l46Var3, j09VarA0);
                                    lf2.q.getClass();
                                    l46Var3.j0();
                                    boolean z13 = l46Var3.S;
                                    ov7 ov7Var2 = LayoutNode.h1;
                                    if (z13) {
                                        l46Var3.l(ov7Var2);
                                    } else {
                                        l46Var3.s0();
                                    }
                                    he2 he2Var5 = hj6.z;
                                    dec.l(he2Var5, l46Var3, c92VarA);
                                    he2 he2Var6 = hj6.y;
                                    dec.l(he2Var6, l46Var3, u8aVarM);
                                    Integer numValueOf = Integer.valueOf(iHashCode);
                                    he2 he2Var7 = hj6.X;
                                    dec.l(he2Var7, l46Var3, numValueOf);
                                    dec.k(l46Var3);
                                    he2 he2Var8 = hj6.x;
                                    dec.l(he2Var8, l46Var3, j09VarJ);
                                    String str10 = str;
                                    if (str10 == null) {
                                        l46Var3.f0(1527905729);
                                        l46Var3.r(false);
                                        r0 = 0;
                                        g09Var = g09Var2;
                                        pr4Var = pr4Var2;
                                        jx0Var = jx0Var2;
                                        he2Var = he2Var6;
                                        he2Var2 = he2Var8;
                                        he2Var3 = he2Var7;
                                        he2Var4 = he2Var5;
                                        ov7Var = ov7Var2;
                                        l46Var2 = l46Var3;
                                    } else {
                                        l46Var3.f0(1527905730);
                                        he2Var = he2Var6;
                                        he2Var2 = he2Var8;
                                        he2Var3 = he2Var7;
                                        he2Var4 = he2Var5;
                                        ov7Var = ov7Var2;
                                        r0 = 0;
                                        g09Var = g09Var2;
                                        pr4Var = pr4Var2;
                                        jx0Var = jx0Var2;
                                        nte.b(str10, null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mue.a((mue) l46Var3.k(nte.a), 0L, w6c.l(23), new ar5(700), cr5.h, 0L, null, 0, w6c.l(32), null, null, 16646105), l46Var3, 0, 0, 131070);
                                        l46 l46Var4 = l46Var3;
                                        l46Var4.r(false);
                                        l46Var2 = l46Var4;
                                    }
                                    g09 g09Var3 = g09Var;
                                    o5c.f(l46Var2, androidx.compose.foundation.layout.b.d(g09Var3, 12.0f));
                                    l26Var.z(l46Var2, Integer.valueOf((int) r0));
                                    o5c.f(l46Var2, androidx.compose.foundation.layout.b.d(g09Var3, 20.0f));
                                    if (zF) {
                                        l46Var2.f0(-1613267814);
                                        y6cVar3 = eze.a(l46Var2).a.j;
                                    } else {
                                        l46Var2.f0(-1613266759);
                                        y6cVar3 = ((s5d) l46Var2.k(u5d.a)).d;
                                    }
                                    l46Var2.r(r0);
                                    y6c y6cVar5 = y6cVar3;
                                    j09 j09VarF = urg.F(new mq6(jx0Var), ia7.a);
                                    t7c t7cVarA = s7c.a(new uc0(8.0f, true, new qc0(r0)), ndb.z, l46Var2, 54);
                                    int iHashCode2 = Long.hashCode(l46Var2.T);
                                    u8a u8aVarM2 = l46Var2.m();
                                    j09 j09VarJ2 = m93.J(l46Var2, j09VarF);
                                    l46Var2.j0();
                                    if (l46Var2.S) {
                                        l46Var2.l(ov7Var);
                                    } else {
                                        l46Var2.s0();
                                    }
                                    dec.l(he2Var4, l46Var2, t7cVarA);
                                    dec.l(he2Var, l46Var2, u8aVarM2);
                                    ib8.s(iHashCode2, l46Var2, he2Var3, l46Var2);
                                    dec.l(he2Var2, l46Var2, j09VarJ2);
                                    x16 x16Var9 = x16Var2;
                                    if (x16Var9 != null) {
                                        l46Var2.f0(-324977123);
                                        if (1.0f <= 0.0d) {
                                            g37.a("invalid weight; must be greater than zero");
                                        }
                                        j09 j09VarD = androidx.compose.foundation.layout.b.b(0.0f, 48.0f, new jw7(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), 1).D(androidx.compose.foundation.layout.b.b);
                                        bx9 bx9VarQ = ynb.q(12.0f, 0.0f, 2);
                                        bx9 bx9Var = v51.a;
                                        x16Var8 = x16Var9;
                                        f4 = 1.0f;
                                        cgg.k(x16Var8, j09VarD, z12, y6cVar5, v51.g(0L, ((m82) l46Var2.k(pr4Var)).o, l46Var2, 13), null, bx9VarQ, af1.b0(366212805, new ob0(str9, 19), l46Var2), l46Var2, 817889280, 352);
                                        y6cVar4 = y6cVar5;
                                        l46Var2.r(r0);
                                    } else {
                                        y6cVar4 = y6cVar5;
                                        x16Var8 = x16Var9;
                                        f4 = 1.0f;
                                        l46Var2.f0(-324401174);
                                        l46Var2.r(r0);
                                    }
                                    if (x16Var8 != null) {
                                        if (f4 <= 0.0d) {
                                            g37.a("invalid weight; must be greater than zero");
                                        }
                                        j09VarA = androidx.compose.foundation.layout.b.b(0.0f, 48.0f, new jw7(f4 > Float.MAX_VALUE ? Float.MAX_VALUE : f4, true), 1).D(androidx.compose.foundation.layout.b.b);
                                    } else {
                                        j09VarA = androidx.compose.foundation.layout.b.a(g09Var3, 180.0f, 48.0f);
                                    }
                                    bx9 bx9Var2 = v51.a;
                                    u51 u51VarA = v51.a(eze.a(l46Var2).b.z(l46Var2), eze.a(l46Var2).b.A(l46Var2), 0L, 0L, l46Var2, 12);
                                    bx9 bx9Var3 = new bx9(12.0f, 4.0f, 12.0f, 4.0f);
                                    gh6 gh6Var = gh6VarW1;
                                    boolean zI = l46Var2.i(gh6Var);
                                    x16 x16Var10 = x16Var3;
                                    boolean zG = zI | l46Var2.g(x16Var10);
                                    Object objR2 = l46Var2.R();
                                    if (zG || objR2 == sf2.a) {
                                        objR2 = new sj2(gh6Var, x16Var10, 5);
                                        l46Var2.p0(objR2);
                                    }
                                    cgg.a((x16) objR2, j09VarA, z11, y6cVar4, u51VarA, null, null, bx9Var3, af1.b0(1124396200, new ob0(str8, 20), l46Var2), l46Var2, 817889280, 352);
                                    l46Var2.r(true);
                                    l46Var2.r(true);
                                } else {
                                    l46Var3.Z();
                                }
                                return wef.a;
                            }
                        }, l46Var), l46Var, ((i4 >> 15) & 112) | ((i4 >> 21) & 14) | 384, 0);
                        s84Var2 = s84Var5;
                        x16Var4 = x16Var7;
                        z8 = z12;
                        z7 = z11;
                        str5 = str9;
                        str4 = str8;
                    } else {
                        l46Var.Z();
                        str4 = strQ;
                        str5 = strQ2;
                        z7 = z3;
                        z8 = z4;
                        x16Var4 = x16Var;
                    }
                    s84Var3 = s84Var2;
                    ojbVarV = l46Var.v();
                    if (ojbVarV != null) {
                        ojbVarV.d = new yk(str, l26Var, str4, str5, z7, z8, s84Var3, x16Var4, x16Var2, x16Var3, i2, i3);
                    }
                }
                i4 |= 1572864;
                s84Var2 = s84Var;
                i9 = i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                if (i9 != 0) {
                    i4 |= 12582912;
                } else if ((i2 & 12582912) == 0) {
                    if (l46Var.i(x16Var)) {
                        i10 = 8388608;
                    } else {
                        i10 = 4194304;
                    }
                    i4 |= i10;
                }
                if ((i2 & 100663296) == 0) {
                    if (l46Var.i(x16Var2)) {
                        i12 = 67108864;
                    } else {
                        i12 = 33554432;
                    }
                    i4 |= i12;
                }
                if ((i2 & 805306368) == 0) {
                    if (l46Var.i(x16Var3)) {
                        i11 = 536870912;
                    } else {
                        i11 = 268435456;
                    }
                    i4 |= i11;
                }
                z5 = false;
                b3 = 0;
                b2 = 0;
                if ((i4 & 306783379) != 306783378) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (l46Var.W(i4 & 1, z6)) {
                    l46Var.b0();
                    if ((i2 & 1) != 0) {
                        if ((i3 & 4) != 0) {
                            i4 &= -897;
                            strQ = afc.q(R.string.button_continue, l46Var);
                        }
                        if ((i3 & 8) != 0) {
                            strQ2 = afc.q(R.string.button_cancel, l46Var);
                            i4 &= -7169;
                        }
                        if (i15 != 0) {
                            z3 = true;
                        }
                        if (i5 != 0) {
                            z4 = true;
                        }
                        if (i7 != 0) {
                            s84Var2 = new s84(z5, (boolean) (b2 == true ? 1 : 0), 4);
                        }
                        if (i9 != 0) {
                            objR = l46Var.R();
                            if (objR == sf2.a) {
                                objR = new i7b(b3 == true ? 1 : 0);
                                l46Var.p0(objR);
                            }
                            x16Var5 = (x16) objR;
                        } else {
                            x16Var5 = x16Var;
                        }
                    } else {
                        if ((i3 & 4) != 0) {
                            i4 &= -897;
                            strQ = afc.q(R.string.button_continue, l46Var);
                        }
                        if ((i3 & 8) != 0) {
                            strQ2 = afc.q(R.string.button_cancel, l46Var);
                            i4 &= -7169;
                        }
                        if (i15 != 0) {
                            z3 = true;
                        }
                        if (i5 != 0) {
                            z4 = true;
                        }
                        if (i7 != 0) {
                            s84Var2 = new s84(z5, (boolean) (b2 == true ? 1 : 0), 4);
                        }
                        if (i9 != 0) {
                            objR = l46Var.R();
                            if (objR == sf2.a) {
                                objR = new i7b(b3 == true ? 1 : 0);
                                l46Var.p0(objR);
                            }
                            x16Var5 = (x16) objR;
                        } else {
                            x16Var5 = x16Var;
                        }
                    }
                    final String str10 = strQ;
                    final String str11 = strQ2;
                    final boolean z13 = z3;
                    final boolean z14 = z4;
                    s84 s84Var6 = s84Var2;
                    l46Var.s();
                    zF = k8b.f((e8b) l46Var.k(l8b.a));
                    if (zF) {
                        l46Var.f0(-1712128979);
                        y6cVarB = eze.a(l46Var).a.j;
                        l46Var.r(false);
                    } else {
                        l46Var.f0(-1712128512);
                        l46Var.r(false);
                        y6cVarB = a7c.b(24.0f);
                    }
                    final y6c y6cVar3 = y6cVarB;
                    final float f4 = zF ? 24.0f : 32.0f;
                    final gh6 gh6VarW2 = w0(l46Var);
                    x16 x16Var8 = x16Var5;
                    t72.b(x16Var8, s84Var6, af1.b0(1044811230, new l26() { // from class: j7b
                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Type inference failed for: r0v13 */
                        /* JADX WARN: Type inference failed for: r0v2 */
                        /* JADX WARN: Type inference failed for: r0v3, types: [boolean, int] */
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
                        @Override // defpackage.l26
                        public final Object z(Object obj, Object obj2) {
                            he2 he2Var;
                            he2 he2Var2;
                            he2 he2Var3;
                            he2 he2Var4;
                            ov7 ov7Var;
                            ?? r0;
                            g09 g09Var;
                            pr4 pr4Var;
                            jx0 jx0Var;
                            l46 l46Var2;
                            y6c y6cVar4;
                            y6c y6cVar5;
                            x16 x16Var9;
                            float f5;
                            j09 j09VarA;
                            l46 l46Var3 = (l46) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            if (l46Var3.W(iIntValue & 1, (iIntValue & 3) != 2)) {
                                g09 g09Var2 = g09.a;
                                j09 j09VarE = oa7.E(androidx.compose.foundation.layout.b.c(g09Var2, 1.0f), y6cVar3);
                                pr4 pr4Var2 = o82.a;
                                j09 j09VarA0 = ynb.a0(tm7.o(j09VarE, ((m82) l46Var3.k(pr4Var2)).p, g21.f), f4, 24.0f);
                                jx0 jx0Var2 = ndb.Z;
                                c92 c92VarA = a92.a(xc0.c, jx0Var2, l46Var3, 48);
                                int iHashCode = Long.hashCode(l46Var3.T);
                                u8a u8aVarM = l46Var3.m();
                                j09 j09VarJ = m93.J(l46Var3, j09VarA0);
                                lf2.q.getClass();
                                l46Var3.j0();
                                boolean z15 = l46Var3.S;
                                ov7 ov7Var2 = LayoutNode.h1;
                                if (z15) {
                                    l46Var3.l(ov7Var2);
                                } else {
                                    l46Var3.s0();
                                }
                                he2 he2Var5 = hj6.z;
                                dec.l(he2Var5, l46Var3, c92VarA);
                                he2 he2Var6 = hj6.y;
                                dec.l(he2Var6, l46Var3, u8aVarM);
                                Integer numValueOf = Integer.valueOf(iHashCode);
                                he2 he2Var7 = hj6.X;
                                dec.l(he2Var7, l46Var3, numValueOf);
                                dec.k(l46Var3);
                                he2 he2Var8 = hj6.x;
                                dec.l(he2Var8, l46Var3, j09VarJ);
                                String str12 = str;
                                if (str12 == null) {
                                    l46Var3.f0(1527905729);
                                    l46Var3.r(false);
                                    r0 = 0;
                                    g09Var = g09Var2;
                                    pr4Var = pr4Var2;
                                    jx0Var = jx0Var2;
                                    he2Var = he2Var6;
                                    he2Var2 = he2Var8;
                                    he2Var3 = he2Var7;
                                    he2Var4 = he2Var5;
                                    ov7Var = ov7Var2;
                                    l46Var2 = l46Var3;
                                } else {
                                    l46Var3.f0(1527905730);
                                    he2Var = he2Var6;
                                    he2Var2 = he2Var8;
                                    he2Var3 = he2Var7;
                                    he2Var4 = he2Var5;
                                    ov7Var = ov7Var2;
                                    r0 = 0;
                                    g09Var = g09Var2;
                                    pr4Var = pr4Var2;
                                    jx0Var = jx0Var2;
                                    nte.b(str12, null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mue.a((mue) l46Var3.k(nte.a), 0L, w6c.l(23), new ar5(700), cr5.h, 0L, null, 0, w6c.l(32), null, null, 16646105), l46Var3, 0, 0, 131070);
                                    l46 l46Var4 = l46Var3;
                                    l46Var4.r(false);
                                    l46Var2 = l46Var4;
                                }
                                g09 g09Var3 = g09Var;
                                o5c.f(l46Var2, androidx.compose.foundation.layout.b.d(g09Var3, 12.0f));
                                l26Var.z(l46Var2, Integer.valueOf((int) r0));
                                o5c.f(l46Var2, androidx.compose.foundation.layout.b.d(g09Var3, 20.0f));
                                if (zF) {
                                    l46Var2.f0(-1613267814);
                                    y6cVar4 = eze.a(l46Var2).a.j;
                                } else {
                                    l46Var2.f0(-1613266759);
                                    y6cVar4 = ((s5d) l46Var2.k(u5d.a)).d;
                                }
                                l46Var2.r(r0);
                                y6c y6cVar6 = y6cVar4;
                                j09 j09VarF = urg.F(new mq6(jx0Var), ia7.a);
                                t7c t7cVarA = s7c.a(new uc0(8.0f, true, new qc0(r0)), ndb.z, l46Var2, 54);
                                int iHashCode2 = Long.hashCode(l46Var2.T);
                                u8a u8aVarM2 = l46Var2.m();
                                j09 j09VarJ2 = m93.J(l46Var2, j09VarF);
                                l46Var2.j0();
                                if (l46Var2.S) {
                                    l46Var2.l(ov7Var);
                                } else {
                                    l46Var2.s0();
                                }
                                dec.l(he2Var4, l46Var2, t7cVarA);
                                dec.l(he2Var, l46Var2, u8aVarM2);
                                ib8.s(iHashCode2, l46Var2, he2Var3, l46Var2);
                                dec.l(he2Var2, l46Var2, j09VarJ2);
                                x16 x16Var10 = x16Var2;
                                if (x16Var10 != null) {
                                    l46Var2.f0(-324977123);
                                    if (1.0f <= 0.0d) {
                                        g37.a("invalid weight; must be greater than zero");
                                    }
                                    j09 j09VarD = androidx.compose.foundation.layout.b.b(0.0f, 48.0f, new jw7(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), 1).D(androidx.compose.foundation.layout.b.b);
                                    bx9 bx9VarQ = ynb.q(12.0f, 0.0f, 2);
                                    bx9 bx9Var = v51.a;
                                    x16Var9 = x16Var10;
                                    f5 = 1.0f;
                                    cgg.k(x16Var9, j09VarD, z14, y6cVar6, v51.g(0L, ((m82) l46Var2.k(pr4Var)).o, l46Var2, 13), null, bx9VarQ, af1.b0(366212805, new ob0(str11, 19), l46Var2), l46Var2, 817889280, 352);
                                    y6cVar5 = y6cVar6;
                                    l46Var2.r(r0);
                                } else {
                                    y6cVar5 = y6cVar6;
                                    x16Var9 = x16Var10;
                                    f5 = 1.0f;
                                    l46Var2.f0(-324401174);
                                    l46Var2.r(r0);
                                }
                                if (x16Var9 != null) {
                                    if (f5 <= 0.0d) {
                                        g37.a("invalid weight; must be greater than zero");
                                    }
                                    j09VarA = androidx.compose.foundation.layout.b.b(0.0f, 48.0f, new jw7(f5 > Float.MAX_VALUE ? Float.MAX_VALUE : f5, true), 1).D(androidx.compose.foundation.layout.b.b);
                                } else {
                                    j09VarA = androidx.compose.foundation.layout.b.a(g09Var3, 180.0f, 48.0f);
                                }
                                bx9 bx9Var2 = v51.a;
                                u51 u51VarA = v51.a(eze.a(l46Var2).b.z(l46Var2), eze.a(l46Var2).b.A(l46Var2), 0L, 0L, l46Var2, 12);
                                bx9 bx9Var3 = new bx9(12.0f, 4.0f, 12.0f, 4.0f);
                                gh6 gh6Var = gh6VarW2;
                                boolean zI = l46Var2.i(gh6Var);
                                x16 x16Var11 = x16Var3;
                                boolean zG = zI | l46Var2.g(x16Var11);
                                Object objR2 = l46Var2.R();
                                if (zG || objR2 == sf2.a) {
                                    objR2 = new sj2(gh6Var, x16Var11, 5);
                                    l46Var2.p0(objR2);
                                }
                                cgg.a((x16) objR2, j09VarA, z13, y6cVar5, u51VarA, null, null, bx9Var3, af1.b0(1124396200, new ob0(str10, 20), l46Var2), l46Var2, 817889280, 352);
                                l46Var2.r(true);
                                l46Var2.r(true);
                            } else {
                                l46Var3.Z();
                            }
                            return wef.a;
                        }
                    }, l46Var), l46Var, ((i4 >> 15) & 112) | ((i4 >> 21) & 14) | 384, 0);
                    s84Var2 = s84Var6;
                    x16Var4 = x16Var8;
                    z8 = z14;
                    z7 = z13;
                    str5 = str11;
                    str4 = str10;
                } else {
                    l46Var.Z();
                    str4 = strQ;
                    str5 = strQ2;
                    z7 = z3;
                    z8 = z4;
                    x16Var4 = x16Var;
                }
                s84Var3 = s84Var2;
                ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    ojbVarV.d = new yk(str, l26Var, str4, str5, z7, z8, s84Var3, x16Var4, x16Var2, x16Var3, i2, i3);
                }
            }
            i4 |= 196608;
            z4 = z2;
            i7 = i3 & 64;
            if (i7 != 0) {
                if ((1572864 & i2) == 0) {
                    s84Var2 = s84Var;
                    if (l46Var.g(s84Var2)) {
                        i8 = 1048576;
                    } else {
                        i8 = 524288;
                    }
                    i4 |= i8;
                }
                i9 = i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                if (i9 != 0) {
                    i4 |= 12582912;
                } else if ((i2 & 12582912) == 0) {
                    if (l46Var.i(x16Var)) {
                        i10 = 8388608;
                    } else {
                        i10 = 4194304;
                    }
                    i4 |= i10;
                }
                if ((i2 & 100663296) == 0) {
                    if (l46Var.i(x16Var2)) {
                        i12 = 67108864;
                    } else {
                        i12 = 33554432;
                    }
                    i4 |= i12;
                }
                if ((i2 & 805306368) == 0) {
                    if (l46Var.i(x16Var3)) {
                        i11 = 536870912;
                    } else {
                        i11 = 268435456;
                    }
                    i4 |= i11;
                }
                z5 = false;
                b3 = 0;
                b2 = 0;
                if ((i4 & 306783379) != 306783378) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (l46Var.W(i4 & 1, z6)) {
                    l46Var.b0();
                    if ((i2 & 1) != 0) {
                        if ((i3 & 4) != 0) {
                            i4 &= -897;
                            strQ = afc.q(R.string.button_continue, l46Var);
                        }
                        if ((i3 & 8) != 0) {
                            strQ2 = afc.q(R.string.button_cancel, l46Var);
                            i4 &= -7169;
                        }
                        if (i15 != 0) {
                            z3 = true;
                        }
                        if (i5 != 0) {
                            z4 = true;
                        }
                        if (i7 != 0) {
                            s84Var2 = new s84(z5, (boolean) (b2 == true ? 1 : 0), 4);
                        }
                        if (i9 != 0) {
                            objR = l46Var.R();
                            if (objR == sf2.a) {
                                objR = new i7b(b3 == true ? 1 : 0);
                                l46Var.p0(objR);
                            }
                            x16Var5 = (x16) objR;
                        } else {
                            x16Var5 = x16Var;
                        }
                    } else {
                        if ((i3 & 4) != 0) {
                            i4 &= -897;
                            strQ = afc.q(R.string.button_continue, l46Var);
                        }
                        if ((i3 & 8) != 0) {
                            strQ2 = afc.q(R.string.button_cancel, l46Var);
                            i4 &= -7169;
                        }
                        if (i15 != 0) {
                            z3 = true;
                        }
                        if (i5 != 0) {
                            z4 = true;
                        }
                        if (i7 != 0) {
                            s84Var2 = new s84(z5, (boolean) (b2 == true ? 1 : 0), 4);
                        }
                        if (i9 != 0) {
                            objR = l46Var.R();
                            if (objR == sf2.a) {
                                objR = new i7b(b3 == true ? 1 : 0);
                                l46Var.p0(objR);
                            }
                            x16Var5 = (x16) objR;
                        } else {
                            x16Var5 = x16Var;
                        }
                    }
                    final String str12 = strQ;
                    final String str13 = strQ2;
                    final boolean z15 = z3;
                    final boolean z16 = z4;
                    s84 s84Var7 = s84Var2;
                    l46Var.s();
                    zF = k8b.f((e8b) l46Var.k(l8b.a));
                    if (zF) {
                        l46Var.f0(-1712128979);
                        y6cVarB = eze.a(l46Var).a.j;
                        l46Var.r(false);
                    } else {
                        l46Var.f0(-1712128512);
                        l46Var.r(false);
                        y6cVarB = a7c.b(24.0f);
                    }
                    final y6c y6cVar4 = y6cVarB;
                    final float f5 = zF ? 24.0f : 32.0f;
                    final gh6 gh6VarW3 = w0(l46Var);
                    x16 x16Var9 = x16Var5;
                    t72.b(x16Var9, s84Var7, af1.b0(1044811230, new l26() { // from class: j7b
                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Type inference failed for: r0v13 */
                        /* JADX WARN: Type inference failed for: r0v2 */
                        /* JADX WARN: Type inference failed for: r0v3, types: [boolean, int] */
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
                        @Override // defpackage.l26
                        public final Object z(Object obj, Object obj2) {
                            he2 he2Var;
                            he2 he2Var2;
                            he2 he2Var3;
                            he2 he2Var4;
                            ov7 ov7Var;
                            ?? r0;
                            g09 g09Var;
                            pr4 pr4Var;
                            jx0 jx0Var;
                            l46 l46Var2;
                            y6c y6cVar5;
                            y6c y6cVar6;
                            x16 x16Var10;
                            float f6;
                            j09 j09VarA;
                            l46 l46Var3 = (l46) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            if (l46Var3.W(iIntValue & 1, (iIntValue & 3) != 2)) {
                                g09 g09Var2 = g09.a;
                                j09 j09VarE = oa7.E(androidx.compose.foundation.layout.b.c(g09Var2, 1.0f), y6cVar4);
                                pr4 pr4Var2 = o82.a;
                                j09 j09VarA0 = ynb.a0(tm7.o(j09VarE, ((m82) l46Var3.k(pr4Var2)).p, g21.f), f5, 24.0f);
                                jx0 jx0Var2 = ndb.Z;
                                c92 c92VarA = a92.a(xc0.c, jx0Var2, l46Var3, 48);
                                int iHashCode = Long.hashCode(l46Var3.T);
                                u8a u8aVarM = l46Var3.m();
                                j09 j09VarJ = m93.J(l46Var3, j09VarA0);
                                lf2.q.getClass();
                                l46Var3.j0();
                                boolean z17 = l46Var3.S;
                                ov7 ov7Var2 = LayoutNode.h1;
                                if (z17) {
                                    l46Var3.l(ov7Var2);
                                } else {
                                    l46Var3.s0();
                                }
                                he2 he2Var5 = hj6.z;
                                dec.l(he2Var5, l46Var3, c92VarA);
                                he2 he2Var6 = hj6.y;
                                dec.l(he2Var6, l46Var3, u8aVarM);
                                Integer numValueOf = Integer.valueOf(iHashCode);
                                he2 he2Var7 = hj6.X;
                                dec.l(he2Var7, l46Var3, numValueOf);
                                dec.k(l46Var3);
                                he2 he2Var8 = hj6.x;
                                dec.l(he2Var8, l46Var3, j09VarJ);
                                String str14 = str;
                                if (str14 == null) {
                                    l46Var3.f0(1527905729);
                                    l46Var3.r(false);
                                    r0 = 0;
                                    g09Var = g09Var2;
                                    pr4Var = pr4Var2;
                                    jx0Var = jx0Var2;
                                    he2Var = he2Var6;
                                    he2Var2 = he2Var8;
                                    he2Var3 = he2Var7;
                                    he2Var4 = he2Var5;
                                    ov7Var = ov7Var2;
                                    l46Var2 = l46Var3;
                                } else {
                                    l46Var3.f0(1527905730);
                                    he2Var = he2Var6;
                                    he2Var2 = he2Var8;
                                    he2Var3 = he2Var7;
                                    he2Var4 = he2Var5;
                                    ov7Var = ov7Var2;
                                    r0 = 0;
                                    g09Var = g09Var2;
                                    pr4Var = pr4Var2;
                                    jx0Var = jx0Var2;
                                    nte.b(str14, null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mue.a((mue) l46Var3.k(nte.a), 0L, w6c.l(23), new ar5(700), cr5.h, 0L, null, 0, w6c.l(32), null, null, 16646105), l46Var3, 0, 0, 131070);
                                    l46 l46Var4 = l46Var3;
                                    l46Var4.r(false);
                                    l46Var2 = l46Var4;
                                }
                                g09 g09Var3 = g09Var;
                                o5c.f(l46Var2, androidx.compose.foundation.layout.b.d(g09Var3, 12.0f));
                                l26Var.z(l46Var2, Integer.valueOf((int) r0));
                                o5c.f(l46Var2, androidx.compose.foundation.layout.b.d(g09Var3, 20.0f));
                                if (zF) {
                                    l46Var2.f0(-1613267814);
                                    y6cVar5 = eze.a(l46Var2).a.j;
                                } else {
                                    l46Var2.f0(-1613266759);
                                    y6cVar5 = ((s5d) l46Var2.k(u5d.a)).d;
                                }
                                l46Var2.r(r0);
                                y6c y6cVar7 = y6cVar5;
                                j09 j09VarF = urg.F(new mq6(jx0Var), ia7.a);
                                t7c t7cVarA = s7c.a(new uc0(8.0f, true, new qc0(r0)), ndb.z, l46Var2, 54);
                                int iHashCode2 = Long.hashCode(l46Var2.T);
                                u8a u8aVarM2 = l46Var2.m();
                                j09 j09VarJ2 = m93.J(l46Var2, j09VarF);
                                l46Var2.j0();
                                if (l46Var2.S) {
                                    l46Var2.l(ov7Var);
                                } else {
                                    l46Var2.s0();
                                }
                                dec.l(he2Var4, l46Var2, t7cVarA);
                                dec.l(he2Var, l46Var2, u8aVarM2);
                                ib8.s(iHashCode2, l46Var2, he2Var3, l46Var2);
                                dec.l(he2Var2, l46Var2, j09VarJ2);
                                x16 x16Var11 = x16Var2;
                                if (x16Var11 != null) {
                                    l46Var2.f0(-324977123);
                                    if (1.0f <= 0.0d) {
                                        g37.a("invalid weight; must be greater than zero");
                                    }
                                    j09 j09VarD = androidx.compose.foundation.layout.b.b(0.0f, 48.0f, new jw7(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), 1).D(androidx.compose.foundation.layout.b.b);
                                    bx9 bx9VarQ = ynb.q(12.0f, 0.0f, 2);
                                    bx9 bx9Var = v51.a;
                                    x16Var10 = x16Var11;
                                    f6 = 1.0f;
                                    cgg.k(x16Var10, j09VarD, z16, y6cVar7, v51.g(0L, ((m82) l46Var2.k(pr4Var)).o, l46Var2, 13), null, bx9VarQ, af1.b0(366212805, new ob0(str13, 19), l46Var2), l46Var2, 817889280, 352);
                                    y6cVar6 = y6cVar7;
                                    l46Var2.r(r0);
                                } else {
                                    y6cVar6 = y6cVar7;
                                    x16Var10 = x16Var11;
                                    f6 = 1.0f;
                                    l46Var2.f0(-324401174);
                                    l46Var2.r(r0);
                                }
                                if (x16Var10 != null) {
                                    if (f6 <= 0.0d) {
                                        g37.a("invalid weight; must be greater than zero");
                                    }
                                    j09VarA = androidx.compose.foundation.layout.b.b(0.0f, 48.0f, new jw7(f6 > Float.MAX_VALUE ? Float.MAX_VALUE : f6, true), 1).D(androidx.compose.foundation.layout.b.b);
                                } else {
                                    j09VarA = androidx.compose.foundation.layout.b.a(g09Var3, 180.0f, 48.0f);
                                }
                                bx9 bx9Var2 = v51.a;
                                u51 u51VarA = v51.a(eze.a(l46Var2).b.z(l46Var2), eze.a(l46Var2).b.A(l46Var2), 0L, 0L, l46Var2, 12);
                                bx9 bx9Var3 = new bx9(12.0f, 4.0f, 12.0f, 4.0f);
                                gh6 gh6Var = gh6VarW3;
                                boolean zI = l46Var2.i(gh6Var);
                                x16 x16Var12 = x16Var3;
                                boolean zG = zI | l46Var2.g(x16Var12);
                                Object objR2 = l46Var2.R();
                                if (zG || objR2 == sf2.a) {
                                    objR2 = new sj2(gh6Var, x16Var12, 5);
                                    l46Var2.p0(objR2);
                                }
                                cgg.a((x16) objR2, j09VarA, z15, y6cVar6, u51VarA, null, null, bx9Var3, af1.b0(1124396200, new ob0(str12, 20), l46Var2), l46Var2, 817889280, 352);
                                l46Var2.r(true);
                                l46Var2.r(true);
                            } else {
                                l46Var3.Z();
                            }
                            return wef.a;
                        }
                    }, l46Var), l46Var, ((i4 >> 15) & 112) | ((i4 >> 21) & 14) | 384, 0);
                    s84Var2 = s84Var7;
                    x16Var4 = x16Var9;
                    z8 = z16;
                    z7 = z15;
                    str5 = str13;
                    str4 = str12;
                } else {
                    l46Var.Z();
                    str4 = strQ;
                    str5 = strQ2;
                    z7 = z3;
                    z8 = z4;
                    x16Var4 = x16Var;
                }
                s84Var3 = s84Var2;
                ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    ojbVarV.d = new yk(str, l26Var, str4, str5, z7, z8, s84Var3, x16Var4, x16Var2, x16Var3, i2, i3);
                }
            }
            i4 |= 1572864;
            s84Var2 = s84Var;
            i9 = i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
            if (i9 != 0) {
                i4 |= 12582912;
            } else if ((i2 & 12582912) == 0) {
                if (l46Var.i(x16Var)) {
                    i10 = 8388608;
                } else {
                    i10 = 4194304;
                }
                i4 |= i10;
            }
            if ((i2 & 100663296) == 0) {
                if (l46Var.i(x16Var2)) {
                    i12 = 67108864;
                } else {
                    i12 = 33554432;
                }
                i4 |= i12;
            }
            if ((i2 & 805306368) == 0) {
                if (l46Var.i(x16Var3)) {
                    i11 = 536870912;
                } else {
                    i11 = 268435456;
                }
                i4 |= i11;
            }
            z5 = false;
            b3 = 0;
            b2 = 0;
            if ((i4 & 306783379) != 306783378) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (l46Var.W(i4 & 1, z6)) {
                l46Var.b0();
                if ((i2 & 1) != 0) {
                    if ((i3 & 4) != 0) {
                        i4 &= -897;
                        strQ = afc.q(R.string.button_continue, l46Var);
                    }
                    if ((i3 & 8) != 0) {
                        strQ2 = afc.q(R.string.button_cancel, l46Var);
                        i4 &= -7169;
                    }
                    if (i15 != 0) {
                        z3 = true;
                    }
                    if (i5 != 0) {
                        z4 = true;
                    }
                    if (i7 != 0) {
                        s84Var2 = new s84(z5, (boolean) (b2 == true ? 1 : 0), 4);
                    }
                    if (i9 != 0) {
                        objR = l46Var.R();
                        if (objR == sf2.a) {
                            objR = new i7b(b3 == true ? 1 : 0);
                            l46Var.p0(objR);
                        }
                        x16Var5 = (x16) objR;
                    } else {
                        x16Var5 = x16Var;
                    }
                } else {
                    if ((i3 & 4) != 0) {
                        i4 &= -897;
                        strQ = afc.q(R.string.button_continue, l46Var);
                    }
                    if ((i3 & 8) != 0) {
                        strQ2 = afc.q(R.string.button_cancel, l46Var);
                        i4 &= -7169;
                    }
                    if (i15 != 0) {
                        z3 = true;
                    }
                    if (i5 != 0) {
                        z4 = true;
                    }
                    if (i7 != 0) {
                        s84Var2 = new s84(z5, (boolean) (b2 == true ? 1 : 0), 4);
                    }
                    if (i9 != 0) {
                        objR = l46Var.R();
                        if (objR == sf2.a) {
                            objR = new i7b(b3 == true ? 1 : 0);
                            l46Var.p0(objR);
                        }
                        x16Var5 = (x16) objR;
                    } else {
                        x16Var5 = x16Var;
                    }
                }
                final String str14 = strQ;
                final String str15 = strQ2;
                final boolean z17 = z3;
                final boolean z18 = z4;
                s84 s84Var8 = s84Var2;
                l46Var.s();
                zF = k8b.f((e8b) l46Var.k(l8b.a));
                if (zF) {
                    l46Var.f0(-1712128979);
                    y6cVarB = eze.a(l46Var).a.j;
                    l46Var.r(false);
                } else {
                    l46Var.f0(-1712128512);
                    l46Var.r(false);
                    y6cVarB = a7c.b(24.0f);
                }
                final y6c y6cVar5 = y6cVarB;
                final float f6 = zF ? 24.0f : 32.0f;
                final gh6 gh6VarW4 = w0(l46Var);
                x16 x16Var10 = x16Var5;
                t72.b(x16Var10, s84Var8, af1.b0(1044811230, new l26() { // from class: j7b
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v13 */
                    /* JADX WARN: Type inference failed for: r0v2 */
                    /* JADX WARN: Type inference failed for: r0v3, types: [boolean, int] */
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
                    @Override // defpackage.l26
                    public final Object z(Object obj, Object obj2) {
                        he2 he2Var;
                        he2 he2Var2;
                        he2 he2Var3;
                        he2 he2Var4;
                        ov7 ov7Var;
                        ?? r0;
                        g09 g09Var;
                        pr4 pr4Var;
                        jx0 jx0Var;
                        l46 l46Var2;
                        y6c y6cVar6;
                        y6c y6cVar7;
                        x16 x16Var11;
                        float f7;
                        j09 j09VarA;
                        l46 l46Var3 = (l46) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        if (l46Var3.W(iIntValue & 1, (iIntValue & 3) != 2)) {
                            g09 g09Var2 = g09.a;
                            j09 j09VarE = oa7.E(androidx.compose.foundation.layout.b.c(g09Var2, 1.0f), y6cVar5);
                            pr4 pr4Var2 = o82.a;
                            j09 j09VarA0 = ynb.a0(tm7.o(j09VarE, ((m82) l46Var3.k(pr4Var2)).p, g21.f), f6, 24.0f);
                            jx0 jx0Var2 = ndb.Z;
                            c92 c92VarA = a92.a(xc0.c, jx0Var2, l46Var3, 48);
                            int iHashCode = Long.hashCode(l46Var3.T);
                            u8a u8aVarM = l46Var3.m();
                            j09 j09VarJ = m93.J(l46Var3, j09VarA0);
                            lf2.q.getClass();
                            l46Var3.j0();
                            boolean z19 = l46Var3.S;
                            ov7 ov7Var2 = LayoutNode.h1;
                            if (z19) {
                                l46Var3.l(ov7Var2);
                            } else {
                                l46Var3.s0();
                            }
                            he2 he2Var5 = hj6.z;
                            dec.l(he2Var5, l46Var3, c92VarA);
                            he2 he2Var6 = hj6.y;
                            dec.l(he2Var6, l46Var3, u8aVarM);
                            Integer numValueOf = Integer.valueOf(iHashCode);
                            he2 he2Var7 = hj6.X;
                            dec.l(he2Var7, l46Var3, numValueOf);
                            dec.k(l46Var3);
                            he2 he2Var8 = hj6.x;
                            dec.l(he2Var8, l46Var3, j09VarJ);
                            String str16 = str;
                            if (str16 == null) {
                                l46Var3.f0(1527905729);
                                l46Var3.r(false);
                                r0 = 0;
                                g09Var = g09Var2;
                                pr4Var = pr4Var2;
                                jx0Var = jx0Var2;
                                he2Var = he2Var6;
                                he2Var2 = he2Var8;
                                he2Var3 = he2Var7;
                                he2Var4 = he2Var5;
                                ov7Var = ov7Var2;
                                l46Var2 = l46Var3;
                            } else {
                                l46Var3.f0(1527905730);
                                he2Var = he2Var6;
                                he2Var2 = he2Var8;
                                he2Var3 = he2Var7;
                                he2Var4 = he2Var5;
                                ov7Var = ov7Var2;
                                r0 = 0;
                                g09Var = g09Var2;
                                pr4Var = pr4Var2;
                                jx0Var = jx0Var2;
                                nte.b(str16, null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mue.a((mue) l46Var3.k(nte.a), 0L, w6c.l(23), new ar5(700), cr5.h, 0L, null, 0, w6c.l(32), null, null, 16646105), l46Var3, 0, 0, 131070);
                                l46 l46Var4 = l46Var3;
                                l46Var4.r(false);
                                l46Var2 = l46Var4;
                            }
                            g09 g09Var3 = g09Var;
                            o5c.f(l46Var2, androidx.compose.foundation.layout.b.d(g09Var3, 12.0f));
                            l26Var.z(l46Var2, Integer.valueOf((int) r0));
                            o5c.f(l46Var2, androidx.compose.foundation.layout.b.d(g09Var3, 20.0f));
                            if (zF) {
                                l46Var2.f0(-1613267814);
                                y6cVar6 = eze.a(l46Var2).a.j;
                            } else {
                                l46Var2.f0(-1613266759);
                                y6cVar6 = ((s5d) l46Var2.k(u5d.a)).d;
                            }
                            l46Var2.r(r0);
                            y6c y6cVar8 = y6cVar6;
                            j09 j09VarF = urg.F(new mq6(jx0Var), ia7.a);
                            t7c t7cVarA = s7c.a(new uc0(8.0f, true, new qc0(r0)), ndb.z, l46Var2, 54);
                            int iHashCode2 = Long.hashCode(l46Var2.T);
                            u8a u8aVarM2 = l46Var2.m();
                            j09 j09VarJ2 = m93.J(l46Var2, j09VarF);
                            l46Var2.j0();
                            if (l46Var2.S) {
                                l46Var2.l(ov7Var);
                            } else {
                                l46Var2.s0();
                            }
                            dec.l(he2Var4, l46Var2, t7cVarA);
                            dec.l(he2Var, l46Var2, u8aVarM2);
                            ib8.s(iHashCode2, l46Var2, he2Var3, l46Var2);
                            dec.l(he2Var2, l46Var2, j09VarJ2);
                            x16 x16Var12 = x16Var2;
                            if (x16Var12 != null) {
                                l46Var2.f0(-324977123);
                                if (1.0f <= 0.0d) {
                                    g37.a("invalid weight; must be greater than zero");
                                }
                                j09 j09VarD = androidx.compose.foundation.layout.b.b(0.0f, 48.0f, new jw7(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), 1).D(androidx.compose.foundation.layout.b.b);
                                bx9 bx9VarQ = ynb.q(12.0f, 0.0f, 2);
                                bx9 bx9Var = v51.a;
                                x16Var11 = x16Var12;
                                f7 = 1.0f;
                                cgg.k(x16Var11, j09VarD, z18, y6cVar8, v51.g(0L, ((m82) l46Var2.k(pr4Var)).o, l46Var2, 13), null, bx9VarQ, af1.b0(366212805, new ob0(str15, 19), l46Var2), l46Var2, 817889280, 352);
                                y6cVar7 = y6cVar8;
                                l46Var2.r(r0);
                            } else {
                                y6cVar7 = y6cVar8;
                                x16Var11 = x16Var12;
                                f7 = 1.0f;
                                l46Var2.f0(-324401174);
                                l46Var2.r(r0);
                            }
                            if (x16Var11 != null) {
                                if (f7 <= 0.0d) {
                                    g37.a("invalid weight; must be greater than zero");
                                }
                                j09VarA = androidx.compose.foundation.layout.b.b(0.0f, 48.0f, new jw7(f7 > Float.MAX_VALUE ? Float.MAX_VALUE : f7, true), 1).D(androidx.compose.foundation.layout.b.b);
                            } else {
                                j09VarA = androidx.compose.foundation.layout.b.a(g09Var3, 180.0f, 48.0f);
                            }
                            bx9 bx9Var2 = v51.a;
                            u51 u51VarA = v51.a(eze.a(l46Var2).b.z(l46Var2), eze.a(l46Var2).b.A(l46Var2), 0L, 0L, l46Var2, 12);
                            bx9 bx9Var3 = new bx9(12.0f, 4.0f, 12.0f, 4.0f);
                            gh6 gh6Var = gh6VarW4;
                            boolean zI = l46Var2.i(gh6Var);
                            x16 x16Var13 = x16Var3;
                            boolean zG = zI | l46Var2.g(x16Var13);
                            Object objR2 = l46Var2.R();
                            if (zG || objR2 == sf2.a) {
                                objR2 = new sj2(gh6Var, x16Var13, 5);
                                l46Var2.p0(objR2);
                            }
                            cgg.a((x16) objR2, j09VarA, z17, y6cVar7, u51VarA, null, null, bx9Var3, af1.b0(1124396200, new ob0(str14, 20), l46Var2), l46Var2, 817889280, 352);
                            l46Var2.r(true);
                            l46Var2.r(true);
                        } else {
                            l46Var3.Z();
                        }
                        return wef.a;
                    }
                }, l46Var), l46Var, ((i4 >> 15) & 112) | ((i4 >> 21) & 14) | 384, 0);
                s84Var2 = s84Var8;
                x16Var4 = x16Var10;
                z8 = z18;
                z7 = z17;
                str5 = str15;
                str4 = str14;
            } else {
                l46Var.Z();
                str4 = strQ;
                str5 = strQ2;
                z7 = z3;
                z8 = z4;
                x16Var4 = x16Var;
            }
            s84Var3 = s84Var2;
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new yk(str, l26Var, str4, str5, z7, z8, s84Var3, x16Var4, x16Var2, x16Var3, i2, i3);
            }
        }
        i4 |= 24576;
        z3 = z;
        i5 = i3 & 32;
        if (i5 != 0) {
            if ((196608 & i2) == 0) {
                z4 = z2;
                if (l46Var.h(z4)) {
                    i6 = 131072;
                } else {
                    i6 = 65536;
                }
                i4 |= i6;
            }
            i7 = i3 & 64;
            if (i7 != 0) {
                if ((1572864 & i2) == 0) {
                    s84Var2 = s84Var;
                    if (l46Var.g(s84Var2)) {
                        i8 = 1048576;
                    } else {
                        i8 = 524288;
                    }
                    i4 |= i8;
                }
                i9 = i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                if (i9 != 0) {
                    i4 |= 12582912;
                } else if ((i2 & 12582912) == 0) {
                    if (l46Var.i(x16Var)) {
                        i10 = 8388608;
                    } else {
                        i10 = 4194304;
                    }
                    i4 |= i10;
                }
                if ((i2 & 100663296) == 0) {
                    if (l46Var.i(x16Var2)) {
                        i12 = 67108864;
                    } else {
                        i12 = 33554432;
                    }
                    i4 |= i12;
                }
                if ((i2 & 805306368) == 0) {
                    if (l46Var.i(x16Var3)) {
                        i11 = 536870912;
                    } else {
                        i11 = 268435456;
                    }
                    i4 |= i11;
                }
                z5 = false;
                b3 = 0;
                b2 = 0;
                if ((i4 & 306783379) != 306783378) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (l46Var.W(i4 & 1, z6)) {
                    l46Var.b0();
                    if ((i2 & 1) != 0) {
                        if ((i3 & 4) != 0) {
                            i4 &= -897;
                            strQ = afc.q(R.string.button_continue, l46Var);
                        }
                        if ((i3 & 8) != 0) {
                            strQ2 = afc.q(R.string.button_cancel, l46Var);
                            i4 &= -7169;
                        }
                        if (i15 != 0) {
                            z3 = true;
                        }
                        if (i5 != 0) {
                            z4 = true;
                        }
                        if (i7 != 0) {
                            s84Var2 = new s84(z5, (boolean) (b2 == true ? 1 : 0), 4);
                        }
                        if (i9 != 0) {
                            objR = l46Var.R();
                            if (objR == sf2.a) {
                                objR = new i7b(b3 == true ? 1 : 0);
                                l46Var.p0(objR);
                            }
                            x16Var5 = (x16) objR;
                        } else {
                            x16Var5 = x16Var;
                        }
                    } else {
                        if ((i3 & 4) != 0) {
                            i4 &= -897;
                            strQ = afc.q(R.string.button_continue, l46Var);
                        }
                        if ((i3 & 8) != 0) {
                            strQ2 = afc.q(R.string.button_cancel, l46Var);
                            i4 &= -7169;
                        }
                        if (i15 != 0) {
                            z3 = true;
                        }
                        if (i5 != 0) {
                            z4 = true;
                        }
                        if (i7 != 0) {
                            s84Var2 = new s84(z5, (boolean) (b2 == true ? 1 : 0), 4);
                        }
                        if (i9 != 0) {
                            objR = l46Var.R();
                            if (objR == sf2.a) {
                                objR = new i7b(b3 == true ? 1 : 0);
                                l46Var.p0(objR);
                            }
                            x16Var5 = (x16) objR;
                        } else {
                            x16Var5 = x16Var;
                        }
                    }
                    final String str16 = strQ;
                    final String str17 = strQ2;
                    final boolean z19 = z3;
                    final boolean z110 = z4;
                    s84 s84Var9 = s84Var2;
                    l46Var.s();
                    zF = k8b.f((e8b) l46Var.k(l8b.a));
                    if (zF) {
                        l46Var.f0(-1712128979);
                        y6cVarB = eze.a(l46Var).a.j;
                        l46Var.r(false);
                    } else {
                        l46Var.f0(-1712128512);
                        l46Var.r(false);
                        y6cVarB = a7c.b(24.0f);
                    }
                    final y6c y6cVar6 = y6cVarB;
                    final float f7 = zF ? 24.0f : 32.0f;
                    final gh6 gh6VarW5 = w0(l46Var);
                    x16 x16Var11 = x16Var5;
                    t72.b(x16Var11, s84Var9, af1.b0(1044811230, new l26() { // from class: j7b
                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Type inference failed for: r0v13 */
                        /* JADX WARN: Type inference failed for: r0v2 */
                        /* JADX WARN: Type inference failed for: r0v3, types: [boolean, int] */
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
                        @Override // defpackage.l26
                        public final Object z(Object obj, Object obj2) {
                            he2 he2Var;
                            he2 he2Var2;
                            he2 he2Var3;
                            he2 he2Var4;
                            ov7 ov7Var;
                            ?? r0;
                            g09 g09Var;
                            pr4 pr4Var;
                            jx0 jx0Var;
                            l46 l46Var2;
                            y6c y6cVar7;
                            y6c y6cVar8;
                            x16 x16Var12;
                            float f8;
                            j09 j09VarA;
                            l46 l46Var3 = (l46) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            if (l46Var3.W(iIntValue & 1, (iIntValue & 3) != 2)) {
                                g09 g09Var2 = g09.a;
                                j09 j09VarE = oa7.E(androidx.compose.foundation.layout.b.c(g09Var2, 1.0f), y6cVar6);
                                pr4 pr4Var2 = o82.a;
                                j09 j09VarA0 = ynb.a0(tm7.o(j09VarE, ((m82) l46Var3.k(pr4Var2)).p, g21.f), f7, 24.0f);
                                jx0 jx0Var2 = ndb.Z;
                                c92 c92VarA = a92.a(xc0.c, jx0Var2, l46Var3, 48);
                                int iHashCode = Long.hashCode(l46Var3.T);
                                u8a u8aVarM = l46Var3.m();
                                j09 j09VarJ = m93.J(l46Var3, j09VarA0);
                                lf2.q.getClass();
                                l46Var3.j0();
                                boolean z111 = l46Var3.S;
                                ov7 ov7Var2 = LayoutNode.h1;
                                if (z111) {
                                    l46Var3.l(ov7Var2);
                                } else {
                                    l46Var3.s0();
                                }
                                he2 he2Var5 = hj6.z;
                                dec.l(he2Var5, l46Var3, c92VarA);
                                he2 he2Var6 = hj6.y;
                                dec.l(he2Var6, l46Var3, u8aVarM);
                                Integer numValueOf = Integer.valueOf(iHashCode);
                                he2 he2Var7 = hj6.X;
                                dec.l(he2Var7, l46Var3, numValueOf);
                                dec.k(l46Var3);
                                he2 he2Var8 = hj6.x;
                                dec.l(he2Var8, l46Var3, j09VarJ);
                                String str18 = str;
                                if (str18 == null) {
                                    l46Var3.f0(1527905729);
                                    l46Var3.r(false);
                                    r0 = 0;
                                    g09Var = g09Var2;
                                    pr4Var = pr4Var2;
                                    jx0Var = jx0Var2;
                                    he2Var = he2Var6;
                                    he2Var2 = he2Var8;
                                    he2Var3 = he2Var7;
                                    he2Var4 = he2Var5;
                                    ov7Var = ov7Var2;
                                    l46Var2 = l46Var3;
                                } else {
                                    l46Var3.f0(1527905730);
                                    he2Var = he2Var6;
                                    he2Var2 = he2Var8;
                                    he2Var3 = he2Var7;
                                    he2Var4 = he2Var5;
                                    ov7Var = ov7Var2;
                                    r0 = 0;
                                    g09Var = g09Var2;
                                    pr4Var = pr4Var2;
                                    jx0Var = jx0Var2;
                                    nte.b(str18, null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mue.a((mue) l46Var3.k(nte.a), 0L, w6c.l(23), new ar5(700), cr5.h, 0L, null, 0, w6c.l(32), null, null, 16646105), l46Var3, 0, 0, 131070);
                                    l46 l46Var4 = l46Var3;
                                    l46Var4.r(false);
                                    l46Var2 = l46Var4;
                                }
                                g09 g09Var3 = g09Var;
                                o5c.f(l46Var2, androidx.compose.foundation.layout.b.d(g09Var3, 12.0f));
                                l26Var.z(l46Var2, Integer.valueOf((int) r0));
                                o5c.f(l46Var2, androidx.compose.foundation.layout.b.d(g09Var3, 20.0f));
                                if (zF) {
                                    l46Var2.f0(-1613267814);
                                    y6cVar7 = eze.a(l46Var2).a.j;
                                } else {
                                    l46Var2.f0(-1613266759);
                                    y6cVar7 = ((s5d) l46Var2.k(u5d.a)).d;
                                }
                                l46Var2.r(r0);
                                y6c y6cVar9 = y6cVar7;
                                j09 j09VarF = urg.F(new mq6(jx0Var), ia7.a);
                                t7c t7cVarA = s7c.a(new uc0(8.0f, true, new qc0(r0)), ndb.z, l46Var2, 54);
                                int iHashCode2 = Long.hashCode(l46Var2.T);
                                u8a u8aVarM2 = l46Var2.m();
                                j09 j09VarJ2 = m93.J(l46Var2, j09VarF);
                                l46Var2.j0();
                                if (l46Var2.S) {
                                    l46Var2.l(ov7Var);
                                } else {
                                    l46Var2.s0();
                                }
                                dec.l(he2Var4, l46Var2, t7cVarA);
                                dec.l(he2Var, l46Var2, u8aVarM2);
                                ib8.s(iHashCode2, l46Var2, he2Var3, l46Var2);
                                dec.l(he2Var2, l46Var2, j09VarJ2);
                                x16 x16Var13 = x16Var2;
                                if (x16Var13 != null) {
                                    l46Var2.f0(-324977123);
                                    if (1.0f <= 0.0d) {
                                        g37.a("invalid weight; must be greater than zero");
                                    }
                                    j09 j09VarD = androidx.compose.foundation.layout.b.b(0.0f, 48.0f, new jw7(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), 1).D(androidx.compose.foundation.layout.b.b);
                                    bx9 bx9VarQ = ynb.q(12.0f, 0.0f, 2);
                                    bx9 bx9Var = v51.a;
                                    x16Var12 = x16Var13;
                                    f8 = 1.0f;
                                    cgg.k(x16Var12, j09VarD, z110, y6cVar9, v51.g(0L, ((m82) l46Var2.k(pr4Var)).o, l46Var2, 13), null, bx9VarQ, af1.b0(366212805, new ob0(str17, 19), l46Var2), l46Var2, 817889280, 352);
                                    y6cVar8 = y6cVar9;
                                    l46Var2.r(r0);
                                } else {
                                    y6cVar8 = y6cVar9;
                                    x16Var12 = x16Var13;
                                    f8 = 1.0f;
                                    l46Var2.f0(-324401174);
                                    l46Var2.r(r0);
                                }
                                if (x16Var12 != null) {
                                    if (f8 <= 0.0d) {
                                        g37.a("invalid weight; must be greater than zero");
                                    }
                                    j09VarA = androidx.compose.foundation.layout.b.b(0.0f, 48.0f, new jw7(f8 > Float.MAX_VALUE ? Float.MAX_VALUE : f8, true), 1).D(androidx.compose.foundation.layout.b.b);
                                } else {
                                    j09VarA = androidx.compose.foundation.layout.b.a(g09Var3, 180.0f, 48.0f);
                                }
                                bx9 bx9Var2 = v51.a;
                                u51 u51VarA = v51.a(eze.a(l46Var2).b.z(l46Var2), eze.a(l46Var2).b.A(l46Var2), 0L, 0L, l46Var2, 12);
                                bx9 bx9Var3 = new bx9(12.0f, 4.0f, 12.0f, 4.0f);
                                gh6 gh6Var = gh6VarW5;
                                boolean zI = l46Var2.i(gh6Var);
                                x16 x16Var14 = x16Var3;
                                boolean zG = zI | l46Var2.g(x16Var14);
                                Object objR2 = l46Var2.R();
                                if (zG || objR2 == sf2.a) {
                                    objR2 = new sj2(gh6Var, x16Var14, 5);
                                    l46Var2.p0(objR2);
                                }
                                cgg.a((x16) objR2, j09VarA, z19, y6cVar8, u51VarA, null, null, bx9Var3, af1.b0(1124396200, new ob0(str16, 20), l46Var2), l46Var2, 817889280, 352);
                                l46Var2.r(true);
                                l46Var2.r(true);
                            } else {
                                l46Var3.Z();
                            }
                            return wef.a;
                        }
                    }, l46Var), l46Var, ((i4 >> 15) & 112) | ((i4 >> 21) & 14) | 384, 0);
                    s84Var2 = s84Var9;
                    x16Var4 = x16Var11;
                    z8 = z110;
                    z7 = z19;
                    str5 = str17;
                    str4 = str16;
                } else {
                    l46Var.Z();
                    str4 = strQ;
                    str5 = strQ2;
                    z7 = z3;
                    z8 = z4;
                    x16Var4 = x16Var;
                }
                s84Var3 = s84Var2;
                ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    ojbVarV.d = new yk(str, l26Var, str4, str5, z7, z8, s84Var3, x16Var4, x16Var2, x16Var3, i2, i3);
                }
            }
            i4 |= 1572864;
            s84Var2 = s84Var;
            i9 = i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
            if (i9 != 0) {
                i4 |= 12582912;
            } else if ((i2 & 12582912) == 0) {
                if (l46Var.i(x16Var)) {
                    i10 = 8388608;
                } else {
                    i10 = 4194304;
                }
                i4 |= i10;
            }
            if ((i2 & 100663296) == 0) {
                if (l46Var.i(x16Var2)) {
                    i12 = 67108864;
                } else {
                    i12 = 33554432;
                }
                i4 |= i12;
            }
            if ((i2 & 805306368) == 0) {
                if (l46Var.i(x16Var3)) {
                    i11 = 536870912;
                } else {
                    i11 = 268435456;
                }
                i4 |= i11;
            }
            z5 = false;
            b3 = 0;
            b2 = 0;
            if ((i4 & 306783379) != 306783378) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (l46Var.W(i4 & 1, z6)) {
                l46Var.b0();
                if ((i2 & 1) != 0) {
                    if ((i3 & 4) != 0) {
                        i4 &= -897;
                        strQ = afc.q(R.string.button_continue, l46Var);
                    }
                    if ((i3 & 8) != 0) {
                        strQ2 = afc.q(R.string.button_cancel, l46Var);
                        i4 &= -7169;
                    }
                    if (i15 != 0) {
                        z3 = true;
                    }
                    if (i5 != 0) {
                        z4 = true;
                    }
                    if (i7 != 0) {
                        s84Var2 = new s84(z5, (boolean) (b2 == true ? 1 : 0), 4);
                    }
                    if (i9 != 0) {
                        objR = l46Var.R();
                        if (objR == sf2.a) {
                            objR = new i7b(b3 == true ? 1 : 0);
                            l46Var.p0(objR);
                        }
                        x16Var5 = (x16) objR;
                    } else {
                        x16Var5 = x16Var;
                    }
                } else {
                    if ((i3 & 4) != 0) {
                        i4 &= -897;
                        strQ = afc.q(R.string.button_continue, l46Var);
                    }
                    if ((i3 & 8) != 0) {
                        strQ2 = afc.q(R.string.button_cancel, l46Var);
                        i4 &= -7169;
                    }
                    if (i15 != 0) {
                        z3 = true;
                    }
                    if (i5 != 0) {
                        z4 = true;
                    }
                    if (i7 != 0) {
                        s84Var2 = new s84(z5, (boolean) (b2 == true ? 1 : 0), 4);
                    }
                    if (i9 != 0) {
                        objR = l46Var.R();
                        if (objR == sf2.a) {
                            objR = new i7b(b3 == true ? 1 : 0);
                            l46Var.p0(objR);
                        }
                        x16Var5 = (x16) objR;
                    } else {
                        x16Var5 = x16Var;
                    }
                }
                final String str18 = strQ;
                final String str19 = strQ2;
                final boolean z111 = z3;
                final boolean z112 = z4;
                s84 s84Var10 = s84Var2;
                l46Var.s();
                zF = k8b.f((e8b) l46Var.k(l8b.a));
                if (zF) {
                    l46Var.f0(-1712128979);
                    y6cVarB = eze.a(l46Var).a.j;
                    l46Var.r(false);
                } else {
                    l46Var.f0(-1712128512);
                    l46Var.r(false);
                    y6cVarB = a7c.b(24.0f);
                }
                final y6c y6cVar7 = y6cVarB;
                final float f8 = zF ? 24.0f : 32.0f;
                final gh6 gh6VarW6 = w0(l46Var);
                x16 x16Var12 = x16Var5;
                t72.b(x16Var12, s84Var10, af1.b0(1044811230, new l26() { // from class: j7b
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v13 */
                    /* JADX WARN: Type inference failed for: r0v2 */
                    /* JADX WARN: Type inference failed for: r0v3, types: [boolean, int] */
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
                    @Override // defpackage.l26
                    public final Object z(Object obj, Object obj2) {
                        he2 he2Var;
                        he2 he2Var2;
                        he2 he2Var3;
                        he2 he2Var4;
                        ov7 ov7Var;
                        ?? r0;
                        g09 g09Var;
                        pr4 pr4Var;
                        jx0 jx0Var;
                        l46 l46Var2;
                        y6c y6cVar8;
                        y6c y6cVar9;
                        x16 x16Var13;
                        float f9;
                        j09 j09VarA;
                        l46 l46Var3 = (l46) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        if (l46Var3.W(iIntValue & 1, (iIntValue & 3) != 2)) {
                            g09 g09Var2 = g09.a;
                            j09 j09VarE = oa7.E(androidx.compose.foundation.layout.b.c(g09Var2, 1.0f), y6cVar7);
                            pr4 pr4Var2 = o82.a;
                            j09 j09VarA0 = ynb.a0(tm7.o(j09VarE, ((m82) l46Var3.k(pr4Var2)).p, g21.f), f8, 24.0f);
                            jx0 jx0Var2 = ndb.Z;
                            c92 c92VarA = a92.a(xc0.c, jx0Var2, l46Var3, 48);
                            int iHashCode = Long.hashCode(l46Var3.T);
                            u8a u8aVarM = l46Var3.m();
                            j09 j09VarJ = m93.J(l46Var3, j09VarA0);
                            lf2.q.getClass();
                            l46Var3.j0();
                            boolean z113 = l46Var3.S;
                            ov7 ov7Var2 = LayoutNode.h1;
                            if (z113) {
                                l46Var3.l(ov7Var2);
                            } else {
                                l46Var3.s0();
                            }
                            he2 he2Var5 = hj6.z;
                            dec.l(he2Var5, l46Var3, c92VarA);
                            he2 he2Var6 = hj6.y;
                            dec.l(he2Var6, l46Var3, u8aVarM);
                            Integer numValueOf = Integer.valueOf(iHashCode);
                            he2 he2Var7 = hj6.X;
                            dec.l(he2Var7, l46Var3, numValueOf);
                            dec.k(l46Var3);
                            he2 he2Var8 = hj6.x;
                            dec.l(he2Var8, l46Var3, j09VarJ);
                            String str110 = str;
                            if (str110 == null) {
                                l46Var3.f0(1527905729);
                                l46Var3.r(false);
                                r0 = 0;
                                g09Var = g09Var2;
                                pr4Var = pr4Var2;
                                jx0Var = jx0Var2;
                                he2Var = he2Var6;
                                he2Var2 = he2Var8;
                                he2Var3 = he2Var7;
                                he2Var4 = he2Var5;
                                ov7Var = ov7Var2;
                                l46Var2 = l46Var3;
                            } else {
                                l46Var3.f0(1527905730);
                                he2Var = he2Var6;
                                he2Var2 = he2Var8;
                                he2Var3 = he2Var7;
                                he2Var4 = he2Var5;
                                ov7Var = ov7Var2;
                                r0 = 0;
                                g09Var = g09Var2;
                                pr4Var = pr4Var2;
                                jx0Var = jx0Var2;
                                nte.b(str110, null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mue.a((mue) l46Var3.k(nte.a), 0L, w6c.l(23), new ar5(700), cr5.h, 0L, null, 0, w6c.l(32), null, null, 16646105), l46Var3, 0, 0, 131070);
                                l46 l46Var4 = l46Var3;
                                l46Var4.r(false);
                                l46Var2 = l46Var4;
                            }
                            g09 g09Var3 = g09Var;
                            o5c.f(l46Var2, androidx.compose.foundation.layout.b.d(g09Var3, 12.0f));
                            l26Var.z(l46Var2, Integer.valueOf((int) r0));
                            o5c.f(l46Var2, androidx.compose.foundation.layout.b.d(g09Var3, 20.0f));
                            if (zF) {
                                l46Var2.f0(-1613267814);
                                y6cVar8 = eze.a(l46Var2).a.j;
                            } else {
                                l46Var2.f0(-1613266759);
                                y6cVar8 = ((s5d) l46Var2.k(u5d.a)).d;
                            }
                            l46Var2.r(r0);
                            y6c y6cVar10 = y6cVar8;
                            j09 j09VarF = urg.F(new mq6(jx0Var), ia7.a);
                            t7c t7cVarA = s7c.a(new uc0(8.0f, true, new qc0(r0)), ndb.z, l46Var2, 54);
                            int iHashCode2 = Long.hashCode(l46Var2.T);
                            u8a u8aVarM2 = l46Var2.m();
                            j09 j09VarJ2 = m93.J(l46Var2, j09VarF);
                            l46Var2.j0();
                            if (l46Var2.S) {
                                l46Var2.l(ov7Var);
                            } else {
                                l46Var2.s0();
                            }
                            dec.l(he2Var4, l46Var2, t7cVarA);
                            dec.l(he2Var, l46Var2, u8aVarM2);
                            ib8.s(iHashCode2, l46Var2, he2Var3, l46Var2);
                            dec.l(he2Var2, l46Var2, j09VarJ2);
                            x16 x16Var14 = x16Var2;
                            if (x16Var14 != null) {
                                l46Var2.f0(-324977123);
                                if (1.0f <= 0.0d) {
                                    g37.a("invalid weight; must be greater than zero");
                                }
                                j09 j09VarD = androidx.compose.foundation.layout.b.b(0.0f, 48.0f, new jw7(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), 1).D(androidx.compose.foundation.layout.b.b);
                                bx9 bx9VarQ = ynb.q(12.0f, 0.0f, 2);
                                bx9 bx9Var = v51.a;
                                x16Var13 = x16Var14;
                                f9 = 1.0f;
                                cgg.k(x16Var13, j09VarD, z112, y6cVar10, v51.g(0L, ((m82) l46Var2.k(pr4Var)).o, l46Var2, 13), null, bx9VarQ, af1.b0(366212805, new ob0(str19, 19), l46Var2), l46Var2, 817889280, 352);
                                y6cVar9 = y6cVar10;
                                l46Var2.r(r0);
                            } else {
                                y6cVar9 = y6cVar10;
                                x16Var13 = x16Var14;
                                f9 = 1.0f;
                                l46Var2.f0(-324401174);
                                l46Var2.r(r0);
                            }
                            if (x16Var13 != null) {
                                if (f9 <= 0.0d) {
                                    g37.a("invalid weight; must be greater than zero");
                                }
                                j09VarA = androidx.compose.foundation.layout.b.b(0.0f, 48.0f, new jw7(f9 > Float.MAX_VALUE ? Float.MAX_VALUE : f9, true), 1).D(androidx.compose.foundation.layout.b.b);
                            } else {
                                j09VarA = androidx.compose.foundation.layout.b.a(g09Var3, 180.0f, 48.0f);
                            }
                            bx9 bx9Var2 = v51.a;
                            u51 u51VarA = v51.a(eze.a(l46Var2).b.z(l46Var2), eze.a(l46Var2).b.A(l46Var2), 0L, 0L, l46Var2, 12);
                            bx9 bx9Var3 = new bx9(12.0f, 4.0f, 12.0f, 4.0f);
                            gh6 gh6Var = gh6VarW6;
                            boolean zI = l46Var2.i(gh6Var);
                            x16 x16Var15 = x16Var3;
                            boolean zG = zI | l46Var2.g(x16Var15);
                            Object objR2 = l46Var2.R();
                            if (zG || objR2 == sf2.a) {
                                objR2 = new sj2(gh6Var, x16Var15, 5);
                                l46Var2.p0(objR2);
                            }
                            cgg.a((x16) objR2, j09VarA, z111, y6cVar9, u51VarA, null, null, bx9Var3, af1.b0(1124396200, new ob0(str18, 20), l46Var2), l46Var2, 817889280, 352);
                            l46Var2.r(true);
                            l46Var2.r(true);
                        } else {
                            l46Var3.Z();
                        }
                        return wef.a;
                    }
                }, l46Var), l46Var, ((i4 >> 15) & 112) | ((i4 >> 21) & 14) | 384, 0);
                s84Var2 = s84Var10;
                x16Var4 = x16Var12;
                z8 = z112;
                z7 = z111;
                str5 = str19;
                str4 = str18;
            } else {
                l46Var.Z();
                str4 = strQ;
                str5 = strQ2;
                z7 = z3;
                z8 = z4;
                x16Var4 = x16Var;
            }
            s84Var3 = s84Var2;
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new yk(str, l26Var, str4, str5, z7, z8, s84Var3, x16Var4, x16Var2, x16Var3, i2, i3);
            }
        }
        i4 |= 196608;
        z4 = z2;
        i7 = i3 & 64;
        if (i7 != 0) {
            if ((1572864 & i2) == 0) {
                s84Var2 = s84Var;
                if (l46Var.g(s84Var2)) {
                    i8 = 1048576;
                } else {
                    i8 = 524288;
                }
                i4 |= i8;
            }
            i9 = i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
            if (i9 != 0) {
                i4 |= 12582912;
            } else if ((i2 & 12582912) == 0) {
                if (l46Var.i(x16Var)) {
                    i10 = 8388608;
                } else {
                    i10 = 4194304;
                }
                i4 |= i10;
            }
            if ((i2 & 100663296) == 0) {
                if (l46Var.i(x16Var2)) {
                    i12 = 67108864;
                } else {
                    i12 = 33554432;
                }
                i4 |= i12;
            }
            if ((i2 & 805306368) == 0) {
                if (l46Var.i(x16Var3)) {
                    i11 = 536870912;
                } else {
                    i11 = 268435456;
                }
                i4 |= i11;
            }
            z5 = false;
            b3 = 0;
            b2 = 0;
            if ((i4 & 306783379) != 306783378) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (l46Var.W(i4 & 1, z6)) {
                l46Var.b0();
                if ((i2 & 1) != 0) {
                    if ((i3 & 4) != 0) {
                        i4 &= -897;
                        strQ = afc.q(R.string.button_continue, l46Var);
                    }
                    if ((i3 & 8) != 0) {
                        strQ2 = afc.q(R.string.button_cancel, l46Var);
                        i4 &= -7169;
                    }
                    if (i15 != 0) {
                        z3 = true;
                    }
                    if (i5 != 0) {
                        z4 = true;
                    }
                    if (i7 != 0) {
                        s84Var2 = new s84(z5, (boolean) (b2 == true ? 1 : 0), 4);
                    }
                    if (i9 != 0) {
                        objR = l46Var.R();
                        if (objR == sf2.a) {
                            objR = new i7b(b3 == true ? 1 : 0);
                            l46Var.p0(objR);
                        }
                        x16Var5 = (x16) objR;
                    } else {
                        x16Var5 = x16Var;
                    }
                } else {
                    if ((i3 & 4) != 0) {
                        i4 &= -897;
                        strQ = afc.q(R.string.button_continue, l46Var);
                    }
                    if ((i3 & 8) != 0) {
                        strQ2 = afc.q(R.string.button_cancel, l46Var);
                        i4 &= -7169;
                    }
                    if (i15 != 0) {
                        z3 = true;
                    }
                    if (i5 != 0) {
                        z4 = true;
                    }
                    if (i7 != 0) {
                        s84Var2 = new s84(z5, (boolean) (b2 == true ? 1 : 0), 4);
                    }
                    if (i9 != 0) {
                        objR = l46Var.R();
                        if (objR == sf2.a) {
                            objR = new i7b(b3 == true ? 1 : 0);
                            l46Var.p0(objR);
                        }
                        x16Var5 = (x16) objR;
                    } else {
                        x16Var5 = x16Var;
                    }
                }
                final String str110 = strQ;
                final String str111 = strQ2;
                final boolean z113 = z3;
                final boolean z114 = z4;
                s84 s84Var11 = s84Var2;
                l46Var.s();
                zF = k8b.f((e8b) l46Var.k(l8b.a));
                if (zF) {
                    l46Var.f0(-1712128979);
                    y6cVarB = eze.a(l46Var).a.j;
                    l46Var.r(false);
                } else {
                    l46Var.f0(-1712128512);
                    l46Var.r(false);
                    y6cVarB = a7c.b(24.0f);
                }
                final y6c y6cVar8 = y6cVarB;
                final float f9 = zF ? 24.0f : 32.0f;
                final gh6 gh6VarW7 = w0(l46Var);
                x16 x16Var13 = x16Var5;
                t72.b(x16Var13, s84Var11, af1.b0(1044811230, new l26() { // from class: j7b
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v13 */
                    /* JADX WARN: Type inference failed for: r0v2 */
                    /* JADX WARN: Type inference failed for: r0v3, types: [boolean, int] */
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
                    @Override // defpackage.l26
                    public final Object z(Object obj, Object obj2) {
                        he2 he2Var;
                        he2 he2Var2;
                        he2 he2Var3;
                        he2 he2Var4;
                        ov7 ov7Var;
                        ?? r0;
                        g09 g09Var;
                        pr4 pr4Var;
                        jx0 jx0Var;
                        l46 l46Var2;
                        y6c y6cVar9;
                        y6c y6cVar10;
                        x16 x16Var14;
                        float f10;
                        j09 j09VarA;
                        l46 l46Var3 = (l46) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        if (l46Var3.W(iIntValue & 1, (iIntValue & 3) != 2)) {
                            g09 g09Var2 = g09.a;
                            j09 j09VarE = oa7.E(androidx.compose.foundation.layout.b.c(g09Var2, 1.0f), y6cVar8);
                            pr4 pr4Var2 = o82.a;
                            j09 j09VarA0 = ynb.a0(tm7.o(j09VarE, ((m82) l46Var3.k(pr4Var2)).p, g21.f), f9, 24.0f);
                            jx0 jx0Var2 = ndb.Z;
                            c92 c92VarA = a92.a(xc0.c, jx0Var2, l46Var3, 48);
                            int iHashCode = Long.hashCode(l46Var3.T);
                            u8a u8aVarM = l46Var3.m();
                            j09 j09VarJ = m93.J(l46Var3, j09VarA0);
                            lf2.q.getClass();
                            l46Var3.j0();
                            boolean z115 = l46Var3.S;
                            ov7 ov7Var2 = LayoutNode.h1;
                            if (z115) {
                                l46Var3.l(ov7Var2);
                            } else {
                                l46Var3.s0();
                            }
                            he2 he2Var5 = hj6.z;
                            dec.l(he2Var5, l46Var3, c92VarA);
                            he2 he2Var6 = hj6.y;
                            dec.l(he2Var6, l46Var3, u8aVarM);
                            Integer numValueOf = Integer.valueOf(iHashCode);
                            he2 he2Var7 = hj6.X;
                            dec.l(he2Var7, l46Var3, numValueOf);
                            dec.k(l46Var3);
                            he2 he2Var8 = hj6.x;
                            dec.l(he2Var8, l46Var3, j09VarJ);
                            String str112 = str;
                            if (str112 == null) {
                                l46Var3.f0(1527905729);
                                l46Var3.r(false);
                                r0 = 0;
                                g09Var = g09Var2;
                                pr4Var = pr4Var2;
                                jx0Var = jx0Var2;
                                he2Var = he2Var6;
                                he2Var2 = he2Var8;
                                he2Var3 = he2Var7;
                                he2Var4 = he2Var5;
                                ov7Var = ov7Var2;
                                l46Var2 = l46Var3;
                            } else {
                                l46Var3.f0(1527905730);
                                he2Var = he2Var6;
                                he2Var2 = he2Var8;
                                he2Var3 = he2Var7;
                                he2Var4 = he2Var5;
                                ov7Var = ov7Var2;
                                r0 = 0;
                                g09Var = g09Var2;
                                pr4Var = pr4Var2;
                                jx0Var = jx0Var2;
                                nte.b(str112, null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mue.a((mue) l46Var3.k(nte.a), 0L, w6c.l(23), new ar5(700), cr5.h, 0L, null, 0, w6c.l(32), null, null, 16646105), l46Var3, 0, 0, 131070);
                                l46 l46Var4 = l46Var3;
                                l46Var4.r(false);
                                l46Var2 = l46Var4;
                            }
                            g09 g09Var3 = g09Var;
                            o5c.f(l46Var2, androidx.compose.foundation.layout.b.d(g09Var3, 12.0f));
                            l26Var.z(l46Var2, Integer.valueOf((int) r0));
                            o5c.f(l46Var2, androidx.compose.foundation.layout.b.d(g09Var3, 20.0f));
                            if (zF) {
                                l46Var2.f0(-1613267814);
                                y6cVar9 = eze.a(l46Var2).a.j;
                            } else {
                                l46Var2.f0(-1613266759);
                                y6cVar9 = ((s5d) l46Var2.k(u5d.a)).d;
                            }
                            l46Var2.r(r0);
                            y6c y6cVar11 = y6cVar9;
                            j09 j09VarF = urg.F(new mq6(jx0Var), ia7.a);
                            t7c t7cVarA = s7c.a(new uc0(8.0f, true, new qc0(r0)), ndb.z, l46Var2, 54);
                            int iHashCode2 = Long.hashCode(l46Var2.T);
                            u8a u8aVarM2 = l46Var2.m();
                            j09 j09VarJ2 = m93.J(l46Var2, j09VarF);
                            l46Var2.j0();
                            if (l46Var2.S) {
                                l46Var2.l(ov7Var);
                            } else {
                                l46Var2.s0();
                            }
                            dec.l(he2Var4, l46Var2, t7cVarA);
                            dec.l(he2Var, l46Var2, u8aVarM2);
                            ib8.s(iHashCode2, l46Var2, he2Var3, l46Var2);
                            dec.l(he2Var2, l46Var2, j09VarJ2);
                            x16 x16Var15 = x16Var2;
                            if (x16Var15 != null) {
                                l46Var2.f0(-324977123);
                                if (1.0f <= 0.0d) {
                                    g37.a("invalid weight; must be greater than zero");
                                }
                                j09 j09VarD = androidx.compose.foundation.layout.b.b(0.0f, 48.0f, new jw7(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), 1).D(androidx.compose.foundation.layout.b.b);
                                bx9 bx9VarQ = ynb.q(12.0f, 0.0f, 2);
                                bx9 bx9Var = v51.a;
                                x16Var14 = x16Var15;
                                f10 = 1.0f;
                                cgg.k(x16Var14, j09VarD, z114, y6cVar11, v51.g(0L, ((m82) l46Var2.k(pr4Var)).o, l46Var2, 13), null, bx9VarQ, af1.b0(366212805, new ob0(str111, 19), l46Var2), l46Var2, 817889280, 352);
                                y6cVar10 = y6cVar11;
                                l46Var2.r(r0);
                            } else {
                                y6cVar10 = y6cVar11;
                                x16Var14 = x16Var15;
                                f10 = 1.0f;
                                l46Var2.f0(-324401174);
                                l46Var2.r(r0);
                            }
                            if (x16Var14 != null) {
                                if (f10 <= 0.0d) {
                                    g37.a("invalid weight; must be greater than zero");
                                }
                                j09VarA = androidx.compose.foundation.layout.b.b(0.0f, 48.0f, new jw7(f10 > Float.MAX_VALUE ? Float.MAX_VALUE : f10, true), 1).D(androidx.compose.foundation.layout.b.b);
                            } else {
                                j09VarA = androidx.compose.foundation.layout.b.a(g09Var3, 180.0f, 48.0f);
                            }
                            bx9 bx9Var2 = v51.a;
                            u51 u51VarA = v51.a(eze.a(l46Var2).b.z(l46Var2), eze.a(l46Var2).b.A(l46Var2), 0L, 0L, l46Var2, 12);
                            bx9 bx9Var3 = new bx9(12.0f, 4.0f, 12.0f, 4.0f);
                            gh6 gh6Var = gh6VarW7;
                            boolean zI = l46Var2.i(gh6Var);
                            x16 x16Var16 = x16Var3;
                            boolean zG = zI | l46Var2.g(x16Var16);
                            Object objR2 = l46Var2.R();
                            if (zG || objR2 == sf2.a) {
                                objR2 = new sj2(gh6Var, x16Var16, 5);
                                l46Var2.p0(objR2);
                            }
                            cgg.a((x16) objR2, j09VarA, z113, y6cVar10, u51VarA, null, null, bx9Var3, af1.b0(1124396200, new ob0(str110, 20), l46Var2), l46Var2, 817889280, 352);
                            l46Var2.r(true);
                            l46Var2.r(true);
                        } else {
                            l46Var3.Z();
                        }
                        return wef.a;
                    }
                }, l46Var), l46Var, ((i4 >> 15) & 112) | ((i4 >> 21) & 14) | 384, 0);
                s84Var2 = s84Var11;
                x16Var4 = x16Var13;
                z8 = z114;
                z7 = z113;
                str5 = str111;
                str4 = str110;
            } else {
                l46Var.Z();
                str4 = strQ;
                str5 = strQ2;
                z7 = z3;
                z8 = z4;
                x16Var4 = x16Var;
            }
            s84Var3 = s84Var2;
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new yk(str, l26Var, str4, str5, z7, z8, s84Var3, x16Var4, x16Var2, x16Var3, i2, i3);
            }
        }
        i4 |= 1572864;
        s84Var2 = s84Var;
        i9 = i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        if (i9 != 0) {
            i4 |= 12582912;
        } else if ((i2 & 12582912) == 0) {
            if (l46Var.i(x16Var)) {
                i10 = 8388608;
            } else {
                i10 = 4194304;
            }
            i4 |= i10;
        }
        if ((i2 & 100663296) == 0) {
            if (l46Var.i(x16Var2)) {
                i12 = 67108864;
            } else {
                i12 = 33554432;
            }
            i4 |= i12;
        }
        if ((i2 & 805306368) == 0) {
            if (l46Var.i(x16Var3)) {
                i11 = 536870912;
            } else {
                i11 = 268435456;
            }
            i4 |= i11;
        }
        z5 = false;
        b3 = 0;
        b2 = 0;
        if ((i4 & 306783379) != 306783378) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (l46Var.W(i4 & 1, z6)) {
            l46Var.b0();
            if ((i2 & 1) != 0) {
                if ((i3 & 4) != 0) {
                    i4 &= -897;
                    strQ = afc.q(R.string.button_continue, l46Var);
                }
                if ((i3 & 8) != 0) {
                    strQ2 = afc.q(R.string.button_cancel, l46Var);
                    i4 &= -7169;
                }
                if (i15 != 0) {
                    z3 = true;
                }
                if (i5 != 0) {
                    z4 = true;
                }
                if (i7 != 0) {
                    s84Var2 = new s84(z5, (boolean) (b2 == true ? 1 : 0), 4);
                }
                if (i9 != 0) {
                    objR = l46Var.R();
                    if (objR == sf2.a) {
                        objR = new i7b(b3 == true ? 1 : 0);
                        l46Var.p0(objR);
                    }
                    x16Var5 = (x16) objR;
                } else {
                    x16Var5 = x16Var;
                }
            } else {
                if ((i3 & 4) != 0) {
                    i4 &= -897;
                    strQ = afc.q(R.string.button_continue, l46Var);
                }
                if ((i3 & 8) != 0) {
                    strQ2 = afc.q(R.string.button_cancel, l46Var);
                    i4 &= -7169;
                }
                if (i15 != 0) {
                    z3 = true;
                }
                if (i5 != 0) {
                    z4 = true;
                }
                if (i7 != 0) {
                    s84Var2 = new s84(z5, (boolean) (b2 == true ? 1 : 0), 4);
                }
                if (i9 != 0) {
                    objR = l46Var.R();
                    if (objR == sf2.a) {
                        objR = new i7b(b3 == true ? 1 : 0);
                        l46Var.p0(objR);
                    }
                    x16Var5 = (x16) objR;
                } else {
                    x16Var5 = x16Var;
                }
            }
            final String str112 = strQ;
            final String str113 = strQ2;
            final boolean z115 = z3;
            final boolean z116 = z4;
            s84 s84Var12 = s84Var2;
            l46Var.s();
            zF = k8b.f((e8b) l46Var.k(l8b.a));
            if (zF) {
                l46Var.f0(-1712128979);
                y6cVarB = eze.a(l46Var).a.j;
                l46Var.r(false);
            } else {
                l46Var.f0(-1712128512);
                l46Var.r(false);
                y6cVarB = a7c.b(24.0f);
            }
            final y6c y6cVar9 = y6cVarB;
            final float f10 = zF ? 24.0f : 32.0f;
            final gh6 gh6VarW8 = w0(l46Var);
            x16 x16Var14 = x16Var5;
            t72.b(x16Var14, s84Var12, af1.b0(1044811230, new l26() { // from class: j7b
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v13 */
                /* JADX WARN: Type inference failed for: r0v2 */
                /* JADX WARN: Type inference failed for: r0v3, types: [boolean, int] */
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
                @Override // defpackage.l26
                public final Object z(Object obj, Object obj2) {
                    he2 he2Var;
                    he2 he2Var2;
                    he2 he2Var3;
                    he2 he2Var4;
                    ov7 ov7Var;
                    ?? r0;
                    g09 g09Var;
                    pr4 pr4Var;
                    jx0 jx0Var;
                    l46 l46Var2;
                    y6c y6cVar10;
                    y6c y6cVar11;
                    x16 x16Var15;
                    float f11;
                    j09 j09VarA;
                    l46 l46Var3 = (l46) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (l46Var3.W(iIntValue & 1, (iIntValue & 3) != 2)) {
                        g09 g09Var2 = g09.a;
                        j09 j09VarE = oa7.E(androidx.compose.foundation.layout.b.c(g09Var2, 1.0f), y6cVar9);
                        pr4 pr4Var2 = o82.a;
                        j09 j09VarA0 = ynb.a0(tm7.o(j09VarE, ((m82) l46Var3.k(pr4Var2)).p, g21.f), f10, 24.0f);
                        jx0 jx0Var2 = ndb.Z;
                        c92 c92VarA = a92.a(xc0.c, jx0Var2, l46Var3, 48);
                        int iHashCode = Long.hashCode(l46Var3.T);
                        u8a u8aVarM = l46Var3.m();
                        j09 j09VarJ = m93.J(l46Var3, j09VarA0);
                        lf2.q.getClass();
                        l46Var3.j0();
                        boolean z117 = l46Var3.S;
                        ov7 ov7Var2 = LayoutNode.h1;
                        if (z117) {
                            l46Var3.l(ov7Var2);
                        } else {
                            l46Var3.s0();
                        }
                        he2 he2Var5 = hj6.z;
                        dec.l(he2Var5, l46Var3, c92VarA);
                        he2 he2Var6 = hj6.y;
                        dec.l(he2Var6, l46Var3, u8aVarM);
                        Integer numValueOf = Integer.valueOf(iHashCode);
                        he2 he2Var7 = hj6.X;
                        dec.l(he2Var7, l46Var3, numValueOf);
                        dec.k(l46Var3);
                        he2 he2Var8 = hj6.x;
                        dec.l(he2Var8, l46Var3, j09VarJ);
                        String str114 = str;
                        if (str114 == null) {
                            l46Var3.f0(1527905729);
                            l46Var3.r(false);
                            r0 = 0;
                            g09Var = g09Var2;
                            pr4Var = pr4Var2;
                            jx0Var = jx0Var2;
                            he2Var = he2Var6;
                            he2Var2 = he2Var8;
                            he2Var3 = he2Var7;
                            he2Var4 = he2Var5;
                            ov7Var = ov7Var2;
                            l46Var2 = l46Var3;
                        } else {
                            l46Var3.f0(1527905730);
                            he2Var = he2Var6;
                            he2Var2 = he2Var8;
                            he2Var3 = he2Var7;
                            he2Var4 = he2Var5;
                            ov7Var = ov7Var2;
                            r0 = 0;
                            g09Var = g09Var2;
                            pr4Var = pr4Var2;
                            jx0Var = jx0Var2;
                            nte.b(str114, null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mue.a((mue) l46Var3.k(nte.a), 0L, w6c.l(23), new ar5(700), cr5.h, 0L, null, 0, w6c.l(32), null, null, 16646105), l46Var3, 0, 0, 131070);
                            l46 l46Var4 = l46Var3;
                            l46Var4.r(false);
                            l46Var2 = l46Var4;
                        }
                        g09 g09Var3 = g09Var;
                        o5c.f(l46Var2, androidx.compose.foundation.layout.b.d(g09Var3, 12.0f));
                        l26Var.z(l46Var2, Integer.valueOf((int) r0));
                        o5c.f(l46Var2, androidx.compose.foundation.layout.b.d(g09Var3, 20.0f));
                        if (zF) {
                            l46Var2.f0(-1613267814);
                            y6cVar10 = eze.a(l46Var2).a.j;
                        } else {
                            l46Var2.f0(-1613266759);
                            y6cVar10 = ((s5d) l46Var2.k(u5d.a)).d;
                        }
                        l46Var2.r(r0);
                        y6c y6cVar12 = y6cVar10;
                        j09 j09VarF = urg.F(new mq6(jx0Var), ia7.a);
                        t7c t7cVarA = s7c.a(new uc0(8.0f, true, new qc0(r0)), ndb.z, l46Var2, 54);
                        int iHashCode2 = Long.hashCode(l46Var2.T);
                        u8a u8aVarM2 = l46Var2.m();
                        j09 j09VarJ2 = m93.J(l46Var2, j09VarF);
                        l46Var2.j0();
                        if (l46Var2.S) {
                            l46Var2.l(ov7Var);
                        } else {
                            l46Var2.s0();
                        }
                        dec.l(he2Var4, l46Var2, t7cVarA);
                        dec.l(he2Var, l46Var2, u8aVarM2);
                        ib8.s(iHashCode2, l46Var2, he2Var3, l46Var2);
                        dec.l(he2Var2, l46Var2, j09VarJ2);
                        x16 x16Var16 = x16Var2;
                        if (x16Var16 != null) {
                            l46Var2.f0(-324977123);
                            if (1.0f <= 0.0d) {
                                g37.a("invalid weight; must be greater than zero");
                            }
                            j09 j09VarD = androidx.compose.foundation.layout.b.b(0.0f, 48.0f, new jw7(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), 1).D(androidx.compose.foundation.layout.b.b);
                            bx9 bx9VarQ = ynb.q(12.0f, 0.0f, 2);
                            bx9 bx9Var = v51.a;
                            x16Var15 = x16Var16;
                            f11 = 1.0f;
                            cgg.k(x16Var15, j09VarD, z116, y6cVar12, v51.g(0L, ((m82) l46Var2.k(pr4Var)).o, l46Var2, 13), null, bx9VarQ, af1.b0(366212805, new ob0(str113, 19), l46Var2), l46Var2, 817889280, 352);
                            y6cVar11 = y6cVar12;
                            l46Var2.r(r0);
                        } else {
                            y6cVar11 = y6cVar12;
                            x16Var15 = x16Var16;
                            f11 = 1.0f;
                            l46Var2.f0(-324401174);
                            l46Var2.r(r0);
                        }
                        if (x16Var15 != null) {
                            if (f11 <= 0.0d) {
                                g37.a("invalid weight; must be greater than zero");
                            }
                            j09VarA = androidx.compose.foundation.layout.b.b(0.0f, 48.0f, new jw7(f11 > Float.MAX_VALUE ? Float.MAX_VALUE : f11, true), 1).D(androidx.compose.foundation.layout.b.b);
                        } else {
                            j09VarA = androidx.compose.foundation.layout.b.a(g09Var3, 180.0f, 48.0f);
                        }
                        bx9 bx9Var2 = v51.a;
                        u51 u51VarA = v51.a(eze.a(l46Var2).b.z(l46Var2), eze.a(l46Var2).b.A(l46Var2), 0L, 0L, l46Var2, 12);
                        bx9 bx9Var3 = new bx9(12.0f, 4.0f, 12.0f, 4.0f);
                        gh6 gh6Var = gh6VarW8;
                        boolean zI = l46Var2.i(gh6Var);
                        x16 x16Var17 = x16Var3;
                        boolean zG = zI | l46Var2.g(x16Var17);
                        Object objR2 = l46Var2.R();
                        if (zG || objR2 == sf2.a) {
                            objR2 = new sj2(gh6Var, x16Var17, 5);
                            l46Var2.p0(objR2);
                        }
                        cgg.a((x16) objR2, j09VarA, z115, y6cVar11, u51VarA, null, null, bx9Var3, af1.b0(1124396200, new ob0(str112, 20), l46Var2), l46Var2, 817889280, 352);
                        l46Var2.r(true);
                        l46Var2.r(true);
                    } else {
                        l46Var3.Z();
                    }
                    return wef.a;
                }
            }, l46Var), l46Var, ((i4 >> 15) & 112) | ((i4 >> 21) & 14) | 384, 0);
            s84Var2 = s84Var12;
            x16Var4 = x16Var14;
            z8 = z116;
            z7 = z115;
            str5 = str113;
            str4 = str112;
        } else {
            l46Var.Z();
            str4 = strQ;
            str5 = strQ2;
            z7 = z3;
            z8 = z4;
            x16Var4 = x16Var;
        }
        s84Var3 = s84Var2;
        ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new yk(str, l26Var, str4, str5, z7, z8, s84Var3, x16Var4, x16Var2, x16Var3, i2, i3);
        }
    }

    public static final void G(esb esbVar, kw5 kw5Var, j09 j09Var, l46 l46Var, int i2) {
        l46Var.h0(287969941);
        int i3 = i2 | (l46Var.g(esbVar) ? 4 : 2) | (l46Var.g(kw5Var) ? 32 : 16);
        if (l46Var.W(i3 & 1, (i3 & 147) != 146)) {
            boolean zS = g21.S(l46Var);
            nae.a(j09Var.D(androidx.compose.foundation.layout.b.c), a7c.b(24.0f), zS ? kw5Var.a : kw5Var.b, 0L, 0.0f, 0.0f, x57.b(((e8b) l46Var.k(l8b.a)).A, 0.5f), af1.b0(-856699216, new kg(zS, esbVar, kw5Var, 5), l46Var), l46Var, 12582912, 56);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new m65(i2, esbVar, kw5Var, j09Var, 2);
        }
    }

    public static final void H(mic micVar, l46 l46Var, int i2) {
        int i3;
        int i4;
        long jB;
        l46 l46Var2 = l46Var;
        l46Var2.h0(85803913);
        if ((i2 & 6) == 0) {
            i3 = i2 | (l46Var2.e(micVar.ordinal()) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if (l46Var2.W(i3 & 1, (i3 & 3) != 2)) {
            Object objR = l46Var2.R();
            i8c i8cVar = sf2.a;
            if (objR == i8cVar) {
                objR = new mz4(24);
                l46Var2.p0(objR);
            }
            cs3 cs3VarB = ay9.b(0, 384, 3, (x16) objR, l46Var2);
            hzc hzcVar = cs3VarB.d;
            Object objR2 = l46Var2.R();
            if (objR2 == i8cVar) {
                objR2 = af1.E(l46Var2);
                l46Var2.p0(objR2);
            }
            aw2 aw2Var = (aw2) objR2;
            boolean z = (i3 & 14) == 4;
            Object objR3 = l46Var2.R();
            if (z || objR3 == i8cVar) {
                os5 os5VarW = if9.w(micVar);
                objR3 = t72.I(new esb(R.string.four_seasons_report_overview_title, R.string.four_seasons_report_overview_subtitle, R.string.four_seasons_report_overview_desc, R.string.four_seasons_report_overview_body, os5VarW.f, os5VarW.g), new esb(R.string.four_seasons_report_elements_title, R.string.four_seasons_report_elements_subtitle, R.string.four_seasons_report_elements_desc, R.string.four_seasons_report_elements_body, os5VarW.h, os5VarW.i), new esb(R.string.four_seasons_report_summary_title, R.string.four_seasons_report_summary_subtitle, R.string.four_seasons_report_summary_desc, R.string.four_seasons_report_summary_body, os5VarW.j, os5VarW.k));
                l46Var2.p0(objR3);
            }
            List list = (List) objR3;
            List listI = t72.I(new kw5(bx5.b(l46Var2).l, bx5.b(l46Var2).m, bx5.b(l46Var2).c, bx5.b(l46Var2).b), new kw5(abg.c(1304149222), abg.c(1296583310), abg.d(4284244168L), abg.d(4287401961L)), new kw5(abg.c(1307624885), abg.c(1298224200), abg.d(4291588169L), abg.d(4290477153L)));
            Integer numValueOf = Integer.valueOf(((sz9) hzcVar.c).j());
            boolean zI = l46Var2.i(aw2Var) | l46Var2.g(cs3VarB);
            Object objR4 = l46Var2.R();
            if (zI || objR4 == i8cVar) {
                objR4 = new gu5(null, aw2Var, cs3VarB);
                l46Var2.p0(objR4);
            }
            af1.o((l26) objR4, l46Var2, numValueOf);
            g09 g09Var = g09.a;
            j09 j09VarC = androidx.compose.foundation.layout.b.c(g09Var, 1.0f);
            c92 c92VarA = a92.a(new uc0(16.0f, true, new qc0(0)), ndb.Z, l46Var2, 54);
            int iHashCode = Long.hashCode(l46Var2.T);
            u8a u8aVarM = l46Var2.m();
            j09 j09VarJ = m93.J(l46Var2, j09VarC);
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
            Integer numValueOf2 = Integer.valueOf(iHashCode);
            he2 he2Var3 = hj6.X;
            dec.l(he2Var3, l46Var2, numValueOf2);
            dec.k(l46Var2);
            he2 he2Var4 = hj6.x;
            dec.l(he2Var4, l46Var2, j09VarJ);
            String strQ = afc.q(R.string.four_seasons_preview_title, l46Var2);
            mue mueVar = pue.a;
            hzc hzcVar2 = hzcVar;
            nte.b(strQ, null, ((e8b) l46Var2.k(l8b.a)).q, 0L, null, ((y8b) l46Var2.k(x8b.a)).a, 0L, null, null, 0L, 0, false, 0, 0, null, pue.n(l46Var2), l46Var, 0, 0, 130938);
            l46Var2 = l46Var;
            a(cs3VarB, androidx.compose.foundation.layout.b.c(g09Var, 1.0f), af1.b0(-1306278144, new w7(20, cs3VarB, aw2Var), l46Var2), af1.b0(-1842803697, new w7(21, list, listI), l46Var2), l46Var2, 28080);
            j09 j09VarB0 = ynb.b0(4.0f, 0.0f, g09Var, 2);
            i4 = 0;
            t7c t7cVarA = s7c.a(new uc0(8.0f, true, new qc0(i4)), ndb.y, l46Var2, 6);
            int iHashCode2 = Long.hashCode(l46Var2.T);
            u8a u8aVarM2 = l46Var2.m();
            j09 j09VarJ2 = m93.J(l46Var2, j09VarB0);
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
            l46Var2.f0(2142192);
            int iL = cs3VarB.l();
            int i5 = 0;
            while (i5 < iL) {
                j09 j09VarE = oa7.E(androidx.compose.foundation.layout.b.l(g09Var, 8.0f), a7c.a);
                hzc hzcVar3 = hzcVar2;
                if (((sz9) hzcVar3.c).j() == i5) {
                    l46Var2.f0(-1101955445);
                    jB = bx5.b(l46Var2).a;
                    l46Var2.r(false);
                } else {
                    l46Var2.f0(-1101953275);
                    jB = y72.b(((e8b) l46Var2.k(l8b.a)).r, 0.3f);
                    l46Var2.r(false);
                }
                s21.a(tm7.o(j09VarE, jB, g21.f), l46Var2, 0);
                i5++;
                hzcVar2 = hzcVar3;
            }
            tec.s(l46Var2, false, true, true);
        } else {
            i4 = 0;
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new it5(micVar, i2, i4);
        }
    }

    public static final void I(x16 x16Var, l46 l46Var, int i2) {
        int i3;
        l46Var.h0(-1504864563);
        int i4 = 2;
        if ((i2 & 6) == 0) {
            i3 = (l46Var.i(x16Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if (l46Var.W(i3 & 1, (i3 & 3) != 2)) {
            ca2.a.getClass();
            if (!ca2.c) {
                ojb ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    ojbVarV.d = new lk3(i2, i4, x16Var);
                    return;
                }
                return;
            }
            String strQ = afc.q(R.string.four_seasons_restore_purchase, l46Var);
            mue mueVar = pue.a;
            nte.b(strQ, b.c(g09.a, false, null, null, x16Var, 15), bx5.b(l46Var).a, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, pue.g(l46Var), l46Var, 0, 0, 131064);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV2 = l46Var.v();
        if (ojbVarV2 != null) {
            ojbVarV2.d = new lk3(i2, 3, x16Var);
        }
    }

    public static final void J(TarotCardType tarotCardType, l46 l46Var, int i2) {
        g09 g09Var;
        int i3;
        l46 l46Var2 = l46Var;
        l46Var2.h0(1690509419);
        int i4 = i2 | (l46Var2.e(tarotCardType == null ? -1 : tarotCardType.ordinal()) ? 4 : 2);
        if (l46Var2.W(i4 & 1, (i4 & 3) != 2)) {
            t7c t7cVarA = s7c.a(xc0.a, ndb.y, l46Var2, 0);
            int iHashCode = Long.hashCode(l46Var2.T);
            u8a u8aVarM = l46Var2.m();
            g09 g09Var2 = g09.a;
            j09 j09VarJ = m93.J(l46Var2, g09Var2);
            lf2.q.getClass();
            l46Var2.j0();
            boolean z = l46Var2.S;
            ov7 ov7Var = LayoutNode.h1;
            if (z) {
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
            j09 j09VarD0 = ynb.d0(24.0f, 0.0f, 0.0f, 0.0f, 14, new jw7(1.0f, true));
            c92 c92VarA = a92.a(xc0.c, ndb.Y, l46Var2, 0);
            int iHashCode2 = Long.hashCode(l46Var2.T);
            u8a u8aVarM2 = l46Var2.m();
            j09 j09VarJ2 = m93.J(l46Var2, j09VarD0);
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
            mue mueVar = pue.a;
            mue mueVarM = pue.m(l46Var2);
            pr4 pr4Var = x8b.a;
            iqf.a(afc.q(R.string.personality_result_title, l46Var2), null, 0L, mue.a(mueVarM, 0L, 0L, null, ((y8b) l46Var2.k(pr4Var)).a, 0L, null, 0, 0L, null, null, 16777183), w6c.l(19), w6c.l(32), l46Var, 221184, 6);
            l46 l46Var3 = l46Var;
            o5c.f(l46Var3, androidx.compose.foundation.layout.b.d(g09Var2, 9.0f));
            if (tarotCardType == null) {
                l46Var3.f0(-616926262);
                l46Var3.r(false);
                i3 = 0;
                g09Var = g09Var2;
            } else {
                l46Var3.f0(-616926261);
                g09Var = g09Var2;
                i3 = 0;
                nte.b(afc.q(tarotCardType.getTitleRes(), l46Var3), null, ((e8b) l46Var3.k(l8b.a)).u, 0L, null, ((y8b) l46Var3.k(pr4Var)).a, 0L, null, null, 0L, 0, false, 0, 0, null, pue.l(l46Var3), l46Var, 0, 0, 130938);
                l46Var3 = l46Var;
                l46Var3.r(false);
            }
            l46Var3.r(true);
            m27 m27VarW = af1.w(af1.c0(null, l46Var3, 1), -10.0f, -30.0f, b21.D(b21.T(1000, i3, null, 6), lrb.b, 4), null, l46Var3, 4104, 8);
            fy9 fy9VarA = od4.A(R.drawable.personal_test_lock_report, i3, l46Var3);
            j09 j09VarD1 = ynb.d0(24.0f, 0.0f, 32.0f, 0.0f, 10, androidx.compose.foundation.layout.b.p(g09Var, 128.0f));
            boolean zG = l46Var3.g(m27VarW);
            Object objR = l46Var3.R();
            if (zG || objR == sf2.a) {
                objR = new wh1(9, m27VarW);
                l46Var3.p0(objR);
            }
            feg.j(fy9VarA, null, oa7.E(bzd.x(j09VarD1, (a26) objR), a7c.b(8.0f)), null, an2.d, 0.0f, null, l46Var, 24632, 104);
            l46Var2 = l46Var;
            l46Var2.r(true);
        } else {
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new eq1(tarotCardType, i2, 2);
        }
    }

    public static final void K(j09 j09Var, fy9 fy9Var, String str, l46 l46Var, int i2) {
        l46 l46Var2 = l46Var;
        l46Var2.h0(-1647990880);
        int i3 = i2 | (l46Var2.g(j09Var) ? 4 : 2) | (l46Var2.i(fy9Var) ? 32 : 16) | (l46Var2.g(str) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | 3072;
        if (l46Var2.W(i3 & 1, (i3 & 1171) != 1170)) {
            c92 c92VarA = a92.a(xc0.c, ndb.Z, l46Var2, 48);
            int iHashCode = Long.hashCode(l46Var2.T);
            u8a u8aVarM = l46Var2.m();
            j09 j09VarJ = m93.J(l46Var2, j09Var);
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
            g09 g09Var = g09.a;
            feg.j(fy9Var, null, androidx.compose.foundation.layout.b.l(g09Var, 48.0f), null, null, 0.0f, null, l46Var2, 440 | ((i3 >> 3) & 14), 120);
            o5c.f(l46Var2, androidx.compose.foundation.layout.b.d(g09Var, 12.0f));
            mue mueVar = oue.a;
            nte.b(str, null, 0L, 0L, null, null, 0L, null, new jme(3), 0L, 0, false, 0, 0, null, mue.a(pue.d(l46Var2), 0L, 0L, null, null, 0L, null, 0, w6c.l(18), null, null, 16646143), l46Var, (i3 >> 6) & 14, 0, 130046);
            l46Var2 = l46Var;
            l46Var2.f0(-301457575);
            l46Var2.r(false);
            l46Var2.r(true);
        } else {
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new x6(i2, j09Var, fy9Var, str, 11);
        }
    }

    public static final void L(j09 j09Var, l46 l46Var, int i2) {
        int i3;
        boolean z;
        e89 e89Var;
        Object obj;
        j09 j09Var2 = j09Var;
        l46Var.h0(607787355);
        int i4 = (l46Var.g(j09Var2) ? 4 : 2) | i2;
        int i5 = 0;
        if (l46Var.W(i4 & 1, (i4 & 3) != 2)) {
            Context context = (Context) l46Var.k(uq.b);
            pwf pwfVarA = qd8.a(l46Var);
            if (pwfVarA == null) {
                qc0.p("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            gy2 gy2VarR = b21.r(pwfVarA);
            nfc nfcVarB = kr7.b(l46Var);
            kob kobVar = job.a;
            oc7 oc7Var = (oc7) z5c.G(kobVar.b(oc7.class), pwfVarA.g(), null, gy2VarR, nfcVarB, null);
            vz9 vz9Var = oc7Var.f;
            nfc nfcVarB2 = kr7.b(l46Var);
            boolean zG = l46Var.g(null) | l46Var.g(nfcVarB2);
            Object objR = l46Var.R();
            i3 = 3;
            Object obj2 = sf2.a;
            if (zG || objR == obj2) {
                objR = nfcVarB2.b(kobVar.b(t7.class), null, null);
                l46Var.p0(objR);
            }
            Object obj3 = (t7) objR;
            boolean z2 = ((InvitationInfo) vz9Var.getValue()).getMaxFreeChatCount() <= ((InvitationInfo) vz9Var.getValue()).getInvitedCount();
            Object objR2 = l46Var.R();
            if (objR2 == obj2) {
                objR2 = q1c.f(Boolean.FALSE);
                l46Var.p0(objR2);
            }
            e89 e89Var2 = (e89) objR2;
            if (((Boolean) e89Var2.getValue()).booleanValue()) {
                l46Var.f0(-988666196);
                boolean zI = l46Var.i(oc7Var) | l46Var.i(context);
                Object objR3 = l46Var.R();
                if (zI || objR3 == obj2) {
                    objR3 = new oc2(oc7Var, context, e89Var2, i5);
                    l46Var.p0(objR3);
                }
                a26 a26Var = (a26) objR3;
                Object objR4 = l46Var.R();
                if (objR4 == obj2) {
                    objR4 = new i8(e89Var2, 22);
                    l46Var.p0(objR4);
                }
                e89Var = e89Var2;
                obj = obj3;
                z = z2;
                d8c.c(null, 0L, 0L, a26Var, (x16) objR4, l46Var, 196608);
                l46Var.r(false);
            } else {
                z = z2;
                e89Var = e89Var2;
                obj = obj3;
                l46Var.f0(-988486489);
                l46Var.r(false);
            }
            bx9 bx9Var = v51.a;
            b1b b1bVar = o82.a;
            u51 u51VarA = v51.a(((m82) l46Var.k(b1bVar)).u, ((m82) l46Var.k(b1bVar)).v, 0L, 0L, l46Var, 12);
            boolean zI2 = l46Var.i(obj) | l46Var.i(context);
            Object objR5 = l46Var.R();
            if (zI2 || objR5 == obj2) {
                objR5 = new j8(obj, context, e89Var, 9);
                l46Var.p0(objR5);
            }
            j09Var2 = j09Var;
            cgg.a((x16) objR5, j09Var2, false, null, u51VarA, null, null, null, af1.b0(340054891, new g8(z, 2), l46Var), l46Var, ((i4 << 3) & 112) | 805306368, 492);
        } else {
            i3 = 3;
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new l50(i2, i3, j09Var2);
        }
    }

    public static final void M(mic micVar, qs5 qs5Var, l46 l46Var, int i2) {
        int i3;
        l46Var.h0(-932923624);
        if ((i2 & 6) == 0) {
            i3 = (l46Var.e(micVar.ordinal()) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= l46Var.e(qs5Var.ordinal()) ? 32 : 16;
        }
        if (l46Var.W(i3 & 1, (i3 & 19) != 18)) {
            nae.a(ynb.b0(20.0f, 0.0f, androidx.compose.foundation.layout.b.c(g09.a, 1.0f), 2), a7c.b(20.0f), bx5.e(l46Var), 0L, 0.0f, 0.0f, x57.b(bx5.f(l46Var), 1.0f), af1.b0(1870904669, new jt5(micVar, qs5Var), l46Var), l46Var, 12582918, 56);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new gc(micVar, qs5Var, i2, 20);
        }
    }

    public static final void N(final boolean z, final long j2, j09 j09Var, l46 l46Var, int i2) {
        int i3;
        l46Var.h0(-20787384);
        if ((i2 & 6) == 0) {
            i3 = (l46Var.h(z) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        int i4 = i3 | (l46Var.f(j2) ? 32 : 16) | (l46Var.g(j09Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
        if (l46Var.W(i4 & 1, (i4 & 147) != 146)) {
            j09 j09VarD = androidx.compose.foundation.layout.b.d(j09Var, 20.0f);
            boolean z2 = ((i4 & 14) == 4) | ((i4 & 112) == 32);
            Object objR = l46Var.R();
            if (z2 || objR == sf2.a) {
                objR = new a26() { // from class: pt5
                    @Override // defpackage.a26
                    public final Object d(Object obj) {
                        sn4 sn4Var = (sn4) obj;
                        sn4Var.getClass();
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (sn4Var.f() & 4294967295L)) / 2.0f;
                        float fP0 = sn4Var.p0(1.5f);
                        boolean z3 = z;
                        long j3 = j2;
                        if (z3) {
                            sn4.V0(sn4Var, j3, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L), (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (sn4Var.f() >> 32)))) << 32), fP0, 1, null, 480);
                        } else {
                            sn4.V0(sn4Var, j3, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L), (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (sn4Var.f() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L), fP0, 0, rxg.w(new float[]{sn4Var.p0(3.0f), sn4Var.p0(3.0f)}), 464);
                        }
                        return wef.a;
                    }
                };
                l46Var.p0(objR);
            }
            nk8.e(0, (a26) objR, l46Var, j09VarD);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new tb(z, j2, j09Var, i2, 1);
        }
    }

    public static final void O(mic micVar, qs5 qs5Var, l46 l46Var, int i2) {
        int i3;
        List list;
        Object obj;
        int i4;
        l46 l46Var2 = l46Var;
        l46Var2.h0(-2008075269);
        int i5 = i2 | (l46Var2.e(micVar.ordinal()) ? 4 : 2) | (l46Var2.e(qs5Var.ordinal()) ? 32 : 16);
        int i6 = 0;
        if (l46Var2.W(i5 & 1, (i5 & 19) != 18)) {
            int iOrdinal = micVar.ordinal();
            if (iOrdinal == 0) {
                i3 = R.string.four_seasons_card_unlock_time;
            } else {
                if (iOrdinal != 1) {
                    ap.c();
                    return;
                }
                i3 = R.string.four_seasons_card_autumn_unlock_time;
            }
            List listC0 = v4e.c0(afc.q(i3, l46Var2), new String[]{"\n"}, 6);
            c92 c92VarA = a92.a(new uc0(8.0f, true, new qc0(i6)), ndb.Y, l46Var2, 6);
            int iHashCode = Long.hashCode(l46Var2.T);
            u8a u8aVarM = l46Var2.m();
            g09 g09Var = g09.a;
            j09 j09VarJ = m93.J(l46Var2, g09Var);
            lf2.q.getClass();
            l46Var2.j0();
            boolean z = l46Var2.S;
            ov7 ov7Var = LayoutNode.h1;
            if (z) {
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
            j09 j09VarC = androidx.compose.foundation.layout.b.c(g09Var, 1.0f);
            kx0 kx0Var = ndb.z;
            m8c m8cVar = xc0.g;
            t7c t7cVarA = s7c.a(m8cVar, kx0Var, l46Var2, 54);
            int iHashCode2 = Long.hashCode(l46Var2.T);
            u8a u8aVarM2 = l46Var2.m();
            j09 j09VarJ2 = m93.J(l46Var2, j09VarC);
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
            String strR = afc.r(R.string.four_seasons_card_name, new Object[]{afc.q(rmc.a(micVar), l46Var2)}, l46Var2);
            mue mueVar = pue.a;
            mue mueVarB = pue.b(l46Var2);
            pr4 pr4Var = l8b.a;
            nte.b(strR, new jw7(1.0f, true), ((e8b) l46Var2.k(pr4Var)).q, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mueVarB, l46Var, 0, 0, 131064);
            if (listC0.size() > 0) {
                list = listC0;
                obj = list.get(0);
            } else {
                list = listC0;
                obj = "";
            }
            List list2 = list;
            nte.b((String) obj, androidx.compose.foundation.layout.b.q(0.0f, 160.0f, ynb.d0(12.0f, 0.0f, 0.0f, 0.0f, 14, g09Var), 1), ((e8b) l46Var.k(pr4Var)).q, 0L, null, null, 0L, null, new jme(6), 0L, 0, false, 0, 0, null, pue.a, l46Var, 48, 0, 130040);
            l46Var.r(true);
            j09 j09VarC2 = androidx.compose.foundation.layout.b.c(g09Var, 1.0f);
            t7c t7cVarA2 = s7c.a(m8cVar, kx0Var, l46Var, 54);
            int iHashCode3 = Long.hashCode(l46Var.T);
            u8a u8aVarM3 = l46Var.m();
            j09 j09VarJ3 = m93.J(l46Var, j09VarC2);
            l46Var.j0();
            if (l46Var.S) {
                l46Var.l(ov7Var);
            } else {
                l46Var.s0();
            }
            dec.l(he2Var, l46Var, t7cVarA2);
            dec.l(he2Var2, l46Var, u8aVarM3);
            ib8.s(iHashCode3, l46Var, he2Var3, l46Var);
            dec.l(he2Var4, l46Var, j09VarJ3);
            int iOrdinal2 = qs5Var.ordinal();
            if (iOrdinal2 == 0 || iOrdinal2 == 1 || iOrdinal2 == 2) {
                i4 = R.string.four_seasons_card_preview_tag;
            } else {
                i4 = (iOrdinal2 == 7 || iOrdinal2 == 8 || iOrdinal2 == 9) ? R.string.four_seasons_card_ended_tag : R.string.four_seasons_card_tag;
            }
            nte.b(afc.q(i4, l46Var), null, ((e8b) l46Var.k(pr4Var)).s, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, pue.g(l46Var), l46Var, 0, 0, 131066);
            nte.b((String) (1 < list2.size() ? list2.get(1) : ""), null, ((e8b) l46Var.k(pr4Var)).s, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, pue.g(l46Var), l46Var, 0, 0, 131066);
            l46Var2 = l46Var;
            l46Var2.r(true);
            l46Var2.r(true);
        } else {
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new jt5(micVar, qs5Var, i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v9 */
    public static final void P(final int i2, int i3, final ctd ctdVar, final long j2, l46 l46Var, final int i4) {
        l46 l46Var2;
        ?? r0;
        long j3;
        long j4;
        final int i5 = i3;
        l46 l46Var3 = l46Var;
        l46Var3.h0(1173732198);
        int i6 = (l46Var3.e(i2) ? 4 : 2) | i4 | (l46Var3.e(i5) ? 32 : 16);
        if ((i4 & 384) == 0) {
            i6 |= l46Var3.e(ctdVar.ordinal()) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        int i7 = i6 | (l46Var3.f(j2) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE);
        int i8 = 0;
        if (l46Var3.W(i7 & 1, (i7 & 1171) != 1170)) {
            List listC0 = v4e.c0(afc.q(i2, l46Var3), new String[]{" "}, 6);
            boolean z = ctdVar == ctd.b;
            g09 g09Var = g09.a;
            j09 j09VarP = androidx.compose.foundation.layout.b.p(ynb.b0(2.0f, 0.0f, g09Var, 2), 20.0f);
            c92 c92VarA = a92.a(new uc0(6.0f, true, new qc0(i8)), ndb.Z, l46Var3, 54);
            int iHashCode = Long.hashCode(l46Var3.T);
            u8a u8aVarM = l46Var3.m();
            j09 j09VarJ = m93.J(l46Var3, j09VarP);
            lf2.q.getClass();
            l46Var3.j0();
            boolean z2 = l46Var3.S;
            ov7 ov7Var = LayoutNode.h1;
            if (z2) {
                l46Var3.l(ov7Var);
            } else {
                l46Var3.s0();
            }
            he2 he2Var = hj6.z;
            dec.l(he2Var, l46Var3, c92VarA);
            he2 he2Var2 = hj6.y;
            dec.l(he2Var2, l46Var3, u8aVarM);
            Integer numValueOf = Integer.valueOf(iHashCode);
            he2 he2Var3 = hj6.X;
            dec.l(he2Var3, l46Var3, numValueOf);
            dec.k(l46Var3);
            he2 he2Var4 = hj6.x;
            dec.l(he2Var4, l46Var3, j09VarJ);
            j09 j09VarL = androidx.compose.foundation.layout.b.l(g09Var, 20.0f);
            y6c y6cVar = a7c.a;
            j09 j09VarE = oa7.E(j09VarL, y6cVar);
            b1b b1bVar = l8b.a;
            j09 j09VarD = tm7.o(j09VarE, ((e8b) l46Var3.k(b1bVar)).c, g21.f).D(z ? db6.w(g09Var, 1.0f, j2, y6cVar) : g09Var);
            xn8 xn8VarC = s21.c(ndb.f, false);
            int iHashCode2 = Long.hashCode(l46Var3.T);
            u8a u8aVarM2 = l46Var3.m();
            j09 j09VarJ2 = m93.J(l46Var3, j09VarD);
            l46Var3.j0();
            if (l46Var3.S) {
                l46Var3.l(ov7Var);
            } else {
                l46Var3.s0();
            }
            dec.l(he2Var, l46Var3, xn8VarC);
            dec.l(he2Var2, l46Var3, u8aVarM2);
            ib8.s(iHashCode2, l46Var3, he2Var3, l46Var3);
            dec.l(he2Var4, l46Var3, j09VarJ2);
            i5 = i3;
            fy9 fy9VarA = od4.A(i5, (i7 >> 3) & 14, l46Var3);
            if (z) {
                l46Var3.f0(1229318704);
                r0 = 0;
                l46Var3.r(false);
                j3 = j2;
            } else {
                r0 = 0;
                l46Var3.f0(1229319324);
                j3 = ((e8b) l46Var3.k(b1bVar)).t;
                l46Var3.r(false);
            }
            gu6.b(fy9VarA, null, androidx.compose.foundation.layout.b.l(g09Var, 20.0f), j3, l46Var3, 440, 0);
            l46Var3.r(true);
            String str = (String) (listC0.size() > 0 ? listC0.get(r0) : "");
            mue mueVar = pue.a;
            mue mueVarI = pue.i(l46Var3);
            if (z) {
                l46Var3.f0(1397984502);
                l46Var3.r(r0);
                j4 = j2;
            } else {
                l46Var3.f0(1397985122);
                long j5 = ((e8b) l46Var3.k(b1bVar)).t;
                l46Var3.r(r0);
                j4 = j5;
            }
            nte.b(str, androidx.compose.foundation.layout.b.u(g09Var, 1), j4, 0L, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, mueVarI, l46Var, 48, 27648, 106488);
            Object obj = 1 < listC0.size() ? listC0.get(1) : "";
            nte.b((String) obj, androidx.compose.foundation.layout.b.u(g09Var, 1), ((e8b) l46Var.k(b1bVar)).t, 0L, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, pue.g(l46Var), l46Var, 48, 27648, 106488);
            l46 l46Var4 = l46Var;
            l46Var4.r(true);
            l46Var2 = l46Var4;
        } else {
            l46Var3.Z();
            l46Var2 = l46Var3;
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new l26() { // from class: qt5
                @Override // defpackage.l26
                public final Object z(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    kj0.P(i2, i5, ctdVar, j2, (l46) obj2, k99.P(i4 | 1));
                    return wef.a;
                }
            };
        }
    }

    public static final void Q(mic micVar, l46 l46Var, int i2) {
        long j2;
        ctd ctdVar;
        ctd ctdVar2;
        long jL;
        long j3;
        l46 l46Var2 = l46Var;
        l46Var2.h0(-1215321220);
        int i3 = (l46Var2.e(micVar.ordinal()) ? 4 : 2) | i2;
        if (l46Var2.W(i3 & 1, (i3 & 3) != 2)) {
            yv5 yv5Var = bx5.a;
            if (g21.S(l46Var2)) {
                l46Var2.f0(-1423945475);
                j2 = bx5.b(l46Var2).a;
                l46Var2.r(false);
            } else {
                l46Var2.f0(-1423944189);
                j2 = bx5.b(l46Var2).b;
                l46Var2.r(false);
            }
            long j4 = j2;
            int iOrdinal = micVar.ordinal();
            ctd ctdVar3 = ctd.a;
            ctd ctdVar4 = ctd.b;
            if (iOrdinal == 0) {
                ctdVar = ctdVar4;
            } else {
                if (iOrdinal != 1) {
                    ap.c();
                    return;
                }
                ctdVar = ctdVar3;
            }
            int iOrdinal2 = micVar.ordinal();
            ctd ctdVar5 = ctd.c;
            if (iOrdinal2 == 0) {
                ctdVar2 = ctdVar5;
            } else {
                if (iOrdinal2 != 1) {
                    ap.c();
                    return;
                }
                ctdVar2 = ctdVar4;
            }
            g09 g09Var = g09.a;
            j09 j09VarC = androidx.compose.foundation.layout.b.c(g09Var, 1.0f);
            t7c t7cVarA = s7c.a(xc0.a, ndb.y, l46Var2, 48);
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
            dec.l(hj6.z, l46Var2, t7cVarA);
            dec.l(hj6.y, l46Var2, u8aVarM);
            dec.l(hj6.X, l46Var2, Integer.valueOf(iHashCode));
            dec.k(l46Var2);
            dec.l(hj6.x, l46Var2, j09VarJ);
            long jL2 = l8b.l(l46Var2);
            v7c v7cVar = v7c.a;
            N(false, jL2, v7cVar.a(g09Var, 0.5f, true), l46Var2, 6);
            P(R.string.four_seasons_term_spring, R.drawable.ic_four_seasons_spring, ctdVar3, j4, l46Var, 384);
            if (ctdVar == ctdVar4) {
                l46Var.f0(446929598);
                l46Var.r(false);
                jL = j4;
            } else {
                l46Var.f0(446930220);
                jL = l8b.l(l46Var);
                l46Var.r(false);
            }
            N(true, jL, v7cVar.a(g09Var, 1.0f, true), l46Var, 6);
            P(R.string.four_seasons_term_summer, R.drawable.ic_four_seasons_summer, ctdVar, j4, l46Var, 0);
            boolean z = ctdVar2 == ctdVar4;
            if (ctdVar2 == ctdVar4) {
                l46Var.f0(446940094);
                l46Var.r(false);
                j3 = j4;
            } else {
                l46Var.f0(446940716);
                long jL3 = l8b.l(l46Var);
                l46Var.r(false);
                j3 = jL3;
            }
            N(z, j3, v7cVar.a(g09Var, 1.0f, true), l46Var, 0);
            P(R.string.four_seasons_term_autumn, R.drawable.ic_four_seasons_autumn, ctdVar2, j4, l46Var, 0);
            N(false, l8b.l(l46Var), v7cVar.a(g09Var, 1.0f, true), l46Var, 6);
            P(R.string.four_seasons_term_winter, R.drawable.ic_four_seasons_winter, ctdVar5, j4, l46Var, 384);
            l46Var2 = l46Var;
            N(false, l8b.l(l46Var), v7cVar.a(g09Var, 0.5f, true), l46Var2, 6);
            l46Var2.r(true);
        } else {
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new i1(micVar, i2, 24);
        }
    }

    public static final void R(mic micVar, l46 l46Var, int i2) {
        int i3;
        l46 l46Var2 = l46Var;
        l46Var2.h0(1898273444);
        if ((i2 & 6) == 0) {
            i3 = i2 | (l46Var2.e(micVar.ordinal()) ? 4 : 2);
        } else {
            i3 = i2;
        }
        int i4 = 0;
        if (l46Var2.W(i3 & 1, (i3 & 3) != 2)) {
            j09 j09VarB0 = ynb.b0(20.0f, 0.0f, androidx.compose.foundation.layout.b.c(g09.a, 1.0f), 2);
            c92 c92VarA = a92.a(new uc0(16.0f, true, new qc0(i4)), ndb.Z, l46Var2, 54);
            int iHashCode = Long.hashCode(l46Var2.T);
            u8a u8aVarM = l46Var2.m();
            j09 j09VarJ = m93.J(l46Var2, j09VarB0);
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
            String strQ = afc.q(R.string.four_seasons_spread_title, l46Var2);
            mue mueVar = pue.a;
            nte.b(strQ, null, ((e8b) l46Var2.k(l8b.a)).q, 0L, null, ((y8b) l46Var2.k(x8b.a)).a, 0L, null, null, 0L, 0, false, 0, 0, null, pue.n(l46Var2), l46Var, 0, 0, 130938);
            l46Var2 = l46Var;
            af1.m(micVar, null, null, bx5.e(l46Var), null, l46Var2, i3 & 14, 22);
            l46Var2.r(true);
        } else {
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new it5(micVar, i2, 2);
        }
    }

    public static final void S(int i2, int i3, String str, String str2, l46 l46Var, int i4) {
        long j2;
        l46Var.h0(-1275492866);
        int i5 = i4 | (l46Var.e(i3) ? 32 : 16) | (l46Var.g(str) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var.g(str2) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE);
        if (l46Var.W(i5 & 1, (i5 & 1171) != 1170)) {
            j09 j09VarC = androidx.compose.foundation.layout.b.c(g09.a, 1.0f);
            y6c y6cVarB = a7c.b(24.0f);
            yv5 yv5Var = bx5.a;
            if (g21.S(l46Var)) {
                l46Var.f0(-1944182258);
                j2 = bx5.b(l46Var).l;
                l46Var.r(false);
            } else {
                l46Var.f0(-1944180819);
                j2 = bx5.b(l46Var).m;
                l46Var.r(false);
            }
            nae.a(j09VarC, y6cVarB, j2, 0L, 0.0f, 0.0f, x57.b(((e8b) l46Var.k(l8b.a)).A, 0.5f), af1.b0(-273697213, new l20(i2, i3, 2, str, str2), l46Var), l46Var, 12582918, 56);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new l20(str, str2, i2, i3, i4, 3);
        }
    }

    public static final void T(mic micVar, l46 l46Var, int i2) {
        int i3;
        int i4;
        l46 l46Var2 = l46Var;
        l46Var2.h0(2112687101);
        if ((i2 & 6) == 0) {
            i3 = i2 | (l46Var2.e(micVar.ordinal()) ? 4 : 2);
        } else {
            i3 = i2;
        }
        int i5 = 0;
        if (l46Var2.W(i3 & 1, (i3 & 3) != 2)) {
            os5 os5VarW = if9.w(micVar);
            g09 g09Var = g09.a;
            j09 j09VarB0 = ynb.b0(20.0f, 0.0f, androidx.compose.foundation.layout.b.c(g09Var, 1.0f), 2);
            c92 c92VarA = a92.a(new uc0(24.0f, true, new qc0(i5)), ndb.Z, l46Var2, 54);
            int iHashCode = Long.hashCode(l46Var2.T);
            u8a u8aVarM = l46Var2.m();
            j09 j09VarJ = m93.J(l46Var2, j09VarB0);
            lf2.q.getClass();
            l46Var2.j0();
            boolean z = l46Var2.S;
            ov7 ov7Var = LayoutNode.h1;
            if (z) {
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
            String strQ = afc.q(R.string.four_seasons_workflow_title, l46Var2);
            mue mueVar = pue.a;
            nte.b(strQ, null, ((e8b) l46Var2.k(l8b.a)).q, 0L, null, ((y8b) l46Var2.k(x8b.a)).a, 0L, null, new jme(3), 0L, 0, false, 0, 0, null, pue.n(l46Var2), l46Var, 0, 0, 129914);
            l46Var2 = l46Var;
            i4 = 1;
            c92 c92VarA2 = a92.a(new uc0(8.0f, true, new qc0(0)), ndb.Y, l46Var2, 6);
            int iHashCode2 = Long.hashCode(l46Var2.T);
            u8a u8aVarM2 = l46Var2.m();
            j09 j09VarJ2 = m93.J(l46Var2, g09Var);
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
            S(1, os5VarW.m, afc.q(R.string.four_seasons_step1_title, l46Var2), afc.q(R.string.four_seasons_step1_desc, l46Var2), l46Var2, 6);
            S(2, os5VarW.n, afc.q(R.string.four_seasons_step2_title, l46Var2), afc.q(R.string.four_seasons_step2_desc, l46Var2), l46Var2, 6);
            S(3, os5VarW.o, afc.q(R.string.four_seasons_step3_title, l46Var2), afc.q(R.string.four_seasons_step3_desc, l46Var2), l46Var2, 6);
            l46Var2.r(true);
            l46Var2.r(true);
        } else {
            i4 = 1;
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new it5(micVar, i2, i4);
        }
    }

    public static final void U(ju5 ju5Var, ps5 ps5Var, x16 x16Var, a26 a26Var, l46 l46Var, int i2) {
        int i3;
        l46Var.h0(-1179877263);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? l46Var.g(ju5Var) : l46Var.i(ju5Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= l46Var.g(ps5Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= l46Var.i(x16Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if ((i2 & 3072) == 0) {
            i3 |= l46Var.i(a26Var) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        }
        int i4 = 1;
        if (l46Var.W(i3 & 1, (i3 & 1171) != 1170)) {
            j09 j09VarR = o8c.r(6, l46Var, androidx.compose.foundation.layout.b.b(0.0f, 56.0f, androidx.compose.foundation.layout.b.c(g09.a, 1.0f), 1), ju5Var.g);
            boolean z = (ju5Var.c == null || ju5Var.g) ? false : true;
            u51 u51VarC = bx5.c(l46Var);
            x4d x4dVar = eze.a(l46Var).a.a;
            boolean z2 = ((i3 & 7168) == 2048) | ((i3 & 896) == 256);
            Object objR = l46Var.R();
            if (z2 || objR == sf2.a) {
                objR = new hq1(a26Var, x16Var, i4);
                l46Var.p0(objR);
            }
            cgg.a((x16) objR, j09VarR, z, x4dVar, u51VarC, null, null, null, af1.b0(-1657868671, new w7(22, ps5Var, ju5Var), l46Var), l46Var, 805306368, 480);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new rb(ju5Var, ps5Var, x16Var, a26Var, i2, 11);
        }
    }

    public static final void V(lla llaVar, d0f d0fVar, aw2 aw2Var, boolean z, e89 e89Var, dd2 dd2Var, l46 l46Var, int i2) {
        lla llaVar2;
        int i3;
        l46Var.h0(-1413720282);
        if ((i2 & 6) == 0) {
            llaVar2 = llaVar;
            i3 = (l46Var.g(llaVar2) ? 4 : 2) | i2;
        } else {
            llaVar2 = llaVar;
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? l46Var.g(d0fVar) : l46Var.i(d0fVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= l46Var.i(null) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if ((i2 & 3072) == 0) {
            i3 |= l46Var.i(aw2Var) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        }
        if ((i2 & 24576) == 0) {
            i3 |= l46Var.h(z) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE;
        }
        if ((196608 & i2) == 0) {
            i3 |= l46Var.g(e89Var) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= l46Var.i(dd2Var) ? 1048576 : 524288;
        }
        int i4 = 0;
        if (l46Var.W(i3 & 1, (599187 & i3) != 599186)) {
            String strQ = afc.q(R.string.tooltip_description, l46Var);
            boolean zI = ((i3 & 112) == 32 || ((i3 & 64) != 0 && l46Var.i(d0fVar))) | ((i3 & 896) == 256) | l46Var.i(aw2Var) | ((458752 & i3) == 131072);
            Object objR = l46Var.R();
            if (zI || objR == sf2.a) {
                objR = new j8(d0fVar, aw2Var, e89Var, 6);
                l46Var.p0(objR);
            }
            int i5 = (i3 & 14) | 3072;
            pu.a(llaVar2, (x16) objR, new nma(z), af1.b0(-1287705660, new fw0(i4, strQ, dd2Var), l46Var), l46Var, i5, 0);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new tg(llaVar, d0fVar, aw2Var, z, e89Var, dd2Var, i2);
        }
    }

    public static final void W(d0f d0fVar, e89 e89Var, dd2 dd2Var, l46 l46Var, int i2) {
        int i3;
        l46Var.h0(1873232064);
        int i4 = 1;
        if ((i2 & 6) == 0) {
            i3 = (l46Var.h(true) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? l46Var.g(d0fVar) : l46Var.i(d0fVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= l46Var.g(e89Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        int i5 = 0;
        if ((i2 & 3072) == 0) {
            i3 |= l46Var.h(false) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        }
        int i6 = i2 & 24576;
        g09 g09Var = g09.a;
        if (i6 == 0) {
            i3 |= l46Var.g(g09Var) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE;
        }
        if ((196608 & i2) == 0) {
            i3 |= l46Var.i(dd2Var) ? 131072 : 65536;
        }
        if (l46Var.W(i3 & 1, (74899 & i3) != 74898)) {
            Object objR = l46Var.R();
            if (objR == sf2.a) {
                objR = af1.E(l46Var);
                l46Var.p0(objR);
            }
            aw2 aw2Var = (aw2) objR;
            j09 j09VarH = i7h.H(nk8.v(ibe.a(ibe.a(g09Var, d0fVar, new mw0(d0fVar, i5)), d0fVar, new mw0(d0fVar, i4)).D(new zz9(new w6(afc.q(R.string.tooltip_label, l46Var), aw2Var, d0fVar, 10))), new l0(18, aw2Var, d0fVar)), new d5(5, d0fVar, e89Var));
            xn8 xn8VarC = s21.c(ndb.b, false);
            int iW = an1.w(l46Var);
            u8a u8aVarM = l46Var.m();
            j09 j09VarJ = m93.J(l46Var, j09VarH);
            lf2.q.getClass();
            l46Var.j0();
            if (l46Var.S) {
                l46Var.l(LayoutNode.h1);
            } else {
                l46Var.s0();
            }
            dec.l(hj6.z, l46Var, xn8VarC);
            dec.l(hj6.y, l46Var, u8aVarM);
            he2 he2Var = hj6.X;
            if (l46Var.S || !pa7.t(l46Var.R(), Integer.valueOf(iW))) {
                tec.r(iW, l46Var, iW, he2Var);
            }
            dec.l(hj6.x, l46Var, j09VarJ);
            tec.q((i3 >> 15) & 14, dd2Var, l46Var, true);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new b8(d0fVar, e89Var, dd2Var, i2);
        }
    }

    public static final int X(lg8 lg8Var, zi ziVar) {
        lg8 lg8VarS0 = lg8Var.s0();
        if (lg8VarS0 == null) {
            i37.c("Child of " + lg8Var + " cannot be null when calculating alignment line");
        }
        if (lg8Var.B0().a().containsKey(ziVar)) {
            Integer num = (Integer) lg8Var.B0().a().get(ziVar);
            if (num != null) {
                return num.intValue();
            }
        } else {
            int iW = lg8VarS0.W(ziVar);
            if (iW != Integer.MIN_VALUE) {
                boolean z = lg8Var.Y;
                boolean z2 = lg8Var.Z;
                lg8VarS0.Y = true;
                lg8Var.Z = true;
                lg8Var.R0();
                lg8VarS0.Y = z;
                lg8Var.Z = z2;
                return iW + ((int) (ziVar instanceof oq6 ? lg8VarS0.E0() & 4294967295L : lg8VarS0.E0() >> 32));
            }
        }
        return Integer.MIN_VALUE;
    }

    public static long Y(long j2, hw7 hw7Var) {
        hw7 hw7Var2 = hw7.a;
        return ll2.a(hw7Var == hw7Var2 ? kl2.j(j2) : kl2.i(j2), hw7Var == hw7Var2 ? kl2.h(j2) : kl2.g(j2), hw7Var == hw7Var2 ? kl2.i(j2) : kl2.j(j2), hw7Var == hw7Var2 ? kl2.g(j2) : kl2.h(j2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x005a, code lost:
    
        if (defpackage.y7h.r(r11.getWidth(), r11.getHeight(), (int) (r2 >> 32), (int) (r2 & 4294967295L), r4, r20) == 1.0d) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Bitmap Z(android.graphics.drawable.Drawable r16, android.graphics.Bitmap.Config r17, defpackage.ykd r18, defpackage.zdc r19, defpackage.ykd r20, boolean r21) {
        /*
            r0 = r16
            r1 = r18
            r4 = r19
            r5 = r20
            boolean r2 = r0 instanceof android.graphics.drawable.BitmapDrawable
            r8 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r10 = 32
            if (r2 == 0) goto L5d
            r2 = r0
            android.graphics.drawable.BitmapDrawable r2 = (android.graphics.drawable.BitmapDrawable) r2
            android.graphics.Bitmap r11 = r2.getBitmap()
            android.graphics.Bitmap$Config r2 = r11.getConfig()
            if (r17 == 0) goto L2a
            boolean r3 = defpackage.qk2.G(r17)
            if (r3 == 0) goto L27
            goto L2a
        L27:
            r3 = r17
            goto L2c
        L2a:
            android.graphics.Bitmap$Config r3 = android.graphics.Bitmap.Config.ARGB_8888
        L2c:
            if (r2 != r3) goto L5d
            if (r21 == 0) goto L31
            goto L5c
        L31:
            int r2 = r11.getWidth()
            int r3 = r11.getHeight()
            long r2 = defpackage.y7h.q(r2, r3, r1, r4, r5)
            long r6 = r2 >> r10
            int r6 = (int) r6
            long r2 = r2 & r8
            int r2 = (int) r2
            r5 = r2
            int r2 = r11.getWidth()
            int r3 = r11.getHeight()
            r7 = r6
            r6 = r4
            r4 = r7
            r7 = r20
            double r2 = defpackage.y7h.r(r2, r3, r4, r5, r6, r7)
            r4 = r6
            r5 = r7
            r6 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 != 0) goto L5d
        L5c:
            return r11
        L5d:
            android.graphics.drawable.Drawable r6 = r0.mutate()
            int r0 = defpackage.erf.b(r6)
            r2 = 512(0x200, float:7.17E-43)
            if (r0 <= 0) goto L6a
            goto L6b
        L6a:
            r0 = r2
        L6b:
            int r3 = defpackage.erf.a(r6)
            if (r3 <= 0) goto L72
            r2 = r3
        L72:
            long r11 = defpackage.y7h.q(r0, r2, r1, r4, r5)
            long r13 = r11 >> r10
            int r1 = (int) r13
            long r7 = r11 & r8
            int r3 = (int) r7
            r15 = r2
            r2 = r1
            r1 = r15
            double r2 = defpackage.y7h.r(r0, r1, r2, r3, r4, r5)
            double r4 = (double) r0
            double r4 = r4 * r2
            int r0 = defpackage.ym8.K(r4)
            double r4 = (double) r1
            double r2 = r2 * r4
            int r1 = defpackage.ym8.K(r2)
            if (r17 == 0) goto L9b
            boolean r2 = defpackage.qk2.G(r17)
            if (r2 == 0) goto L98
            goto L9b
        L98:
            r2 = r17
            goto L9d
        L9b:
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.ARGB_8888
        L9d:
            android.graphics.Bitmap r2 = android.graphics.Bitmap.createBitmap(r0, r1, r2)
            android.graphics.Rect r3 = r6.getBounds()
            int r4 = r3.left
            int r5 = r3.top
            int r7 = r3.right
            int r3 = r3.bottom
            r8 = 0
            r6.setBounds(r8, r8, r0, r1)
            android.graphics.Canvas r0 = new android.graphics.Canvas
            r0.<init>(r2)
            r6.draw(r0)
            r6.setBounds(r4, r5, r7, r3)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kj0.Z(android.graphics.drawable.Drawable, android.graphics.Bitmap$Config, ykd, zdc, ykd, boolean):android.graphics.Bitmap");
    }

    public static final void a(cs3 cs3Var, j09 j09Var, dd2 dd2Var, dd2 dd2Var2, l46 l46Var, int i2) {
        l46Var.h0(1784541708);
        int i3 = (l46Var.g(cs3Var) ? 4 : 2) | i2;
        if (l46Var.W(i3 & 1, (i3 & 9363) != 9362)) {
            boolean z = (i3 & 14) == 4;
            Object objR = l46Var.R();
            if (z || objR == sf2.a) {
                objR = new mt5(dd2Var2, cs3Var, dd2Var);
                l46Var.p0(objR);
            }
            m6e.a(j09Var, (l26) objR, l46Var, 6, 0);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new q8(i2, 18, cs3Var, j09Var, dd2Var, dd2Var2);
        }
    }

    public static long a0(int i2, long j2) {
        return ll2.a(0, kl2.h(j2), (i2 & 4) != 0 ? kl2.i(j2) : 0, kl2.g(j2));
    }

    public static final void b(dd2 dd2Var, int i2, l46 l46Var, int i3) {
        if (l46Var.W(i3 & 1, (i3 & 3) != 2)) {
            dd2Var.m(Integer.valueOf(i2), l46Var, 0);
        } else {
            l46Var.Z();
        }
    }

    public static final String b0(String str, String str2, String str3, int i2, String str4) {
        StringBuilder sb = new StringBuilder();
        if (i2 >= 0) {
            sb.append("Unexpected JSON token at offset " + i2 + ": ");
        }
        sb.append(str);
        if (str2 != null && !v4e.Q(str2)) {
            sb.append(" at path: ");
            sb.append(str2);
        }
        if (str3 != null && !v4e.Q(str3)) {
            sb.append("\n".concat(str3));
        }
        if (str4 != null) {
            sb.append("\nJSON input: ");
            sb.append(str4);
        }
        return sb.toString();
    }

    public static final void c(lla llaVar, dd2 dd2Var, d0f d0fVar, dd2 dd2Var2, l46 l46Var, int i2) {
        lla llaVar2;
        int i3;
        Object obj;
        l46Var.h0(-1221877520);
        if ((i2 & 6) == 0) {
            llaVar2 = llaVar;
            i3 = (l46Var.g(llaVar2) ? 4 : 2) | i2;
        } else {
            llaVar2 = llaVar;
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= l46Var.i(dd2Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= (i2 & 512) == 0 ? l46Var.g(d0fVar) : l46Var.i(d0fVar) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        int i4 = i2 & 3072;
        g09 g09Var = g09.a;
        if (i4 == 0) {
            i3 |= l46Var.g(g09Var) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        }
        if ((i2 & 24576) == 0) {
            i3 |= l46Var.i(null) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE;
        }
        boolean z = false;
        if ((i2 & 196608) == 0) {
            i3 |= l46Var.h(false) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= l46Var.h(true) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i3 |= l46Var.h(false) ? 8388608 : 4194304;
        }
        if ((100663296 & i2) == 0) {
            i3 |= l46Var.i(dd2Var2) ? 67108864 : 33554432;
        }
        if (l46Var.W(i3 & 1, (38347923 & i3) != 38347922)) {
            Object objR = l46Var.R();
            Object obj2 = sf2.a;
            if (objR == obj2) {
                objR = af1.E(l46Var);
                l46Var.p0(objR);
            }
            aw2 aw2Var = (aw2) objR;
            Object objR2 = l46Var.R();
            if (objR2 == obj2) {
                objR2 = q1c.f(Boolean.FALSE);
                l46Var.p0(objR2);
            }
            e89 e89Var = (e89) objR2;
            xn8 xn8VarC = s21.c(ndb.b, false);
            int iW = an1.w(l46Var);
            u8a u8aVarM = l46Var.m();
            j09 j09VarJ = m93.J(l46Var, g09Var);
            lf2.q.getClass();
            l46Var.j0();
            if (l46Var.S) {
                l46Var.l(LayoutNode.h1);
            } else {
                l46Var.s0();
            }
            dec.l(hj6.z, l46Var, xn8VarC);
            dec.l(hj6.y, l46Var, u8aVarM);
            he2 he2Var = hj6.X;
            if (l46Var.S || !pa7.t(l46Var.R(), Integer.valueOf(iW))) {
                tec.r(iW, l46Var, iW, he2Var);
            }
            dec.l(hj6.x, l46Var, j09VarJ);
            h0f h0fVar = (h0f) d0fVar;
            if (h0fVar.b()) {
                l46Var.f0(-1891243071);
                lla llaVar3 = llaVar2;
                obj = obj2;
                V(llaVar3, h0fVar, aw2Var, false, e89Var, dd2Var, l46Var, ((i3 << 15) & 3670016) | (i3 & 14) | 196608 | ((i3 >> 3) & 112) | ((i3 >> 6) & 896));
                l46Var.r(false);
            } else {
                obj = obj2;
                l46Var.f0(-1890863476);
                l46Var.r(false);
            }
            W(h0fVar, e89Var, dd2Var2, l46Var, ((i3 >> 18) & 14) | 384 | ((i3 >> 3) & 112) | ((i3 >> 12) & 7168) | (57344 & (i3 << 3)) | ((i3 >> 9) & 458752));
            l46Var.r(true);
            if ((i3 & 896) == 256 || ((i3 & 512) != 0 && l46Var.i(h0fVar))) {
                z = true;
            }
            Object objR3 = l46Var.R();
            if (z || objR3 == obj) {
                objR3 = new c1(21, h0fVar);
                l46Var.p0(objR3);
            }
            af1.g(h0fVar, (a26) objR3, l46Var);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new rb(llaVar, dd2Var, d0fVar, dd2Var2, i2);
        }
    }

    public static oq8 c0(String str) {
        str.getClass();
        um8 um8VarD = oq8.e.d(0, str);
        if (um8VarD == null) {
            qc0.j(ks0.g('\"', "No subtype found for: \"", str));
            return null;
        }
        String str2 = (String) ((sm8) um8VarD.a()).get(1);
        Locale locale = Locale.ROOT;
        String lowerCase = str2.toLowerCase(locale);
        lowerCase.getClass();
        String lowerCase2 = ((String) ((sm8) um8VarD.a()).get(2)).toLowerCase(locale);
        lowerCase2.getClass();
        ArrayList arrayList = new ArrayList();
        int i2 = um8VarD.b().b;
        while (true) {
            int i3 = i2 + 1;
            if (i3 >= str.length()) {
                return new oq8(str, lowerCase, lowerCase2, (String[]) arrayList.toArray(new String[0]));
            }
            um8 um8VarD2 = oq8.f.d(i3, str);
            if (um8VarD2 == null) {
                ho7.p("Parameter is not formatted correctly: \"", str.substring(i3), "\" for: \"", str, 34);
                return null;
            }
            tm8 tm8Var = um8VarD2.c;
            rm8 rm8VarD = tm8Var.d(1);
            String str3 = rm8VarD != null ? rm8VarD.a : null;
            if (str3 == null) {
                i2 = um8VarD2.b().b;
            } else {
                rm8 rm8VarD2 = tm8Var.d(2);
                String strSubstring = rm8VarD2 != null ? rm8VarD2.a : null;
                if (strSubstring == null) {
                    rm8 rm8VarD3 = tm8Var.d(3);
                    rm8VarD3.getClass();
                    strSubstring = rm8VarD3.a;
                } else if (v4e.e0(strSubstring, '\'') && v4e.I(strSubstring, '\'') && strSubstring.length() > 2) {
                    strSubstring = strSubstring.substring(1, strSubstring.length() - 1);
                }
                arrayList.add(str3);
                arrayList.add(strSubstring);
                i2 = um8VarD2.b().b;
            }
        }
    }

    public static final void d(j09 j09Var, PersonalitySection personalitySection, l46 l46Var, int i2) {
        int i3;
        l46 l46Var2 = l46Var;
        l46Var2.h0(-458161353);
        if ((i2 & 48) == 0) {
            i3 = (l46Var2.g(j09Var) ? 32 : 16) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 384) == 0) {
            i3 |= (i2 & 512) == 0 ? l46Var2.g(personalitySection) : l46Var2.i(personalitySection) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        int i4 = 0;
        int i5 = 1;
        if (l46Var2.W(i3 & 1, (i3 & 145) != 144)) {
            c92 c92VarA = a92.a(new uc0(-88.0f, true, new qc0(i4)), ndb.Z, l46Var2, 54);
            int iHashCode = Long.hashCode(l46Var2.T);
            u8a u8aVarM = l46Var2.m();
            j09 j09VarJ = m93.J(l46Var2, j09Var);
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
            String title = personalitySection != null ? personalitySection.getTitle() : null;
            if (title == null) {
                title = "";
            }
            n16.d(null, false, false, title, null, af1.b0(-264346635, new i1(29, personalitySection), l46Var2), l46Var2, 196992, 19);
            g09 g09Var = g09.a;
            j09 j09VarD = androidx.compose.foundation.layout.b.d(androidx.compose.foundation.layout.b.c(g09Var, 1.0f), 124.0f);
            dd2 dd2Var = af1.c;
            x01 x01Var = x01.b;
            l46Var2 = l46Var;
            n16.f(j09VarD, false, false, null, x01Var, dd2Var, l46Var2, 221574, 10);
            n16.b(androidx.compose.foundation.layout.b.d(androidx.compose.foundation.layout.b.c(g09Var, 1.0f), 124.0f), false, false, null, null, af1.d, l46Var2, 196998, 26);
            n16.e(androidx.compose.foundation.layout.b.d(androidx.compose.foundation.layout.b.c(g09Var, 1.0f), 124.0f), false, false, null, x01Var, af1.e, l46Var2, 221574, 10);
            n16.c(androidx.compose.foundation.layout.b.r(androidx.compose.foundation.layout.b.c(g09Var, 1.0f)), false, false, null, x01.a, af1.f, l46Var2, 221574, 10);
            l46Var2.r(true);
        } else {
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new k38(j09Var, personalitySection, i2, i5);
        }
    }

    public static synchronized AudioManager d0(Context context) {
        try {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                a = null;
            }
            AudioManager audioManager = a;
            if (audioManager != null) {
                return audioManager;
            }
            Looper looperMyLooper = Looper.myLooper();
            if (looperMyLooper != null && looperMyLooper != Looper.getMainLooper()) {
                nh2 nh2Var = new nh2(0);
                rs0.A().execute(new fe(8, applicationContext, nh2Var));
                nh2Var.a();
                AudioManager audioManager2 = a;
                audioManager2.getClass();
                return audioManager2;
            }
            AudioManager audioManager3 = (AudioManager) applicationContext.getSystemService("audio");
            a = audioManager3;
            audioManager3.getClass();
            return audioManager3;
        } catch (Throwable th) {
            throw th;
        }
    }

    public static final void e(mic micVar, j09 j09Var, l46 l46Var, int i2) {
        Object obj = sf2.a;
        l46Var.h0(-942032098);
        int i3 = (l46Var.e(micVar.ordinal()) ? 4 : 2) | i2;
        if (l46Var.W(i3 & 1, (i3 & 19) != 18)) {
            int i4 = i3 & 14;
            boolean z = i4 == 4;
            Object objR = l46Var.R();
            if (z || objR == obj) {
                LocalDateTime localDateTime = xs5.a;
                int iOrdinal = micVar.ordinal();
                if (iOrdinal == 0) {
                    objR = xs5.a;
                } else {
                    if (iOrdinal != 1) {
                        ap.c();
                        return;
                    }
                    objR = cr0.b;
                }
                l46Var.p0(objR);
            }
            LocalDateTime localDateTime2 = (LocalDateTime) objR;
            Object objR2 = l46Var.R();
            if (objR2 == obj) {
                Long l2 = g3b.a;
                ZoneId zoneIdSystemDefault = ZoneId.systemDefault();
                zoneIdSystemDefault.getClass();
                objR2 = q1c.f(Duration.between(g3b.a(zoneIdSystemDefault), localDateTime2));
                l46Var.p0(objR2);
            }
            e89 e89Var = (e89) objR2;
            boolean zI = l46Var.i(localDateTime2);
            Object objR3 = l46Var.R();
            if (zI || objR3 == obj) {
                objR3 = new tt5(localDateTime2, e89Var, null);
                l46Var.p0(objR3);
            }
            af1.o((l26) objR3, l46Var, localDateTime2);
            Duration duration = ((Duration) e89Var.getValue()).isNegative() ? Duration.ZERO : (Duration) e89Var.getValue();
            duration.getClass();
            f(micVar, duration, j09Var, l46Var, i4 | 384);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new o14(micVar, j09Var, i2, 19);
        }
    }

    public static final mue e0(l46 l46Var) {
        return mue.a((mue) l46Var.k(nte.a), 0L, w6c.l(17), ar5.c, null, 0L, null, 3, w6c.l(24), null, null, 16613369);
    }

    public static final void f(mic micVar, Duration duration, j09 j09Var, l46 l46Var, int i2) {
        int i3;
        Duration duration2;
        long j2;
        int i4;
        l46 l46Var2 = l46Var;
        l46Var2.h0(2004472961);
        if ((i2 & 6) == 0) {
            i3 = (l46Var2.e(micVar.ordinal()) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            duration2 = duration;
            i3 |= l46Var2.i(duration2) ? 32 : 16;
        } else {
            duration2 = duration;
        }
        if ((i2 & 384) == 0) {
            i3 |= l46Var2.g(j09Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        int i5 = 0;
        if (l46Var2.W(i3 & 1, (i3 & 147) != 146)) {
            long days = duration2.toDays();
            long hours = duration2.toHours() % 24;
            long minutes = duration2.toMinutes() % 60;
            long seconds = duration2.getSeconds() % 60;
            mue mueVar = pue.a;
            xtd xtdVar = pue.p(l46Var2).a;
            pr4 pr4Var = l8b.a;
            xtd xtdVarA = xtd.a(xtdVar, ((e8b) l46Var2.k(pr4Var)).q, 65534);
            xtd xtdVarA2 = xtd.a(pue.g(l46Var2).a, ((e8b) l46Var2.k(pr4Var)).s, 65534);
            String strQ = afc.q(R.string.four_seasons_countdown_unit_day, l46Var2);
            String strQ2 = afc.q(R.string.four_seasons_countdown_unit_hour, l46Var2);
            String strQ3 = afc.q(R.string.four_seasons_countdown_unit_minute, l46Var2);
            String strQ4 = afc.q(R.string.four_seasons_countdown_unit_second, l46Var2);
            long j3 = ((e8b) l46Var2.k(pr4Var)).a;
            y02 y02Var = g21.f;
            j09 j09VarO = tm7.o(j09Var, j3, y02Var);
            yv5 yv5Var = bx5.a;
            if (g21.S(l46Var2)) {
                l46Var2.f0(-940578357);
                j2 = bx5.b(l46Var2).j;
                l46Var2.r(false);
            } else {
                l46Var2.f0(-940576758);
                j2 = bx5.b(l46Var2).k;
                l46Var2.r(false);
            }
            j09 j09VarA0 = ynb.a0(tm7.o(j09VarO, j2, y02Var), 20.0f, 10.0f);
            t7c t7cVarA = s7c.a(new uc0(8.0f, true, new qc0(i5)), ndb.z, l46Var2, 54);
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
            dec.l(hj6.z, l46Var2, t7cVarA);
            dec.l(hj6.y, l46Var2, u8aVarM);
            dec.l(hj6.X, l46Var2, Integer.valueOf(iHashCode));
            dec.k(l46Var2);
            dec.l(hj6.x, l46Var2, j09VarJ);
            int iOrdinal = micVar.ordinal();
            if (iOrdinal == 0) {
                i4 = R.string.four_seasons_countdown_text;
            } else {
                if (iOrdinal != 1) {
                    ap.c();
                    return;
                }
                i4 = R.string.four_seasons_countdown_autumn_text;
            }
            nte.b(afc.q(i4, l46Var2), new jw7(1.0f, true), ((e8b) l46Var2.k(pr4Var)).r, 0L, null, null, 0L, null, null, 0L, 0, false, 2, 0, null, pue.d(l46Var2), l46Var2, 0, 24576, 114680);
            i00 i00Var = new i00();
            int iK = i00Var.k(xtdVarA);
            try {
                i00Var.f(String.format("%02d", Arrays.copyOf(new Object[]{Long.valueOf(days)}, 1)));
                i00Var.h(iK);
                int iK2 = i00Var.k(xtdVarA2);
                try {
                    i00Var.f(strQ);
                    i00Var.h(iK2);
                    i00Var.f(" ");
                    int iK3 = i00Var.k(xtdVarA);
                    try {
                        i00Var.f(String.format("%02d", Arrays.copyOf(new Object[]{Long.valueOf(hours)}, 1)));
                        i00Var.h(iK3);
                        int iK4 = i00Var.k(xtdVarA2);
                        try {
                            i00Var.f(strQ2);
                            i00Var.h(iK4);
                            i00Var.f(" ");
                            int iK5 = i00Var.k(xtdVarA);
                            try {
                                i00Var.f(String.format("%02d", Arrays.copyOf(new Object[]{Long.valueOf(minutes)}, 1)));
                                i00Var.h(iK5);
                                int iK6 = i00Var.k(xtdVarA2);
                                try {
                                    i00Var.f(strQ3);
                                    i00Var.h(iK6);
                                    i00Var.f(" ");
                                    int iK7 = i00Var.k(xtdVarA);
                                    try {
                                        i00Var.f(String.format("%02d", Arrays.copyOf(new Object[]{Long.valueOf(seconds)}, 1)));
                                        i00Var.h(iK7);
                                        int iK8 = i00Var.k(xtdVarA2);
                                        try {
                                            i00Var.f(strQ4);
                                            i00Var.h(iK8);
                                            nte.c(i00Var.l(), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, null, l46Var, 0, 0, 524286);
                                            l46Var2 = l46Var;
                                            l46Var2.r(true);
                                        } catch (Throwable th) {
                                            i00Var.h(iK8);
                                            throw th;
                                        }
                                    } catch (Throwable th2) {
                                        i00Var.h(iK7);
                                        throw th2;
                                    }
                                } catch (Throwable th3) {
                                    i00Var.h(iK6);
                                    throw th3;
                                }
                            } catch (Throwable th4) {
                                i00Var.h(iK5);
                                throw th4;
                            }
                        } catch (Throwable th5) {
                            i00Var.h(iK4);
                            throw th5;
                        }
                    } catch (Throwable th6) {
                        i00Var.h(iK3);
                        throw th6;
                    }
                } catch (Throwable th7) {
                    i00Var.h(iK2);
                    throw th7;
                }
            } catch (Throwable th8) {
                i00Var.h(iK);
                throw th8;
            }
        } else {
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new b8(i2, micVar, duration, j09Var, 21);
        }
    }

    public static DateTimeFormatter f0(String str, Locale locale, LinkedHashMap linkedHashMap) {
        StringBuilder sbQ = kv2.q("P:", str);
        sbQ.append(locale.toLanguageTag());
        String string = sbQ.toString();
        Object objWithDecimalStyle = linkedHashMap.get(string);
        if (objWithDecimalStyle == null) {
            objWithDecimalStyle = DateTimeFormatter.ofPattern(str, locale).withDecimalStyle(DecimalStyle.of(locale));
            linkedHashMap.put(string, objWithDecimalStyle);
        }
        objWithDecimalStyle.getClass();
        return (DateTimeFormatter) objWithDecimalStyle;
    }

    public static final void g(String str, l46 l46Var, int i2) {
        long j2;
        long j3;
        l46Var.h0(913595641);
        int i3 = i2 | (l46Var.g(str) ? 4 : 2);
        if (l46Var.W(i3 & 1, (i3 & 3) != 2)) {
            j09 j09VarB = androidx.compose.foundation.layout.b.b(0.0f, 56.0f, androidx.compose.foundation.layout.b.c(g09.a, 1.0f), 1);
            yv5 yv5Var = bx5.a;
            bx9 bx9Var = v51.a;
            if (g21.S(l46Var)) {
                l46Var.f0(-266335596);
                j2 = bx5.b(l46Var).e;
                l46Var.r(false);
            } else {
                l46Var.f0(-266333869);
                j2 = bx5.b(l46Var).f;
                l46Var.r(false);
            }
            long j4 = j2;
            if (g21.S(l46Var)) {
                l46Var.f0(-266331526);
                j3 = ((e8b) l46Var.k(l8b.a)).w;
                l46Var.r(false);
            } else {
                l46Var.f0(-266330212);
                j3 = ((e8b) l46Var.k(l8b.a)).y;
                l46Var.r(false);
            }
            c8b.i(j09VarB, str, null, null, 0L, 0.0f, false, null, v51.a(0L, 0L, j4, j3, l46Var, 3), false, null, null, null, l46Var, ((i3 << 3) & 112) | 1572870, 0, 7868);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new o8(str, i2, 15);
        }
    }

    public static String g0(bs bsVar, int i2) {
        bsVar.getClass();
        if (i2 <= 16777215) {
            return String.valueOf(i2);
        }
        try {
            Context context = bsVar.a;
            context.getClass();
            String resourceName = context.getResources().getResourceName(i2);
            resourceName.getClass();
            return resourceName;
        } catch (Resources.NotFoundException unused) {
            return String.valueOf(i2);
        }
    }

    public static final void h(boolean z, x16 x16Var, l46 l46Var, int i2) {
        boolean z2;
        l46 l46Var2;
        y02 y02Var = g21.f;
        l46Var.h0(-1846160518);
        int i3 = 2;
        int i4 = (l46Var.h(z) ? 4 : 2) | i2 | (l46Var.i(x16Var) ? 32 : 16);
        int i5 = 1;
        if (l46Var.W(i4 & 1, (i4 & 19) != 18)) {
            l46Var.f0(-338760161);
            j09 j09VarL = androidx.compose.foundation.layout.b.l(g09.a, 56.0f);
            if (z) {
                l46Var.f0(-1040344708);
                l46Var.r(false);
            } else {
                l46Var.f0(-1040418612);
                j09VarL = db6.w(j09VarL, 1.0f, ((e8b) l46Var.k(l8b.a)).s, y02Var);
                l46Var.r(false);
            }
            l46Var.r(false);
            boolean z3 = (i4 & 112) == 32;
            Object objR = l46Var.R();
            if (z3 || objR == sf2.a) {
                objR = new p9(8, x16Var);
                l46Var.p0(objR);
            }
            int i6 = (i4 & 14) | 14155776;
            z2 = z;
            l46Var2 = l46Var;
            bm8.j(z2, (a26) objR, j09VarL, false, null, y02Var, af1.b0(-765588089, new ci1(z, i5), l46Var), l46Var2, i6);
        } else {
            z2 = z;
            l46Var2 = l46Var;
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new mb0(z2, x16Var, i2, i3);
        }
    }

    public static cyc h0(ua9 ua9Var) {
        ua9Var.getClass();
        return fyc.u(new d59(11), ua9Var);
    }

    public static final void i(int i2, int i3, l46 l46Var, j09 j09Var, boolean z) {
        int i4;
        j09 j09Var2;
        int i5;
        j09 j09Var3;
        l46Var.h0(544593716);
        int i6 = i3 & 1;
        if (i6 != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (l46Var.g(j09Var) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i7 = i4 | (l46Var.h(z) ? 32 : 16);
        if (l46Var.W(i7 & 1, (i7 & 19) != 18)) {
            if (i6 != 0) {
                j09Var3 = g09.a;
                i5 = i7;
            } else {
                i5 = i7;
                j09Var3 = j09Var;
            }
            int i8 = i5;
            cn1.f(Boolean.valueOf(z), j09Var3, b21.T(350, 0, null, 6), "expand-collapse-icon", cn1.d, l46Var, ((i8 >> 3) & 14) | 28032 | ((i8 << 3) & 112), 0);
            j09Var2 = j09Var3;
        } else {
            l46Var.Z();
            j09Var2 = j09Var;
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new xx1(j09Var2, z, i2, i3, 0);
        }
    }

    public static final b68 i0(l46 l46Var) {
        long j2 = y72.j;
        return gec.D(t72.I(new y72(j2), new y72(j2), new y72(j2), new y72(y72.b(((e8b) l46Var.k(l8b.a)).u, 0.1f))));
    }

    public static final void j(final mic micVar, ju5 ju5Var, final boolean z, final a26 a26Var, final a26 a26Var2, final x16 x16Var, final x16 x16Var2, final x16 x16Var3, final x16 x16Var4, final x16 x16Var5, final a26 a26Var3, l46 l46Var, final int i2, final int i3) {
        a26 a26Var4;
        int i4;
        ps5 ps5Var;
        final ju5 ju5Var2 = ju5Var;
        l46Var.h0(-88916746);
        int i5 = i2 | (l46Var.e(micVar.ordinal()) ? 4 : 2) | (l46Var.i(ju5Var2) ? 32 : 16) | (l46Var.h(z) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var.i(a26Var) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE) | (l46Var.i(a26Var2) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE) | (l46Var.i(x16Var) ? 131072 : 65536) | (l46Var.i(x16Var2) ? 1048576 : 524288) | (l46Var.i(x16Var3) ? 8388608 : 4194304) | (l46Var.i(x16Var4) ? 67108864 : 33554432) | (l46Var.i(x16Var5) ? 536870912 : 268435456);
        if ((i3 & 6) == 0) {
            a26Var4 = a26Var3;
            i4 = i3 | (l46Var.i(a26Var4) ? 4 : 2);
        } else {
            a26Var4 = a26Var3;
            i4 = i3;
        }
        if (l46Var.W(i5 & 1, ((i5 & 306783379) == 306783378 && (i4 & 3) == 2) ? false : true)) {
            qs5 qs5Var = ju5Var2.e;
            int iOrdinal = micVar.ordinal();
            if (iOrdinal == 0) {
                ps5Var = new ps5(R.string.four_seasons_cta_subscribe_unlock, R.string.four_seasons_cta_subscribe_desc, R.string.four_seasons_cta_early_bird, R.string.four_seasons_cta_early_bird_origin, R.string.four_seasons_cta_unlocked_locked, R.string.four_seasons_cta_remind, R.string.four_seasons_cta_ended, R.string.four_seasons_cta_ended_purchased_hint, R.string.four_seasons_cta_ended_unpurchased_hint);
            } else {
                if (iOrdinal != 1) {
                    ap.c();
                    return;
                }
                ps5Var = new ps5(R.string.four_seasons_cta_autumn_subscribe_unlock, R.string.four_seasons_cta_autumn_subscribe_desc, R.string.four_seasons_cta_autumn_early_bird, R.string.four_seasons_cta_autumn_early_bird_origin, R.string.four_seasons_cta_autumn_unlocked_locked, R.string.four_seasons_cta_autumn_remind, R.string.four_seasons_cta_autumn_ended, R.string.four_seasons_cta_autumn_ended_purchased_hint, R.string.four_seasons_cta_autumn_ended_unpurchased_hint);
            }
            int iOrdinal2 = qs5Var.ordinal();
            i8c i8cVar = sf2.a;
            int i6 = ps5Var.g;
            switch (iOrdinal2) {
                case 0:
                    ju5Var2 = ju5Var;
                    l46Var.f0(450367934);
                    g(afc.q(R.string.four_seasons_cta_preview, l46Var), l46Var, 0);
                    l46Var.r(false);
                    break;
                case 1:
                case 3:
                    l46Var.f0(1076663067);
                    int i7 = i5 >> 3;
                    int i8 = 8 | (i7 & 14) | ((i5 >> 9) & 896) | ((i4 << 9) & 7168);
                    a26 a26Var5 = a26Var4;
                    ps5 ps5Var2 = ps5Var;
                    ju5Var2 = ju5Var;
                    U(ju5Var2, ps5Var2, x16Var, a26Var5, l46Var, i8);
                    ca2.a.getClass();
                    boolean z2 = ca2.c;
                    n07 n07Var = ju5Var2.a;
                    n07 n07Var2 = ju5Var2.b;
                    if (micVar != mic.AutumnEquinox2026 || z2 ? ju5Var2.e == qs5.c : n07Var2 != null) {
                        n07Var = n07Var2;
                    }
                    p07 p07VarG = n07Var != null ? n07Var.g() : null;
                    cmc cmcVarL = rs0.L(micVar, ca2.c);
                    boolean z3 = p07VarG == (cmcVarL != null ? cmcVarL.b : null);
                    if (ju5Var2.f || n07Var != null) {
                        l46Var.f0(1077035222);
                        D(n07Var, ju5Var2.f, z3 ? ps5Var2.c : R.string.four_seasons_cta_original_price, a26Var2, a26Var3, z3 ? Integer.valueOf(ps5Var2.d) : null, l46Var, 8 | (i7 & 7168) | ((i4 << 12) & 57344));
                        l46Var.r(false);
                    } else {
                        l46Var.f0(1077394636);
                        l46Var.r(false);
                    }
                    if (ju5Var2.h || (!ju5Var2.g && ju5Var2.c == null)) {
                        l46Var.f0(1077491511);
                        p(afc.q(R.string.chat_mind_pricing_loading_failed, l46Var), l46Var, 0);
                        l46Var.r(false);
                    } else {
                        l46Var.f0(1077573196);
                        l46Var.r(false);
                    }
                    ynb.s(androidx.compose.foundation.layout.b.c(g09.a, 1.0f), z, a26Var, new y72(bx5.b(l46Var).a), null, false, l46Var, (
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0327: INVOKE 
                          (wrap j09:0x0305: INVOKE (wrap g09:0x0301: SGET  A[WRAPPED] (LINE:770) g09.a g09), (1.0f float) STATIC call: androidx.compose.foundation.layout.b.c(j09, float):j09 A[MD:(j09, float):j09 (m), WRAPPED] (LINE:774))
                          (r34v0 'z' boolean)
                          (r35v0 'a26Var' a26)
                          (wrap y72:0x0311: CONSTRUCTOR 
                          (wrap long:0x030d: IGET (wrap yv5:0x0309: INVOKE (r43v0 'l46Var' l46) STATIC call: bx5.b(l46):yv5 A[MD:(l46):yv5 (m), WRAPPED] (LINE:778)) A[WRAPPED] (LINE:782) yv5.a long)
                         A[MD:(long):void (m), WRAPPED] (LINE:786) call: y72.<init>(long):void type: CONSTRUCTOR)
                          (null y72)
                          false
                          (r43v0 'l46Var' l46)
                          (wrap int:0x031a: ARITH (wrap int:0x0316: ARITH (wrap int:0x0314: ARITH (r15v5 int) & (112 int) A[WRAPPED] (LINE:789)) | (6 int) A[DONT_WRAP, WRAPPED] (LINE:791)) | (wrap int:0x0318: ARITH (r2v5 'i7' int) & (896 int) A[WRAPPED] (LINE:793)) A[WRAPPED] (LINE:795))
                          (48 int)
                         STATIC call: ynb.s(j09, boolean, a26, y72, y72, boolean, l46, int, int):void A[MD:(j09, boolean, a26, y72, y72, boolean, l46, int, int):void (m)] (LINE:808) in method: kj0.j(mic, ju5, boolean, a26, a26, x16, x16, x16, x16, x16, a26, l46, int, int):void, file: classes.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                        	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                        	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:267)
                        	at jadx.core.dex.regions.SwitchRegion.generate(SwitchRegion.java:90)
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
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r15v5 int
                        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                        */
                    /*
                        Method dump skipped, instruction units count: 904
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.kj0.j(mic, ju5, boolean, a26, a26, x16, x16, x16, x16, x16, a26, l46, int, int):void");
                }

                public static final boolean j0(InAppMessageUiModel inAppMessageUiModel) {
                    inAppMessageUiModel.getClass();
                    String action = inAppMessageUiModel.getAction();
                    return (action == null || v4e.Q(action) || !qd0.I0(new InAppMessageType[]{InAppMessageType.ManualText, InAppMessageType.ManualAction, InAppMessageType.ManualFull}).contains(inAppMessageUiModel.getMessageType())) ? false : true;
                }

                public static final void k(mic micVar, qs5 qs5Var, float f2, j09 j09Var, l46 l46Var, int i2) {
                    qs5 qs5Var2;
                    l46Var.h0(1405143744);
                    int i3 = i2 | (l46Var.e(micVar.ordinal()) ? 4 : 2) | (l46Var.e(qs5Var.ordinal()) ? 32 : 16) | (l46Var.d(f2) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var.g(j09Var) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE);
                    int i4 = 0;
                    if (l46Var.W(i3 & 1, (i3 & 1171) != 1170)) {
                        ghc ghcVarT = mh3.T(l46Var);
                        os5 os5VarW = if9.w(micVar);
                        j09 j09VarD0 = mh3.d0(j09Var, ghcVarT, false, 14);
                        jx0 jx0Var = ndb.Y;
                        c92 c92VarA = a92.a(xc0.c, jx0Var, l46Var, 0);
                        int iHashCode = Long.hashCode(l46Var.T);
                        u8a u8aVarM = l46Var.m();
                        j09 j09VarJ = m93.J(l46Var, j09VarD0);
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
                        dec.l(he2Var, l46Var, c92VarA);
                        he2 he2Var2 = hj6.y;
                        dec.l(he2Var2, l46Var, u8aVarM);
                        Integer numValueOf = Integer.valueOf(iHashCode);
                        he2 he2Var3 = hj6.X;
                        dec.l(he2Var3, l46Var, numValueOf);
                        dec.k(l46Var);
                        he2 he2Var4 = hj6.x;
                        dec.l(he2Var4, l46Var, j09VarJ);
                        s(os5VarW.c, 0, l46Var);
                        g09 g09Var = g09.a;
                        o5c.f(l46Var, androidx.compose.foundation.layout.b.d(g09Var, 32.0f));
                        t(0, l46Var);
                        o5c.f(l46Var, androidx.compose.foundation.layout.b.d(g09Var, 32.0f));
                        int i5 = i3 & 14;
                        qs5Var2 = qs5Var;
                        M(micVar, qs5Var2, l46Var, i3 & 126);
                        o5c.f(l46Var, androidx.compose.foundation.layout.b.d(g09Var, 24.0f));
                        c92 c92VarA2 = a92.a(new uc0(48.0f, true, new qc0(i4)), jx0Var, l46Var, 6);
                        int iHashCode2 = Long.hashCode(l46Var.T);
                        u8a u8aVarM2 = l46Var.m();
                        j09 j09VarJ2 = m93.J(l46Var, g09Var);
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
                        R(micVar, l46Var, i5);
                        H(micVar, l46Var, i5);
                        T(micVar, l46Var, i5);
                        ib8.t(l46Var, true, g09Var, 24.0f, l46Var);
                        E(0, l46Var);
                        tec.u(g09Var, ((yi4) mh3.l(new yi4(f2 - 12.0f), new yi4(0.0f))).a, l46Var, true);
                    } else {
                        qs5Var2 = qs5Var;
                        l46Var.Z();
                    }
                    ojb ojbVarV = l46Var.v();
                    if (ojbVarV != null) {
                        ojbVarV.d = new vr1(micVar, qs5Var2, f2, j09Var, i2, 2);
                    }
                }

                public static boolean k0(ua9 ua9Var, em7 em7Var) {
                    ua9Var.getClass();
                    em7Var.getClass();
                    return m7c.e(hfc.l(em7Var)) == ua9Var.b.b;
                }

                public static final void l(mic micVar, ju5 ju5Var, boolean z, a26 a26Var, a26 a26Var2, x16 x16Var, x16 x16Var2, x16 x16Var3, x16 x16Var4, x16 x16Var5, a26 a26Var3, j09 j09Var, l46 l46Var, int i2) {
                    boolean z2;
                    long j2;
                    l46Var.h0(1842564534);
                    int i3 = i2 | (l46Var.e(micVar.ordinal()) ? 4 : 2) | (l46Var.i(ju5Var) ? 32 : 16) | (l46Var.h(z) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var.i(a26Var) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE) | (l46Var.i(a26Var2) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE) | (l46Var.i(x16Var) ? 131072 : 65536) | (l46Var.i(x16Var2) ? 1048576 : 524288) | (l46Var.i(x16Var3) ? 8388608 : 4194304) | (l46Var.i(x16Var4) ? 67108864 : 33554432) | (l46Var.i(x16Var5) ? 536870912 : 268435456);
                    int i4 = (l46Var.i(a26Var3) ? 4 : 2) | (l46Var.g(j09Var) ? 32 : 16);
                    if (l46Var.W(i3 & 1, ((306783379 & i3) == 306783378 && (i4 & 19) == 18) ? false : true)) {
                        yv5 yv5Var = bx5.a;
                        l46Var.f0(250947950);
                        if (pa7.t(bx5.b(l46Var), bx5.b)) {
                            l46Var.f0(250950088);
                            j2 = ((e8b) l46Var.k(l8b.a)).e;
                            z2 = false;
                            l46Var.r(false);
                        } else {
                            z2 = false;
                            if (g21.S(l46Var)) {
                                l46Var.f0(250951239);
                                l46Var.r(false);
                                j2 = bx5.d;
                            } else {
                                l46Var.f0(250952038);
                                l46Var.r(false);
                                j2 = bx5.e;
                            }
                        }
                        l46Var.r(z2);
                        j09 j09VarN = tm7.n(androidx.compose.foundation.layout.b.c(j09Var, 1.0f), gec.O(new iy9[]{new iy9(Float.valueOf(0.0f), new y72(y72.b(j2, 0.0f))), new iy9(Float.valueOf(0.38f), new y72(y72.b(j2, 0.88f))), new iy9(Float.valueOf(0.58f), new y72(y72.b(j2, 0.96f))), new iy9(Float.valueOf(1.0f), new y72(y72.b(j2, 0.98f)))}, 0.0f, 0.0f, 14), null, 6);
                        xn8 xn8VarC = s21.c(ndb.b, false);
                        int iHashCode = Long.hashCode(l46Var.T);
                        u8a u8aVarM = l46Var.m();
                        j09 j09VarJ = m93.J(l46Var, j09VarN);
                        lf2.q.getClass();
                        l46Var.j0();
                        boolean z3 = l46Var.S;
                        ov7 ov7Var = LayoutNode.h1;
                        if (z3) {
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
                        j09 j09VarD0 = ynb.d0(0.0f, 96.0f, 0.0f, 24.0f, 5, mh3.N(ynb.b0(32.0f, 0.0f, g09.a, 2)));
                        c92 c92VarA = a92.a(new uc0(8.0f, true, new qc0(0)), ndb.Y, l46Var, 6);
                        int iHashCode2 = Long.hashCode(l46Var.T);
                        u8a u8aVarM2 = l46Var.m();
                        j09 j09VarJ2 = m93.J(l46Var, j09VarD0);
                        l46Var.j0();
                        if (l46Var.S) {
                            l46Var.l(ov7Var);
                        } else {
                            l46Var.s0();
                        }
                        dec.l(he2Var, l46Var, c92VarA);
                        dec.l(he2Var2, l46Var, u8aVarM2);
                        ib8.s(iHashCode2, l46Var, he2Var3, l46Var);
                        dec.l(he2Var4, l46Var, j09VarJ2);
                        j(micVar, ju5Var, z, a26Var, a26Var2, x16Var, x16Var2, x16Var3, x16Var4, x16Var5, a26Var3, l46Var, (i3 & 14) | 64 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (458752 & i3) | (3670016 & i3) | (29360128 & i3) | (234881024 & i3) | (i3 & 1879048192), i4 & 14);
                        l46Var.r(true);
                        l46Var.r(true);
                    } else {
                        l46Var.Z();
                    }
                    ojb ojbVarV = l46Var.v();
                    if (ojbVarV != null) {
                        ojbVarV.d = new as2(micVar, ju5Var, z, a26Var, a26Var2, x16Var, x16Var2, x16Var3, x16Var4, x16Var5, a26Var3, j09Var, i2);
                    }
                }

                public static final void l0(a80 a80Var, String str) {
                    a80Var.m(a80Var.b - 1, "Trailing comma before the end of JSON ".concat(str), "Trailing commas are non-complaint JSON and not allowed by default. Use 'allowTrailingComma = true' in 'Json {}' builder to support them.");
                    throw null;
                }

                /* JADX WARN: Code duplicated, block: B:152:0x0317  */
                /* JADX WARN: Code duplicated, block: B:163:0x034b  */
                /* JADX WARN: Code duplicated, block: B:169:0x037f  */
                /* JADX WARN: Code duplicated, block: B:183:0x03b9  */
                /* JADX WARN: Code duplicated, block: B:187:0x03cf  */
                /* JADX WARN: Code duplicated, block: B:194:0x040c  */
                /* JADX WARN: Code duplicated, block: B:196:0x0441  */
                /* JADX WARN: Code duplicated, block: B:197:0x0444  */
                /* JADX WARN: Code duplicated, block: B:200:0x044c A[ADDED_TO_REGION] */
                /* JADX WARN: Code duplicated, block: B:201:0x044e  */
                /* JADX WARN: Code duplicated, block: B:206:0x048e  */
                /* JADX WARN: Code duplicated, block: B:208:0x049e A[ADDED_TO_REGION] */
                /* JADX WARN: Code duplicated, block: B:209:0x04a0  */
                /* JADX WARN: Code duplicated, block: B:211:0x04b6  */
                /* JADX WARN: Code duplicated, block: B:215:0x04c9  */
                /* JADX WARN: Code duplicated, block: B:218:0x04db  */
                /* JADX WARN: Code duplicated, block: B:221:0x0517  */
                /* JADX WARN: Code duplicated, block: B:222:0x051a  */
                /* JADX WARN: Code duplicated, block: B:226:0x0526  */
                /* JADX WARN: Code duplicated, block: B:231:0x0553  */
                /* JADX WARN: Code duplicated, block: B:232:0x0556  */
                /* JADX WARN: Code duplicated, block: B:236:0x0560  */
                /* JADX WARN: Code duplicated, block: B:240:0x057c  */
                /* JADX WARN: Code duplicated, block: B:244:0x0598  */
                /* JADX WARN: Code duplicated, block: B:248:0x05c2  */
                /* JADX WARN: Code duplicated, block: B:252:0x05ea  */
                /* JADX WARN: Code duplicated, block: B:258:0x0610  */
                /* JADX WARN: Code duplicated, block: B:261:0x062f  */
                /* JADX WARN: Code duplicated, block: B:262:0x0631  */
                /* JADX WARN: Code duplicated, block: B:266:0x063b  */
                /* JADX WARN: Code duplicated, block: B:269:0x0655  */
                /* JADX WARN: Code duplicated, block: B:270:0x0657  */
                /* JADX WARN: Code duplicated, block: B:274:0x0662  */
                /* JADX WARN: Code duplicated, block: B:277:0x0679  */
                /* JADX WARN: Code duplicated, block: B:278:0x067b  */
                /* JADX WARN: Code duplicated, block: B:281:0x068a  */
                /* JADX WARN: Code duplicated, block: B:282:0x068c  */
                /* JADX WARN: Code duplicated, block: B:288:0x069d  */
                /* JADX WARN: Code duplicated, block: B:291:0x06b4  */
                /* JADX WARN: Code duplicated, block: B:292:0x06b6  */
                /* JADX WARN: Code duplicated, block: B:298:0x06c4  */
                /* JADX WARN: Code duplicated, block: B:301:0x0717  */
                /* JADX WARN: Code duplicated, block: B:303:0x0730  */
                /* JADX WARN: Code duplicated, block: B:304:0x0732  */
                /* JADX WARN: Code duplicated, block: B:310:0x0746  */
                /* JADX WARN: Code duplicated, block: B:313:0x075d  */
                /* JADX WARN: Code duplicated, block: B:314:0x075f  */
                /* JADX WARN: Code duplicated, block: B:318:0x0768  */
                /* JADX WARN: Code duplicated, block: B:320:0x077b  */
                public static final void m(final int i2, final SolarTerm solarTerm, final String str, final x16 x16Var, final x16 x16Var2, final x16 x16Var3, final x16 x16Var4, final x16 x16Var5, final a26 a26Var, l46 l46Var, final int i3) {
                    x16 x16Var6;
                    Object obj;
                    Object next;
                    pwf pwfVarH;
                    mic micVar;
                    yic yicVar;
                    boolean z;
                    e89 e89VarI;
                    e89 e89VarI2;
                    boolean zEquals;
                    boolean z2;
                    Object objR;
                    e89 e89Var;
                    boolean zH;
                    Object objR2;
                    boolean z3;
                    boolean zH2;
                    Object objR3;
                    h48 h48VarK;
                    boolean z4;
                    boolean z5;
                    Object objR4;
                    int i4;
                    String str2;
                    String str3;
                    boolean z6;
                    boolean zI;
                    Object objR5;
                    Object objR6;
                    final e89 e89Var2;
                    Object objR7;
                    e89 e89Var3;
                    ii6 ii6VarB0;
                    final boolean z7;
                    final yic yicVar2;
                    final boolean z8;
                    Object obj2;
                    int i5;
                    int i6;
                    boolean z9;
                    boolean z10;
                    Object obj3;
                    ii6 ii6Var;
                    boolean z11;
                    x16 x16Var7;
                    boolean z12;
                    boolean z13;
                    Object objR8;
                    boolean zI2;
                    Object objR9;
                    boolean zG;
                    Object objR10;
                    boolean zI3;
                    Object objR11;
                    boolean zI4;
                    Object objR12;
                    Object obj4;
                    boolean zG2;
                    Object objR13;
                    boolean z14;
                    boolean z15;
                    Object objR14;
                    boolean z16;
                    boolean z17;
                    Object objR15;
                    boolean z18;
                    boolean z19;
                    boolean z20;
                    Object objR16;
                    boolean z21;
                    boolean z22;
                    Object objR17;
                    e89 e89Var4;
                    boolean z23;
                    boolean z24;
                    boolean z25;
                    Object nt5Var;
                    boolean z26;
                    e89 e89Var5;
                    boolean z27;
                    Object objR18;
                    n07 n07Var;
                    final a26 a26Var2 = a26Var;
                    solarTerm.getClass();
                    str.getClass();
                    x16Var.getClass();
                    x16Var2.getClass();
                    x16Var3.getClass();
                    x16Var4.getClass();
                    x16Var5.getClass();
                    a26Var2.getClass();
                    l46Var.h0(-583201908);
                    int i7 = i3 | (l46Var.e(i2) ? 4 : 2) | (l46Var.e(solarTerm.ordinal()) ? 32 : 16) | (l46Var.g(str) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var.i(x16Var) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE) | (l46Var.i(x16Var2) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE) | (l46Var.i(x16Var3) ? 131072 : 65536) | (l46Var.i(x16Var4) ? 1048576 : 524288) | (l46Var.i(x16Var5) ? 8388608 : 4194304) | (l46Var.i(a26Var2) ? 67108864 : 33554432);
                    if (l46Var.W(i7 & 1, (i7 & 38347923) != 38347922)) {
                        int i8 = i7 & 112;
                        boolean z28 = ((i7 & 14) == 4) | (i8 == 32);
                        Object objR19 = l46Var.R();
                        Object obj5 = sf2.a;
                        if (z28 || objR19 == obj5) {
                            objR19 = new yic(i2, solarTerm);
                            l46Var.p0(objR19);
                        }
                        yic yicVar3 = (yic) objR19;
                        mic micVarB = yicVar3.b();
                        if (micVarB == null) {
                            ojb ojbVarV = l46Var.v();
                            if (ojbVarV != null) {
                                final int i9 = 0;
                                ojbVarV.d = new l26(i2, solarTerm, str, x16Var, x16Var2, x16Var3, x16Var4, x16Var5, a26Var2, i3, i9) { // from class: ys5
                                    public final /* synthetic */ int a;
                                    public final /* synthetic */ int b;
                                    public final /* synthetic */ SolarTerm c;
                                    public final /* synthetic */ String d;
                                    public final /* synthetic */ x16 e;
                                    public final /* synthetic */ x16 f;
                                    public final /* synthetic */ x16 g;
                                    public final /* synthetic */ x16 v;
                                    public final /* synthetic */ x16 w;
                                    public final /* synthetic */ a26 x;

                                    {
                                        this.a = i9;
                                    }

                                    @Override // defpackage.l26
                                    public final Object z(Object obj6, Object obj7) {
                                        int i10 = this.a;
                                        wef wefVar = wef.a;
                                        switch (i10) {
                                            case 0:
                                                ((Integer) obj7).getClass();
                                                int iP = k99.P(1);
                                                kj0.m(this.b, this.c, this.d, this.e, this.f, this.g, this.v, this.w, this.x, (l46) obj6, iP);
                                                break;
                                            case 1:
                                                ((Integer) obj7).getClass();
                                                int iP2 = k99.P(1);
                                                kj0.m(this.b, this.c, this.d, this.e, this.f, this.g, this.v, this.w, this.x, (l46) obj6, iP2);
                                                break;
                                            default:
                                                ((Integer) obj7).getClass();
                                                int iP3 = k99.P(1);
                                                kj0.m(this.b, this.c, this.d, this.e, this.f, this.g, this.v, this.w, this.x, (l46) obj6, iP3);
                                                break;
                                        }
                                        return wefVar;
                                    }
                                };
                                return;
                            }
                            return;
                        }
                        boolean zI5 = l46Var.i(yicVar3);
                        Object objR20 = l46Var.R();
                        if (zI5 || objR20 == obj5) {
                            objR20 = new uo2(21, yicVar3);
                            l46Var.p0(objR20);
                        }
                        x16 x16Var8 = (x16) objR20;
                        pwf pwfVarA = qd8.a(l46Var);
                        if (pwfVarA == null) {
                            qc0.p("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                            return;
                        }
                        gy2 gy2VarR = b21.r(pwfVarA);
                        nfc nfcVarB = kr7.b(l46Var);
                        kob kobVar = job.a;
                        vu5 vu5Var = (vu5) z5c.G(kobVar.b(vu5.class), pwfVarA.g(), null, gy2VarR, nfcVarB, x16Var8);
                        b1b b1bVar = uq.b;
                        final Context context = (Context) l46Var.k(b1bVar);
                        e89 e89VarT = tm7.t(vu5Var.V0, l46Var);
                        String strE = n3d.e(i2, solarTerm);
                        if (strE == null) {
                            ojb ojbVarV2 = l46Var.v();
                            if (ojbVarV2 != null) {
                                final int i10 = 1;
                                ojbVarV2.d = new l26(i2, solarTerm, str, x16Var, x16Var2, x16Var3, x16Var4, x16Var5, a26Var, i3, i10) { // from class: ys5
                                    public final /* synthetic */ int a;
                                    public final /* synthetic */ int b;
                                    public final /* synthetic */ SolarTerm c;
                                    public final /* synthetic */ String d;
                                    public final /* synthetic */ x16 e;
                                    public final /* synthetic */ x16 f;
                                    public final /* synthetic */ x16 g;
                                    public final /* synthetic */ x16 v;
                                    public final /* synthetic */ x16 w;
                                    public final /* synthetic */ a26 x;

                                    {
                                        this.a = i10;
                                    }

                                    @Override // defpackage.l26
                                    public final Object z(Object obj6, Object obj7) {
                                        int i11 = this.a;
                                        wef wefVar = wef.a;
                                        switch (i11) {
                                            case 0:
                                                ((Integer) obj7).getClass();
                                                int iP = k99.P(1);
                                                kj0.m(this.b, this.c, this.d, this.e, this.f, this.g, this.v, this.w, this.x, (l46) obj6, iP);
                                                break;
                                            case 1:
                                                ((Integer) obj7).getClass();
                                                int iP2 = k99.P(1);
                                                kj0.m(this.b, this.c, this.d, this.e, this.f, this.g, this.v, this.w, this.x, (l46) obj6, iP2);
                                                break;
                                            default:
                                                ((Integer) obj7).getClass();
                                                int iP3 = k99.P(1);
                                                kj0.m(this.b, this.c, this.d, this.e, this.f, this.g, this.v, this.w, this.x, (l46) obj6, iP3);
                                                break;
                                        }
                                        return wefVar;
                                    }
                                };
                                return;
                            }
                            return;
                        }
                        boolean z29 = !str.equals("qa");
                        e89 e89Var6 = e89VarT;
                        String str4 = (str.equals("homepage") || str.equals("account") || str.equals(Constants.PUSH) || str.equals("share") || str.equals("auto_open")) ? str : null;
                        Object emcVar = str4 != null ? new emc(str4, strE) : null;
                        boolean zH3 = l46Var.h(z29) | l46Var.g(strE);
                        Object objR21 = l46Var.R();
                        if (zH3 || objR21 == obj5) {
                            objR21 = new zs5(z29, strE);
                            l46Var.p0(objR21);
                        }
                        x16 x16Var9 = (x16) objR21;
                        boolean z30 = z29;
                        nfc nfcVarB2 = kr7.b(l46Var);
                        boolean zG3 = l46Var.g(null) | l46Var.g(nfcVarB2);
                        Object objR22 = l46Var.R();
                        if (zG3 || objR22 == obj5) {
                            obj = null;
                            objR22 = nfcVarB2.b(kobVar.b(s7.class), null, null);
                            l46Var.p0(objR22);
                        } else {
                            obj = null;
                        }
                        s7 s7Var = (s7) objR22;
                        nfc nfcVarB3 = kr7.b(l46Var);
                        boolean zG4 = l46Var.g(obj) | l46Var.g(nfcVarB3);
                        Object objR23 = l46Var.R();
                        if (zG4 || objR23 == obj5) {
                            Object objB = nfcVarB3.b(kobVar.b(gmc.class), null, null);
                            l46Var.p0(objB);
                            objR23 = objB;
                        }
                        gmc gmcVar = (gmc) objR23;
                        boolean zG5 = l46Var.g(yicVar3);
                        Object objR24 = l46Var.R();
                        if (zG5 || objR24 == obj5) {
                            s7Var.getClass();
                            objR24 = s7.a();
                            l46Var.p0(objR24);
                        }
                        String str5 = (String) objR24;
                        nfc nfcVarB4 = kr7.b(l46Var);
                        if (((Boolean) l46Var.k(h57.a)).booleanValue()) {
                            pwfVarH = ib8.h(l46Var, 1471494079, l46Var, false);
                        } else {
                            l46Var.f0(1471494731);
                            Object objK = l46Var.k(b1bVar);
                            Object objR25 = l46Var.R();
                            if (objR25 == obj5) {
                                objR25 = z03.I0;
                                l46Var.p0(objR25);
                            }
                            Iterator it = fyc.u((a26) objR25, objK).iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    next = null;
                                    break;
                                }
                                next = it.next();
                                Iterator it2 = it;
                                if (((Context) next) instanceof pwf) {
                                    break;
                                } else {
                                    it = it2;
                                }
                            }
                            pwfVarH = (pwf) next;
                            l46Var.r(false);
                        }
                        if (pwfVarH == null) {
                            qc0.p("No ViewModelStoreOwner found in the context chain");
                            return;
                        }
                        qna qnaVar = (qna) z5c.G(job.a.b(qna.class), pwfVarH.g(), null, b21.r(pwfVarH), nfcVarB4, null);
                        ju5 ju5Var = (ju5) e89Var6.getValue();
                        ca2.a.getClass();
                        boolean z31 = ca2.c;
                        ju5Var.getClass();
                        boolean z32 = ju5Var.i;
                        ax5 ax5Var = ax5.a;
                        if (z32) {
                            yicVar = yicVar3;
                            if (ju5Var.j) {
                                micVar = micVarB;
                            } else {
                                if (ju5Var.d != ax5Var) {
                                    micVar = micVarB;
                                } else if (ju5Var.h || ju5Var.f || ju5Var.g) {
                                    micVar = micVarB;
                                } else {
                                    n07 n07Var2 = ju5Var.a;
                                    n07 n07Var3 = ju5Var.b;
                                    if (micVarB != mic.AutumnEquinox2026 || z31) {
                                        micVar = micVarB;
                                        n07Var = ju5Var.e == qs5.c ? n07Var3 : n07Var2;
                                    } else if (n07Var3 == null) {
                                        micVar = micVarB;
                                    } else {
                                        micVar = micVarB;
                                    }
                                    if (n07Var == null || ju5Var.c == null) {
                                    }
                                }
                                if (qnaVar.h() && qnaVar.i() == null) {
                                    z = true;
                                }
                            }
                            e89VarI = q1c.i(Boolean.valueOf(z), l46Var);
                            e89VarI2 = q1c.i(x16Var4, l46Var);
                            zEquals = str.equals("auto_open");
                            z2 = z;
                            Object[] objArr = new Object[0];
                            objR = l46Var.R();
                            if (objR == obj5) {
                                objR = new mz4(23);
                                l46Var.p0(objR);
                            }
                            e89Var = (e89) vfh.I(objArr, (x16) objR, l46Var, 48);
                            Boolean boolValueOf = Boolean.valueOf(zEquals);
                            zH = l46Var.h(zEquals) | l46Var.g(e89VarI) | l46Var.g(e89VarI2);
                            objR2 = l46Var.R();
                            if (zH || objR2 == obj5) {
                                objR2 = new wt5(zEquals, e89VarI, e89VarI2, null);
                                l46Var.p0(objR2);
                            }
                            af1.o((l26) objR2, l46Var, boolValueOf);
                            if (zEquals || ((Boolean) e89Var.getValue()).booleanValue()) {
                                z3 = false;
                            } else {
                                ju5 ju5Var2 = (ju5) e89Var6.getValue();
                                ju5Var2.getClass();
                                if (ju5Var2.j || (ju5Var2.i && ju5Var2.d == ax5Var && ju5Var2.h)) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                            }
                            Boolean boolValueOf2 = Boolean.valueOf(z3);
                            zH2 = l46Var.h(z3) | l46Var.g(e89VarI2);
                            objR3 = l46Var.R();
                            if (zH2 || objR3 == obj5) {
                                objR3 = new xt5(z3, e89VarI2, null);
                                l46Var.p0(objR3);
                            }
                            af1.o((l26) objR3, l46Var, boolValueOf2);
                            if (!z2 || ((Boolean) e89Var.getValue()).booleanValue()) {
                                l46Var.f0(-1023080879);
                                h48VarK = ((x48) l46Var.k(cb8.a)).k();
                                boolean zI6 = l46Var.i(h48VarK) | l46Var.g(e89Var) | l46Var.i(s7Var) | l46Var.g(str5) | l46Var.i(gmcVar) | l46Var.g(strE);
                                if ((i7 & 896) == 256) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                z5 = zI6 | z4;
                                objR4 = l46Var.R();
                                if (!z5 || objR4 == obj5) {
                                    i4 = i7;
                                    str2 = str5;
                                    Object yt5Var = new yt5(h48VarK, s7Var, str2, gmcVar, strE, str, e89Var, null);
                                    str3 = str;
                                    l46Var.p0(yt5Var);
                                    objR4 = yt5Var;
                                } else {
                                    i4 = i7;
                                    str2 = str5;
                                    str3 = str;
                                }
                                af1.p(str2, strE, (l26) objR4, l46Var);
                                if (emcVar != null) {
                                    l46Var.f0(-2111195514);
                                    zI = l46Var.i(emcVar);
                                    objR5 = l46Var.R();
                                    if (zI || objR5 == obj5) {
                                        objR5 = new ot1(28, emcVar);
                                        l46Var.p0(objR5);
                                    }
                                    dec.b("page_view", (a26) objR5, l46Var, 6);
                                    z6 = false;
                                    l46Var.r(false);
                                } else {
                                    z6 = false;
                                    l46Var.f0(-1022311242);
                                    l46Var.r(false);
                                }
                                l46Var.r(z6);
                            } else {
                                l46Var.f0(-1022307274);
                                l46Var.r(false);
                                solarTerm = solarTerm;
                                str3 = str;
                                x16Var = x16Var;
                                x16Var2 = x16Var2;
                                i4 = i7;
                                zEquals = zEquals;
                                strE = strE;
                                e89Var6 = e89Var6;
                                z30 = z30;
                                micVar = micVar;
                            }
                            objR6 = l46Var.R();
                            if (objR6 == obj5) {
                                objR6 = q1c.f(Boolean.FALSE);
                                l46Var.p0(objR6);
                            }
                            e89Var2 = (e89) objR6;
                            objR7 = l46Var.R();
                            if (objR7 == obj5) {
                                objR7 = q1c.f(Boolean.FALSE);
                                l46Var.p0(objR7);
                            }
                            e89Var3 = (e89) objR7;
                            ii6VarB0 = g21.b0(l46Var);
                            z7 = zEquals;
                            yicVar2 = yicVar;
                            z8 = z30;
                            boolean zI7 = l46Var.i(context) | l46Var.h(z7) | l46Var.i(yicVar2) | l46Var.h(z8);
                            obj2 = strE;
                            i5 = i4;
                            i6 = i5 & 3670016;
                            if (i6 == 1048576) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            z10 = zI7 | z9;
                            Object objR26 = l46Var.R();
                            if (!z10 || objR26 == obj5) {
                                ii6Var = ii6VarB0;
                                obj3 = new x16() { // from class: at5
                                    /* JADX WARN: Code duplicated, block: B:10:0x003a  */
                                    /* JADX WARN: Code duplicated, block: B:50:0x00dd  */
                                    @Override // defpackage.x16
                                    public final Object invoke() throws Throwable {
                                        boolean z33;
                                        Object dzbVar;
                                        LocalDate localDate;
                                        Context context2 = context;
                                        boolean z34 = z7;
                                        yic yicVar4 = yicVar2;
                                        boolean z35 = z8;
                                        x16 x16Var10 = x16Var4;
                                        e89 e89Var7 = e89Var2;
                                        Long l2 = g3b.a;
                                        ZoneId zoneIdSystemDefault = ZoneId.systemDefault();
                                        zoneIdSystemDefault.getClass();
                                        LocalDateTime localDateTimeA = g3b.a(zoneIdSystemDefault);
                                        if (uyb.k(context2)) {
                                            qv5 qv5Var = qv5.a;
                                            NotificationChannel notificationChannel = new nh9(context2).b.getNotificationChannel("four_seasons_reminder");
                                            if (notificationChannel == null || notificationChannel.getImportance() != 0) {
                                                z33 = true;
                                            } else {
                                                z33 = false;
                                            }
                                        } else {
                                            z33 = false;
                                        }
                                        if (z34) {
                                            x16Var10.invoke();
                                        } else {
                                            hs3 hs3Var = xqa.a1;
                                            Object objI = z5c.I(nu4.a, new xv5(hs3Var.a, hs3Var.b, null));
                                            if (v4e.Q((String) objI)) {
                                                objI = null;
                                            }
                                            String str6 = (String) objI;
                                            if (str6 != null) {
                                                try {
                                                    dzbVar = LocalDate.parse(str6);
                                                } catch (Throwable th) {
                                                    dzbVar = new dzb(th);
                                                }
                                                if (dzbVar instanceof dzb) {
                                                    dzbVar = null;
                                                }
                                                localDate = (LocalDate) dzbVar;
                                            } else {
                                                localDate = null;
                                            }
                                            mic micVarB2 = yicVar4.b();
                                            int i11 = micVarB2 == null ? -1 : tv5.a[micVarB2.ordinal()];
                                            if (i11 == -1) {
                                                x16Var10.invoke();
                                            } else {
                                                if (i11 != 1) {
                                                    if (i11 != 2) {
                                                        ap.c();
                                                        return null;
                                                    }
                                                } else if (cr0.c(localDateTimeA) == nic.b && !z33 && !pa7.t(localDate, localDateTimeA.toLocalDate())) {
                                                    if (z35) {
                                                        String strA = yicVar4.a();
                                                        if (strA != null) {
                                                            ynb.V(lw2.a, null, null, new wv5(xqa.a1.a, localDateTimeA.toLocalDate().toString(), null), 3);
                                                            x1f x1fVar = x1f.a;
                                                            x1f.k(new r05("popup_view"), new bt5(strA, 2), 2);
                                                        }
                                                    }
                                                    e89Var7.setValue(Boolean.TRUE);
                                                }
                                                x16Var10.invoke();
                                            }
                                        }
                                        return wef.a;
                                    }
                                };
                                z11 = z8;
                                l46Var.p0(obj3);
                            } else {
                                ii6Var = ii6VarB0;
                                obj3 = objR26;
                                z11 = z8;
                            }
                            x16Var7 = (x16) obj3;
                            boolean zI8 = l46Var.i(context) | l46Var.i(vu5Var);
                            if ((i5 & 896) == 256) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            z13 = zI8 | z12;
                            objR8 = l46Var.R();
                            if (z13 || objR8 == obj5) {
                                objR8 = new zt5(context, vu5Var, str3, null);
                                l46Var.p0(objR8);
                            }
                            int i11 = vu5.b1;
                            af1.p(vu5Var, str3, (l26) objR8, l46Var);
                            zI2 = l46Var.i(context);
                            objR9 = l46Var.R();
                            if (zI2 || objR9 == obj5) {
                                objR9 = new eu5(context, null);
                                l46Var.p0(objR9);
                            }
                            af1.o((l26) objR9, l46Var, wef.a);
                            zG = l46Var.g(x16Var7);
                            objR10 = l46Var.R();
                            if (zG || objR10 == obj5) {
                                objR10 = new c20(19, x16Var7);
                                l46Var.p0(objR10);
                            }
                            rxg.a(false, (x16) objR10, l46Var, 0, 1);
                            ju5 ju5Var3 = (ju5) e89Var6.getValue();
                            j09 j09VarP = g21.P(g09.a, ii6Var);
                            zI3 = l46Var.i(vu5Var);
                            objR11 = l46Var.R();
                            if (zI3 || objR11 == obj5) {
                                objR11 = new sk3(0, vu5Var, vu5.class, "restorePurchase", "restorePurchase()V", 0, 12);
                                l46Var.p0(objR11);
                            }
                            ym7 ym7Var = (ym7) objR11;
                            zI4 = l46Var.i(vu5Var);
                            objR12 = l46Var.R();
                            if (zI4 || objR12 == obj5) {
                                objR12 = new ot1(29, vu5Var);
                                l46Var.p0(objR12);
                            }
                            a26 a26Var3 = (a26) objR12;
                            obj4 = e89Var6;
                            zG2 = l46Var.g(obj4) | l46Var.i(vu5Var);
                            objR13 = l46Var.R();
                            if (zG2 || objR13 == obj5) {
                                objR13 = new jt3(22, obj4, vu5Var);
                                l46Var.p0(objR13);
                            }
                            x16 x16Var10 = (x16) objR13;
                            x16 x16Var11 = (x16) ym7Var;
                            boolean zG6 = l46Var.g(x16Var9);
                            if ((i5 & 7168) == 2048) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            z15 = z14 | zG6;
                            objR14 = l46Var.R();
                            if (z15 || objR14 == obj5) {
                                objR14 = new ct5(x16Var9, x16Var, 0);
                                l46Var.p0(objR14);
                            }
                            x16 x16Var12 = (x16) objR14;
                            boolean zG7 = l46Var.g(x16Var9);
                            if ((57344 & i5) == 16384) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            z17 = zG7 | z16;
                            objR15 = l46Var.R();
                            if (z17 || objR15 == obj5) {
                                objR15 = new ct5(x16Var9, x16Var2, 1);
                                l46Var.p0(objR15);
                            }
                            x16 x16Var13 = (x16) objR15;
                            boolean zH4 = l46Var.h(z11);
                            if (i8 == 32) {
                                z18 = true;
                            } else {
                                z18 = false;
                            }
                            boolean z33 = zH4 | z18;
                            if ((i5 & 458752) == 131072) {
                                z19 = true;
                            } else {
                                z19 = false;
                            }
                            z20 = z33 | z19;
                            objR16 = l46Var.R();
                            if (z20 || objR16 == obj5) {
                                objR16 = new va4(z11, x16Var3, solarTerm, 2);
                                l46Var.p0(objR16);
                            }
                            x16 x16Var14 = (x16) objR16;
                            boolean zH5 = l46Var.h(z11);
                            if (i8 == 32) {
                                z21 = true;
                            } else {
                                z21 = false;
                            }
                            z22 = z21 | zH5;
                            objR17 = l46Var.R();
                            if (!z22 || objR17 == obj5) {
                                e89Var4 = e89Var3;
                                objR17 = new kt5(z11, solarTerm, e89Var4, 0);
                                l46Var.p0(objR17);
                            } else {
                                e89Var4 = e89Var3;
                            }
                            e89 e89Var7 = e89Var4;
                            mic micVar2 = micVar;
                            z23 = z11;
                            n(micVar2, ju5Var3, a26Var3, x16Var10, x16Var11, x16Var5, x16Var12, x16Var13, x16Var14, x16Var7, (x16) objR17, j09VarP, l46Var, ((i5 >> 6) & 458752) | 64);
                            a26Var2 = a26Var;
                            bx5.a(micVar2, af1.b0(-1044322391, new m65(ii6Var, a26Var2, e89Var7, 1), l46Var), l46Var, 48);
                            if (((Boolean) e89Var2.getValue()).booleanValue()) {
                                l46Var.f0(-1019544244);
                                boolean zH6 = l46Var.h(z23) | l46Var.g(obj2);
                                if (i6 == 1048576) {
                                    z24 = true;
                                } else {
                                    z24 = false;
                                }
                                z25 = zH6 | z24;
                                Object objR27 = l46Var.R();
                                if (!z25 || objR27 == obj5) {
                                    z26 = z23;
                                    e89Var5 = e89Var2;
                                    nt5Var = new nt5(z26, x16Var4, obj2, e89Var5, 0);
                                    x16Var6 = x16Var4;
                                    l46Var.p0(nt5Var);
                                } else {
                                    nt5Var = objR27;
                                    z26 = z23;
                                    e89Var5 = e89Var2;
                                    x16Var6 = x16Var4;
                                }
                                x16 x16Var15 = (x16) nt5Var;
                                if (i6 == 1048576) {
                                    z27 = true;
                                } else {
                                    z27 = false;
                                }
                                objR18 = l46Var.R();
                                if (z27 || objR18 == obj5) {
                                    objR18 = new k8(x16Var6, e89Var5, 5);
                                    l46Var.p0(objR18);
                                }
                                b21.h(0, x16Var15, (x16) objR18, l46Var, z26);
                                l46Var.r(false);
                            } else {
                                x16Var6 = x16Var4;
                                l46Var.f0(-1019042602);
                                l46Var.r(false);
                            }
                        } else {
                            micVar = micVarB;
                            yicVar = yicVar3;
                        }
                        z = false;
                        e89VarI = q1c.i(Boolean.valueOf(z), l46Var);
                        e89VarI2 = q1c.i(x16Var4, l46Var);
                        zEquals = str.equals("auto_open");
                        z2 = z;
                        Object[] objArr2 = new Object[0];
                        objR = l46Var.R();
                        if (objR == obj5) {
                            objR = new mz4(23);
                            l46Var.p0(objR);
                        }
                        e89Var = (e89) vfh.I(objArr2, (x16) objR, l46Var, 48);
                        Boolean boolValueOf3 = Boolean.valueOf(zEquals);
                        zH = l46Var.h(zEquals) | l46Var.g(e89VarI) | l46Var.g(e89VarI2);
                        objR2 = l46Var.R();
                        if (zH) {
                            objR2 = new wt5(zEquals, e89VarI, e89VarI2, null);
                            l46Var.p0(objR2);
                        } else {
                            objR2 = new wt5(zEquals, e89VarI, e89VarI2, null);
                            l46Var.p0(objR2);
                        }
                        af1.o((l26) objR2, l46Var, boolValueOf3);
                        if (zEquals) {
                            z3 = false;
                        } else {
                            z3 = false;
                        }
                        Boolean boolValueOf4 = Boolean.valueOf(z3);
                        zH2 = l46Var.h(z3) | l46Var.g(e89VarI2);
                        objR3 = l46Var.R();
                        if (zH2) {
                            objR3 = new xt5(z3, e89VarI2, null);
                            l46Var.p0(objR3);
                        } else {
                            objR3 = new xt5(z3, e89VarI2, null);
                            l46Var.p0(objR3);
                        }
                        af1.o((l26) objR3, l46Var, boolValueOf4);
                        if (z2) {
                            l46Var.f0(-1023080879);
                            h48VarK = ((x48) l46Var.k(cb8.a)).k();
                            boolean zI9 = l46Var.i(h48VarK) | l46Var.g(e89Var) | l46Var.i(s7Var) | l46Var.g(str5) | l46Var.i(gmcVar) | l46Var.g(strE);
                            if ((i7 & 896) == 256) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            z5 = zI9 | z4;
                            objR4 = l46Var.R();
                            if (z5) {
                                i4 = i7;
                                str2 = str5;
                                Object yt5Var2 = new yt5(h48VarK, s7Var, str2, gmcVar, strE, str, e89Var, null);
                                str3 = str;
                                l46Var.p0(yt5Var2);
                                objR4 = yt5Var2;
                            } else {
                                i4 = i7;
                                str2 = str5;
                                Object yt5Var3 = new yt5(h48VarK, s7Var, str2, gmcVar, strE, str, e89Var, null);
                                str3 = str;
                                l46Var.p0(yt5Var3);
                                objR4 = yt5Var3;
                            }
                            af1.p(str2, strE, (l26) objR4, l46Var);
                            if (emcVar != null) {
                                l46Var.f0(-2111195514);
                                zI = l46Var.i(emcVar);
                                objR5 = l46Var.R();
                                if (zI) {
                                    objR5 = new ot1(28, emcVar);
                                    l46Var.p0(objR5);
                                } else {
                                    objR5 = new ot1(28, emcVar);
                                    l46Var.p0(objR5);
                                }
                                dec.b("page_view", (a26) objR5, l46Var, 6);
                                z6 = false;
                                l46Var.r(false);
                            } else {
                                z6 = false;
                                l46Var.f0(-1022311242);
                                l46Var.r(false);
                            }
                            l46Var.r(z6);
                        } else {
                            l46Var.f0(-1023080879);
                            h48VarK = ((x48) l46Var.k(cb8.a)).k();
                            boolean zI10 = l46Var.i(h48VarK) | l46Var.g(e89Var) | l46Var.i(s7Var) | l46Var.g(str5) | l46Var.i(gmcVar) | l46Var.g(strE);
                            if ((i7 & 896) == 256) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            z5 = zI10 | z4;
                            objR4 = l46Var.R();
                            if (z5) {
                                i4 = i7;
                                str2 = str5;
                                Object yt5Var4 = new yt5(h48VarK, s7Var, str2, gmcVar, strE, str, e89Var, null);
                                str3 = str;
                                l46Var.p0(yt5Var4);
                                objR4 = yt5Var4;
                            } else {
                                i4 = i7;
                                str2 = str5;
                                Object yt5Var5 = new yt5(h48VarK, s7Var, str2, gmcVar, strE, str, e89Var, null);
                                str3 = str;
                                l46Var.p0(yt5Var5);
                                objR4 = yt5Var5;
                            }
                            af1.p(str2, strE, (l26) objR4, l46Var);
                            if (emcVar != null) {
                                l46Var.f0(-2111195514);
                                zI = l46Var.i(emcVar);
                                objR5 = l46Var.R();
                                if (zI) {
                                    objR5 = new ot1(28, emcVar);
                                    l46Var.p0(objR5);
                                } else {
                                    objR5 = new ot1(28, emcVar);
                                    l46Var.p0(objR5);
                                }
                                dec.b("page_view", (a26) objR5, l46Var, 6);
                                z6 = false;
                                l46Var.r(false);
                            } else {
                                z6 = false;
                                l46Var.f0(-1022311242);
                                l46Var.r(false);
                            }
                            l46Var.r(z6);
                        }
                        objR6 = l46Var.R();
                        if (objR6 == obj5) {
                            objR6 = q1c.f(Boolean.FALSE);
                            l46Var.p0(objR6);
                        }
                        e89Var2 = (e89) objR6;
                        objR7 = l46Var.R();
                        if (objR7 == obj5) {
                            objR7 = q1c.f(Boolean.FALSE);
                            l46Var.p0(objR7);
                        }
                        e89Var3 = (e89) objR7;
                        ii6VarB0 = g21.b0(l46Var);
                        z7 = zEquals;
                        yicVar2 = yicVar;
                        z8 = z30;
                        boolean zI11 = l46Var.i(context) | l46Var.h(z7) | l46Var.i(yicVar2) | l46Var.h(z8);
                        obj2 = strE;
                        i5 = i4;
                        i6 = i5 & 3670016;
                        if (i6 == 1048576) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        z10 = zI11 | z9;
                        Object objR28 = l46Var.R();
                        if (z10) {
                            ii6Var = ii6VarB0;
                            obj3 = new x16() { // from class: at5
                                /* JADX WARN: Code duplicated, block: B:10:0x003a  */
                                /* JADX WARN: Code duplicated, block: B:50:0x00dd  */
                                @Override // defpackage.x16
                                public final Object invoke() throws Throwable {
                                    boolean z34;
                                    Object dzbVar;
                                    LocalDate localDate;
                                    Context context2 = context;
                                    boolean z35 = z7;
                                    yic yicVar4 = yicVar2;
                                    boolean z36 = z8;
                                    x16 x16Var16 = x16Var4;
                                    e89 e89Var8 = e89Var2;
                                    Long l2 = g3b.a;
                                    ZoneId zoneIdSystemDefault = ZoneId.systemDefault();
                                    zoneIdSystemDefault.getClass();
                                    LocalDateTime localDateTimeA = g3b.a(zoneIdSystemDefault);
                                    if (uyb.k(context2)) {
                                        qv5 qv5Var = qv5.a;
                                        NotificationChannel notificationChannel = new nh9(context2).b.getNotificationChannel("four_seasons_reminder");
                                        if (notificationChannel == null || notificationChannel.getImportance() != 0) {
                                            z34 = true;
                                        } else {
                                            z34 = false;
                                        }
                                    } else {
                                        z34 = false;
                                    }
                                    if (z35) {
                                        x16Var16.invoke();
                                    } else {
                                        hs3 hs3Var = xqa.a1;
                                        Object objI = z5c.I(nu4.a, new xv5(hs3Var.a, hs3Var.b, null));
                                        if (v4e.Q((String) objI)) {
                                            objI = null;
                                        }
                                        String str6 = (String) objI;
                                        if (str6 != null) {
                                            try {
                                                dzbVar = LocalDate.parse(str6);
                                            } catch (Throwable th) {
                                                dzbVar = new dzb(th);
                                            }
                                            if (dzbVar instanceof dzb) {
                                                dzbVar = null;
                                            }
                                            localDate = (LocalDate) dzbVar;
                                        } else {
                                            localDate = null;
                                        }
                                        mic micVarB2 = yicVar4.b();
                                        int i12 = micVarB2 == null ? -1 : tv5.a[micVarB2.ordinal()];
                                        if (i12 == -1) {
                                            x16Var16.invoke();
                                        } else {
                                            if (i12 != 1) {
                                                if (i12 != 2) {
                                                    ap.c();
                                                    return null;
                                                }
                                            } else if (cr0.c(localDateTimeA) == nic.b && !z34 && !pa7.t(localDate, localDateTimeA.toLocalDate())) {
                                                if (z36) {
                                                    String strA = yicVar4.a();
                                                    if (strA != null) {
                                                        ynb.V(lw2.a, null, null, new wv5(xqa.a1.a, localDateTimeA.toLocalDate().toString(), null), 3);
                                                        x1f x1fVar = x1f.a;
                                                        x1f.k(new r05("popup_view"), new bt5(strA, 2), 2);
                                                    }
                                                }
                                                e89Var8.setValue(Boolean.TRUE);
                                            }
                                            x16Var16.invoke();
                                        }
                                    }
                                    return wef.a;
                                }
                            };
                            z11 = z8;
                            l46Var.p0(obj3);
                        } else {
                            ii6Var = ii6VarB0;
                            obj3 = new x16() { // from class: at5
                                /* JADX WARN: Code duplicated, block: B:10:0x003a  */
                                /* JADX WARN: Code duplicated, block: B:50:0x00dd  */
                                @Override // defpackage.x16
                                public final Object invoke() throws Throwable {
                                    boolean z34;
                                    Object dzbVar;
                                    LocalDate localDate;
                                    Context context2 = context;
                                    boolean z35 = z7;
                                    yic yicVar4 = yicVar2;
                                    boolean z36 = z8;
                                    x16 x16Var16 = x16Var4;
                                    e89 e89Var8 = e89Var2;
                                    Long l2 = g3b.a;
                                    ZoneId zoneIdSystemDefault = ZoneId.systemDefault();
                                    zoneIdSystemDefault.getClass();
                                    LocalDateTime localDateTimeA = g3b.a(zoneIdSystemDefault);
                                    if (uyb.k(context2)) {
                                        qv5 qv5Var = qv5.a;
                                        NotificationChannel notificationChannel = new nh9(context2).b.getNotificationChannel("four_seasons_reminder");
                                        if (notificationChannel == null || notificationChannel.getImportance() != 0) {
                                            z34 = true;
                                        } else {
                                            z34 = false;
                                        }
                                    } else {
                                        z34 = false;
                                    }
                                    if (z35) {
                                        x16Var16.invoke();
                                    } else {
                                        hs3 hs3Var = xqa.a1;
                                        Object objI = z5c.I(nu4.a, new xv5(hs3Var.a, hs3Var.b, null));
                                        if (v4e.Q((String) objI)) {
                                            objI = null;
                                        }
                                        String str6 = (String) objI;
                                        if (str6 != null) {
                                            try {
                                                dzbVar = LocalDate.parse(str6);
                                            } catch (Throwable th) {
                                                dzbVar = new dzb(th);
                                            }
                                            if (dzbVar instanceof dzb) {
                                                dzbVar = null;
                                            }
                                            localDate = (LocalDate) dzbVar;
                                        } else {
                                            localDate = null;
                                        }
                                        mic micVarB2 = yicVar4.b();
                                        int i12 = micVarB2 == null ? -1 : tv5.a[micVarB2.ordinal()];
                                        if (i12 == -1) {
                                            x16Var16.invoke();
                                        } else {
                                            if (i12 != 1) {
                                                if (i12 != 2) {
                                                    ap.c();
                                                    return null;
                                                }
                                            } else if (cr0.c(localDateTimeA) == nic.b && !z34 && !pa7.t(localDate, localDateTimeA.toLocalDate())) {
                                                if (z36) {
                                                    String strA = yicVar4.a();
                                                    if (strA != null) {
                                                        ynb.V(lw2.a, null, null, new wv5(xqa.a1.a, localDateTimeA.toLocalDate().toString(), null), 3);
                                                        x1f x1fVar = x1f.a;
                                                        x1f.k(new r05("popup_view"), new bt5(strA, 2), 2);
                                                    }
                                                }
                                                e89Var8.setValue(Boolean.TRUE);
                                            }
                                            x16Var16.invoke();
                                        }
                                    }
                                    return wef.a;
                                }
                            };
                            z11 = z8;
                            l46Var.p0(obj3);
                        }
                        x16Var7 = (x16) obj3;
                        boolean zI12 = l46Var.i(context) | l46Var.i(vu5Var);
                        if ((i5 & 896) == 256) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        z13 = zI12 | z12;
                        objR8 = l46Var.R();
                        if (z13) {
                            objR8 = new zt5(context, vu5Var, str3, null);
                            l46Var.p0(objR8);
                        } else {
                            objR8 = new zt5(context, vu5Var, str3, null);
                            l46Var.p0(objR8);
                        }
                        int i12 = vu5.b1;
                        af1.p(vu5Var, str3, (l26) objR8, l46Var);
                        zI2 = l46Var.i(context);
                        objR9 = l46Var.R();
                        if (zI2) {
                            objR9 = new eu5(context, null);
                            l46Var.p0(objR9);
                        } else {
                            objR9 = new eu5(context, null);
                            l46Var.p0(objR9);
                        }
                        af1.o((l26) objR9, l46Var, wef.a);
                        zG = l46Var.g(x16Var7);
                        objR10 = l46Var.R();
                        if (zG) {
                            objR10 = new c20(19, x16Var7);
                            l46Var.p0(objR10);
                        } else {
                            objR10 = new c20(19, x16Var7);
                            l46Var.p0(objR10);
                        }
                        rxg.a(false, (x16) objR10, l46Var, 0, 1);
                        ju5 ju5Var4 = (ju5) e89Var6.getValue();
                        j09 j09VarP2 = g21.P(g09.a, ii6Var);
                        zI3 = l46Var.i(vu5Var);
                        objR11 = l46Var.R();
                        if (zI3) {
                            objR11 = new sk3(0, vu5Var, vu5.class, "restorePurchase", "restorePurchase()V", 0, 12);
                            l46Var.p0(objR11);
                        } else {
                            objR11 = new sk3(0, vu5Var, vu5.class, "restorePurchase", "restorePurchase()V", 0, 12);
                            l46Var.p0(objR11);
                        }
                        ym7 ym7Var2 = (ym7) objR11;
                        zI4 = l46Var.i(vu5Var);
                        objR12 = l46Var.R();
                        if (zI4) {
                            objR12 = new ot1(29, vu5Var);
                            l46Var.p0(objR12);
                        } else {
                            objR12 = new ot1(29, vu5Var);
                            l46Var.p0(objR12);
                        }
                        a26 a26Var4 = (a26) objR12;
                        obj4 = e89Var6;
                        zG2 = l46Var.g(obj4) | l46Var.i(vu5Var);
                        objR13 = l46Var.R();
                        if (zG2) {
                            objR13 = new jt3(22, obj4, vu5Var);
                            l46Var.p0(objR13);
                        } else {
                            objR13 = new jt3(22, obj4, vu5Var);
                            l46Var.p0(objR13);
                        }
                        x16 x16Var16 = (x16) objR13;
                        x16 x16Var17 = (x16) ym7Var2;
                        boolean zG8 = l46Var.g(x16Var9);
                        if ((i5 & 7168) == 2048) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        z15 = z14 | zG8;
                        objR14 = l46Var.R();
                        if (z15) {
                            objR14 = new ct5(x16Var9, x16Var, 0);
                            l46Var.p0(objR14);
                        } else {
                            objR14 = new ct5(x16Var9, x16Var, 0);
                            l46Var.p0(objR14);
                        }
                        x16 x16Var18 = (x16) objR14;
                        boolean zG9 = l46Var.g(x16Var9);
                        if ((57344 & i5) == 16384) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        z17 = zG9 | z16;
                        objR15 = l46Var.R();
                        if (z17) {
                            objR15 = new ct5(x16Var9, x16Var2, 1);
                            l46Var.p0(objR15);
                        } else {
                            objR15 = new ct5(x16Var9, x16Var2, 1);
                            l46Var.p0(objR15);
                        }
                        x16 x16Var19 = (x16) objR15;
                        boolean zH7 = l46Var.h(z11);
                        if (i8 == 32) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        boolean z34 = zH7 | z18;
                        if ((i5 & 458752) == 131072) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        z20 = z34 | z19;
                        objR16 = l46Var.R();
                        if (z20) {
                            objR16 = new va4(z11, x16Var3, solarTerm, 2);
                            l46Var.p0(objR16);
                        } else {
                            objR16 = new va4(z11, x16Var3, solarTerm, 2);
                            l46Var.p0(objR16);
                        }
                        x16 x16Var110 = (x16) objR16;
                        boolean zH8 = l46Var.h(z11);
                        if (i8 == 32) {
                            z21 = true;
                        } else {
                            z21 = false;
                        }
                        z22 = z21 | zH8;
                        objR17 = l46Var.R();
                        if (z22) {
                            e89Var4 = e89Var3;
                            objR17 = new kt5(z11, solarTerm, e89Var4, 0);
                            l46Var.p0(objR17);
                        } else {
                            e89Var4 = e89Var3;
                            objR17 = new kt5(z11, solarTerm, e89Var4, 0);
                            l46Var.p0(objR17);
                        }
                        e89 e89Var8 = e89Var4;
                        mic micVar3 = micVar;
                        z23 = z11;
                        n(micVar3, ju5Var4, a26Var4, x16Var16, x16Var17, x16Var5, x16Var18, x16Var19, x16Var110, x16Var7, (x16) objR17, j09VarP2, l46Var, ((i5 >> 6) & 458752) | 64);
                        a26Var2 = a26Var;
                        bx5.a(micVar3, af1.b0(-1044322391, new m65(ii6Var, a26Var2, e89Var8, 1), l46Var), l46Var, 48);
                        if (((Boolean) e89Var2.getValue()).booleanValue()) {
                            l46Var.f0(-1019544244);
                            boolean zH9 = l46Var.h(z23) | l46Var.g(obj2);
                            if (i6 == 1048576) {
                                z24 = true;
                            } else {
                                z24 = false;
                            }
                            z25 = zH9 | z24;
                            Object objR29 = l46Var.R();
                            if (z25) {
                                z26 = z23;
                                e89Var5 = e89Var2;
                                nt5Var = new nt5(z26, x16Var4, obj2, e89Var5, 0);
                                x16Var6 = x16Var4;
                                l46Var.p0(nt5Var);
                            } else {
                                z26 = z23;
                                e89Var5 = e89Var2;
                                nt5Var = new nt5(z26, x16Var4, obj2, e89Var5, 0);
                                x16Var6 = x16Var4;
                                l46Var.p0(nt5Var);
                            }
                            x16 x16Var111 = (x16) nt5Var;
                            if (i6 == 1048576) {
                                z27 = true;
                            } else {
                                z27 = false;
                            }
                            objR18 = l46Var.R();
                            if (z27) {
                                objR18 = new k8(x16Var6, e89Var5, 5);
                                l46Var.p0(objR18);
                            } else {
                                objR18 = new k8(x16Var6, e89Var5, 5);
                                l46Var.p0(objR18);
                            }
                            b21.h(0, x16Var111, (x16) objR18, l46Var, z26);
                            l46Var.r(false);
                        } else {
                            x16Var6 = x16Var4;
                            l46Var.f0(-1019042602);
                            l46Var.r(false);
                        }
                    } else {
                        x16Var6 = x16Var4;
                        l46Var.Z();
                    }
                    ojb ojbVarV3 = l46Var.v();
                    if (ojbVarV3 != null) {
                        final int i13 = 2;
                        final x16 x16Var20 = x16Var6;
                        ojbVarV3.d = new l26(i2, solarTerm, str, x16Var, x16Var2, x16Var3, x16Var20, x16Var5, a26Var2, i3, i13) { // from class: ys5
                            public final /* synthetic */ int a;
                            public final /* synthetic */ int b;
                            public final /* synthetic */ SolarTerm c;
                            public final /* synthetic */ String d;
                            public final /* synthetic */ x16 e;
                            public final /* synthetic */ x16 f;
                            public final /* synthetic */ x16 g;
                            public final /* synthetic */ x16 v;
                            public final /* synthetic */ x16 w;
                            public final /* synthetic */ a26 x;

                            {
                                this.a = i13;
                            }

                            @Override // defpackage.l26
                            public final Object z(Object obj6, Object obj7) {
                                int i14 = this.a;
                                wef wefVar = wef.a;
                                switch (i14) {
                                    case 0:
                                        ((Integer) obj7).getClass();
                                        int iP = k99.P(1);
                                        kj0.m(this.b, this.c, this.d, this.e, this.f, this.g, this.v, this.w, this.x, (l46) obj6, iP);
                                        break;
                                    case 1:
                                        ((Integer) obj7).getClass();
                                        int iP2 = k99.P(1);
                                        kj0.m(this.b, this.c, this.d, this.e, this.f, this.g, this.v, this.w, this.x, (l46) obj6, iP2);
                                        break;
                                    default:
                                        ((Integer) obj7).getClass();
                                        int iP3 = k99.P(1);
                                        kj0.m(this.b, this.c, this.d, this.e, this.f, this.g, this.v, this.w, this.x, (l46) obj6, iP3);
                                        break;
                                }
                                return wefVar;
                            }
                        };
                    }
                }

                public static boolean m0(Throwable th) {
                    if ((th instanceof CancellationException) || (th instanceof UnknownHostException) || (th instanceof SocketTimeoutException) || (th instanceof InterruptedIOException) || (th instanceof ConnectException) || (th instanceof SocketException)) {
                        return true;
                    }
                    String name = th.getClass().getName();
                    String message = th.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    String lowerCase = message.toLowerCase(Locale.ROOT);
                    lowerCase.getClass();
                    return name.equals("retrofit2.HttpException") || (name.equals("android.system.ErrnoException") && (v4e.F(message, "ECONNABORTED", false) || v4e.F(message, "ECONNRESET", false) || v4e.F(message, "ENETUNREACH", false) || v4e.F(message, "ECONNREFUSED", false))) || v4e.F(lowerCase, "firebase installations failed to get installation auth token", false) || v4e.F(lowerCase, "firebase installations service is unavailable", false) || ((v4e.F(name, "FirebaseRemoteConfig", true) && v4e.F(lowerCase, "firebase installations", false)) || v4e.F(name, "FirebaseInstallations", true) || c5e.C(message, "HTTP 401", false) || message.equals("No auth"));
                }

                public static final void n(mic micVar, ju5 ju5Var, a26 a26Var, x16 x16Var, x16 x16Var2, x16 x16Var3, x16 x16Var4, x16 x16Var5, x16 x16Var6, x16 x16Var7, x16 x16Var8, j09 j09Var, l46 l46Var, int i2) {
                    int i3;
                    a26 a26Var2;
                    x16 x16Var9;
                    x16 x16Var10;
                    x16 x16Var11;
                    x16 x16Var12;
                    x16 x16Var13;
                    mic micVar2;
                    ju5Var.getClass();
                    a26Var.getClass();
                    x16Var.getClass();
                    x16Var2.getClass();
                    x16Var3.getClass();
                    x16Var4.getClass();
                    x16Var5.getClass();
                    x16Var6.getClass();
                    x16Var7.getClass();
                    x16Var8.getClass();
                    l46Var.h0(1929623004);
                    if ((i2 & 6) == 0) {
                        i3 = (l46Var.e(micVar.ordinal()) ? 4 : 2) | i2;
                    } else {
                        i3 = i2;
                    }
                    if ((i2 & 48) == 0) {
                        i3 |= (i2 & 64) == 0 ? l46Var.g(ju5Var) : l46Var.i(ju5Var) ? 32 : 16;
                    }
                    if ((i2 & 384) == 0) {
                        a26Var2 = a26Var;
                        i3 |= l46Var.i(a26Var2) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                    } else {
                        a26Var2 = a26Var;
                    }
                    if ((i2 & 3072) == 0) {
                        x16Var9 = x16Var;
                        i3 |= l46Var.i(x16Var9) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
                    } else {
                        x16Var9 = x16Var;
                    }
                    if ((i2 & 24576) == 0) {
                        x16Var10 = x16Var2;
                        i3 |= l46Var.i(x16Var10) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE;
                    } else {
                        x16Var10 = x16Var2;
                    }
                    if ((196608 & i2) == 0) {
                        x16Var11 = x16Var3;
                        i3 |= l46Var.i(x16Var11) ? 131072 : 65536;
                    } else {
                        x16Var11 = x16Var3;
                    }
                    if ((1572864 & i2) == 0) {
                        x16Var12 = x16Var4;
                        i3 |= l46Var.i(x16Var12) ? 1048576 : 524288;
                    } else {
                        x16Var12 = x16Var4;
                    }
                    if ((12582912 & i2) == 0) {
                        i3 |= l46Var.i(x16Var5) ? 8388608 : 4194304;
                    }
                    if ((100663296 & i2) == 0) {
                        i3 |= l46Var.i(x16Var6) ? 67108864 : 33554432;
                    }
                    if ((805306368 & i2) == 0) {
                        x16Var13 = x16Var7;
                        i3 |= l46Var.i(x16Var13) ? 536870912 : 268435456;
                    } else {
                        x16Var13 = x16Var7;
                    }
                    int i4 = i3;
                    if (l46Var.W(i4 & 1, ((i4 & 306783379) == 306783378 && (((l46Var.i(x16Var8) ? (char) 4 : (char) 2) | (l46Var.g(j09Var) ? ' ' : (char) 16)) & 19) == 18) ? false : true)) {
                        micVar2 = micVar;
                        bx5.a(micVar2, af1.b0(-1370963847, new dt5(micVar, ju5Var, a26Var2, x16Var9, x16Var10, x16Var11, x16Var12, x16Var5, x16Var6, x16Var13, x16Var8, j09Var), l46Var), l46Var, (i4 & 14) | 48);
                    } else {
                        micVar2 = micVar;
                        l46Var.Z();
                    }
                    ojb ojbVarV = l46Var.v();
                    if (ojbVarV != null) {
                        ojbVarV.d = new et5(micVar2, ju5Var, a26Var, x16Var, x16Var2, x16Var3, x16Var4, x16Var5, x16Var6, x16Var7, x16Var8, j09Var, i2);
                    }
                }

                public static final CharSequence n0(CharSequence charSequence, int i2) {
                    charSequence.getClass();
                    if (charSequence.length() >= 200) {
                        if (i2 != -1) {
                            int i3 = i2 - 30;
                            int i4 = i2 + 30;
                            String str = i3 <= 0 ? "" : ".....";
                            String str2 = i4 >= charSequence.length() ? "" : ".....";
                            StringBuilder sb = new StringBuilder(str);
                            if (i3 < 0) {
                                i3 = 0;
                            }
                            int length = charSequence.length();
                            if (i4 > length) {
                                i4 = length;
                            }
                            sb.append(charSequence.subSequence(i3, i4).toString());
                            sb.append(str2);
                            return sb.toString();
                        }
                        int length2 = charSequence.length() - 60;
                        if (length2 > 0) {
                            return "....." + charSequence.subSequence(length2, charSequence.length()).toString();
                        }
                    }
                    return charSequence;
                }

                public static final void o(final mic micVar, final ju5 ju5Var, final a26 a26Var, final x16 x16Var, final x16 x16Var2, x16 x16Var3, final x16 x16Var4, final x16 x16Var5, final x16 x16Var6, x16 x16Var7, x16 x16Var8, j09 j09Var, l46 l46Var, int i2) {
                    l46Var.h0(283418807);
                    int i3 = i2 | (l46Var.e(micVar.ordinal()) ? 4 : 2) | (l46Var.i(ju5Var) ? 32 : 16) | (l46Var.i(a26Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var.i(x16Var) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE) | (l46Var.i(x16Var2) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE) | (l46Var.i(x16Var3) ? 131072 : 65536) | (l46Var.i(x16Var4) ? 1048576 : 524288) | (l46Var.i(x16Var5) ? 8388608 : 4194304) | (l46Var.i(x16Var6) ? 67108864 : 33554432) | (l46Var.i(x16Var7) ? 536870912 : 268435456);
                    int i4 = (l46Var.i(x16Var8) ? 4 : 2) | (l46Var.g(j09Var) ? 32 : 16);
                    if (l46Var.W(i3 & 1, ((306783379 & i3) == 306783378 && (i4 & 19) == 18) ? false : true)) {
                        Object objR = l46Var.R();
                        Object obj = sf2.a;
                        if (objR == obj) {
                            ca2.a.getClass();
                            objR = q1c.f(Boolean.valueOf(ca2.c));
                            l46Var.p0(objR);
                        }
                        e89 e89Var = (e89) objR;
                        final boolean zBooleanValue = ((Boolean) e89Var.g()).booleanValue();
                        final a26 a26VarA = e89Var.a();
                        Object objR2 = l46Var.R();
                        if (objR2 == obj) {
                            objR2 = q1c.f(Boolean.FALSE);
                            l46Var.p0(objR2);
                        }
                        e89 e89Var2 = (e89) objR2;
                        Object objR3 = l46Var.R();
                        if (objR3 == obj) {
                            objR3 = q1c.f(null);
                            l46Var.p0(objR3);
                        }
                        e89 e89Var3 = (e89) objR3;
                        Object objR4 = l46Var.R();
                        if (objR4 == obj) {
                            objR4 = kv2.f(0, l46Var);
                        }
                        final s69 s69Var = (s69) objR4;
                        final float fZ = ((sw3) l46Var.k(zg2.h)).Z(((sz9) s69Var).j());
                        boolean zH = l46Var.h(zBooleanValue);
                        Object objR5 = l46Var.R();
                        int i5 = 3;
                        if (zH || objR5 == obj) {
                            objR5 = new so2(zBooleanValue, e89Var3, e89Var2, i5);
                            l46Var.p0(objR5);
                        }
                        final a26 a26Var2 = (a26) objR5;
                        xdc.a(j09Var, af1.b0(973388667, new q8(micVar, x16Var7, x16Var8, x16Var3), l46Var), null, null, null, 0, ((e8b) l46Var.k(l8b.a)).e, 0L, null, af1.b0(1940357830, new n26() { // from class: gt5
                            @Override // defpackage.n26
                            public final Object m(Object obj2, Object obj3, Object obj4) {
                                long j2;
                                float f2;
                                xw9 xw9Var = (xw9) obj2;
                                l46 l46Var2 = (l46) obj3;
                                int iIntValue = ((Integer) obj4).intValue();
                                xw9Var.getClass();
                                if ((iIntValue & 6) == 0) {
                                    iIntValue |= l46Var2.g(xw9Var) ? 4 : 2;
                                }
                                if (l46Var2.W(iIntValue & 1, (iIntValue & 19) != 18)) {
                                    FillElement fillElement = androidx.compose.foundation.layout.b.c;
                                    lx0 lx0Var = ndb.b;
                                    xn8 xn8VarC = s21.c(lx0Var, false);
                                    int iHashCode = Long.hashCode(l46Var2.T);
                                    u8a u8aVarM = l46Var2.m();
                                    j09 j09VarJ = m93.J(l46Var2, fillElement);
                                    lf2.q.getClass();
                                    l46Var2.j0();
                                    boolean z = l46Var2.S;
                                    ov7 ov7Var = LayoutNode.h1;
                                    if (z) {
                                        l46Var2.l(ov7Var);
                                    } else {
                                        l46Var2.s0();
                                    }
                                    he2 he2Var = hj6.z;
                                    dec.l(he2Var, l46Var2, xn8VarC);
                                    he2 he2Var2 = hj6.y;
                                    dec.l(he2Var2, l46Var2, u8aVarM);
                                    Integer numValueOf = Integer.valueOf(iHashCode);
                                    he2 he2Var3 = hj6.X;
                                    dec.l(he2Var3, l46Var2, numValueOf);
                                    dec.k(l46Var2);
                                    he2 he2Var4 = hj6.x;
                                    dec.l(he2Var4, l46Var2, j09VarJ);
                                    l46Var2.f0(522029685);
                                    yv5 yv5Var = bx5.a;
                                    if (g21.S(l46Var2)) {
                                        l46Var2.f0(-1298313670);
                                        j2 = bx5.b(l46Var2).g;
                                        l46Var2.r(false);
                                    } else {
                                        l46Var2.f0(-1298312231);
                                        j2 = bx5.b(l46Var2).h;
                                        l46Var2.r(false);
                                    }
                                    b68 b68VarO = gec.O(new iy9[]{new iy9(Float.valueOf(0.0f), new y72(j2)), new iy9(Float.valueOf(0.5f), new y72(j2)), new iy9(Float.valueOf(1.0f), new y72(y72.b(j2, 0.0f)))}, 0.0f, 0.0f, 14);
                                    l46Var2.r(false);
                                    j09 j09VarN = tm7.n(fillElement, b68VarO, null, 6);
                                    xn8 xn8VarC2 = s21.c(lx0Var, false);
                                    int iHashCode2 = Long.hashCode(l46Var2.T);
                                    u8a u8aVarM2 = l46Var2.m();
                                    j09 j09VarJ2 = m93.J(l46Var2, j09VarN);
                                    l46Var2.j0();
                                    if (l46Var2.S) {
                                        l46Var2.l(ov7Var);
                                    } else {
                                        l46Var2.s0();
                                    }
                                    dec.l(he2Var, l46Var2, xn8VarC2);
                                    dec.l(he2Var2, l46Var2, u8aVarM2);
                                    ib8.s(iHashCode2, l46Var2, he2Var3, l46Var2);
                                    dec.l(he2Var4, l46Var2, j09VarJ2);
                                    c92 c92VarA = a92.a(xc0.c, ndb.Y, l46Var2, 0);
                                    int iHashCode3 = Long.hashCode(l46Var2.T);
                                    u8a u8aVarM3 = l46Var2.m();
                                    j09 j09VarJ3 = m93.J(l46Var2, fillElement);
                                    l46Var2.j0();
                                    if (l46Var2.S) {
                                        l46Var2.l(ov7Var);
                                    } else {
                                        l46Var2.s0();
                                    }
                                    dec.l(he2Var, l46Var2, c92VarA);
                                    dec.l(he2Var2, l46Var2, u8aVarM3);
                                    ib8.s(iHashCode3, l46Var2, he2Var3, l46Var2);
                                    dec.l(he2Var4, l46Var2, j09VarJ3);
                                    float fD = xw9Var.d();
                                    g09 g09Var = g09.a;
                                    o5c.f(l46Var2, androidx.compose.foundation.layout.b.d(g09Var, fD));
                                    ju5 ju5Var2 = ju5Var;
                                    qs5 qs5Var = ju5Var2.e;
                                    qs5 qs5Var2 = qs5.c;
                                    mic micVar2 = micVar;
                                    if (qs5Var == qs5Var2 || qs5Var == qs5.d) {
                                        l46Var2.f0(-1723683808);
                                        f2 = 1.0f;
                                        kj0.e(micVar2, androidx.compose.foundation.layout.b.c(g09Var, 1.0f), l46Var2, 48);
                                        l46Var2.r(false);
                                    } else {
                                        l46Var2.f0(-1723593474);
                                        l46Var2.r(false);
                                        f2 = 1.0f;
                                    }
                                    kj0.k(micVar2, ju5Var2.e, fZ, new jw7(f2, true), l46Var2, 0);
                                    l46Var2.r(true);
                                    l46Var2.r(true);
                                    j09 j09VarA = d31.a.a(g09Var, ndb.w);
                                    Object objR6 = l46Var2.R();
                                    if (objR6 == sf2.a) {
                                        objR6 = new pr1(s69Var, 5);
                                        l46Var2.p0(objR6);
                                    }
                                    kj0.l(micVar2, ju5Var2, zBooleanValue, a26VarA, a26Var, x16Var, x16Var2, x16Var4, x16Var5, x16Var6, a26Var2, ym8.D(j09VarA, (a26) objR6), l46Var2, 64);
                                    l46Var2.r(true);
                                } else {
                                    l46Var2.Z();
                                }
                                return wef.a;
                            }
                        }, l46Var), l46Var, ((i4 >> 3) & 14) | 805306416, 444);
                        if (((Boolean) e89Var2.getValue()).booleanValue()) {
                            l46Var.f0(-572594633);
                            k00 k00VarM = z5c.m(0, l46Var, xtd.a(z5c.r(l46Var), bx5.b(l46Var).a, 65534));
                            String strQ = afc.q(R.string.confirm_to_purchase, l46Var);
                            String strQ2 = afc.q(R.string.disagree, l46Var);
                            String strQ3 = afc.q(R.string.continute_to_purchase, l46Var);
                            dd2 dd2VarB0 = af1.b0(-423161791, new xg(k00VarM, 2), l46Var);
                            Object objR6 = l46Var.R();
                            if (objR6 == obj) {
                                objR6 = new ok3(e89Var2, 20);
                                l46Var.p0(objR6);
                            }
                            x16 x16Var9 = (x16) objR6;
                            boolean zG = l46Var.g(a26VarA);
                            Object objR7 = l46Var.R();
                            if (zG || objR7 == obj) {
                                objR7 = new q20(a26VarA, e89Var2, e89Var3, 1);
                                l46Var.p0(objR7);
                            }
                            F(strQ, dd2VarB0, strQ3, strQ2, false, false, null, null, x16Var9, (x16) objR7, l46Var, 100663344, 240);
                            l46Var.r(false);
                        } else {
                            l46Var.f0(-572021877);
                            l46Var.r(false);
                        }
                    } else {
                        l46Var.Z();
                    }
                    ojb ojbVarV = l46Var.v();
                    if (ojbVarV != null) {
                        ojbVarV.d = new dt5(micVar, ju5Var, a26Var, x16Var, x16Var2, x16Var3, x16Var4, x16Var5, x16Var6, x16Var7, x16Var8, j09Var, i2);
                    }
                }

                public static final String o0(String str, Number number) {
                    StringBuilder sb = new StringBuilder("Unexpected special floating-point value ");
                    sb.append(number);
                    return ks0.l(sb, str != null ? ib8.j(" with key ", str, ". ") : ". ", "By default, non-finite floating point values are prohibited because they do not conform JSON specification.");
                }

                public static final void p(String str, l46 l46Var, int i2) {
                    l46Var.h0(1002788303);
                    int i3 = i2 | (l46Var.g(str) ? 4 : 2);
                    if (l46Var.W(i3 & 1, (i3 & 3) != 2)) {
                        mue mueVar = pue.a;
                        nte.b(str, androidx.compose.foundation.layout.b.c(g09.a, 1.0f), ((e8b) l46Var.k(l8b.a)).s, 0L, null, null, 0L, null, new jme(3), 0L, 0, false, 0, 0, null, pue.g(l46Var), l46Var, (i3 & 14) | 48, 0, 130040);
                    } else {
                        l46Var.Z();
                    }
                    ojb ojbVarV = l46Var.v();
                    if (ojbVarV != null) {
                        ojbVarV.d = new o8(str, i2, 14);
                    }
                }

                public static kx p0(kj7 kj7Var, uh8 uh8Var) {
                    return new kx(ep7.a(kj7Var, uh8Var, 1.0f, ndb.J0, false), 0);
                }

                /* JADX WARN: Multi-variable type inference failed */
                public static final void q(final use useVar, final boolean z, final boolean z2, final boolean z3, final u47 u47Var, final Integer num, final fo5 fo5Var, final boolean z4, final boolean z5, final float f2, final int i2, final a26 a26Var, final a26 a26Var2, final x16 x16Var, l46 l46Var, final int i3, final int i4) {
                    int i5;
                    int i6;
                    l46 l46Var2;
                    g09 g09Var;
                    j09 j09Var;
                    float f3;
                    int i7;
                    j09 j09VarF;
                    boolean z6;
                    long j2;
                    long j3;
                    boolean z7;
                    long j4;
                    long j5;
                    xpe xpeVar;
                    boolean z8;
                    e89 e89Var;
                    int i8;
                    j09 j09VarW;
                    l46 l46Var3 = l46Var;
                    useVar.getClass();
                    fo5Var.getClass();
                    x16Var.getClass();
                    l46Var3.h0(-1599421682);
                    if ((i3 & 6) == 0) {
                        i5 = i3 | (l46Var3.g(useVar) ? 4 : 2);
                    } else {
                        i5 = i3;
                    }
                    if ((i3 & 48) == 0) {
                        i5 |= l46Var3.h(z) ? 32 : 16;
                    }
                    int i9 = i3 & 384;
                    int i10 = UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                    if (i9 == 0) {
                        i5 |= l46Var3.h(z2) ? 256 : 128;
                    }
                    if ((i3 & 3072) == 0) {
                        i5 |= l46Var3.h(z3) ? 2048 : 1024;
                    }
                    if ((i3 & 24576) == 0) {
                        i5 |= l46Var3.g(u47Var) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE;
                    }
                    if ((196608 & i3) == 0) {
                        i5 |= l46Var3.g(num) ? 131072 : 65536;
                    }
                    if ((1572864 & i3) == 0) {
                        i5 |= l46Var3.g(fo5Var) ? 1048576 : 524288;
                    }
                    if ((12582912 & i3) == 0) {
                        i5 |= l46Var3.h(z4) ? 8388608 : 4194304;
                    }
                    if ((100663296 & i3) == 0) {
                        i5 |= l46Var3.h(z5) ? 67108864 : 33554432;
                    }
                    if ((805306368 & i3) == 0) {
                        i5 |= l46Var3.d(f2) ? 536870912 : 268435456;
                    }
                    int i11 = i5;
                    if ((i4 & 6) == 0) {
                        i6 = i4 | (l46Var3.e(i2) ? 4 : 2);
                    } else {
                        i6 = i4;
                    }
                    if ((i4 & 48) == 0) {
                        i6 |= l46Var3.i(a26Var) ? 32 : 16;
                    }
                    if ((i4 & 384) == 0) {
                        if (l46Var3.i(a26Var2)) {
                            i10 = 256;
                        }
                        i6 |= i10;
                    }
                    if ((i4 & 3072) == 0) {
                        i6 |= l46Var3.i(x16Var) ? 2048 : 1024;
                    }
                    int i12 = i6 | 24576;
                    if (l46Var3.W(i11 & 1, ((i11 & 306783379) == 306783378 && (i12 & 9363) == 9362) ? false : true)) {
                        l46Var3.b0();
                        if ((i3 & 1) != 0 && !l46Var3.C()) {
                            l46Var3.Z();
                        }
                        l46Var3.s();
                        Object objR = l46Var3.R();
                        Object obj = sf2.a;
                        if (objR == obj) {
                            objR = q1c.f(Boolean.valueOf(z4));
                            l46Var3.p0(objR);
                        }
                        e89 e89Var2 = (e89) objR;
                        boolean z9 = (i12 & 112) == 32;
                        Object objR2 = l46Var3.R();
                        if (z9 || objR2 == obj) {
                            objR2 = new zh1(a26Var, 2);
                            l46Var3.p0(objR2);
                        }
                        int i13 = (i11 >> 21) & 14;
                        rxg.a(z4, (x16) objR2, l46Var3, i13, 0);
                        Object objR3 = l46Var3.R();
                        if (objR3 == obj) {
                            objR3 = af1.E(l46Var3);
                            l46Var3.p0(objR3);
                        }
                        aw2 aw2Var = (aw2) objR3;
                        Object objR4 = l46Var3.R();
                        if (objR4 == obj) {
                            objR4 = ib8.e(l46Var3);
                        }
                        t69 t69Var = (t69) objR4;
                        h0e h0eVarA = vx.a(z4 ? 0.0f : 0.5f, b21.T(350, 0, null, 6), "borderWidth", l46Var3, 432, 8);
                        h0e h0eVarA2 = vx.a(z4 ? 0.0f : 16.0f, b21.T(350, 0, null, 6), "textFieldPadding", l46Var, 432, 8);
                        vx.a(z4 ? 0.0f : 24.0f, b21.T(350, 0, null, 6), "textFieldTopPadding", l46Var, 432, 8);
                        g09 g09Var2 = g09.a;
                        if (z4) {
                            l46Var.f0(-2144005);
                            if (z5) {
                                g09Var = g09Var2;
                                j09VarW = mh3.W(ynb.d0(0.0f, 64.0f, 0.0f, 0.0f, 13, g09Var2));
                            } else {
                                g09Var = g09Var2;
                                j09VarW = g09Var;
                            }
                            j09 j09VarO = tm7.o(j09VarW, ((e8b) l46Var.k(l8b.a)).a, g21.f);
                            l46Var.r(false);
                            j09Var = j09VarO;
                        } else {
                            g09Var = g09Var2;
                            l46Var.f0(554129078);
                            l46Var.r(false);
                            j09Var = g09Var;
                        }
                        lx0 lx0Var = ndb.b;
                        xn8 xn8VarC = s21.c(lx0Var, false);
                        int iHashCode = Long.hashCode(l46Var.T);
                        u8a u8aVarM = l46Var.m();
                        j09 j09VarJ = m93.J(l46Var, j09Var);
                        lf2.q.getClass();
                        l46Var.j0();
                        boolean z10 = l46Var.S;
                        x16 x16Var2 = LayoutNode.h1;
                        if (z10) {
                            l46Var.l(x16Var2);
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
                        float f4 = ((Boolean) e89Var2.getValue()).booleanValue() ? 120.0f : 56.0f;
                        if (z4) {
                            j09VarF = androidx.compose.foundation.layout.b.c;
                            f3 = 0.0f;
                            i7 = 2;
                        } else {
                            f3 = 0.0f;
                            i7 = 2;
                            j09VarF = androidx.compose.foundation.layout.b.f(f4, 0.0f, g09Var, 2);
                        }
                        j09 j09VarW2 = eb3.w(ynb.d0(0.0f, z4 ? 24.0f : f2, 0.0f, z4 ? 24.0f : 12.0f, 5, ynb.b0(24.0f, f3, androidx.compose.foundation.layout.b.c(g09Var, 1.0f), i7)).D(j09VarF), null, 3);
                        xn8 xn8VarC2 = s21.c(lx0Var, false);
                        int iHashCode2 = Long.hashCode(l46Var.T);
                        u8a u8aVarM2 = l46Var.m();
                        j09 j09VarJ2 = m93.J(l46Var, j09VarW2);
                        l46Var.j0();
                        if (l46Var.S) {
                            l46Var.l(x16Var2);
                        } else {
                            l46Var.s0();
                        }
                        dec.l(he2Var, l46Var, xn8VarC2);
                        dec.l(he2Var2, l46Var, u8aVarM2);
                        ib8.s(iHashCode2, l46Var, he2Var3, l46Var);
                        dec.l(he2Var4, l46Var, j09VarJ2);
                        if (z4) {
                            l46Var.f0(-1345899259);
                            z6 = false;
                            l46Var.r(false);
                            j2 = y72.j;
                        } else {
                            z6 = false;
                            l46Var.f0(-1345898461);
                            j2 = ((e8b) l46Var.k(l8b.a)).c;
                            l46Var.r(false);
                        }
                        long j6 = j2;
                        if (z4) {
                            l46Var.f0(-1345895995);
                            l46Var.r(z6);
                            j3 = y72.j;
                        } else {
                            l46Var.f0(-1345895197);
                            j3 = ((e8b) l46Var.k(l8b.a)).c;
                            l46Var.r(z6);
                        }
                        long j7 = j3;
                        long j8 = o7c.n(l46Var).a;
                        b1b b1bVar = o82.a;
                        long jB = y72.b(((m82) l46Var.k(b1bVar)).s, 0.6f);
                        long jB2 = y72.b(((m82) l46Var.k(b1bVar)).s, 0.6f);
                        if (z4) {
                            l46Var.f0(-1345885275);
                            z7 = false;
                            l46Var.r(false);
                            j4 = y72.j;
                        } else {
                            z7 = false;
                            l46Var.f0(-1345884498);
                            j4 = ((e8b) l46Var.k(l8b.a)).z;
                            l46Var.r(false);
                        }
                        long j9 = j4;
                        if (z4) {
                            l46Var.f0(-1345881787);
                            l46Var.r(z7);
                            j5 = y72.j;
                        } else {
                            l46Var.f0(-1345881010);
                            j5 = ((e8b) l46Var.k(l8b.a)).z;
                            l46Var.r(z7);
                        }
                        long j10 = j5;
                        j09 j09Var2 = j09VarF;
                        g09 g09Var3 = g09Var;
                        wne wneVarV0 = qk6.v0(0L, 0L, 0L, j6, j7, 0L, 0L, j8, j9, j10, 0L, jB, jB2, l46Var, 1744824015);
                        boolean z11 = (num == null || z4) ? false : true;
                        j09 j09VarD = ynb.d0(0.0f, 0.0f, 64.0f, 0.0f, 11, androidx.compose.foundation.layout.b.c(g09Var3, 1.0f)).D(j09Var2);
                        xn8 xn8VarC3 = s21.c(lx0Var, false);
                        boolean z12 = z11;
                        int iHashCode3 = Long.hashCode(l46Var.T);
                        u8a u8aVarM3 = l46Var.m();
                        j09 j09VarJ3 = m93.J(l46Var, j09VarD);
                        l46Var.j0();
                        if (l46Var.S) {
                            l46Var.l(x16Var2);
                        } else {
                            l46Var.s0();
                        }
                        dec.l(he2Var, l46Var, xn8VarC3);
                        dec.l(he2Var2, l46Var, u8aVarM3);
                        ib8.s(iHashCode3, l46Var, he2Var3, l46Var);
                        dec.l(he2Var4, l46Var, j09VarJ3);
                        if (z4) {
                            xpeVar = new xpe(0, 3);
                            z8 = true;
                        } else {
                            z8 = true;
                            xpeVar = new xpe(5, 1);
                        }
                        mue mueVarA = mue.a((mue) l46Var.k(nte.a), ((e8b) l46Var.k(l8b.a)).q, w6c.l(17), null, null, 0L, null, 0, w6c.l(24), null, null, 16646140);
                        j09 j09VarD2 = androidx.compose.foundation.layout.b.c(y7h.n(g09Var3, u47Var), 1.0f).D(j09Var2);
                        boolean z13 = (i12 & 896) == 256 ? z8 : false;
                        Object objR5 = l46Var.R();
                        if (z13 || objR5 == obj) {
                            e89Var = e89Var2;
                            i8 = 0;
                            objR5 = new yx1(a26Var2, e89Var, i8);
                            l46Var.p0(objR5);
                        } else {
                            e89Var = e89Var2;
                            i8 = 0;
                        }
                        e89 e89Var3 = e89Var;
                        boolean z14 = i8;
                        tv0.b(useVar, ok8.u(nk8.v(j09VarD2, (a26) objR5), fo5Var), z3, u47Var, mueVarA, null, null, xpeVar, null, t69Var, new dtd(wneVarV0.i), new cy1(useVar, z12, z3, t69Var, wneVarV0, h0eVarA2, num, z4, i2, h0eVarA), null, l46Var, (i11 & 14) | ((i11 >> 3) & 896) | (i11 & 57344), 6, 21192);
                        l46 l46Var4 = l46Var;
                        d31 d31Var = d31.a;
                        if (z12) {
                            l46Var4.f0(-1632993273);
                            i7h.b(useVar.d().c.length(), num.intValue(), ynb.d0(((yi4) h0eVarA2.getValue()).a, 0.0f, 0.0f, ((yi4) h0eVarA2.getValue()).a, 6, d31Var.a(g09Var3, ndb.v)), null, null, l46Var4, (i11 >> 12) & 112);
                            l46Var4.r(z14);
                        } else {
                            l46Var4.f0(-1632629054);
                            l46Var4.r(z14);
                        }
                        l46Var4.r(true);
                        m93.d((((Boolean) e89Var3.getValue()).booleanValue() || z4) ? true : z14 ? 1 : 0, d31Var.a(g09Var3, ndb.d), rw4.f(b21.T(350, z14 ? 1 : 0, null, 6), 2), rw4.g(b21.T(350, z14 ? 1 : 0, null, 6), 2), null, af1.b0(-166956686, new zx1(z4, a26Var, aw2Var, fo5Var, 0), l46Var4), l46Var4, 200064, 16);
                        r((i12 >> 3) & 896, x16Var, l46Var4, d31Var.a(g09Var3, ndb.x), ((useVar.d().c.length() <= 0 && !z2) || !z) ? z14 ? 1 : 0 : true);
                        l46Var4.r(true);
                        m93.d(z4, d31Var.a(g09Var3, lx0Var), rw4.f(b21.T(350, z14 ? 1 : 0, null, 6), 2).a(rw4.d(13)), rw4.g(b21.T(350, z14 ? 1 : 0, null, 6), 2).a(rw4.k(13)), null, cn1.b, l46Var4, i13 | 200064, 16);
                        l46Var4.r(true);
                        l46Var2 = l46Var4;
                    } else {
                        l46Var3.Z();
                        l46Var2 = l46Var3;
                    }
                    ojb ojbVarV = l46Var2.v();
                    if (ojbVarV != null) {
                        ojbVarV.d = new l26() { // from class: ay1
                            @Override // defpackage.l26
                            public final Object z(Object obj2, Object obj3) {
                                ((Integer) obj3).getClass();
                                int iP = k99.P(i3 | 1);
                                int iP2 = k99.P(i4);
                                kj0.q(useVar, z, z2, z3, u47Var, num, fo5Var, z4, z5, f2, i2, a26Var, a26Var2, x16Var, (l46) obj2, iP, iP2);
                                return wef.a;
                            }
                        };
                    }
                }

                public static lx q0(cj7 cj7Var, uh8 uh8Var, boolean z) {
                    return new lx(2, ep7.a(cj7Var, uh8Var, z ? xqf.c() : 1.0f, af8.X, false));
                }

                public static final void r(int i2, x16 x16Var, l46 l46Var, j09 j09Var, boolean z) {
                    int i3;
                    l46 l46Var2;
                    j09 j09Var2;
                    l46Var.h0(2012266487);
                    if ((i2 & 6) == 0) {
                        i3 = (l46Var.g(j09Var) ? 4 : 2) | i2;
                    } else {
                        i3 = i2;
                    }
                    if ((i2 & 48) == 0) {
                        i3 |= l46Var.h(z) ? 32 : 16;
                    }
                    if ((i2 & 384) == 0) {
                        i3 |= l46Var.i(x16Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                    }
                    if (l46Var.W(i3 & 1, (i3 & 147) != 146)) {
                        l46Var2 = l46Var;
                        cn1.f(Boolean.valueOf(z), j09Var, null, "send-btn", af1.b0(746827416, new n(3, x16Var), l46Var), l46Var2, ((i3 >> 3) & 14) | 27648 | ((i3 << 3) & 112), 4);
                        j09Var2 = j09Var;
                    } else {
                        l46Var2 = l46Var;
                        j09Var2 = j09Var;
                        l46Var2.Z();
                    }
                    ojb ojbVarV = l46Var2.v();
                    if (ojbVarV != null) {
                        ojbVarV.d = new cv(j09Var2, z, x16Var, i2, 1);
                    }
                }

                public static kx r0(kj7 kj7Var, uh8 uh8Var, int i2) {
                    ff8 ff8Var = new ff8(8);
                    ff8Var.b = i2;
                    ArrayList arrayListA = ep7.a(kj7Var, uh8Var, 1.0f, ff8Var, false);
                    for (int i3 = 0; i3 < arrayListA.size(); i3++) {
                        bp7 bp7Var = (bp7) arrayListA.get(i3);
                        wc6 wc6Var = (wc6) bp7Var.b;
                        wc6 wc6Var2 = (wc6) bp7Var.c;
                        if (wc6Var != null && wc6Var2 != null) {
                            float[] fArr = wc6Var.a;
                            int length = fArr.length;
                            float[] fArr2 = wc6Var2.a;
                            if (length != fArr2.length) {
                                int length2 = fArr.length + fArr2.length;
                                float[] fArr3 = new float[length2];
                                System.arraycopy(fArr, 0, fArr3, 0, fArr.length);
                                System.arraycopy(fArr2, 0, fArr3, fArr.length, fArr2.length);
                                Arrays.sort(fArr3);
                                float f2 = Float.NaN;
                                int i4 = 0;
                                for (int i5 = 0; i5 < length2; i5++) {
                                    float f3 = fArr3[i5];
                                    if (f3 != f2) {
                                        fArr3[i4] = f3;
                                        i4++;
                                        f2 = fArr3[i5];
                                    }
                                }
                                float[] fArrCopyOfRange = Arrays.copyOfRange(fArr3, 0, i4);
                                bp7Var = new bp7(wc6Var.b(fArrCopyOfRange), wc6Var2.b(fArrCopyOfRange));
                            }
                        }
                        arrayListA.set(i3, bp7Var);
                    }
                    return new kx(arrayListA, 1);
                }

                public static final void s(int i2, int i3, l46 l46Var) {
                    l46 l46Var2;
                    l46Var.h0(470767229);
                    int i4 = (l46Var.e(i2) ? 4 : 2) | i3;
                    if (l46Var.W(i4 & 1, (i4 & 3) != 2)) {
                        l46Var2 = l46Var;
                        feg.j(od4.A(i2, i4 & 14, l46Var), null, androidx.compose.foundation.layout.b.c(g09.a, 1.0f), null, an2.d, 0.0f, null, l46Var2, 25016, 104);
                    } else {
                        l46Var2 = l46Var;
                        l46Var2.Z();
                    }
                    ojb ojbVarV = l46Var2.v();
                    if (ojbVarV != null) {
                        ojbVarV.d = new os1(i2, i3, 3);
                    }
                }

                public static kx s0(cj7 cj7Var, uh8 uh8Var) {
                    return new kx(ep7.a(cj7Var, uh8Var, 1.0f, ndb.X0, false), 2);
                }

                public static final void t(int i2, l46 l46Var) {
                    l46Var.h0(-921302284);
                    if (l46Var.W(i2 & 1, i2 != 0)) {
                        String strQ = afc.q(R.string.four_seasons_intro_desc, l46Var);
                        mue mueVar = pue.a;
                        nte.b(strQ, ynb.b0(24.0f, 0.0f, androidx.compose.foundation.layout.b.c(g09.a, 1.0f), 2), ((e8b) l46Var.k(l8b.a)).q, 0L, null, null, 0L, null, new jme(3), 0L, 0, false, 0, 0, null, pue.c(l46Var), l46Var, 48, 0, 130040);
                    } else {
                        l46Var.Z();
                    }
                    ojb ojbVarV = l46Var.v();
                    if (ojbVarV != null) {
                        ojbVarV.d = new qv2(i2, 29);
                    }
                }

                public static kx t0(kj7 kj7Var, uh8 uh8Var) {
                    return new kx(ep7.a(kj7Var, uh8Var, xqf.c(), af8.T0, true), 3);
                }

                public static final th7 u(String str, Number number) {
                    return new th7(o0(str, number), null, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'");
                }

                public static j09 u0(j09 j09Var, boolean z, y6c y6cVar, ved vedVar) {
                    long j2 = y72.k;
                    jea jeaVar = jea.b;
                    jea jeaVar2 = jea.c;
                    j09Var.getClass();
                    return m93.u(j09Var, new kea(z, j2, y6cVar, vedVar, jeaVar, jeaVar2));
                }

                public static final th7 v(nyc nycVar) {
                    nycVar.getClass();
                    return new th7("Value of type '" + nycVar.a() + "' can't be used in JSON as a key in the map. It should have either primitive or enum kind, but its kind is '" + nycVar.g() + '\'', nycVar.a(), "Use 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.");
                }

                public static final void w(int i2, l46 l46Var, j09 j09Var, String str) {
                    String str2;
                    j09 j09Var2;
                    boolean z;
                    l46 l46Var2 = l46Var;
                    l46Var2.h0(1932865041);
                    int i3 = i2 | 6 | (l46Var2.g(str) ? 32 : 16);
                    int i4 = 0;
                    if (l46Var2.W(i3 & 1, (i3 & 19) != 18)) {
                        String strQ = afc.q(R.string.invitation_copy_code_success, l46Var2);
                        c52 c52Var = (c52) l46Var2.k(zg2.f);
                        Object objR = l46Var2.R();
                        i8c i8cVar = sf2.a;
                        if (objR == i8cVar) {
                            objR = af1.E(l46Var2);
                            l46Var2.p0(objR);
                        }
                        aw2 aw2Var = (aw2) objR;
                        g09 g09Var = g09.a;
                        j09 j09VarE = oa7.E(androidx.compose.foundation.layout.b.q(100.0f, 0.0f, androidx.compose.foundation.layout.b.f(32.0f, 0.0f, g09Var, 2), 2), a7c.b(12.0f));
                        pr4 pr4Var = l8b.a;
                        long j2 = ((e8b) l46Var2.k(pr4Var)).m;
                        y02 y02Var = g21.f;
                        j09 j09VarR = o8c.r(0, l46Var2, ynb.a0(tm7.o(j09VarE, j2, y02Var), 12.0f, 4.0f), str == null);
                        t7c t7cVarA = s7c.a(new uc0(8.0f, true, new qc0(i4)), ndb.z, l46Var2, 54);
                        int iHashCode = Long.hashCode(l46Var2.T);
                        u8a u8aVarM = l46Var2.m();
                        j09 j09VarJ = m93.J(l46Var2, j09VarR);
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
                        dec.l(he2Var, l46Var2, t7cVarA);
                        he2 he2Var2 = hj6.y;
                        dec.l(he2Var2, l46Var2, u8aVarM);
                        Integer numValueOf = Integer.valueOf(iHashCode);
                        he2 he2Var3 = hj6.X;
                        dec.l(he2Var3, l46Var2, numValueOf);
                        dec.k(l46Var2);
                        he2 he2Var4 = hj6.x;
                        dec.l(he2Var4, l46Var2, j09VarJ);
                        l46Var2.f0(1700327492);
                        if (str == null) {
                            l46Var2.r(false);
                            str2 = str;
                            z = true;
                            j09Var2 = g09Var;
                        } else {
                            j09Var2 = g09Var;
                            nte.b(str, null, ((e8b) l46Var2.k(pr4Var)).u, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mue.a((mue) l46Var2.k(nte.a), 0L, w6c.l(24), ar5.e, null, 0L, null, 0, 0L, null, null, 16777209), l46Var, (i3 >> 3) & 14, 0, 131066);
                            j09 j09VarO = tm7.o(oa7.E(androidx.compose.foundation.layout.b.l(j09Var2, 28.0f), a7c.b(4.0f)), ((e8b) l46Var.k(pr4Var)).c, y02Var);
                            boolean zI = l46Var.i(aw2Var) | ((i3 & 112) == 32) | l46Var.i(c52Var) | l46Var.g(strQ);
                            Object objR2 = l46Var.R();
                            if (zI || objR2 == i8cVar) {
                                jr jrVar = new jr(aw2Var, str, c52Var, strQ, 6);
                                str2 = str;
                                l46Var.p0(jrVar);
                                objR2 = jrVar;
                            } else {
                                str2 = str;
                            }
                            j09 j09VarZ = ynb.Z(b.c(j09VarO, false, null, null, (x16) objR2, 15), 4.0f);
                            xn8 xn8VarC = s21.c(ndb.b, false);
                            int iHashCode2 = Long.hashCode(l46Var.T);
                            u8a u8aVarM2 = l46Var.m();
                            j09 j09VarJ2 = m93.J(l46Var, j09VarZ);
                            l46Var.j0();
                            if (l46Var.S) {
                                l46Var.l(ov7Var);
                            } else {
                                l46Var.s0();
                            }
                            dec.l(he2Var, l46Var, xn8VarC);
                            dec.l(he2Var2, l46Var, u8aVarM2);
                            ib8.s(iHashCode2, l46Var, he2Var3, l46Var);
                            dec.l(he2Var4, l46Var, j09VarJ2);
                            l46Var2 = l46Var;
                            gu6.a(hkg.u0(), null, d31.a.b(j09Var2), ((e8b) l46Var.k(pr4Var)).u, l46Var2, 48, 0);
                            z = true;
                            l46Var2.r(true);
                            l46Var2.r(false);
                        }
                        l46Var2.r(z);
                    } else {
                        str2 = str;
                        l46Var2.Z();
                        j09Var2 = j09Var;
                    }
                    ojb ojbVarV = l46Var2.v();
                    if (ojbVarV != null) {
                        ojbVarV.d = new p8(j09Var2, str2, i2, 5);
                    }
                }

                public static final gh6 w0(l46 l46Var) {
                    View view = (View) l46Var.k(uq.f);
                    boolean zG = l46Var.g(view);
                    Object objR = l46Var.R();
                    if (zG || objR == sf2.a) {
                        objR = new gh6(view);
                        l46Var.p0(objR);
                    }
                    return (gh6) objR;
                }

                public static final void x(int i2, l46 l46Var, j09 j09Var, String str) {
                    l46 l46Var2;
                    j09 j09Var2;
                    l46Var.h0(2005275749);
                    int i3 = (l46Var.g(str) ? 32 : 16) | i2;
                    int i4 = 4;
                    if (l46Var.W(i3 & 1, (i3 & 19) != 18)) {
                        l46Var2 = l46Var;
                        j09Var2 = j09Var;
                        bzd.d(j09Var2, a7c.b(24.0f), z5c.p(((e8b) l46Var.k(l8b.a)).a, 0L, l46Var2, 24576, 14), null, null, af1.b0(875850291, new ob0(str, i4), l46Var2), l46Var2, 196614, 24);
                    } else {
                        l46Var2 = l46Var;
                        j09Var2 = j09Var;
                        l46Var2.Z();
                    }
                    ojb ojbVarV = l46Var2.v();
                    if (ojbVarV != null) {
                        ojbVarV.d = new p8(j09Var2, str, i2, i4);
                    }
                }

                public static final View x0(rv3 rv3Var) {
                    if (!((i09) rv3Var).a.Y) {
                        i37.c("Cannot get View because the Modifier node is not currently attached.");
                    }
                    return (View) wv7.a(vd0.s0(rv3Var));
                }

                public static final void y(String str, x16 x16Var, x16 x16Var2, x16 x16Var3, x16 x16Var4, l46 l46Var, int i2) {
                    String str2 = str;
                    str2.getClass();
                    x16Var.getClass();
                    x16Var2.getClass();
                    x16Var3.getClass();
                    x16Var4.getClass();
                    l46Var.h0(1245022137);
                    int i3 = i2 | (l46Var.g(str2) ? 4 : 2) | (l46Var.i(x16Var) ? 32 : 16) | (l46Var.i(x16Var2) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var.i(x16Var3) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE) | (l46Var.i(x16Var4) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE);
                    if (l46Var.W(i3 & 1, (i3 & 9363) != 9362)) {
                        pwf pwfVarA = qd8.a(l46Var);
                        if (pwfVarA == null) {
                            qc0.p("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                            return;
                        }
                        se8 se8Var = (se8) z5c.G(job.a.b(se8.class), pwfVarA.g(), null, b21.r(pwfVarA), kr7.b(l46Var), null);
                        Context context = (Context) l46Var.k(uq.b);
                        e89 e89VarT = tm7.t(se8Var.U0, l46Var);
                        Object[] objArr = new Object[0];
                        Object objR = l46Var.R();
                        Object obj = sf2.a;
                        if (objR == obj) {
                            objR = new ov7(26);
                            l46Var.p0(objR);
                        }
                        e89 e89Var = (e89) vfh.I(objArr, (x16) objR, l46Var, 48);
                        nsb nsbVar = (nsb) e89VarT.getValue();
                        boolean zQ = se8Var.q();
                        boolean zG = l46Var.g(e89Var) | ((i3 & 7168) == 2048);
                        Object objR2 = l46Var.R();
                        if (zG || objR2 == obj) {
                            objR2 = new k8(x16Var3, e89Var, 6);
                            l46Var.p0(objR2);
                        }
                        x16 x16Var5 = (x16) objR2;
                        boolean zI = l46Var.i(se8Var);
                        Object objR3 = l46Var.R();
                        if (zI || objR3 == obj) {
                            objR3 = new za6(23, se8Var);
                            l46Var.p0(objR3);
                        }
                        z(null, nsbVar, x16Var4, zQ, x16Var2, x16Var5, (a26) objR3, l46Var, ((i3 >> 6) & 896) | (nsb.f << 3) | ((i3 << 6) & 57344));
                        int i4 = i3 & 112;
                        boolean zI2 = l46Var.i(se8Var) | l46Var.g(e89Var) | (i4 == 32);
                        Object objR4 = l46Var.R();
                        if (zI2 || objR4 == obj) {
                            objR4 = new le8(se8Var, x16Var, e89Var, null);
                            l46Var.p0(objR4);
                        }
                        af1.o((l26) objR4, l46Var, wef.a);
                        Boolean boolValueOf = Boolean.valueOf(((nsb) e89VarT.getValue()).e);
                        boolean zI3 = l46Var.i(context) | l46Var.i(se8Var) | ((i3 & 14) == 4) | (i4 == 32);
                        Object objR5 = l46Var.R();
                        if (zI3 || objR5 == obj) {
                            Object me8Var = new me8(context, se8Var, str2, x16Var, null);
                            str2 = str2;
                            l46Var.p0(me8Var);
                            objR5 = me8Var;
                        }
                        af1.p(str2, boolValueOf, (l26) objR5, l46Var);
                    } else {
                        l46Var.Z();
                    }
                    ojb ojbVarV = l46Var.v();
                    if (ojbVarV != null) {
                        ojbVarV.d = new cm((Object) str2, (Object) x16Var, (Object) x16Var2, (m26) x16Var3, (Object) x16Var4, i2, 16);
                    }
                }

                public static boolean y0(Throwable th) {
                    boolean z;
                    th.getClass();
                    HashSet hashSet = new HashSet();
                    Throwable cause = th;
                    while (true) {
                        z = false;
                        if (cause == null || !hashSet.add(cause)) {
                            break;
                        }
                        if (!(cause instanceof u9e)) {
                            cause = cause.getCause();
                        }
                        return false;
                    }
                    HashSet hashSet2 = new HashSet();
                    for (Throwable cause2 = th; cause2 != null && hashSet2.add(cause2); cause2 = cause2.getCause()) {
                        if (cause2 instanceof vs6) {
                            return true;
                        }
                    }
                    if (!m0(th)) {
                        if (!ynb.S(th)) {
                            cz1 cz1Var = new cz1(21);
                            HashSet hashSet3 = new HashSet();
                            while (th != null && hashSet3.add(th)) {
                                if (((Boolean) cz1Var.d(th)).booleanValue()) {
                                    z = true;
                                    break;
                                }
                                th = th.getCause();
                            }
                            return !z;
                        }
                        return true;
                    }
                    return false;
                }

                public static final void z(j09 j09Var, nsb nsbVar, x16 x16Var, boolean z, x16 x16Var2, x16 x16Var3, a26 a26Var, l46 l46Var, int i2) {
                    j09 j09Var2;
                    nsbVar.getClass();
                    x16Var.getClass();
                    x16Var2.getClass();
                    x16Var3.getClass();
                    a26Var.getClass();
                    l46Var.h0(1702118788);
                    int i3 = i2 | 6;
                    if ((i2 & 48) == 0) {
                        i3 |= (i2 & 64) == 0 ? l46Var.g(nsbVar) : l46Var.i(nsbVar) ? 32 : 16;
                    }
                    if ((i2 & 384) == 0) {
                        i3 |= l46Var.i(x16Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                    }
                    if ((i2 & 3072) == 0) {
                        i3 |= l46Var.h(z) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
                    }
                    if ((i2 & 24576) == 0) {
                        i3 |= l46Var.i(x16Var2) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE;
                    }
                    if ((196608 & i2) == 0) {
                        i3 |= l46Var.i(x16Var3) ? 131072 : 65536;
                    }
                    if ((i2 & 1572864) == 0) {
                        i3 |= l46Var.i(a26Var) ? 1048576 : 524288;
                    }
                    int i4 = i3;
                    if (l46Var.W(i4 & 1, (599187 & i4) != 599186)) {
                        g09 g09Var = g09.a;
                        bzd.l(g09Var, z, 0L, null, null, af1.b0(-1287899840, new qi3(nsbVar, nsbVar.a, x16Var3, a26Var, x16Var2, x16Var, 3), l46Var), l46Var, (i4 & 14) | 1572864 | ((i4 >> 6) & 112), 60);
                        j09Var2 = g09Var;
                    } else {
                        l46Var.Z();
                        j09Var2 = j09Var;
                    }
                    ojb ojbVarV = l46Var.v();
                    if (ojbVarV != null) {
                        ojbVarV.d = new fc(j09Var2, nsbVar, x16Var, z, x16Var2, x16Var3, a26Var, i2);
                    }
                }

                public static boolean z0() {
                    String str = Build.MANUFACTURER;
                    str.getClass();
                    if (!str.equalsIgnoreCase("Google")) {
                        String str2 = Build.BRAND;
                        str2.getClass();
                        if (!str2.equalsIgnoreCase("Google")) {
                            return false;
                        }
                    }
                    String str3 = Build.MODEL;
                    str3.getClass();
                    String upperCase = str3.toUpperCase(Locale.ROOT);
                    upperCase.getClass();
                    return ExtraSupportedSurfaceCombinationsQuirk.c.contains(upperCase);
                }

                public abstract xt7 v0(xt7 xt7Var);
            }
