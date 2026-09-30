package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.Range;
import android.util.Size;
import android.util.SparseArray;
import androidx.work.impl.WorkDatabase;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.session.SessionManager;
import io.sentry.android.core.b1;
import java.io.File;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class hc2 implements xb2, f8e, is7, g1b, f1b, h1b, cfg {
    public static final fc2 w = new fc2(0);
    public static final byte[] x = {0, 7, 8, 15};
    public static final byte[] y = {0, 119, -120, -1};
    public static final byte[] z = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object v;

    public hc2(List list, List list2) {
        Object next;
        String strConcat;
        String str;
        String str2;
        boolean zH;
        this.a = 6;
        list2.getClass();
        Object obj = hq0.h;
        obj.getClass();
        this.b = list2;
        this.c = obj;
        this.d = xu4.a;
        this.e = pu4.a;
        List listJ1 = s72.j1(s72.n1(list));
        this.f = listJ1;
        this.g = new p74(2);
        ScheduledExecutorService scheduledExecutorServiceW = ok8.w();
        scheduledExecutorServiceW.getClass();
        this.v = scheduledExecutorServiceW;
        if (!obj.equals(obj)) {
            Iterator it = listJ1.iterator();
            while (it.hasNext()) {
                if (((oif) it.next()).g.h(xjf.k0)) {
                    qc0.j("Can't set target frame rate on a UseCase (by Preview.Builder.setTargetFrameRate() or VideoCapture.Builder.setTargetFrameRate()) if the frame rate range has already been set in the SessionConfig.");
                    throw null;
                }
            }
        }
        List list3 = (List) this.e;
        Set set = (Set) this.d;
        if (set.isEmpty() && list3.isEmpty()) {
            return;
        }
        Set set2 = set;
        ArrayList arrayList = new ArrayList(t72.u(set2, 10));
        Iterator it2 = set2.iterator();
        while (it2.hasNext()) {
            arrayList.add(((gf6) it2.next()).a());
        }
        for (mb5 mb5Var : s72.j1(s72.n1(arrayList))) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : set2) {
                if (((gf6) obj2).a() == mb5Var) {
                    arrayList2.add(obj2);
                }
            }
            if (arrayList2.size() > 1) {
                ho7.y(arrayList2, "requiredFeatures has conflicting feature values: ");
                throw null;
            }
        }
        if (s72.q0(list3).size() != list3.size()) {
            yg5.i(41, list3, "Duplicate values in preferredFeatures(");
            throw null;
        }
        LinkedHashSet linkedHashSetA0 = s72.A0(set2, list3);
        if (!linkedHashSetA0.isEmpty()) {
            ho7.y(linkedHashSetA0, "requiredFeatures and preferredFeatures have duplicate values: ");
            throw null;
        }
        for (oif oifVar : (List) this.f) {
            g3e g3eVar = mkf.a;
            g3eVar.getClass();
            if (g3e.j(oifVar) == mkf.UNDEFINED) {
                ho7.k(oifVar, " is not supported with feature group");
                throw null;
            }
            String str3 = oifVar instanceof wta ? "Preview" : oifVar instanceof hv6 ? "ImageCapture" : tgc.l(oifVar) ? "VideoCapture" : "UseCase";
            Iterator it3 = mb5.f.iterator();
            do {
                if (!it3.hasNext()) {
                    next = null;
                    break;
                }
                next = it3.next();
                g3eVar.getClass();
                int iOrdinal = ((mb5) next).ordinal();
                if (iOrdinal == 0) {
                    zH = oifVar.g.h(wv6.E);
                } else if (iOrdinal == 1) {
                    zH = oifVar.g.h(xjf.k0);
                } else if (iOrdinal == 2) {
                    zH = oifVar.g.h(xjf.q0) || oifVar.g.h(xjf.r0);
                } else if (iOrdinal == 3) {
                    zH = oifVar.g.h(iv6.f);
                } else {
                    if (iOrdinal != 4) {
                        ap.c();
                        throw null;
                    }
                    zH = pa7.t(oifVar.g.a(xjf.s0, Boolean.TRUE), Boolean.FALSE);
                }
            } while (!zH);
            mb5 mb5Var2 = (mb5) next;
            if (mb5Var2 != null) {
                StringBuilder sb = new StringBuilder("A ");
                sb.append(mb5Var2.name());
                sb.append(" value is set to ");
                sb.append(str3);
                sb.append(" despite using feature groups. Do not use APIs like ");
                int iOrdinal2 = mb5Var2.ordinal();
                if (iOrdinal2 == 0) {
                    strConcat = str3.concat(".Builder.setDynamicRange");
                } else if (iOrdinal2 == 1) {
                    strConcat = str3.concat(".Builder.setTargetFrameRateRange");
                } else if (iOrdinal2 == 2) {
                    strConcat = tgc.l(oifVar) ? str3.concat(".Builder.setVideoStabilizationEnabled") : str3.concat(".Builder.setPreviewStabilizationEnabled");
                } else if (iOrdinal2 == 3) {
                    strConcat = str3.concat(".Builder.setOutputFormat");
                } else {
                    if (iOrdinal2 != 4) {
                        ap.c();
                        throw null;
                    }
                    strConcat = "Recorder.Builder.setQualitySelector";
                }
                sb.append(strConcat);
                sb.append(" while using feature groups. If, for example, ");
                int iOrdinal3 = mb5Var2.ordinal();
                if (iOrdinal3 == 0) {
                    str = "HDR";
                } else if (iOrdinal3 == 1) {
                    str = "60 FPS";
                } else if (iOrdinal3 == 2) {
                    str = "stabilization";
                } else if (iOrdinal3 == 3) {
                    str = "JPEG_R output format";
                } else {
                    if (iOrdinal3 != 4) {
                        ap.c();
                        throw null;
                    }
                    str = "UHD recording quality";
                }
                sb.append(str);
                sb.append(" is required, instead set ");
                int iOrdinal4 = mb5Var2.ordinal();
                if (iOrdinal4 == 0) {
                    str2 = "GroupableFeature.HDR_HLG10";
                } else if (iOrdinal4 == 1) {
                    str2 = "GroupableFeature.FPS_60";
                } else if (iOrdinal4 == 2) {
                    str2 = "GroupableFeature.PREVIEW_STABILIZATION";
                } else if (iOrdinal4 == 3) {
                    str2 = "GroupableFeature.IMAGE_ULTRA_HDR";
                } else {
                    if (iOrdinal4 != 4) {
                        ap.c();
                        throw null;
                    }
                    str2 = "GroupableFeatures.UHD_RECORDING";
                }
                qc0.o(ks0.l(sb, str2, " as either a required or preferred feature."));
                throw null;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:115:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:119:0x0203 A[LOOP:3: B:87:0x0156->B:119:0x0203, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:133:0x01ff A[SYNTHETIC] */
    public static void B(byte[] bArr, int[] iArr, int i, int i2, int i3, Paint paint, Canvas canvas) {
        byte[] bArr2;
        char c;
        char c2;
        int iG;
        int iG2;
        boolean z2;
        int iG3;
        int iG4;
        int iG5;
        int i4;
        int i5;
        boolean z3;
        int iG6;
        zu1 zu1Var = new zu1(bArr, bArr.length);
        int i6 = i2;
        int i7 = i3;
        byte[] bArrF = null;
        byte[] bArrF2 = null;
        byte[] bArrF3 = null;
        while (zu1Var.b() != 0) {
            int i8 = 8;
            int iG7 = zu1Var.g(8);
            if (iG7 != 240) {
                int i9 = 3;
                int i10 = 2;
                int i11 = 4;
                switch (iG7) {
                    case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                        if (i == 3) {
                            bArr2 = bArrF == null ? y : bArrF;
                        } else if (i == 2) {
                            bArr2 = bArrF3 == null ? x : bArrF3;
                        } else {
                            bArr2 = null;
                        }
                        boolean z4 = false;
                        while (true) {
                            int iG8 = zu1Var.g(2);
                            if (iG8 != 0) {
                                iG = iG8;
                                iG2 = 1;
                            } else {
                                if (zu1Var.f()) {
                                    int iG9 = zu1Var.g(3) + 3;
                                    iG = zu1Var.g(2);
                                    iG2 = iG9;
                                } else {
                                    if (zu1Var.f()) {
                                        iG2 = 1;
                                        c = '\b';
                                        c2 = 4;
                                    } else {
                                        int iG10 = zu1Var.g(2);
                                        if (iG10 == 0) {
                                            c = '\b';
                                            c2 = 4;
                                            z4 = true;
                                        } else if (iG10 == 1) {
                                            c = '\b';
                                            c2 = 4;
                                            iG2 = 2;
                                        } else if (iG10 == 2) {
                                            c = '\b';
                                            c2 = 4;
                                            iG2 = zu1Var.g(4) + 12;
                                            iG = zu1Var.g(2);
                                            z4 = z4;
                                        } else if (iG10 != 3) {
                                            z4 = z4;
                                            c = '\b';
                                            c2 = 4;
                                        } else {
                                            c = '\b';
                                            int iG11 = zu1Var.g(8) + 29;
                                            iG = zu1Var.g(2);
                                            z4 = z4;
                                            iG2 = iG11;
                                            c2 = 4;
                                        }
                                        iG = 0;
                                        iG2 = 0;
                                    }
                                    iG = 0;
                                }
                                if (iG2 == 0 && paint != null) {
                                    if (bArr2 != 0) {
                                        iG = bArr2[iG];
                                    }
                                    paint.setColor(iArr[iG]);
                                    canvas.drawRect(i6, i7, i6 + iG2, i7 + 1, paint);
                                }
                                i6 += iG2;
                                if (z4) {
                                    zu1Var.c();
                                } else {
                                    paint = paint;
                                    z4 = z4;
                                }
                            }
                            c = '\b';
                            c2 = 4;
                            if (iG2 == 0) {
                            }
                            i6 += iG2;
                            if (z4) {
                                zu1Var.c();
                            } else {
                                paint = paint;
                                z4 = z4;
                            }
                            break;
                        }
                        break;
                    case 17:
                        byte[] bArr3 = i == 3 ? bArrF2 == null ? z : bArrF2 : null;
                        boolean z5 = false;
                        while (true) {
                            int iG12 = zu1Var.g(i11);
                            if (iG12 != 0) {
                                z2 = z5;
                                iG5 = iG12;
                                iG3 = 1;
                            } else if (zu1Var.f()) {
                                if (zu1Var.f()) {
                                    int iG13 = zu1Var.g(i10);
                                    if (iG13 == 0) {
                                        z2 = z5;
                                        iG3 = 1;
                                    } else if (iG13 != 1) {
                                        if (iG13 == i10) {
                                            iG3 = zu1Var.g(i11) + 9;
                                            iG4 = zu1Var.g(i11);
                                        } else if (iG13 != i9) {
                                            z2 = z5;
                                            iG3 = 0;
                                        } else {
                                            iG3 = zu1Var.g(i8) + 25;
                                            iG4 = zu1Var.g(i11);
                                        }
                                        iG5 = iG4;
                                    } else {
                                        z2 = z5;
                                        iG3 = i10;
                                    }
                                    iG5 = 0;
                                } else {
                                    iG3 = zu1Var.g(i10) + 4;
                                    iG5 = zu1Var.g(i11);
                                }
                                z2 = z5;
                            } else {
                                int iG14 = zu1Var.g(i9);
                                if (iG14 != 0) {
                                    iG3 = iG14 + 2;
                                    z2 = z5;
                                } else {
                                    z2 = true;
                                    iG3 = 0;
                                }
                                iG5 = 0;
                            }
                            if (iG3 == 0 || paint == 0) {
                                i4 = i9;
                                i5 = i10;
                            } else {
                                if (bArr3 != 0) {
                                    iG5 = bArr3[iG5];
                                }
                                paint.setColor(iArr[iG5]);
                                i4 = i9;
                                i5 = 2;
                                canvas.drawRect(i6, i7, i6 + iG3, i7 + 1, paint);
                            }
                            i6 += iG3;
                            if (z2) {
                                zu1Var.c();
                            } else {
                                z5 = z2;
                                i9 = i4;
                                i10 = i5;
                                i11 = 4;
                                i8 = 8;
                            }
                            break;
                        }
                        break;
                    case 18:
                        boolean z6 = false;
                        while (true) {
                            int iG15 = zu1Var.g(8);
                            if (iG15 != 0) {
                                z3 = z6;
                                iG6 = 1;
                            } else if (zu1Var.f()) {
                                z3 = z6;
                                iG6 = zu1Var.g(7);
                                iG15 = zu1Var.g(8);
                            } else {
                                int iG16 = zu1Var.g(7);
                                if (iG16 != 0) {
                                    z3 = z6;
                                    iG6 = iG16;
                                    iG15 = 0;
                                } else {
                                    z3 = true;
                                    iG15 = 0;
                                    iG6 = 0;
                                }
                            }
                            if (iG6 != 0 && paint != 0) {
                                paint.setColor(iArr[iG15]);
                                canvas.drawRect(i6, i7, i6 + iG6, i7 + 1, paint);
                            }
                            i6 += iG6;
                            if (!z3) {
                                z6 = z3;
                            }
                            break;
                        }
                        break;
                    default:
                        switch (iG7) {
                            case CommonUtils.DEVICE_STATE_COMPROMISEDLIBRARIES /* 32 */:
                                bArrF3 = f(4, 4, zu1Var);
                                break;
                            case 33:
                                bArrF = f(4, 8, zu1Var);
                                break;
                            case 34:
                                bArrF2 = f(16, 8, zu1Var);
                                break;
                        }
                        break;
                }
            } else {
                i7 += 2;
                i6 = i2;
            }
        }
    }

    public static hr4 C(zu1 zu1Var, int i) {
        int[] iArr;
        int iG;
        int i2;
        int iG2;
        int iG3;
        int iG4;
        int i3 = 8;
        int iG5 = zu1Var.g(8);
        zu1Var.o(8);
        int i4 = 2;
        int i5 = i - 2;
        int i6 = 0;
        int[] iArr2 = {0, -1, -16777216, -8421505};
        int[] iArrK = k();
        int[] iArrL = l();
        while (i5 > 0) {
            int iG6 = zu1Var.g(i3);
            int iG7 = zu1Var.g(i3);
            if ((iG7 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
                iArr = iArr2;
            } else {
                iArr = (iG7 & 64) != 0 ? iArrK : iArrL;
            }
            if ((iG7 & 1) != 0) {
                iG3 = zu1Var.g(i3);
                iG4 = zu1Var.g(i3);
                iG = zu1Var.g(i3);
                iG2 = zu1Var.g(i3);
                i2 = i5 - 6;
            } else {
                int iG8 = zu1Var.g(6) << i4;
                int iG9 = zu1Var.g(4) << 4;
                iG = zu1Var.g(4) << 4;
                i2 = i5 - 4;
                iG2 = zu1Var.g(i4) << 6;
                iG3 = iG8;
                iG4 = iG9;
            }
            if (iG3 == 0) {
                iG4 = i6;
                iG = iG4;
                iG2 = 255;
            }
            double d = iG3;
            double d2 = iG4 - 128;
            double d3 = iG - 128;
            iArr[iG6] = v((byte) (255 - (iG2 & 255)), pqf.h((int) ((1.402d * d2) + d), 0, 255), pqf.h((int) ((d - (0.34414d * d3)) - (d2 * 0.71414d)), 0, 255), pqf.h((int) ((d3 * 1.772d) + d), 0, 255));
            i5 = i2;
            i6 = 0;
            iG5 = iG5;
            iArrL = iArrL;
            i3 = 8;
            i4 = 2;
        }
        return new hr4(iG5, iArr2, iArrK, iArrL);
    }

    public static jr4 D(zu1 zu1Var) {
        byte[] bArr;
        int iG = zu1Var.g(16);
        zu1Var.o(4);
        int iG2 = zu1Var.g(2);
        boolean zF = zu1Var.f();
        zu1Var.o(1);
        byte[] bArr2 = pqf.b;
        if (iG2 != 1) {
            if (iG2 == 0) {
                int iG3 = zu1Var.g(16);
                int iG4 = zu1Var.g(16);
                if (iG3 > 0) {
                    bArr2 = new byte[iG3];
                    zu1Var.j(bArr2, iG3);
                }
                if (iG4 > 0) {
                    bArr = new byte[iG4];
                    zu1Var.j(bArr, iG4);
                }
            }
            return new jr4(iG, zF, bArr2, bArr);
        }
        zu1Var.o(zu1Var.g(8) * 16);
        bArr = bArr2;
        return new jr4(iG, zF, bArr2, bArr);
    }

    public static byte[] f(int i, int i2, zu1 zu1Var) {
        byte[] bArr = new byte[i];
        for (int i3 = 0; i3 < i; i3++) {
            bArr[i3] = (byte) zu1Var.g(i2);
        }
        return bArr;
    }

    public static int[] k() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i = 1; i < 16; i++) {
            if (i < 8) {
                iArr[i] = v(255, (i & 1) != 0 ? 255 : 0, (i & 2) != 0 ? 255 : 0, (i & 4) != 0 ? 255 : 0);
            } else {
                iArr[i] = v(255, (i & 1) != 0 ? 127 : 0, (i & 2) != 0 ? 127 : 0, (i & 4) == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    public static int[] l() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i = 0; i < 256; i++) {
            if (i < 8) {
                iArr[i] = v(63, (i & 1) != 0 ? 255 : 0, (i & 2) != 0 ? 255 : 0, (i & 4) == 0 ? 0 : 255);
            } else {
                int i2 = i & 136;
                if (i2 == 0) {
                    iArr[i] = v(255, ((i & 1) != 0 ? 85 : 0) + ((i & 16) != 0 ? 170 : 0), ((i & 2) != 0 ? 85 : 0) + ((i & 32) != 0 ? 170 : 0), ((i & 4) == 0 ? 0 : 85) + ((i & 64) == 0 ? 0 : 170));
                } else if (i2 == 8) {
                    iArr[i] = v(127, ((i & 1) != 0 ? 85 : 0) + ((i & 16) != 0 ? 170 : 0), ((i & 2) != 0 ? 85 : 0) + ((i & 32) != 0 ? 170 : 0), ((i & 4) == 0 ? 0 : 85) + ((i & 64) == 0 ? 0 : 170));
                } else if (i2 == 128) {
                    iArr[i] = v(255, ((i & 1) != 0 ? 43 : 0) + 127 + ((i & 16) != 0 ? 85 : 0), ((i & 2) != 0 ? 43 : 0) + 127 + ((i & 32) != 0 ? 85 : 0), ((i & 4) == 0 ? 0 : 43) + 127 + ((i & 64) == 0 ? 0 : 85));
                } else if (i2 == 136) {
                    iArr[i] = v(255, ((i & 1) != 0 ? 43 : 0) + ((i & 16) != 0 ? 85 : 0), ((i & 2) != 0 ? 43 : 0) + ((i & 32) != 0 ? 85 : 0), ((i & 4) == 0 ? 0 : 43) + ((i & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    public static int v(int i, int i2, int i3, int i4) {
        return (i << 24) | (i2 << 16) | (i3 << 8) | i4;
    }

    public long A(l46 l46Var) {
        return ((y72) ((l26) this.e).z(l46Var, 0)).a;
    }

    public void E() {
        HashMap map = (HashMap) this.c;
        HashMap map2 = (HashMap) this.d;
        for (lb2 lb2Var : ((HashMap) this.b).keySet()) {
            for (xw3 xw3Var : lb2Var.c) {
                boolean z2 = xw3Var.b == 2;
                y3b y3bVar = xw3Var.a;
                if (z2 && !map2.containsKey(y3bVar)) {
                    Set set = Collections.EMPTY_SET;
                    r18 r18Var = new r18();
                    r18Var.b = null;
                    r18Var.a = Collections.newSetFromMap(new ConcurrentHashMap());
                    r18Var.a.addAll(set);
                    map2.put(y3bVar, r18Var);
                } else if (map.containsKey(y3bVar)) {
                    continue;
                } else {
                    int i = xw3Var.b;
                    if (i == 1) {
                        throw new cw8("Unsatisfied dependency for component " + lb2Var + ": " + y3bVar);
                    }
                    if (i != 2) {
                        map.put(y3bVar, new yr9(yr9.c, yr9.d));
                    }
                }
            }
        }
    }

    public ArrayList F(ArrayList arrayList) {
        HashMap map = (HashMap) this.c;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            lb2 lb2Var = (lb2) it.next();
            if (lb2Var.e == 0) {
                i1b i1bVar = (i1b) ((HashMap) this.b).get(lb2Var);
                for (y3b y3bVar : lb2Var.b) {
                    if (map.containsKey(y3bVar)) {
                        arrayList2.add(new fe(24, (yr9) ((i1b) map.get(y3bVar)), i1bVar));
                    } else {
                        map.put(y3bVar, i1bVar);
                    }
                }
            }
        }
        return arrayList2;
    }

    public ArrayList G() {
        HashMap map = (HashMap) this.d;
        ArrayList arrayList = new ArrayList();
        HashMap map2 = new HashMap();
        for (Map.Entry entry : ((HashMap) this.b).entrySet()) {
            lb2 lb2Var = (lb2) entry.getKey();
            if (lb2Var.e != 0) {
                i1b i1bVar = (i1b) entry.getValue();
                for (y3b y3bVar : lb2Var.b) {
                    if (!map2.containsKey(y3bVar)) {
                        map2.put(y3bVar, new HashSet());
                    }
                    ((Set) map2.get(y3bVar)).add(i1bVar);
                }
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            if (map.containsKey(entry2.getKey())) {
                r18 r18Var = (r18) map.get(entry2.getKey());
                Iterator it = ((Set) entry2.getValue()).iterator();
                while (it.hasNext()) {
                    arrayList.add(new fe(25, r18Var, (i1b) it.next()));
                }
            } else {
                y3b y3bVar2 = (y3b) entry2.getKey();
                Set set = (Set) ((Collection) entry2.getValue());
                r18 r18Var2 = new r18();
                r18Var2.b = null;
                r18Var2.a = Collections.newSetFromMap(new ConcurrentHashMap());
                r18Var2.a.addAll(set);
                map.put(y3bVar2, r18Var2);
            }
        }
        return arrayList;
    }

    @Override // defpackage.cfg
    public Object a() {
        String str = (String) ((bfg) this.b).a();
        Object objA = ((bfg) this.c).a();
        Object objA2 = ((bfg) this.d).a();
        Context context = (Context) ((ysd) ((oid) this.e).b).b;
        Object objA3 = ((bfg) this.f).a();
        bfg bfgVar = new bfg(new fnb((bfg) this.g));
        hfg hfgVar = (hfg) objA;
        wgg wggVar = (wgg) objA3;
        return new ogg(str != null ? new File(context.getExternalFilesDir(null), str) : context.getExternalFilesDir(null), hfgVar, context, wggVar, bfgVar);
    }

    public hq0 c() {
        String strConcat = ((Size) this.b) == null ? " resolution" : "";
        if (((Size) this.c) == null) {
            strConcat = strConcat.concat(" originalConfiguredResolution");
        }
        if (((qr4) this.d) == null) {
            strConcat = strConcat.concat(" dynamicRange");
        }
        if (((Integer) this.e) == null) {
            strConcat = strConcat.concat(" sessionType");
        }
        if (((Range) this.f) == null) {
            strConcat = strConcat.concat(" expectedFrameRateRange");
        }
        if (((Boolean) this.v) == null) {
            strConcat = strConcat.concat(" zslDisabled");
        }
        if (strConcat.isEmpty()) {
            return new hq0((Size) this.b, (Size) this.c, (qr4) this.d, ((Integer) this.e).intValue(), (Range) this.f, (qh2) this.g, ((Boolean) this.v).booleanValue());
        }
        qc0.p("Missing required properties:".concat(strConcat));
        return null;
    }

    @Override // defpackage.is7
    public void d() {
        hbc hbcVar = (hbc) this.d;
        j22 j22Var = (j22) this.f;
        HashMap map = (HashMap) this.b;
        boolean zD0 = false;
        if (j22Var.equals(rud.b)) {
            Object obj = map.get(t99.e("value"));
            rm7 rm7Var = obj instanceof rm7 ? (rm7) obj : null;
            if (rm7Var != null) {
                Object obj2 = rm7Var.a;
                pm7 pm7Var = obj2 instanceof pm7 ? (pm7) obj2 : null;
                if (pm7Var != null) {
                    zD0 = hbcVar.d0(pm7Var.a.a);
                }
            }
        }
        if (zD0 || hbcVar.d0(j22Var)) {
            return;
        }
        ((List) this.g).add(new v00(((u09) this.e).S(), map, (ntd) this.v));
    }

    @Override // defpackage.h1b
    public Object get() {
        switch (this.a) {
            case 5:
                return new cg5((ff5) ((mjg) this.b).get(), (i1b) ((m6c) this.c).get(), (of5) ((ssg) this.d).get(), (i1b) ((kb6) this.e).get(), (RemoteConfigManager) ((jy4) this.f).get(), (ji2) ((yx4) this.g).get(), (SessionManager) ((y25) this.v).get());
            case 6:
            default:
                return new lp0((Context) ((h1b) this.b).get(), (uu8) ((h1b) this.c).get(), (w8c) ((h1b) this.d).get(), (gg7) ((gg7) this.e).get(), (Executor) ((h1b) this.f).get(), (w8c) ((h1b) this.g).get(), new w1e(10), new g3e(7), (w8c) ((h1b) this.v).get(), 2);
            case 7:
                return new ldd((m1d) ((f1b) this.b).get(), (t0d) ((f1b) this.c).get(), (s0d) ((f1b) this.d).get(), (yxe) ((f1b) this.e).get(), (fc3) ((f1b) this.f).get(), (iva) ((f1b) this.g).get(), (pv2) ((f1b) this.v).get());
        }
    }

    @Override // defpackage.is7
    public void h(t99 t99Var, Object obj) {
        bl2 bl2VarR = af8.r((x09) ((hbc) this.c).c, obj);
        if (bl2VarR == null) {
            bl2VarR = new ty4("Unsupported annotation argument: " + t99Var);
        }
        ((HashMap) this.b).put(t99Var, bl2VarR);
    }

    @Override // defpackage.xb2
    public synchronized i1b i(y3b y3bVar) {
        r18 r18Var = (r18) ((HashMap) this.d).get(y3bVar);
        if (r18Var != null) {
            return r18Var;
        }
        return w;
    }

    public void j(HashMap map, boolean z2) {
        ArrayDeque arrayDeque;
        for (Map.Entry entry : map.entrySet()) {
            lb2 lb2Var = (lb2) entry.getKey();
            i1b i1bVar = (i1b) entry.getValue();
            int i = lb2Var.d;
            if (i == 1 || (i == 2 && z2)) {
                i1bVar.get();
            }
        }
        hz4 hz4Var = (hz4) this.f;
        synchronized (hz4Var) {
            try {
                arrayDeque = hz4Var.b;
                if (arrayDeque != null) {
                    hz4Var.b = null;
                } else {
                    arrayDeque = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (arrayDeque != null) {
            Iterator it = arrayDeque.iterator();
            if (it.hasNext()) {
                throw kv2.g(it);
            }
        }
    }

    @Override // defpackage.is7
    public void m(t99 t99Var, m22 m22Var) {
        ((HashMap) this.b).put(t99Var, new rm7(new pm7(m22Var)));
    }

    @Override // defpackage.is7
    public js7 n(t99 t99Var) {
        return new szc((hbc) this.c, t99Var, this);
    }

    @Override // defpackage.xb2
    public ou3 o(y3b y3bVar) {
        i1b i1bVarQ = q(y3bVar);
        if (i1bVarQ == null) {
            return new yr9(yr9.c, yr9.d);
        }
        return i1bVarQ instanceof yr9 ? (yr9) i1bVarQ : new yr9(null, i1bVarQ);
    }

    @Override // defpackage.is7
    public void p(t99 t99Var, j22 j22Var, t99 t99Var2) {
        ((HashMap) this.b).put(t99Var, new rx4(j22Var, t99Var2));
    }

    @Override // defpackage.xb2
    public synchronized i1b q(y3b y3bVar) {
        tm7.q(y3bVar, "Null interface requested.");
        return (i1b) ((HashMap) this.c).get(y3bVar);
    }

    @Override // defpackage.f8e
    public void reset() {
        nr4 nr4Var = (nr4) this.g;
        nr4Var.c.clear();
        nr4Var.d.clear();
        nr4Var.e.clear();
        nr4Var.f.clear();
        nr4Var.g.clear();
        nr4Var.h = null;
        nr4Var.i = null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:12:0x0078  */
    @Override // defpackage.f8e
    public void s(byte[] bArr, int i, int i2, e8e e8eVar, xl2 xl2Var) {
        w03 w03Var;
        lr4 lr4Var;
        SparseArray sparseArray;
        int i3;
        Paint paint;
        int i4;
        lr4 lr4Var2;
        int i5;
        int iG;
        int i6;
        int i7;
        hc2 hc2Var = this;
        zu1 zu1Var = new zu1(bArr, i + i2);
        zu1Var.m(i);
        Paint paint2 = (Paint) hc2Var.c;
        Canvas canvas = (Canvas) hc2Var.d;
        nr4 nr4Var = (nr4) hc2Var.g;
        SparseArray sparseArray2 = nr4Var.f;
        SparseArray sparseArray3 = nr4Var.g;
        int i8 = nr4Var.b;
        SparseArray sparseArray4 = nr4Var.c;
        SparseArray sparseArray5 = nr4Var.d;
        SparseArray sparseArray6 = nr4Var.e;
        int i9 = nr4Var.a;
        while (zu1Var.b() >= 48 && zu1Var.g(8) == 15) {
            int iG2 = zu1Var.g(8);
            int iG3 = zu1Var.g(16);
            int iG4 = zu1Var.g(16);
            int iD = zu1Var.d() + iG4;
            if (iG4 * 8 > zu1Var.b()) {
                xo1.V("DvbParser", "Data field length exceeds limit");
                zu1Var.o(zu1Var.b());
                sparseArray = sparseArray3;
                i3 = i8;
                paint = paint2;
                i4 = i9;
            } else {
                switch (iG2) {
                    case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                        sparseArray = sparseArray3;
                        i3 = i8;
                        paint = paint2;
                        if (iG3 == i9) {
                            yl9 yl9Var = nr4Var.i;
                            int i10 = 8;
                            zu1Var.g(8);
                            int iG5 = zu1Var.g(4);
                            int iG6 = zu1Var.g(2);
                            zu1Var.o(2);
                            int i11 = iG4 - 2;
                            SparseArray sparseArray7 = new SparseArray();
                            while (i11 > 0) {
                                int iG7 = zu1Var.g(i10);
                                zu1Var.o(i10);
                                sparseArray7.put(iG7, new kr4(zu1Var.g(16), zu1Var.g(16)));
                                i9 = i9;
                                i11 -= 6;
                                i10 = 8;
                            }
                            i4 = i9;
                            yl9 yl9Var2 = new yl9(sparseArray7, iG5, iG6, 3);
                            if (iG6 != 0) {
                                nr4Var.i = yl9Var2;
                                sparseArray4.clear();
                                sparseArray5.clear();
                                sparseArray6.clear();
                            } else if (yl9Var != null && yl9Var.b != iG5) {
                                nr4Var.i = yl9Var2;
                            }
                        } else {
                            i4 = i9;
                        }
                        break;
                    case 17:
                        yl9 yl9Var3 = nr4Var.i;
                        if (iG3 != i9 || yl9Var3 == null) {
                            sparseArray = sparseArray3;
                            i3 = i8;
                            paint = paint2;
                        } else {
                            int iG8 = zu1Var.g(8);
                            zu1Var.o(4);
                            boolean zF = zu1Var.f();
                            zu1Var.o(3);
                            int iG9 = zu1Var.g(16);
                            int iG10 = zu1Var.g(16);
                            zu1Var.g(3);
                            int iG11 = zu1Var.g(3);
                            int i12 = 2;
                            zu1Var.o(2);
                            int iG12 = zu1Var.g(8);
                            int iG13 = zu1Var.g(8);
                            int iG14 = zu1Var.g(4);
                            int iG15 = zu1Var.g(2);
                            zu1Var.o(2);
                            int i13 = iG4 - 10;
                            SparseArray sparseArray8 = new SparseArray();
                            while (i13 > 0) {
                                int i14 = i8;
                                int i15 = i13;
                                int iG16 = zu1Var.g(16);
                                int iG17 = zu1Var.g(i12);
                                zu1Var.g(i12);
                                Paint paint3 = paint2;
                                int iG18 = zu1Var.g(12);
                                SparseArray sparseArray9 = sparseArray3;
                                zu1Var.o(4);
                                int iG19 = zu1Var.g(12);
                                int i16 = i15 - 6;
                                if (iG17 == 1 || iG17 == 2) {
                                    zu1Var.g(8);
                                    zu1Var.g(8);
                                    i16 = i15 - 8;
                                }
                                sparseArray8.put(iG16, new mr4(iG18, iG19));
                                i13 = i16;
                                i8 = i14;
                                paint2 = paint3;
                                sparseArray3 = sparseArray9;
                                i12 = 2;
                            }
                            sparseArray = sparseArray3;
                            i3 = i8;
                            paint = paint2;
                            lr4 lr4Var3 = new lr4(iG8, zF, iG9, iG10, iG11, iG12, iG13, iG14, iG15, sparseArray8);
                            if (yl9Var3.c == 0 && (lr4Var2 = (lr4) sparseArray4.get(iG8)) != null) {
                                SparseArray sparseArray10 = lr4Var2.j;
                                for (int i17 = 0; i17 < sparseArray10.size(); i17++) {
                                    lr4Var3.j.put(sparseArray10.keyAt(i17), (mr4) sparseArray10.valueAt(i17));
                                }
                            }
                            sparseArray4.put(lr4Var3.a, lr4Var3);
                        }
                        i4 = i9;
                        break;
                    case 18:
                        if (iG3 == i9) {
                            hr4 hr4VarC = C(zu1Var, iG4);
                            sparseArray5.put(hr4VarC.a, hr4VarC);
                        } else if (iG3 == i8) {
                            hr4 hr4VarC2 = C(zu1Var, iG4);
                            sparseArray2.put(hr4VarC2.a, hr4VarC2);
                        }
                        sparseArray = sparseArray3;
                        i3 = i8;
                        paint = paint2;
                        i4 = i9;
                        break;
                    case 19:
                        if (iG3 == i9) {
                            jr4 jr4VarD = D(zu1Var);
                            sparseArray6.put(jr4VarD.a, jr4VarD);
                        } else if (iG3 == i8) {
                            jr4 jr4VarD2 = D(zu1Var);
                            sparseArray3.put(jr4VarD2.a, jr4VarD2);
                        }
                        sparseArray = sparseArray3;
                        i3 = i8;
                        paint = paint2;
                        i4 = i9;
                        break;
                    case 20:
                        if (iG3 == i9) {
                            zu1Var.o(4);
                            boolean zF2 = zu1Var.f();
                            zu1Var.o(3);
                            int iG20 = zu1Var.g(16);
                            int iG21 = zu1Var.g(16);
                            if (zF2) {
                                int iG22 = zu1Var.g(16);
                                int iG23 = zu1Var.g(16);
                                int iG24 = zu1Var.g(16);
                                i5 = iG23;
                                iG = zu1Var.g(16);
                                i7 = iG24;
                                i6 = iG22;
                            } else {
                                i5 = iG20;
                                iG = iG21;
                                i6 = 0;
                                i7 = 0;
                            }
                            nr4Var.h = new ir4(iG20, iG21, i6, i5, i7, iG);
                        }
                        sparseArray = sparseArray3;
                        i3 = i8;
                        paint = paint2;
                        i4 = i9;
                        break;
                    default:
                        sparseArray = sparseArray3;
                        i3 = i8;
                        paint = paint2;
                        i4 = i9;
                        break;
                }
                zu1Var.p(iD - zu1Var.d());
            }
            i9 = i4;
            i8 = i3;
            paint2 = paint;
            sparseArray3 = sparseArray;
        }
        SparseArray sparseArray11 = sparseArray3;
        Paint paint4 = paint2;
        yl9 yl9Var4 = nr4Var.i;
        if (yl9Var4 == null) {
            ey6 ey6Var = jy6.b;
            w03Var = new w03(-9223372036854775807L, -9223372036854775807L, yob.e);
        } else {
            ir4 ir4Var = nr4Var.h;
            if (ir4Var == null) {
                ir4Var = (ir4) hc2Var.e;
            }
            int i18 = ir4Var.b;
            int i19 = ir4Var.a;
            Bitmap bitmap = (Bitmap) hc2Var.v;
            if (bitmap == null || i19 + 1 != bitmap.getWidth() || i18 + 1 != ((Bitmap) hc2Var.v).getHeight()) {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i19 + 1, i18 + 1, Bitmap.Config.ARGB_8888);
                hc2Var.v = bitmapCreateBitmap;
                canvas.setBitmap(bitmapCreateBitmap);
            }
            ArrayList arrayList = new ArrayList();
            SparseArray sparseArray12 = (SparseArray) yl9Var4.d;
            int i20 = 0;
            while (i20 < sparseArray12.size()) {
                canvas.save();
                kr4 kr4Var = (kr4) sparseArray12.valueAt(i20);
                lr4 lr4Var4 = (lr4) sparseArray4.get(sparseArray12.keyAt(i20));
                int i21 = kr4Var.a + ir4Var.c;
                int i22 = kr4Var.b + ir4Var.e;
                int i23 = lr4Var4.c;
                int i24 = lr4Var4.f;
                SparseArray sparseArray13 = sparseArray12;
                int i25 = lr4Var4.d;
                int i26 = i18;
                int i27 = i21 + i23;
                int i28 = i19;
                SparseArray sparseArray14 = sparseArray4;
                int i29 = i22 + i25;
                int i30 = i20;
                canvas.clipRect(i21, i22, Math.min(i27, ir4Var.d), Math.min(i29, ir4Var.f));
                hr4 hr4Var = (hr4) sparseArray5.get(i24);
                if (hr4Var == null && (hr4Var = (hr4) sparseArray2.get(i24)) == null) {
                    hr4Var = (hr4) hc2Var.f;
                }
                int[] iArr = hr4Var.b;
                int[] iArr2 = hr4Var.c;
                int[] iArr3 = hr4Var.d;
                ir4 ir4Var2 = ir4Var;
                SparseArray sparseArray15 = lr4Var4.j;
                SparseArray sparseArray16 = sparseArray2;
                int i31 = 0;
                while (i31 < sparseArray15.size()) {
                    int iKeyAt = sparseArray15.keyAt(i31);
                    SparseArray sparseArray17 = sparseArray15;
                    mr4 mr4Var = (mr4) sparseArray15.valueAt(i31);
                    jr4 jr4Var = (jr4) sparseArray6.get(iKeyAt);
                    int i32 = i31;
                    sparseArray11 = sparseArray11;
                    if (jr4Var == null) {
                        jr4Var = (jr4) sparseArray11.get(iKeyAt);
                    }
                    jr4 jr4Var2 = jr4Var;
                    if (jr4Var2 != null) {
                        Paint paint5 = jr4Var2.b ? null : (Paint) hc2Var.b;
                        lr4 lr4Var5 = lr4Var4;
                        int i33 = lr4Var5.e;
                        int i34 = mr4Var.a + i21;
                        int i35 = mr4Var.b + i22;
                        int[] iArr4 = i33 == 3 ? iArr3 : i33 == 2 ? iArr2 : iArr;
                        lr4Var = lr4Var5;
                        B(jr4Var2.c, iArr4, i33, i34, i35, paint5, canvas);
                        B(jr4Var2.d, iArr4, i33, i34, i35 + 1, paint5, canvas);
                    } else {
                        sparseArray6 = sparseArray6;
                        lr4Var = lr4Var4;
                    }
                    hc2Var = this;
                    i21 = i21;
                    i22 = i22;
                    lr4Var4 = lr4Var;
                    i31 = i32 + 1;
                    i25 = i25;
                    sparseArray15 = sparseArray17;
                    iArr2 = iArr2;
                    sparseArray6 = sparseArray6;
                    i23 = i23;
                }
                int i36 = i25;
                SparseArray sparseArray18 = sparseArray6;
                int i37 = i22;
                lr4 lr4Var6 = lr4Var4;
                int i38 = i21;
                int i39 = i23;
                int[] iArr5 = iArr2;
                if (lr4Var6.b) {
                    int i40 = lr4Var6.e;
                    paint4.setColor(i40 == 3 ? iArr3[lr4Var6.g] : i40 == 2 ? iArr5[lr4Var6.h] : iArr[lr4Var6.i]);
                    canvas.drawRect(i38, i37, i27, i29, paint4);
                } else {
                    paint4 = paint4;
                }
                Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap((Bitmap) this.v, i38, i37, i39, i36);
                float f = i28;
                float f2 = i38 / f;
                float f3 = i37;
                float f4 = i26;
                arrayList.add(new t03(null, null, null, bitmapCreateBitmap2, f3 / f4, 0, 0, f2, 0, Integer.MIN_VALUE, -3.4028235E38f, i39 / f, i36 / f4, false, -16777216, Integer.MIN_VALUE, 0.0f, 0));
                canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                canvas.restore();
                hc2Var = this;
                paint4 = paint4;
                sparseArray5 = sparseArray5;
                i18 = i26;
                i19 = i28;
                arrayList = arrayList;
                sparseArray12 = sparseArray13;
                sparseArray4 = sparseArray14;
                sparseArray2 = sparseArray16;
                sparseArray6 = sparseArray18;
                i20 = i30 + 1;
                ir4Var = ir4Var2;
            }
            w03Var = new w03(-9223372036854775807L, -9223372036854775807L, arrayList);
        }
        xl2Var.accept(w03Var);
    }

    @Override // defpackage.is7
    public is7 t(j22 j22Var, t99 t99Var) {
        ArrayList arrayList = new ArrayList();
        return new a82(((hbc) this.c).h0(j22Var, ntd.T, arrayList), this, t99Var, arrayList);
    }

    public String toString() {
        switch (this.a) {
            case 6:
                StringBuilder sb = new StringBuilder("SessionConfig@");
                sb.append(Integer.toHexString(System.identityHashCode(this)));
                sb.append(" {useCases=");
                sb.append((List) this.f);
                sb.append(", frameRateRange=");
                sb.append((Range) this.c);
                sb.append(", requiredFeatureGroup=");
                sb.append((Set) this.d);
                sb.append(", preferredFeatureGroup=");
                sb.append((List) this.e);
                sb.append(", effects=");
                return ks0.n(sb, (List) this.b, ", viewPort=null}");
            default:
                return super.toString();
        }
    }

    public long w(l46 l46Var) {
        return ((y72) ((l26) this.f).z(l46Var, 0)).a;
    }

    public long x(l46 l46Var) {
        return ((y72) ((l26) this.v).z(l46Var, 0)).a;
    }

    public long y(l46 l46Var) {
        return ((y72) ((l26) this.g).z(l46Var, 0)).a;
    }

    public long z(l46 l46Var) {
        return ((y72) ((l26) this.d).z(l46Var, 0)).a;
    }

    public /* synthetic */ hc2(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
        this.g = obj6;
        this.v = obj7;
    }

    public hc2(l26 l26Var, l26 l26Var2, l26 l26Var3, l26 l26Var4, l26 l26Var5, l26 l26Var6, l26 l26Var7, l26 l26Var8, l26 l26Var9) {
        this.a = 4;
        this.b = l26Var;
        this.c = l26Var2;
        this.d = l26Var3;
        this.e = l26Var4;
        this.f = l26Var5;
        this.g = l26Var6;
        this.v = l26Var7;
    }

    public hc2(ArrayList arrayList, ArrayList arrayList2, qfc qfcVar) {
        int i = 0;
        this.a = 0;
        uaf uafVar = uaf.a;
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = new HashMap();
        this.e = new HashSet();
        this.g = new AtomicReference();
        hz4 hz4Var = new hz4();
        this.f = hz4Var;
        this.v = qfcVar;
        ArrayList<lb2> arrayList3 = new ArrayList();
        arrayList3.add(lb2.c(hz4Var, hz4.class, y6e.class, m2b.class));
        arrayList3.add(lb2.c(this, hc2.class, new Class[0]));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            lb2 lb2Var = (lb2) it.next();
            if (lb2Var != null) {
                arrayList3.add(lb2Var);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList4.add(it2.next());
        }
        ArrayList arrayList5 = new ArrayList();
        synchronized (this) {
            Iterator it3 = arrayList4.iterator();
            while (it3.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((i1b) it3.next()).get();
                    if (componentRegistrar != null) {
                        arrayList3.addAll(((qfc) this.v).O0(componentRegistrar));
                        it3.remove();
                    }
                } catch (bb7 e) {
                    it3.remove();
                    b1.n("ComponentDiscovery", "Invalid component registrar.", e);
                }
            }
            Iterator it4 = arrayList3.iterator();
            while (it4.hasNext()) {
                for (Object obj : ((lb2) it4.next()).b.toArray()) {
                    if (obj.toString().contains("kotlinx.coroutines.CoroutineDispatcher")) {
                        if (((HashSet) this.e).contains(obj.toString())) {
                            it4.remove();
                            break;
                        }
                        ((HashSet) this.e).add(obj.toString());
                    }
                }
            }
            if (((HashMap) this.b).isEmpty()) {
                m93.x(arrayList3);
            } else {
                ArrayList arrayList6 = new ArrayList(((HashMap) this.b).keySet());
                arrayList6.addAll(arrayList3);
                m93.x(arrayList6);
            }
            for (lb2 lb2Var2 : arrayList3) {
                ((HashMap) this.b).put(lb2Var2, new mw7(new gc2(i, this, lb2Var2)));
            }
            arrayList5.addAll(F(arrayList3));
            arrayList5.addAll(G());
            E();
        }
        Iterator it5 = arrayList5.iterator();
        while (it5.hasNext()) {
            ((Runnable) it5.next()).run();
        }
        Boolean bool = (Boolean) ((AtomicReference) this.g).get();
        if (bool != null) {
            j((HashMap) this.b, bool.booleanValue());
        }
    }

    public /* synthetic */ hc2() {
        this.a = 2;
    }

    public hc2(List list) {
        this.a = 1;
        d0a d0aVar = new d0a((byte[]) list.get(0));
        int iG = d0aVar.G();
        int iG2 = d0aVar.G();
        Paint paint = new Paint();
        this.b = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.c = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.d = new Canvas();
        this.e = new ir4(719, 575, 0, 719, 0, 575);
        this.f = new hr4(0, new int[]{0, -1, -16777216, -8421505}, k(), l());
        this.g = new nr4(iG, iG2);
    }

    public hc2(hbc hbcVar, u09 u09Var, j22 j22Var, List list, ntd ntdVar) {
        this.a = 3;
        this.d = hbcVar;
        this.e = u09Var;
        this.f = j22Var;
        this.g = list;
        this.v = ntdVar;
        this.c = hbcVar;
        this.b = new HashMap();
    }

    public hc2(Context context, si2 si2Var, bbg bbgVar, vva vvaVar, WorkDatabase workDatabase, lbg lbgVar, ArrayList arrayList) {
        this.a = 9;
        context.getClass();
        vvaVar.getClass();
        this.b = si2Var;
        this.c = bbgVar;
        this.d = vvaVar;
        this.e = workDatabase;
        this.f = lbgVar;
        this.g = arrayList;
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        this.v = applicationContext;
    }
}
