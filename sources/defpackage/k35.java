package defpackage;

import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class k35 {
    public static final v35[] b;
    public static final v35[][] c;
    public static final HashSet d;
    public static final String e;
    public final ArrayList a;

    static {
        v35[] v35VarArr = {new v35("ImageWidth", 256, 3, 4), new v35("ImageLength", 257, 3, 4), new v35("Make", 271, 2), new v35("Model", 272, 2), new v35("Orientation", 274, 3), new v35("XResolution", 282, 5), new v35("YResolution", 283, 5), new v35("ResolutionUnit", 296, 3), new v35("Software", 305, 2), new v35("DateTime", 306, 2), new v35("YCbCrPositioning", 531, 3), new v35("SubIFDPointer", 330, 4), new v35("ExifIFDPointer", 34665, 4), new v35("GPSInfoIFDPointer", 34853, 4)};
        v35[] v35VarArr2 = {new v35("ExposureTime", 33434, 5), new v35("FNumber", 33437, 5), new v35("ExposureProgram", 34850, 3), new v35("PhotographicSensitivity", 34855, 3), new v35("SensitivityType", 34864, 3), new v35("ExifVersion", 36864, 2), new v35("DateTimeOriginal", 36867, 2), new v35("DateTimeDigitized", 36868, 2), new v35("ComponentsConfiguration", 37121, 7), new v35("ShutterSpeedValue", 37377, 10), new v35("ApertureValue", 37378, 5), new v35("BrightnessValue", 37379, 10), new v35("ExposureBiasValue", 37380, 10), new v35("MaxApertureValue", 37381, 5), new v35("MeteringMode", 37383, 3), new v35("LightSource", 37384, 3), new v35("Flash", 37385, 3), new v35("FocalLength", 37386, 5), new v35("SubSecTime", 37520, 2), new v35("SubSecTimeOriginal", 37521, 2), new v35("SubSecTimeDigitized", 37522, 2), new v35("FlashpixVersion", 40960, 7), new v35("ColorSpace", 40961, 3), new v35("PixelXDimension", 40962, 3, 4), new v35("PixelYDimension", 40963, 3, 4), new v35("InteroperabilityIFDPointer", 40965, 4), new v35("FocalPlaneResolutionUnit", 41488, 3), new v35("SensingMethod", 41495, 3), new v35("FileSource", 41728, 7), new v35("SceneType", 41729, 7), new v35("CustomRendered", 41985, 3), new v35("ExposureMode", 41986, 3), new v35("WhiteBalance", 41987, 3), new v35("SceneCaptureType", 41990, 3), new v35("Contrast", 41992, 3), new v35("Saturation", 41993, 3), new v35("Sharpness", 41994, 3)};
        v35[] v35VarArr3 = {new v35("GPSVersionID", 0, 1), new v35("GPSLatitudeRef", 1, 2), new v35("GPSLatitude", 2, 5, 10), new v35("GPSLongitudeRef", 3, 2), new v35("GPSLongitude", 4, 5, 10), new v35("GPSAltitudeRef", 5, 1), new v35("GPSAltitude", 6, 5), new v35("GPSTimeStamp", 7, 5), new v35("GPSSpeedRef", 12, 2), new v35("GPSTrackRef", 14, 2), new v35("GPSImgDirectionRef", 16, 2), new v35("GPSDestBearingRef", 23, 2), new v35("GPSDestDistanceRef", 25, 2)};
        b = new v35[]{new v35("SubIFDPointer", 330, 4), new v35("ExifIFDPointer", 34665, 4), new v35("GPSInfoIFDPointer", 34853, 4), new v35("InteroperabilityIFDPointer", 40965, 4)};
        c = new v35[][]{v35VarArr, v35VarArr2, v35VarArr3, new v35[]{new v35("InteroperabilityIndex", 1, 2)}};
        d = new HashSet(Arrays.asList("FNumber", "ExposureTime", "GPSTimeStamp"));
        e = new String(new byte[]{1, 2, 3, 0}, StandardCharsets.UTF_8);
    }

    public k35(ArrayList arrayList) {
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        ok8.o("Malformed attributes list. Number of IFDs mismatch.", arrayList.size() == 4);
        this.a = arrayList;
    }

    public final Map a(int i) {
        ok8.m(tec.f(i, "Invalid IFD index: ", ". Index should be between [0, EXIF_TAGS.length] "), i, 0, 4);
        return (Map) this.a.get(i);
    }
}
