package defpackage;

import ai.askquin.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.media.Image;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.util.Size;
import android.view.View;
import android.view.Window;
import androidx.compose.ui.node.LayoutNode;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import io.sentry.android.core.b1;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.StringWriter;
import java.lang.reflect.Type;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class m6c implements ks8, goe, x91, h1b, fm3, f1b, g1b, ye, ib3, uk9 {
    public static m6c c;
    public static final n6c d = new n6c(0, false, false, 0, 0);
    public static final m6c e = new m6c(1, new float[]{0.8951f, -0.7502f, 0.0389f, 0.2664f, 1.7135f, -0.0685f, -0.1614f, 0.0367f, 1.0296f});
    public final /* synthetic */ int a;
    public Object b;

    public m6c(int i) {
        this.a = i;
        switch (i) {
            case 5:
                this.b = new CopyOnWriteArrayList();
                break;
            case 6:
                this.b = new p89(0, new mm2[16]);
                break;
            case 9:
                this.b = new HashMap();
                break;
            case 22:
                this.b = new v69();
                new HashMap();
                break;
        }
    }

    public static synchronized m6c A() {
        m6c m6cVar;
        m6cVar = c;
        if (m6cVar == null) {
            m6cVar = new m6c(0);
            c = m6cVar;
        }
        return m6cVar;
    }

    /* JADX WARN: Code duplicated, block: B:59:0x00b1  */
    public static kb5 C(gf6 gf6Var, List list) {
        boolean z;
        boolean z2;
        boolean z3;
        String string;
        boolean z4 = false;
        if (list != null && list.isEmpty()) {
            z = false;
            break;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            if (((oif) it.next()) instanceof hv6) {
                z = true;
                break;
            }
        }
        if (list == null || !list.isEmpty()) {
            Iterator it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    oif oifVar = (oif) it2.next();
                    if ((oifVar instanceof wta) || tgc.l(oifVar)) {
                        z2 = true;
                    }
                } else {
                    z2 = false;
                }
            }
        } else {
            z2 = false;
        }
        if (list == null || !list.isEmpty()) {
            Iterator it3 = list.iterator();
            while (true) {
                if (it3.hasNext()) {
                    oif oifVar2 = (oif) it3.next();
                    if ((oifVar2 instanceof wta) || tgc.l(oifVar2)) {
                        z3 = true;
                    }
                } else {
                    z3 = false;
                }
            }
        } else {
            z3 = false;
        }
        if (list == null || !list.isEmpty()) {
            Iterator it4 = list.iterator();
            while (it4.hasNext()) {
                if (tgc.l((oif) it4.next())) {
                    z4 = true;
                    break;
                }
            }
        }
        int iOrdinal = gf6Var.a().ordinal();
        mkf mkfVar = mkf.PREVIEW;
        mkf mkfVar2 = mkf.VIDEO_CAPTURE;
        if (iOrdinal != 0) {
            mkf mkfVar3 = mkf.IMAGE_ANALYSIS;
            if (iOrdinal == 1) {
                string = mkfVar + " or " + mkfVar2 + " or " + mkfVar3;
                if (z3) {
                    string = null;
                }
            } else if (iOrdinal == 2) {
                int iOrdinal2 = ((wuf) gf6Var).a.ordinal();
                if (iOrdinal2 == 2) {
                    string = mkfVar2.toString();
                    if (z4) {
                        string = null;
                    }
                } else if (iOrdinal2 != 3) {
                    string = null;
                } else {
                    string = mkfVar + " or " + mkfVar2 + " or " + mkfVar3;
                    if (z3) {
                        string = null;
                    }
                }
            } else if (iOrdinal == 3) {
                string = mkf.IMAGE_CAPTURE.toString();
                if (z) {
                    string = null;
                }
            } else {
                if (iOrdinal != 4) {
                    ap.c();
                    return null;
                }
                string = mkfVar2.toString();
                if (z4) {
                    string = null;
                }
            }
        } else {
            string = mkfVar + " or " + mkfVar2;
            if (z2) {
                string = null;
            }
        }
        if (string != null) {
            return new kb5(string, gf6Var);
        }
        return null;
    }

    public static sp0 M(fp0 fp0Var) throws jv6 {
        sp0 sp0Var = fp0Var.a;
        iw6 iw6Var = (iw6) sp0Var.a;
        Rect rect = sp0Var.e;
        try {
            byte[] bArrM = i7h.M(iw6Var, rect, fp0Var.b, sp0Var.f);
            try {
                e35 e35Var = new e35(new r35(new ByteArrayInputStream(bArrM)));
                Size size = new Size(rect.width(), rect.height());
                Rect rect2 = new Rect(0, 0, rect.width(), rect.height());
                int i = sp0Var.f;
                Matrix matrix = sp0Var.g;
                RectF rectF = s2f.a;
                Matrix matrix2 = new Matrix(matrix);
                matrix2.postTranslate(-rect.left, -rect.top);
                return new sp0(bArrM, e35Var, 256, size, rect2, i, matrix2, sp0Var.h);
            } catch (IOException e2) {
                throw new jv6(0, "Failed to extract Exif from YUV-generated JPEG", e2);
            }
        } catch (dx6 e3) {
            throw new jv6(1, "Failed to encode the image to JPEG.", e3);
        }
    }

    public static d08 O(m6c m6cVar, int i) {
        j18 j18Var = (j18) m6cVar.b;
        ird irdVarJ = iqf.j();
        a26 a26VarE = irdVarJ != null ? irdVarJ.e() : null;
        ird irdVarL = iqf.l(irdVarJ);
        try {
            b18 b18Var = (b18) j18Var.f.getValue();
            return j18Var.q.a(i, b18Var.j, j18Var.d, new tb7(i, b18Var));
        } finally {
            iqf.p(irdVarJ, irdVarL, a26VarE);
        }
    }

    @Override // defpackage.ks8
    public boolean B(qr8 qr8Var) {
        Window.Callback callback;
        q80 q80Var = (q80) this.b;
        if (qr8Var != qr8Var.k() || !q80Var.S0 || (callback = q80Var.z.getCallback()) == null || q80Var.d1) {
            return true;
        }
        callback.onMenuOpened(108, qr8Var);
        return true;
    }

    public mx D() {
        b0 b0Var = (b0) this.b;
        if (!(b0Var instanceof sy9)) {
            return new mx(3, false);
        }
        ArrayList arrayList = ((sy9) b0Var).b.b;
        mx mxVar = new mx(3, false);
        mxVar.a.addAll(arrayList);
        return mxVar;
    }

    public int E() {
        return ((Image.Plane) this.b).getPixelStride();
    }

    public int F() {
        return ((Image.Plane) this.b).getRowStride();
    }

    public String G(String... strArr) {
        String string = "";
        for (String str : strArr) {
            if (!str.isEmpty()) {
                string = TextUtils.isEmpty(string) ? str : ((Resources) this.b).getString(R.string.exo_item_list, string, str);
            }
        }
        return string;
    }

    public void H(int i, int i2) {
        int i3;
        int i4;
        RecyclerView recyclerView = (RecyclerView) this.b;
        int iC = recyclerView.f.C();
        int i5 = i2 + i;
        for (int i6 = 0; i6 < iC; i6++) {
            View viewA = recyclerView.f.A(i6);
            flb flbVarF = RecyclerView.F(viewA);
            if (flbVarF != null && !flbVarF.n() && (i4 = flbVarF.c) >= i && i4 < i5) {
                flbVarF.a(2);
                flbVarF.a(UserMetadata.MAX_ATTRIBUTE_SIZE);
                ((ukb) viewA.getLayoutParams()).c = true;
            }
        }
        gp3 gp3Var = recyclerView.c;
        ArrayList arrayList = (ArrayList) gp3Var.e;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            flb flbVar = (flb) arrayList.get(size);
            if (flbVar != null && (i3 = flbVar.c) >= i && i3 < i5) {
                flbVar.a(2);
                gp3Var.l(size);
            }
        }
        recyclerView.w1 = true;
    }

    public void I(int i, int i2) {
        RecyclerView recyclerView = (RecyclerView) this.b;
        int iC = recyclerView.f.C();
        for (int i3 = 0; i3 < iC; i3++) {
            flb flbVarF = RecyclerView.F(recyclerView.f.A(i3));
            if (flbVarF != null && !flbVarF.n() && flbVarF.c >= i) {
                flbVarF.k(i2, false);
                recyclerView.s1.e = true;
            }
        }
        ArrayList arrayList = (ArrayList) recyclerView.c.e;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            flb flbVar = (flb) arrayList.get(i4);
            if (flbVar != null && flbVar.c >= i) {
                flbVar.k(i2, false);
            }
        }
        recyclerView.requestLayout();
        recyclerView.v1 = true;
    }

    public void J(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        RecyclerView recyclerView = (RecyclerView) this.b;
        int iC = recyclerView.f.C();
        int i10 = -1;
        if (i < i2) {
            i4 = i;
            i3 = i2;
            i5 = -1;
        } else {
            i3 = i;
            i4 = i2;
            i5 = 1;
        }
        for (int i11 = 0; i11 < iC; i11++) {
            flb flbVarF = RecyclerView.F(recyclerView.f.A(i11));
            if (flbVarF != null && (i9 = flbVarF.c) >= i4 && i9 <= i3) {
                if (i9 == i) {
                    flbVarF.k(i2 - i, false);
                } else {
                    flbVarF.k(i5, false);
                }
                recyclerView.s1.e = true;
            }
        }
        ArrayList arrayList = (ArrayList) recyclerView.c.e;
        if (i < i2) {
            i7 = i;
            i6 = i2;
        } else {
            i6 = i;
            i7 = i2;
            i10 = 1;
        }
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            flb flbVar = (flb) arrayList.get(i12);
            if (flbVar != null && (i8 = flbVar.c) >= i7 && i8 <= i6) {
                if (i8 == i) {
                    flbVar.k(i2 - i, false);
                } else {
                    flbVar.k(i10, false);
                }
            }
        }
        recyclerView.requestLayout();
        recyclerView.v1 = true;
    }

    public void K(Exception exc) {
        xo1.y("MediaCodecAudioRenderer", "Audio sink error", exc);
        k47 k47Var = ((qo8) this.b).V1;
        Handler handler = (Handler) k47Var.b;
        if (handler != null) {
            handler.post(new hk0(k47Var, exc, 8));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0079, code lost:
    
        if (r1 != (-1)) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public defpackage.sp0 L(defpackage.fp0 r11, int r12) {
        /*
            r10 = this;
            sp0 r11 = r11.a
            java.lang.Object r10 = r10.b
            ssg r10 = (defpackage.ssg) r10
            java.lang.Object r0 = r11.a
            iw6 r0 = (defpackage.iw6) r0
            java.lang.Object r10 = r10.b
            androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk r10 = (androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk) r10
            r1 = 0
            if (r10 != 0) goto L29
            m6c[] r10 = r0.v()
            r10 = r10[r1]
            java.nio.ByteBuffer r10 = r10.v()
            int r0 = r10.capacity()
            byte[] r0 = new byte[r0]
            r10.rewind()
            r10.get(r0)
        L27:
            r2 = r0
            goto L84
        L29:
            m6c[] r10 = r0.v()
            r10 = r10[r1]
            java.nio.ByteBuffer r10 = r10.v()
            int r0 = r10.capacity()
            byte[] r2 = new byte[r0]
            r10.rewind()
            r10.get(r2)
            r3 = 2
            r4 = r3
        L41:
            int r5 = r4 + 4
            r6 = -1
            if (r5 > r0) goto L68
            r5 = r2[r4]
            if (r5 == r6) goto L4b
            goto L68
        L4b:
            if (r5 != r6) goto L56
            int r5 = r4 + 1
            r5 = r2[r5]
            r6 = -38
            if (r5 != r6) goto L56
            goto L7b
        L56:
            int r5 = r4 + 2
            r5 = r2[r5]
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r5 = r5 << 8
            int r6 = r4 + 3
            r6 = r2[r6]
            r6 = r6 & 255(0xff, float:3.57E-43)
            r5 = r5 | r6
            int r5 = r5 + r3
            int r4 = r4 + r5
            goto L41
        L68:
            int r1 = r3 + 1
            if (r1 <= r0) goto L6e
            r1 = r6
            goto L79
        L6e:
            r4 = r2[r3]
            if (r4 != r6) goto L9a
            r4 = r2[r1]
            r5 = -40
            if (r4 != r5) goto L9a
            r1 = r3
        L79:
            if (r1 == r6) goto L84
        L7b:
            int r10 = r10.limit()
            byte[] r0 = java.util.Arrays.copyOfRange(r2, r1, r10)
            goto L27
        L84:
            e35 r3 = r11.b
            java.util.Objects.requireNonNull(r3)
            android.util.Size r5 = r11.d
            android.graphics.Rect r6 = r11.e
            int r7 = r11.f
            android.graphics.Matrix r8 = r11.g
            oe1 r9 = r11.h
            sp0 r1 = new sp0
            r4 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return r1
        L9a:
            r4 = r12
            r3 = r1
            r12 = r4
            goto L68
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m6c.L(fp0, int):sp0");
    }

    public void N() {
        p89 p89Var = (p89) this.b;
        z67 z67VarC0 = mh3.c0(0, p89Var.c);
        int i = z67VarC0.a;
        int i2 = z67VarC0.b;
        if (i <= i2) {
            while (true) {
                ((mm2) p89Var.a[i]).b.g(wef.a);
                if (i == i2) {
                    break;
                } else {
                    i++;
                }
            }
        }
        p89Var.g();
    }

    public void P(String str) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.b;
        String lowerCase = "Cache-Control".toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        linkedHashMap.put(lowerCase, t72.K(str));
    }

    /* JADX WARN: Code duplicated, block: B:24:0x007a  */
    /* JADX WARN: Code duplicated, block: B:56:0x0168  */
    /* JADX WARN: Code duplicated, block: B:58:0x016f  */
    /* JADX WARN: Code duplicated, block: B:59:0x0172  */
    public void Q(c36 c36Var, StringBuilder sb) {
        String strP;
        boolean z;
        jz3 jz3Var = (jz3) this.b;
        mz3 mz3Var = jz3Var.a;
        if (!mz3Var.A()) {
            if (!mz3Var.z()) {
                List listT = c36Var.T();
                listT.getClass();
                jz3Var.t(sb, listT);
                jz3Var.p(sb, c36Var, null);
                rz3 visibility = c36Var.getVisibility();
                visibility.getClass();
                jz3Var.Y(visibility, sb);
                jz3Var.D(c36Var, sb);
                if (mz3Var.t()) {
                    jz3Var.B(c36Var, sb);
                }
                jz3Var.J(c36Var, sb);
                if (mz3Var.t()) {
                    boolean z2 = false;
                    if (c36Var.isOperator()) {
                        Collection collectionL = c36Var.l();
                        collectionL.getClass();
                        Collection collection = collectionL;
                        if (!collection.isEmpty()) {
                            Iterator it = collection.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    if (((c36) it.next()).isOperator()) {
                                        if (!mz3Var.l()) {
                                            z = false;
                                        }
                                    }
                                }
                            }
                        }
                        z = true;
                    } else {
                        z = false;
                    }
                    if (c36Var.isInfix()) {
                        Collection collectionL2 = c36Var.l();
                        collectionL2.getClass();
                        Collection collection2 = collectionL2;
                        if (!collection2.isEmpty()) {
                            Iterator it2 = collection2.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    if (((c36) it2.next()).isInfix()) {
                                        if (!mz3Var.l()) {
                                            break;
                                        } else {
                                            break;
                                        }
                                    }
                                }
                                z2 = true;
                                break;
                            }
                        }
                        z2 = true;
                        break;
                    }
                    jz3Var.E(sb, c36Var.z(), "tailrec");
                    jz3Var.E(sb, c36Var.isSuspend(), "suspend");
                    jz3Var.E(sb, c36Var.isInline(), "inline");
                    jz3Var.E(sb, z2, "infix");
                    jz3Var.E(sb, z, "operator");
                } else {
                    jz3Var.E(sb, c36Var.isSuspend(), "suspend");
                }
                jz3Var.A(c36Var, sb);
                if (mz3Var.D()) {
                    if (c36Var.X()) {
                        sb.append("/*isHiddenToOvercomeSignatureClash*/ ");
                    }
                    if (c36Var.b0()) {
                        sb.append("/*isHiddenForResolutionEverywhereBesideSupercalls*/ ");
                    }
                }
            }
            sb.append(jz3Var.z("fun"));
            sb.append(" ");
            List typeParameters = c36Var.getTypeParameters();
            typeParameters.getClass();
            jz3Var.U(sb, typeParameters, true);
            jz3Var.M(c36Var, sb);
        }
        jz3Var.G(c36Var, sb, true);
        List listG = c36Var.G();
        listG.getClass();
        jz3Var.X(sb, listG, c36Var.t());
        jz3Var.N(c36Var, sb);
        tt7 returnType = c36Var.getReturnType();
        a90 a90Var = mz3Var.l;
        wn7[] wn7VarArr = mz3.Z;
        wn7 wn7Var = wn7VarArr[10];
        a90Var.getClass();
        wn7Var.getClass();
        if (!((Boolean) a90Var.b).booleanValue()) {
            a90 a90Var2 = mz3Var.k;
            wn7 wn7Var2 = wn7VarArr[9];
            a90Var2.getClass();
            wn7Var2.getClass();
            if (((Boolean) a90Var2.b).booleanValue() || returnType == null) {
                sb.append(": ");
                if (returnType == null) {
                    strP = "[NULL]";
                } else {
                    strP = jz3Var.P(returnType);
                }
                sb.append(strP);
            } else {
                t99 t99Var = xr7.e;
                if (!xr7.E(returnType, syd.d)) {
                    sb.append(": ");
                    if (returnType == null) {
                        strP = "[NULL]";
                    } else {
                        strP = jz3Var.P(returnType);
                    }
                    sb.append(strP);
                }
            }
        }
        List typeParameters2 = c36Var.getTypeParameters();
        typeParameters2.getClass();
        jz3Var.Z(sb, typeParameters2);
    }

    public void R(uxa uxaVar, StringBuilder sb, String str) {
        jz3 jz3Var = (jz3) this.b;
        int iOrdinal = jz3Var.a.w().ordinal();
        if (iOrdinal == 0) {
            jz3Var.B(uxaVar, sb);
            sb.append(str.concat(" for "));
            jz3Var.L(uxaVar.w, sb);
        } else if (iOrdinal == 1) {
            Q(uxaVar, sb);
        } else {
            if (iOrdinal == 2) {
                return;
            }
            ap.c();
        }
    }

    @Override // defpackage.goe
    public void V(dd2 dd2Var, l46 l46Var, int i) {
        l46 l46Var2 = l46Var;
        int i2 = this.a;
        ov7 ov7Var = LayoutNode.h1;
        g09 g09Var = g09.a;
        switch (i2) {
            case 8:
                l46Var2.h0(1052425248);
                int i3 = (l46Var2.g(this) ? 32 : 16) | i;
                if (l46Var2.W(i3 & 1, (i3 & 19) != 18)) {
                    use useVar = (use) this.b;
                    xn8 xn8VarC = s21.c(ndb.b, false);
                    int iHashCode = Long.hashCode(l46Var2.T);
                    u8a u8aVarM = l46Var2.m();
                    j09 j09VarJ = m93.J(l46Var2, g09Var);
                    lf2.q.getClass();
                    l46Var2.j0();
                    if (l46Var2.S) {
                        l46Var2.l(ov7Var);
                    } else {
                        l46Var2.s0();
                    }
                    dec.l(hj6.z, l46Var2, xn8VarC);
                    dec.l(hj6.y, l46Var2, u8aVarM);
                    dec.l(hj6.X, l46Var2, Integer.valueOf(iHashCode));
                    dec.k(l46Var2);
                    dec.l(hj6.x, l46Var2, j09VarJ);
                    if (useVar.d().c.length() == 0) {
                        l46Var2.f0(-1457354952);
                        nte.b("auto", null, y72.b(((m82) l46Var2.k(o82.a)).q, 0.4f), 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((p9f) l46Var2.k(r9f.a)).k, l46Var, 6, 0, 131066);
                        l46Var2 = l46Var;
                        l46Var2.r(false);
                    } else {
                        l46Var2.f0(-1457175896);
                        l46Var2.r(false);
                    }
                    tec.q(6, dd2Var, l46Var2, true);
                } else {
                    l46Var2.Z();
                }
                ojb ojbVarV = l46Var2.v();
                if (ojbVarV != null) {
                    ojbVarV.d = new h8(this, dd2Var, i, 13);
                }
                break;
            default:
                l46Var2.h0(-1910124833);
                int i4 = i | (l46Var2.g(this) ? 32 : 16);
                if (l46Var2.W(i4 & 1, (i4 & 19) != 18)) {
                    CharSequence charSequence = (CharSequence) this.b;
                    xn8 xn8VarC2 = s21.c(ndb.b, false);
                    int iHashCode2 = Long.hashCode(l46Var2.T);
                    u8a u8aVarM2 = l46Var2.m();
                    j09 j09VarJ2 = m93.J(l46Var2, g09Var);
                    lf2.q.getClass();
                    l46Var2.j0();
                    if (l46Var2.S) {
                        l46Var2.l(ov7Var);
                    } else {
                        l46Var2.s0();
                    }
                    dec.l(hj6.z, l46Var2, xn8VarC2);
                    dec.l(hj6.y, l46Var2, u8aVarM2);
                    dec.l(hj6.X, l46Var2, Integer.valueOf(iHashCode2));
                    dec.k(l46Var2);
                    dec.l(hj6.x, l46Var2, j09VarJ2);
                    if (charSequence.length() == 0) {
                        l46Var2.f0(-414621685);
                        String strQ = afc.q(R.string.post_draw_info_placeholder, l46Var2);
                        mue mueVar = pue.a;
                        nte.b(strQ, null, ((e8b) l46Var2.k(l8b.a)).t, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, pue.e(l46Var2), l46Var, 0, 0, 131066);
                        l46Var2 = l46Var;
                        l46Var2.r(false);
                    } else {
                        l46Var2.f0(-414427191);
                        l46Var2.r(false);
                    }
                    tec.q(6, dd2Var, l46Var2, true);
                } else {
                    l46Var2.Z();
                }
                ojb ojbVarV2 = l46Var2.v();
                if (ojbVarV2 != null) {
                    ojbVarV2.d = new rk6(this, dd2Var, i, 22);
                }
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x002b  */
    public String a(rr5 rr5Var) {
        String displayName;
        String str = rr5Var.d;
        String str2 = rr5Var.b;
        if (TextUtils.isEmpty(str) || "und".equals(str)) {
            displayName = "";
        } else {
            Locale localeForLanguageTag = Locale.forLanguageTag(str);
            String str3 = pqf.a;
            Locale locale = Locale.getDefault(Locale.Category.DISPLAY);
            displayName = localeForLanguageTag.getDisplayName(locale);
            if (TextUtils.isEmpty(displayName)) {
                displayName = "";
            } else {
                try {
                    int iOffsetByCodePoints = displayName.offsetByCodePoints(0, 1);
                    displayName = displayName.substring(0, iOffsetByCodePoints).toUpperCase(locale) + displayName.substring(iOffsetByCodePoints);
                } catch (IndexOutOfBoundsException unused) {
                }
            }
        }
        String strG = G(displayName, h(rr5Var));
        if (!TextUtils.isEmpty(strG)) {
            return strG;
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        return str2;
    }

    @Override // defpackage.uk9
    public void b(Object obj) {
        ((yl2) this.b).accept(obj);
    }

    @Override // defpackage.fm3
    public Object c(zxa zxaVar, Object obj) {
        R(zxaVar, (StringBuilder) obj, "getter");
        return wef.a;
    }

    @Override // defpackage.ks8
    public void d(qr8 qr8Var, boolean z) {
        p80 p80Var;
        q80 q80Var = (q80) this.b;
        qr8 qr8VarK = qr8Var.k();
        int i = 0;
        boolean z2 = qr8VarK != qr8Var;
        if (z2) {
            qr8Var = qr8VarK;
        }
        p80[] p80VarArr = q80Var.Y0;
        int length = p80VarArr != null ? p80VarArr.length : 0;
        while (true) {
            if (i < length) {
                p80Var = p80VarArr[i];
                if (p80Var != null && p80Var.h == qr8Var) {
                    break;
                } else {
                    i++;
                }
            } else {
                p80Var = null;
                break;
            }
        }
        if (p80Var != null) {
            if (!z2) {
                q80Var.u(p80Var, z);
            } else {
                q80Var.s(p80Var.a, p80Var, qr8VarK);
                q80Var.u(p80Var, true);
            }
        }
    }

    @Override // defpackage.fm3
    public Object e(xrf xrfVar, Object obj) {
        ((jz3) this.b).W(xrfVar, true, (StringBuilder) obj, true);
        return wef.a;
    }

    @Override // defpackage.fm3
    public Object f(p5 p5Var, Object obj) {
        ((jz3) this.b).S(p5Var, (StringBuilder) obj, true);
        return wef.a;
    }

    @Override // defpackage.fm3
    public Object g(nw7 nw7Var, Object obj) {
        ((StringBuilder) obj).append(nw7Var.getName());
        return wef.a;
    }

    @Override // defpackage.h1b
    public Object get() {
        switch (this.a) {
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                return new ta0((Context) ((kb6) this.b).b, new w1e(10), new g3e(7), false, 18);
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                return new iz4((i1b) ((ze) this.b).a);
            default:
                i1b i1bVar = (i1b) ((szc) this.b).d;
                nk8.o(i1bVar);
                return i1bVar;
        }
    }

    public String h(rr5 rr5Var) {
        Resources resources = (Resources) this.b;
        int i = rr5Var.f;
        String string = (i & 2) != 0 ? resources.getString(R.string.exo_track_role_alternate) : "";
        if ((i & 4) != 0) {
            string = G(string, resources.getString(R.string.exo_track_role_supplementary));
        }
        if ((i & 8) != 0) {
            string = G(string, resources.getString(R.string.exo_track_role_commentary));
        }
        return (i & 1088) != 0 ? G(string, resources.getString(R.string.exo_track_role_closed_captions)) : string;
    }

    public void i(CancellationException cancellationException) {
        p89 p89Var = (p89) this.b;
        int i = p89Var.c;
        ol1[] ol1VarArr = new ol1[i];
        for (int i2 = 0; i2 < i; i2++) {
            ol1VarArr[i2] = ((mm2) p89Var.a[i2]).b;
        }
        for (int i3 = 0; i3 < i; i3++) {
            ol1VarArr[i3].p(cancellationException);
        }
        if (p89Var.c == 0) {
            return;
        }
        l37.c("uncancelled requests present");
    }

    @Override // defpackage.ye
    public void j(Object obj) {
        xe xeVar = (xe) obj;
        zx5 zx5Var = (zx5) this.b;
        vx5 vx5Var = (vx5) zx5Var.F.pollFirst();
        if (vx5Var == null) {
            b1.l("FragmentManager", "No IntentSenders were started for " + this);
            return;
        }
        String str = vx5Var.a;
        int i = vx5Var.b;
        kx5 kx5VarG = zx5Var.c.G(str);
        if (kx5VarG != null) {
            kx5VarG.r(i, xeVar.a, xeVar.b);
            return;
        }
        b1.l("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str);
    }

    @Override // defpackage.x91
    public Type k() {
        return (Type) this.b;
    }

    @Override // defpackage.x91
    public Object l(fm9 fm9Var) {
        ab2 ab2Var = new ab2(fm9Var);
        fm9Var.x(new ssg(9, ab2Var));
        return ab2Var;
    }

    @Override // defpackage.fm3
    public Object m(dya dyaVar, Object obj) {
        R(dyaVar, (StringBuilder) obj, "setter");
        return wef.a;
    }

    @Override // defpackage.fm3
    public Object n(n18 n18Var, Object obj) {
        StringBuilder sb = (StringBuilder) obj;
        jz3 jz3Var = (jz3) this.b;
        jz3Var.getClass();
        dx5 dx5Var = n18Var.e;
        sb.append(jz3Var.z("package"));
        ex5 ex5Var = dx5Var.a;
        ex5Var.getClass();
        String strL = jz3Var.l(jrb.l(ex5.f(ex5Var)));
        if (strL.length() > 0) {
            sb.append(" ");
            sb.append(strL);
        }
        if (jz3Var.a.p()) {
            sb.append(" in context of ");
            jz3Var.G(n18Var.d, sb, false);
        }
        return wef.a;
    }

    @Override // defpackage.fm3
    public Object o(s04 s04Var, Object obj) {
        StringBuilder sb = (StringBuilder) obj;
        jz3 jz3Var = (jz3) this.b;
        jz3Var.getClass();
        jz3Var.p(sb, s04Var, null);
        rz3 rz3Var = s04Var.g;
        rz3Var.getClass();
        jz3Var.Y(rz3Var, sb);
        jz3Var.B(s04Var, sb);
        sb.append(jz3Var.z("typealias"));
        sb.append(" ");
        jz3Var.G(s04Var, sb, true);
        jz3Var.U(sb, s04Var.h0(), false);
        jz3Var.r(s04Var, sb);
        sb.append(" = ");
        sb.append(jz3Var.P(s04Var.F0()));
        return wef.a;
    }

    @Override // defpackage.uk9
    public void onError(Throwable th) {
        b21.w("ObserverToConsumerAdapter", "Unexpected error in Observable", th);
    }

    public void p(xf xfVar) {
        RecyclerView recyclerView = (RecyclerView) this.b;
        int i = xfVar.a;
        if (i == 1) {
            recyclerView.E0.R(xfVar.b, xfVar.c);
            return;
        }
        if (i == 2) {
            recyclerView.E0.U(xfVar.b, xfVar.c);
        } else if (i == 4) {
            recyclerView.E0.V(xfVar.b, xfVar.c);
        } else {
            if (i != 8) {
                return;
            }
            recyclerView.E0.T(xfVar.b, xfVar.c);
        }
    }

    @Override // defpackage.fm3
    public Object q(x09 x09Var, Object obj) {
        ((jz3) this.b).G(x09Var, (StringBuilder) obj, true);
        return wef.a;
    }

    public String r(Object obj) {
        StringWriter stringWriter = new StringWriter();
        try {
            hh7 hh7Var = (hh7) this.b;
            mj7 mj7Var = new mj7(stringWriter, hh7Var.a, hh7Var.b, hh7Var.c, hh7Var.d);
            mj7Var.h(obj);
            mj7Var.j();
            mj7Var.b.flush();
        } catch (IOException unused) {
        }
        return stringWriter.toString();
    }

    @Override // defpackage.fm3
    public Object s(yxa yxaVar, Object obj) {
        ((jz3) this.b).L(yxaVar, (StringBuilder) obj);
        return wef.a;
    }

    @Override // defpackage.fm3
    public /* bridge */ /* synthetic */ Object t(c36 c36Var, Object obj) {
        Q(c36Var, (StringBuilder) obj);
        return wef.a;
    }

    public String toString() {
        switch (this.a) {
            case 1:
                return "Bradford";
            default:
                return super.toString();
        }
    }

    public flb u(int i) {
        RecyclerView recyclerView = (RecyclerView) this.b;
        int iC = recyclerView.f.C();
        flb flbVar = null;
        for (int i2 = 0; i2 < iC; i2++) {
            flb flbVarF = RecyclerView.F(recyclerView.f.A(i2));
            if (flbVarF != null && !flbVarF.g() && flbVarF.c == i) {
                if (!((ArrayList) recyclerView.f.b).contains(flbVarF.a)) {
                    flbVar = flbVarF;
                    break;
                }
                flbVar = flbVarF;
            }
        }
        if (flbVar != null) {
            if (!((ArrayList) recyclerView.f.b).contains(flbVar.a)) {
                return flbVar;
            }
        }
        return null;
    }

    public ByteBuffer v() {
        return ((Image.Plane) this.b).getBuffer();
    }

    @Override // defpackage.fm3
    public Object w(u09 u09Var, Object obj) throws IOException {
        z12 z12VarM0;
        String str;
        StringBuilder sb = (StringBuilder) obj;
        jz3 jz3Var = (jz3) this.b;
        mz3 mz3Var = jz3Var.a;
        int i = 1;
        boolean z = u09Var.E() == l22.ENUM_ENTRY;
        if (!mz3Var.A()) {
            List listV = u09Var.v();
            listV.getClass();
            jz3Var.t(sb, listV);
            jz3Var.p(sb, u09Var, null);
            if (!z) {
                rz3 visibility = u09Var.getVisibility();
                visibility.getClass();
                jz3Var.Y(visibility, sb);
            }
            if ((u09Var.E() != l22.INTERFACE || u09Var.i() != e09.e) && (!u09Var.E().a() || u09Var.i() != e09.b)) {
                e09 e09VarI = u09Var.i();
                e09VarI.getClass();
                jz3Var.C(e09VarI, sb, jz3.m(u09Var));
            }
            jz3Var.B(u09Var, sb);
            jz3Var.E(sb, mz3Var.u().contains(kz3.g) && u09Var.j(), "inner");
            jz3Var.E(sb, mz3Var.u().contains(kz3.w) && u09Var.p0(), "data");
            jz3Var.E(sb, mz3Var.u().contains(kz3.x) && u09Var.isInline(), "inline");
            jz3Var.E(sb, mz3Var.u().contains(kz3.E0) && u09Var.r0(), "value");
            jz3Var.E(sb, mz3Var.u().contains(kz3.Z) && u09Var.q0(), "fun");
            if (u09Var.o0()) {
                str = "companion object";
            } else {
                int iOrdinal = u09Var.E().ordinal();
                if (iOrdinal == 0) {
                    str = "class";
                } else if (iOrdinal == 1) {
                    str = "interface";
                } else if (iOrdinal == 2) {
                    str = "enum class";
                } else if (iOrdinal == 3) {
                    str = "enum entry";
                } else if (iOrdinal == 4) {
                    str = "annotation class";
                } else {
                    if (iOrdinal != 5) {
                        ap.c();
                        return null;
                    }
                    str = "object";
                }
            }
            sb.append(jz3Var.z(str));
        }
        if (oz3.k(u09Var)) {
            a90 a90Var = mz3Var.G;
            wn7 wn7Var = mz3.Z[31];
            a90Var.getClass();
            wn7Var.getClass();
            if (((Boolean) a90Var.b).booleanValue()) {
                if (mz3Var.A()) {
                    sb.append("companion object");
                }
                jz3.O(sb);
                bm3 bm3VarK = u09Var.k();
                if (bm3VarK != null) {
                    sb.append("of ");
                    t99 name = bm3VarK.getName();
                    name.getClass();
                    sb.append(jz3Var.F(name, false));
                }
            }
            if (mz3Var.D() || !pa7.t(u09Var.getName(), sud.b)) {
                if (!mz3Var.A()) {
                    jz3.O(sb);
                }
                t99 name2 = u09Var.getName();
                name2.getClass();
                sb.append(jz3Var.F(name2, true));
            }
        } else {
            if (!mz3Var.A()) {
                jz3.O(sb);
            }
            jz3Var.G(u09Var, sb, true);
        }
        if (!z) {
            List listH0 = u09Var.h0();
            listH0.getClass();
            jz3Var.U(sb, listH0, false);
            jz3Var.r(u09Var, sb);
            if (!u09Var.E().a()) {
                a90 a90Var2 = mz3Var.i;
                wn7 wn7Var2 = mz3.Z[7];
                a90Var2.getClass();
                wn7Var2.getClass();
                if (((Boolean) a90Var2.b).booleanValue() && (z12VarM0 = u09Var.m0()) != null) {
                    sb.append(" ");
                    jz3Var.p(sb, z12VarM0, null);
                    rz3 visibility2 = z12VarM0.getVisibility();
                    visibility2.getClass();
                    jz3Var.Y(visibility2, sb);
                    sb.append(jz3Var.z("constructor"));
                    List listG = z12VarM0.G();
                    listG.getClass();
                    jz3Var.X(sb, listG, z12VarM0.t());
                }
            }
            a90 a90Var3 = mz3Var.x;
            wn7 wn7Var3 = mz3.Z[22];
            a90Var3.getClass();
            wn7Var3.getClass();
            if (!((Boolean) a90Var3.b).booleanValue() && !xr7.F(u09Var.S())) {
                Collection collectionE = u09Var.h().e();
                collectionE.getClass();
                if (!collectionE.isEmpty() && (collectionE.size() != 1 || !xr7.y((tt7) collectionE.iterator().next()))) {
                    jz3.O(sb);
                    sb.append(": ");
                    s72.C0(collectionE, sb, ", ", null, null, new iz3(jz3Var, i), 60);
                }
            }
            jz3Var.Z(sb, listH0);
        }
        return wef.a;
    }

    @Override // defpackage.fm3
    public Object x(lw9 lw9Var, Object obj) {
        StringBuilder sb = (StringBuilder) obj;
        jz3 jz3Var = (jz3) this.b;
        jz3Var.getClass();
        dx5 dx5Var = lw9Var.f;
        sb.append(jz3Var.z("package-fragment"));
        ex5 ex5Var = dx5Var.a;
        ex5Var.getClass();
        String strL = jz3Var.l(jrb.l(ex5.f(ex5Var)));
        if (strL.length() > 0) {
            sb.append(" ");
            sb.append(strL);
        }
        if (jz3Var.a.p()) {
            sb.append(" in ");
            jz3Var.G(lw9Var.k(), sb, false);
        }
        return wef.a;
    }

    public lb5 y(hc2 hc2Var, ArrayList arrayList, int i, List list) {
        ArrayList arrayList2;
        if (i < arrayList.size()) {
            int i2 = i + 1;
            lb5 lb5VarY = y(hc2Var, arrayList, i2, s72.R0(list, arrayList.get(i)));
            return lb5VarY instanceof hb5 ? lb5VarY : y(hc2Var, arrayList, i2, list);
        }
        LinkedHashSet<gf6> linkedHashSetM = n3d.m((Set) hc2Var.d, list);
        b21.q("DefaultFeatureGroupResolver", "getFeatureListResolvedByPriority: features = " + linkedHashSetM + ", useCases = " + ((List) hc2Var.f));
        ArrayList arrayList3 = new ArrayList(t72.u(linkedHashSetM, 10));
        Iterator it = linkedHashSetM.iterator();
        while (it.hasNext()) {
            arrayList3.add(((gf6) it.next()).a());
        }
        Iterator it2 = s72.j1(s72.n1(arrayList3)).iterator();
        do {
            int i3 = 1;
            if (!it2.hasNext()) {
                ng1 ng1Var = (ng1) this.b;
                vd9 vd9Var = new vd9(i3, linkedHashSetM);
                for (gf6 gf6Var : linkedHashSetM) {
                    if (!gf6Var.b(ng1Var, hc2Var)) {
                        b21.q("CameraInfoInternal", gf6Var + " is not supported.");
                        break;
                    }
                }
                try {
                    sfc.m(ng1Var, hc2Var, vd9Var);
                    return new hb5(new vd9(i3, linkedHashSetM));
                } catch (fk1 | IllegalArgumentException e2) {
                    if (!b21.F(3, "CameraInfoInternal")) {
                        break;
                    }
                    Log.d("CameraInfoInternal", "CameraInfoInternal.isResolvedFeatureGroupSupported failed", e2);
                    break;
                }
            }
            mb5 mb5Var = (mb5) it2.next();
            arrayList2 = new ArrayList();
            for (Object obj : linkedHashSetM) {
                if (((gf6) obj).a() == mb5Var) {
                    arrayList2.add(obj);
                }
            }
        } while (arrayList2.size() <= 1);
        return ib5.a;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0034  */
    @Override // defpackage.fm3
    public Object z(z12 z12Var, Object obj) {
        boolean z;
        z12 z12VarM0;
        boolean z2 = z12Var.T0;
        StringBuilder sb = (StringBuilder) obj;
        jz3 jz3Var = (jz3) this.b;
        jz3Var.getClass();
        jz3Var.p(sb, z12Var, null);
        mz3 mz3Var = jz3Var.a;
        if (mz3Var.x() || z12Var.O0().i() != e09.c) {
            rz3 visibility = z12Var.getVisibility();
            visibility.getClass();
            if (jz3Var.Y(visibility, sb)) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        jz3Var.A(z12Var, sb);
        a90 a90Var = mz3Var.P;
        wn7[] wn7VarArr = mz3.Z;
        wn7 wn7Var = wn7VarArr[40];
        a90Var.getClass();
        wn7Var.getClass();
        boolean z3 = ((Boolean) a90Var.b).booleanValue() || !z2 || z;
        if (z3) {
            sb.append(jz3Var.z("constructor"));
        }
        u09 u09VarP0 = z12Var.k();
        u09VarP0.getClass();
        if (mz3Var.y()) {
            if (z3) {
                sb.append(" ");
            }
            jz3Var.G(u09VarP0, sb, true);
            jz3Var.U(sb, z12Var.getTypeParameters(), false);
        }
        List listG = z12Var.G();
        listG.getClass();
        jz3Var.X(sb, listG, z12Var.t());
        a90 a90Var2 = mz3Var.q;
        wn7 wn7Var2 = wn7VarArr[15];
        a90Var2.getClass();
        wn7Var2.getClass();
        if (((Boolean) a90Var2.b).booleanValue() && !z2 && (z12VarM0 = u09VarP0.m0()) != null) {
            List listG2 = z12VarM0.G();
            listG2.getClass();
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : listG2) {
                xrf xrfVar = (xrf) obj2;
                if (!xrfVar.E0() && xrfVar.y == null) {
                    arrayList.add(obj2);
                }
            }
            if (!arrayList.isEmpty()) {
                sb.append(" : ");
                sb.append(jz3Var.z("this"));
                sb.append(s72.D0(arrayList, ", ", "(", ")", z03.f, 24));
            }
        }
        if (mz3Var.y()) {
            jz3Var.Z(sb, z12Var.getTypeParameters());
        }
        return wef.a;
    }

    public m6c(xd9 xd9Var) {
        this.a = 24;
        Map map = xd9Var.a;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), s72.l1((Collection) entry.getValue()));
        }
        this.b = linkedHashMap;
    }

    public m6c(boolean z) {
        this.a = 4;
        this.b = new AtomicBoolean(z);
    }

    public m6c(Resources resources) {
        this.a = 13;
        resources.getClass();
        this.b = resources;
    }

    public /* synthetic */ m6c(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public m6c(k9b k9bVar) {
        this.a = 19;
        this.b = new ssg(k9bVar);
    }

    public m6c(UUID uuid, int i, byte[] bArr, UUID[] uuidArr) {
        this.a = 27;
        this.b = uuid;
    }
}
