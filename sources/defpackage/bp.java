package defpackage;

import android.app.Activity;
import android.app.ForegroundServiceStartNotAllowedException;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.ImageDecoder;
import android.graphics.Insets;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.graphics.drawable.Drawable;
import android.graphics.text.MeasuredText;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.media.ImageWriter;
import android.media.MediaCodecInfo;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Process;
import android.os.Trace;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.view.inspector.WindowInspector;
import android.widget.ImageButton;
import android.widget.PopupWindow;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.work.impl.foreground.SystemForegroundService;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import io.sentry.android.core.b1;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class bp {
    public static void A(Context context) {
        boolean z;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        if (hkg.x0(context).getBoolean("proxy_notification_initialized", false)) {
            return;
        }
        try {
            Context applicationContext = context.getApplicationContext();
            PackageManager packageManager = applicationContext.getPackageManager();
            z = (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(applicationContext.getPackageName(), UserMetadata.MAX_ROLLOUT_ASSIGNMENTS)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_notification_delegation_enabled")) ? true : applicationInfo.metaData.getBoolean("firebase_messaging_notification_delegation_enabled");
        } catch (PackageManager.NameNotFoundException unused) {
        }
        if (Build.VERSION.SDK_INT < 29) {
            Tasks.d(null);
            return;
        }
        gle gleVar = new gle();
        try {
            if (Binder.getCallingUid() == context.getApplicationInfo().uid) {
                SharedPreferences.Editor editorEdit = hkg.x0(context).edit();
                editorEdit.putBoolean("proxy_notification_initialized", true);
                editorEdit.apply();
                NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
                if (z) {
                    notificationManager.setNotificationDelegate("com.google.android.gms");
                } else if ("com.google.android.gms".equals(notificationManager.getNotificationDelegate())) {
                    notificationManager.setNotificationDelegate(null);
                }
            } else {
                b1.d("FirebaseMessaging", "error configuring notification delegate for package " + context.getPackageName());
            }
        } finally {
            gleVar.c(null);
        }
    }

    public static boolean B() {
        return Trace.isEnabled();
    }

    public static boolean C(Context context) {
        if (Build.VERSION.SDK_INT >= 29) {
            if (Binder.getCallingUid() != context.getApplicationInfo().uid) {
                b1.d("FirebaseMessaging", "error retrieving notification delegate for package " + context.getPackageName());
                return false;
            }
            if ("com.google.android.gms".equals(((NotificationManager) context.getSystemService(NotificationManager.class)).getNotificationDelegate())) {
                if (!Log.isLoggable("FirebaseMessaging", 3)) {
                    return true;
                }
                Log.d("FirebaseMessaging", "GMS core is set for proxying");
                return true;
            }
        } else if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Platform doesn't support proxying.");
        }
        return false;
    }

    public static Object D(int i) {
        switch (kv2.B(i)) {
            case 0:
                return BlendMode.CLEAR;
            case 1:
                return BlendMode.SRC;
            case 2:
                return BlendMode.DST;
            case 3:
                return BlendMode.SRC_OVER;
            case 4:
                return BlendMode.DST_OVER;
            case 5:
                return BlendMode.SRC_IN;
            case 6:
                return BlendMode.DST_IN;
            case 7:
                return BlendMode.SRC_OUT;
            case 8:
                return BlendMode.DST_OUT;
            case 9:
                return BlendMode.SRC_ATOP;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                return BlendMode.DST_ATOP;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                return BlendMode.XOR;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                return BlendMode.PLUS;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                return BlendMode.MODULATE;
            case 14:
                return BlendMode.SCREEN;
            case 15:
                return BlendMode.OVERLAY;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                return BlendMode.DARKEN;
            case 17:
                return BlendMode.LIGHTEN;
            case 18:
                return BlendMode.COLOR_DODGE;
            case 19:
                return BlendMode.COLOR_BURN;
            case 20:
                return BlendMode.HARD_LIGHT;
            case 21:
                return BlendMode.SOFT_LIGHT;
            case 22:
                return BlendMode.DIFFERENCE;
            case 23:
                return BlendMode.EXCLUSION;
            case 24:
                return BlendMode.MULTIPLY;
            case 25:
                return BlendMode.HUE;
            case 26:
                return BlendMode.SATURATION;
            case 27:
                return BlendMode.COLOR;
            case 28:
                return BlendMode.LUMINOSITY;
            default:
                return null;
        }
    }

    public static Insets E(int i, int i2, int i3, int i4) {
        return Insets.of(i, i2, i3, i4);
    }

    public static void F(Resources.Theme theme) {
        theme.rebase();
    }

    public static final void G(Activity activity, kva.a aVar) {
        activity.registerActivityLifecycleCallbacks(aVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0073, code lost:
    
        if (defpackage.feg.u(r9, r9) == 0) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.content.Intent H(android.content.Context r9, android.content.BroadcastReceiver r10, android.content.IntentFilter r11, java.lang.String r12, int r13) {
        /*
            r0 = r13 & 2
            r1 = 0
            if (r0 != 0) goto L10
            r2 = r13 & 4
            if (r2 == 0) goto La
            goto L10
        La:
            java.lang.String r9 = "One of either RECEIVER_EXPORTED or RECEIVER_NOT_EXPORTED is required"
            defpackage.qc0.j(r9)
            return r1
        L10:
            if (r0 == 0) goto L1d
            r0 = r13 & 4
            if (r0 != 0) goto L17
            goto L1d
        L17:
            java.lang.String r9 = "Cannot specify both RECEIVER_EXPORTED and RECEIVER_NOT_EXPORTED"
            defpackage.qc0.j(r9)
            return r1
        L1d:
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 33
            r7 = 0
            if (r0 < r2) goto L2e
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r8 = r13
            android.content.Intent r9 = r3.registerReceiver(r4, r5, r6, r7, r8)
            return r9
        L2e:
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r8 = r13
            r9 = r8 & 4
            if (r9 == 0) goto L87
            if (r6 != 0) goto L87
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            android.content.Context r10 = r3.getApplicationContext()
            java.lang.String r10 = r10.getPackageName()
            r9.append(r10)
            java.lang.String r10 = ".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION"
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            int r11 = defpackage.feg.u(r3, r9)
            if (r11 == 0) goto L82
            r11 = 29
            if (r0 < r11) goto L76
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r11 = r3.getOpPackageName()
            r9.append(r11)
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            int r10 = defpackage.feg.u(r3, r9)
            if (r10 != 0) goto L76
            goto L82
        L76:
            java.lang.String r10 = "Permission "
            java.lang.String r11 = " is required by your application to receive broadcasts, please add it to your manifest"
            java.lang.String r9 = defpackage.ib8.j(r10, r9, r11)
            defpackage.ho7.n(r9)
            return r1
        L82:
            android.content.Intent r9 = r3.registerReceiver(r4, r5, r9, r7)
            return r9
        L87:
            r8 = 0
            android.content.Intent r9 = r3.registerReceiver(r4, r5, r6, r7, r8)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bp.H(android.content.Context, android.content.BroadcastReceiver, android.content.IntentFilter, java.lang.String, int):android.content.Intent");
    }

    public static void I(Notification.Builder builder, boolean z) {
        builder.setAllowSystemGeneratedContextualActions(z);
    }

    public static void J(AudioAttributes.Builder builder) {
        builder.setAllowedCapturePolicy(1);
    }

    public static void K(Paint paint, Object obj) {
        paint.setBlendMode((BlendMode) obj);
    }

    public static void L(Notification.Builder builder) {
        builder.setBubbleMetadata(null);
    }

    public static void M(Notification.Action.Builder builder) {
        builder.setContextual(false);
    }

    public static void N(int i, String str) {
        Trace.setCounter(str, i);
    }

    public static void O(z80 z80Var, Rect rect) {
        z80Var.setEpicenterBounds(rect);
    }

    public static void P(AudioAttributes.Builder builder) {
        builder.setHapticChannelsMuted(true);
    }

    public static void Q(z80 z80Var) {
        z80Var.setIsClippedToScreen(true);
    }

    public static void R(PopupWindow popupWindow) {
        popupWindow.setTouchModal(false);
    }

    public static void S(SystemForegroundService systemForegroundService, int i, Notification notification, int i2) {
        systemForegroundService.startForeground(i, notification, i2);
    }

    public static void T(SystemForegroundService systemForegroundService, int i, Notification notification, int i2) {
        try {
            systemForegroundService.startForeground(i, notification, i2);
        } catch (ForegroundServiceStartNotAllowedException e) {
            ff8 ff8VarH = ff8.h();
            String str = SystemForegroundService.e;
            if (ff8VarH.b <= 5) {
                b1.n(str, "Unable to start foreground service", e);
            }
        } catch (SecurityException e2) {
            ff8 ff8VarH2 = ff8.h();
            String str2 = SystemForegroundService.e;
            if (ff8VarH2.b <= 5) {
                b1.n(str2, "Unable to start foreground service", e2);
            }
        }
    }

    public static final BlendMode U(int i) {
        if (i == 0) {
            return BlendMode.CLEAR;
        }
        if (i == 1) {
            return BlendMode.SRC;
        }
        if (i == 2) {
            return BlendMode.DST;
        }
        if (i == 3) {
            return BlendMode.SRC_OVER;
        }
        if (i == 4) {
            return BlendMode.DST_OVER;
        }
        if (i == 5) {
            return BlendMode.SRC_IN;
        }
        if (i == 6) {
            return BlendMode.DST_IN;
        }
        if (i == 7) {
            return BlendMode.SRC_OUT;
        }
        if (i == 8) {
            return BlendMode.DST_OUT;
        }
        if (i == 9) {
            return BlendMode.SRC_ATOP;
        }
        if (i == 10) {
            return BlendMode.DST_ATOP;
        }
        if (i == 11) {
            return BlendMode.XOR;
        }
        if (i == 12) {
            return BlendMode.PLUS;
        }
        if (i == 13) {
            return BlendMode.MODULATE;
        }
        if (i == 14) {
            return BlendMode.SCREEN;
        }
        if (i == 15) {
            return BlendMode.OVERLAY;
        }
        if (i == 16) {
            return BlendMode.DARKEN;
        }
        if (i == 17) {
            return BlendMode.LIGHTEN;
        }
        if (i == 18) {
            return BlendMode.COLOR_DODGE;
        }
        if (i == 19) {
            return BlendMode.COLOR_BURN;
        }
        if (i == 20) {
            return BlendMode.HARD_LIGHT;
        }
        if (i == 21) {
            return BlendMode.SOFT_LIGHT;
        }
        if (i == 22) {
            return BlendMode.DIFFERENCE;
        }
        if (i == 23) {
            return BlendMode.EXCLUSION;
        }
        if (i == 24) {
            return BlendMode.MULTIPLY;
        }
        if (i == 25) {
            return BlendMode.HUE;
        }
        if (i == 26) {
            return BlendMode.SATURATION;
        }
        if (i == 27) {
            return BlendMode.COLOR;
        }
        return i == 28 ? BlendMode.LUMINOSITY : BlendMode.SRC_OVER;
    }

    public static final BlendMode V(int i) {
        if (i == 0) {
            return BlendMode.CLEAR;
        }
        if (i == 27) {
            return BlendMode.COLOR;
        }
        if (i == 19) {
            return BlendMode.COLOR_BURN;
        }
        if (i == 18) {
            return BlendMode.COLOR_DODGE;
        }
        if (i == 16) {
            return BlendMode.DARKEN;
        }
        if (i == 22) {
            return BlendMode.DIFFERENCE;
        }
        if (i == 2) {
            return BlendMode.DST;
        }
        if (i == 10) {
            return BlendMode.DST_ATOP;
        }
        if (i == 6) {
            return BlendMode.DST_IN;
        }
        if (i == 8) {
            return BlendMode.DST_OUT;
        }
        if (i == 4) {
            return BlendMode.DST_OVER;
        }
        if (i == 23) {
            return BlendMode.EXCLUSION;
        }
        if (i == 20) {
            return BlendMode.HARD_LIGHT;
        }
        if (i == 25) {
            return BlendMode.HUE;
        }
        if (i == 17) {
            return BlendMode.LIGHTEN;
        }
        if (i == 28) {
            return BlendMode.LUMINOSITY;
        }
        if (i == 13) {
            return BlendMode.MODULATE;
        }
        if (i == 24) {
            return BlendMode.MULTIPLY;
        }
        if (i == 15) {
            return BlendMode.OVERLAY;
        }
        if (i == 26) {
            return BlendMode.SATURATION;
        }
        if (i == 14) {
            return BlendMode.SCREEN;
        }
        if (i == 21) {
            return BlendMode.SOFT_LIGHT;
        }
        if (i == 1) {
            return BlendMode.SRC;
        }
        if (i == 9) {
            return BlendMode.SRC_ATOP;
        }
        if (i == 5) {
            return BlendMode.SRC_IN;
        }
        if (i == 7) {
            return BlendMode.SRC_OUT;
        }
        return i == 3 ? BlendMode.SRC_OVER : BlendMode.SRC_IN;
    }

    public static final ImageDecoder.Source W(ax6 ax6Var, as9 as9Var, boolean z) {
        e1a e1aVarE0;
        if (ax6Var.getFileSystem() == zd5.a && (e1aVarE0 = ax6Var.E0()) != null) {
            return ImageDecoder.createSource(e1aVarE0.toFile());
        }
        urg urgVarK = ax6Var.k();
        if (urgVarK instanceof re0) {
            return ImageDecoder.createSource(as9Var.a.getAssets(), ((re0) urgVarK).S);
        }
        if ((urgVarK instanceof vm2) && Build.VERSION.SDK_INT >= 29) {
            try {
                AssetFileDescriptor assetFileDescriptor = ((vm2) urgVarK).S;
                Os.lseek(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), OsConstants.SEEK_SET);
                return ImageDecoder.createSource(new uh2(5, assetFileDescriptor));
            } catch (ErrnoException unused) {
                return null;
            }
        }
        if (urgVarK instanceof dyb) {
            dyb dybVar = (dyb) urgVarK;
            if (dybVar.S.equals(as9Var.a.getPackageName())) {
                return ImageDecoder.createSource(as9Var.a.getResources(), dybVar.T);
            }
        }
        if (!(urgVarK instanceof j61)) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 30 || !z || ((j61) urgVarK).S.isDirect()) {
            return ImageDecoder.createSource(((j61) urgVarK).S);
        }
        return null;
    }

    public static final PorterDuff.Mode X(int i) {
        if (i == 0) {
            return PorterDuff.Mode.CLEAR;
        }
        if (i == 1) {
            return PorterDuff.Mode.SRC;
        }
        if (i == 2) {
            return PorterDuff.Mode.DST;
        }
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 4) {
            return PorterDuff.Mode.DST_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 6) {
            return PorterDuff.Mode.DST_IN;
        }
        if (i == 7) {
            return PorterDuff.Mode.SRC_OUT;
        }
        if (i == 8) {
            return PorterDuff.Mode.DST_OUT;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        if (i == 10) {
            return PorterDuff.Mode.DST_ATOP;
        }
        if (i == 11) {
            return PorterDuff.Mode.XOR;
        }
        if (i == 12) {
            return PorterDuff.Mode.ADD;
        }
        if (i == 14) {
            return PorterDuff.Mode.SCREEN;
        }
        if (i == 15) {
            return PorterDuff.Mode.OVERLAY;
        }
        if (i == 16) {
            return PorterDuff.Mode.DARKEN;
        }
        if (i == 17) {
            return PorterDuff.Mode.LIGHTEN;
        }
        return i == 13 ? PorterDuff.Mode.MULTIPLY : PorterDuff.Mode.SRC_OVER;
    }

    public static final void Y(long j, String str) {
        if (Build.VERSION.SDK_INT >= 29) {
            Trace.setCounter(str, j);
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0040  */
    public static int a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        boolean z;
        int i3;
        List<MediaCodecInfo.VideoCapabilities.PerformancePoint> supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints();
        if (supportedPerformancePoints != null && !supportedPerformancePoints.isEmpty()) {
            fv.j();
            MediaCodecInfo.VideoCapabilities.PerformancePoint performancePoint = new MediaCodecInfo.VideoCapabilities.PerformancePoint(i, i2, (int) d);
            int i4 = 0;
            while (true) {
                z = true;
                if (i4 >= supportedPerformancePoints.size()) {
                    i3 = 1;
                    break;
                }
                if (ho7.c(supportedPerformancePoints.get(i4)).covers(performancePoint)) {
                    i3 = 2;
                    break;
                }
                i4++;
            }
            if (i3 == 1 && vfh.C == null) {
                int i5 = Build.VERSION.SDK_INT;
                if (i5 >= 37) {
                    z = false;
                } else {
                    int iR = r(true);
                    if (i5 < 35 ? !(r(false) != 2 || iR == 1) : iR != 1) {
                        z = false;
                    }
                }
                vfh.C = Boolean.valueOf(z);
                if (z) {
                }
            }
            return i3;
        }
        return 0;
    }

    public static void b(int i, String str) {
        Trace.beginAsyncSection(str, i);
    }

    public static int c(Context context, String str) {
        if (str == null) {
            r82.g("permission must be non-null");
            return 0;
        }
        if (Build.VERSION.SDK_INT >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        }
        return new nh9(context).b.areNotificationsEnabled() ? 0 : -1;
    }

    public static final boolean d(View view) {
        IBinder windowToken;
        int i;
        View viewFindViewById;
        view.getClass();
        if (Build.VERSION.SDK_INT < 29 || !view.isAttachedToWindow() || (windowToken = view.getWindowToken()) == null) {
            return false;
        }
        Resources resources = view.getResources();
        int identifier = resources.getIdentifier("floating_popup_container", "id", "android");
        int identifier2 = resources.getIdentifier("overflow", "id", "android");
        int identifier3 = resources.getIdentifier("floating_toolbar_close_overflow_description", "string", "android");
        if (identifier != 0 && identifier2 != 0 && identifier3 != 0) {
            CharSequence text = resources.getText(identifier3);
            text.getClass();
            for (View view2 : WindowInspector.getGlobalWindowViews()) {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
                if (layoutParams2 != null && pa7.t(layoutParams2.token, windowToken) && 1000 <= (i = layoutParams2.type) && i < 2000 && view2.isAttachedToWindow() && view2.isShown() && (viewFindViewById = view2.findViewById(identifier)) != null && pa7.t(viewFindViewById.getTag(), "floating_toolbar")) {
                    View viewFindViewById2 = viewFindViewById.findViewById(identifier2);
                    ImageButton imageButton = viewFindViewById2 instanceof ImageButton ? (ImageButton) viewFindViewById2 : null;
                    if (imageButton != null && imageButton.isShown() && imageButton.isEnabled() && imageButton.isClickable() && pa7.t(imageButton.getContentDescription(), text)) {
                        return imageButton.performClick();
                    }
                }
            }
        }
        return false;
    }

    public static ColorFilter e(int i, Object obj) {
        return new BlendModeColorFilter(i, (BlendMode) obj);
    }

    public static void f(Canvas canvas) {
        canvas.disableZ();
    }

    public static void g(w4d w4dVar, sn4 sn4Var, r0a r0aVar, bx6 bx6Var) {
        w4dVar.getClass();
        float f = r0aVar.b;
        float f2 = r0aVar.a;
        int i = r0aVar.e;
        float f3 = r0aVar.c;
        bx6Var.getClass();
        if (w4dVar.equals(u4d.a)) {
            float f4 = f3 / 2.0f;
            sn4.w0(sn4Var, abg.c(i), f4, ynb.p(f2 + f4, f + f4), null, 120);
            return;
        }
        if (w4dVar.equals(u4d.b)) {
            sn4.y0(sn4Var, abg.c(i), ynb.p(f2, f), dec.a(f3, r0aVar.d), 0.0f, null, 0, 120);
            return;
        }
        if (w4dVar instanceof v4d) {
            v4d v4dVar = (v4d) w4dVar;
            hu2 hu2Var = v4dVar.a;
            if (hu2Var instanceof qmb) {
                Drawable drawable = (Drawable) bx6Var.a.get(Integer.valueOf(((qmb) hu2Var).a));
                if (drawable == null) {
                    return;
                }
                vl1 vl1VarP = sn4Var.v0().p();
                if (v4dVar.b) {
                    if (Build.VERSION.SDK_INT >= 29) {
                        fv.i();
                        drawable.setColorFilter(new BlendModeColorFilter(i, BlendMode.SRC_IN));
                    } else {
                        drawable.setColorFilter(i, PorterDuff.Mode.SRC_IN);
                    }
                } else if (v4dVar.c) {
                    drawable.setAlpha(r0aVar.i);
                }
                int i2 = (int) (v4dVar.d * f3);
                int i3 = (int) ((f3 - i2) / 2.0f);
                int i4 = (int) f;
                int i5 = (int) f2;
                drawable.setBounds(i5, i3 + i4, ((int) f3) + i5, i3 + i2 + i4);
                drawable.draw(mp.b(vl1VarP));
            }
        }
    }

    public static void h(Canvas canvas, int i, BlendMode blendMode) {
        canvas.drawColor(i, blendMode);
    }

    public static void i(Canvas canvas, long j) {
        canvas.drawColor(j);
    }

    public static void j(Canvas canvas, long j, BlendMode blendMode) {
        canvas.drawColor(j, blendMode);
    }

    public static void k(Canvas canvas, RectF rectF, float f, float f2, RectF rectF2, float f3, float f4, Paint paint) {
        canvas.drawDoubleRoundRect(rectF, f, f2, rectF2, f3, f4, paint);
    }

    public static void l(Canvas canvas, RectF rectF, float[] fArr, RectF rectF2, float[] fArr2, Paint paint) {
        canvas.drawDoubleRoundRect(rectF, fArr, rectF2, fArr2, paint);
    }

    public static void m(Canvas canvas, RenderNode renderNode) {
        canvas.drawRenderNode(renderNode);
    }

    public static void n(Canvas canvas, MeasuredText measuredText, int i, int i2, int i3, int i4, float f, float f2, boolean z, Paint paint) {
        canvas.drawTextRun(measuredText, i, i2, i3, i4, f, f2, z, paint);
    }

    public static void o(Canvas canvas) {
        canvas.enableZ();
    }

    public static void p(Canvas canvas, boolean z) {
        if (z) {
            canvas.enableZ();
        } else {
            canvas.disableZ();
        }
    }

    public static void q(int i, String str) {
        Trace.endAsyncSection(str, i);
    }

    public static int r(boolean z) {
        List<MediaCodecInfo.VideoCapabilities.PerformancePoint> supportedPerformancePoints;
        try {
            qr5 qr5Var = new qr5();
            qr5Var.o = qv8.l("video/avc");
            rr5 rr5Var = new rr5(qr5Var);
            if (rr5Var.p != null) {
                yob yobVarG = ap8.g(rr5Var, z, false);
                for (int i = 0; i < yobVarG.d; i++) {
                    MediaCodecInfo.VideoCapabilities videoCapabilities = ((to8) yobVarG.get(i)).d.getVideoCapabilities();
                    if (videoCapabilities != null && (supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints()) != null && !supportedPerformancePoints.isEmpty()) {
                        fv.j();
                        MediaCodecInfo.VideoCapabilities.PerformancePoint performancePoint = new MediaCodecInfo.VideoCapabilities.PerformancePoint(1280, 720, 60);
                        for (int i2 = 0; i2 < supportedPerformancePoints.size(); i2++) {
                            if (ho7.c(supportedPerformancePoints.get(i2)).covers(performancePoint)) {
                                return 2;
                            }
                        }
                        return 1;
                    }
                }
            }
        } catch (yo8 unused) {
        }
        return 0;
    }

    public static ColorStateList s(Context context, int i) {
        ColorStateList colorStateListA;
        ColorStateList colorStateList;
        fyb fybVar;
        Resources resources = context.getResources();
        Resources.Theme theme = context.getTheme();
        gyb gybVar = new gyb(resources, theme);
        synchronized (hyb.c) {
            try {
                SparseArray sparseArray = (SparseArray) hyb.b.get(gybVar);
                colorStateListA = null;
                if (sparseArray == null || sparseArray.size() <= 0 || (fybVar = (fyb) sparseArray.get(i)) == null) {
                    colorStateList = null;
                } else {
                    if (fybVar.b.equals(resources.getConfiguration())) {
                        if (theme != null || fybVar.c != 0) {
                            if (theme == null || fybVar.c != theme.hashCode()) {
                            }
                        }
                        colorStateList = fybVar.a;
                    }
                    sparseArray.remove(i);
                    colorStateList = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (colorStateList != null) {
            return colorStateList;
        }
        ThreadLocal threadLocal = hyb.a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        resources.getValue(i, typedValue, true);
        int i2 = typedValue.type;
        if (i2 < 28 || i2 > 31) {
            try {
                colorStateListA = t82.a(resources, resources.getXml(i), theme);
            } catch (Exception e) {
                b1.n("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e);
            }
        }
        if (colorStateListA == null) {
            return resources.getColorStateList(i, theme);
        }
        synchronized (hyb.c) {
            try {
                WeakHashMap weakHashMap = hyb.b;
                SparseArray sparseArray2 = (SparseArray) weakHashMap.get(gybVar);
                if (sparseArray2 == null) {
                    sparseArray2 = new SparseArray();
                    weakHashMap.put(gybVar, sparseArray2);
                }
                sparseArray2.append(i, new fyb(colorStateListA, gybVar.a.getConfiguration(), theme));
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return colorStateListA;
    }

    public static yob t(xi0 xi0Var) {
        dy6 dy6VarM = jy6.m();
        gff it = bj0.h.keySet().iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            int iIntValue = num.intValue();
            if (Build.VERSION.SDK_INT >= pqf.o(iIntValue) && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(iIntValue).setSampleRate(48000).build(), xi0Var.a())) {
                dy6VarM.b(num);
            }
        }
        dy6VarM.b(2);
        return dy6VarM.g();
    }

    public static int u(int i, int i2, xi0 xi0Var) {
        for (int i3 = 10; i3 > 0; i3--) {
            int iP = pqf.p(i3);
            if (iP != 0 && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i).setSampleRate(i2).setChannelMask(iP).build(), xi0Var.a())) {
                return i3;
            }
        }
        return 0;
    }

    public static String v(Context context) {
        return context.getOpPackageName();
    }

    public static int w(AccessibilityManager accessibilityManager, int i, int i2) {
        return accessibilityManager.getRecommendedTimeoutMillis(i, i2);
    }

    public static final void x(Paint paint, CharSequence charSequence, int i, int i2, Rect rect) {
        paint.getTextBounds(charSequence, i, i2, rect);
    }

    public static final long y(AndroidComposeView androidComposeView) {
        return androidComposeView.getUniqueDrawingId();
    }

    public static final ImageWriter z(int i, Surface surface) {
        ImageWriter imageWriterNewInstance = ImageWriter.newInstance(surface, 1, i);
        imageWriterNewInstance.getClass();
        return imageWriterNewInstance;
    }
}
