package io.sentry.compose.gestures;

import android.view.View;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.Owner;
import defpackage.c47;
import defpackage.cgg;
import defpackage.g79;
import defpackage.gxc;
import defpackage.hkb;
import defpackage.iy9;
import defpackage.j09;
import defpackage.n09;
import defpackage.p89;
import defpackage.uwc;
import defpackage.z7c;
import io.sentry.internal.debugmeta.c;
import io.sentry.internal.gestures.a;
import io.sentry.internal.gestures.b;
import io.sentry.o5;
import io.sentry.z0;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lio/sentry/compose/gestures/ComposeGestureTargetLocator;", "Lio/sentry/internal/gestures/a;", "Lio/sentry/z0;", "logger", "<init>", "(Lio/sentry/z0;)V", "sentry-compose_release"}, k = 1, mv = {1, 9, 0}, xi = z7c.f)
public final class ComposeGestureTargetLocator implements a {
    public final z0 a;
    public volatile c b;
    public final io.sentry.util.a c;

    public ComposeGestureTargetLocator(z0 z0Var) {
        z0Var.getClass();
        this.a = z0Var;
        this.c = new io.sentry.util.a();
        o5.d().b("maven:io.sentry:sentry-compose", "8.53.0");
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005a  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.sentry.internal.gestures.a
    public final io.sentry.internal.gestures.c a(View view, float f, float f2, b bVar) {
        String str;
        hkb hkbVar;
        long j;
        String strO;
        String str2;
        bVar.getClass();
        String str3 = null;
        if (!(view instanceof Owner)) {
            return null;
        }
        if (this.b == null) {
            io.sentry.util.a aVar = this.c;
            aVar.b();
            try {
                if (this.b == null) {
                    this.b = new c(this.a, 11);
                }
                cgg.t(aVar, null);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    cgg.t(aVar, th);
                    throw th2;
                }
            }
        }
        LayoutNode root = ((Owner) view).getRoot();
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.add(new iy9(root, null));
        String str4 = null;
        while (!arrayDeque.isEmpty()) {
            iy9 iy9Var = (iy9) arrayDeque.poll();
            if (iy9Var == null) {
                str = str3;
            } else {
                LayoutNode layoutNode = (LayoutNode) iy9Var.a();
                String str5 = (String) iy9Var.b();
                if (layoutNode.X()) {
                    c47 c47Var = (c47) layoutNode.V0.d;
                    c47 c47Var2 = (c47) root.V0.d;
                    float fL = (int) (c47Var2.l() >> 32);
                    float fL2 = (int) (c47Var2.l() & 4294967295L);
                    hkb hkbVarM = c47Var2.M(c47Var, true);
                    float f3 = hkbVarM.a;
                    if (f3 < 0.0f) {
                        f3 = 0.0f;
                    }
                    if (f3 > fL) {
                        f3 = fL;
                    }
                    str = str3;
                    float f4 = hkbVarM.b;
                    if (f4 < 0.0f) {
                        f4 = 0.0f;
                    }
                    if (f4 > fL2) {
                        f4 = fL2;
                    }
                    float f5 = hkbVarM.c;
                    if (f5 < 0.0f) {
                        f5 = 0.0f;
                    }
                    if (f5 <= fL) {
                        fL = f5;
                    }
                    float f6 = hkbVarM.d;
                    float f7 = f6 >= 0.0f ? f6 : 0.0f;
                    if (f7 <= fL2) {
                        fL2 = f7;
                    }
                    if (f3 == fL || f4 == fL2) {
                        hkbVar = hkb.e;
                        j = 4294967295L;
                    } else {
                        j = 4294967295L;
                        float f8 = f4;
                        long jC = c47Var2.c((((long) Float.floatToRawIntBits(f4)) & 4294967295L) | (((long) Float.floatToRawIntBits(f3)) << 32));
                        long jC2 = c47Var2.c((((long) Float.floatToRawIntBits(f8)) & 4294967295L) | (((long) Float.floatToRawIntBits(fL)) << 32));
                        long jC3 = c47Var2.c((((long) Float.floatToRawIntBits(fL2)) & 4294967295L) | (((long) Float.floatToRawIntBits(fL)) << 32));
                        long jC4 = c47Var2.c((((long) Float.floatToRawIntBits(fL2)) & 4294967295L) | (((long) Float.floatToRawIntBits(f3)) << 32));
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (jC >> 32));
                        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jC2 >> 32));
                        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jC4 >> 32));
                        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jC3 >> 32));
                        float fMin = Math.min(fIntBitsToFloat, Math.min(fIntBitsToFloat2, Math.min(fIntBitsToFloat3, fIntBitsToFloat4)));
                        float fMax = Math.max(fIntBitsToFloat, Math.max(fIntBitsToFloat2, Math.max(fIntBitsToFloat3, fIntBitsToFloat4)));
                        float fIntBitsToFloat5 = Float.intBitsToFloat((int) (jC & 4294967295L));
                        float fIntBitsToFloat6 = Float.intBitsToFloat((int) (jC2 & 4294967295L));
                        float fIntBitsToFloat7 = Float.intBitsToFloat((int) (jC4 & 4294967295L));
                        float fIntBitsToFloat8 = Float.intBitsToFloat((int) (jC3 & 4294967295L));
                        hkbVar = new hkb(fMin, Math.min(fIntBitsToFloat5, Math.min(fIntBitsToFloat6, Math.min(fIntBitsToFloat7, fIntBitsToFloat8))), fMax, Math.max(fIntBitsToFloat5, Math.max(fIntBitsToFloat6, Math.max(fIntBitsToFloat7, fIntBitsToFloat8))));
                    }
                    if (hkbVar.a((((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f2)) & j))) {
                        c cVar = this.b;
                        cVar.getClass();
                        List listD = layoutNode.D();
                        int size = listD.size();
                        int i = 0;
                        while (true) {
                            if (i >= size) {
                                strO = str;
                                break;
                            }
                            strO = cVar.o(((n09) listD.get(i)).a);
                            if (strO != null) {
                                break;
                            }
                            i++;
                        }
                        String str6 = strO == null ? str5 : strO;
                        if (str6 != null) {
                            List listD2 = layoutNode.D();
                            int size2 = listD2.size();
                            int i2 = 0;
                            while (i2 < size2) {
                                j09 j09Var = ((n09) listD2.get(i2)).a;
                                if (j09Var instanceof uwc) {
                                    Iterator it = ((uwc) j09Var).T0().iterator();
                                    while (it.hasNext()) {
                                        String str7 = ((gxc) ((Map.Entry) it.next()).getKey()).a;
                                        if (bVar == b.SCROLLABLE && "ScrollBy".equals(str7)) {
                                            return new io.sentry.internal.gestures.c(null, null, null, str6, "jetpack_compose");
                                        }
                                        if (bVar == b.CLICKABLE && "OnClick".equals(str7)) {
                                            str4 = str6;
                                        }
                                    }
                                } else {
                                    String name = j09Var.getClass().getName();
                                    if (bVar == b.CLICKABLE && ("androidx.compose.foundation.ClickableElement".equals(name) || "androidx.compose.foundation.CombinedClickableElement".equals(name))) {
                                        str4 = str6;
                                        str2 = str4;
                                    } else if (bVar == b.SCROLLABLE && ("androidx.compose.foundation.ScrollingLayoutElement".equals(name) || "androidx.compose.foundation.ScrollingContainerElement".equals(name))) {
                                        return new io.sentry.internal.gestures.c(null, null, null, str6, "jetpack_compose");
                                    }
                                    i2++;
                                    str6 = str2;
                                }
                                str2 = str6;
                                i2++;
                                str6 = str2;
                            }
                        }
                        String str8 = str6;
                        g79 g79Var = (g79) layoutNode.K().f();
                        int i3 = ((p89) g79Var.b).c;
                        for (int i4 = 0; i4 < i3; i4++) {
                            arrayDeque.add(new iy9(g79Var.get(i4), str8));
                        }
                    } else {
                        continue;
                    }
                } else {
                    str = str3;
                }
            }
            str3 = str;
        }
        return str4 == null ? str3 : new io.sentry.internal.gestures.c(null, null, null, str4, "jetpack_compose");
    }
}
