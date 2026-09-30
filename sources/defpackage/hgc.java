package defpackage;

import android.app.Activity;
import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.app.job.JobScheduler;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.credentials.Credential;
import android.credentials.GetCredentialException;
import android.credentials.GetCredentialResponse;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraExtensionCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.ExtensionSessionConfiguration;
import android.hardware.camera2.params.OutputConfiguration;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.text.GraphemeClusterSegmentFinder;
import android.text.Layout;
import android.text.SegmentFinder;
import android.view.SurfaceView;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.DeleteGesture;
import android.view.inputmethod.DeleteRangeGesture;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InsertGesture;
import android.view.inputmethod.JoinOrSplitGesture;
import android.view.inputmethod.PreviewableHandwritingGesture;
import android.view.inputmethod.RemoveSpaceGesture;
import android.view.inputmethod.SelectGesture;
import android.view.inputmethod.SelectRangeGesture;
import android.widget.TextView;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import io.sentry.android.core.b1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class hgc {
    public static final String[] a = {"screenshot", "screen shot", "screen_shot", "screen-shot", "screencapture", "screen_capture", "screen-capture", "截图", "截屏", "屏幕截图", "スクリーンショット", "스크린샷"};

    public static final boolean A(Uri uri) {
        Object next;
        if (pa7.t(uri.getScheme(), "content") && pa7.t(uri.getAuthority(), "media")) {
            List<String> pathSegments = uri.getPathSegments();
            pathSegments.getClass();
            Iterator it = t72.B(pathSegments).iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                int iIntValue = ((Number) next).intValue();
                if (pa7.t(pathSegments.get(iIntValue), "images") && pa7.t(s72.y0(iIntValue + 1, pathSegments), "media")) {
                    break;
                }
            }
            Integer num = (Integer) next;
            if (num != null) {
                int iIntValue2 = num.intValue() + 2;
                String str = (String) s72.y0(iIntValue2, pathSegments);
                if ((str != null ? c5e.E(str) : null) != null && iIntValue2 == pathSegments.size() - 1) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean B(CameraExtensionCharacteristics cameraExtensionCharacteristics, int i) {
        return cameraExtensionCharacteristics.isPostviewAvailable(i);
    }

    public static boolean C(AccessibilityManager accessibilityManager) {
        return accessibilityManager.isRequestFromAccessibilityTool();
    }

    public static final boolean D(yg1 yg1Var) {
        yg1Var.getClass();
        CameraCharacteristics.Key key = CameraCharacteristics.CONTROL_AVAILABLE_SETTINGS_OVERRIDES;
        key.getClass();
        int[] iArr = (int[]) ((nc1) yg1Var).c(key);
        return iArr != null && qd0.T(iArr, 1);
    }

    public static final Long E(Cursor cursor, String str) {
        int columnIndex = cursor.getColumnIndex(str);
        Integer numValueOf = Integer.valueOf(columnIndex);
        if (columnIndex < 0 || cursor.isNull(columnIndex)) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return Long.valueOf(cursor.getLong(numValueOf.intValue()));
        }
        return null;
    }

    public static final void F(lmb lmbVar, lmb lmbVar2, x48 x48Var, int i, ContentResolver contentResolver, imb imbVar, LinkedHashSet linkedHashSet, vx7 vx7Var, Uri uri, int i2) {
        if (uri != null) {
            Uri uri2 = A(uri) ? uri : null;
            if (uri2 == null) {
                return;
            }
            long j = lmbVar.element;
            long j2 = lmbVar2.element;
            boolean z = ((a58) x48Var.k()).i.compareTo(g48.e) >= 0;
            o48 o48VarH = vpf.H(x48Var);
            js3 js3Var = ga4.a;
            ynb.V(o48VarH, hr3.c, null, new egc(i, uri2, j, i2, z, contentResolver, imbVar, j2, lmbVar2, x48Var, linkedHashSet, vx7Var, null), 2);
        }
    }

    public static final void G(imb imbVar, Activity activity, Activity.ScreenCaptureCallback screenCaptureCallback) {
        if (imbVar.element) {
            return;
        }
        try {
            activity.registerScreenCaptureCallback(activity.getMainExecutor(), screenCaptureCallback);
            imbVar.element = true;
        } catch (SecurityException unused) {
        }
    }

    public static final void H(imb imbVar, Activity activity, Activity.ScreenCaptureCallback screenCaptureCallback) {
        if (imbVar.element) {
            try {
                activity.unregisterScreenCaptureCallback(screenCaptureCallback);
            } catch (Exception unused) {
            } finally {
                imbVar.element = false;
            }
        }
    }

    public static final n25 I(x16 x16Var, x16 x16Var2, h48 h48Var) {
        xm0 xm0Var = new xm0(5, x16Var, x16Var2);
        h48Var.a(xm0Var);
        if (((a58) h48Var).i.compareTo(g48.d) >= 0) {
            x16Var.invoke();
        }
        return new n25((Object) h48Var, (Object) xm0Var, x16Var2, 28);
    }

    public static final ColorSpace J(p82 p82Var) {
        if (pa7.t(p82Var, s82.v)) {
            return ColorSpace.get(ColorSpace.Named.BT2020_HLG);
        }
        if (pa7.t(p82Var, s82.w)) {
            return ColorSpace.get(ColorSpace.Named.BT2020_PQ);
        }
        return null;
    }

    public static final void K(CameraCaptureSession.CaptureCallback captureCallback, CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j, long j2) {
        captureCallback.onReadoutStarted(cameraCaptureSession, captureRequest, j, j2);
    }

    public static void L(long j, k00 k00Var, boolean z, ckb ckbVar) {
        if (z) {
            j = vd0.I(j, k00Var);
        }
        int i = (int) (4294967295L & j);
        ckbVar.d(new dh6(new vs4[]{new a3d(i, i), new iw3(eue.e(j), 0)}));
    }

    public static int M(r38 r38Var, HandwritingGesture handwritingGesture, cre creVar, rvf rvfVar, ckb ckbVar) {
        int i;
        tte tteVarD;
        tte tteVarD2;
        k00 k00Var = r38Var.j;
        if (k00Var == null) {
            return 3;
        }
        tte tteVarD3 = r38Var.d();
        if (!k00Var.equals(tteVarD3 != null ? tteVarD3.a.a.a : null)) {
            return 3;
        }
        int i2 = 1;
        if (handwritingGesture instanceof SelectGesture) {
            SelectGesture selectGesture = (SelectGesture) handwritingGesture;
            long jA0 = vd0.a0(r38Var, ynb.m0(selectGesture.getSelectionArea()), selectGesture.getGranularity() == 1 ? 1 : 0);
            if (eue.d(jA0)) {
                return i(selectGesture, ckbVar);
            }
            ckbVar.d(new a3d((int) (jA0 >> 32), (int) (jA0 & 4294967295L)));
            if (creVar != null) {
                creVar.e(true);
                return 1;
            }
        } else {
            if (handwritingGesture instanceof DeleteGesture) {
                DeleteGesture deleteGesture = (DeleteGesture) handwritingGesture;
                int i3 = deleteGesture.getGranularity() != 1 ? 0 : 1;
                long jA1 = vd0.a0(r38Var, ynb.m0(deleteGesture.getDeletionArea()), i3);
                if (eue.d(jA1)) {
                    return i(deleteGesture, ckbVar);
                }
                L(jA1, k00Var, i3 == 1, ckbVar);
                return 1;
            }
            if (!(handwritingGesture instanceof SelectRangeGesture)) {
                if (handwritingGesture instanceof DeleteRangeGesture) {
                    DeleteRangeGesture deleteRangeGesture = (DeleteRangeGesture) handwritingGesture;
                    int i4 = deleteRangeGesture.getGranularity() != 1 ? 0 : 1;
                    long jC0 = vd0.c0(r38Var, ynb.m0(deleteRangeGesture.getDeletionStartArea()), ynb.m0(deleteRangeGesture.getDeletionEndArea()), i4);
                    if (eue.d(jC0)) {
                        return i(deleteRangeGesture, ckbVar);
                    }
                    L(jC0, k00Var, i4 == 1, ckbVar);
                    return 1;
                }
                if (handwritingGesture instanceof JoinOrSplitGesture) {
                    JoinOrSplitGesture joinOrSplitGesture = (JoinOrSplitGesture) handwritingGesture;
                    if (rvfVar == null) {
                        return i(joinOrSplitGesture, ckbVar);
                    }
                    long jZ0 = vd0.z0(joinOrSplitGesture.getJoinOrSplitPoint());
                    tte tteVarD4 = r38Var.d();
                    int iW = tteVarD4 != null ? vd0.W(tteVarD4.a.b, jZ0, r38Var.c(), rvfVar) : -1;
                    if (iW == -1 || ((tteVarD2 = r38Var.d()) != null && vd0.e0(tteVarD2.a, iW))) {
                        return i(joinOrSplitGesture, ckbVar);
                    }
                    long jN0 = vd0.n0(k00Var, iW);
                    if (!eue.d(jN0)) {
                        L(jN0, k00Var, false, ckbVar);
                        return 1;
                    }
                    int i5 = (int) (jN0 >> 32);
                    ckbVar.d(new dh6(new vs4[]{new a3d(i5, i5), new ba2(" ", 1)}));
                    return 1;
                }
                if (handwritingGesture instanceof InsertGesture) {
                    InsertGesture insertGesture = (InsertGesture) handwritingGesture;
                    if (rvfVar == null) {
                        return i(insertGesture, ckbVar);
                    }
                    long jZ1 = vd0.z0(insertGesture.getInsertionPoint());
                    tte tteVarD5 = r38Var.d();
                    int iW2 = tteVarD5 != null ? vd0.W(tteVarD5.a.b, jZ1, r38Var.c(), rvfVar) : -1;
                    if (iW2 == -1 || ((tteVarD = r38Var.d()) != null && vd0.e0(tteVarD.a, iW2))) {
                        return i(insertGesture, ckbVar);
                    }
                    ckbVar.d(new dh6(new vs4[]{new a3d(iW2, iW2), new ba2(insertGesture.getTextToInsert(), 1)}));
                    return 1;
                }
                if (!(handwritingGesture instanceof RemoveSpaceGesture)) {
                    return 2;
                }
                RemoveSpaceGesture removeSpaceGesture = (RemoveSpaceGesture) handwritingGesture;
                tte tteVarD6 = r38Var.d();
                long jZ = vd0.Z(tteVarD6 != null ? tteVarD6.a : null, vd0.z0(removeSpaceGesture.getStartPoint()), vd0.z0(removeSpaceGesture.getEndPoint()), r38Var.c(), rvfVar);
                if (eue.d(jZ)) {
                    return i(removeSpaceGesture, ckbVar);
                }
                kmb kmbVar = new kmb();
                kmbVar.element = -1;
                kmb kmbVar2 = new kmb();
                kmbVar2.element = -1;
                String strI = new rob("\\s+").i(u3c.i(jZ, k00Var), new ch6(kmbVar, kmbVar2, i2));
                int i6 = kmbVar.element;
                if (i6 == -1 || (i = kmbVar2.element) == -1) {
                    return i(removeSpaceGesture, ckbVar);
                }
                int i7 = (int) (jZ >> 32);
                ckbVar.d(new dh6(new vs4[]{new a3d(i7 + i6, i7 + i), new ba2(strI.substring(i6, strI.length() - (eue.e(jZ) - kmbVar2.element)), 1)}));
                return 1;
            }
            SelectRangeGesture selectRangeGesture = (SelectRangeGesture) handwritingGesture;
            long jC1 = vd0.c0(r38Var, ynb.m0(selectRangeGesture.getSelectionStartArea()), ynb.m0(selectRangeGesture.getSelectionEndArea()), selectRangeGesture.getGranularity() == 1 ? 1 : 0);
            if (eue.d(jC1)) {
                return i(selectRangeGesture, ckbVar);
            }
            ckbVar.d(new a3d((int) (jC1 >> 32), (int) (jC1 & 4294967295L)));
            if (creVar != null) {
                creVar.e(true);
            }
        }
        return 1;
    }

    public static int N(z2f z2fVar, HandwritingGesture handwritingGesture, ute uteVar, x16 x16Var, rvf rvfVar) {
        int i;
        ste steVarC;
        int i2 = 0;
        if (handwritingGesture instanceof SelectGesture) {
            SelectGesture selectGesture = (SelectGesture) handwritingGesture;
            long jB0 = vd0.b0(uteVar, ynb.m0(selectGesture.getSelectionArea()), selectGesture.getGranularity() == 1 ? 1 : 0);
            if (eue.d(jB0)) {
                return h(z2fVar, selectGesture);
            }
            z2fVar.j(jB0);
            if (x16Var != null) {
                x16Var.invoke();
                return 1;
            }
        } else {
            if (handwritingGesture instanceof DeleteGesture) {
                DeleteGesture deleteGesture = (DeleteGesture) handwritingGesture;
                i2 = deleteGesture.getGranularity() == 1 ? 1 : 0;
                long jB1 = vd0.b0(uteVar, ynb.m0(deleteGesture.getDeletionArea()), i2);
                if (eue.d(jB1)) {
                    return h(z2fVar, deleteGesture);
                }
                if (i2 == 1) {
                    jB1 = vd0.I(jB1, z2fVar.d());
                }
                z2f.i(z2fVar, "", jB1, false, false, 28);
                return 1;
            }
            if (!(handwritingGesture instanceof SelectRangeGesture)) {
                if (handwritingGesture instanceof DeleteRangeGesture) {
                    DeleteRangeGesture deleteRangeGesture = (DeleteRangeGesture) handwritingGesture;
                    i2 = deleteRangeGesture.getGranularity() == 1 ? 1 : 0;
                    long jD0 = vd0.d0(uteVar, ynb.m0(deleteRangeGesture.getDeletionStartArea()), ynb.m0(deleteRangeGesture.getDeletionEndArea()), i2);
                    if (eue.d(jD0)) {
                        return h(z2fVar, deleteRangeGesture);
                    }
                    if (i2 == 1) {
                        jD0 = vd0.I(jD0, z2fVar.d());
                    }
                    z2f.i(z2fVar, "", jD0, false, false, 28);
                    return 1;
                }
                if (handwritingGesture instanceof JoinOrSplitGesture) {
                    JoinOrSplitGesture joinOrSplitGesture = (JoinOrSplitGesture) handwritingGesture;
                    if (z2fVar.a.d() != z2fVar.a.d()) {
                        return 3;
                    }
                    long jZ0 = vd0.z0(joinOrSplitGesture.getJoinOrSplitPoint());
                    ste steVarC2 = uteVar.c();
                    int iW = steVarC2 != null ? vd0.W(steVarC2.b, jZ0, uteVar.e(), rvfVar) : -1;
                    if (iW == -1 || ((steVarC = uteVar.c()) != null && vd0.e0(steVarC, iW))) {
                        return h(z2fVar, joinOrSplitGesture);
                    }
                    long jN0 = vd0.n0(z2fVar.d(), iW);
                    if (eue.d(jN0)) {
                        z2f.i(z2fVar, " ", jN0, false, false, 28);
                        return 1;
                    }
                    z2f.i(z2fVar, "", jN0, false, false, 28);
                    return 1;
                }
                if (handwritingGesture instanceof InsertGesture) {
                    InsertGesture insertGesture = (InsertGesture) handwritingGesture;
                    long jZ1 = vd0.z0(insertGesture.getInsertionPoint());
                    ste steVarC3 = uteVar.c();
                    int iW2 = steVarC3 != null ? vd0.W(steVarC3.b, jZ1, uteVar.e(), rvfVar) : -1;
                    if (iW2 == -1) {
                        return h(z2fVar, insertGesture);
                    }
                    z2f.i(z2fVar, insertGesture.getTextToInsert(), u3c.b(iW2, iW2), false, false, 28);
                    return 1;
                }
                if (!(handwritingGesture instanceof RemoveSpaceGesture)) {
                    return 2;
                }
                RemoveSpaceGesture removeSpaceGesture = (RemoveSpaceGesture) handwritingGesture;
                long jZ = vd0.Z(uteVar.c(), vd0.z0(removeSpaceGesture.getStartPoint()), vd0.z0(removeSpaceGesture.getEndPoint()), uteVar.e(), rvfVar);
                if (eue.d(jZ)) {
                    return h(z2fVar, removeSpaceGesture);
                }
                kmb kmbVar = new kmb();
                kmbVar.element = -1;
                kmb kmbVar2 = new kmb();
                kmbVar2.element = -1;
                String strI = new rob("\\s+").i(u3c.i(jZ, z2fVar.d()), new ch6(kmbVar, kmbVar2, i2));
                int i3 = kmbVar.element;
                if (i3 == -1 || (i = kmbVar2.element) == -1) {
                    return h(z2fVar, removeSpaceGesture);
                }
                int i4 = (int) (jZ >> 32);
                z2f.i(z2fVar, strI.substring(kmbVar.element, strI.length() - (eue.e(jZ) - kmbVar2.element)), u3c.b(i3 + i4, i4 + i), false, false, 28);
                return 1;
            }
            SelectRangeGesture selectRangeGesture = (SelectRangeGesture) handwritingGesture;
            long jD1 = vd0.d0(uteVar, ynb.m0(selectRangeGesture.getSelectionStartArea()), ynb.m0(selectRangeGesture.getSelectionEndArea()), selectRangeGesture.getGranularity() == 1 ? 1 : 0);
            if (eue.d(jD1)) {
                return h(z2fVar, selectRangeGesture);
            }
            z2fVar.j(jD1);
            if (x16Var != null) {
                x16Var.invoke();
            }
        }
        return 1;
    }

    public static boolean O(r38 r38Var, PreviewableHandwritingGesture previewableHandwritingGesture, cre creVar, CancellationSignal cancellationSignal) {
        k00 k00Var = r38Var.j;
        if (k00Var != null) {
            tte tteVarD = r38Var.d();
            if (k00Var.equals(tteVarD != null ? tteVarD.a.a.a : null)) {
                boolean z = previewableHandwritingGesture instanceof SelectGesture;
                ug6 ug6Var = ug6.a;
                if (z) {
                    SelectGesture selectGesture = (SelectGesture) previewableHandwritingGesture;
                    if (creVar != null) {
                        long jA0 = vd0.a0(r38Var, ynb.m0(selectGesture.getSelectionArea()), selectGesture.getGranularity() != 1 ? 0 : 1);
                        r38 r38Var2 = creVar.d;
                        if (r38Var2 != null) {
                            r38Var2.f(jA0);
                        }
                        r38 r38Var3 = creVar.d;
                        if (r38Var3 != null) {
                            r38Var3.e(eue.b);
                        }
                        if (!eue.d(jA0)) {
                            creVar.u(false);
                            creVar.r(ug6Var);
                        }
                    }
                } else if (previewableHandwritingGesture instanceof DeleteGesture) {
                    DeleteGesture deleteGesture = (DeleteGesture) previewableHandwritingGesture;
                    if (creVar != null) {
                        long jA1 = vd0.a0(r38Var, ynb.m0(deleteGesture.getDeletionArea()), deleteGesture.getGranularity() != 1 ? 0 : 1);
                        r38 r38Var4 = creVar.d;
                        if (r38Var4 != null) {
                            r38Var4.e(jA1);
                        }
                        r38 r38Var5 = creVar.d;
                        if (r38Var5 != null) {
                            r38Var5.f(eue.b);
                        }
                        if (!eue.d(jA1)) {
                            creVar.u(false);
                            creVar.r(ug6Var);
                        }
                    }
                } else if (previewableHandwritingGesture instanceof SelectRangeGesture) {
                    SelectRangeGesture selectRangeGesture = (SelectRangeGesture) previewableHandwritingGesture;
                    if (creVar != null) {
                        long jC0 = vd0.c0(r38Var, ynb.m0(selectRangeGesture.getSelectionStartArea()), ynb.m0(selectRangeGesture.getSelectionEndArea()), selectRangeGesture.getGranularity() != 1 ? 0 : 1);
                        r38 r38Var6 = creVar.d;
                        if (r38Var6 != null) {
                            r38Var6.f(jC0);
                        }
                        r38 r38Var7 = creVar.d;
                        if (r38Var7 != null) {
                            r38Var7.e(eue.b);
                        }
                        if (!eue.d(jC0)) {
                            creVar.u(false);
                            creVar.r(ug6Var);
                        }
                    }
                } else if (previewableHandwritingGesture instanceof DeleteRangeGesture) {
                    DeleteRangeGesture deleteRangeGesture = (DeleteRangeGesture) previewableHandwritingGesture;
                    if (creVar != null) {
                        long jC1 = vd0.c0(r38Var, ynb.m0(deleteRangeGesture.getDeletionStartArea()), ynb.m0(deleteRangeGesture.getDeletionEndArea()), deleteRangeGesture.getGranularity() != 1 ? 0 : 1);
                        r38 r38Var8 = creVar.d;
                        if (r38Var8 != null) {
                            r38Var8.e(jC1);
                        }
                        r38 r38Var9 = creVar.d;
                        if (r38Var9 != null) {
                            r38Var9.f(eue.b);
                        }
                        if (!eue.d(jC1)) {
                            creVar.u(false);
                            creVar.r(ug6Var);
                        }
                    }
                }
                if (cancellationSignal != null) {
                    cancellationSignal.setOnCancelListener(new hf2(2, creVar));
                }
                return true;
            }
        }
        return false;
    }

    public static boolean P(z2f z2fVar, PreviewableHandwritingGesture previewableHandwritingGesture, ute uteVar, CancellationSignal cancellationSignal) {
        int i = 1;
        if (previewableHandwritingGesture instanceof SelectGesture) {
            SelectGesture selectGesture = (SelectGesture) previewableHandwritingGesture;
            x(z2fVar, vd0.b0(uteVar, ynb.m0(selectGesture.getSelectionArea()), selectGesture.getGranularity() != 1 ? 0 : 1), 0);
        } else if (previewableHandwritingGesture instanceof DeleteGesture) {
            DeleteGesture deleteGesture = (DeleteGesture) previewableHandwritingGesture;
            x(z2fVar, vd0.b0(uteVar, ynb.m0(deleteGesture.getDeletionArea()), deleteGesture.getGranularity() == 1 ? 1 : 0), 1);
        } else if (previewableHandwritingGesture instanceof SelectRangeGesture) {
            SelectRangeGesture selectRangeGesture = (SelectRangeGesture) previewableHandwritingGesture;
            x(z2fVar, vd0.d0(uteVar, ynb.m0(selectRangeGesture.getSelectionStartArea()), ynb.m0(selectRangeGesture.getSelectionEndArea()), selectRangeGesture.getGranularity() != 1 ? 0 : 1), 0);
        } else {
            if (!(previewableHandwritingGesture instanceof DeleteRangeGesture)) {
                return false;
            }
            DeleteRangeGesture deleteRangeGesture = (DeleteRangeGesture) previewableHandwritingGesture;
            x(z2fVar, vd0.d0(uteVar, ynb.m0(deleteRangeGesture.getDeletionStartArea()), ynb.m0(deleteRangeGesture.getDeletionEndArea()), deleteRangeGesture.getGranularity() == 1 ? 1 : 0), 1);
        }
        if (cancellationSignal != null) {
            cancellationSignal.setOnCancelListener(new hf2(i, z2fVar));
        }
        return true;
    }

    public static void Q(PendingIntent pendingIntent) {
        try {
            ActivityOptions activityOptionsMakeBasic = ActivityOptions.makeBasic();
            if (Build.VERSION.SDK_INT >= 36) {
                activityOptionsMakeBasic.setPendingIntentBackgroundActivityStartMode(4);
            } else {
                activityOptionsMakeBasic.setPendingIntentBackgroundActivityStartMode(1);
            }
            pendingIntent.send(activityOptionsMakeBasic.toBundle());
        } catch (PendingIntent.CanceledException e) {
            b1.d("TextClassification", "error sending pendingIntent: " + pendingIntent + " error: " + e);
        }
    }

    public static void R(AccessibilityEvent accessibilityEvent, boolean z) {
        accessibilityEvent.setAccessibilityDataSensitive(z);
    }

    public static void S(AccessibilityNodeInfo accessibilityNodeInfo, boolean z) {
        accessibilityNodeInfo.setAccessibilityDataSensitive(z);
    }

    public static void T(EditorInfo editorInfo) {
        editorInfo.setSupportedHandwritingGestures(t72.I(SelectGesture.class, DeleteGesture.class, SelectRangeGesture.class, DeleteRangeGesture.class, JoinOrSplitGesture.class, InsertGesture.class, RemoveSpaceGesture.class));
        editorInfo.setSupportedHandwritingGesturePreviews(qd0.I0(new Class[]{SelectGesture.class, DeleteGesture.class, SelectRangeGesture.class, DeleteRangeGesture.class}));
    }

    public static void U(TextView textView, int i, float f) {
        textView.setLineHeight(i, f);
    }

    public static final void V(ExtensionSessionConfiguration extensionSessionConfiguration, OutputConfiguration outputConfiguration) {
        extensionSessionConfiguration.setPostviewOutputConfiguration(outputConfiguration);
    }

    public static final void W(LinkedHashMap linkedHashMap) {
        linkedHashMap.put(CaptureRequest.CONTROL_SETTINGS_OVERRIDE, 1);
    }

    public static void X(SurfaceView surfaceView) {
        surfaceView.setSurfaceLifecycle(2);
    }

    public static final String Y(Cursor cursor, String str) {
        int columnIndex = cursor.getColumnIndex(str);
        Integer numValueOf = Integer.valueOf(columnIndex);
        if (columnIndex < 0 || cursor.isNull(columnIndex)) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return cursor.getString(numValueOf.intValue());
        }
        return null;
    }

    public static final void a(String str, String str2, x16 x16Var, l46 l46Var, int i) {
        int i2;
        x48 x48Var;
        x16Var.getClass();
        l46Var.h0(-1178386436);
        if ((i & 48) == 0) {
            i2 = (l46Var.g(str2) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | (l46Var.i(x16Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
        if (l46Var.W(i3 & 1, (i3 & 147) != 146)) {
            Context context = (Context) l46Var.k(uq.b);
            x48 x48Var2 = (x48) l46Var.k(cb8.a);
            e89 e89VarI = q1c.i(x16Var, l46Var);
            boolean zI = l46Var.i(context) | l46Var.i(x48Var2) | ((i3 & 112) == 32) | l46Var.g(e89VarI);
            Object objR = l46Var.R();
            if (zI || objR == sf2.a) {
                x48Var = x48Var2;
                kf kfVar = new kf(context, x48Var, str, str2, e89VarI, 22);
                l46Var.p0(kfVar);
                objR = kfVar;
            } else {
                x48Var = x48Var2;
            }
            af1.i(x48Var, str, str2, (a26) objR, l46Var);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new s48(i, str, str2, x16Var, 12);
        }
    }

    public static final void b(CursorAnchorInfo.Builder builder, ste steVar, hkb hkbVar) {
        if (hkbVar.h()) {
            return;
        }
        b59 b59Var = steVar.b;
        int i = b59Var.f - 1;
        if (i < 0) {
            i = 0;
        }
        int iO = mh3.o(b59Var.e(hkbVar.b), 0, i);
        int iO2 = mh3.o(b59Var.e(hkbVar.d), 0, i);
        if (iO > iO2) {
            return;
        }
        while (true) {
            builder.addVisibleLineBounds(steVar.h(iO), b59Var.f(iO), steVar.i(iO), b59Var.b(iO));
            if (iO == iO2) {
                return;
            } else {
                iO++;
            }
        }
    }

    public static final void c(CursorAnchorInfo.Builder builder, ste steVar, hkb hkbVar) {
        if (hkbVar.h()) {
            return;
        }
        b59 b59Var = steVar.b;
        int i = b59Var.f - 1;
        if (i < 0) {
            i = 0;
        }
        int iO = mh3.o(b59Var.e(hkbVar.b), 0, i);
        int iO2 = mh3.o(b59Var.e(hkbVar.d), 0, i);
        if (iO > iO2) {
            return;
        }
        while (true) {
            builder.addVisibleLineBounds(steVar.h(iO), b59Var.f(iO), steVar.i(iO), b59Var.b(iO));
            if (iO == iO2) {
                return;
            } else {
                iO++;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002c  */
    public static final Long d(igc igcVar) {
        Long lValueOf = igcVar.d;
        Long l = null;
        if (lValueOf != null) {
            long jLongValue = lValueOf.longValue();
            if (jLongValue <= 0) {
                lValueOf = null;
            } else if (jLongValue < 100000000000L) {
                if (jLongValue > 9223372036854775L) {
                    lValueOf = null;
                } else {
                    lValueOf = Long.valueOf(jLongValue * 1000);
                }
            }
        } else {
            lValueOf = null;
        }
        Long l2 = igcVar.e;
        if (l2 != null && l2.longValue() > 0) {
            l = l2;
        }
        return (Long) s72.I0(qd0.k0(new Long[]{lValueOf, l}));
    }

    public static Context e(Context context, int i) {
        return context.createDeviceContext(i);
    }

    public static b76 f(Intent intent) {
        intent.getClass();
        GetCredentialException getCredentialException = (GetCredentialException) intent.getSerializableExtra("android.service.credentials.extra.GET_CREDENTIAL_EXCEPTION", GetCredentialException.class);
        if (getCredentialException == null) {
            return null;
        }
        String type = getCredentialException.getType();
        type.getClass();
        return t72.b0(getCredentialException.getMessage(), type);
    }

    public static f76 g(Intent intent) {
        intent.getClass();
        GetCredentialResponse getCredentialResponse = (GetCredentialResponse) intent.getParcelableExtra("android.service.credentials.extra.GET_CREDENTIAL_RESPONSE", GetCredentialResponse.class);
        if (getCredentialResponse == null) {
            return null;
        }
        Credential credential = getCredentialResponse.getCredential();
        credential.getClass();
        String type = credential.getType();
        type.getClass();
        Bundle data = credential.getData();
        data.getClass();
        return new f76(g21.G(type, data));
    }

    public static int h(z2f z2fVar, HandwritingGesture handwritingGesture) {
        use useVar = z2fVar.a;
        u47 u47Var = z2fVar.b;
        useVar.b.a().v();
        une uneVar = useVar.b;
        uneVar.x = null;
        z2fVar.l(uneVar);
        useVar.b(u47Var, true, fpe.a);
        useVar.g(true);
        useVar.f(useVar.b.e);
        String fallbackText = handwritingGesture.getFallbackText();
        if (fallbackText == null) {
            return 3;
        }
        z2f.h(z2fVar, fallbackText, false, false, 28);
        return 5;
    }

    public static int i(HandwritingGesture handwritingGesture, ckb ckbVar) {
        String fallbackText = handwritingGesture.getFallbackText();
        if (fallbackText == null) {
            return 3;
        }
        ckbVar.d(new ba2(fallbackText, 1));
        return 5;
    }

    public static JobScheduler j(JobScheduler jobScheduler) {
        JobScheduler jobSchedulerForNamespace = jobScheduler.forNamespace("androidx.work.systemjobscheduler");
        jobSchedulerForNamespace.getClass();
        return jobSchedulerForNamespace;
    }

    public static AccessibilityNodeInfo.AccessibilityAction k() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_IN_DIRECTION;
    }

    public static float l(VelocityTracker velocityTracker, int i) {
        return velocityTracker.getAxisVelocity(i);
    }

    public static void m(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect) {
        accessibilityNodeInfo.getBoundsInWindow(rect);
    }

    public static CharSequence n(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getContainerTitle();
    }

    public static int o(Context context) {
        context.getClass();
        return context.getDeviceId();
    }

    public static int p(Context context) {
        return context.getDeviceId();
    }

    public static int[] q(qte qteVar, RectF rectF, int i, final i1 i1Var) {
        SegmentFinder graphemeClusterSegmentFinder;
        if (i == 1) {
            graphemeClusterSegmentFinder = new t60(new vea(22, qteVar.f.getText(), qteVar.l()));
        } else {
            graphemeClusterSegmentFinder = new GraphemeClusterSegmentFinder(qteVar.f.getText(), qteVar.a);
        }
        return qteVar.f.getRangeForRect(rectF, graphemeClusterSegmentFinder, new Layout.TextInclusionStrategy() { // from class: ss
            @Override // android.text.Layout.TextInclusionStrategy
            public final boolean isSegmentInside(RectF rectF2, RectF rectF3) {
                return ((Boolean) i1Var.z(rectF2, rectF3)).booleanValue();
            }
        });
    }

    public static float r(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHandwritingGestureLineMargin();
    }

    public static float s(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHandwritingSlop();
    }

    public static int t(ViewConfiguration viewConfiguration, int i, int i2, int i3) {
        return viewConfiguration.getScaledMaximumFlingVelocity(i, i2, i3);
    }

    public static int u(ViewConfiguration viewConfiguration, int i, int i2, int i3) {
        return viewConfiguration.getScaledMinimumFlingVelocity(i, i2, i3);
    }

    public static boolean v(Bitmap bitmap) {
        return bitmap.hasGainmap();
    }

    public static final boolean w(igc igcVar, Uri uri) {
        ArrayList<String> arrayList = (ArrayList) qd0.k0(new String[]{igcVar.a, igcVar.b, igcVar.c, uri.getPath()});
        if (!arrayList.isEmpty()) {
            for (String str : arrayList) {
                Locale locale = Locale.ROOT;
                locale.getClass();
                String lowerCase = str.toLowerCase(locale);
                lowerCase.getClass();
                for (int i = 0; i < 12; i++) {
                    if (v4e.F(lowerCase, a[i], false)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static void x(z2f z2fVar, long j, int i) {
        boolean zD = eue.d(j);
        fpe fpeVar = fpe.a;
        if (zD) {
            use useVar = z2fVar.a;
            u47 u47Var = z2fVar.b;
            useVar.b.a().v();
            une uneVar = useVar.b;
            uneVar.x = null;
            z2fVar.l(uneVar);
            useVar.b(u47Var, true, fpeVar);
            useVar.g(true);
            useVar.f(useVar.b.e);
            return;
        }
        long jE = z2fVar.e(j);
        use useVar2 = z2fVar.a;
        u47 u47Var2 = z2fVar.b;
        useVar2.b.a().v();
        une uneVar2 = useVar2.b;
        int i2 = (int) (jE >> 32);
        int i3 = (int) (jE & 4294967295L);
        q0a q0aVar = uneVar2.c;
        if (i2 >= i3) {
            qc0.j(ks0.k("Do not set reversed or empty range: ", i2, " > ", i3));
            return;
        }
        uneVar2.x = new iy9(new dte(i), new eue(u3c.b(mh3.o(i2, 0, q0aVar.length()), mh3.o(i3, 0, q0aVar.length()))));
        useVar2.b(u47Var2, true, fpeVar);
        useVar2.g(true);
        useVar2.f(useVar2.b.e);
    }

    public static boolean y(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isAccessibilityDataSensitive();
    }

    public static final boolean z(CameraExtensionCharacteristics cameraExtensionCharacteristics, int i) {
        return cameraExtensionCharacteristics.isCaptureProcessProgressAvailable(i);
    }
}
