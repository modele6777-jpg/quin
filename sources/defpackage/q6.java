package defpackage;

import ai.askquin.R;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.app.LocaleManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.RenderEffect;
import android.graphics.RuntimeShader;
import android.graphics.Shader;
import android.graphics.text.LineBreakConfig;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraExtensionCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.params.DynamicRangeProfiles;
import android.hardware.camera2.params.OutputConfiguration;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.media.AudioProfile;
import android.media.EncoderProfiles;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.Process;
import android.os.ext.SdkExtensions;
import android.provider.MediaStore;
import android.text.BoringLayout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.InputMethodManager;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.widget.Toolbar;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class q6 {
    public static Bitmap a;

    public static boolean A(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isTextSelectable();
    }

    public static LocaleList B(Object obj) {
        return ((LocaleManager) obj).getApplicationLocales();
    }

    public static LocaleList C(Object obj) {
        return ((LocaleManager) obj).getSystemLocales();
    }

    public static void D(Object obj, LocaleList localeList) {
        ((LocaleManager) obj).setApplicationLocales(localeList);
    }

    public static final void E(ila ilaVar, Object obj) {
        OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher;
        if (!(obj instanceof OnBackInvokedCallback) || (onBackInvokedDispatcherFindOnBackInvokedDispatcher = ilaVar.findOnBackInvokedDispatcher()) == null) {
            return;
        }
        onBackInvokedDispatcherFindOnBackInvokedDispatcher.registerOnBackInvokedCallback(1000000, (OnBackInvokedCallback) obj);
    }

    public static final void F(ila ilaVar, r60 r60Var) {
        OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher;
        if (r60Var == null || (onBackInvokedDispatcherFindOnBackInvokedDispatcher = ilaVar.findOnBackInvokedDispatcher()) == null) {
            return;
        }
        onBackInvokedDispatcherFindOnBackInvokedDispatcher.unregisterOnBackInvokedCallback(r60Var);
    }

    public static r60 G(Object obj, q80 q80Var) {
        r60 r60Var = new r60(1, q80Var);
        ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(1000000, r60Var);
        return r60Var;
    }

    public static final void H(OutputConfiguration outputConfiguration, long j) {
        outputConfiguration.setDynamicRangeProfile(j);
    }

    public static final void I(CursorAnchorInfo.Builder builder, hkb hkbVar) {
        builder.setEditorBoundsInfo(r11.b().setEditorBounds(ynb.k0(hkbVar)).setHandwritingBounds(ynb.k0(hkbVar)).build());
    }

    public static final void J(CursorAnchorInfo.Builder builder, hkb hkbVar) {
        builder.setEditorBoundsInfo(r11.b().setEditorBounds(ynb.k0(hkbVar)).setHandwritingBounds(ynb.k0(hkbVar)).build());
    }

    public static final void K(StaticLayout.Builder builder, int i, int i2) {
        builder.setLineBreakConfig(new LineBreakConfig.Builder().setLineBreakStyle(i).setLineBreakWordStyle(i2).build());
    }

    public static final void L(OutputConfiguration outputConfiguration, int i) {
        outputConfiguration.setMirrorMode(i);
    }

    public static void M(hq4 hq4Var, boolean z) {
        hq4Var.setSelectedChildViewEnabled(z);
    }

    public static final void N(OutputConfiguration outputConfiguration, long j) {
        outputConfiguration.setStreamUseCase(j);
    }

    public static void O(InputMethodManager inputMethodManager, View view) {
        inputMethodManager.startStylusHandwriting(view);
    }

    public static void P(Object obj, Object obj2) {
        ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(1000000, (OnBackInvokedCallback) obj2);
    }

    public static void Q(Object obj, r60 r60Var) {
        ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback(r60Var);
    }

    public static void R(Object obj, r60 r60Var) {
        ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback(r60Var);
    }

    public static final RenderEffect a(RenderEffect renderEffect, RenderEffect renderEffect2, BlendMode blendMode, long j) {
        if ((9223372034707292159L & j) != 9205357640488583168L && !hl9.c(j, 0L)) {
            renderEffect2 = RenderEffect.createOffsetEffect(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), renderEffect2);
            renderEffect2.getClass();
        }
        RenderEffect renderEffectCreateBlendModeEffect = RenderEffect.createBlendModeEffect(renderEffect, renderEffect2, blendMode);
        renderEffectCreateBlendModeEffect.getClass();
        return renderEffectCreateBlendModeEffect;
    }

    public static final RenderEffect b(float f, long j, long j2, Shader shader, boolean z) {
        RuntimeShader runtimeShader = new RuntimeShader(z ? (String) di6.a.getValue() : (String) di6.b.getValue());
        runtimeShader.setFloatUniform("blurRadius", f);
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        runtimeShader.setFloatUniform("crop", Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j2 & 4294967295L)) + Float.intBitsToFloat(i2));
        runtimeShader.setInputShader("mask", shader);
        RenderEffect renderEffectCreateRuntimeShaderEffect = RenderEffect.createRuntimeShaderEffect(runtimeShader, "content");
        renderEffectCreateRuntimeShaderEffect.getClass();
        return renderEffectCreateRuntimeShaderEffect;
    }

    public static fc6 c(Bundle bundle) throws gc6 {
        bundle.getClass();
        try {
            String string = bundle.getString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_ID");
            String string2 = bundle.getString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_ID_TOKEN");
            String string3 = bundle.getString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_DISPLAY_NAME");
            String string4 = bundle.getString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_FAMILY_NAME");
            String string5 = bundle.getString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_GIVEN_NAME");
            Uri uri = Build.VERSION.SDK_INT >= 33 ? (Uri) bundle.getParcelable("com.google.android.libraries.identity.googleid.BUNDLE_KEY_PROFILE_PICTURE_URI", Uri.class) : (Uri) bundle.getParcelable("com.google.android.libraries.identity.googleid.BUNDLE_KEY_PROFILE_PICTURE_URI");
            String string6 = bundle.getString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_PHONE_NUMBER");
            string.getClass();
            string2.getClass();
            return new fc6(string, string2, string3, string4, string5, uri, string6);
        } catch (Exception e) {
            throw new gc6(e);
        }
    }

    public static final tu d(xh6 xh6Var, qqb qqbVar) {
        RenderEffect renderEffectCreateBlurEffect;
        RenderEffect renderEffectCreateColorFilterEffect;
        float f = qqbVar.c;
        int i = Build.VERSION.SDK_INT;
        if (i < 31) {
            return null;
        }
        float f2 = qqbVar.a * f;
        if (yi4.a(f2, 0.0f) < 0) {
            qc0.j("blurRadius needs to be equal or greater than 0.dp");
            return null;
        }
        long jF = ald.f(qqbVar.d, f);
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits((float) Math.ceil(Float.intBitsToFloat((int) (jF & 4294967295L))))) & 4294967295L) | (((long) Float.floatToRawIntBits((float) Math.ceil(Float.intBitsToFloat((int) (jF >> 32))))) << 32);
        long jH = hl9.h(qqbVar.e, f);
        long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(ym8.L(Float.intBitsToFloat((int) (jH >> 32))))) << 32) | (((long) Float.floatToRawIntBits(ym8.L(Float.intBitsToFloat((int) (jH & 4294967295L))))) & 4294967295L);
        ci6 ci6Var = qqbVar.i;
        Shader shaderC = ci6Var != null ? urg.j(ci6Var).c(jFloatToRawIntBits) : null;
        if (yi4.a(f2, 0.0f) <= 0) {
            renderEffectCreateBlurEffect = RenderEffect.createOffsetEffect(0.0f, 0.0f);
        } else if (i < 33 || shaderC == null) {
            try {
                float fP0 = ((sw3) eb3.H(xh6Var, zg2.h)).p0(f2);
                renderEffectCreateBlurEffect = RenderEffect.createBlurEffect(fP0, fP0, jgb.h0(qqbVar.j));
            } catch (IllegalArgumentException e) {
                throw new IllegalArgumentException(ib8.j("Error whilst calling RenderEffect.createBlurEffect. This is likely because this device does not support a blur radius of ", yi4.c(f2), "dp"), e);
            }
        } else {
            float fP1 = ((sw3) eb3.H(xh6Var, zg2.h)).p0(f2);
            renderEffectCreateBlurEffect = RenderEffect.createChainEffect(b(fP1, jFloatToRawIntBits2, jFloatToRawIntBits, shaderC, true), b(fP1, jFloatToRawIntBits2, jFloatToRawIntBits, shaderC, false));
            renderEffectCreateBlurEffect.getClass();
        }
        renderEffectCreateBlurEffect.getClass();
        Context context = (Context) eb3.H(xh6Var, uq.b);
        float f3 = qqbVar.b;
        if (f3 >= 0.005f) {
            if (f <= 0.0f) {
                f = 1.0f;
            }
            Bitmap bitmapO = o(context);
            Shader.TileMode tileMode = Shader.TileMode.REPEAT;
            BitmapShader bitmapShader = new BitmapShader(bitmapO, tileMode, tileMode);
            if (Math.abs(f - 1.0f) >= 0.001f) {
                Matrix matrix = new Matrix();
                float f4 = 1.0f / f;
                matrix.setScale(f4, f4);
                bitmapShader.setLocalMatrix(matrix);
            }
            float fN = mh3.n(f3, 0.0f, 1.0f);
            RenderEffect renderEffectCreateShaderEffect = RenderEffect.createShaderEffect(bitmapShader);
            renderEffectCreateShaderEffect.getClass();
            if (fN < 1.0f) {
                ColorMatrix colorMatrix = new ColorMatrix();
                colorMatrix.setScale(1.0f, 1.0f, 1.0f, fN);
                renderEffectCreateShaderEffect = RenderEffect.createColorFilterEffect(new ColorMatrixColorFilter(colorMatrix), renderEffectCreateShaderEffect);
            }
            renderEffectCreateShaderEffect.getClass();
            if (shaderC != null) {
                renderEffectCreateShaderEffect = RenderEffect.createBlendModeEffect(RenderEffect.createShaderEffect(shaderC), renderEffectCreateShaderEffect, BlendMode.SRC_IN);
            }
            renderEffectCreateShaderEffect.getClass();
            renderEffectCreateBlurEffect = RenderEffect.createBlendModeEffect(renderEffectCreateShaderEffect, renderEffectCreateBlurEffect, BlendMode.DST_ATOP);
            renderEffectCreateBlurEffect.getClass();
        }
        List<li6> list = qqbVar.f;
        float f5 = qqbVar.g;
        for (li6 li6Var : list) {
            boolean zA = li6Var.a();
            int i2 = li6Var.b;
            if (zA) {
                b41 b41Var = li6Var.c;
                Shader shaderC2 = (b41Var == null || !(b41Var instanceof l4d)) ? null : ((l4d) b41Var).c(jFloatToRawIntBits);
                if (shaderC2 != null) {
                    if (f5 >= 1.0f) {
                        renderEffectCreateColorFilterEffect = RenderEffect.createShaderEffect(shaderC2);
                    } else {
                        fv.i();
                        renderEffectCreateColorFilterEffect = RenderEffect.createColorFilterEffect(new BlendModeColorFilter(abg.Z(y72.b(y72.g, f5)), BlendMode.SRC_IN), RenderEffect.createShaderEffect(shaderC2));
                    }
                    renderEffectCreateColorFilterEffect.getClass();
                    if (shaderC != null) {
                        RenderEffect renderEffectCreateBlendModeEffect = RenderEffect.createBlendModeEffect(RenderEffect.createShaderEffect(shaderC), renderEffectCreateColorFilterEffect, BlendMode.SRC_IN);
                        renderEffectCreateBlendModeEffect.getClass();
                        renderEffectCreateBlurEffect = a(renderEffectCreateBlurEffect, renderEffectCreateBlendModeEffect, bp.V(i2), jFloatToRawIntBits2);
                    } else {
                        renderEffectCreateBlurEffect = a(renderEffectCreateBlurEffect, renderEffectCreateColorFilterEffect, bp.V(i2), jFloatToRawIntBits2);
                    }
                } else {
                    long jB = li6Var.a;
                    if (f5 < 1.0f) {
                        jB = y72.b(jB, y72.c(jB) * f5);
                    }
                    if (y72.c(jB) >= 0.005f) {
                        if (shaderC != null) {
                            fv.i();
                            RenderEffect renderEffectCreateColorFilterEffect2 = RenderEffect.createColorFilterEffect(new BlendModeColorFilter(abg.Z(jB), BlendMode.SRC_IN), RenderEffect.createShaderEffect(shaderC));
                            renderEffectCreateColorFilterEffect2.getClass();
                            renderEffectCreateBlurEffect = a(renderEffectCreateBlurEffect, renderEffectCreateColorFilterEffect2, bp.V(i2), jFloatToRawIntBits2);
                        } else {
                            fv.i();
                            renderEffectCreateBlurEffect = RenderEffect.createColorFilterEffect(fv.a(abg.Z(jB), bp.V(i2)), renderEffectCreateBlurEffect);
                            renderEffectCreateBlurEffect.getClass();
                        }
                    }
                }
            }
        }
        b41 b41Var2 = qqbVar.h;
        BlendMode blendMode = BlendMode.DST_IN;
        if (b41Var2 != null) {
            Shader shaderC3 = b41Var2 instanceof l4d ? ((l4d) b41Var2).c(jFloatToRawIntBits) : null;
            if (shaderC3 != null) {
                RenderEffect renderEffectCreateShaderEffect2 = RenderEffect.createShaderEffect(shaderC3);
                renderEffectCreateShaderEffect2.getClass();
                renderEffectCreateBlurEffect = a(renderEffectCreateBlurEffect, renderEffectCreateShaderEffect2, blendMode, jFloatToRawIntBits2);
            }
        }
        return new tu(renderEffectCreateBlurEffect);
    }

    public static OnBackInvokedDispatcher e(Toolbar toolbar) {
        return toolbar.findOnBackInvokedDispatcher();
    }

    public static to0 f(EncoderProfiles encoderProfiles) {
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
            arrayList2.add(new uo0(videoProfile.getCodec(), videoProfile.getMediaType(), videoProfile.getBitrate(), videoProfile.getFrameRate(), videoProfile.getWidth(), videoProfile.getHeight(), videoProfile.getProfile(), videoProfile.getBitDepth(), videoProfile.getChromaSubsampling(), videoProfile.getHdrFormat()));
        }
        return to0.a(defaultDurationSeconds, recommendedFileFormat, arrayList, arrayList2);
    }

    public static vd9 g(yg1 yg1Var) {
        yg1Var.getClass();
        int i = Build.VERSION.SDK_INT;
        vd9 vd9Var = null;
        if (i >= 33) {
            CameraCharacteristics.Key key = CameraCharacteristics.REQUEST_AVAILABLE_DYNAMIC_RANGE_PROFILES;
            key.getClass();
            DynamicRangeProfiles dynamicRangeProfiles = (DynamicRangeProfiles) ((nc1) yg1Var).c(key);
            if (dynamicRangeProfiles != null) {
                if (i < 33) {
                    ho7.j(tec.f(i, "DynamicRangeProfiles can only be converted to DynamicRangesCompat on API 33 or higher. is not supported on API ", " (requires API 33)"));
                    return null;
                }
                vd9Var = new vd9(17, new ur4(dynamicRangeProfiles));
            }
        }
        return vd9Var == null ? vr4.a : vd9Var;
    }

    public static ArrayList h(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        context.getClass();
        int i = context.getApplicationInfo().uid;
        String str = context.getApplicationInfo().processName;
        Object systemService = context.getSystemService("activity");
        ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
        if (activityManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
            runningAppProcesses = pu4.a;
        }
        ArrayList arrayListT0 = s72.t0(runningAppProcesses);
        ArrayList<ActivityManager.RunningAppProcessInfo> arrayList = new ArrayList();
        for (Object obj : arrayListT0) {
            if (((ActivityManager.RunningAppProcessInfo) obj).uid == i) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(t72.u(arrayList, 10));
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : arrayList) {
            String str2 = runningAppProcessInfo.processName;
            str2.getClass();
            arrayList2.add(new jva(str2, runningAppProcessInfo.pid, runningAppProcessInfo.importance, pa7.t(runningAppProcessInfo.processName, str)));
        }
        return arrayList2;
    }

    public static final Set i(CameraExtensionCharacteristics cameraExtensionCharacteristics, int i) {
        Set<CaptureRequest.Key> availableCaptureRequestKeys = cameraExtensionCharacteristics.getAvailableCaptureRequestKeys(i);
        availableCaptureRequestKeys.getClass();
        return availableCaptureRequestKeys;
    }

    public static final Set j(CameraExtensionCharacteristics cameraExtensionCharacteristics, int i) {
        Set<CaptureResult.Key> availableCaptureResultKeys = cameraExtensionCharacteristics.getAvailableCaptureResultKeys(i);
        availableCaptureResultKeys.getClass();
        return availableCaptureResultKeys;
    }

    public static bj0 k(AudioManager audioManager, xi0 xi0Var, jy6 jy6Var, List list) {
        List<AudioProfile> directProfilesForAttributes = audioManager.getDirectProfilesForAttributes(xi0Var.a());
        HashMap map = new HashMap();
        map.put(2, new HashSet(rxg.x(12)));
        for (int i = 0; i < directProfilesForAttributes.size(); i++) {
            AudioProfile audioProfile = directProfilesForAttributes.get(i);
            if (audioProfile.getEncapsulationType() != 1) {
                int format = audioProfile.getFormat();
                if (pqf.E(format) || bj0.h.containsKey(Integer.valueOf(format))) {
                    if (map.containsKey(Integer.valueOf(format))) {
                        Set set = (Set) map.get(Integer.valueOf(format));
                        set.getClass();
                        set.addAll(rxg.x(audioProfile.getChannelMasks()));
                    } else {
                        map.put(Integer.valueOf(format), new HashSet(rxg.x(audioProfile.getChannelMasks())));
                    }
                }
            }
        }
        dy6 dy6VarM = jy6.m();
        for (Map.Entry entry : map.entrySet()) {
            dy6VarM.b(new aj0(((Integer) entry.getKey()).intValue(), (Set) entry.getValue()));
        }
        return new bj0(dy6VarM.g(), jy6Var, list);
    }

    public static AudioDeviceInfo l(AudioManager audioManager, xi0 xi0Var) {
        audioManager.getClass();
        List<AudioDeviceInfo> audioDevicesForAttributes = audioManager.getAudioDevicesForAttributes(xi0Var.a());
        if (audioDevicesForAttributes.isEmpty()) {
            return null;
        }
        return audioDevicesForAttributes.get(0);
    }

    public static int m() {
        int i = Build.VERSION.SDK_INT;
        if (i < 33 && (i < 30 || SdkExtensions.getExtensionVersion(30) < 2)) {
            return Integer.MAX_VALUE;
        }
        return MediaStore.getPickImagesMaxLimit();
    }

    public static jva n(Context context) {
        Object next;
        String strY;
        context.getClass();
        int iMyPid = Process.myPid();
        Iterator it = h(context).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((jva) next).b != iMyPid);
        jva jvaVar = (jva) next;
        if (jvaVar != null) {
            return jvaVar;
        }
        int i = Build.VERSION.SDK_INT;
        if (i > 33) {
            strY = Process.myProcessName();
            strY.getClass();
        } else if ((i < 28 || (strY = Application.getProcessName()) == null) && (strY = s.y()) == null) {
            strY = "";
        }
        return new jva(strY, iMyPid, 0, false);
    }

    public static final Bitmap o(Context context) {
        context.getClass();
        Bitmap bitmap = a;
        if (bitmap != null && !bitmap.isRecycled()) {
            return bitmap;
        }
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(context.getResources(), R.drawable.haze_noise);
        a = bitmapDecodeResource;
        bitmapDecodeResource.getClass();
        return bitmapDecodeResource;
    }

    public static OnBackInvokedDispatcher p(Activity activity) {
        return activity.getOnBackInvokedDispatcher();
    }

    public static PackageInfo q(PackageManager packageManager, Context context) {
        return packageManager.getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
    }

    public static Object r(Bundle bundle, String str, Class cls) {
        return bundle.getParcelable(str, cls);
    }

    public static ArrayList s(Bundle bundle, String str, Class cls) {
        return bundle.getParcelableArrayList(str, cls);
    }

    public static qr4 t(yg1 yg1Var) {
        yg1Var.getClass();
        CameraCharacteristics.Key key = CameraCharacteristics.REQUEST_RECOMMENDED_TEN_BIT_DYNAMIC_RANGE_PROFILE;
        key.getClass();
        Long l = (Long) ((nc1) yg1Var).c(key);
        if (l != null) {
            return (qr4) rr4.a.get(l);
        }
        return null;
    }

    public static Serializable u(Intent intent, String str, Class cls) {
        return intent.getSerializableExtra(str, cls);
    }

    public static String v(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getUniqueId();
    }

    public static final BoringLayout.Metrics w(CharSequence charSequence, TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic) {
        return BoringLayout.isBoring(charSequence, textPaint, textDirectionHeuristic, true, null);
    }

    public static final boolean x(BoringLayout boringLayout) {
        return boringLayout.isFallbackLineSpacingEnabled();
    }

    public static final boolean y(StaticLayout staticLayout) {
        return staticLayout.isFallbackLineSpacingEnabled();
    }

    public static boolean z(hq4 hq4Var) {
        return hq4Var.isSelectedChildViewEnabled();
    }
}
