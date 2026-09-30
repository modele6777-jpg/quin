package defpackage;

import android.app.Notification;
import android.app.job.JobParameters;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.NinePatch;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.graphics.fonts.Font;
import android.hardware.camera2.CameraExtensionCharacteristics;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.InputConfiguration;
import android.media.AudioDescriptor;
import android.media.CamcorderProfile;
import android.media.EncoderProfiles;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.net.NetworkRequest;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.LongSparseArray;
import android.view.Display;
import android.view.DisplayCutout;
import android.view.RoundedCorner;
import android.view.View;
import android.view.translation.TranslationRequestValue;
import android.view.translation.TranslationResponseValue;
import android.view.translation.ViewTranslationRequest;
import android.view.translation.ViewTranslationResponse;
import android.widget.EdgeEffect;
import androidx.work.impl.background.systemjob.SystemJobService;
import com.adjust.sdk.sig.r3;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeSet;
import java.util.function.Consumer;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class xq {
    public static void A(View view, nqb nqbVar) {
        view.setRenderEffect(nqbVar != null ? nqbVar.a() : null);
    }

    public static final String B(zq5 zq5Var, Context context) {
        List list = zq5Var.a;
        ww3 ww3VarB = z7f.b(context);
        int i = (Build.VERSION.SDK_INT < 31 || context.getResources().getConfiguration().fontWeightAdjustment == Integer.MAX_VALUE) ? 0 : context.getResources().getConfiguration().fontWeightAdjustment;
        if (i == 0) {
            return k88.a(list, null, new zea(ww3VarB), 31);
        }
        if (list.size() > 0) {
            list.get(0).getClass();
            r3.f();
            return null;
        }
        return ((Object) (!list.isEmpty() ? "," : "")) + "'wght' " + mh3.n(i + 400.0f, 1.0f, 1000.0f);
    }

    public static int[] C(NetworkRequest networkRequest) {
        networkRequest.getClass();
        int[] transportTypes = networkRequest.getTransportTypes();
        transportTypes.getClass();
        return transportTypes;
    }

    public static int[] a(NetworkRequest networkRequest) {
        networkRequest.getClass();
        int[] capabilities = networkRequest.getCapabilities();
        capabilities.getClass();
        return capabilities;
    }

    public static EdgeEffect b(Context context) {
        try {
            return new EdgeEffect(context, null);
        } catch (Throwable unused) {
            return new EdgeEffect(context);
        }
    }

    public static RenderEffect c(float f, float f2, int i) {
        return (f == 0.0f && f2 == 0.0f) ? RenderEffect.createOffsetEffect(0.0f, 0.0f) : RenderEffect.createBlurEffect(f, f2, jgb.h0(i));
    }

    public static void d(Context context, te9 te9Var) {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            telephonyManager.getClass();
            re9 re9Var = new re9(te9Var);
            telephonyManager.registerTelephonyCallback(te9Var.a, re9Var);
            telephonyManager.unregisterTelephonyCallback(re9Var);
        } catch (RuntimeException unused) {
            te9Var.c(5);
        }
    }

    public static void e(zq zqVar, LongSparseArray longSparseArray) {
        TranslationResponseValue value;
        CharSequence text;
        axc axcVar;
        ywc ywcVar;
        a26 a26Var;
        int size = longSparseArray.size();
        for (int i = 0; i < size; i++) {
            long jKeyAt = longSparseArray.keyAt(i);
            ViewTranslationResponse viewTranslationResponse = (ViewTranslationResponse) longSparseArray.get(jKeyAt);
            if (viewTranslationResponse != null && (value = viewTranslationResponse.getValue("android:text")) != null && (text = value.getText()) != null && (axcVar = (axc) zqVar.c().b((int) jKeyAt)) != null && (ywcVar = axcVar.a) != null) {
                Object objG = ywcVar.d.a.g(swc.l);
                if (objG == null) {
                    objG = null;
                }
                f6 f6Var = (f6) objG;
                if (f6Var != null && (a26Var = (a26) f6Var.b) != null) {
                }
            }
        }
    }

    public static void f(Canvas canvas, int[] iArr, int i, float[] fArr, int i2, int i3, Font font, Paint paint) {
        canvas.drawGlyphs(iArr, i, fArr, i2, i3, font, paint);
    }

    public static void g(Canvas canvas, NinePatch ninePatch, Rect rect, Paint paint) {
        canvas.drawPatch(ninePatch, rect, paint);
    }

    public static void h(Canvas canvas, NinePatch ninePatch, RectF rectF, Paint paint) {
        canvas.drawPatch(ninePatch, rectF, paint);
    }

    public static to0 i(EncoderProfiles encoderProfiles) {
        int defaultDurationSeconds = encoderProfiles.getDefaultDurationSeconds();
        int recommendedFileFormat = encoderProfiles.getRecommendedFileFormat();
        List<EncoderProfiles.AudioProfile> audioProfiles = encoderProfiles.getAudioProfiles();
        ArrayList arrayList = new ArrayList();
        for (EncoderProfiles.AudioProfile audioProfile : audioProfiles) {
            arrayList.add(new so0(audioProfile.getCodec(), audioProfile.getMediaType(), audioProfile.getBitrate(), audioProfile.getSampleRate(), audioProfile.getChannels(), audioProfile.getProfile()));
        }
        List<EncoderProfiles.VideoProfile> videoProfiles = encoderProfiles.getVideoProfiles();
        ArrayList arrayList2 = new ArrayList();
        for (EncoderProfiles.VideoProfile videoProfile : videoProfiles) {
            arrayList2.add(new uo0(videoProfile.getCodec(), videoProfile.getMediaType(), videoProfile.getBitrate(), videoProfile.getFrameRate(), videoProfile.getWidth(), videoProfile.getHeight(), videoProfile.getProfile(), 8, 0, 0));
        }
        return to0.a(defaultDurationSeconds, recommendedFileFormat, arrayList, arrayList2);
    }

    public static EncoderProfiles j(int i, String str) {
        return CamcorderProfile.getAll(str, i);
    }

    public static jy6 k(List list) {
        if (Build.VERSION.SDK_INT < 31 || list == null) {
            ey6 ey6Var = jy6.b;
            return yob.e;
        }
        TreeSet treeSet = new TreeSet(Comparator.comparing(new fj0(0)).reversed());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AudioDescriptor audioDescriptorC = qc0.c(it.next());
            if (audioDescriptorC.getStandard() == 1) {
                byte[] descriptor = audioDescriptorC.getDescriptor();
                if (descriptor.length != 3) {
                    xo1.V("AudioDescriptorUtil", "Invalid SAD length: " + descriptor.length);
                } else {
                    byte b = descriptor[0];
                    int i = (b & 7) + 1;
                    if (((b >> 3) & 15) == 1) {
                        treeSet.add(Integer.valueOf(pqf.p(i)));
                    }
                }
            }
        }
        return jy6.o(treeSet);
    }

    public static Path l(DisplayCutout displayCutout) {
        return displayCutout.getCutoutPath();
    }

    public static float m(EdgeEffect edgeEffect) {
        try {
            return edgeEffect.getDistance();
        } catch (Throwable unused) {
            return 0.0f;
        }
    }

    public static Shader.TileMode n() {
        return Shader.TileMode.DECAL;
    }

    public static final Map o(TotalCaptureResult totalCaptureResult) {
        return totalCaptureResult.getPhysicalCameraTotalResults();
    }

    public static x6c p(Display display, int i) {
        RoundedCorner roundedCorner;
        int i2;
        if (Build.VERSION.SDK_INT < 31 || (roundedCorner = display.getRoundedCorner(i)) == null) {
            return null;
        }
        int position = roundedCorner.getPosition();
        if (position != 0) {
            i2 = 1;
            if (position != 1) {
                i2 = 2;
                if (position != 2) {
                    i2 = 3;
                    if (position != 3) {
                        qc0.j(tec.e(position, "Invalid position: "));
                        return null;
                    }
                }
            }
        } else {
            i2 = 0;
        }
        return new x6c(i2, roundedCorner.getRadius(), roundedCorner.getCenter());
    }

    public static int q(JobParameters jobParameters) {
        int stopReason = jobParameters.getStopReason();
        String str = SystemJobService.e;
        switch (stopReason) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
            case 14:
            case 15:
                return stopReason;
            default:
                return -512;
        }
    }

    public static final List r(CameraExtensionCharacteristics cameraExtensionCharacteristics) {
        List<Integer> supportedExtensions = cameraExtensionCharacteristics.getSupportedExtensions();
        supportedExtensions.getClass();
        return supportedExtensions;
    }

    public static boolean s(String str) {
        String str2 = Build.MANUFACTURER;
        str2.getClass();
        if (str2.equalsIgnoreCase(str)) {
            return true;
        }
        String str3 = Build.BRAND;
        str3.getClass();
        return str3.equalsIgnoreCase(str);
    }

    public static boolean t() {
        if (Build.VERSION.SDK_INT >= 31 && "Spreadtrum".equalsIgnoreCase(Build.SOC_MANUFACTURER)) {
            return true;
        }
        String str = Build.HARDWARE;
        str.getClass();
        Locale locale = Locale.ROOT;
        String lowerCase = str.toLowerCase(locale);
        lowerCase.getClass();
        if (c5e.C(lowerCase, "ums", false)) {
            return true;
        }
        if (s("Itel")) {
            String lowerCase2 = str.toLowerCase(locale);
            lowerCase2.getClass();
            if (c5e.C(lowerCase2, "sp", false)) {
                return true;
            }
        }
        return false;
    }

    public static final InputConfiguration u(String str, List list) {
        list.getClass();
        str.getClass();
        if (list.isEmpty()) {
            qc0.p("Call to create InputConfiguration but list of InputConfigData is empty.");
            return null;
        }
        if (list.size() == 1) {
            f47 f47Var = (f47) s72.v0(list);
            return new InputConfiguration(f47Var.a, f47Var.b, f47Var.c);
        }
        ArrayList arrayList = new ArrayList(t72.u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            f47 f47Var2 = (f47) it.next();
            wq.e();
            arrayList.add(wq.c(f47Var2.a, f47Var2.b, str));
        }
        return wq.b(((f47) s72.v0(list)).c, arrayList);
    }

    public static void v(zq zqVar, long[] jArr, Consumer consumer) {
        ywc ywcVar;
        for (long j : jArr) {
            axc axcVar = (axc) zqVar.c().b((int) j);
            if (axcVar != null && (ywcVar = axcVar.a) != null) {
                ViewTranslationRequest.Builder builder = new ViewTranslationRequest.Builder(zqVar.a.getAutofillId(), ywcVar.f);
                Object objG = ywcVar.d.a.g(cxc.C);
                if (objG == null) {
                    objG = null;
                }
                List list = (List) objG;
                if (list != null) {
                    builder.setValue("android:text", TranslationRequestValue.forText(new k00(k88.a(list, "\n", null, 62))));
                    consumer.accept(builder.build());
                }
            }
        }
    }

    public static float w(EdgeEffect edgeEffect, float f, float f2) {
        try {
            return edgeEffect.onPullDistance(f, f2);
        } catch (Throwable unused) {
            edgeEffect.onPull(f, f2);
            return 0.0f;
        }
    }

    public static void x(Notification.Action.Builder builder) {
        builder.setAuthenticationRequired(false);
    }

    public static void y(hbc hbcVar, uha uhaVar) {
        LogSessionId logSessionIdA = uhaVar.a();
        if (logSessionIdA.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
            return;
        }
        ((MediaFormat) hbcVar.b).setString("log-session-id", logSessionIdA.getStringId());
    }

    public static void z(RenderNode renderNode, nqb nqbVar) {
        renderNode.setRenderEffect(nqbVar != null ? nqbVar.a() : null);
    }
}
