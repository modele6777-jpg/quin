package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Insets;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Icon;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.net.Uri;
import android.os.Build;
import android.os.ext.SdkExtensions;
import android.util.Log;
import android.util.Range;
import android.view.DisplayCutout;
import android.view.Surface;
import android.view.View;
import android.view.Window;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.EditorInfo;
import androidx.camera.camera2.compat.quirk.ControlZoomRatioRangeAssertionErrorQuirk;
import io.sentry.android.core.b1;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class p6 {
    public static Context a(Context context, String str) {
        return context.createAttributionContext(str);
    }

    public static Icon b(Uri uri) {
        return Icon.createWithAdaptiveBitmapContentUri(uri);
    }

    public static String c(Context context) {
        return context.getAttributionTag();
    }

    public static final Set d(CameraManager cameraManager) throws CameraAccessException {
        Set<Set<String>> concurrentCameraIds = cameraManager.getConcurrentCameraIds();
        concurrentCameraIds.getClass();
        return concurrentCameraIds;
    }

    public static final Range e(yg1 yg1Var) {
        Float f;
        Float fValueOf = Float.valueOf(1.0f);
        yg1Var.getClass();
        try {
            CameraCharacteristics.Key key = CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE;
            key.getClass();
            Range range = (Range) ((nc1) yg1Var).c(key);
            if (range == null) {
                if (b21.F(5, "CXCP")) {
                    b1.l("CXCP", "Failed to read CONTROL_ZOOM_RATIO_RANGE for " + ((Object) ig1.b(((nc1) yg1Var).a)) + '!');
                }
                return new Range(fValueOf, fValueOf);
            }
            Object lower = range.getLower();
            lower.getClass();
            float fFloatValue = ((Number) lower).floatValue();
            if (Math.abs(fFloatValue) >= ((double) Math.ulp(Math.abs(fFloatValue))) * 2.0d && ((Number) range.getLower()).floatValue() >= 0.0f) {
                f = (Float) range.getLower();
            } else {
                if (b21.F(5, "CXCP")) {
                    b1.l("CXCP", "Invalid lower zoom range detected: " + range.getLower());
                }
                f = fValueOf;
            }
            Object upper = range.getUpper();
            upper.getClass();
            float fFloatValue2 = ((Number) upper).floatValue();
            if (Math.abs(fFloatValue2) >= ((double) Math.ulp(Math.abs(fFloatValue2))) * 2.0d && ((Number) range.getUpper()).floatValue() >= 0.0f) {
                fValueOf = (Float) range.getUpper();
            } else if (b21.F(5, "CXCP")) {
                b1.l("CXCP", "Invalid upper zoom range detected: " + range.getUpper());
            }
            return new Range(f, fValueOf);
        } catch (AssertionError e) {
            if (s74.a().b(ControlZoomRatioRangeAssertionErrorQuirk.class) != null) {
                if (b21.F(3, "CXCP")) {
                    Log.d("CXCP", "Device is known to throw an exception while retrieving the value for CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE. CONTROL_ZOOM_RATIO_RANGE is not supported. [Manufacturer: " + Build.MANUFACTURER + ", Model: " + Build.MODEL + ", API Level: " + Build.VERSION.SDK_INT + "].");
                }
            } else if (b21.F(6, "CXCP")) {
                b1.e("CXCP", "Exception thrown while retrieving the value for CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE on devices not known to throw exceptions during this operation. Please file an issue at https://issuetracker.google.com/issues/new?component=618491&template=1257717 with this error message [Manufacturer: " + Build.MANUFACTURER + ", Model: " + Build.MODEL + ", API Level: " + Build.VERSION.SDK_INT + "]. CONTROL_ZOOM_RATIO_RANGE is not available.", e);
            }
            if (!b21.F(5, "CXCP")) {
                return null;
            }
            b1.n("CXCP", "AssertionError: failed to get CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE", e);
            return null;
        }
    }

    public static void f(int i) {
        SdkExtensions.getExtensionVersion(i);
    }

    public static CharSequence g(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getStateDescription();
    }

    public static String h(df dfVar) {
        if (dfVar instanceof cf) {
            return "image/*";
        }
        if (dfVar instanceof bf) {
            return null;
        }
        ap.c();
        return null;
    }

    public static Insets i(DisplayCutout displayCutout) {
        return displayCutout.getWaterfallInsets();
    }

    public static boolean j() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            return true;
        }
        return i >= 30 && SdkExtensions.getExtensionVersion(30) >= 2;
    }

    public static boolean k(Canvas canvas, float f, float f2, float f3, float f4) {
        return canvas.quickReject(f, f2, f3, f4);
    }

    public static boolean l(Canvas canvas, Path path) {
        return canvas.quickReject(path);
    }

    public static boolean m(Canvas canvas, RectF rectF) {
        return canvas.quickReject(rectF);
    }

    public static final void n(CameraDevice cameraDevice, int i) throws CameraAccessException {
        cameraDevice.setCameraAudioRestriction(i);
    }

    public static void o(Window window, boolean z) {
        View decorView = window.getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        decorView.setSystemUiVisibility(z ? systemUiVisibility & (-257) : systemUiVisibility | 256);
        window.setDecorFitsSystemWindows(z);
    }

    public static void p(Window window, boolean z) {
        window.setDecorFitsSystemWindows(z);
    }

    public static void q(View view) {
        view.setImportantForContentCapture(1);
    }

    public static void r(EditorInfo editorInfo, CharSequence charSequence) {
        editorInfo.setInitialSurroundingSubText(charSequence, 0);
    }

    public static void s(Outline outline, zt ztVar) {
        if (ztVar instanceof zt) {
            outline.setPath(ztVar.a);
        } else {
            s8f.i("Unable to obtain android.graphics.Path");
        }
    }

    public static void t(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
        accessibilityNodeInfo.setStateDescription(charSequence);
    }

    public static void u(Surface surface, float f) {
        try {
            surface.setFrameRate(f, f == 0.0f ? 0 : 1);
        } catch (IllegalStateException e) {
            xo1.y("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e);
        }
    }
}
