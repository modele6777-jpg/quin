package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.os.Build;
import android.os.Trace;
import android.util.ArrayMap;
import android.util.Log;
import io.sentry.android.core.b1;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class nc1 implements yg1 {
    public final String a;
    public final CameraCharacteristics b;
    public final qd1 c;
    public final Set d;
    public final ArrayMap e;
    public final ArrayMap f;
    public final lw7 g;
    public final lw7 v;
    public final lw7 w;

    public nc1(String str, CameraCharacteristics cameraCharacteristics, qd1 qd1Var, Set set) {
        str.getClass();
        set.getClass();
        this.a = str;
        this.b = cameraCharacteristics;
        this.c = qd1Var;
        this.d = set;
        this.e = new ArrayMap();
        this.f = new ArrayMap();
        final int i = 0;
        x16 x16Var = new x16(this) { // from class: mc1
            public final /* synthetic */ nc1 b;

            {
                this.b = this;
            }

            @Override // defpackage.x16
            public final Object invoke() {
                Set setO1;
                int i2 = i;
                List list = pu4.a;
                xu4 xu4Var = xu4.a;
                nc1 nc1Var = this.b;
                switch (i2) {
                    case 0:
                        String str2 = nc1Var.a;
                        try {
                            try {
                                Trace.beginSection("Camera-" + ((Object) ig1.b(str2)) + "#supportedExtensions");
                                qd1 qd1Var2 = nc1Var.c;
                                str2.getClass();
                                if (Build.VERSION.SDK_INT >= 31) {
                                    setO1 = s72.o1(xq.r(qd1Var2.d(str2)));
                                    break;
                                } else {
                                    setO1 = xu4Var;
                                }
                                return setO1;
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e) {
                            b1.n("CXCP", "Failed to getSupportedExtensions from Camera-" + ((Object) ig1.b(str2)), e);
                            return xu4Var;
                        }
                    case 1:
                        String str3 = nc1Var.a;
                        try {
                            try {
                                Trace.beginSection(((Object) ig1.b(str3)) + "#keys");
                                List<CameraCharacteristics.Key<?>> keys = nc1Var.b.getKeys();
                                if (keys != null) {
                                    list = keys;
                                }
                                return s72.o1(list);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e2) {
                            b1.n("CXCP", "Failed to getKeys from " + ((Object) ig1.b(str3)) + '}', e2);
                            return xu4Var;
                        }
                    case 2:
                        String str4 = nc1Var.a;
                        try {
                            try {
                                Trace.beginSection(((Object) ig1.b(str4)) + "#availableCaptureRequestKeys");
                                List<CaptureRequest.Key<?>> availableCaptureRequestKeys = nc1Var.b.getAvailableCaptureRequestKeys();
                                if (availableCaptureRequestKeys != null) {
                                    list = availableCaptureRequestKeys;
                                }
                                return s72.o1(list);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e3) {
                            b1.n("CXCP", "Failed to getAvailableCaptureRequestKeys from " + ((Object) ig1.b(str4)), e3);
                            return xu4Var;
                        }
                    case 3:
                        String str5 = nc1Var.a;
                        try {
                            try {
                                Trace.beginSection(((Object) ig1.b(str5)) + "#availableCaptureResultKeys");
                                List<CaptureResult.Key<?>> availableCaptureResultKeys = nc1Var.b.getAvailableCaptureResultKeys();
                                if (availableCaptureResultKeys != null) {
                                    list = availableCaptureResultKeys;
                                }
                                return s72.o1(list);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e4) {
                            b1.n("CXCP", "Failed to getAvailableCaptureResultKeys from " + ((Object) ig1.b(str5)), e4);
                            return xu4Var;
                        }
                    case 4:
                        String str6 = nc1Var.a;
                        if (Build.VERSION.SDK_INT < 28) {
                            return xu4Var;
                        }
                        try {
                            try {
                                Trace.beginSection(((Object) ig1.b(str6)) + "#physicalCameraIds");
                                Set setA = s.A(nc1Var.b);
                                Log.i("CXCP", "Loaded physicalCameraIds from " + ((Object) ig1.b(str6)) + ": " + setA);
                                Set<String> set2 = setA;
                                ArrayList arrayList = new ArrayList(t72.u(set2, 10));
                                for (String str7 : set2) {
                                    ig1.a(str7);
                                    arrayList.add(new ig1(str7));
                                }
                                return s72.o1(arrayList);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e5) {
                            b1.n("CXCP", "Failed to getPhysicalCameraIds from " + ((Object) ig1.b(str6)), e5);
                            return xu4Var;
                        } catch (NullPointerException e6) {
                            b1.n("CXCP", "Failed to getPhysicalCameraIds from " + ((Object) ig1.b(str6)), e6);
                            return xu4Var;
                        }
                    case 5:
                        String str8 = nc1Var.a;
                        if (Build.VERSION.SDK_INT < 28) {
                            return xu4Var;
                        }
                        try {
                            try {
                                Trace.beginSection("Camera-" + str8 + "#availablePhysicalCameraRequestKeys");
                                List listQ = s.q(nc1Var.b);
                                if (listQ != null) {
                                    list = listQ;
                                }
                                return s72.o1(list);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e7) {
                            b1.n("CXCP", "Failed to getAvailablePhysicalCameraRequestKeys from Camera-" + str8, e7);
                            return xu4Var;
                        }
                    case 6:
                        String str9 = nc1Var.a;
                        if (Build.VERSION.SDK_INT < 35) {
                            return xu4Var;
                        }
                        try {
                            try {
                                Trace.beginSection("Camera-" + str9 + "#getAvailableSessionCharacteristicsKeys");
                                List listC = v60.c(nc1Var.b);
                                if (listC != null) {
                                    list = listC;
                                }
                                return s72.o1(list);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e8) {
                            b1.n("CXCP", "Failed to getAvailableSessionCharacteristicsKeys from Camera-" + str9, e8);
                            return xu4Var;
                        }
                    default:
                        String str10 = nc1Var.a;
                        if (Build.VERSION.SDK_INT < 28) {
                            return xu4Var;
                        }
                        try {
                            try {
                                Trace.beginSection("Camera-" + str10 + "#availableSessionKeys");
                                List listR = s.r(nc1Var.b);
                                if (listR != null) {
                                    list = listR;
                                }
                                return s72.o1(list);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e9) {
                            b1.n("CXCP", "Failed to getAvailableSessionKeys from Camera-" + str10, e9);
                            return xu4Var;
                        }
                }
            }
        };
        z18 z18Var = z18.b;
        this.g = eb3.N(z18Var, x16Var);
        final int i2 = 1;
        eb3.N(z18Var, new x16(this) { // from class: mc1
            public final /* synthetic */ nc1 b;

            {
                this.b = this;
            }

            @Override // defpackage.x16
            public final Object invoke() {
                Set setO1;
                int i3 = i2;
                List list = pu4.a;
                xu4 xu4Var = xu4.a;
                nc1 nc1Var = this.b;
                switch (i3) {
                    case 0:
                        String str2 = nc1Var.a;
                        try {
                            try {
                                Trace.beginSection("Camera-" + ((Object) ig1.b(str2)) + "#supportedExtensions");
                                qd1 qd1Var2 = nc1Var.c;
                                str2.getClass();
                                if (Build.VERSION.SDK_INT >= 31) {
                                    setO1 = s72.o1(xq.r(qd1Var2.d(str2)));
                                    break;
                                } else {
                                    setO1 = xu4Var;
                                }
                                return setO1;
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e) {
                            b1.n("CXCP", "Failed to getSupportedExtensions from Camera-" + ((Object) ig1.b(str2)), e);
                            return xu4Var;
                        }
                    case 1:
                        String str3 = nc1Var.a;
                        try {
                            try {
                                Trace.beginSection(((Object) ig1.b(str3)) + "#keys");
                                List<CameraCharacteristics.Key<?>> keys = nc1Var.b.getKeys();
                                if (keys != null) {
                                    list = keys;
                                }
                                return s72.o1(list);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e2) {
                            b1.n("CXCP", "Failed to getKeys from " + ((Object) ig1.b(str3)) + '}', e2);
                            return xu4Var;
                        }
                    case 2:
                        String str4 = nc1Var.a;
                        try {
                            try {
                                Trace.beginSection(((Object) ig1.b(str4)) + "#availableCaptureRequestKeys");
                                List<CaptureRequest.Key<?>> availableCaptureRequestKeys = nc1Var.b.getAvailableCaptureRequestKeys();
                                if (availableCaptureRequestKeys != null) {
                                    list = availableCaptureRequestKeys;
                                }
                                return s72.o1(list);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e3) {
                            b1.n("CXCP", "Failed to getAvailableCaptureRequestKeys from " + ((Object) ig1.b(str4)), e3);
                            return xu4Var;
                        }
                    case 3:
                        String str5 = nc1Var.a;
                        try {
                            try {
                                Trace.beginSection(((Object) ig1.b(str5)) + "#availableCaptureResultKeys");
                                List<CaptureResult.Key<?>> availableCaptureResultKeys = nc1Var.b.getAvailableCaptureResultKeys();
                                if (availableCaptureResultKeys != null) {
                                    list = availableCaptureResultKeys;
                                }
                                return s72.o1(list);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e4) {
                            b1.n("CXCP", "Failed to getAvailableCaptureResultKeys from " + ((Object) ig1.b(str5)), e4);
                            return xu4Var;
                        }
                    case 4:
                        String str6 = nc1Var.a;
                        if (Build.VERSION.SDK_INT < 28) {
                            return xu4Var;
                        }
                        try {
                            try {
                                Trace.beginSection(((Object) ig1.b(str6)) + "#physicalCameraIds");
                                Set setA = s.A(nc1Var.b);
                                Log.i("CXCP", "Loaded physicalCameraIds from " + ((Object) ig1.b(str6)) + ": " + setA);
                                Set<String> set2 = setA;
                                ArrayList arrayList = new ArrayList(t72.u(set2, 10));
                                for (String str7 : set2) {
                                    ig1.a(str7);
                                    arrayList.add(new ig1(str7));
                                }
                                return s72.o1(arrayList);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e5) {
                            b1.n("CXCP", "Failed to getPhysicalCameraIds from " + ((Object) ig1.b(str6)), e5);
                            return xu4Var;
                        } catch (NullPointerException e6) {
                            b1.n("CXCP", "Failed to getPhysicalCameraIds from " + ((Object) ig1.b(str6)), e6);
                            return xu4Var;
                        }
                    case 5:
                        String str8 = nc1Var.a;
                        if (Build.VERSION.SDK_INT < 28) {
                            return xu4Var;
                        }
                        try {
                            try {
                                Trace.beginSection("Camera-" + str8 + "#availablePhysicalCameraRequestKeys");
                                List listQ = s.q(nc1Var.b);
                                if (listQ != null) {
                                    list = listQ;
                                }
                                return s72.o1(list);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e7) {
                            b1.n("CXCP", "Failed to getAvailablePhysicalCameraRequestKeys from Camera-" + str8, e7);
                            return xu4Var;
                        }
                    case 6:
                        String str9 = nc1Var.a;
                        if (Build.VERSION.SDK_INT < 35) {
                            return xu4Var;
                        }
                        try {
                            try {
                                Trace.beginSection("Camera-" + str9 + "#getAvailableSessionCharacteristicsKeys");
                                List listC = v60.c(nc1Var.b);
                                if (listC != null) {
                                    list = listC;
                                }
                                return s72.o1(list);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e8) {
                            b1.n("CXCP", "Failed to getAvailableSessionCharacteristicsKeys from Camera-" + str9, e8);
                            return xu4Var;
                        }
                    default:
                        String str10 = nc1Var.a;
                        if (Build.VERSION.SDK_INT < 28) {
                            return xu4Var;
                        }
                        try {
                            try {
                                Trace.beginSection("Camera-" + str10 + "#availableSessionKeys");
                                List listR = s.r(nc1Var.b);
                                if (listR != null) {
                                    list = listR;
                                }
                                return s72.o1(list);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e9) {
                            b1.n("CXCP", "Failed to getAvailableSessionKeys from Camera-" + str10, e9);
                            return xu4Var;
                        }
                }
            }
        });
        final int i3 = 2;
        eb3.N(z18Var, new x16(this) { // from class: mc1
            public final /* synthetic */ nc1 b;

            {
                this.b = this;
            }

            @Override // defpackage.x16
            public final Object invoke() {
                Set setO1;
                int i4 = i3;
                List list = pu4.a;
                xu4 xu4Var = xu4.a;
                nc1 nc1Var = this.b;
                switch (i4) {
                    case 0:
                        String str2 = nc1Var.a;
                        try {
                            try {
                                Trace.beginSection("Camera-" + ((Object) ig1.b(str2)) + "#supportedExtensions");
                                qd1 qd1Var2 = nc1Var.c;
                                str2.getClass();
                                if (Build.VERSION.SDK_INT >= 31) {
                                    setO1 = s72.o1(xq.r(qd1Var2.d(str2)));
                                    break;
                                } else {
                                    setO1 = xu4Var;
                                }
                                return setO1;
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e) {
                            b1.n("CXCP", "Failed to getSupportedExtensions from Camera-" + ((Object) ig1.b(str2)), e);
                            return xu4Var;
                        }
                    case 1:
                        String str3 = nc1Var.a;
                        try {
                            try {
                                Trace.beginSection(((Object) ig1.b(str3)) + "#keys");
                                List<CameraCharacteristics.Key<?>> keys = nc1Var.b.getKeys();
                                if (keys != null) {
                                    list = keys;
                                }
                                return s72.o1(list);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e2) {
                            b1.n("CXCP", "Failed to getKeys from " + ((Object) ig1.b(str3)) + '}', e2);
                            return xu4Var;
                        }
                    case 2:
                        String str4 = nc1Var.a;
                        try {
                            try {
                                Trace.beginSection(((Object) ig1.b(str4)) + "#availableCaptureRequestKeys");
                                List<CaptureRequest.Key<?>> availableCaptureRequestKeys = nc1Var.b.getAvailableCaptureRequestKeys();
                                if (availableCaptureRequestKeys != null) {
                                    list = availableCaptureRequestKeys;
                                }
                                return s72.o1(list);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e3) {
                            b1.n("CXCP", "Failed to getAvailableCaptureRequestKeys from " + ((Object) ig1.b(str4)), e3);
                            return xu4Var;
                        }
                    case 3:
                        String str5 = nc1Var.a;
                        try {
                            try {
                                Trace.beginSection(((Object) ig1.b(str5)) + "#availableCaptureResultKeys");
                                List<CaptureResult.Key<?>> availableCaptureResultKeys = nc1Var.b.getAvailableCaptureResultKeys();
                                if (availableCaptureResultKeys != null) {
                                    list = availableCaptureResultKeys;
                                }
                                return s72.o1(list);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e4) {
                            b1.n("CXCP", "Failed to getAvailableCaptureResultKeys from " + ((Object) ig1.b(str5)), e4);
                            return xu4Var;
                        }
                    case 4:
                        String str6 = nc1Var.a;
                        if (Build.VERSION.SDK_INT < 28) {
                            return xu4Var;
                        }
                        try {
                            try {
                                Trace.beginSection(((Object) ig1.b(str6)) + "#physicalCameraIds");
                                Set setA = s.A(nc1Var.b);
                                Log.i("CXCP", "Loaded physicalCameraIds from " + ((Object) ig1.b(str6)) + ": " + setA);
                                Set<String> set2 = setA;
                                ArrayList arrayList = new ArrayList(t72.u(set2, 10));
                                for (String str7 : set2) {
                                    ig1.a(str7);
                                    arrayList.add(new ig1(str7));
                                }
                                return s72.o1(arrayList);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e5) {
                            b1.n("CXCP", "Failed to getPhysicalCameraIds from " + ((Object) ig1.b(str6)), e5);
                            return xu4Var;
                        } catch (NullPointerException e6) {
                            b1.n("CXCP", "Failed to getPhysicalCameraIds from " + ((Object) ig1.b(str6)), e6);
                            return xu4Var;
                        }
                    case 5:
                        String str8 = nc1Var.a;
                        if (Build.VERSION.SDK_INT < 28) {
                            return xu4Var;
                        }
                        try {
                            try {
                                Trace.beginSection("Camera-" + str8 + "#availablePhysicalCameraRequestKeys");
                                List listQ = s.q(nc1Var.b);
                                if (listQ != null) {
                                    list = listQ;
                                }
                                return s72.o1(list);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e7) {
                            b1.n("CXCP", "Failed to getAvailablePhysicalCameraRequestKeys from Camera-" + str8, e7);
                            return xu4Var;
                        }
                    case 6:
                        String str9 = nc1Var.a;
                        if (Build.VERSION.SDK_INT < 35) {
                            return xu4Var;
                        }
                        try {
                            try {
                                Trace.beginSection("Camera-" + str9 + "#getAvailableSessionCharacteristicsKeys");
                                List listC = v60.c(nc1Var.b);
                                if (listC != null) {
                                    list = listC;
                                }
                                return s72.o1(list);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e8) {
                            b1.n("CXCP", "Failed to getAvailableSessionCharacteristicsKeys from Camera-" + str9, e8);
                            return xu4Var;
                        }
                    default:
                        String str10 = nc1Var.a;
                        if (Build.VERSION.SDK_INT < 28) {
                            return xu4Var;
                        }
                        try {
                            try {
                                Trace.beginSection("Camera-" + str10 + "#availableSessionKeys");
                                List listR = s.r(nc1Var.b);
                                if (listR != null) {
                                    list = listR;
                                }
                                return s72.o1(list);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e9) {
                            b1.n("CXCP", "Failed to getAvailableSessionKeys from Camera-" + str10, e9);
                            return xu4Var;
                        }
                }
            }
        });
        final int i4 = 3;
        eb3.N(z18Var, new x16(this) { // from class: mc1
            public final /* synthetic */ nc1 b;

            {
                this.b = this;
            }

            @Override // defpackage.x16
            public final Object invoke() {
                Set setO1;
                int i5 = i4;
                List list = pu4.a;
                xu4 xu4Var = xu4.a;
                nc1 nc1Var = this.b;
                switch (i5) {
                    case 0:
                        String str2 = nc1Var.a;
                        try {
                            try {
                                Trace.beginSection("Camera-" + ((Object) ig1.b(str2)) + "#supportedExtensions");
                                qd1 qd1Var2 = nc1Var.c;
                                str2.getClass();
                                if (Build.VERSION.SDK_INT >= 31) {
                                    setO1 = s72.o1(xq.r(qd1Var2.d(str2)));
                                    break;
                                } else {
                                    setO1 = xu4Var;
                                }
                                return setO1;
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e) {
                            b1.n("CXCP", "Failed to getSupportedExtensions from Camera-" + ((Object) ig1.b(str2)), e);
                            return xu4Var;
                        }
                    case 1:
                        String str3 = nc1Var.a;
                        try {
                            try {
                                Trace.beginSection(((Object) ig1.b(str3)) + "#keys");
                                List<CameraCharacteristics.Key<?>> keys = nc1Var.b.getKeys();
                                if (keys != null) {
                                    list = keys;
                                }
                                return s72.o1(list);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e2) {
                            b1.n("CXCP", "Failed to getKeys from " + ((Object) ig1.b(str3)) + '}', e2);
                            return xu4Var;
                        }
                    case 2:
                        String str4 = nc1Var.a;
                        try {
                            try {
                                Trace.beginSection(((Object) ig1.b(str4)) + "#availableCaptureRequestKeys");
                                List<CaptureRequest.Key<?>> availableCaptureRequestKeys = nc1Var.b.getAvailableCaptureRequestKeys();
                                if (availableCaptureRequestKeys != null) {
                                    list = availableCaptureRequestKeys;
                                }
                                return s72.o1(list);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e3) {
                            b1.n("CXCP", "Failed to getAvailableCaptureRequestKeys from " + ((Object) ig1.b(str4)), e3);
                            return xu4Var;
                        }
                    case 3:
                        String str5 = nc1Var.a;
                        try {
                            try {
                                Trace.beginSection(((Object) ig1.b(str5)) + "#availableCaptureResultKeys");
                                List<CaptureResult.Key<?>> availableCaptureResultKeys = nc1Var.b.getAvailableCaptureResultKeys();
                                if (availableCaptureResultKeys != null) {
                                    list = availableCaptureResultKeys;
                                }
                                return s72.o1(list);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e4) {
                            b1.n("CXCP", "Failed to getAvailableCaptureResultKeys from " + ((Object) ig1.b(str5)), e4);
                            return xu4Var;
                        }
                    case 4:
                        String str6 = nc1Var.a;
                        if (Build.VERSION.SDK_INT < 28) {
                            return xu4Var;
                        }
                        try {
                            try {
                                Trace.beginSection(((Object) ig1.b(str6)) + "#physicalCameraIds");
                                Set setA = s.A(nc1Var.b);
                                Log.i("CXCP", "Loaded physicalCameraIds from " + ((Object) ig1.b(str6)) + ": " + setA);
                                Set<String> set2 = setA;
                                ArrayList arrayList = new ArrayList(t72.u(set2, 10));
                                for (String str7 : set2) {
                                    ig1.a(str7);
                                    arrayList.add(new ig1(str7));
                                }
                                return s72.o1(arrayList);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e5) {
                            b1.n("CXCP", "Failed to getPhysicalCameraIds from " + ((Object) ig1.b(str6)), e5);
                            return xu4Var;
                        } catch (NullPointerException e6) {
                            b1.n("CXCP", "Failed to getPhysicalCameraIds from " + ((Object) ig1.b(str6)), e6);
                            return xu4Var;
                        }
                    case 5:
                        String str8 = nc1Var.a;
                        if (Build.VERSION.SDK_INT < 28) {
                            return xu4Var;
                        }
                        try {
                            try {
                                Trace.beginSection("Camera-" + str8 + "#availablePhysicalCameraRequestKeys");
                                List listQ = s.q(nc1Var.b);
                                if (listQ != null) {
                                    list = listQ;
                                }
                                return s72.o1(list);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e7) {
                            b1.n("CXCP", "Failed to getAvailablePhysicalCameraRequestKeys from Camera-" + str8, e7);
                            return xu4Var;
                        }
                    case 6:
                        String str9 = nc1Var.a;
                        if (Build.VERSION.SDK_INT < 35) {
                            return xu4Var;
                        }
                        try {
                            try {
                                Trace.beginSection("Camera-" + str9 + "#getAvailableSessionCharacteristicsKeys");
                                List listC = v60.c(nc1Var.b);
                                if (listC != null) {
                                    list = listC;
                                }
                                return s72.o1(list);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e8) {
                            b1.n("CXCP", "Failed to getAvailableSessionCharacteristicsKeys from Camera-" + str9, e8);
                            return xu4Var;
                        }
                    default:
                        String str10 = nc1Var.a;
                        if (Build.VERSION.SDK_INT < 28) {
                            return xu4Var;
                        }
                        try {
                            try {
                                Trace.beginSection("Camera-" + str10 + "#availableSessionKeys");
                                List listR = s.r(nc1Var.b);
                                if (listR != null) {
                                    list = listR;
                                }
                                return s72.o1(list);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e9) {
                            b1.n("CXCP", "Failed to getAvailableSessionKeys from Camera-" + str10, e9);
                            return xu4Var;
                        }
                }
            }
        });
        final int i5 = 4;
        this.v = eb3.N(z18Var, new x16(this) { // from class: mc1
            public final /* synthetic */ nc1 b;

            {
                this.b = this;
            }

            @Override // defpackage.x16
            public final Object invoke() {
                Set setO1;
                int i6 = i5;
                List list = pu4.a;
                xu4 xu4Var = xu4.a;
                nc1 nc1Var = this.b;
                switch (i6) {
                    case 0:
                        String str2 = nc1Var.a;
                        try {
                            try {
                                Trace.beginSection("Camera-" + ((Object) ig1.b(str2)) + "#supportedExtensions");
                                qd1 qd1Var2 = nc1Var.c;
                                str2.getClass();
                                if (Build.VERSION.SDK_INT >= 31) {
                                    setO1 = s72.o1(xq.r(qd1Var2.d(str2)));
                                    break;
                                } else {
                                    setO1 = xu4Var;
                                }
                                return setO1;
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e) {
                            b1.n("CXCP", "Failed to getSupportedExtensions from Camera-" + ((Object) ig1.b(str2)), e);
                            return xu4Var;
                        }
                    case 1:
                        String str3 = nc1Var.a;
                        try {
                            try {
                                Trace.beginSection(((Object) ig1.b(str3)) + "#keys");
                                List<CameraCharacteristics.Key<?>> keys = nc1Var.b.getKeys();
                                if (keys != null) {
                                    list = keys;
                                }
                                return s72.o1(list);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e2) {
                            b1.n("CXCP", "Failed to getKeys from " + ((Object) ig1.b(str3)) + '}', e2);
                            return xu4Var;
                        }
                    case 2:
                        String str4 = nc1Var.a;
                        try {
                            try {
                                Trace.beginSection(((Object) ig1.b(str4)) + "#availableCaptureRequestKeys");
                                List<CaptureRequest.Key<?>> availableCaptureRequestKeys = nc1Var.b.getAvailableCaptureRequestKeys();
                                if (availableCaptureRequestKeys != null) {
                                    list = availableCaptureRequestKeys;
                                }
                                return s72.o1(list);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e3) {
                            b1.n("CXCP", "Failed to getAvailableCaptureRequestKeys from " + ((Object) ig1.b(str4)), e3);
                            return xu4Var;
                        }
                    case 3:
                        String str5 = nc1Var.a;
                        try {
                            try {
                                Trace.beginSection(((Object) ig1.b(str5)) + "#availableCaptureResultKeys");
                                List<CaptureResult.Key<?>> availableCaptureResultKeys = nc1Var.b.getAvailableCaptureResultKeys();
                                if (availableCaptureResultKeys != null) {
                                    list = availableCaptureResultKeys;
                                }
                                return s72.o1(list);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e4) {
                            b1.n("CXCP", "Failed to getAvailableCaptureResultKeys from " + ((Object) ig1.b(str5)), e4);
                            return xu4Var;
                        }
                    case 4:
                        String str6 = nc1Var.a;
                        if (Build.VERSION.SDK_INT < 28) {
                            return xu4Var;
                        }
                        try {
                            try {
                                Trace.beginSection(((Object) ig1.b(str6)) + "#physicalCameraIds");
                                Set setA = s.A(nc1Var.b);
                                Log.i("CXCP", "Loaded physicalCameraIds from " + ((Object) ig1.b(str6)) + ": " + setA);
                                Set<String> set2 = setA;
                                ArrayList arrayList = new ArrayList(t72.u(set2, 10));
                                for (String str7 : set2) {
                                    ig1.a(str7);
                                    arrayList.add(new ig1(str7));
                                }
                                return s72.o1(arrayList);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e5) {
                            b1.n("CXCP", "Failed to getPhysicalCameraIds from " + ((Object) ig1.b(str6)), e5);
                            return xu4Var;
                        } catch (NullPointerException e6) {
                            b1.n("CXCP", "Failed to getPhysicalCameraIds from " + ((Object) ig1.b(str6)), e6);
                            return xu4Var;
                        }
                    case 5:
                        String str8 = nc1Var.a;
                        if (Build.VERSION.SDK_INT < 28) {
                            return xu4Var;
                        }
                        try {
                            try {
                                Trace.beginSection("Camera-" + str8 + "#availablePhysicalCameraRequestKeys");
                                List listQ = s.q(nc1Var.b);
                                if (listQ != null) {
                                    list = listQ;
                                }
                                return s72.o1(list);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e7) {
                            b1.n("CXCP", "Failed to getAvailablePhysicalCameraRequestKeys from Camera-" + str8, e7);
                            return xu4Var;
                        }
                    case 6:
                        String str9 = nc1Var.a;
                        if (Build.VERSION.SDK_INT < 35) {
                            return xu4Var;
                        }
                        try {
                            try {
                                Trace.beginSection("Camera-" + str9 + "#getAvailableSessionCharacteristicsKeys");
                                List listC = v60.c(nc1Var.b);
                                if (listC != null) {
                                    list = listC;
                                }
                                return s72.o1(list);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e8) {
                            b1.n("CXCP", "Failed to getAvailableSessionCharacteristicsKeys from Camera-" + str9, e8);
                            return xu4Var;
                        }
                    default:
                        String str10 = nc1Var.a;
                        if (Build.VERSION.SDK_INT < 28) {
                            return xu4Var;
                        }
                        try {
                            try {
                                Trace.beginSection("Camera-" + str10 + "#availableSessionKeys");
                                List listR = s.r(nc1Var.b);
                                if (listR != null) {
                                    list = listR;
                                }
                                return s72.o1(list);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e9) {
                            b1.n("CXCP", "Failed to getAvailableSessionKeys from Camera-" + str10, e9);
                            return xu4Var;
                        }
                }
            }
        });
        final int i6 = 5;
        eb3.N(z18Var, new x16(this) { // from class: mc1
            public final /* synthetic */ nc1 b;

            {
                this.b = this;
            }

            @Override // defpackage.x16
            public final Object invoke() {
                Set setO1;
                int i7 = i6;
                List list = pu4.a;
                xu4 xu4Var = xu4.a;
                nc1 nc1Var = this.b;
                switch (i7) {
                    case 0:
                        String str2 = nc1Var.a;
                        try {
                            try {
                                Trace.beginSection("Camera-" + ((Object) ig1.b(str2)) + "#supportedExtensions");
                                qd1 qd1Var2 = nc1Var.c;
                                str2.getClass();
                                if (Build.VERSION.SDK_INT >= 31) {
                                    setO1 = s72.o1(xq.r(qd1Var2.d(str2)));
                                    break;
                                } else {
                                    setO1 = xu4Var;
                                }
                                return setO1;
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e) {
                            b1.n("CXCP", "Failed to getSupportedExtensions from Camera-" + ((Object) ig1.b(str2)), e);
                            return xu4Var;
                        }
                    case 1:
                        String str3 = nc1Var.a;
                        try {
                            try {
                                Trace.beginSection(((Object) ig1.b(str3)) + "#keys");
                                List<CameraCharacteristics.Key<?>> keys = nc1Var.b.getKeys();
                                if (keys != null) {
                                    list = keys;
                                }
                                return s72.o1(list);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e2) {
                            b1.n("CXCP", "Failed to getKeys from " + ((Object) ig1.b(str3)) + '}', e2);
                            return xu4Var;
                        }
                    case 2:
                        String str4 = nc1Var.a;
                        try {
                            try {
                                Trace.beginSection(((Object) ig1.b(str4)) + "#availableCaptureRequestKeys");
                                List<CaptureRequest.Key<?>> availableCaptureRequestKeys = nc1Var.b.getAvailableCaptureRequestKeys();
                                if (availableCaptureRequestKeys != null) {
                                    list = availableCaptureRequestKeys;
                                }
                                return s72.o1(list);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e3) {
                            b1.n("CXCP", "Failed to getAvailableCaptureRequestKeys from " + ((Object) ig1.b(str4)), e3);
                            return xu4Var;
                        }
                    case 3:
                        String str5 = nc1Var.a;
                        try {
                            try {
                                Trace.beginSection(((Object) ig1.b(str5)) + "#availableCaptureResultKeys");
                                List<CaptureResult.Key<?>> availableCaptureResultKeys = nc1Var.b.getAvailableCaptureResultKeys();
                                if (availableCaptureResultKeys != null) {
                                    list = availableCaptureResultKeys;
                                }
                                return s72.o1(list);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e4) {
                            b1.n("CXCP", "Failed to getAvailableCaptureResultKeys from " + ((Object) ig1.b(str5)), e4);
                            return xu4Var;
                        }
                    case 4:
                        String str6 = nc1Var.a;
                        if (Build.VERSION.SDK_INT < 28) {
                            return xu4Var;
                        }
                        try {
                            try {
                                Trace.beginSection(((Object) ig1.b(str6)) + "#physicalCameraIds");
                                Set setA = s.A(nc1Var.b);
                                Log.i("CXCP", "Loaded physicalCameraIds from " + ((Object) ig1.b(str6)) + ": " + setA);
                                Set<String> set2 = setA;
                                ArrayList arrayList = new ArrayList(t72.u(set2, 10));
                                for (String str7 : set2) {
                                    ig1.a(str7);
                                    arrayList.add(new ig1(str7));
                                }
                                return s72.o1(arrayList);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e5) {
                            b1.n("CXCP", "Failed to getPhysicalCameraIds from " + ((Object) ig1.b(str6)), e5);
                            return xu4Var;
                        } catch (NullPointerException e6) {
                            b1.n("CXCP", "Failed to getPhysicalCameraIds from " + ((Object) ig1.b(str6)), e6);
                            return xu4Var;
                        }
                    case 5:
                        String str8 = nc1Var.a;
                        if (Build.VERSION.SDK_INT < 28) {
                            return xu4Var;
                        }
                        try {
                            try {
                                Trace.beginSection("Camera-" + str8 + "#availablePhysicalCameraRequestKeys");
                                List listQ = s.q(nc1Var.b);
                                if (listQ != null) {
                                    list = listQ;
                                }
                                return s72.o1(list);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e7) {
                            b1.n("CXCP", "Failed to getAvailablePhysicalCameraRequestKeys from Camera-" + str8, e7);
                            return xu4Var;
                        }
                    case 6:
                        String str9 = nc1Var.a;
                        if (Build.VERSION.SDK_INT < 35) {
                            return xu4Var;
                        }
                        try {
                            try {
                                Trace.beginSection("Camera-" + str9 + "#getAvailableSessionCharacteristicsKeys");
                                List listC = v60.c(nc1Var.b);
                                if (listC != null) {
                                    list = listC;
                                }
                                return s72.o1(list);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e8) {
                            b1.n("CXCP", "Failed to getAvailableSessionCharacteristicsKeys from Camera-" + str9, e8);
                            return xu4Var;
                        }
                    default:
                        String str10 = nc1Var.a;
                        if (Build.VERSION.SDK_INT < 28) {
                            return xu4Var;
                        }
                        try {
                            try {
                                Trace.beginSection("Camera-" + str10 + "#availableSessionKeys");
                                List listR = s.r(nc1Var.b);
                                if (listR != null) {
                                    list = listR;
                                }
                                return s72.o1(list);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e9) {
                            b1.n("CXCP", "Failed to getAvailableSessionKeys from Camera-" + str10, e9);
                            return xu4Var;
                        }
                }
            }
        });
        final int i7 = 6;
        eb3.N(z18Var, new x16(this) { // from class: mc1
            public final /* synthetic */ nc1 b;

            {
                this.b = this;
            }

            @Override // defpackage.x16
            public final Object invoke() {
                Set setO1;
                int i8 = i7;
                List list = pu4.a;
                xu4 xu4Var = xu4.a;
                nc1 nc1Var = this.b;
                switch (i8) {
                    case 0:
                        String str2 = nc1Var.a;
                        try {
                            try {
                                Trace.beginSection("Camera-" + ((Object) ig1.b(str2)) + "#supportedExtensions");
                                qd1 qd1Var2 = nc1Var.c;
                                str2.getClass();
                                if (Build.VERSION.SDK_INT >= 31) {
                                    setO1 = s72.o1(xq.r(qd1Var2.d(str2)));
                                    break;
                                } else {
                                    setO1 = xu4Var;
                                }
                                return setO1;
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e) {
                            b1.n("CXCP", "Failed to getSupportedExtensions from Camera-" + ((Object) ig1.b(str2)), e);
                            return xu4Var;
                        }
                    case 1:
                        String str3 = nc1Var.a;
                        try {
                            try {
                                Trace.beginSection(((Object) ig1.b(str3)) + "#keys");
                                List<CameraCharacteristics.Key<?>> keys = nc1Var.b.getKeys();
                                if (keys != null) {
                                    list = keys;
                                }
                                return s72.o1(list);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e2) {
                            b1.n("CXCP", "Failed to getKeys from " + ((Object) ig1.b(str3)) + '}', e2);
                            return xu4Var;
                        }
                    case 2:
                        String str4 = nc1Var.a;
                        try {
                            try {
                                Trace.beginSection(((Object) ig1.b(str4)) + "#availableCaptureRequestKeys");
                                List<CaptureRequest.Key<?>> availableCaptureRequestKeys = nc1Var.b.getAvailableCaptureRequestKeys();
                                if (availableCaptureRequestKeys != null) {
                                    list = availableCaptureRequestKeys;
                                }
                                return s72.o1(list);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e3) {
                            b1.n("CXCP", "Failed to getAvailableCaptureRequestKeys from " + ((Object) ig1.b(str4)), e3);
                            return xu4Var;
                        }
                    case 3:
                        String str5 = nc1Var.a;
                        try {
                            try {
                                Trace.beginSection(((Object) ig1.b(str5)) + "#availableCaptureResultKeys");
                                List<CaptureResult.Key<?>> availableCaptureResultKeys = nc1Var.b.getAvailableCaptureResultKeys();
                                if (availableCaptureResultKeys != null) {
                                    list = availableCaptureResultKeys;
                                }
                                return s72.o1(list);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e4) {
                            b1.n("CXCP", "Failed to getAvailableCaptureResultKeys from " + ((Object) ig1.b(str5)), e4);
                            return xu4Var;
                        }
                    case 4:
                        String str6 = nc1Var.a;
                        if (Build.VERSION.SDK_INT < 28) {
                            return xu4Var;
                        }
                        try {
                            try {
                                Trace.beginSection(((Object) ig1.b(str6)) + "#physicalCameraIds");
                                Set setA = s.A(nc1Var.b);
                                Log.i("CXCP", "Loaded physicalCameraIds from " + ((Object) ig1.b(str6)) + ": " + setA);
                                Set<String> set2 = setA;
                                ArrayList arrayList = new ArrayList(t72.u(set2, 10));
                                for (String str7 : set2) {
                                    ig1.a(str7);
                                    arrayList.add(new ig1(str7));
                                }
                                return s72.o1(arrayList);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e5) {
                            b1.n("CXCP", "Failed to getPhysicalCameraIds from " + ((Object) ig1.b(str6)), e5);
                            return xu4Var;
                        } catch (NullPointerException e6) {
                            b1.n("CXCP", "Failed to getPhysicalCameraIds from " + ((Object) ig1.b(str6)), e6);
                            return xu4Var;
                        }
                    case 5:
                        String str8 = nc1Var.a;
                        if (Build.VERSION.SDK_INT < 28) {
                            return xu4Var;
                        }
                        try {
                            try {
                                Trace.beginSection("Camera-" + str8 + "#availablePhysicalCameraRequestKeys");
                                List listQ = s.q(nc1Var.b);
                                if (listQ != null) {
                                    list = listQ;
                                }
                                return s72.o1(list);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e7) {
                            b1.n("CXCP", "Failed to getAvailablePhysicalCameraRequestKeys from Camera-" + str8, e7);
                            return xu4Var;
                        }
                    case 6:
                        String str9 = nc1Var.a;
                        if (Build.VERSION.SDK_INT < 35) {
                            return xu4Var;
                        }
                        try {
                            try {
                                Trace.beginSection("Camera-" + str9 + "#getAvailableSessionCharacteristicsKeys");
                                List listC = v60.c(nc1Var.b);
                                if (listC != null) {
                                    list = listC;
                                }
                                return s72.o1(list);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e8) {
                            b1.n("CXCP", "Failed to getAvailableSessionCharacteristicsKeys from Camera-" + str9, e8);
                            return xu4Var;
                        }
                    default:
                        String str10 = nc1Var.a;
                        if (Build.VERSION.SDK_INT < 28) {
                            return xu4Var;
                        }
                        try {
                            try {
                                Trace.beginSection("Camera-" + str10 + "#availableSessionKeys");
                                List listR = s.r(nc1Var.b);
                                if (listR != null) {
                                    list = listR;
                                }
                                return s72.o1(list);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e9) {
                            b1.n("CXCP", "Failed to getAvailableSessionKeys from Camera-" + str10, e9);
                            return xu4Var;
                        }
                }
            }
        });
        final int i8 = 7;
        this.w = eb3.N(z18Var, new x16(this) { // from class: mc1
            public final /* synthetic */ nc1 b;

            {
                this.b = this;
            }

            @Override // defpackage.x16
            public final Object invoke() {
                Set setO1;
                int i9 = i8;
                List list = pu4.a;
                xu4 xu4Var = xu4.a;
                nc1 nc1Var = this.b;
                switch (i9) {
                    case 0:
                        String str2 = nc1Var.a;
                        try {
                            try {
                                Trace.beginSection("Camera-" + ((Object) ig1.b(str2)) + "#supportedExtensions");
                                qd1 qd1Var2 = nc1Var.c;
                                str2.getClass();
                                if (Build.VERSION.SDK_INT >= 31) {
                                    setO1 = s72.o1(xq.r(qd1Var2.d(str2)));
                                    break;
                                } else {
                                    setO1 = xu4Var;
                                }
                                return setO1;
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e) {
                            b1.n("CXCP", "Failed to getSupportedExtensions from Camera-" + ((Object) ig1.b(str2)), e);
                            return xu4Var;
                        }
                    case 1:
                        String str3 = nc1Var.a;
                        try {
                            try {
                                Trace.beginSection(((Object) ig1.b(str3)) + "#keys");
                                List<CameraCharacteristics.Key<?>> keys = nc1Var.b.getKeys();
                                if (keys != null) {
                                    list = keys;
                                }
                                return s72.o1(list);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e2) {
                            b1.n("CXCP", "Failed to getKeys from " + ((Object) ig1.b(str3)) + '}', e2);
                            return xu4Var;
                        }
                    case 2:
                        String str4 = nc1Var.a;
                        try {
                            try {
                                Trace.beginSection(((Object) ig1.b(str4)) + "#availableCaptureRequestKeys");
                                List<CaptureRequest.Key<?>> availableCaptureRequestKeys = nc1Var.b.getAvailableCaptureRequestKeys();
                                if (availableCaptureRequestKeys != null) {
                                    list = availableCaptureRequestKeys;
                                }
                                return s72.o1(list);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e3) {
                            b1.n("CXCP", "Failed to getAvailableCaptureRequestKeys from " + ((Object) ig1.b(str4)), e3);
                            return xu4Var;
                        }
                    case 3:
                        String str5 = nc1Var.a;
                        try {
                            try {
                                Trace.beginSection(((Object) ig1.b(str5)) + "#availableCaptureResultKeys");
                                List<CaptureResult.Key<?>> availableCaptureResultKeys = nc1Var.b.getAvailableCaptureResultKeys();
                                if (availableCaptureResultKeys != null) {
                                    list = availableCaptureResultKeys;
                                }
                                return s72.o1(list);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e4) {
                            b1.n("CXCP", "Failed to getAvailableCaptureResultKeys from " + ((Object) ig1.b(str5)), e4);
                            return xu4Var;
                        }
                    case 4:
                        String str6 = nc1Var.a;
                        if (Build.VERSION.SDK_INT < 28) {
                            return xu4Var;
                        }
                        try {
                            try {
                                Trace.beginSection(((Object) ig1.b(str6)) + "#physicalCameraIds");
                                Set setA = s.A(nc1Var.b);
                                Log.i("CXCP", "Loaded physicalCameraIds from " + ((Object) ig1.b(str6)) + ": " + setA);
                                Set<String> set2 = setA;
                                ArrayList arrayList = new ArrayList(t72.u(set2, 10));
                                for (String str7 : set2) {
                                    ig1.a(str7);
                                    arrayList.add(new ig1(str7));
                                }
                                return s72.o1(arrayList);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e5) {
                            b1.n("CXCP", "Failed to getPhysicalCameraIds from " + ((Object) ig1.b(str6)), e5);
                            return xu4Var;
                        } catch (NullPointerException e6) {
                            b1.n("CXCP", "Failed to getPhysicalCameraIds from " + ((Object) ig1.b(str6)), e6);
                            return xu4Var;
                        }
                    case 5:
                        String str8 = nc1Var.a;
                        if (Build.VERSION.SDK_INT < 28) {
                            return xu4Var;
                        }
                        try {
                            try {
                                Trace.beginSection("Camera-" + str8 + "#availablePhysicalCameraRequestKeys");
                                List listQ = s.q(nc1Var.b);
                                if (listQ != null) {
                                    list = listQ;
                                }
                                return s72.o1(list);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e7) {
                            b1.n("CXCP", "Failed to getAvailablePhysicalCameraRequestKeys from Camera-" + str8, e7);
                            return xu4Var;
                        }
                    case 6:
                        String str9 = nc1Var.a;
                        if (Build.VERSION.SDK_INT < 35) {
                            return xu4Var;
                        }
                        try {
                            try {
                                Trace.beginSection("Camera-" + str9 + "#getAvailableSessionCharacteristicsKeys");
                                List listC = v60.c(nc1Var.b);
                                if (listC != null) {
                                    list = listC;
                                }
                                return s72.o1(list);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e8) {
                            b1.n("CXCP", "Failed to getAvailableSessionCharacteristicsKeys from Camera-" + str9, e8);
                            return xu4Var;
                        }
                    default:
                        String str10 = nc1Var.a;
                        if (Build.VERSION.SDK_INT < 28) {
                            return xu4Var;
                        }
                        try {
                            try {
                                Trace.beginSection("Camera-" + str10 + "#availableSessionKeys");
                                List listR = s.r(nc1Var.b);
                                if (listR != null) {
                                    list = listR;
                                }
                                return s72.o1(list);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e9) {
                            b1.n("CXCP", "Failed to getAvailableSessionKeys from Camera-" + str10, e9);
                            return xu4Var;
                        }
                }
            }
        });
    }

    @Override // defpackage.yff
    public final Object H0(em7 em7Var) {
        em7Var.getClass();
        if (em7Var.equals(job.a.b(CameraCharacteristics.class))) {
            return this.b;
        }
        return null;
    }

    public final Object c(CameraCharacteristics.Key key) {
        Object obj;
        if (this.d.contains(key)) {
            try {
                return this.b.get(key);
            } catch (AssertionError unused) {
                yg5.k(key, ": Framework throw an AssertionError", "Failed to get characteristic for ");
                return null;
            }
        }
        synchronized (this.e) {
            obj = this.e.get(key);
        }
        if (obj != null) {
            return obj;
        }
        try {
            Object obj2 = this.b.get(key);
            if (obj2 == null) {
                return obj2;
            }
            synchronized (this.e) {
                this.e.put(key, obj2);
            }
            return obj2;
        } catch (AssertionError unused2) {
            yg5.k(key, ": Framework throw an AssertionError", "Failed to get characteristic for ");
            return null;
        }
    }
}
