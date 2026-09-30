package defpackage;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ap8 {
    public static final HashMap a = new HashMap();

    public static void a(String str, ArrayList arrayList) {
        int i = 1;
        if ("audio/raw".equals(str)) {
            Collections.sort(arrayList, new va2(i, new ho7(9)));
        }
        if (Build.VERSION.SDK_INT >= 32 || arrayList.size() <= 1 || !"OMX.qti.audio.decoder.flac".equals(((to8) arrayList.get(0)).a)) {
            return;
        }
        arrayList.add((to8) arrayList.remove(0));
    }

    public static MediaCodecInfo.CodecProfileLevel b(int i, int i2) {
        MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
        codecProfileLevel.profile = i;
        codecProfileLevel.level = i2;
        return codecProfileLevel;
    }

    public static String c(rr5 rr5Var) {
        c72 c72VarD;
        boolean z;
        String str = rr5Var.p;
        if ("audio/eac3-joc".equals(str)) {
            if (Objects.equals(Build.MANUFACTURER, "Google")) {
                return null;
            }
            return "audio/eac3";
        }
        if ("audio/vnd.dts.hd".equals(str) || "audio/vnd.dts.uhd;profile=p2".equals(str)) {
            return "audio/vnd.dts";
        }
        if ("video/dolby-vision".equals(str) && (c72VarD = d72.d(rr5Var)) != null && (z = c72VarD.c)) {
            pa7.J(z);
            int i = c72VarD.a;
            if (i == 16 || i == 256) {
                return "video/hevc";
            }
            if (i == 512) {
                return "video/avc";
            }
            if (i == 1024) {
                e82 e82Var = rr5Var.H;
                if (e82Var != null && e82Var.c == 6 && e82Var.b == 1) {
                    return null;
                }
                return "video/av01";
            }
        }
        if ("video/mv-hevc".equals(str)) {
            return "video/hevc";
        }
        return null;
    }

    public static String d(MediaCodecInfo mediaCodecInfo, String str, String str2) {
        for (String str3 : mediaCodecInfo.getSupportedTypes()) {
            if (str3.equalsIgnoreCase(str2)) {
                return str3;
            }
        }
        if (str2.equals("video/dolby-vision")) {
            if ("OMX.MS.HEVCDV.Decoder".equals(str)) {
                return "video/hevcdv";
            }
            if ("OMX.RTK.video.decoder".equals(str) || "OMX.realtek.video.decoder.tunneled".equals(str)) {
                return "video/dv_hevc";
            }
            return null;
        }
        if (str2.equals("video/mv-hevc")) {
            if ("c2.qti.mvhevc.decoder".equals(str) || "c2.qti.mvhevc.decoder.secure".equals(str)) {
                return "video/x-mvhevc";
            }
            return null;
        }
        if (str2.equals("audio/alac") && "OMX.lge.alac.decoder".equals(str)) {
            return "audio/x-lg-alac";
        }
        if (str2.equals("audio/flac") && "OMX.lge.flac.decoder".equals(str)) {
            return "audio/x-lg-flac";
        }
        if (str2.equals("audio/ac3") && "OMX.lge.ac3.decoder".equals(str)) {
            return "audio/lg-ac3";
        }
        return null;
    }

    public static synchronized List e(String str, boolean z, boolean z2) {
        try {
            xo8 xo8Var = new xo8(str, z, z2);
            HashMap map = a;
            List list = (List) map.get(xo8Var);
            if (list != null) {
                return list;
            }
            ArrayList arrayListF = f(xo8Var, new sug(z, z2, str.equals("video/mv-hevc")));
            if (z) {
                arrayListF.isEmpty();
            }
            a(str, arrayListF);
            jy6 jy6VarO = jy6.o(arrayListF);
            map.put(xo8Var, jy6VarO);
            return jy6VarO;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0056  */
    public static ArrayList f(xo8 xo8Var, sug sugVar) throws yo8 {
        String strD;
        String str;
        int i;
        xo8 xo8Var2 = xo8Var;
        int i2 = sugVar.b;
        try {
            ArrayList arrayList = new ArrayList();
            String str2 = xo8Var2.a;
            boolean z = xo8Var2.b;
            MediaCodecInfo[] codecInfos = (MediaCodecInfo[]) sugVar.c;
            if (codecInfos == null) {
                codecInfos = new MediaCodecList(i2).getCodecInfos();
                sugVar.c = codecInfos;
            }
            int length = codecInfos.length;
            int i3 = 0;
            while (i3 < length) {
                MediaCodecInfo[] codecInfos2 = (MediaCodecInfo[]) sugVar.c;
                if (codecInfos2 == null) {
                    codecInfos2 = new MediaCodecList(i2).getCodecInfos();
                    sugVar.c = codecInfos2;
                }
                MediaCodecInfo mediaCodecInfo = codecInfos2[i3];
                int i4 = Build.VERSION.SDK_INT;
                if (i4 < 29 || !mediaCodecInfo.isAlias()) {
                    int i5 = i3;
                    String name = mediaCodecInfo.getName();
                    if (mediaCodecInfo.isEncoder() || (strD = d(mediaCodecInfo, name, str2)) == null) {
                        i = i5;
                    } else {
                        try {
                            MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(strD);
                            boolean zIsFeatureSupported = capabilitiesForType.isFeatureSupported("tunneled-playback");
                            boolean zIsFeatureRequired = capabilitiesForType.isFeatureRequired("tunneled-playback");
                            boolean z2 = xo8Var2.c;
                            if ((z2 || !zIsFeatureRequired) && (!z2 || zIsFeatureSupported)) {
                                boolean zIsFeatureSupported2 = capabilitiesForType.isFeatureSupported("secure-playback");
                                boolean zIsFeatureRequired2 = capabilitiesForType.isFeatureRequired("secure-playback");
                                if ((z || !zIsFeatureRequired2) && (!z || zIsFeatureSupported2)) {
                                    boolean zIsVendor = true;
                                    boolean zIsHardwareAccelerated = i4 >= 29 ? mediaCodecInfo.isHardwareAccelerated() : !h(mediaCodecInfo, str2);
                                    i = i5;
                                    boolean zH = h(mediaCodecInfo, str2);
                                    boolean z3 = zIsHardwareAccelerated;
                                    if (i4 >= 29) {
                                        zIsVendor = mediaCodecInfo.isVendor();
                                    } else {
                                        String strV = bm8.V(mediaCodecInfo.getName());
                                        if (strV.startsWith("omx.google.") || strV.startsWith("c2.android.") || strV.startsWith("c2.google.")) {
                                            zIsVendor = false;
                                        }
                                    }
                                    if (z != zIsFeatureSupported2) {
                                        continue;
                                    } else {
                                        str = strD;
                                        try {
                                            arrayList.add(to8.i(name, str2, str, capabilitiesForType, z3, zH, zIsVendor));
                                        } catch (Exception e) {
                                            e = e;
                                            xo1.x("MediaCodecUtil", "Failed to query codec " + name + " (" + str + ")");
                                            throw e;
                                        }
                                    }
                                } else {
                                    i = i5;
                                }
                            } else {
                                i = i5;
                            }
                        } catch (Exception e2) {
                            e = e2;
                            str = strD;
                        }
                    }
                } else {
                    i = i3;
                }
                i3 = i + 1;
                xo8Var2 = xo8Var;
            }
            return arrayList;
        } catch (Exception e3) {
            throw new yo8("Failed to query underlying media codecs", e3);
        }
    }

    public static yob g(rr5 rr5Var, boolean z, boolean z2) {
        Iterable iterableE;
        List listE = e(rr5Var.p, z, z2);
        String strC = c(rr5Var);
        if (strC == null) {
            ey6 ey6Var = jy6.b;
            iterableE = yob.e;
        } else {
            iterableE = e(strC, z, z2);
        }
        dy6 dy6VarM = jy6.m();
        dy6VarM.d(listE);
        dy6VarM.d(iterableE);
        return dy6VarM.g();
    }

    public static boolean h(MediaCodecInfo mediaCodecInfo, String str) {
        if (Build.VERSION.SDK_INT >= 29) {
            return mediaCodecInfo.isSoftwareOnly();
        }
        if (qv8.h(str)) {
            return true;
        }
        String strV = bm8.V(mediaCodecInfo.getName());
        if (strV.startsWith("arc.")) {
            return false;
        }
        if (strV.startsWith("omx.google.") || strV.startsWith("omx.ffmpeg.")) {
            return true;
        }
        if ((strV.startsWith("omx.sec.") && strV.contains(".sw.")) || strV.equals("omx.qcom.video.decoder.hevcswvdec") || strV.startsWith("c2.android.") || strV.startsWith("c2.google.")) {
            return true;
        }
        return (strV.startsWith("omx.") || strV.startsWith("c2.")) ? false : true;
    }
}
