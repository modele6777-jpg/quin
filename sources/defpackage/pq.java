package defpackage;

import android.view.View;
import android.view.translation.ViewTranslationCallback;
import androidx.compose.ui.platform.AndroidComposeView;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class pq implements ViewTranslationCallback {
    public static final pq a = new pq();

    public final boolean onClearTranslation(View view) {
        x16 x16Var;
        view.getClass();
        zq contentCaptureManager = ((AndroidComposeView) view).getContentCaptureManager();
        contentCaptureManager.getClass();
        contentCaptureManager.e = vq.a;
        u67 u67VarC = contentCaptureManager.c();
        Object[] objArr = u67VarC.c;
        long[] jArr = u67VarC.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        w79 w79Var = ((axc) objArr[(i << 3) + i3]).a.d.a;
                        Object objG = w79Var.g(cxc.E);
                        if (objG == null) {
                            objG = null;
                        }
                        if (objG != null) {
                            Object objG2 = w79Var.g(swc.n);
                            f6 f6Var = (f6) (objG2 != null ? objG2 : null);
                            if (f6Var != null && (x16Var = (x16) f6Var.b) != null) {
                            }
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return true;
                }
            }
            if (i == length) {
                return true;
            }
            i++;
        }
    }

    public final boolean onHideTranslation(View view) {
        a26 a26Var;
        view.getClass();
        zq contentCaptureManager = ((AndroidComposeView) view).getContentCaptureManager();
        contentCaptureManager.getClass();
        contentCaptureManager.e = vq.a;
        u67 u67VarC = contentCaptureManager.c();
        Object[] objArr = u67VarC.c;
        long[] jArr = u67VarC.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        w79 w79Var = ((axc) objArr[(i << 3) + i3]).a.d.a;
                        Object objG = w79Var.g(cxc.E);
                        if (objG == null) {
                            objG = null;
                        }
                        if (pa7.t(objG, Boolean.TRUE)) {
                            Object objG2 = w79Var.g(swc.m);
                            f6 f6Var = (f6) (objG2 != null ? objG2 : null);
                            if (f6Var != null && (a26Var = (a26) f6Var.b) != null) {
                            }
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return true;
                }
            }
            if (i == length) {
                return true;
            }
            i++;
        }
    }

    public final boolean onShowTranslation(View view) {
        a26 a26Var;
        view.getClass();
        zq contentCaptureManager = ((AndroidComposeView) view).getContentCaptureManager();
        contentCaptureManager.getClass();
        contentCaptureManager.e = vq.b;
        u67 u67VarC = contentCaptureManager.c();
        Object[] objArr = u67VarC.c;
        long[] jArr = u67VarC.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        w79 w79Var = ((axc) objArr[(i << 3) + i3]).a.d.a;
                        Object objG = w79Var.g(cxc.E);
                        if (objG == null) {
                            objG = null;
                        }
                        if (pa7.t(objG, Boolean.FALSE)) {
                            Object objG2 = w79Var.g(swc.m);
                            f6 f6Var = (f6) (objG2 != null ? objG2 : null);
                            if (f6Var != null && (a26Var = (a26) f6Var.b) != null) {
                            }
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return true;
                }
            }
            if (i == length) {
                return true;
            }
            i++;
        }
    }
}
