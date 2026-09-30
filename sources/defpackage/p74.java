package defpackage;

import android.os.Build;
import android.util.Pair;
import androidx.camera.camera2.compat.quirk.CaptureSessionOnClosedNotCalledQuirk;
import androidx.camera.camera2.compat.quirk.CloseCameraDeviceOnCameraGraphCloseQuirk;
import androidx.camera.camera2.compat.quirk.ControlZoomRatioRangeAssertionErrorQuirk;
import androidx.camera.camera2.compat.quirk.CrashWhenTakingPhotoWithAutoFlashAEModeQuirk;
import androidx.camera.camera2.compat.quirk.DisableAbortCapturesOnStopQuirk;
import androidx.camera.camera2.compat.quirk.DisableAbortCapturesOnStopWithSessionProcessorQuirk;
import androidx.camera.camera2.compat.quirk.ExcludedSupportedSizesQuirk;
import androidx.camera.camera2.compat.quirk.ExtraCroppingQuirk;
import androidx.camera.camera2.compat.quirk.ExtraSupportedOutputSizeQuirk;
import androidx.camera.camera2.compat.quirk.ExtraSupportedSurfaceCombinationsQuirk;
import androidx.camera.camera2.compat.quirk.FlashAvailabilityBufferUnderflowQuirk;
import androidx.camera.camera2.compat.quirk.ImageCapturePixelHDRPlusQuirk;
import androidx.camera.camera2.compat.quirk.InvalidVideoProfilesQuirk;
import androidx.camera.camera2.compat.quirk.Nexus4AndroidLTargetAspectRatioQuirk;
import androidx.camera.camera2.compat.quirk.PixelJpegRSupportedQuirk;
import androidx.camera.camera2.compat.quirk.PreviewPixelHDRnetQuirk;
import androidx.camera.camera2.compat.quirk.PreviewUnderExposureQuirk;
import androidx.camera.camera2.compat.quirk.RepeatingStreamConstraintForVideoRecordingQuirk;
import androidx.camera.camera2.compat.quirk.SmallDisplaySizeQuirk;
import androidx.camera.camera2.compat.quirk.StillCaptureFlashStopRepeatingQuirk;
import androidx.camera.camera2.compat.quirk.TorchIsClosedAfterImageCapturingQuirk;
import androidx.camera.camera2.compat.quirk.ZslDisablerQuirk;
import androidx.camera.core.internal.compat.quirk.BackportedFixQuirk;
import androidx.camera.core.internal.compat.quirk.CaptureFailedRetryQuirk;
import androidx.camera.core.internal.compat.quirk.ImageCaptureFailedForSpecificCombinationQuirk;
import androidx.camera.core.internal.compat.quirk.ImageCaptureRotationOptionQuirk;
import androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk;
import androidx.camera.core.internal.compat.quirk.LargeJpegImageQuirk;
import androidx.camera.core.internal.compat.quirk.LowMemoryQuirk;
import androidx.camera.core.internal.compat.quirk.PreviewGreenTintQuirk;
import androidx.camera.core.internal.compat.quirk.SurfaceOrderQuirk;
import com.adjust.sdk.Constants;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p74 implements yl2 {
    public final /* synthetic */ int a;

    public /* synthetic */ p74(int i) {
        this.a = i;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x019f  */
    /* JADX WARN: Code duplicated, block: B:112:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:115:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:118:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:121:0x01de  */
    /* JADX WARN: Code duplicated, block: B:127:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:130:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:133:0x0224  */
    /* JADX WARN: Code duplicated, block: B:136:0x0236  */
    /* JADX WARN: Code duplicated, block: B:138:0x023c  */
    /* JADX WARN: Code duplicated, block: B:141:0x0249  */
    /* JADX WARN: Code duplicated, block: B:144:0x0252  */
    /* JADX WARN: Code duplicated, block: B:147:0x0264  */
    /* JADX WARN: Code duplicated, block: B:149:0x026f  */
    /* JADX WARN: Code duplicated, block: B:152:0x027c  */
    /* JADX WARN: Code duplicated, block: B:154:0x028b  */
    /* JADX WARN: Code duplicated, block: B:156:0x0296  */
    /* JADX WARN: Code duplicated, block: B:159:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:161:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:164:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:165:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:168:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:171:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:172:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:175:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:177:0x02df  */
    /* JADX WARN: Code duplicated, block: B:180:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:182:0x02fa A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:184:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:186:0x030c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:191:0x0319  */
    /* JADX WARN: Code duplicated, block: B:194:0x0327  */
    /* JADX WARN: Code duplicated, block: B:212:0x035a  */
    /* JADX WARN: Code duplicated, block: B:215:0x0363  */
    /* JADX WARN: Code duplicated, block: B:218:0x0379  */
    /* JADX WARN: Code duplicated, block: B:221:0x0389  */
    /* JADX WARN: Code duplicated, block: B:223:0x0394  */
    /* JADX WARN: Code duplicated, block: B:225:0x039c  */
    /* JADX WARN: Code duplicated, block: B:226:0x039e  */
    /* JADX WARN: Code duplicated, block: B:229:0x03a7  */
    /* JADX WARN: Code duplicated, block: B:232:0x03bb  */
    /* JADX WARN: Code duplicated, block: B:241:0x03d3  */
    /* JADX WARN: Code duplicated, block: B:244:0x03dc  */
    /* JADX WARN: Code duplicated, block: B:247:0x03ec  */
    /* JADX WARN: Code duplicated, block: B:250:0x03fc  */
    /* JADX WARN: Code duplicated, block: B:253:0x040c  */
    /* JADX WARN: Code duplicated, block: B:255:0x0417  */
    /* JADX WARN: Code duplicated, block: B:257:0x0430  */
    /* JADX WARN: Code duplicated, block: B:258:0x0432  */
    /* JADX WARN: Code duplicated, block: B:261:0x043b  */
    /* JADX WARN: Code duplicated, block: B:264:0x044b  */
    /* JADX WARN: Code duplicated, block: B:266:0x0456  */
    /* JADX WARN: Code duplicated, block: B:268:0x045e  */
    /* JADX WARN: Code duplicated, block: B:269:0x0460  */
    /* JADX WARN: Code duplicated, block: B:272:0x0469  */
    /* JADX WARN: Code duplicated, block: B:275:0x0477  */
    /* JADX WARN: Code duplicated, block: B:277:0x0482  */
    /* JADX WARN: Code duplicated, block: B:279:0x0491  */
    /* JADX WARN: Code duplicated, block: B:280:0x0493  */
    /* JADX WARN: Code duplicated, block: B:283:0x049c  */
    /* JADX WARN: Code duplicated, block: B:286:0x04b9  */
    /* JADX WARN: Code duplicated, block: B:289:0x04c9  */
    /* JADX WARN: Code duplicated, block: B:28:0x0084  */
    /* JADX WARN: Code duplicated, block: B:291:0x04d4  */
    /* JADX WARN: Code duplicated, block: B:293:0x04ef  */
    /* JADX WARN: Code duplicated, block: B:294:0x04f1  */
    /* JADX WARN: Code duplicated, block: B:297:0x04fa  */
    /* JADX WARN: Code duplicated, block: B:300:0x050a  */
    /* JADX WARN: Code duplicated, block: B:303:0x051a  */
    /* JADX WARN: Code duplicated, block: B:305:0x0525  */
    /* JADX WARN: Code duplicated, block: B:308:0x052e  */
    /* JADX WARN: Code duplicated, block: B:310:0x0534  */
    /* JADX WARN: Code duplicated, block: B:312:0x053f  */
    /* JADX WARN: Code duplicated, block: B:317:0x0550  */
    /* JADX WARN: Code duplicated, block: B:320:0x056d  */
    /* JADX WARN: Code duplicated, block: B:323:0x057f  */
    /* JADX WARN: Code duplicated, block: B:46:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:72:0x0131  */
    /* JADX WARN: Code duplicated, block: B:75:0x013a  */
    /* JADX WARN: Code duplicated, block: B:77:0x0140  */
    /* JADX WARN: Code duplicated, block: B:79:0x014b  */
    /* JADX WARN: Code duplicated, block: B:81:0x0153  */
    /* JADX WARN: Code duplicated, block: B:84:0x015c  */
    /* JADX WARN: Code duplicated, block: B:86:0x0162  */
    /* JADX WARN: Code duplicated, block: B:88:0x016d  */
    /* JADX WARN: Code duplicated, block: B:95:0x0181  */
    /* JADX WARN: Code duplicated, block: B:98:0x0193  */
    @Override // defpackage.yl2
    public final void accept(Object obj) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        Set set;
        String lowerCase;
        String lowerCase2;
        boolean z6;
        String str;
        boolean z7;
        boolean z8;
        boolean z9;
        String str2;
        boolean z10;
        List list;
        String lowerCase3;
        boolean z11;
        boolean z12;
        String upperCase;
        boolean z13;
        List list2;
        String lowerCase4;
        List list3;
        String lowerCase5;
        boolean z14;
        Map map;
        String upperCase2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        List list4;
        String lowerCase6;
        boolean z15;
        boolean z16;
        List list5;
        String lowerCase7;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        String str16;
        String str17;
        String str18;
        String str19;
        boolean z17 = false;
        switch (this.a) {
            case 0:
                h9b h9bVar = (h9b) obj;
                ArrayList arrayList = new ArrayList();
                String str20 = Build.BRAND;
                if (h9bVar.a(ImageCaptureRotationOptionQuirk.class, ("HUAWEI".equalsIgnoreCase(str20) && "SNE-LX1".equalsIgnoreCase(Build.MODEL)) || ("HONOR".equalsIgnoreCase(str20) && "STK-LX1".equalsIgnoreCase(Build.MODEL)))) {
                    arrayList.add(new ImageCaptureRotationOptionQuirk());
                }
                if (h9bVar.a(SurfaceOrderQuirk.class, true)) {
                    arrayList.add(new SurfaceOrderQuirk());
                }
                HashSet hashSet = CaptureFailedRetryQuirk.a;
                Locale locale = Locale.US;
                String upperCase3 = str20.toUpperCase(locale);
                String str21 = Build.MODEL;
                if (h9bVar.a(CaptureFailedRetryQuirk.class, CaptureFailedRetryQuirk.a.contains(Pair.create(upperCase3, str21.toUpperCase(locale))))) {
                    arrayList.add(new CaptureFailedRetryQuirk());
                }
                if (h9bVar.a(LowMemoryQuirk.class, LowMemoryQuirk.a.contains(str21.toUpperCase(locale)))) {
                    arrayList.add(new LowMemoryQuirk());
                }
                HashSet hashSet2 = LargeJpegImageQuirk.a;
                if (h9bVar.a(LargeJpegImageQuirk.class, "Samsung".equalsIgnoreCase(str20) || ("Vivo".equalsIgnoreCase(str20) && LargeJpegImageQuirk.a.contains(str21.toUpperCase(locale))))) {
                    arrayList.add(new LargeJpegImageQuirk());
                }
                HashSet hashSet3 = IncorrectJpegMetadataQuirk.a;
                if (h9bVar.a(IncorrectJpegMetadataQuirk.class, "Samsung".equalsIgnoreCase(str20) && IncorrectJpegMetadataQuirk.a.contains(Build.DEVICE.toUpperCase(locale)))) {
                    arrayList.add(new IncorrectJpegMetadataQuirk());
                }
                HashSet hashSet4 = ImageCaptureFailedForSpecificCombinationQuirk.a;
                if (h9bVar.a(ImageCaptureFailedForSpecificCombinationQuirk.class, ("oneplus".equalsIgnoreCase(str20) && "cph2583".equalsIgnoreCase(str21)) || (Constants.REFERRER_API_GOOGLE.equalsIgnoreCase(str20) && ImageCaptureFailedForSpecificCombinationQuirk.a.contains(str21.toLowerCase())))) {
                    arrayList.add(new ImageCaptureFailedForSpecificCombinationQuirk());
                }
                PreviewGreenTintQuirk previewGreenTintQuirk = PreviewGreenTintQuirk.a;
                if ("motorola".equalsIgnoreCase(str20) && "moto e20".equalsIgnoreCase(str21)) {
                    z17 = true;
                }
                if (h9bVar.a(PreviewGreenTintQuirk.class, z17)) {
                    arrayList.add(previewGreenTintQuirk);
                }
                q74.a = new k9b(arrayList);
                b21.q("DeviceQuirks", "core DeviceQuirks = " + k9b.d(q74.a));
                break;
            case 1:
                s1e s1eVar = s1e.a;
                h9b h9bVar2 = (h9b) obj;
                h9bVar2.getClass();
                ArrayList arrayList2 = new ArrayList();
                int i = PixelJpegRSupportedQuirk.b;
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 34) {
                    vs0 vs0Var = (vs0) BackportedFixQuirk.a.getValue();
                    fr7 fr7Var = gr7.a;
                    vs0Var.getClass();
                    fr7Var.getClass();
                    if (!((Boolean) fr7Var.c.invoke()).booleanValue()) {
                        s1eVar = s1e.b;
                    } else if (!fr7Var.b.contains(Build.FINGERPRINT) && !((Set) ((ace) vs0Var.a.a).getValue()).contains(5)) {
                        s1eVar = s1e.c;
                    }
                    int iOrdinal = s1eVar.ordinal();
                    if (iOrdinal != 0) {
                        if (iOrdinal == 1 || iOrdinal == 2) {
                            z = false;
                        } else if (iOrdinal != 3) {
                            ap.c();
                        }
                    }
                    z = true;
                } else {
                    z = false;
                }
                if (h9bVar2.a(PixelJpegRSupportedQuirk.class, z)) {
                    arrayList2.add(new PixelJpegRSupportedQuirk());
                }
                if (CloseCameraDeviceOnCameraGraphCloseQuirk.a || CloseCameraDeviceOnCameraGraphCloseQuirk.b || (30 <= i2 && i2 < 34 && (xq.s("Oppo") || xq.s("OnePlus") || xq.s("Realme")))) {
                    z2 = true;
                } else {
                    String str22 = Build.MANUFACTURER;
                    str22.getClass();
                    if (str22.equalsIgnoreCase("Vivo")) {
                        z2 = true;
                    } else {
                        String str23 = Build.BRAND;
                        str23.getClass();
                        if (str23.equalsIgnoreCase("Vivo") || CloseCameraDeviceOnCameraGraphCloseQuirk.c || CloseCameraDeviceOnCameraGraphCloseQuirk.e || CloseCameraDeviceOnCameraGraphCloseQuirk.d) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                    }
                }
                if (h9bVar2.a(CloseCameraDeviceOnCameraGraphCloseQuirk.class, z2)) {
                    arrayList2.add(new CloseCameraDeviceOnCameraGraphCloseQuirk());
                }
                List list6 = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.a;
                String str24 = Build.MODEL;
                str24.getClass();
                Locale locale2 = Locale.ROOT;
                String upperCase4 = str24.toUpperCase(locale2);
                upperCase4.getClass();
                if (h9bVar2.a(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.class, list6.contains(upperCase4))) {
                    arrayList2.add(new CrashWhenTakingPhotoWithAutoFlashAEModeQuirk());
                }
                String str25 = Build.MANUFACTURER;
                str25.getClass();
                if (!str25.equalsIgnoreCase("Jio")) {
                    String str26 = Build.BRAND;
                    str26.getClass();
                    if (str26.equalsIgnoreCase("Jio")) {
                        if (c5e.C(str24, "LS1542QW", true)) {
                            if (!str25.equalsIgnoreCase("Samsung")) {
                                str19 = Build.BRAND;
                                str19.getClass();
                                if (!str19.equalsIgnoreCase("Samsung")) {
                                    if (!str25.equalsIgnoreCase("Vivo")) {
                                        str18 = Build.BRAND;
                                        str18.getClass();
                                        if (str18.equalsIgnoreCase("Vivo")) {
                                            if (str24.equalsIgnoreCase("VIVO 2039")) {
                                            }
                                        }
                                    } else if (str24.equalsIgnoreCase("VIVO 2039")) {
                                    }
                                    z3 = false;
                                } else if (c5e.C(str24, "SM-A025", true) && !str24.equalsIgnoreCase("SM-S124DL")) {
                                    if (!str25.equalsIgnoreCase("Vivo")) {
                                        str18 = Build.BRAND;
                                        str18.getClass();
                                        if (str18.equalsIgnoreCase("Vivo")) {
                                            if (str24.equalsIgnoreCase("VIVO 2039")) {
                                            }
                                        }
                                    } else if (str24.equalsIgnoreCase("VIVO 2039")) {
                                    }
                                    z3 = false;
                                }
                            } else if (c5e.C(str24, "SM-A025", true)) {
                            }
                        }
                    } else if (!str25.equalsIgnoreCase("Samsung")) {
                        str19 = Build.BRAND;
                        str19.getClass();
                        if (!str19.equalsIgnoreCase("Samsung")) {
                            if (!str25.equalsIgnoreCase("Vivo")) {
                                str18 = Build.BRAND;
                                str18.getClass();
                                if (str18.equalsIgnoreCase("Vivo")) {
                                    if (str24.equalsIgnoreCase("VIVO 2039")) {
                                    }
                                }
                            } else if (str24.equalsIgnoreCase("VIVO 2039")) {
                            }
                            z3 = false;
                        } else if (c5e.C(str24, "SM-A025", true)) {
                        }
                    } else if (c5e.C(str24, "SM-A025", true)) {
                    }
                    if (h9bVar2.a(ControlZoomRatioRangeAssertionErrorQuirk.class, z3)) {
                        arrayList2.add(new ControlZoomRatioRangeAssertionErrorQuirk());
                    }
                    boolean z18 = DisableAbortCapturesOnStopQuirk.a;
                    if (str25.equalsIgnoreCase("Tecno")) {
                        z4 = true;
                    } else {
                        str17 = Build.BRAND;
                        str17.getClass();
                        if (!str17.equalsIgnoreCase("Tecno") || str25.equalsIgnoreCase("Tecno-mobile") || str17.equalsIgnoreCase("Tecno-mobile") || DisableAbortCapturesOnStopQuirk.a || DisableAbortCapturesOnStopQuirk.b) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                    }
                    if (h9bVar2.a(DisableAbortCapturesOnStopQuirk.class, z4)) {
                        arrayList2.add(new DisableAbortCapturesOnStopQuirk());
                    }
                    if (str25.equalsIgnoreCase("Samsung")) {
                        z5 = true;
                    } else {
                        str16 = Build.BRAND;
                        str16.getClass();
                        if (!str16.equalsIgnoreCase("Samsung") || str25.equalsIgnoreCase("Xiaomi") || str16.equalsIgnoreCase("Xiaomi")) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                    }
                    if (h9bVar2.a(DisableAbortCapturesOnStopWithSessionProcessorQuirk.class, z5)) {
                        arrayList2.add(new DisableAbortCapturesOnStopWithSessionProcessorQuirk());
                    }
                    set = FlashAvailabilityBufferUnderflowQuirk.a;
                    Locale locale3 = Locale.US;
                    locale3.getClass();
                    lowerCase = str25.toLowerCase(locale3);
                    lowerCase.getClass();
                    lowerCase2 = str24.toLowerCase(locale3);
                    lowerCase2.getClass();
                    if (h9bVar2.a(FlashAvailabilityBufferUnderflowQuirk.class, set.contains(new pi5(lowerCase, lowerCase2)))) {
                        arrayList2.add(new FlashAvailabilityBufferUnderflowQuirk());
                    }
                    if (ImageCapturePixelHDRPlusQuirk.a.contains(str24)) {
                        if (!str25.equalsIgnoreCase("Google")) {
                            str15 = Build.BRAND;
                            str15.getClass();
                            if (!str15.equalsIgnoreCase("Google")) {
                                z6 = false;
                            }
                        }
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    if (h9bVar2.a(ImageCapturePixelHDRPlusQuirk.class, z6)) {
                        arrayList2.add(new ImageCapturePixelHDRPlusQuirk());
                    }
                    List list7 = InvalidVideoProfilesQuirk.a;
                    if (!str25.equalsIgnoreCase("Samsung")) {
                        str14 = Build.BRAND;
                        str14.getClass();
                        if (str14.equalsIgnoreCase("Samsung")) {
                            str = Build.ID;
                            str.getClass();
                            if (c5e.C(str, "TP1A", true)) {
                                list4 = InvalidVideoProfilesQuirk.a;
                                lowerCase6 = str24.toLowerCase(locale2);
                                lowerCase6.getClass();
                                if (list4.contains(lowerCase6)) {
                                    str13 = Build.ID;
                                    str13.getClass();
                                    if (!c5e.C(str13, "TP1A", true)) {
                                        str13.getClass();
                                        if (!c5e.C(str13, "TD1A", true)) {
                                            if (str25.equalsIgnoreCase("Redmi")) {
                                                z15 = true;
                                            } else {
                                                str12 = Build.BRAND;
                                                str12.getClass();
                                                if (str12.equalsIgnoreCase("Redmi")) {
                                                    z15 = true;
                                                } else {
                                                    z15 = false;
                                                }
                                            }
                                            if (str25.equalsIgnoreCase("Xiaomi")) {
                                                z16 = true;
                                            } else {
                                                str11 = Build.BRAND;
                                                str11.getClass();
                                                if (str11.equalsIgnoreCase("Xiaomi")) {
                                                    z16 = true;
                                                } else {
                                                    z16 = false;
                                                }
                                            }
                                            if (z15 || z16) {
                                                str10 = Build.ID;
                                                str10.getClass();
                                                if (!c5e.C(str10, "TKQ1", true)) {
                                                    str10.getClass();
                                                    if (c5e.C(str10, "TP1A", true)) {
                                                        list5 = InvalidVideoProfilesQuirk.c;
                                                        lowerCase7 = str24.toLowerCase(locale2);
                                                        lowerCase7.getClass();
                                                        if (list5.contains(lowerCase7) || i2 != 33) {
                                                            List list8 = InvalidVideoProfilesQuirk.b;
                                                            String lowerCase8 = str24.toLowerCase(locale2);
                                                            lowerCase8.getClass();
                                                            z7 = !list8.contains(lowerCase8) && i2 == 33;
                                                        }
                                                    }
                                                }
                                            } else {
                                                list5 = InvalidVideoProfilesQuirk.c;
                                                lowerCase7 = str24.toLowerCase(locale2);
                                                lowerCase7.getClass();
                                                if (list5.contains(lowerCase7)) {
                                                    List list9 = InvalidVideoProfilesQuirk.b;
                                                    String lowerCase9 = str24.toLowerCase(locale2);
                                                    lowerCase9.getClass();
                                                    if (list9.contains(lowerCase9)) {
                                                    }
                                                } else {
                                                    List list10 = InvalidVideoProfilesQuirk.b;
                                                    String lowerCase10 = str24.toLowerCase(locale2);
                                                    lowerCase10.getClass();
                                                    if (list10.contains(lowerCase10)) {
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    if (str25.equalsIgnoreCase("Redmi")) {
                                        str12 = Build.BRAND;
                                        str12.getClass();
                                        if (str12.equalsIgnoreCase("Redmi")) {
                                            z15 = true;
                                        } else {
                                            z15 = false;
                                        }
                                    } else {
                                        z15 = true;
                                    }
                                    if (str25.equalsIgnoreCase("Xiaomi")) {
                                        str11 = Build.BRAND;
                                        str11.getClass();
                                        if (str11.equalsIgnoreCase("Xiaomi")) {
                                            z16 = true;
                                        } else {
                                            z16 = false;
                                        }
                                    } else {
                                        z16 = true;
                                    }
                                    if (z15 || z16) {
                                        str10 = Build.ID;
                                        str10.getClass();
                                        if (!c5e.C(str10, "TKQ1", true)) {
                                            str10.getClass();
                                            if (c5e.C(str10, "TP1A", true)) {
                                                list5 = InvalidVideoProfilesQuirk.c;
                                                lowerCase7 = str24.toLowerCase(locale2);
                                                lowerCase7.getClass();
                                                if (list5.contains(lowerCase7)) {
                                                    List list11 = InvalidVideoProfilesQuirk.b;
                                                    String lowerCase11 = str24.toLowerCase(locale2);
                                                    lowerCase11.getClass();
                                                    if (list11.contains(lowerCase11)) {
                                                    }
                                                } else {
                                                    List list12 = InvalidVideoProfilesQuirk.b;
                                                    String lowerCase12 = str24.toLowerCase(locale2);
                                                    lowerCase12.getClass();
                                                    if (list12.contains(lowerCase12)) {
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        list5 = InvalidVideoProfilesQuirk.c;
                                        lowerCase7 = str24.toLowerCase(locale2);
                                        lowerCase7.getClass();
                                        if (list5.contains(lowerCase7)) {
                                            List list13 = InvalidVideoProfilesQuirk.b;
                                            String lowerCase13 = str24.toLowerCase(locale2);
                                            lowerCase13.getClass();
                                            if (list13.contains(lowerCase13)) {
                                            }
                                        } else {
                                            List list14 = InvalidVideoProfilesQuirk.b;
                                            String lowerCase14 = str24.toLowerCase(locale2);
                                            lowerCase14.getClass();
                                            if (list14.contains(lowerCase14)) {
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            list4 = InvalidVideoProfilesQuirk.a;
                            lowerCase6 = str24.toLowerCase(locale2);
                            lowerCase6.getClass();
                            if (list4.contains(lowerCase6)) {
                                str13 = Build.ID;
                                str13.getClass();
                                if (!c5e.C(str13, "TP1A", true)) {
                                    str13.getClass();
                                    if (!c5e.C(str13, "TD1A", true)) {
                                        if (str25.equalsIgnoreCase("Redmi")) {
                                            str12 = Build.BRAND;
                                            str12.getClass();
                                            if (str12.equalsIgnoreCase("Redmi")) {
                                                z15 = true;
                                            } else {
                                                z15 = false;
                                            }
                                        } else {
                                            z15 = true;
                                        }
                                        if (str25.equalsIgnoreCase("Xiaomi")) {
                                            str11 = Build.BRAND;
                                            str11.getClass();
                                            if (str11.equalsIgnoreCase("Xiaomi")) {
                                                z16 = true;
                                            } else {
                                                z16 = false;
                                            }
                                        } else {
                                            z16 = true;
                                        }
                                        if (z15 || z16) {
                                            str10 = Build.ID;
                                            str10.getClass();
                                            if (!c5e.C(str10, "TKQ1", true)) {
                                                str10.getClass();
                                                if (c5e.C(str10, "TP1A", true)) {
                                                    list5 = InvalidVideoProfilesQuirk.c;
                                                    lowerCase7 = str24.toLowerCase(locale2);
                                                    lowerCase7.getClass();
                                                    if (list5.contains(lowerCase7)) {
                                                        List list15 = InvalidVideoProfilesQuirk.b;
                                                        String lowerCase15 = str24.toLowerCase(locale2);
                                                        lowerCase15.getClass();
                                                        if (list15.contains(lowerCase15)) {
                                                        }
                                                    } else {
                                                        List list16 = InvalidVideoProfilesQuirk.b;
                                                        String lowerCase16 = str24.toLowerCase(locale2);
                                                        lowerCase16.getClass();
                                                        if (list16.contains(lowerCase16)) {
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            list5 = InvalidVideoProfilesQuirk.c;
                                            lowerCase7 = str24.toLowerCase(locale2);
                                            lowerCase7.getClass();
                                            if (list5.contains(lowerCase7)) {
                                                List list17 = InvalidVideoProfilesQuirk.b;
                                                String lowerCase17 = str24.toLowerCase(locale2);
                                                lowerCase17.getClass();
                                                if (list17.contains(lowerCase17)) {
                                                }
                                            } else {
                                                List list18 = InvalidVideoProfilesQuirk.b;
                                                String lowerCase18 = str24.toLowerCase(locale2);
                                                lowerCase18.getClass();
                                                if (list18.contains(lowerCase18)) {
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                if (str25.equalsIgnoreCase("Redmi")) {
                                    str12 = Build.BRAND;
                                    str12.getClass();
                                    if (str12.equalsIgnoreCase("Redmi")) {
                                        z15 = true;
                                    } else {
                                        z15 = false;
                                    }
                                } else {
                                    z15 = true;
                                }
                                if (str25.equalsIgnoreCase("Xiaomi")) {
                                    str11 = Build.BRAND;
                                    str11.getClass();
                                    if (str11.equalsIgnoreCase("Xiaomi")) {
                                        z16 = true;
                                    } else {
                                        z16 = false;
                                    }
                                } else {
                                    z16 = true;
                                }
                                if (z15 || z16) {
                                    str10 = Build.ID;
                                    str10.getClass();
                                    if (!c5e.C(str10, "TKQ1", true)) {
                                        str10.getClass();
                                        if (c5e.C(str10, "TP1A", true)) {
                                            list5 = InvalidVideoProfilesQuirk.c;
                                            lowerCase7 = str24.toLowerCase(locale2);
                                            lowerCase7.getClass();
                                            if (list5.contains(lowerCase7)) {
                                                List list19 = InvalidVideoProfilesQuirk.b;
                                                String lowerCase19 = str24.toLowerCase(locale2);
                                                lowerCase19.getClass();
                                                if (list19.contains(lowerCase19)) {
                                                }
                                            } else {
                                                List list110 = InvalidVideoProfilesQuirk.b;
                                                String lowerCase110 = str24.toLowerCase(locale2);
                                                lowerCase110.getClass();
                                                if (list110.contains(lowerCase110)) {
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    list5 = InvalidVideoProfilesQuirk.c;
                                    lowerCase7 = str24.toLowerCase(locale2);
                                    lowerCase7.getClass();
                                    if (list5.contains(lowerCase7)) {
                                        List list111 = InvalidVideoProfilesQuirk.b;
                                        String lowerCase111 = str24.toLowerCase(locale2);
                                        lowerCase111.getClass();
                                        if (list111.contains(lowerCase111)) {
                                        }
                                    } else {
                                        List list112 = InvalidVideoProfilesQuirk.b;
                                        String lowerCase112 = str24.toLowerCase(locale2);
                                        lowerCase112.getClass();
                                        if (list112.contains(lowerCase112)) {
                                        }
                                    }
                                }
                            }
                        }
                        if (h9bVar2.a(InvalidVideoProfilesQuirk.class, z7)) {
                            arrayList2.add(new InvalidVideoProfilesQuirk());
                        }
                        if (!z7f.O() || z7f.P() || z7f.M() || z7f.T() || z7f.S() || z7f.Q() || z7f.R() || z7f.N() || z7f.U()) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        if (h9bVar2.a(ExcludedSupportedSizesQuirk.class, z8)) {
                            arrayList2.add(new ExcludedSupportedSizesQuirk());
                        }
                        LinkedHashMap linkedHashMap = ExtraCroppingQuirk.a;
                        if (h9bVar2.a(ExtraCroppingQuirk.class, vd0.g0())) {
                            arrayList2.add(new ExtraCroppingQuirk());
                        }
                        if (!str25.equalsIgnoreCase("Motorola")) {
                            str9 = Build.BRAND;
                            str9.getClass();
                            if (!str9.equalsIgnoreCase("Motorola")) {
                                z9 = false;
                            } else if ("moto e5 play".equalsIgnoreCase(str24)) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                        } else if ("moto e5 play".equalsIgnoreCase(str24)) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        if (h9bVar2.a(ExtraSupportedOutputSizeQuirk.class, z9)) {
                            arrayList2.add(new ExtraSupportedOutputSizeQuirk());
                        }
                        v9e v9eVar = ExtraSupportedSurfaceCombinationsQuirk.a;
                        str2 = Build.DEVICE;
                        if (!"heroqltevzw".equalsIgnoreCase(str2) || "heroqltetmo".equalsIgnoreCase(str2) || kj0.z0() || kj0.A0()) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (h9bVar2.a(ExtraSupportedSurfaceCombinationsQuirk.class, z10)) {
                            arrayList2.add(new ExtraSupportedSurfaceCombinationsQuirk());
                        }
                        int i3 = Nexus4AndroidLTargetAspectRatioQuirk.a;
                        if (!str25.equalsIgnoreCase("Google")) {
                            String str27 = Build.BRAND;
                            str27.getClass();
                            str27.equalsIgnoreCase("Google");
                        }
                        if (h9bVar2.a(Nexus4AndroidLTargetAspectRatioQuirk.class, false)) {
                            arrayList2.add(new Nexus4AndroidLTargetAspectRatioQuirk());
                        }
                        List list20 = PreviewPixelHDRnetQuirk.a;
                        if (str25.equalsIgnoreCase("Google")) {
                            list = PreviewPixelHDRnetQuirk.a;
                            str2.getClass();
                            Locale locale4 = Locale.getDefault();
                            locale4.getClass();
                            lowerCase3 = str2.toLowerCase(locale4);
                            lowerCase3.getClass();
                            if (list.contains(lowerCase3)) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                        } else {
                            str8 = Build.BRAND;
                            str8.getClass();
                            if (str8.equalsIgnoreCase("Google")) {
                                list = PreviewPixelHDRnetQuirk.a;
                                str2.getClass();
                                Locale locale5 = Locale.getDefault();
                                locale5.getClass();
                                lowerCase3 = str2.toLowerCase(locale5);
                                lowerCase3.getClass();
                                if (list.contains(lowerCase3)) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                            } else {
                                z11 = false;
                            }
                        }
                        if (h9bVar2.a(PreviewPixelHDRnetQuirk.class, z11)) {
                            arrayList2.add(new PreviewPixelHDRnetQuirk());
                        }
                        if (!str25.equalsIgnoreCase("Huawei")) {
                            str7 = Build.BRAND;
                            str7.getClass();
                            if (!str7.equalsIgnoreCase("Huawei")) {
                                z12 = false;
                            } else if ("mha-l29".equalsIgnoreCase(str24)) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                        } else if ("mha-l29".equalsIgnoreCase(str24)) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (h9bVar2.a(RepeatingStreamConstraintForVideoRecordingQuirk.class, z12)) {
                            arrayList2.add(new RepeatingStreamConstraintForVideoRecordingQuirk());
                        }
                        if (str25.equalsIgnoreCase("Samsung")) {
                            upperCase = str24.toUpperCase(locale2);
                            upperCase.getClass();
                            if (c5e.C(upperCase, "SM-A716", false)) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                        } else {
                            str6 = Build.BRAND;
                            str6.getClass();
                            if (str6.equalsIgnoreCase("Samsung")) {
                                upperCase = str24.toUpperCase(locale2);
                                upperCase.getClass();
                                if (c5e.C(upperCase, "SM-A716", false)) {
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                            } else {
                                z13 = false;
                            }
                        }
                        if (h9bVar2.a(StillCaptureFlashStopRepeatingQuirk.class, z13)) {
                            arrayList2.add(new StillCaptureFlashStopRepeatingQuirk());
                        }
                        list2 = TorchIsClosedAfterImageCapturingQuirk.a;
                        lowerCase4 = str24.toLowerCase(locale2);
                        lowerCase4.getClass();
                        if (h9bVar2.a(TorchIsClosedAfterImageCapturingQuirk.class, list2.contains(lowerCase4))) {
                            arrayList2.add(new TorchIsClosedAfterImageCapturingQuirk());
                        }
                        List list21 = androidx.camera.camera2.compat.quirk.SurfaceOrderQuirk.a;
                        if (str25.equalsIgnoreCase("Samsung")) {
                            list3 = androidx.camera.camera2.compat.quirk.SurfaceOrderQuirk.a;
                            String str28 = Build.HARDWARE;
                            str28.getClass();
                            Locale locale6 = Locale.getDefault();
                            locale6.getClass();
                            lowerCase5 = str28.toLowerCase(locale6);
                            lowerCase5.getClass();
                            if (list3.contains(lowerCase5)) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                        } else {
                            str5 = Build.BRAND;
                            str5.getClass();
                            if (str5.equalsIgnoreCase("Samsung")) {
                                list3 = androidx.camera.camera2.compat.quirk.SurfaceOrderQuirk.a;
                                String str29 = Build.HARDWARE;
                                str29.getClass();
                                Locale locale7 = Locale.getDefault();
                                locale7.getClass();
                                lowerCase5 = str29.toLowerCase(locale7);
                                lowerCase5.getClass();
                                if (list3.contains(lowerCase5)) {
                                    z14 = true;
                                } else {
                                    z14 = false;
                                }
                            } else {
                                z14 = false;
                            }
                        }
                        if (h9bVar2.a(androidx.camera.camera2.compat.quirk.SurfaceOrderQuirk.class, z14)) {
                            arrayList2.add(new androidx.camera.camera2.compat.quirk.SurfaceOrderQuirk());
                        }
                        if (h9bVar2.a(CaptureSessionOnClosedNotCalledQuirk.class, false)) {
                            arrayList2.add(new CaptureSessionOnClosedNotCalledQuirk());
                        }
                        List list22 = ZslDisablerQuirk.a;
                        if (!str25.equalsIgnoreCase("Samsung")) {
                            str4 = Build.BRAND;
                            str4.getClass();
                            if (str4.equalsIgnoreCase("Samsung")) {
                                if (ndc.e(ZslDisablerQuirk.a)) {
                                    if (!str25.equalsIgnoreCase("Xiaomi")) {
                                        str3 = Build.BRAND;
                                        str3.getClass();
                                        if (str3.equalsIgnoreCase("Xiaomi")) {
                                            if (ndc.e(ZslDisablerQuirk.b)) {
                                            }
                                        }
                                    } else if (ndc.e(ZslDisablerQuirk.b)) {
                                    }
                                }
                            } else if (!str25.equalsIgnoreCase("Xiaomi")) {
                                str3 = Build.BRAND;
                                str3.getClass();
                                if (str3.equalsIgnoreCase("Xiaomi")) {
                                    if (ndc.e(ZslDisablerQuirk.b)) {
                                    }
                                }
                            } else if (ndc.e(ZslDisablerQuirk.b)) {
                            }
                            if (h9bVar2.a(ZslDisablerQuirk.class, z17)) {
                                arrayList2.add(new ZslDisablerQuirk());
                            }
                            map = SmallDisplaySizeQuirk.a;
                            upperCase2 = str24.toUpperCase(locale2);
                            upperCase2.getClass();
                            if (h9bVar2.a(SmallDisplaySizeQuirk.class, map.containsKey(upperCase2))) {
                                arrayList2.add(new SmallDisplaySizeQuirk());
                            }
                            if (h9bVar2.a(PreviewUnderExposureQuirk.class, PreviewUnderExposureQuirk.b)) {
                                arrayList2.add(PreviewUnderExposureQuirk.a);
                            }
                            s74.a = new k9b(arrayList2);
                            b21.q("DeviceQuirks", "camera2 DeviceQuirks = " + k9b.d(s74.a()));
                        } else {
                            if (ndc.e(ZslDisablerQuirk.a)) {
                                if (!str25.equalsIgnoreCase("Xiaomi")) {
                                    str3 = Build.BRAND;
                                    str3.getClass();
                                    if (str3.equalsIgnoreCase("Xiaomi")) {
                                        if (ndc.e(ZslDisablerQuirk.b)) {
                                        }
                                    }
                                } else if (ndc.e(ZslDisablerQuirk.b)) {
                                }
                            }
                            if (h9bVar2.a(ZslDisablerQuirk.class, z17)) {
                                arrayList2.add(new ZslDisablerQuirk());
                            }
                            map = SmallDisplaySizeQuirk.a;
                            upperCase2 = str24.toUpperCase(locale2);
                            upperCase2.getClass();
                            if (h9bVar2.a(SmallDisplaySizeQuirk.class, map.containsKey(upperCase2))) {
                                arrayList2.add(new SmallDisplaySizeQuirk());
                            }
                            if (h9bVar2.a(PreviewUnderExposureQuirk.class, PreviewUnderExposureQuirk.b)) {
                                arrayList2.add(PreviewUnderExposureQuirk.a);
                            }
                            s74.a = new k9b(arrayList2);
                            b21.q("DeviceQuirks", "camera2 DeviceQuirks = " + k9b.d(s74.a()));
                        }
                        z17 = true;
                        if (h9bVar2.a(ZslDisablerQuirk.class, z17)) {
                            arrayList2.add(new ZslDisablerQuirk());
                        }
                        map = SmallDisplaySizeQuirk.a;
                        upperCase2 = str24.toUpperCase(locale2);
                        upperCase2.getClass();
                        if (h9bVar2.a(SmallDisplaySizeQuirk.class, map.containsKey(upperCase2))) {
                            arrayList2.add(new SmallDisplaySizeQuirk());
                        }
                        if (h9bVar2.a(PreviewUnderExposureQuirk.class, PreviewUnderExposureQuirk.b)) {
                            arrayList2.add(PreviewUnderExposureQuirk.a);
                        }
                        s74.a = new k9b(arrayList2);
                        b21.q("DeviceQuirks", "camera2 DeviceQuirks = " + k9b.d(s74.a()));
                    } else {
                        str = Build.ID;
                        str.getClass();
                        if (c5e.C(str, "TP1A", true)) {
                            list4 = InvalidVideoProfilesQuirk.a;
                            lowerCase6 = str24.toLowerCase(locale2);
                            lowerCase6.getClass();
                            if (list4.contains(lowerCase6)) {
                                str13 = Build.ID;
                                str13.getClass();
                                if (!c5e.C(str13, "TP1A", true)) {
                                    str13.getClass();
                                    if (!c5e.C(str13, "TD1A", true)) {
                                        if (str25.equalsIgnoreCase("Redmi")) {
                                            str12 = Build.BRAND;
                                            str12.getClass();
                                            if (str12.equalsIgnoreCase("Redmi")) {
                                                z15 = true;
                                            } else {
                                                z15 = false;
                                            }
                                        } else {
                                            z15 = true;
                                        }
                                        if (str25.equalsIgnoreCase("Xiaomi")) {
                                            str11 = Build.BRAND;
                                            str11.getClass();
                                            if (str11.equalsIgnoreCase("Xiaomi")) {
                                                z16 = true;
                                            } else {
                                                z16 = false;
                                            }
                                        } else {
                                            z16 = true;
                                        }
                                        if (z15 || z16) {
                                            str10 = Build.ID;
                                            str10.getClass();
                                            if (!c5e.C(str10, "TKQ1", true)) {
                                                str10.getClass();
                                                if (c5e.C(str10, "TP1A", true)) {
                                                    list5 = InvalidVideoProfilesQuirk.c;
                                                    lowerCase7 = str24.toLowerCase(locale2);
                                                    lowerCase7.getClass();
                                                    if (list5.contains(lowerCase7)) {
                                                        List list113 = InvalidVideoProfilesQuirk.b;
                                                        String lowerCase113 = str24.toLowerCase(locale2);
                                                        lowerCase113.getClass();
                                                        if (list113.contains(lowerCase113)) {
                                                        }
                                                    } else {
                                                        List list114 = InvalidVideoProfilesQuirk.b;
                                                        String lowerCase114 = str24.toLowerCase(locale2);
                                                        lowerCase114.getClass();
                                                        if (list114.contains(lowerCase114)) {
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            list5 = InvalidVideoProfilesQuirk.c;
                                            lowerCase7 = str24.toLowerCase(locale2);
                                            lowerCase7.getClass();
                                            if (list5.contains(lowerCase7)) {
                                                List list115 = InvalidVideoProfilesQuirk.b;
                                                String lowerCase115 = str24.toLowerCase(locale2);
                                                lowerCase115.getClass();
                                                if (list115.contains(lowerCase115)) {
                                                }
                                            } else {
                                                List list116 = InvalidVideoProfilesQuirk.b;
                                                String lowerCase116 = str24.toLowerCase(locale2);
                                                lowerCase116.getClass();
                                                if (list116.contains(lowerCase116)) {
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                if (str25.equalsIgnoreCase("Redmi")) {
                                    str12 = Build.BRAND;
                                    str12.getClass();
                                    if (str12.equalsIgnoreCase("Redmi")) {
                                        z15 = true;
                                    } else {
                                        z15 = false;
                                    }
                                } else {
                                    z15 = true;
                                }
                                if (str25.equalsIgnoreCase("Xiaomi")) {
                                    str11 = Build.BRAND;
                                    str11.getClass();
                                    if (str11.equalsIgnoreCase("Xiaomi")) {
                                        z16 = true;
                                    } else {
                                        z16 = false;
                                    }
                                } else {
                                    z16 = true;
                                }
                                if (z15 || z16) {
                                    str10 = Build.ID;
                                    str10.getClass();
                                    if (!c5e.C(str10, "TKQ1", true)) {
                                        str10.getClass();
                                        if (c5e.C(str10, "TP1A", true)) {
                                            list5 = InvalidVideoProfilesQuirk.c;
                                            lowerCase7 = str24.toLowerCase(locale2);
                                            lowerCase7.getClass();
                                            if (list5.contains(lowerCase7)) {
                                                List list117 = InvalidVideoProfilesQuirk.b;
                                                String lowerCase117 = str24.toLowerCase(locale2);
                                                lowerCase117.getClass();
                                                if (list117.contains(lowerCase117)) {
                                                }
                                            } else {
                                                List list118 = InvalidVideoProfilesQuirk.b;
                                                String lowerCase118 = str24.toLowerCase(locale2);
                                                lowerCase118.getClass();
                                                if (list118.contains(lowerCase118)) {
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    list5 = InvalidVideoProfilesQuirk.c;
                                    lowerCase7 = str24.toLowerCase(locale2);
                                    lowerCase7.getClass();
                                    if (list5.contains(lowerCase7)) {
                                        List list119 = InvalidVideoProfilesQuirk.b;
                                        String lowerCase119 = str24.toLowerCase(locale2);
                                        lowerCase119.getClass();
                                        if (list119.contains(lowerCase119)) {
                                        }
                                    } else {
                                        List list1110 = InvalidVideoProfilesQuirk.b;
                                        String lowerCase1110 = str24.toLowerCase(locale2);
                                        lowerCase1110.getClass();
                                        if (list1110.contains(lowerCase1110)) {
                                        }
                                    }
                                }
                            }
                        }
                        if (h9bVar2.a(InvalidVideoProfilesQuirk.class, z7)) {
                            arrayList2.add(new InvalidVideoProfilesQuirk());
                        }
                        if (z7f.O()) {
                            z8 = true;
                        } else {
                            z8 = true;
                        }
                        if (h9bVar2.a(ExcludedSupportedSizesQuirk.class, z8)) {
                            arrayList2.add(new ExcludedSupportedSizesQuirk());
                        }
                        LinkedHashMap linkedHashMap2 = ExtraCroppingQuirk.a;
                        if (h9bVar2.a(ExtraCroppingQuirk.class, vd0.g0())) {
                            arrayList2.add(new ExtraCroppingQuirk());
                        }
                        if (!str25.equalsIgnoreCase("Motorola")) {
                            str9 = Build.BRAND;
                            str9.getClass();
                            if (!str9.equalsIgnoreCase("Motorola")) {
                                z9 = false;
                            } else if ("moto e5 play".equalsIgnoreCase(str24)) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                        } else if ("moto e5 play".equalsIgnoreCase(str24)) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        if (h9bVar2.a(ExtraSupportedOutputSizeQuirk.class, z9)) {
                            arrayList2.add(new ExtraSupportedOutputSizeQuirk());
                        }
                        v9e v9eVar2 = ExtraSupportedSurfaceCombinationsQuirk.a;
                        str2 = Build.DEVICE;
                        if ("heroqltevzw".equalsIgnoreCase(str2)) {
                            z10 = true;
                        } else {
                            z10 = true;
                        }
                        if (h9bVar2.a(ExtraSupportedSurfaceCombinationsQuirk.class, z10)) {
                            arrayList2.add(new ExtraSupportedSurfaceCombinationsQuirk());
                        }
                        int i4 = Nexus4AndroidLTargetAspectRatioQuirk.a;
                        if (!str25.equalsIgnoreCase("Google")) {
                            String str210 = Build.BRAND;
                            str210.getClass();
                            str210.equalsIgnoreCase("Google");
                        }
                        if (h9bVar2.a(Nexus4AndroidLTargetAspectRatioQuirk.class, false)) {
                            arrayList2.add(new Nexus4AndroidLTargetAspectRatioQuirk());
                        }
                        List list23 = PreviewPixelHDRnetQuirk.a;
                        if (str25.equalsIgnoreCase("Google")) {
                            str8 = Build.BRAND;
                            str8.getClass();
                            if (str8.equalsIgnoreCase("Google")) {
                                list = PreviewPixelHDRnetQuirk.a;
                                str2.getClass();
                                Locale locale8 = Locale.getDefault();
                                locale8.getClass();
                                lowerCase3 = str2.toLowerCase(locale8);
                                lowerCase3.getClass();
                                if (list.contains(lowerCase3)) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                            } else {
                                z11 = false;
                            }
                        } else {
                            list = PreviewPixelHDRnetQuirk.a;
                            str2.getClass();
                            Locale locale9 = Locale.getDefault();
                            locale9.getClass();
                            lowerCase3 = str2.toLowerCase(locale9);
                            lowerCase3.getClass();
                            if (list.contains(lowerCase3)) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                        }
                        if (h9bVar2.a(PreviewPixelHDRnetQuirk.class, z11)) {
                            arrayList2.add(new PreviewPixelHDRnetQuirk());
                        }
                        if (!str25.equalsIgnoreCase("Huawei")) {
                            str7 = Build.BRAND;
                            str7.getClass();
                            if (!str7.equalsIgnoreCase("Huawei")) {
                                z12 = false;
                            } else if ("mha-l29".equalsIgnoreCase(str24)) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                        } else if ("mha-l29".equalsIgnoreCase(str24)) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (h9bVar2.a(RepeatingStreamConstraintForVideoRecordingQuirk.class, z12)) {
                            arrayList2.add(new RepeatingStreamConstraintForVideoRecordingQuirk());
                        }
                        if (str25.equalsIgnoreCase("Samsung")) {
                            str6 = Build.BRAND;
                            str6.getClass();
                            if (str6.equalsIgnoreCase("Samsung")) {
                                upperCase = str24.toUpperCase(locale2);
                                upperCase.getClass();
                                if (c5e.C(upperCase, "SM-A716", false)) {
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                            } else {
                                z13 = false;
                            }
                        } else {
                            upperCase = str24.toUpperCase(locale2);
                            upperCase.getClass();
                            if (c5e.C(upperCase, "SM-A716", false)) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                        }
                        if (h9bVar2.a(StillCaptureFlashStopRepeatingQuirk.class, z13)) {
                            arrayList2.add(new StillCaptureFlashStopRepeatingQuirk());
                        }
                        list2 = TorchIsClosedAfterImageCapturingQuirk.a;
                        lowerCase4 = str24.toLowerCase(locale2);
                        lowerCase4.getClass();
                        if (h9bVar2.a(TorchIsClosedAfterImageCapturingQuirk.class, list2.contains(lowerCase4))) {
                            arrayList2.add(new TorchIsClosedAfterImageCapturingQuirk());
                        }
                        List list24 = androidx.camera.camera2.compat.quirk.SurfaceOrderQuirk.a;
                        if (str25.equalsIgnoreCase("Samsung")) {
                            str5 = Build.BRAND;
                            str5.getClass();
                            if (str5.equalsIgnoreCase("Samsung")) {
                                list3 = androidx.camera.camera2.compat.quirk.SurfaceOrderQuirk.a;
                                String str211 = Build.HARDWARE;
                                str211.getClass();
                                Locale locale10 = Locale.getDefault();
                                locale10.getClass();
                                lowerCase5 = str211.toLowerCase(locale10);
                                lowerCase5.getClass();
                                if (list3.contains(lowerCase5)) {
                                    z14 = true;
                                } else {
                                    z14 = false;
                                }
                            } else {
                                z14 = false;
                            }
                        } else {
                            list3 = androidx.camera.camera2.compat.quirk.SurfaceOrderQuirk.a;
                            String str212 = Build.HARDWARE;
                            str212.getClass();
                            Locale locale11 = Locale.getDefault();
                            locale11.getClass();
                            lowerCase5 = str212.toLowerCase(locale11);
                            lowerCase5.getClass();
                            if (list3.contains(lowerCase5)) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                        }
                        if (h9bVar2.a(androidx.camera.camera2.compat.quirk.SurfaceOrderQuirk.class, z14)) {
                            arrayList2.add(new androidx.camera.camera2.compat.quirk.SurfaceOrderQuirk());
                        }
                        if (h9bVar2.a(CaptureSessionOnClosedNotCalledQuirk.class, false)) {
                            arrayList2.add(new CaptureSessionOnClosedNotCalledQuirk());
                        }
                        List list25 = ZslDisablerQuirk.a;
                        if (!str25.equalsIgnoreCase("Samsung")) {
                            if (ndc.e(ZslDisablerQuirk.a)) {
                                if (!str25.equalsIgnoreCase("Xiaomi")) {
                                    str3 = Build.BRAND;
                                    str3.getClass();
                                    if (str3.equalsIgnoreCase("Xiaomi")) {
                                        if (ndc.e(ZslDisablerQuirk.b)) {
                                        }
                                    }
                                } else if (ndc.e(ZslDisablerQuirk.b)) {
                                }
                            }
                            if (h9bVar2.a(ZslDisablerQuirk.class, z17)) {
                                arrayList2.add(new ZslDisablerQuirk());
                            }
                            map = SmallDisplaySizeQuirk.a;
                            upperCase2 = str24.toUpperCase(locale2);
                            upperCase2.getClass();
                            if (h9bVar2.a(SmallDisplaySizeQuirk.class, map.containsKey(upperCase2))) {
                                arrayList2.add(new SmallDisplaySizeQuirk());
                            }
                            if (h9bVar2.a(PreviewUnderExposureQuirk.class, PreviewUnderExposureQuirk.b)) {
                                arrayList2.add(PreviewUnderExposureQuirk.a);
                            }
                            s74.a = new k9b(arrayList2);
                            b21.q("DeviceQuirks", "camera2 DeviceQuirks = " + k9b.d(s74.a()));
                        } else {
                            str4 = Build.BRAND;
                            str4.getClass();
                            if (str4.equalsIgnoreCase("Samsung")) {
                                if (ndc.e(ZslDisablerQuirk.a)) {
                                    if (!str25.equalsIgnoreCase("Xiaomi")) {
                                        str3 = Build.BRAND;
                                        str3.getClass();
                                        if (str3.equalsIgnoreCase("Xiaomi")) {
                                            if (ndc.e(ZslDisablerQuirk.b)) {
                                            }
                                        }
                                    } else if (ndc.e(ZslDisablerQuirk.b)) {
                                    }
                                }
                            } else if (!str25.equalsIgnoreCase("Xiaomi")) {
                                str3 = Build.BRAND;
                                str3.getClass();
                                if (str3.equalsIgnoreCase("Xiaomi")) {
                                    if (ndc.e(ZslDisablerQuirk.b)) {
                                    }
                                }
                            } else if (ndc.e(ZslDisablerQuirk.b)) {
                            }
                            if (h9bVar2.a(ZslDisablerQuirk.class, z17)) {
                                arrayList2.add(new ZslDisablerQuirk());
                            }
                            map = SmallDisplaySizeQuirk.a;
                            upperCase2 = str24.toUpperCase(locale2);
                            upperCase2.getClass();
                            if (h9bVar2.a(SmallDisplaySizeQuirk.class, map.containsKey(upperCase2))) {
                                arrayList2.add(new SmallDisplaySizeQuirk());
                            }
                            if (h9bVar2.a(PreviewUnderExposureQuirk.class, PreviewUnderExposureQuirk.b)) {
                                arrayList2.add(PreviewUnderExposureQuirk.a);
                            }
                            s74.a = new k9b(arrayList2);
                            b21.q("DeviceQuirks", "camera2 DeviceQuirks = " + k9b.d(s74.a()));
                        }
                        z17 = true;
                        if (h9bVar2.a(ZslDisablerQuirk.class, z17)) {
                            arrayList2.add(new ZslDisablerQuirk());
                        }
                        map = SmallDisplaySizeQuirk.a;
                        upperCase2 = str24.toUpperCase(locale2);
                        upperCase2.getClass();
                        if (h9bVar2.a(SmallDisplaySizeQuirk.class, map.containsKey(upperCase2))) {
                            arrayList2.add(new SmallDisplaySizeQuirk());
                        }
                        if (h9bVar2.a(PreviewUnderExposureQuirk.class, PreviewUnderExposureQuirk.b)) {
                            arrayList2.add(PreviewUnderExposureQuirk.a);
                        }
                        s74.a = new k9b(arrayList2);
                        b21.q("DeviceQuirks", "camera2 DeviceQuirks = " + k9b.d(s74.a()));
                    }
                    if (h9bVar2.a(InvalidVideoProfilesQuirk.class, z7)) {
                        arrayList2.add(new InvalidVideoProfilesQuirk());
                    }
                    if (z7f.O()) {
                        z8 = true;
                    } else {
                        z8 = true;
                    }
                    if (h9bVar2.a(ExcludedSupportedSizesQuirk.class, z8)) {
                        arrayList2.add(new ExcludedSupportedSizesQuirk());
                    }
                    LinkedHashMap linkedHashMap3 = ExtraCroppingQuirk.a;
                    if (h9bVar2.a(ExtraCroppingQuirk.class, vd0.g0())) {
                        arrayList2.add(new ExtraCroppingQuirk());
                    }
                    if (!str25.equalsIgnoreCase("Motorola")) {
                        str9 = Build.BRAND;
                        str9.getClass();
                        if (!str9.equalsIgnoreCase("Motorola")) {
                            z9 = false;
                        } else if ("moto e5 play".equalsIgnoreCase(str24)) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                    } else if ("moto e5 play".equalsIgnoreCase(str24)) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if (h9bVar2.a(ExtraSupportedOutputSizeQuirk.class, z9)) {
                        arrayList2.add(new ExtraSupportedOutputSizeQuirk());
                    }
                    v9e v9eVar3 = ExtraSupportedSurfaceCombinationsQuirk.a;
                    str2 = Build.DEVICE;
                    if ("heroqltevzw".equalsIgnoreCase(str2)) {
                        z10 = true;
                    } else {
                        z10 = true;
                    }
                    if (h9bVar2.a(ExtraSupportedSurfaceCombinationsQuirk.class, z10)) {
                        arrayList2.add(new ExtraSupportedSurfaceCombinationsQuirk());
                    }
                    int i5 = Nexus4AndroidLTargetAspectRatioQuirk.a;
                    if (!str25.equalsIgnoreCase("Google")) {
                        String str213 = Build.BRAND;
                        str213.getClass();
                        str213.equalsIgnoreCase("Google");
                    }
                    if (h9bVar2.a(Nexus4AndroidLTargetAspectRatioQuirk.class, false)) {
                        arrayList2.add(new Nexus4AndroidLTargetAspectRatioQuirk());
                    }
                    List list26 = PreviewPixelHDRnetQuirk.a;
                    if (str25.equalsIgnoreCase("Google")) {
                        str8 = Build.BRAND;
                        str8.getClass();
                        if (str8.equalsIgnoreCase("Google")) {
                            list = PreviewPixelHDRnetQuirk.a;
                            str2.getClass();
                            Locale locale12 = Locale.getDefault();
                            locale12.getClass();
                            lowerCase3 = str2.toLowerCase(locale12);
                            lowerCase3.getClass();
                            if (list.contains(lowerCase3)) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                        } else {
                            z11 = false;
                        }
                    } else {
                        list = PreviewPixelHDRnetQuirk.a;
                        str2.getClass();
                        Locale locale13 = Locale.getDefault();
                        locale13.getClass();
                        lowerCase3 = str2.toLowerCase(locale13);
                        lowerCase3.getClass();
                        if (list.contains(lowerCase3)) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                    }
                    if (h9bVar2.a(PreviewPixelHDRnetQuirk.class, z11)) {
                        arrayList2.add(new PreviewPixelHDRnetQuirk());
                    }
                    if (!str25.equalsIgnoreCase("Huawei")) {
                        str7 = Build.BRAND;
                        str7.getClass();
                        if (!str7.equalsIgnoreCase("Huawei")) {
                            z12 = false;
                        } else if ("mha-l29".equalsIgnoreCase(str24)) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                    } else if ("mha-l29".equalsIgnoreCase(str24)) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (h9bVar2.a(RepeatingStreamConstraintForVideoRecordingQuirk.class, z12)) {
                        arrayList2.add(new RepeatingStreamConstraintForVideoRecordingQuirk());
                    }
                    if (str25.equalsIgnoreCase("Samsung")) {
                        str6 = Build.BRAND;
                        str6.getClass();
                        if (str6.equalsIgnoreCase("Samsung")) {
                            upperCase = str24.toUpperCase(locale2);
                            upperCase.getClass();
                            if (c5e.C(upperCase, "SM-A716", false)) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                        } else {
                            z13 = false;
                        }
                    } else {
                        upperCase = str24.toUpperCase(locale2);
                        upperCase.getClass();
                        if (c5e.C(upperCase, "SM-A716", false)) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                    }
                    if (h9bVar2.a(StillCaptureFlashStopRepeatingQuirk.class, z13)) {
                        arrayList2.add(new StillCaptureFlashStopRepeatingQuirk());
                    }
                    list2 = TorchIsClosedAfterImageCapturingQuirk.a;
                    lowerCase4 = str24.toLowerCase(locale2);
                    lowerCase4.getClass();
                    if (h9bVar2.a(TorchIsClosedAfterImageCapturingQuirk.class, list2.contains(lowerCase4))) {
                        arrayList2.add(new TorchIsClosedAfterImageCapturingQuirk());
                    }
                    List list27 = androidx.camera.camera2.compat.quirk.SurfaceOrderQuirk.a;
                    if (str25.equalsIgnoreCase("Samsung")) {
                        str5 = Build.BRAND;
                        str5.getClass();
                        if (str5.equalsIgnoreCase("Samsung")) {
                            list3 = androidx.camera.camera2.compat.quirk.SurfaceOrderQuirk.a;
                            String str214 = Build.HARDWARE;
                            str214.getClass();
                            Locale locale14 = Locale.getDefault();
                            locale14.getClass();
                            lowerCase5 = str214.toLowerCase(locale14);
                            lowerCase5.getClass();
                            if (list3.contains(lowerCase5)) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                        } else {
                            z14 = false;
                        }
                    } else {
                        list3 = androidx.camera.camera2.compat.quirk.SurfaceOrderQuirk.a;
                        String str215 = Build.HARDWARE;
                        str215.getClass();
                        Locale locale15 = Locale.getDefault();
                        locale15.getClass();
                        lowerCase5 = str215.toLowerCase(locale15);
                        lowerCase5.getClass();
                        if (list3.contains(lowerCase5)) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                    }
                    if (h9bVar2.a(androidx.camera.camera2.compat.quirk.SurfaceOrderQuirk.class, z14)) {
                        arrayList2.add(new androidx.camera.camera2.compat.quirk.SurfaceOrderQuirk());
                    }
                    if (h9bVar2.a(CaptureSessionOnClosedNotCalledQuirk.class, false)) {
                        arrayList2.add(new CaptureSessionOnClosedNotCalledQuirk());
                    }
                    List list28 = ZslDisablerQuirk.a;
                    if (!str25.equalsIgnoreCase("Samsung")) {
                        if (ndc.e(ZslDisablerQuirk.a)) {
                            if (!str25.equalsIgnoreCase("Xiaomi")) {
                                str3 = Build.BRAND;
                                str3.getClass();
                                if (str3.equalsIgnoreCase("Xiaomi")) {
                                    if (ndc.e(ZslDisablerQuirk.b)) {
                                    }
                                }
                            } else if (ndc.e(ZslDisablerQuirk.b)) {
                            }
                        }
                        if (h9bVar2.a(ZslDisablerQuirk.class, z17)) {
                            arrayList2.add(new ZslDisablerQuirk());
                        }
                        map = SmallDisplaySizeQuirk.a;
                        upperCase2 = str24.toUpperCase(locale2);
                        upperCase2.getClass();
                        if (h9bVar2.a(SmallDisplaySizeQuirk.class, map.containsKey(upperCase2))) {
                            arrayList2.add(new SmallDisplaySizeQuirk());
                        }
                        if (h9bVar2.a(PreviewUnderExposureQuirk.class, PreviewUnderExposureQuirk.b)) {
                            arrayList2.add(PreviewUnderExposureQuirk.a);
                        }
                        s74.a = new k9b(arrayList2);
                        b21.q("DeviceQuirks", "camera2 DeviceQuirks = " + k9b.d(s74.a()));
                    } else {
                        str4 = Build.BRAND;
                        str4.getClass();
                        if (str4.equalsIgnoreCase("Samsung")) {
                            if (ndc.e(ZslDisablerQuirk.a)) {
                                if (!str25.equalsIgnoreCase("Xiaomi")) {
                                    str3 = Build.BRAND;
                                    str3.getClass();
                                    if (str3.equalsIgnoreCase("Xiaomi")) {
                                        if (ndc.e(ZslDisablerQuirk.b)) {
                                        }
                                    }
                                } else if (ndc.e(ZslDisablerQuirk.b)) {
                                }
                            }
                        } else if (!str25.equalsIgnoreCase("Xiaomi")) {
                            str3 = Build.BRAND;
                            str3.getClass();
                            if (str3.equalsIgnoreCase("Xiaomi")) {
                                if (ndc.e(ZslDisablerQuirk.b)) {
                                }
                            }
                        } else if (ndc.e(ZslDisablerQuirk.b)) {
                        }
                        if (h9bVar2.a(ZslDisablerQuirk.class, z17)) {
                            arrayList2.add(new ZslDisablerQuirk());
                        }
                        map = SmallDisplaySizeQuirk.a;
                        upperCase2 = str24.toUpperCase(locale2);
                        upperCase2.getClass();
                        if (h9bVar2.a(SmallDisplaySizeQuirk.class, map.containsKey(upperCase2))) {
                            arrayList2.add(new SmallDisplaySizeQuirk());
                        }
                        if (h9bVar2.a(PreviewUnderExposureQuirk.class, PreviewUnderExposureQuirk.b)) {
                            arrayList2.add(PreviewUnderExposureQuirk.a);
                        }
                        s74.a = new k9b(arrayList2);
                        b21.q("DeviceQuirks", "camera2 DeviceQuirks = " + k9b.d(s74.a()));
                    }
                    z17 = true;
                    if (h9bVar2.a(ZslDisablerQuirk.class, z17)) {
                        arrayList2.add(new ZslDisablerQuirk());
                    }
                    map = SmallDisplaySizeQuirk.a;
                    upperCase2 = str24.toUpperCase(locale2);
                    upperCase2.getClass();
                    if (h9bVar2.a(SmallDisplaySizeQuirk.class, map.containsKey(upperCase2))) {
                        arrayList2.add(new SmallDisplaySizeQuirk());
                    }
                    if (h9bVar2.a(PreviewUnderExposureQuirk.class, PreviewUnderExposureQuirk.b)) {
                        arrayList2.add(PreviewUnderExposureQuirk.a);
                    }
                    s74.a = new k9b(arrayList2);
                    b21.q("DeviceQuirks", "camera2 DeviceQuirks = " + k9b.d(s74.a()));
                } else {
                    if (c5e.C(str24, "LS1542QW", true)) {
                        if (!str25.equalsIgnoreCase("Samsung")) {
                            str19 = Build.BRAND;
                            str19.getClass();
                            if (!str19.equalsIgnoreCase("Samsung")) {
                                if (!str25.equalsIgnoreCase("Vivo")) {
                                    str18 = Build.BRAND;
                                    str18.getClass();
                                    if (str18.equalsIgnoreCase("Vivo")) {
                                        if (str24.equalsIgnoreCase("VIVO 2039")) {
                                        }
                                    }
                                } else if (str24.equalsIgnoreCase("VIVO 2039")) {
                                }
                                z3 = false;
                            } else if (c5e.C(str24, "SM-A025", true)) {
                            }
                        } else if (c5e.C(str24, "SM-A025", true)) {
                        }
                    }
                    if (h9bVar2.a(ControlZoomRatioRangeAssertionErrorQuirk.class, z3)) {
                        arrayList2.add(new ControlZoomRatioRangeAssertionErrorQuirk());
                    }
                    boolean z19 = DisableAbortCapturesOnStopQuirk.a;
                    if (str25.equalsIgnoreCase("Tecno")) {
                        str17 = Build.BRAND;
                        str17.getClass();
                        if (!str17.equalsIgnoreCase("Tecno")) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                    } else {
                        z4 = true;
                    }
                    if (h9bVar2.a(DisableAbortCapturesOnStopQuirk.class, z4)) {
                        arrayList2.add(new DisableAbortCapturesOnStopQuirk());
                    }
                    if (str25.equalsIgnoreCase("Samsung")) {
                        str16 = Build.BRAND;
                        str16.getClass();
                        if (!str16.equalsIgnoreCase("Samsung")) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                    } else {
                        z5 = true;
                    }
                    if (h9bVar2.a(DisableAbortCapturesOnStopWithSessionProcessorQuirk.class, z5)) {
                        arrayList2.add(new DisableAbortCapturesOnStopWithSessionProcessorQuirk());
                    }
                    set = FlashAvailabilityBufferUnderflowQuirk.a;
                    Locale locale16 = Locale.US;
                    locale16.getClass();
                    lowerCase = str25.toLowerCase(locale16);
                    lowerCase.getClass();
                    lowerCase2 = str24.toLowerCase(locale16);
                    lowerCase2.getClass();
                    if (h9bVar2.a(FlashAvailabilityBufferUnderflowQuirk.class, set.contains(new pi5(lowerCase, lowerCase2)))) {
                        arrayList2.add(new FlashAvailabilityBufferUnderflowQuirk());
                    }
                    if (ImageCapturePixelHDRPlusQuirk.a.contains(str24)) {
                        z6 = false;
                    } else {
                        if (!str25.equalsIgnoreCase("Google")) {
                            str15 = Build.BRAND;
                            str15.getClass();
                            if (!str15.equalsIgnoreCase("Google")) {
                                z6 = false;
                            }
                        }
                        z6 = true;
                    }
                    if (h9bVar2.a(ImageCapturePixelHDRPlusQuirk.class, z6)) {
                        arrayList2.add(new ImageCapturePixelHDRPlusQuirk());
                    }
                    List list29 = InvalidVideoProfilesQuirk.a;
                    if (!str25.equalsIgnoreCase("Samsung")) {
                        str = Build.ID;
                        str.getClass();
                        if (c5e.C(str, "TP1A", true)) {
                            list4 = InvalidVideoProfilesQuirk.a;
                            lowerCase6 = str24.toLowerCase(locale2);
                            lowerCase6.getClass();
                            if (list4.contains(lowerCase6)) {
                                str13 = Build.ID;
                                str13.getClass();
                                if (!c5e.C(str13, "TP1A", true)) {
                                    str13.getClass();
                                    if (!c5e.C(str13, "TD1A", true)) {
                                        if (str25.equalsIgnoreCase("Redmi")) {
                                            str12 = Build.BRAND;
                                            str12.getClass();
                                            if (str12.equalsIgnoreCase("Redmi")) {
                                                z15 = true;
                                            } else {
                                                z15 = false;
                                            }
                                        } else {
                                            z15 = true;
                                        }
                                        if (str25.equalsIgnoreCase("Xiaomi")) {
                                            str11 = Build.BRAND;
                                            str11.getClass();
                                            if (str11.equalsIgnoreCase("Xiaomi")) {
                                                z16 = true;
                                            } else {
                                                z16 = false;
                                            }
                                        } else {
                                            z16 = true;
                                        }
                                        if (z15 || z16) {
                                            str10 = Build.ID;
                                            str10.getClass();
                                            if (!c5e.C(str10, "TKQ1", true)) {
                                                str10.getClass();
                                                if (c5e.C(str10, "TP1A", true)) {
                                                    list5 = InvalidVideoProfilesQuirk.c;
                                                    lowerCase7 = str24.toLowerCase(locale2);
                                                    lowerCase7.getClass();
                                                    if (list5.contains(lowerCase7)) {
                                                        List list1111 = InvalidVideoProfilesQuirk.b;
                                                        String lowerCase1111 = str24.toLowerCase(locale2);
                                                        lowerCase1111.getClass();
                                                        if (list1111.contains(lowerCase1111)) {
                                                        }
                                                    } else {
                                                        List list1112 = InvalidVideoProfilesQuirk.b;
                                                        String lowerCase1112 = str24.toLowerCase(locale2);
                                                        lowerCase1112.getClass();
                                                        if (list1112.contains(lowerCase1112)) {
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            list5 = InvalidVideoProfilesQuirk.c;
                                            lowerCase7 = str24.toLowerCase(locale2);
                                            lowerCase7.getClass();
                                            if (list5.contains(lowerCase7)) {
                                                List list1113 = InvalidVideoProfilesQuirk.b;
                                                String lowerCase1113 = str24.toLowerCase(locale2);
                                                lowerCase1113.getClass();
                                                if (list1113.contains(lowerCase1113)) {
                                                }
                                            } else {
                                                List list1114 = InvalidVideoProfilesQuirk.b;
                                                String lowerCase1114 = str24.toLowerCase(locale2);
                                                lowerCase1114.getClass();
                                                if (list1114.contains(lowerCase1114)) {
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                if (str25.equalsIgnoreCase("Redmi")) {
                                    str12 = Build.BRAND;
                                    str12.getClass();
                                    if (str12.equalsIgnoreCase("Redmi")) {
                                        z15 = true;
                                    } else {
                                        z15 = false;
                                    }
                                } else {
                                    z15 = true;
                                }
                                if (str25.equalsIgnoreCase("Xiaomi")) {
                                    str11 = Build.BRAND;
                                    str11.getClass();
                                    if (str11.equalsIgnoreCase("Xiaomi")) {
                                        z16 = true;
                                    } else {
                                        z16 = false;
                                    }
                                } else {
                                    z16 = true;
                                }
                                if (z15 || z16) {
                                    str10 = Build.ID;
                                    str10.getClass();
                                    if (!c5e.C(str10, "TKQ1", true)) {
                                        str10.getClass();
                                        if (c5e.C(str10, "TP1A", true)) {
                                            list5 = InvalidVideoProfilesQuirk.c;
                                            lowerCase7 = str24.toLowerCase(locale2);
                                            lowerCase7.getClass();
                                            if (list5.contains(lowerCase7)) {
                                                List list1115 = InvalidVideoProfilesQuirk.b;
                                                String lowerCase1115 = str24.toLowerCase(locale2);
                                                lowerCase1115.getClass();
                                                if (list1115.contains(lowerCase1115)) {
                                                }
                                            } else {
                                                List list1116 = InvalidVideoProfilesQuirk.b;
                                                String lowerCase1116 = str24.toLowerCase(locale2);
                                                lowerCase1116.getClass();
                                                if (list1116.contains(lowerCase1116)) {
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    list5 = InvalidVideoProfilesQuirk.c;
                                    lowerCase7 = str24.toLowerCase(locale2);
                                    lowerCase7.getClass();
                                    if (list5.contains(lowerCase7)) {
                                        List list1117 = InvalidVideoProfilesQuirk.b;
                                        String lowerCase1117 = str24.toLowerCase(locale2);
                                        lowerCase1117.getClass();
                                        if (list1117.contains(lowerCase1117)) {
                                        }
                                    } else {
                                        List list1118 = InvalidVideoProfilesQuirk.b;
                                        String lowerCase1118 = str24.toLowerCase(locale2);
                                        lowerCase1118.getClass();
                                        if (list1118.contains(lowerCase1118)) {
                                        }
                                    }
                                }
                            }
                        }
                        if (h9bVar2.a(InvalidVideoProfilesQuirk.class, z7)) {
                            arrayList2.add(new InvalidVideoProfilesQuirk());
                        }
                        if (z7f.O()) {
                            z8 = true;
                        } else {
                            z8 = true;
                        }
                        if (h9bVar2.a(ExcludedSupportedSizesQuirk.class, z8)) {
                            arrayList2.add(new ExcludedSupportedSizesQuirk());
                        }
                        LinkedHashMap linkedHashMap4 = ExtraCroppingQuirk.a;
                        if (h9bVar2.a(ExtraCroppingQuirk.class, vd0.g0())) {
                            arrayList2.add(new ExtraCroppingQuirk());
                        }
                        if (!str25.equalsIgnoreCase("Motorola")) {
                            str9 = Build.BRAND;
                            str9.getClass();
                            if (!str9.equalsIgnoreCase("Motorola")) {
                                z9 = false;
                            } else if ("moto e5 play".equalsIgnoreCase(str24)) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                        } else if ("moto e5 play".equalsIgnoreCase(str24)) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        if (h9bVar2.a(ExtraSupportedOutputSizeQuirk.class, z9)) {
                            arrayList2.add(new ExtraSupportedOutputSizeQuirk());
                        }
                        v9e v9eVar4 = ExtraSupportedSurfaceCombinationsQuirk.a;
                        str2 = Build.DEVICE;
                        if ("heroqltevzw".equalsIgnoreCase(str2)) {
                            z10 = true;
                        } else {
                            z10 = true;
                        }
                        if (h9bVar2.a(ExtraSupportedSurfaceCombinationsQuirk.class, z10)) {
                            arrayList2.add(new ExtraSupportedSurfaceCombinationsQuirk());
                        }
                        int i6 = Nexus4AndroidLTargetAspectRatioQuirk.a;
                        if (!str25.equalsIgnoreCase("Google")) {
                            String str216 = Build.BRAND;
                            str216.getClass();
                            str216.equalsIgnoreCase("Google");
                        }
                        if (h9bVar2.a(Nexus4AndroidLTargetAspectRatioQuirk.class, false)) {
                            arrayList2.add(new Nexus4AndroidLTargetAspectRatioQuirk());
                        }
                        List list210 = PreviewPixelHDRnetQuirk.a;
                        if (str25.equalsIgnoreCase("Google")) {
                            str8 = Build.BRAND;
                            str8.getClass();
                            if (str8.equalsIgnoreCase("Google")) {
                                list = PreviewPixelHDRnetQuirk.a;
                                str2.getClass();
                                Locale locale17 = Locale.getDefault();
                                locale17.getClass();
                                lowerCase3 = str2.toLowerCase(locale17);
                                lowerCase3.getClass();
                                if (list.contains(lowerCase3)) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                            } else {
                                z11 = false;
                            }
                        } else {
                            list = PreviewPixelHDRnetQuirk.a;
                            str2.getClass();
                            Locale locale18 = Locale.getDefault();
                            locale18.getClass();
                            lowerCase3 = str2.toLowerCase(locale18);
                            lowerCase3.getClass();
                            if (list.contains(lowerCase3)) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                        }
                        if (h9bVar2.a(PreviewPixelHDRnetQuirk.class, z11)) {
                            arrayList2.add(new PreviewPixelHDRnetQuirk());
                        }
                        if (!str25.equalsIgnoreCase("Huawei")) {
                            str7 = Build.BRAND;
                            str7.getClass();
                            if (!str7.equalsIgnoreCase("Huawei")) {
                                z12 = false;
                            } else if ("mha-l29".equalsIgnoreCase(str24)) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                        } else if ("mha-l29".equalsIgnoreCase(str24)) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (h9bVar2.a(RepeatingStreamConstraintForVideoRecordingQuirk.class, z12)) {
                            arrayList2.add(new RepeatingStreamConstraintForVideoRecordingQuirk());
                        }
                        if (str25.equalsIgnoreCase("Samsung")) {
                            str6 = Build.BRAND;
                            str6.getClass();
                            if (str6.equalsIgnoreCase("Samsung")) {
                                upperCase = str24.toUpperCase(locale2);
                                upperCase.getClass();
                                if (c5e.C(upperCase, "SM-A716", false)) {
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                            } else {
                                z13 = false;
                            }
                        } else {
                            upperCase = str24.toUpperCase(locale2);
                            upperCase.getClass();
                            if (c5e.C(upperCase, "SM-A716", false)) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                        }
                        if (h9bVar2.a(StillCaptureFlashStopRepeatingQuirk.class, z13)) {
                            arrayList2.add(new StillCaptureFlashStopRepeatingQuirk());
                        }
                        list2 = TorchIsClosedAfterImageCapturingQuirk.a;
                        lowerCase4 = str24.toLowerCase(locale2);
                        lowerCase4.getClass();
                        if (h9bVar2.a(TorchIsClosedAfterImageCapturingQuirk.class, list2.contains(lowerCase4))) {
                            arrayList2.add(new TorchIsClosedAfterImageCapturingQuirk());
                        }
                        List list211 = androidx.camera.camera2.compat.quirk.SurfaceOrderQuirk.a;
                        if (str25.equalsIgnoreCase("Samsung")) {
                            str5 = Build.BRAND;
                            str5.getClass();
                            if (str5.equalsIgnoreCase("Samsung")) {
                                list3 = androidx.camera.camera2.compat.quirk.SurfaceOrderQuirk.a;
                                String str217 = Build.HARDWARE;
                                str217.getClass();
                                Locale locale19 = Locale.getDefault();
                                locale19.getClass();
                                lowerCase5 = str217.toLowerCase(locale19);
                                lowerCase5.getClass();
                                if (list3.contains(lowerCase5)) {
                                    z14 = true;
                                } else {
                                    z14 = false;
                                }
                            } else {
                                z14 = false;
                            }
                        } else {
                            list3 = androidx.camera.camera2.compat.quirk.SurfaceOrderQuirk.a;
                            String str218 = Build.HARDWARE;
                            str218.getClass();
                            Locale locale110 = Locale.getDefault();
                            locale110.getClass();
                            lowerCase5 = str218.toLowerCase(locale110);
                            lowerCase5.getClass();
                            if (list3.contains(lowerCase5)) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                        }
                        if (h9bVar2.a(androidx.camera.camera2.compat.quirk.SurfaceOrderQuirk.class, z14)) {
                            arrayList2.add(new androidx.camera.camera2.compat.quirk.SurfaceOrderQuirk());
                        }
                        if (h9bVar2.a(CaptureSessionOnClosedNotCalledQuirk.class, false)) {
                            arrayList2.add(new CaptureSessionOnClosedNotCalledQuirk());
                        }
                        List list212 = ZslDisablerQuirk.a;
                        if (!str25.equalsIgnoreCase("Samsung")) {
                            if (ndc.e(ZslDisablerQuirk.a)) {
                                if (!str25.equalsIgnoreCase("Xiaomi")) {
                                    str3 = Build.BRAND;
                                    str3.getClass();
                                    if (str3.equalsIgnoreCase("Xiaomi")) {
                                        if (ndc.e(ZslDisablerQuirk.b)) {
                                        }
                                    }
                                } else if (ndc.e(ZslDisablerQuirk.b)) {
                                }
                            }
                            if (h9bVar2.a(ZslDisablerQuirk.class, z17)) {
                                arrayList2.add(new ZslDisablerQuirk());
                            }
                            map = SmallDisplaySizeQuirk.a;
                            upperCase2 = str24.toUpperCase(locale2);
                            upperCase2.getClass();
                            if (h9bVar2.a(SmallDisplaySizeQuirk.class, map.containsKey(upperCase2))) {
                                arrayList2.add(new SmallDisplaySizeQuirk());
                            }
                            if (h9bVar2.a(PreviewUnderExposureQuirk.class, PreviewUnderExposureQuirk.b)) {
                                arrayList2.add(PreviewUnderExposureQuirk.a);
                            }
                            s74.a = new k9b(arrayList2);
                            b21.q("DeviceQuirks", "camera2 DeviceQuirks = " + k9b.d(s74.a()));
                        } else {
                            str4 = Build.BRAND;
                            str4.getClass();
                            if (str4.equalsIgnoreCase("Samsung")) {
                                if (ndc.e(ZslDisablerQuirk.a)) {
                                    if (!str25.equalsIgnoreCase("Xiaomi")) {
                                        str3 = Build.BRAND;
                                        str3.getClass();
                                        if (str3.equalsIgnoreCase("Xiaomi")) {
                                            if (ndc.e(ZslDisablerQuirk.b)) {
                                            }
                                        }
                                    } else if (ndc.e(ZslDisablerQuirk.b)) {
                                    }
                                }
                            } else if (!str25.equalsIgnoreCase("Xiaomi")) {
                                str3 = Build.BRAND;
                                str3.getClass();
                                if (str3.equalsIgnoreCase("Xiaomi")) {
                                    if (ndc.e(ZslDisablerQuirk.b)) {
                                    }
                                }
                            } else if (ndc.e(ZslDisablerQuirk.b)) {
                            }
                            if (h9bVar2.a(ZslDisablerQuirk.class, z17)) {
                                arrayList2.add(new ZslDisablerQuirk());
                            }
                            map = SmallDisplaySizeQuirk.a;
                            upperCase2 = str24.toUpperCase(locale2);
                            upperCase2.getClass();
                            if (h9bVar2.a(SmallDisplaySizeQuirk.class, map.containsKey(upperCase2))) {
                                arrayList2.add(new SmallDisplaySizeQuirk());
                            }
                            if (h9bVar2.a(PreviewUnderExposureQuirk.class, PreviewUnderExposureQuirk.b)) {
                                arrayList2.add(PreviewUnderExposureQuirk.a);
                            }
                            s74.a = new k9b(arrayList2);
                            b21.q("DeviceQuirks", "camera2 DeviceQuirks = " + k9b.d(s74.a()));
                        }
                        z17 = true;
                        if (h9bVar2.a(ZslDisablerQuirk.class, z17)) {
                            arrayList2.add(new ZslDisablerQuirk());
                        }
                        map = SmallDisplaySizeQuirk.a;
                        upperCase2 = str24.toUpperCase(locale2);
                        upperCase2.getClass();
                        if (h9bVar2.a(SmallDisplaySizeQuirk.class, map.containsKey(upperCase2))) {
                            arrayList2.add(new SmallDisplaySizeQuirk());
                        }
                        if (h9bVar2.a(PreviewUnderExposureQuirk.class, PreviewUnderExposureQuirk.b)) {
                            arrayList2.add(PreviewUnderExposureQuirk.a);
                        }
                        s74.a = new k9b(arrayList2);
                        b21.q("DeviceQuirks", "camera2 DeviceQuirks = " + k9b.d(s74.a()));
                    } else {
                        str14 = Build.BRAND;
                        str14.getClass();
                        if (str14.equalsIgnoreCase("Samsung")) {
                            str = Build.ID;
                            str.getClass();
                            if (c5e.C(str, "TP1A", true)) {
                                list4 = InvalidVideoProfilesQuirk.a;
                                lowerCase6 = str24.toLowerCase(locale2);
                                lowerCase6.getClass();
                                if (list4.contains(lowerCase6)) {
                                    str13 = Build.ID;
                                    str13.getClass();
                                    if (!c5e.C(str13, "TP1A", true)) {
                                        str13.getClass();
                                        if (!c5e.C(str13, "TD1A", true)) {
                                            if (str25.equalsIgnoreCase("Redmi")) {
                                                str12 = Build.BRAND;
                                                str12.getClass();
                                                if (str12.equalsIgnoreCase("Redmi")) {
                                                    z15 = true;
                                                } else {
                                                    z15 = false;
                                                }
                                            } else {
                                                z15 = true;
                                            }
                                            if (str25.equalsIgnoreCase("Xiaomi")) {
                                                str11 = Build.BRAND;
                                                str11.getClass();
                                                if (str11.equalsIgnoreCase("Xiaomi")) {
                                                    z16 = true;
                                                } else {
                                                    z16 = false;
                                                }
                                            } else {
                                                z16 = true;
                                            }
                                            if (z15 || z16) {
                                                str10 = Build.ID;
                                                str10.getClass();
                                                if (!c5e.C(str10, "TKQ1", true)) {
                                                    str10.getClass();
                                                    if (c5e.C(str10, "TP1A", true)) {
                                                        list5 = InvalidVideoProfilesQuirk.c;
                                                        lowerCase7 = str24.toLowerCase(locale2);
                                                        lowerCase7.getClass();
                                                        if (list5.contains(lowerCase7)) {
                                                            List list1119 = InvalidVideoProfilesQuirk.b;
                                                            String lowerCase1119 = str24.toLowerCase(locale2);
                                                            lowerCase1119.getClass();
                                                            if (list1119.contains(lowerCase1119)) {
                                                            }
                                                        } else {
                                                            List list11110 = InvalidVideoProfilesQuirk.b;
                                                            String lowerCase11110 = str24.toLowerCase(locale2);
                                                            lowerCase11110.getClass();
                                                            if (list11110.contains(lowerCase11110)) {
                                                            }
                                                        }
                                                    }
                                                }
                                            } else {
                                                list5 = InvalidVideoProfilesQuirk.c;
                                                lowerCase7 = str24.toLowerCase(locale2);
                                                lowerCase7.getClass();
                                                if (list5.contains(lowerCase7)) {
                                                    List list11111 = InvalidVideoProfilesQuirk.b;
                                                    String lowerCase11111 = str24.toLowerCase(locale2);
                                                    lowerCase11111.getClass();
                                                    if (list11111.contains(lowerCase11111)) {
                                                    }
                                                } else {
                                                    List list11112 = InvalidVideoProfilesQuirk.b;
                                                    String lowerCase11112 = str24.toLowerCase(locale2);
                                                    lowerCase11112.getClass();
                                                    if (list11112.contains(lowerCase11112)) {
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    if (str25.equalsIgnoreCase("Redmi")) {
                                        str12 = Build.BRAND;
                                        str12.getClass();
                                        if (str12.equalsIgnoreCase("Redmi")) {
                                            z15 = true;
                                        } else {
                                            z15 = false;
                                        }
                                    } else {
                                        z15 = true;
                                    }
                                    if (str25.equalsIgnoreCase("Xiaomi")) {
                                        str11 = Build.BRAND;
                                        str11.getClass();
                                        if (str11.equalsIgnoreCase("Xiaomi")) {
                                            z16 = true;
                                        } else {
                                            z16 = false;
                                        }
                                    } else {
                                        z16 = true;
                                    }
                                    if (z15 || z16) {
                                        str10 = Build.ID;
                                        str10.getClass();
                                        if (!c5e.C(str10, "TKQ1", true)) {
                                            str10.getClass();
                                            if (c5e.C(str10, "TP1A", true)) {
                                                list5 = InvalidVideoProfilesQuirk.c;
                                                lowerCase7 = str24.toLowerCase(locale2);
                                                lowerCase7.getClass();
                                                if (list5.contains(lowerCase7)) {
                                                    List list11113 = InvalidVideoProfilesQuirk.b;
                                                    String lowerCase11113 = str24.toLowerCase(locale2);
                                                    lowerCase11113.getClass();
                                                    if (list11113.contains(lowerCase11113)) {
                                                    }
                                                } else {
                                                    List list11114 = InvalidVideoProfilesQuirk.b;
                                                    String lowerCase11114 = str24.toLowerCase(locale2);
                                                    lowerCase11114.getClass();
                                                    if (list11114.contains(lowerCase11114)) {
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        list5 = InvalidVideoProfilesQuirk.c;
                                        lowerCase7 = str24.toLowerCase(locale2);
                                        lowerCase7.getClass();
                                        if (list5.contains(lowerCase7)) {
                                            List list11115 = InvalidVideoProfilesQuirk.b;
                                            String lowerCase11115 = str24.toLowerCase(locale2);
                                            lowerCase11115.getClass();
                                            if (list11115.contains(lowerCase11115)) {
                                            }
                                        } else {
                                            List list11116 = InvalidVideoProfilesQuirk.b;
                                            String lowerCase11116 = str24.toLowerCase(locale2);
                                            lowerCase11116.getClass();
                                            if (list11116.contains(lowerCase11116)) {
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            list4 = InvalidVideoProfilesQuirk.a;
                            lowerCase6 = str24.toLowerCase(locale2);
                            lowerCase6.getClass();
                            if (list4.contains(lowerCase6)) {
                                str13 = Build.ID;
                                str13.getClass();
                                if (!c5e.C(str13, "TP1A", true)) {
                                    str13.getClass();
                                    if (!c5e.C(str13, "TD1A", true)) {
                                        if (str25.equalsIgnoreCase("Redmi")) {
                                            str12 = Build.BRAND;
                                            str12.getClass();
                                            if (str12.equalsIgnoreCase("Redmi")) {
                                                z15 = true;
                                            } else {
                                                z15 = false;
                                            }
                                        } else {
                                            z15 = true;
                                        }
                                        if (str25.equalsIgnoreCase("Xiaomi")) {
                                            str11 = Build.BRAND;
                                            str11.getClass();
                                            if (str11.equalsIgnoreCase("Xiaomi")) {
                                                z16 = true;
                                            } else {
                                                z16 = false;
                                            }
                                        } else {
                                            z16 = true;
                                        }
                                        if (z15 || z16) {
                                            str10 = Build.ID;
                                            str10.getClass();
                                            if (!c5e.C(str10, "TKQ1", true)) {
                                                str10.getClass();
                                                if (c5e.C(str10, "TP1A", true)) {
                                                    list5 = InvalidVideoProfilesQuirk.c;
                                                    lowerCase7 = str24.toLowerCase(locale2);
                                                    lowerCase7.getClass();
                                                    if (list5.contains(lowerCase7)) {
                                                        List list11117 = InvalidVideoProfilesQuirk.b;
                                                        String lowerCase11117 = str24.toLowerCase(locale2);
                                                        lowerCase11117.getClass();
                                                        if (list11117.contains(lowerCase11117)) {
                                                        }
                                                    } else {
                                                        List list11118 = InvalidVideoProfilesQuirk.b;
                                                        String lowerCase11118 = str24.toLowerCase(locale2);
                                                        lowerCase11118.getClass();
                                                        if (list11118.contains(lowerCase11118)) {
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            list5 = InvalidVideoProfilesQuirk.c;
                                            lowerCase7 = str24.toLowerCase(locale2);
                                            lowerCase7.getClass();
                                            if (list5.contains(lowerCase7)) {
                                                List list11119 = InvalidVideoProfilesQuirk.b;
                                                String lowerCase11119 = str24.toLowerCase(locale2);
                                                lowerCase11119.getClass();
                                                if (list11119.contains(lowerCase11119)) {
                                                }
                                            } else {
                                                List list111110 = InvalidVideoProfilesQuirk.b;
                                                String lowerCase111110 = str24.toLowerCase(locale2);
                                                lowerCase111110.getClass();
                                                if (list111110.contains(lowerCase111110)) {
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                if (str25.equalsIgnoreCase("Redmi")) {
                                    str12 = Build.BRAND;
                                    str12.getClass();
                                    if (str12.equalsIgnoreCase("Redmi")) {
                                        z15 = true;
                                    } else {
                                        z15 = false;
                                    }
                                } else {
                                    z15 = true;
                                }
                                if (str25.equalsIgnoreCase("Xiaomi")) {
                                    str11 = Build.BRAND;
                                    str11.getClass();
                                    if (str11.equalsIgnoreCase("Xiaomi")) {
                                        z16 = true;
                                    } else {
                                        z16 = false;
                                    }
                                } else {
                                    z16 = true;
                                }
                                if (z15 || z16) {
                                    str10 = Build.ID;
                                    str10.getClass();
                                    if (!c5e.C(str10, "TKQ1", true)) {
                                        str10.getClass();
                                        if (c5e.C(str10, "TP1A", true)) {
                                            list5 = InvalidVideoProfilesQuirk.c;
                                            lowerCase7 = str24.toLowerCase(locale2);
                                            lowerCase7.getClass();
                                            if (list5.contains(lowerCase7)) {
                                                List list111111 = InvalidVideoProfilesQuirk.b;
                                                String lowerCase111111 = str24.toLowerCase(locale2);
                                                lowerCase111111.getClass();
                                                if (list111111.contains(lowerCase111111)) {
                                                }
                                            } else {
                                                List list111112 = InvalidVideoProfilesQuirk.b;
                                                String lowerCase111112 = str24.toLowerCase(locale2);
                                                lowerCase111112.getClass();
                                                if (list111112.contains(lowerCase111112)) {
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    list5 = InvalidVideoProfilesQuirk.c;
                                    lowerCase7 = str24.toLowerCase(locale2);
                                    lowerCase7.getClass();
                                    if (list5.contains(lowerCase7)) {
                                        List list111113 = InvalidVideoProfilesQuirk.b;
                                        String lowerCase111113 = str24.toLowerCase(locale2);
                                        lowerCase111113.getClass();
                                        if (list111113.contains(lowerCase111113)) {
                                        }
                                    } else {
                                        List list111114 = InvalidVideoProfilesQuirk.b;
                                        String lowerCase111114 = str24.toLowerCase(locale2);
                                        lowerCase111114.getClass();
                                        if (list111114.contains(lowerCase111114)) {
                                        }
                                    }
                                }
                            }
                        }
                        if (h9bVar2.a(InvalidVideoProfilesQuirk.class, z7)) {
                            arrayList2.add(new InvalidVideoProfilesQuirk());
                        }
                        if (z7f.O()) {
                            z8 = true;
                        } else {
                            z8 = true;
                        }
                        if (h9bVar2.a(ExcludedSupportedSizesQuirk.class, z8)) {
                            arrayList2.add(new ExcludedSupportedSizesQuirk());
                        }
                        LinkedHashMap linkedHashMap5 = ExtraCroppingQuirk.a;
                        if (h9bVar2.a(ExtraCroppingQuirk.class, vd0.g0())) {
                            arrayList2.add(new ExtraCroppingQuirk());
                        }
                        if (!str25.equalsIgnoreCase("Motorola")) {
                            str9 = Build.BRAND;
                            str9.getClass();
                            if (!str9.equalsIgnoreCase("Motorola")) {
                                z9 = false;
                            } else if ("moto e5 play".equalsIgnoreCase(str24)) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                        } else if ("moto e5 play".equalsIgnoreCase(str24)) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        if (h9bVar2.a(ExtraSupportedOutputSizeQuirk.class, z9)) {
                            arrayList2.add(new ExtraSupportedOutputSizeQuirk());
                        }
                        v9e v9eVar5 = ExtraSupportedSurfaceCombinationsQuirk.a;
                        str2 = Build.DEVICE;
                        if ("heroqltevzw".equalsIgnoreCase(str2)) {
                            z10 = true;
                        } else {
                            z10 = true;
                        }
                        if (h9bVar2.a(ExtraSupportedSurfaceCombinationsQuirk.class, z10)) {
                            arrayList2.add(new ExtraSupportedSurfaceCombinationsQuirk());
                        }
                        int i7 = Nexus4AndroidLTargetAspectRatioQuirk.a;
                        if (!str25.equalsIgnoreCase("Google")) {
                            String str219 = Build.BRAND;
                            str219.getClass();
                            str219.equalsIgnoreCase("Google");
                        }
                        if (h9bVar2.a(Nexus4AndroidLTargetAspectRatioQuirk.class, false)) {
                            arrayList2.add(new Nexus4AndroidLTargetAspectRatioQuirk());
                        }
                        List list213 = PreviewPixelHDRnetQuirk.a;
                        if (str25.equalsIgnoreCase("Google")) {
                            str8 = Build.BRAND;
                            str8.getClass();
                            if (str8.equalsIgnoreCase("Google")) {
                                list = PreviewPixelHDRnetQuirk.a;
                                str2.getClass();
                                Locale locale111 = Locale.getDefault();
                                locale111.getClass();
                                lowerCase3 = str2.toLowerCase(locale111);
                                lowerCase3.getClass();
                                if (list.contains(lowerCase3)) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                            } else {
                                z11 = false;
                            }
                        } else {
                            list = PreviewPixelHDRnetQuirk.a;
                            str2.getClass();
                            Locale locale112 = Locale.getDefault();
                            locale112.getClass();
                            lowerCase3 = str2.toLowerCase(locale112);
                            lowerCase3.getClass();
                            if (list.contains(lowerCase3)) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                        }
                        if (h9bVar2.a(PreviewPixelHDRnetQuirk.class, z11)) {
                            arrayList2.add(new PreviewPixelHDRnetQuirk());
                        }
                        if (!str25.equalsIgnoreCase("Huawei")) {
                            str7 = Build.BRAND;
                            str7.getClass();
                            if (!str7.equalsIgnoreCase("Huawei")) {
                                z12 = false;
                            } else if ("mha-l29".equalsIgnoreCase(str24)) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                        } else if ("mha-l29".equalsIgnoreCase(str24)) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (h9bVar2.a(RepeatingStreamConstraintForVideoRecordingQuirk.class, z12)) {
                            arrayList2.add(new RepeatingStreamConstraintForVideoRecordingQuirk());
                        }
                        if (str25.equalsIgnoreCase("Samsung")) {
                            str6 = Build.BRAND;
                            str6.getClass();
                            if (str6.equalsIgnoreCase("Samsung")) {
                                upperCase = str24.toUpperCase(locale2);
                                upperCase.getClass();
                                if (c5e.C(upperCase, "SM-A716", false)) {
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                            } else {
                                z13 = false;
                            }
                        } else {
                            upperCase = str24.toUpperCase(locale2);
                            upperCase.getClass();
                            if (c5e.C(upperCase, "SM-A716", false)) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                        }
                        if (h9bVar2.a(StillCaptureFlashStopRepeatingQuirk.class, z13)) {
                            arrayList2.add(new StillCaptureFlashStopRepeatingQuirk());
                        }
                        list2 = TorchIsClosedAfterImageCapturingQuirk.a;
                        lowerCase4 = str24.toLowerCase(locale2);
                        lowerCase4.getClass();
                        if (h9bVar2.a(TorchIsClosedAfterImageCapturingQuirk.class, list2.contains(lowerCase4))) {
                            arrayList2.add(new TorchIsClosedAfterImageCapturingQuirk());
                        }
                        List list214 = androidx.camera.camera2.compat.quirk.SurfaceOrderQuirk.a;
                        if (str25.equalsIgnoreCase("Samsung")) {
                            str5 = Build.BRAND;
                            str5.getClass();
                            if (str5.equalsIgnoreCase("Samsung")) {
                                list3 = androidx.camera.camera2.compat.quirk.SurfaceOrderQuirk.a;
                                String str2110 = Build.HARDWARE;
                                str2110.getClass();
                                Locale locale113 = Locale.getDefault();
                                locale113.getClass();
                                lowerCase5 = str2110.toLowerCase(locale113);
                                lowerCase5.getClass();
                                if (list3.contains(lowerCase5)) {
                                    z14 = true;
                                } else {
                                    z14 = false;
                                }
                            } else {
                                z14 = false;
                            }
                        } else {
                            list3 = androidx.camera.camera2.compat.quirk.SurfaceOrderQuirk.a;
                            String str2111 = Build.HARDWARE;
                            str2111.getClass();
                            Locale locale114 = Locale.getDefault();
                            locale114.getClass();
                            lowerCase5 = str2111.toLowerCase(locale114);
                            lowerCase5.getClass();
                            if (list3.contains(lowerCase5)) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                        }
                        if (h9bVar2.a(androidx.camera.camera2.compat.quirk.SurfaceOrderQuirk.class, z14)) {
                            arrayList2.add(new androidx.camera.camera2.compat.quirk.SurfaceOrderQuirk());
                        }
                        if (h9bVar2.a(CaptureSessionOnClosedNotCalledQuirk.class, false)) {
                            arrayList2.add(new CaptureSessionOnClosedNotCalledQuirk());
                        }
                        List list215 = ZslDisablerQuirk.a;
                        if (!str25.equalsIgnoreCase("Samsung")) {
                            if (ndc.e(ZslDisablerQuirk.a)) {
                                if (!str25.equalsIgnoreCase("Xiaomi")) {
                                    str3 = Build.BRAND;
                                    str3.getClass();
                                    if (str3.equalsIgnoreCase("Xiaomi")) {
                                        if (ndc.e(ZslDisablerQuirk.b)) {
                                        }
                                    }
                                } else if (ndc.e(ZslDisablerQuirk.b)) {
                                }
                            }
                            if (h9bVar2.a(ZslDisablerQuirk.class, z17)) {
                                arrayList2.add(new ZslDisablerQuirk());
                            }
                            map = SmallDisplaySizeQuirk.a;
                            upperCase2 = str24.toUpperCase(locale2);
                            upperCase2.getClass();
                            if (h9bVar2.a(SmallDisplaySizeQuirk.class, map.containsKey(upperCase2))) {
                                arrayList2.add(new SmallDisplaySizeQuirk());
                            }
                            if (h9bVar2.a(PreviewUnderExposureQuirk.class, PreviewUnderExposureQuirk.b)) {
                                arrayList2.add(PreviewUnderExposureQuirk.a);
                            }
                            s74.a = new k9b(arrayList2);
                            b21.q("DeviceQuirks", "camera2 DeviceQuirks = " + k9b.d(s74.a()));
                        } else {
                            str4 = Build.BRAND;
                            str4.getClass();
                            if (str4.equalsIgnoreCase("Samsung")) {
                                if (ndc.e(ZslDisablerQuirk.a)) {
                                    if (!str25.equalsIgnoreCase("Xiaomi")) {
                                        str3 = Build.BRAND;
                                        str3.getClass();
                                        if (str3.equalsIgnoreCase("Xiaomi")) {
                                            if (ndc.e(ZslDisablerQuirk.b)) {
                                            }
                                        }
                                    } else if (ndc.e(ZslDisablerQuirk.b)) {
                                    }
                                }
                            } else if (!str25.equalsIgnoreCase("Xiaomi")) {
                                str3 = Build.BRAND;
                                str3.getClass();
                                if (str3.equalsIgnoreCase("Xiaomi")) {
                                    if (ndc.e(ZslDisablerQuirk.b)) {
                                    }
                                }
                            } else if (ndc.e(ZslDisablerQuirk.b)) {
                            }
                            if (h9bVar2.a(ZslDisablerQuirk.class, z17)) {
                                arrayList2.add(new ZslDisablerQuirk());
                            }
                            map = SmallDisplaySizeQuirk.a;
                            upperCase2 = str24.toUpperCase(locale2);
                            upperCase2.getClass();
                            if (h9bVar2.a(SmallDisplaySizeQuirk.class, map.containsKey(upperCase2))) {
                                arrayList2.add(new SmallDisplaySizeQuirk());
                            }
                            if (h9bVar2.a(PreviewUnderExposureQuirk.class, PreviewUnderExposureQuirk.b)) {
                                arrayList2.add(PreviewUnderExposureQuirk.a);
                            }
                            s74.a = new k9b(arrayList2);
                            b21.q("DeviceQuirks", "camera2 DeviceQuirks = " + k9b.d(s74.a()));
                        }
                        z17 = true;
                        if (h9bVar2.a(ZslDisablerQuirk.class, z17)) {
                            arrayList2.add(new ZslDisablerQuirk());
                        }
                        map = SmallDisplaySizeQuirk.a;
                        upperCase2 = str24.toUpperCase(locale2);
                        upperCase2.getClass();
                        if (h9bVar2.a(SmallDisplaySizeQuirk.class, map.containsKey(upperCase2))) {
                            arrayList2.add(new SmallDisplaySizeQuirk());
                        }
                        if (h9bVar2.a(PreviewUnderExposureQuirk.class, PreviewUnderExposureQuirk.b)) {
                            arrayList2.add(PreviewUnderExposureQuirk.a);
                        }
                        s74.a = new k9b(arrayList2);
                        b21.q("DeviceQuirks", "camera2 DeviceQuirks = " + k9b.d(s74.a()));
                    }
                    if (h9bVar2.a(InvalidVideoProfilesQuirk.class, z7)) {
                        arrayList2.add(new InvalidVideoProfilesQuirk());
                    }
                    if (z7f.O()) {
                        z8 = true;
                    } else {
                        z8 = true;
                    }
                    if (h9bVar2.a(ExcludedSupportedSizesQuirk.class, z8)) {
                        arrayList2.add(new ExcludedSupportedSizesQuirk());
                    }
                    LinkedHashMap linkedHashMap6 = ExtraCroppingQuirk.a;
                    if (h9bVar2.a(ExtraCroppingQuirk.class, vd0.g0())) {
                        arrayList2.add(new ExtraCroppingQuirk());
                    }
                    if (!str25.equalsIgnoreCase("Motorola")) {
                        str9 = Build.BRAND;
                        str9.getClass();
                        if (!str9.equalsIgnoreCase("Motorola")) {
                            z9 = false;
                        } else if ("moto e5 play".equalsIgnoreCase(str24)) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                    } else if ("moto e5 play".equalsIgnoreCase(str24)) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if (h9bVar2.a(ExtraSupportedOutputSizeQuirk.class, z9)) {
                        arrayList2.add(new ExtraSupportedOutputSizeQuirk());
                    }
                    v9e v9eVar6 = ExtraSupportedSurfaceCombinationsQuirk.a;
                    str2 = Build.DEVICE;
                    if ("heroqltevzw".equalsIgnoreCase(str2)) {
                        z10 = true;
                    } else {
                        z10 = true;
                    }
                    if (h9bVar2.a(ExtraSupportedSurfaceCombinationsQuirk.class, z10)) {
                        arrayList2.add(new ExtraSupportedSurfaceCombinationsQuirk());
                    }
                    int i8 = Nexus4AndroidLTargetAspectRatioQuirk.a;
                    if (!str25.equalsIgnoreCase("Google")) {
                        String str2112 = Build.BRAND;
                        str2112.getClass();
                        str2112.equalsIgnoreCase("Google");
                    }
                    if (h9bVar2.a(Nexus4AndroidLTargetAspectRatioQuirk.class, false)) {
                        arrayList2.add(new Nexus4AndroidLTargetAspectRatioQuirk());
                    }
                    List list216 = PreviewPixelHDRnetQuirk.a;
                    if (str25.equalsIgnoreCase("Google")) {
                        str8 = Build.BRAND;
                        str8.getClass();
                        if (str8.equalsIgnoreCase("Google")) {
                            list = PreviewPixelHDRnetQuirk.a;
                            str2.getClass();
                            Locale locale115 = Locale.getDefault();
                            locale115.getClass();
                            lowerCase3 = str2.toLowerCase(locale115);
                            lowerCase3.getClass();
                            if (list.contains(lowerCase3)) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                        } else {
                            z11 = false;
                        }
                    } else {
                        list = PreviewPixelHDRnetQuirk.a;
                        str2.getClass();
                        Locale locale116 = Locale.getDefault();
                        locale116.getClass();
                        lowerCase3 = str2.toLowerCase(locale116);
                        lowerCase3.getClass();
                        if (list.contains(lowerCase3)) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                    }
                    if (h9bVar2.a(PreviewPixelHDRnetQuirk.class, z11)) {
                        arrayList2.add(new PreviewPixelHDRnetQuirk());
                    }
                    if (!str25.equalsIgnoreCase("Huawei")) {
                        str7 = Build.BRAND;
                        str7.getClass();
                        if (!str7.equalsIgnoreCase("Huawei")) {
                            z12 = false;
                        } else if ("mha-l29".equalsIgnoreCase(str24)) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                    } else if ("mha-l29".equalsIgnoreCase(str24)) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (h9bVar2.a(RepeatingStreamConstraintForVideoRecordingQuirk.class, z12)) {
                        arrayList2.add(new RepeatingStreamConstraintForVideoRecordingQuirk());
                    }
                    if (str25.equalsIgnoreCase("Samsung")) {
                        str6 = Build.BRAND;
                        str6.getClass();
                        if (str6.equalsIgnoreCase("Samsung")) {
                            upperCase = str24.toUpperCase(locale2);
                            upperCase.getClass();
                            if (c5e.C(upperCase, "SM-A716", false)) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                        } else {
                            z13 = false;
                        }
                    } else {
                        upperCase = str24.toUpperCase(locale2);
                        upperCase.getClass();
                        if (c5e.C(upperCase, "SM-A716", false)) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                    }
                    if (h9bVar2.a(StillCaptureFlashStopRepeatingQuirk.class, z13)) {
                        arrayList2.add(new StillCaptureFlashStopRepeatingQuirk());
                    }
                    list2 = TorchIsClosedAfterImageCapturingQuirk.a;
                    lowerCase4 = str24.toLowerCase(locale2);
                    lowerCase4.getClass();
                    if (h9bVar2.a(TorchIsClosedAfterImageCapturingQuirk.class, list2.contains(lowerCase4))) {
                        arrayList2.add(new TorchIsClosedAfterImageCapturingQuirk());
                    }
                    List list217 = androidx.camera.camera2.compat.quirk.SurfaceOrderQuirk.a;
                    if (str25.equalsIgnoreCase("Samsung")) {
                        str5 = Build.BRAND;
                        str5.getClass();
                        if (str5.equalsIgnoreCase("Samsung")) {
                            list3 = androidx.camera.camera2.compat.quirk.SurfaceOrderQuirk.a;
                            String str2113 = Build.HARDWARE;
                            str2113.getClass();
                            Locale locale117 = Locale.getDefault();
                            locale117.getClass();
                            lowerCase5 = str2113.toLowerCase(locale117);
                            lowerCase5.getClass();
                            if (list3.contains(lowerCase5)) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                        } else {
                            z14 = false;
                        }
                    } else {
                        list3 = androidx.camera.camera2.compat.quirk.SurfaceOrderQuirk.a;
                        String str2114 = Build.HARDWARE;
                        str2114.getClass();
                        Locale locale118 = Locale.getDefault();
                        locale118.getClass();
                        lowerCase5 = str2114.toLowerCase(locale118);
                        lowerCase5.getClass();
                        if (list3.contains(lowerCase5)) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                    }
                    if (h9bVar2.a(androidx.camera.camera2.compat.quirk.SurfaceOrderQuirk.class, z14)) {
                        arrayList2.add(new androidx.camera.camera2.compat.quirk.SurfaceOrderQuirk());
                    }
                    if (h9bVar2.a(CaptureSessionOnClosedNotCalledQuirk.class, false)) {
                        arrayList2.add(new CaptureSessionOnClosedNotCalledQuirk());
                    }
                    List list218 = ZslDisablerQuirk.a;
                    if (!str25.equalsIgnoreCase("Samsung")) {
                        if (ndc.e(ZslDisablerQuirk.a)) {
                            if (!str25.equalsIgnoreCase("Xiaomi")) {
                                str3 = Build.BRAND;
                                str3.getClass();
                                if (str3.equalsIgnoreCase("Xiaomi")) {
                                    if (ndc.e(ZslDisablerQuirk.b)) {
                                    }
                                }
                            } else if (ndc.e(ZslDisablerQuirk.b)) {
                            }
                        }
                        if (h9bVar2.a(ZslDisablerQuirk.class, z17)) {
                            arrayList2.add(new ZslDisablerQuirk());
                        }
                        map = SmallDisplaySizeQuirk.a;
                        upperCase2 = str24.toUpperCase(locale2);
                        upperCase2.getClass();
                        if (h9bVar2.a(SmallDisplaySizeQuirk.class, map.containsKey(upperCase2))) {
                            arrayList2.add(new SmallDisplaySizeQuirk());
                        }
                        if (h9bVar2.a(PreviewUnderExposureQuirk.class, PreviewUnderExposureQuirk.b)) {
                            arrayList2.add(PreviewUnderExposureQuirk.a);
                        }
                        s74.a = new k9b(arrayList2);
                        b21.q("DeviceQuirks", "camera2 DeviceQuirks = " + k9b.d(s74.a()));
                    } else {
                        str4 = Build.BRAND;
                        str4.getClass();
                        if (str4.equalsIgnoreCase("Samsung")) {
                            if (ndc.e(ZslDisablerQuirk.a)) {
                                if (!str25.equalsIgnoreCase("Xiaomi")) {
                                    str3 = Build.BRAND;
                                    str3.getClass();
                                    if (str3.equalsIgnoreCase("Xiaomi")) {
                                        if (ndc.e(ZslDisablerQuirk.b)) {
                                        }
                                    }
                                } else if (ndc.e(ZslDisablerQuirk.b)) {
                                }
                            }
                        } else if (!str25.equalsIgnoreCase("Xiaomi")) {
                            str3 = Build.BRAND;
                            str3.getClass();
                            if (str3.equalsIgnoreCase("Xiaomi")) {
                                if (ndc.e(ZslDisablerQuirk.b)) {
                                }
                            }
                        } else if (ndc.e(ZslDisablerQuirk.b)) {
                        }
                        if (h9bVar2.a(ZslDisablerQuirk.class, z17)) {
                            arrayList2.add(new ZslDisablerQuirk());
                        }
                        map = SmallDisplaySizeQuirk.a;
                        upperCase2 = str24.toUpperCase(locale2);
                        upperCase2.getClass();
                        if (h9bVar2.a(SmallDisplaySizeQuirk.class, map.containsKey(upperCase2))) {
                            arrayList2.add(new SmallDisplaySizeQuirk());
                        }
                        if (h9bVar2.a(PreviewUnderExposureQuirk.class, PreviewUnderExposureQuirk.b)) {
                            arrayList2.add(PreviewUnderExposureQuirk.a);
                        }
                        s74.a = new k9b(arrayList2);
                        b21.q("DeviceQuirks", "camera2 DeviceQuirks = " + k9b.d(s74.a()));
                    }
                    z17 = true;
                    if (h9bVar2.a(ZslDisablerQuirk.class, z17)) {
                        arrayList2.add(new ZslDisablerQuirk());
                    }
                    map = SmallDisplaySizeQuirk.a;
                    upperCase2 = str24.toUpperCase(locale2);
                    upperCase2.getClass();
                    if (h9bVar2.a(SmallDisplaySizeQuirk.class, map.containsKey(upperCase2))) {
                        arrayList2.add(new SmallDisplaySizeQuirk());
                    }
                    if (h9bVar2.a(PreviewUnderExposureQuirk.class, PreviewUnderExposureQuirk.b)) {
                        arrayList2.add(PreviewUnderExposureQuirk.a);
                    }
                    s74.a = new k9b(arrayList2);
                    b21.q("DeviceQuirks", "camera2 DeviceQuirks = " + k9b.d(s74.a()));
                }
                z3 = true;
                if (h9bVar2.a(ControlZoomRatioRangeAssertionErrorQuirk.class, z3)) {
                    arrayList2.add(new ControlZoomRatioRangeAssertionErrorQuirk());
                }
                boolean z110 = DisableAbortCapturesOnStopQuirk.a;
                if (str25.equalsIgnoreCase("Tecno")) {
                    str17 = Build.BRAND;
                    str17.getClass();
                    if (!str17.equalsIgnoreCase("Tecno")) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                } else {
                    z4 = true;
                }
                if (h9bVar2.a(DisableAbortCapturesOnStopQuirk.class, z4)) {
                    arrayList2.add(new DisableAbortCapturesOnStopQuirk());
                }
                if (str25.equalsIgnoreCase("Samsung")) {
                    str16 = Build.BRAND;
                    str16.getClass();
                    if (!str16.equalsIgnoreCase("Samsung")) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                } else {
                    z5 = true;
                }
                if (h9bVar2.a(DisableAbortCapturesOnStopWithSessionProcessorQuirk.class, z5)) {
                    arrayList2.add(new DisableAbortCapturesOnStopWithSessionProcessorQuirk());
                }
                set = FlashAvailabilityBufferUnderflowQuirk.a;
                Locale locale119 = Locale.US;
                locale119.getClass();
                lowerCase = str25.toLowerCase(locale119);
                lowerCase.getClass();
                lowerCase2 = str24.toLowerCase(locale119);
                lowerCase2.getClass();
                if (h9bVar2.a(FlashAvailabilityBufferUnderflowQuirk.class, set.contains(new pi5(lowerCase, lowerCase2)))) {
                    arrayList2.add(new FlashAvailabilityBufferUnderflowQuirk());
                }
                if (ImageCapturePixelHDRPlusQuirk.a.contains(str24)) {
                    z6 = false;
                } else {
                    if (!str25.equalsIgnoreCase("Google")) {
                        str15 = Build.BRAND;
                        str15.getClass();
                        if (!str15.equalsIgnoreCase("Google")) {
                            z6 = false;
                        }
                    }
                    z6 = true;
                }
                if (h9bVar2.a(ImageCapturePixelHDRPlusQuirk.class, z6)) {
                    arrayList2.add(new ImageCapturePixelHDRPlusQuirk());
                }
                List list219 = InvalidVideoProfilesQuirk.a;
                if (!str25.equalsIgnoreCase("Samsung")) {
                    str = Build.ID;
                    str.getClass();
                    if (c5e.C(str, "TP1A", true)) {
                        list4 = InvalidVideoProfilesQuirk.a;
                        lowerCase6 = str24.toLowerCase(locale2);
                        lowerCase6.getClass();
                        if (list4.contains(lowerCase6)) {
                            str13 = Build.ID;
                            str13.getClass();
                            if (!c5e.C(str13, "TP1A", true)) {
                                str13.getClass();
                                if (!c5e.C(str13, "TD1A", true)) {
                                    if (str25.equalsIgnoreCase("Redmi")) {
                                        str12 = Build.BRAND;
                                        str12.getClass();
                                        if (str12.equalsIgnoreCase("Redmi")) {
                                            z15 = true;
                                        } else {
                                            z15 = false;
                                        }
                                    } else {
                                        z15 = true;
                                    }
                                    if (str25.equalsIgnoreCase("Xiaomi")) {
                                        str11 = Build.BRAND;
                                        str11.getClass();
                                        if (str11.equalsIgnoreCase("Xiaomi")) {
                                            z16 = true;
                                        } else {
                                            z16 = false;
                                        }
                                    } else {
                                        z16 = true;
                                    }
                                    if (z15 || z16) {
                                        str10 = Build.ID;
                                        str10.getClass();
                                        if (!c5e.C(str10, "TKQ1", true)) {
                                            str10.getClass();
                                            if (c5e.C(str10, "TP1A", true)) {
                                                list5 = InvalidVideoProfilesQuirk.c;
                                                lowerCase7 = str24.toLowerCase(locale2);
                                                lowerCase7.getClass();
                                                if (list5.contains(lowerCase7)) {
                                                    List list111115 = InvalidVideoProfilesQuirk.b;
                                                    String lowerCase111115 = str24.toLowerCase(locale2);
                                                    lowerCase111115.getClass();
                                                    if (list111115.contains(lowerCase111115)) {
                                                    }
                                                } else {
                                                    List list111116 = InvalidVideoProfilesQuirk.b;
                                                    String lowerCase111116 = str24.toLowerCase(locale2);
                                                    lowerCase111116.getClass();
                                                    if (list111116.contains(lowerCase111116)) {
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        list5 = InvalidVideoProfilesQuirk.c;
                                        lowerCase7 = str24.toLowerCase(locale2);
                                        lowerCase7.getClass();
                                        if (list5.contains(lowerCase7)) {
                                            List list111117 = InvalidVideoProfilesQuirk.b;
                                            String lowerCase111117 = str24.toLowerCase(locale2);
                                            lowerCase111117.getClass();
                                            if (list111117.contains(lowerCase111117)) {
                                            }
                                        } else {
                                            List list111118 = InvalidVideoProfilesQuirk.b;
                                            String lowerCase111118 = str24.toLowerCase(locale2);
                                            lowerCase111118.getClass();
                                            if (list111118.contains(lowerCase111118)) {
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            if (str25.equalsIgnoreCase("Redmi")) {
                                str12 = Build.BRAND;
                                str12.getClass();
                                if (str12.equalsIgnoreCase("Redmi")) {
                                    z15 = true;
                                } else {
                                    z15 = false;
                                }
                            } else {
                                z15 = true;
                            }
                            if (str25.equalsIgnoreCase("Xiaomi")) {
                                str11 = Build.BRAND;
                                str11.getClass();
                                if (str11.equalsIgnoreCase("Xiaomi")) {
                                    z16 = true;
                                } else {
                                    z16 = false;
                                }
                            } else {
                                z16 = true;
                            }
                            if (z15 || z16) {
                                str10 = Build.ID;
                                str10.getClass();
                                if (!c5e.C(str10, "TKQ1", true)) {
                                    str10.getClass();
                                    if (c5e.C(str10, "TP1A", true)) {
                                        list5 = InvalidVideoProfilesQuirk.c;
                                        lowerCase7 = str24.toLowerCase(locale2);
                                        lowerCase7.getClass();
                                        if (list5.contains(lowerCase7)) {
                                            List list111119 = InvalidVideoProfilesQuirk.b;
                                            String lowerCase111119 = str24.toLowerCase(locale2);
                                            lowerCase111119.getClass();
                                            if (list111119.contains(lowerCase111119)) {
                                            }
                                        } else {
                                            List list1111110 = InvalidVideoProfilesQuirk.b;
                                            String lowerCase1111110 = str24.toLowerCase(locale2);
                                            lowerCase1111110.getClass();
                                            if (list1111110.contains(lowerCase1111110)) {
                                            }
                                        }
                                    }
                                }
                            } else {
                                list5 = InvalidVideoProfilesQuirk.c;
                                lowerCase7 = str24.toLowerCase(locale2);
                                lowerCase7.getClass();
                                if (list5.contains(lowerCase7)) {
                                    List list1111111 = InvalidVideoProfilesQuirk.b;
                                    String lowerCase1111111 = str24.toLowerCase(locale2);
                                    lowerCase1111111.getClass();
                                    if (list1111111.contains(lowerCase1111111)) {
                                    }
                                } else {
                                    List list1111112 = InvalidVideoProfilesQuirk.b;
                                    String lowerCase1111112 = str24.toLowerCase(locale2);
                                    lowerCase1111112.getClass();
                                    if (list1111112.contains(lowerCase1111112)) {
                                    }
                                }
                            }
                        }
                    }
                    if (h9bVar2.a(InvalidVideoProfilesQuirk.class, z7)) {
                        arrayList2.add(new InvalidVideoProfilesQuirk());
                    }
                    if (z7f.O()) {
                        z8 = true;
                    } else {
                        z8 = true;
                    }
                    if (h9bVar2.a(ExcludedSupportedSizesQuirk.class, z8)) {
                        arrayList2.add(new ExcludedSupportedSizesQuirk());
                    }
                    LinkedHashMap linkedHashMap7 = ExtraCroppingQuirk.a;
                    if (h9bVar2.a(ExtraCroppingQuirk.class, vd0.g0())) {
                        arrayList2.add(new ExtraCroppingQuirk());
                    }
                    if (!str25.equalsIgnoreCase("Motorola")) {
                        str9 = Build.BRAND;
                        str9.getClass();
                        if (!str9.equalsIgnoreCase("Motorola")) {
                            z9 = false;
                        } else if ("moto e5 play".equalsIgnoreCase(str24)) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                    } else if ("moto e5 play".equalsIgnoreCase(str24)) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if (h9bVar2.a(ExtraSupportedOutputSizeQuirk.class, z9)) {
                        arrayList2.add(new ExtraSupportedOutputSizeQuirk());
                    }
                    v9e v9eVar7 = ExtraSupportedSurfaceCombinationsQuirk.a;
                    str2 = Build.DEVICE;
                    if ("heroqltevzw".equalsIgnoreCase(str2)) {
                        z10 = true;
                    } else {
                        z10 = true;
                    }
                    if (h9bVar2.a(ExtraSupportedSurfaceCombinationsQuirk.class, z10)) {
                        arrayList2.add(new ExtraSupportedSurfaceCombinationsQuirk());
                    }
                    int i9 = Nexus4AndroidLTargetAspectRatioQuirk.a;
                    if (!str25.equalsIgnoreCase("Google")) {
                        String str2115 = Build.BRAND;
                        str2115.getClass();
                        str2115.equalsIgnoreCase("Google");
                    }
                    if (h9bVar2.a(Nexus4AndroidLTargetAspectRatioQuirk.class, false)) {
                        arrayList2.add(new Nexus4AndroidLTargetAspectRatioQuirk());
                    }
                    List list2110 = PreviewPixelHDRnetQuirk.a;
                    if (str25.equalsIgnoreCase("Google")) {
                        str8 = Build.BRAND;
                        str8.getClass();
                        if (str8.equalsIgnoreCase("Google")) {
                            list = PreviewPixelHDRnetQuirk.a;
                            str2.getClass();
                            Locale locale1110 = Locale.getDefault();
                            locale1110.getClass();
                            lowerCase3 = str2.toLowerCase(locale1110);
                            lowerCase3.getClass();
                            if (list.contains(lowerCase3)) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                        } else {
                            z11 = false;
                        }
                    } else {
                        list = PreviewPixelHDRnetQuirk.a;
                        str2.getClass();
                        Locale locale1111 = Locale.getDefault();
                        locale1111.getClass();
                        lowerCase3 = str2.toLowerCase(locale1111);
                        lowerCase3.getClass();
                        if (list.contains(lowerCase3)) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                    }
                    if (h9bVar2.a(PreviewPixelHDRnetQuirk.class, z11)) {
                        arrayList2.add(new PreviewPixelHDRnetQuirk());
                    }
                    if (!str25.equalsIgnoreCase("Huawei")) {
                        str7 = Build.BRAND;
                        str7.getClass();
                        if (!str7.equalsIgnoreCase("Huawei")) {
                            z12 = false;
                        } else if ("mha-l29".equalsIgnoreCase(str24)) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                    } else if ("mha-l29".equalsIgnoreCase(str24)) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (h9bVar2.a(RepeatingStreamConstraintForVideoRecordingQuirk.class, z12)) {
                        arrayList2.add(new RepeatingStreamConstraintForVideoRecordingQuirk());
                    }
                    if (str25.equalsIgnoreCase("Samsung")) {
                        str6 = Build.BRAND;
                        str6.getClass();
                        if (str6.equalsIgnoreCase("Samsung")) {
                            upperCase = str24.toUpperCase(locale2);
                            upperCase.getClass();
                            if (c5e.C(upperCase, "SM-A716", false)) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                        } else {
                            z13 = false;
                        }
                    } else {
                        upperCase = str24.toUpperCase(locale2);
                        upperCase.getClass();
                        if (c5e.C(upperCase, "SM-A716", false)) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                    }
                    if (h9bVar2.a(StillCaptureFlashStopRepeatingQuirk.class, z13)) {
                        arrayList2.add(new StillCaptureFlashStopRepeatingQuirk());
                    }
                    list2 = TorchIsClosedAfterImageCapturingQuirk.a;
                    lowerCase4 = str24.toLowerCase(locale2);
                    lowerCase4.getClass();
                    if (h9bVar2.a(TorchIsClosedAfterImageCapturingQuirk.class, list2.contains(lowerCase4))) {
                        arrayList2.add(new TorchIsClosedAfterImageCapturingQuirk());
                    }
                    List list2111 = androidx.camera.camera2.compat.quirk.SurfaceOrderQuirk.a;
                    if (str25.equalsIgnoreCase("Samsung")) {
                        str5 = Build.BRAND;
                        str5.getClass();
                        if (str5.equalsIgnoreCase("Samsung")) {
                            list3 = androidx.camera.camera2.compat.quirk.SurfaceOrderQuirk.a;
                            String str2116 = Build.HARDWARE;
                            str2116.getClass();
                            Locale locale1112 = Locale.getDefault();
                            locale1112.getClass();
                            lowerCase5 = str2116.toLowerCase(locale1112);
                            lowerCase5.getClass();
                            if (list3.contains(lowerCase5)) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                        } else {
                            z14 = false;
                        }
                    } else {
                        list3 = androidx.camera.camera2.compat.quirk.SurfaceOrderQuirk.a;
                        String str2117 = Build.HARDWARE;
                        str2117.getClass();
                        Locale locale1113 = Locale.getDefault();
                        locale1113.getClass();
                        lowerCase5 = str2117.toLowerCase(locale1113);
                        lowerCase5.getClass();
                        if (list3.contains(lowerCase5)) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                    }
                    if (h9bVar2.a(androidx.camera.camera2.compat.quirk.SurfaceOrderQuirk.class, z14)) {
                        arrayList2.add(new androidx.camera.camera2.compat.quirk.SurfaceOrderQuirk());
                    }
                    if (h9bVar2.a(CaptureSessionOnClosedNotCalledQuirk.class, false)) {
                        arrayList2.add(new CaptureSessionOnClosedNotCalledQuirk());
                    }
                    List list2112 = ZslDisablerQuirk.a;
                    if (!str25.equalsIgnoreCase("Samsung")) {
                        if (ndc.e(ZslDisablerQuirk.a)) {
                            if (!str25.equalsIgnoreCase("Xiaomi")) {
                                str3 = Build.BRAND;
                                str3.getClass();
                                if (str3.equalsIgnoreCase("Xiaomi")) {
                                    if (ndc.e(ZslDisablerQuirk.b)) {
                                    }
                                }
                            } else if (ndc.e(ZslDisablerQuirk.b)) {
                            }
                        }
                        if (h9bVar2.a(ZslDisablerQuirk.class, z17)) {
                            arrayList2.add(new ZslDisablerQuirk());
                        }
                        map = SmallDisplaySizeQuirk.a;
                        upperCase2 = str24.toUpperCase(locale2);
                        upperCase2.getClass();
                        if (h9bVar2.a(SmallDisplaySizeQuirk.class, map.containsKey(upperCase2))) {
                            arrayList2.add(new SmallDisplaySizeQuirk());
                        }
                        if (h9bVar2.a(PreviewUnderExposureQuirk.class, PreviewUnderExposureQuirk.b)) {
                            arrayList2.add(PreviewUnderExposureQuirk.a);
                        }
                        s74.a = new k9b(arrayList2);
                        b21.q("DeviceQuirks", "camera2 DeviceQuirks = " + k9b.d(s74.a()));
                    } else {
                        str4 = Build.BRAND;
                        str4.getClass();
                        if (str4.equalsIgnoreCase("Samsung")) {
                            if (ndc.e(ZslDisablerQuirk.a)) {
                                if (!str25.equalsIgnoreCase("Xiaomi")) {
                                    str3 = Build.BRAND;
                                    str3.getClass();
                                    if (str3.equalsIgnoreCase("Xiaomi")) {
                                        if (ndc.e(ZslDisablerQuirk.b)) {
                                        }
                                    }
                                } else if (ndc.e(ZslDisablerQuirk.b)) {
                                }
                            }
                        } else if (!str25.equalsIgnoreCase("Xiaomi")) {
                            str3 = Build.BRAND;
                            str3.getClass();
                            if (str3.equalsIgnoreCase("Xiaomi")) {
                                if (ndc.e(ZslDisablerQuirk.b)) {
                                }
                            }
                        } else if (ndc.e(ZslDisablerQuirk.b)) {
                        }
                        if (h9bVar2.a(ZslDisablerQuirk.class, z17)) {
                            arrayList2.add(new ZslDisablerQuirk());
                        }
                        map = SmallDisplaySizeQuirk.a;
                        upperCase2 = str24.toUpperCase(locale2);
                        upperCase2.getClass();
                        if (h9bVar2.a(SmallDisplaySizeQuirk.class, map.containsKey(upperCase2))) {
                            arrayList2.add(new SmallDisplaySizeQuirk());
                        }
                        if (h9bVar2.a(PreviewUnderExposureQuirk.class, PreviewUnderExposureQuirk.b)) {
                            arrayList2.add(PreviewUnderExposureQuirk.a);
                        }
                        s74.a = new k9b(arrayList2);
                        b21.q("DeviceQuirks", "camera2 DeviceQuirks = " + k9b.d(s74.a()));
                    }
                    z17 = true;
                    if (h9bVar2.a(ZslDisablerQuirk.class, z17)) {
                        arrayList2.add(new ZslDisablerQuirk());
                    }
                    map = SmallDisplaySizeQuirk.a;
                    upperCase2 = str24.toUpperCase(locale2);
                    upperCase2.getClass();
                    if (h9bVar2.a(SmallDisplaySizeQuirk.class, map.containsKey(upperCase2))) {
                        arrayList2.add(new SmallDisplaySizeQuirk());
                    }
                    if (h9bVar2.a(PreviewUnderExposureQuirk.class, PreviewUnderExposureQuirk.b)) {
                        arrayList2.add(PreviewUnderExposureQuirk.a);
                    }
                    s74.a = new k9b(arrayList2);
                    b21.q("DeviceQuirks", "camera2 DeviceQuirks = " + k9b.d(s74.a()));
                } else {
                    str14 = Build.BRAND;
                    str14.getClass();
                    if (str14.equalsIgnoreCase("Samsung")) {
                        str = Build.ID;
                        str.getClass();
                        if (c5e.C(str, "TP1A", true)) {
                            list4 = InvalidVideoProfilesQuirk.a;
                            lowerCase6 = str24.toLowerCase(locale2);
                            lowerCase6.getClass();
                            if (list4.contains(lowerCase6)) {
                                str13 = Build.ID;
                                str13.getClass();
                                if (!c5e.C(str13, "TP1A", true)) {
                                    str13.getClass();
                                    if (!c5e.C(str13, "TD1A", true)) {
                                        if (str25.equalsIgnoreCase("Redmi")) {
                                            str12 = Build.BRAND;
                                            str12.getClass();
                                            if (str12.equalsIgnoreCase("Redmi")) {
                                                z15 = true;
                                            } else {
                                                z15 = false;
                                            }
                                        } else {
                                            z15 = true;
                                        }
                                        if (str25.equalsIgnoreCase("Xiaomi")) {
                                            str11 = Build.BRAND;
                                            str11.getClass();
                                            if (str11.equalsIgnoreCase("Xiaomi")) {
                                                z16 = true;
                                            } else {
                                                z16 = false;
                                            }
                                        } else {
                                            z16 = true;
                                        }
                                        if (z15 || z16) {
                                            str10 = Build.ID;
                                            str10.getClass();
                                            if (!c5e.C(str10, "TKQ1", true)) {
                                                str10.getClass();
                                                if (c5e.C(str10, "TP1A", true)) {
                                                    list5 = InvalidVideoProfilesQuirk.c;
                                                    lowerCase7 = str24.toLowerCase(locale2);
                                                    lowerCase7.getClass();
                                                    if (list5.contains(lowerCase7)) {
                                                        List list1111113 = InvalidVideoProfilesQuirk.b;
                                                        String lowerCase1111113 = str24.toLowerCase(locale2);
                                                        lowerCase1111113.getClass();
                                                        if (list1111113.contains(lowerCase1111113)) {
                                                        }
                                                    } else {
                                                        List list1111114 = InvalidVideoProfilesQuirk.b;
                                                        String lowerCase1111114 = str24.toLowerCase(locale2);
                                                        lowerCase1111114.getClass();
                                                        if (list1111114.contains(lowerCase1111114)) {
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            list5 = InvalidVideoProfilesQuirk.c;
                                            lowerCase7 = str24.toLowerCase(locale2);
                                            lowerCase7.getClass();
                                            if (list5.contains(lowerCase7)) {
                                                List list1111115 = InvalidVideoProfilesQuirk.b;
                                                String lowerCase1111115 = str24.toLowerCase(locale2);
                                                lowerCase1111115.getClass();
                                                if (list1111115.contains(lowerCase1111115)) {
                                                }
                                            } else {
                                                List list1111116 = InvalidVideoProfilesQuirk.b;
                                                String lowerCase1111116 = str24.toLowerCase(locale2);
                                                lowerCase1111116.getClass();
                                                if (list1111116.contains(lowerCase1111116)) {
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                if (str25.equalsIgnoreCase("Redmi")) {
                                    str12 = Build.BRAND;
                                    str12.getClass();
                                    if (str12.equalsIgnoreCase("Redmi")) {
                                        z15 = true;
                                    } else {
                                        z15 = false;
                                    }
                                } else {
                                    z15 = true;
                                }
                                if (str25.equalsIgnoreCase("Xiaomi")) {
                                    str11 = Build.BRAND;
                                    str11.getClass();
                                    if (str11.equalsIgnoreCase("Xiaomi")) {
                                        z16 = true;
                                    } else {
                                        z16 = false;
                                    }
                                } else {
                                    z16 = true;
                                }
                                if (z15 || z16) {
                                    str10 = Build.ID;
                                    str10.getClass();
                                    if (!c5e.C(str10, "TKQ1", true)) {
                                        str10.getClass();
                                        if (c5e.C(str10, "TP1A", true)) {
                                            list5 = InvalidVideoProfilesQuirk.c;
                                            lowerCase7 = str24.toLowerCase(locale2);
                                            lowerCase7.getClass();
                                            if (list5.contains(lowerCase7)) {
                                                List list1111117 = InvalidVideoProfilesQuirk.b;
                                                String lowerCase1111117 = str24.toLowerCase(locale2);
                                                lowerCase1111117.getClass();
                                                if (list1111117.contains(lowerCase1111117)) {
                                                }
                                            } else {
                                                List list1111118 = InvalidVideoProfilesQuirk.b;
                                                String lowerCase1111118 = str24.toLowerCase(locale2);
                                                lowerCase1111118.getClass();
                                                if (list1111118.contains(lowerCase1111118)) {
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    list5 = InvalidVideoProfilesQuirk.c;
                                    lowerCase7 = str24.toLowerCase(locale2);
                                    lowerCase7.getClass();
                                    if (list5.contains(lowerCase7)) {
                                        List list1111119 = InvalidVideoProfilesQuirk.b;
                                        String lowerCase1111119 = str24.toLowerCase(locale2);
                                        lowerCase1111119.getClass();
                                        if (list1111119.contains(lowerCase1111119)) {
                                        }
                                    } else {
                                        List list11111110 = InvalidVideoProfilesQuirk.b;
                                        String lowerCase11111110 = str24.toLowerCase(locale2);
                                        lowerCase11111110.getClass();
                                        if (list11111110.contains(lowerCase11111110)) {
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        list4 = InvalidVideoProfilesQuirk.a;
                        lowerCase6 = str24.toLowerCase(locale2);
                        lowerCase6.getClass();
                        if (list4.contains(lowerCase6)) {
                            str13 = Build.ID;
                            str13.getClass();
                            if (!c5e.C(str13, "TP1A", true)) {
                                str13.getClass();
                                if (!c5e.C(str13, "TD1A", true)) {
                                    if (str25.equalsIgnoreCase("Redmi")) {
                                        str12 = Build.BRAND;
                                        str12.getClass();
                                        if (str12.equalsIgnoreCase("Redmi")) {
                                            z15 = true;
                                        } else {
                                            z15 = false;
                                        }
                                    } else {
                                        z15 = true;
                                    }
                                    if (str25.equalsIgnoreCase("Xiaomi")) {
                                        str11 = Build.BRAND;
                                        str11.getClass();
                                        if (str11.equalsIgnoreCase("Xiaomi")) {
                                            z16 = true;
                                        } else {
                                            z16 = false;
                                        }
                                    } else {
                                        z16 = true;
                                    }
                                    if (z15 || z16) {
                                        str10 = Build.ID;
                                        str10.getClass();
                                        if (!c5e.C(str10, "TKQ1", true)) {
                                            str10.getClass();
                                            if (c5e.C(str10, "TP1A", true)) {
                                                list5 = InvalidVideoProfilesQuirk.c;
                                                lowerCase7 = str24.toLowerCase(locale2);
                                                lowerCase7.getClass();
                                                if (list5.contains(lowerCase7)) {
                                                    List list11111111 = InvalidVideoProfilesQuirk.b;
                                                    String lowerCase11111111 = str24.toLowerCase(locale2);
                                                    lowerCase11111111.getClass();
                                                    if (list11111111.contains(lowerCase11111111)) {
                                                    }
                                                } else {
                                                    List list11111112 = InvalidVideoProfilesQuirk.b;
                                                    String lowerCase11111112 = str24.toLowerCase(locale2);
                                                    lowerCase11111112.getClass();
                                                    if (list11111112.contains(lowerCase11111112)) {
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        list5 = InvalidVideoProfilesQuirk.c;
                                        lowerCase7 = str24.toLowerCase(locale2);
                                        lowerCase7.getClass();
                                        if (list5.contains(lowerCase7)) {
                                            List list11111113 = InvalidVideoProfilesQuirk.b;
                                            String lowerCase11111113 = str24.toLowerCase(locale2);
                                            lowerCase11111113.getClass();
                                            if (list11111113.contains(lowerCase11111113)) {
                                            }
                                        } else {
                                            List list11111114 = InvalidVideoProfilesQuirk.b;
                                            String lowerCase11111114 = str24.toLowerCase(locale2);
                                            lowerCase11111114.getClass();
                                            if (list11111114.contains(lowerCase11111114)) {
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            if (str25.equalsIgnoreCase("Redmi")) {
                                str12 = Build.BRAND;
                                str12.getClass();
                                if (str12.equalsIgnoreCase("Redmi")) {
                                    z15 = true;
                                } else {
                                    z15 = false;
                                }
                            } else {
                                z15 = true;
                            }
                            if (str25.equalsIgnoreCase("Xiaomi")) {
                                str11 = Build.BRAND;
                                str11.getClass();
                                if (str11.equalsIgnoreCase("Xiaomi")) {
                                    z16 = true;
                                } else {
                                    z16 = false;
                                }
                            } else {
                                z16 = true;
                            }
                            if (z15 || z16) {
                                str10 = Build.ID;
                                str10.getClass();
                                if (!c5e.C(str10, "TKQ1", true)) {
                                    str10.getClass();
                                    if (c5e.C(str10, "TP1A", true)) {
                                        list5 = InvalidVideoProfilesQuirk.c;
                                        lowerCase7 = str24.toLowerCase(locale2);
                                        lowerCase7.getClass();
                                        if (list5.contains(lowerCase7)) {
                                            List list11111115 = InvalidVideoProfilesQuirk.b;
                                            String lowerCase11111115 = str24.toLowerCase(locale2);
                                            lowerCase11111115.getClass();
                                            if (list11111115.contains(lowerCase11111115)) {
                                            }
                                        } else {
                                            List list11111116 = InvalidVideoProfilesQuirk.b;
                                            String lowerCase11111116 = str24.toLowerCase(locale2);
                                            lowerCase11111116.getClass();
                                            if (list11111116.contains(lowerCase11111116)) {
                                            }
                                        }
                                    }
                                }
                            } else {
                                list5 = InvalidVideoProfilesQuirk.c;
                                lowerCase7 = str24.toLowerCase(locale2);
                                lowerCase7.getClass();
                                if (list5.contains(lowerCase7)) {
                                    List list11111117 = InvalidVideoProfilesQuirk.b;
                                    String lowerCase11111117 = str24.toLowerCase(locale2);
                                    lowerCase11111117.getClass();
                                    if (list11111117.contains(lowerCase11111117)) {
                                    }
                                } else {
                                    List list11111118 = InvalidVideoProfilesQuirk.b;
                                    String lowerCase11111118 = str24.toLowerCase(locale2);
                                    lowerCase11111118.getClass();
                                    if (list11111118.contains(lowerCase11111118)) {
                                    }
                                }
                            }
                        }
                    }
                    if (h9bVar2.a(InvalidVideoProfilesQuirk.class, z7)) {
                        arrayList2.add(new InvalidVideoProfilesQuirk());
                    }
                    if (z7f.O()) {
                        z8 = true;
                    } else {
                        z8 = true;
                    }
                    if (h9bVar2.a(ExcludedSupportedSizesQuirk.class, z8)) {
                        arrayList2.add(new ExcludedSupportedSizesQuirk());
                    }
                    LinkedHashMap linkedHashMap8 = ExtraCroppingQuirk.a;
                    if (h9bVar2.a(ExtraCroppingQuirk.class, vd0.g0())) {
                        arrayList2.add(new ExtraCroppingQuirk());
                    }
                    if (!str25.equalsIgnoreCase("Motorola")) {
                        str9 = Build.BRAND;
                        str9.getClass();
                        if (!str9.equalsIgnoreCase("Motorola")) {
                            z9 = false;
                        } else if ("moto e5 play".equalsIgnoreCase(str24)) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                    } else if ("moto e5 play".equalsIgnoreCase(str24)) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if (h9bVar2.a(ExtraSupportedOutputSizeQuirk.class, z9)) {
                        arrayList2.add(new ExtraSupportedOutputSizeQuirk());
                    }
                    v9e v9eVar8 = ExtraSupportedSurfaceCombinationsQuirk.a;
                    str2 = Build.DEVICE;
                    if ("heroqltevzw".equalsIgnoreCase(str2)) {
                        z10 = true;
                    } else {
                        z10 = true;
                    }
                    if (h9bVar2.a(ExtraSupportedSurfaceCombinationsQuirk.class, z10)) {
                        arrayList2.add(new ExtraSupportedSurfaceCombinationsQuirk());
                    }
                    int i10 = Nexus4AndroidLTargetAspectRatioQuirk.a;
                    if (!str25.equalsIgnoreCase("Google")) {
                        String str2118 = Build.BRAND;
                        str2118.getClass();
                        str2118.equalsIgnoreCase("Google");
                    }
                    if (h9bVar2.a(Nexus4AndroidLTargetAspectRatioQuirk.class, false)) {
                        arrayList2.add(new Nexus4AndroidLTargetAspectRatioQuirk());
                    }
                    List list2113 = PreviewPixelHDRnetQuirk.a;
                    if (str25.equalsIgnoreCase("Google")) {
                        str8 = Build.BRAND;
                        str8.getClass();
                        if (str8.equalsIgnoreCase("Google")) {
                            list = PreviewPixelHDRnetQuirk.a;
                            str2.getClass();
                            Locale locale1114 = Locale.getDefault();
                            locale1114.getClass();
                            lowerCase3 = str2.toLowerCase(locale1114);
                            lowerCase3.getClass();
                            if (list.contains(lowerCase3)) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                        } else {
                            z11 = false;
                        }
                    } else {
                        list = PreviewPixelHDRnetQuirk.a;
                        str2.getClass();
                        Locale locale1115 = Locale.getDefault();
                        locale1115.getClass();
                        lowerCase3 = str2.toLowerCase(locale1115);
                        lowerCase3.getClass();
                        if (list.contains(lowerCase3)) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                    }
                    if (h9bVar2.a(PreviewPixelHDRnetQuirk.class, z11)) {
                        arrayList2.add(new PreviewPixelHDRnetQuirk());
                    }
                    if (!str25.equalsIgnoreCase("Huawei")) {
                        str7 = Build.BRAND;
                        str7.getClass();
                        if (!str7.equalsIgnoreCase("Huawei")) {
                            z12 = false;
                        } else if ("mha-l29".equalsIgnoreCase(str24)) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                    } else if ("mha-l29".equalsIgnoreCase(str24)) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (h9bVar2.a(RepeatingStreamConstraintForVideoRecordingQuirk.class, z12)) {
                        arrayList2.add(new RepeatingStreamConstraintForVideoRecordingQuirk());
                    }
                    if (str25.equalsIgnoreCase("Samsung")) {
                        str6 = Build.BRAND;
                        str6.getClass();
                        if (str6.equalsIgnoreCase("Samsung")) {
                            upperCase = str24.toUpperCase(locale2);
                            upperCase.getClass();
                            if (c5e.C(upperCase, "SM-A716", false)) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                        } else {
                            z13 = false;
                        }
                    } else {
                        upperCase = str24.toUpperCase(locale2);
                        upperCase.getClass();
                        if (c5e.C(upperCase, "SM-A716", false)) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                    }
                    if (h9bVar2.a(StillCaptureFlashStopRepeatingQuirk.class, z13)) {
                        arrayList2.add(new StillCaptureFlashStopRepeatingQuirk());
                    }
                    list2 = TorchIsClosedAfterImageCapturingQuirk.a;
                    lowerCase4 = str24.toLowerCase(locale2);
                    lowerCase4.getClass();
                    if (h9bVar2.a(TorchIsClosedAfterImageCapturingQuirk.class, list2.contains(lowerCase4))) {
                        arrayList2.add(new TorchIsClosedAfterImageCapturingQuirk());
                    }
                    List list2114 = androidx.camera.camera2.compat.quirk.SurfaceOrderQuirk.a;
                    if (str25.equalsIgnoreCase("Samsung")) {
                        str5 = Build.BRAND;
                        str5.getClass();
                        if (str5.equalsIgnoreCase("Samsung")) {
                            list3 = androidx.camera.camera2.compat.quirk.SurfaceOrderQuirk.a;
                            String str2119 = Build.HARDWARE;
                            str2119.getClass();
                            Locale locale1116 = Locale.getDefault();
                            locale1116.getClass();
                            lowerCase5 = str2119.toLowerCase(locale1116);
                            lowerCase5.getClass();
                            if (list3.contains(lowerCase5)) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                        } else {
                            z14 = false;
                        }
                    } else {
                        list3 = androidx.camera.camera2.compat.quirk.SurfaceOrderQuirk.a;
                        String str21110 = Build.HARDWARE;
                        str21110.getClass();
                        Locale locale1117 = Locale.getDefault();
                        locale1117.getClass();
                        lowerCase5 = str21110.toLowerCase(locale1117);
                        lowerCase5.getClass();
                        if (list3.contains(lowerCase5)) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                    }
                    if (h9bVar2.a(androidx.camera.camera2.compat.quirk.SurfaceOrderQuirk.class, z14)) {
                        arrayList2.add(new androidx.camera.camera2.compat.quirk.SurfaceOrderQuirk());
                    }
                    if (h9bVar2.a(CaptureSessionOnClosedNotCalledQuirk.class, false)) {
                        arrayList2.add(new CaptureSessionOnClosedNotCalledQuirk());
                    }
                    List list2115 = ZslDisablerQuirk.a;
                    if (!str25.equalsIgnoreCase("Samsung")) {
                        if (ndc.e(ZslDisablerQuirk.a)) {
                            if (!str25.equalsIgnoreCase("Xiaomi")) {
                                str3 = Build.BRAND;
                                str3.getClass();
                                if (str3.equalsIgnoreCase("Xiaomi")) {
                                    if (ndc.e(ZslDisablerQuirk.b)) {
                                    }
                                }
                            } else if (ndc.e(ZslDisablerQuirk.b)) {
                            }
                        }
                        if (h9bVar2.a(ZslDisablerQuirk.class, z17)) {
                            arrayList2.add(new ZslDisablerQuirk());
                        }
                        map = SmallDisplaySizeQuirk.a;
                        upperCase2 = str24.toUpperCase(locale2);
                        upperCase2.getClass();
                        if (h9bVar2.a(SmallDisplaySizeQuirk.class, map.containsKey(upperCase2))) {
                            arrayList2.add(new SmallDisplaySizeQuirk());
                        }
                        if (h9bVar2.a(PreviewUnderExposureQuirk.class, PreviewUnderExposureQuirk.b)) {
                            arrayList2.add(PreviewUnderExposureQuirk.a);
                        }
                        s74.a = new k9b(arrayList2);
                        b21.q("DeviceQuirks", "camera2 DeviceQuirks = " + k9b.d(s74.a()));
                    } else {
                        str4 = Build.BRAND;
                        str4.getClass();
                        if (str4.equalsIgnoreCase("Samsung")) {
                            if (ndc.e(ZslDisablerQuirk.a)) {
                                if (!str25.equalsIgnoreCase("Xiaomi")) {
                                    str3 = Build.BRAND;
                                    str3.getClass();
                                    if (str3.equalsIgnoreCase("Xiaomi")) {
                                        if (ndc.e(ZslDisablerQuirk.b)) {
                                        }
                                    }
                                } else if (ndc.e(ZslDisablerQuirk.b)) {
                                }
                            }
                        } else if (!str25.equalsIgnoreCase("Xiaomi")) {
                            str3 = Build.BRAND;
                            str3.getClass();
                            if (str3.equalsIgnoreCase("Xiaomi")) {
                                if (ndc.e(ZslDisablerQuirk.b)) {
                                }
                            }
                        } else if (ndc.e(ZslDisablerQuirk.b)) {
                        }
                        if (h9bVar2.a(ZslDisablerQuirk.class, z17)) {
                            arrayList2.add(new ZslDisablerQuirk());
                        }
                        map = SmallDisplaySizeQuirk.a;
                        upperCase2 = str24.toUpperCase(locale2);
                        upperCase2.getClass();
                        if (h9bVar2.a(SmallDisplaySizeQuirk.class, map.containsKey(upperCase2))) {
                            arrayList2.add(new SmallDisplaySizeQuirk());
                        }
                        if (h9bVar2.a(PreviewUnderExposureQuirk.class, PreviewUnderExposureQuirk.b)) {
                            arrayList2.add(PreviewUnderExposureQuirk.a);
                        }
                        s74.a = new k9b(arrayList2);
                        b21.q("DeviceQuirks", "camera2 DeviceQuirks = " + k9b.d(s74.a()));
                    }
                    z17 = true;
                    if (h9bVar2.a(ZslDisablerQuirk.class, z17)) {
                        arrayList2.add(new ZslDisablerQuirk());
                    }
                    map = SmallDisplaySizeQuirk.a;
                    upperCase2 = str24.toUpperCase(locale2);
                    upperCase2.getClass();
                    if (h9bVar2.a(SmallDisplaySizeQuirk.class, map.containsKey(upperCase2))) {
                        arrayList2.add(new SmallDisplaySizeQuirk());
                    }
                    if (h9bVar2.a(PreviewUnderExposureQuirk.class, PreviewUnderExposureQuirk.b)) {
                        arrayList2.add(PreviewUnderExposureQuirk.a);
                    }
                    s74.a = new k9b(arrayList2);
                    b21.q("DeviceQuirks", "camera2 DeviceQuirks = " + k9b.d(s74.a()));
                }
                if (h9bVar2.a(InvalidVideoProfilesQuirk.class, z7)) {
                    arrayList2.add(new InvalidVideoProfilesQuirk());
                }
                if (z7f.O()) {
                    z8 = true;
                } else {
                    z8 = true;
                }
                if (h9bVar2.a(ExcludedSupportedSizesQuirk.class, z8)) {
                    arrayList2.add(new ExcludedSupportedSizesQuirk());
                }
                LinkedHashMap linkedHashMap9 = ExtraCroppingQuirk.a;
                if (h9bVar2.a(ExtraCroppingQuirk.class, vd0.g0())) {
                    arrayList2.add(new ExtraCroppingQuirk());
                }
                if (!str25.equalsIgnoreCase("Motorola")) {
                    str9 = Build.BRAND;
                    str9.getClass();
                    if (!str9.equalsIgnoreCase("Motorola")) {
                        z9 = false;
                    } else if ("moto e5 play".equalsIgnoreCase(str24)) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                } else if ("moto e5 play".equalsIgnoreCase(str24)) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (h9bVar2.a(ExtraSupportedOutputSizeQuirk.class, z9)) {
                    arrayList2.add(new ExtraSupportedOutputSizeQuirk());
                }
                v9e v9eVar9 = ExtraSupportedSurfaceCombinationsQuirk.a;
                str2 = Build.DEVICE;
                if ("heroqltevzw".equalsIgnoreCase(str2)) {
                    z10 = true;
                } else {
                    z10 = true;
                }
                if (h9bVar2.a(ExtraSupportedSurfaceCombinationsQuirk.class, z10)) {
                    arrayList2.add(new ExtraSupportedSurfaceCombinationsQuirk());
                }
                int i11 = Nexus4AndroidLTargetAspectRatioQuirk.a;
                if (!str25.equalsIgnoreCase("Google")) {
                    String str21111 = Build.BRAND;
                    str21111.getClass();
                    str21111.equalsIgnoreCase("Google");
                }
                if (h9bVar2.a(Nexus4AndroidLTargetAspectRatioQuirk.class, false)) {
                    arrayList2.add(new Nexus4AndroidLTargetAspectRatioQuirk());
                }
                List list2116 = PreviewPixelHDRnetQuirk.a;
                if (str25.equalsIgnoreCase("Google")) {
                    str8 = Build.BRAND;
                    str8.getClass();
                    if (str8.equalsIgnoreCase("Google")) {
                        list = PreviewPixelHDRnetQuirk.a;
                        str2.getClass();
                        Locale locale1118 = Locale.getDefault();
                        locale1118.getClass();
                        lowerCase3 = str2.toLowerCase(locale1118);
                        lowerCase3.getClass();
                        if (list.contains(lowerCase3)) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                    } else {
                        z11 = false;
                    }
                } else {
                    list = PreviewPixelHDRnetQuirk.a;
                    str2.getClass();
                    Locale locale1119 = Locale.getDefault();
                    locale1119.getClass();
                    lowerCase3 = str2.toLowerCase(locale1119);
                    lowerCase3.getClass();
                    if (list.contains(lowerCase3)) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                }
                if (h9bVar2.a(PreviewPixelHDRnetQuirk.class, z11)) {
                    arrayList2.add(new PreviewPixelHDRnetQuirk());
                }
                if (!str25.equalsIgnoreCase("Huawei")) {
                    str7 = Build.BRAND;
                    str7.getClass();
                    if (!str7.equalsIgnoreCase("Huawei")) {
                        z12 = false;
                    } else if ("mha-l29".equalsIgnoreCase(str24)) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                } else if ("mha-l29".equalsIgnoreCase(str24)) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (h9bVar2.a(RepeatingStreamConstraintForVideoRecordingQuirk.class, z12)) {
                    arrayList2.add(new RepeatingStreamConstraintForVideoRecordingQuirk());
                }
                if (str25.equalsIgnoreCase("Samsung")) {
                    str6 = Build.BRAND;
                    str6.getClass();
                    if (str6.equalsIgnoreCase("Samsung")) {
                        upperCase = str24.toUpperCase(locale2);
                        upperCase.getClass();
                        if (c5e.C(upperCase, "SM-A716", false)) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                    } else {
                        z13 = false;
                    }
                } else {
                    upperCase = str24.toUpperCase(locale2);
                    upperCase.getClass();
                    if (c5e.C(upperCase, "SM-A716", false)) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                }
                if (h9bVar2.a(StillCaptureFlashStopRepeatingQuirk.class, z13)) {
                    arrayList2.add(new StillCaptureFlashStopRepeatingQuirk());
                }
                list2 = TorchIsClosedAfterImageCapturingQuirk.a;
                lowerCase4 = str24.toLowerCase(locale2);
                lowerCase4.getClass();
                if (h9bVar2.a(TorchIsClosedAfterImageCapturingQuirk.class, list2.contains(lowerCase4))) {
                    arrayList2.add(new TorchIsClosedAfterImageCapturingQuirk());
                }
                List list2117 = androidx.camera.camera2.compat.quirk.SurfaceOrderQuirk.a;
                if (str25.equalsIgnoreCase("Samsung")) {
                    str5 = Build.BRAND;
                    str5.getClass();
                    if (str5.equalsIgnoreCase("Samsung")) {
                        list3 = androidx.camera.camera2.compat.quirk.SurfaceOrderQuirk.a;
                        String str21112 = Build.HARDWARE;
                        str21112.getClass();
                        Locale locale11110 = Locale.getDefault();
                        locale11110.getClass();
                        lowerCase5 = str21112.toLowerCase(locale11110);
                        lowerCase5.getClass();
                        if (list3.contains(lowerCase5)) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                    } else {
                        z14 = false;
                    }
                } else {
                    list3 = androidx.camera.camera2.compat.quirk.SurfaceOrderQuirk.a;
                    String str21113 = Build.HARDWARE;
                    str21113.getClass();
                    Locale locale11111 = Locale.getDefault();
                    locale11111.getClass();
                    lowerCase5 = str21113.toLowerCase(locale11111);
                    lowerCase5.getClass();
                    if (list3.contains(lowerCase5)) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                }
                if (h9bVar2.a(androidx.camera.camera2.compat.quirk.SurfaceOrderQuirk.class, z14)) {
                    arrayList2.add(new androidx.camera.camera2.compat.quirk.SurfaceOrderQuirk());
                }
                if (h9bVar2.a(CaptureSessionOnClosedNotCalledQuirk.class, false)) {
                    arrayList2.add(new CaptureSessionOnClosedNotCalledQuirk());
                }
                List list2118 = ZslDisablerQuirk.a;
                if (!str25.equalsIgnoreCase("Samsung")) {
                    if (ndc.e(ZslDisablerQuirk.a)) {
                        if (!str25.equalsIgnoreCase("Xiaomi")) {
                            str3 = Build.BRAND;
                            str3.getClass();
                            if (str3.equalsIgnoreCase("Xiaomi")) {
                                if (ndc.e(ZslDisablerQuirk.b)) {
                                }
                            }
                        } else if (ndc.e(ZslDisablerQuirk.b)) {
                        }
                    }
                    if (h9bVar2.a(ZslDisablerQuirk.class, z17)) {
                        arrayList2.add(new ZslDisablerQuirk());
                    }
                    map = SmallDisplaySizeQuirk.a;
                    upperCase2 = str24.toUpperCase(locale2);
                    upperCase2.getClass();
                    if (h9bVar2.a(SmallDisplaySizeQuirk.class, map.containsKey(upperCase2))) {
                        arrayList2.add(new SmallDisplaySizeQuirk());
                    }
                    if (h9bVar2.a(PreviewUnderExposureQuirk.class, PreviewUnderExposureQuirk.b)) {
                        arrayList2.add(PreviewUnderExposureQuirk.a);
                    }
                    s74.a = new k9b(arrayList2);
                    b21.q("DeviceQuirks", "camera2 DeviceQuirks = " + k9b.d(s74.a()));
                } else {
                    str4 = Build.BRAND;
                    str4.getClass();
                    if (str4.equalsIgnoreCase("Samsung")) {
                        if (ndc.e(ZslDisablerQuirk.a)) {
                            if (!str25.equalsIgnoreCase("Xiaomi")) {
                                str3 = Build.BRAND;
                                str3.getClass();
                                if (str3.equalsIgnoreCase("Xiaomi")) {
                                    if (ndc.e(ZslDisablerQuirk.b)) {
                                    }
                                }
                            } else if (ndc.e(ZslDisablerQuirk.b)) {
                            }
                        }
                    } else if (!str25.equalsIgnoreCase("Xiaomi")) {
                        str3 = Build.BRAND;
                        str3.getClass();
                        if (str3.equalsIgnoreCase("Xiaomi")) {
                            if (ndc.e(ZslDisablerQuirk.b)) {
                            }
                        }
                    } else if (ndc.e(ZslDisablerQuirk.b)) {
                    }
                    if (h9bVar2.a(ZslDisablerQuirk.class, z17)) {
                        arrayList2.add(new ZslDisablerQuirk());
                    }
                    map = SmallDisplaySizeQuirk.a;
                    upperCase2 = str24.toUpperCase(locale2);
                    upperCase2.getClass();
                    if (h9bVar2.a(SmallDisplaySizeQuirk.class, map.containsKey(upperCase2))) {
                        arrayList2.add(new SmallDisplaySizeQuirk());
                    }
                    if (h9bVar2.a(PreviewUnderExposureQuirk.class, PreviewUnderExposureQuirk.b)) {
                        arrayList2.add(PreviewUnderExposureQuirk.a);
                    }
                    s74.a = new k9b(arrayList2);
                    b21.q("DeviceQuirks", "camera2 DeviceQuirks = " + k9b.d(s74.a()));
                }
                z17 = true;
                if (h9bVar2.a(ZslDisablerQuirk.class, z17)) {
                    arrayList2.add(new ZslDisablerQuirk());
                }
                map = SmallDisplaySizeQuirk.a;
                upperCase2 = str24.toUpperCase(locale2);
                upperCase2.getClass();
                if (h9bVar2.a(SmallDisplaySizeQuirk.class, map.containsKey(upperCase2))) {
                    arrayList2.add(new SmallDisplaySizeQuirk());
                }
                if (h9bVar2.a(PreviewUnderExposureQuirk.class, PreviewUnderExposureQuirk.b)) {
                    arrayList2.add(PreviewUnderExposureQuirk.a);
                }
                s74.a = new k9b(arrayList2);
                b21.q("DeviceQuirks", "camera2 DeviceQuirks = " + k9b.d(s74.a()));
                break;
            default:
                break;
        }
    }
}
