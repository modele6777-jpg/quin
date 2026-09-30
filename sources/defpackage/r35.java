package defpackage;

import android.content.res.AssetManager;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import io.sentry.android.core.b1;
import io.sentry.android.replay.capture.v;
import java.io.BufferedInputStream;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Pattern;
import java.util.zip.CRC32;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class r35 {
    public static final byte[] A;
    public static final byte[] B;
    public static final byte[] C;
    public static final byte[] D;
    public static final String[] E;
    public static final int[] F;
    public static final byte[] G;
    public static final o35 H;
    public static final o35[][] I;
    public static final o35[] J;
    public static final HashMap[] K;
    public static final HashMap[] L;
    public static final Set M;
    public static final HashMap N;
    public static final Charset O;
    public static final byte[] P;
    public static final byte[] Q;
    public static final boolean o = Log.isLoggable("ExifInterface", 3);
    public static final int[] p;
    public static final int[] q;
    public static final byte[] r;
    public static final byte[] s;
    public static final byte[] t;
    public static final byte[] u;
    public static final byte[] v;
    public static final byte[] w;
    public static final byte[] x;
    public static final byte[] y;
    public static final byte[] z;
    public final String a;
    public final FileDescriptor b;
    public final AssetManager.AssetInputStream c;
    public int d;
    public final boolean e;
    public final HashMap[] f;
    public final HashSet g;
    public ByteOrder h;
    public boolean i;
    public int j;
    public int k;
    public int l;
    public int m;
    public n35 n;

    static {
        Arrays.asList(1, 6, 3, 8);
        Arrays.asList(2, 7, 4, 5);
        p = new int[]{8, 8, 8};
        q = new int[]{8};
        r = new byte[]{-1, -40, -1};
        s = new byte[]{102, 116, 121, 112};
        t = new byte[]{109, 105, 102, 49};
        u = new byte[]{104, 101, 105, 99};
        v = new byte[]{97, 118, 105, 102};
        w = new byte[]{97, 118, 105, 115};
        x = new byte[]{79, 76, 89, 77, 80, 0};
        y = new byte[]{79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
        z = new byte[]{-119, 80, 78, 71, 13, 10, 26, 10};
        A = "XML:com.adobe.xmp\u0000\u0000\u0000\u0000\u0000".getBytes(StandardCharsets.UTF_8);
        B = new byte[]{82, 73, 70, 70};
        C = new byte[]{87, 69, 66, 80};
        D = new byte[]{69, 88, 73, 70};
        "VP8X".getBytes(Charset.defaultCharset());
        "VP8L".getBytes(Charset.defaultCharset());
        "VP8 ".getBytes(Charset.defaultCharset());
        "ANIM".getBytes(Charset.defaultCharset());
        "ANMF".getBytes(Charset.defaultCharset());
        E = new String[]{"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
        F = new int[]{0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
        G = new byte[]{65, 83, 67, 73, 73, 0, 0, 0};
        o35[] o35VarArr = {new o35("NewSubfileType", 254, 4), new o35("SubfileType", 255, 4), new o35("ImageWidth", 256, 3, 4), new o35("ImageLength", 257, 3, 4), new o35("BitsPerSample", 258, 3), new o35("Compression", 259, 3), new o35("PhotometricInterpretation", 262, 3), new o35("ImageDescription", 270, 2), new o35("Make", 271, 2), new o35("Model", 272, 2), new o35("StripOffsets", 273, 3, 4), new o35("Orientation", 274, 3), new o35("SamplesPerPixel", 277, 3), new o35("RowsPerStrip", 278, 3, 4), new o35("StripByteCounts", 279, 3, 4), new o35("XResolution", 282, 5), new o35("YResolution", 283, 5), new o35("PlanarConfiguration", 284, 3), new o35("ResolutionUnit", 296, 3), new o35("TransferFunction", 301, 3), new o35("Software", 305, 2), new o35("DateTime", 306, 2), new o35("Artist", 315, 2), new o35("WhitePoint", 318, 5), new o35("PrimaryChromaticities", 319, 5), new o35("SubIFDPointer", 330, 4), new o35("JPEGInterchangeFormat", 513, 4), new o35("JPEGInterchangeFormatLength", 514, 4), new o35("YCbCrCoefficients", 529, 5), new o35("YCbCrSubSampling", 530, 3), new o35("YCbCrPositioning", 531, 3), new o35("ReferenceBlackWhite", 532, 5), new o35("Copyright", 33432, 2), new o35("ExifIFDPointer", 34665, 4), new o35("GPSInfoIFDPointer", 34853, 4), new o35("SensorTopBorder", 4, 4), new o35("SensorLeftBorder", 5, 4), new o35("SensorBottomBorder", 6, 4), new o35("SensorRightBorder", 7, 4), new o35("ISO", 23, 3), new o35("JpgFromRaw", 46, 7), new o35("Xmp", 700, 1)};
        o35[] o35VarArr2 = {new o35("ExposureTime", 33434, 5), new o35("FNumber", 33437, 5), new o35("ExposureProgram", 34850, 3), new o35("SpectralSensitivity", 34852, 2), new o35("PhotographicSensitivity", 34855, 3), new o35("OECF", 34856, 7), new o35("SensitivityType", 34864, 3), new o35("StandardOutputSensitivity", 34865, 4), new o35("RecommendedExposureIndex", 34866, 4), new o35("ISOSpeed", 34867, 4), new o35("ISOSpeedLatitudeyyy", 34868, 4), new o35("ISOSpeedLatitudezzz", 34869, 4), new o35("ExifVersion", 36864, 2), new o35("DateTimeOriginal", 36867, 2), new o35("DateTimeDigitized", 36868, 2), new o35("OffsetTime", 36880, 2), new o35("OffsetTimeOriginal", 36881, 2), new o35("OffsetTimeDigitized", 36882, 2), new o35("ComponentsConfiguration", 37121, 7), new o35("CompressedBitsPerPixel", 37122, 5), new o35("ShutterSpeedValue", 37377, 10), new o35("ApertureValue", 37378, 5), new o35("BrightnessValue", 37379, 10), new o35("ExposureBiasValue", 37380, 10), new o35("MaxApertureValue", 37381, 5), new o35("SubjectDistance", 37382, 5), new o35("MeteringMode", 37383, 3), new o35("LightSource", 37384, 3), new o35("Flash", 37385, 3), new o35("FocalLength", 37386, 5), new o35("SubjectArea", 37396, 3), new o35("MakerNote", 37500, 7), new o35("UserComment", 37510, 7), new o35("SubSecTime", 37520, 2), new o35("SubSecTimeOriginal", 37521, 2), new o35("SubSecTimeDigitized", 37522, 2), new o35("FlashpixVersion", 40960, 7), new o35("ColorSpace", 40961, 3), new o35("PixelXDimension", 40962, 3, 4), new o35("PixelYDimension", 40963, 3, 4), new o35("RelatedSoundFile", 40964, 2), new o35("InteroperabilityIFDPointer", 40965, 4), new o35("FlashEnergy", 41483, 5), new o35("SpatialFrequencyResponse", 41484, 7), new o35("FocalPlaneXResolution", 41486, 5), new o35("FocalPlaneYResolution", 41487, 5), new o35("FocalPlaneResolutionUnit", 41488, 3), new o35("SubjectLocation", 41492, 3), new o35("ExposureIndex", 41493, 5), new o35("SensingMethod", 41495, 3), new o35("FileSource", 41728, 7), new o35("SceneType", 41729, 7), new o35("CFAPattern", 41730, 7), new o35("CustomRendered", 41985, 3), new o35("ExposureMode", 41986, 3), new o35("WhiteBalance", 41987, 3), new o35("DigitalZoomRatio", 41988, 5), new o35("FocalLengthIn35mmFilm", 41989, 3), new o35("SceneCaptureType", 41990, 3), new o35("GainControl", 41991, 3), new o35("Contrast", 41992, 3), new o35("Saturation", 41993, 3), new o35("Sharpness", 41994, 3), new o35("DeviceSettingDescription", 41995, 7), new o35("SubjectDistanceRange", 41996, 3), new o35("ImageUniqueID", 42016, 2), new o35("CameraOwnerName", 42032, 2), new o35("BodySerialNumber", 42033, 2), new o35("LensSpecification", 42034, 5), new o35("LensMake", 42035, 2), new o35("LensModel", 42036, 2), new o35("Gamma", 42240, 5), new o35("DNGVersion", 50706, 1), new o35("DefaultCropSize", 50720, 3, 4)};
        o35[] o35VarArr3 = {new o35("GPSVersionID", 0, 1), new o35("GPSLatitudeRef", 1, 2), new o35("GPSLatitude", 2, 5, 10), new o35("GPSLongitudeRef", 3, 2), new o35("GPSLongitude", 4, 5, 10), new o35("GPSAltitudeRef", 5, 1), new o35("GPSAltitude", 6, 5), new o35("GPSTimeStamp", 7, 5), new o35("GPSSatellites", 8, 2), new o35("GPSStatus", 9, 2), new o35("GPSMeasureMode", 10, 2), new o35("GPSDOP", 11, 5), new o35("GPSSpeedRef", 12, 2), new o35("GPSSpeed", 13, 5), new o35("GPSTrackRef", 14, 2), new o35("GPSTrack", 15, 5), new o35("GPSImgDirectionRef", 16, 2), new o35("GPSImgDirection", 17, 5), new o35("GPSMapDatum", 18, 2), new o35("GPSDestLatitudeRef", 19, 2), new o35("GPSDestLatitude", 20, 5), new o35("GPSDestLongitudeRef", 21, 2), new o35("GPSDestLongitude", 22, 5), new o35("GPSDestBearingRef", 23, 2), new o35("GPSDestBearing", 24, 5), new o35("GPSDestDistanceRef", 25, 2), new o35("GPSDestDistance", 26, 5), new o35("GPSProcessingMethod", 27, 7), new o35("GPSAreaInformation", 28, 7), new o35("GPSDateStamp", 29, 2), new o35("GPSDifferential", 30, 3), new o35("GPSHPositioningError", 31, 5)};
        o35[] o35VarArr4 = {new o35("InteroperabilityIndex", 1, 2)};
        o35[] o35VarArr5 = {new o35("NewSubfileType", 254, 4), new o35("SubfileType", 255, 4), new o35("ThumbnailImageWidth", 256, 3, 4), new o35("ThumbnailImageLength", 257, 3, 4), new o35("BitsPerSample", 258, 3), new o35("Compression", 259, 3), new o35("PhotometricInterpretation", 262, 3), new o35("ImageDescription", 270, 2), new o35("Make", 271, 2), new o35("Model", 272, 2), new o35("StripOffsets", 273, 3, 4), new o35("ThumbnailOrientation", 274, 3), new o35("SamplesPerPixel", 277, 3), new o35("RowsPerStrip", 278, 3, 4), new o35("StripByteCounts", 279, 3, 4), new o35("XResolution", 282, 5), new o35("YResolution", 283, 5), new o35("PlanarConfiguration", 284, 3), new o35("ResolutionUnit", 296, 3), new o35("TransferFunction", 301, 3), new o35("Software", 305, 2), new o35("DateTime", 306, 2), new o35("Artist", 315, 2), new o35("WhitePoint", 318, 5), new o35("PrimaryChromaticities", 319, 5), new o35("SubIFDPointer", 330, 4), new o35("JPEGInterchangeFormat", 513, 4), new o35("JPEGInterchangeFormatLength", 514, 4), new o35("YCbCrCoefficients", 529, 5), new o35("YCbCrSubSampling", 530, 3), new o35("YCbCrPositioning", 531, 3), new o35("ReferenceBlackWhite", 532, 5), new o35("Copyright", 33432, 2), new o35("ExifIFDPointer", 34665, 4), new o35("GPSInfoIFDPointer", 34853, 4), new o35("DNGVersion", 50706, 1), new o35("DefaultCropSize", 50720, 3, 4)};
        H = new o35("StripOffsets", 273, 3);
        I = new o35[][]{o35VarArr, o35VarArr2, o35VarArr3, o35VarArr4, o35VarArr5, o35VarArr, new o35[]{new o35("ThumbnailImage", 256, 7), new o35("CameraSettingsIFDPointer", 8224, 4), new o35("ImageProcessingIFDPointer", 8256, 4)}, new o35[]{new o35("PreviewImageStart", 257, 4), new o35("PreviewImageLength", 258, 4)}, new o35[]{new o35("AspectFrame", 4371, 3)}, new o35[]{new o35("ColorSpace", 55, 3)}};
        J = new o35[]{new o35("SubIFDPointer", 330, 4), new o35("ExifIFDPointer", 34665, 4), new o35("GPSInfoIFDPointer", 34853, 4), new o35("InteroperabilityIFDPointer", 40965, 4), new o35("CameraSettingsIFDPointer", 8224, 1), new o35("ImageProcessingIFDPointer", 8256, 1)};
        K = new HashMap[10];
        L = new HashMap[10];
        M = Collections.unmodifiableSet(new HashSet(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance")));
        N = new HashMap();
        Charset charsetForName = Charset.forName("US-ASCII");
        O = charsetForName;
        P = "Exif\u0000\u0000".getBytes(charsetForName);
        Q = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(charsetForName);
        Locale locale = Locale.US;
        new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        int i = 0;
        while (true) {
            o35[][] o35VarArr6 = I;
            if (i >= o35VarArr6.length) {
                HashMap map = N;
                o35[] o35VarArr7 = J;
                map.put(Integer.valueOf(o35VarArr7[0].a), 5);
                map.put(Integer.valueOf(o35VarArr7[1].a), 1);
                map.put(Integer.valueOf(o35VarArr7[2].a), 2);
                map.put(Integer.valueOf(o35VarArr7[3].a), 3);
                map.put(Integer.valueOf(o35VarArr7[4].a), 7);
                map.put(Integer.valueOf(o35VarArr7[5].a), 8);
                Pattern.compile(".*[1-9].*");
                Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
            K[i] = new HashMap();
            L[i] = new HashMap();
            for (o35 o35Var : o35VarArr6[i]) {
                K[i].put(Integer.valueOf(o35Var.a), o35Var);
                L[i].put(o35Var.b, o35Var);
            }
            i++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:65:0x00f7 A[Catch: all -> 0x0064, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0064, blocks: (B:14:0x0055, B:16:0x0058, B:24:0x006f, B:25:0x007d, B:31:0x008f, B:33:0x0096, B:51:0x00c7, B:38:0x00a6, B:45:0x00b4, B:48:0x00bc, B:49:0x00c0, B:50:0x00c4, B:52:0x00d1, B:54:0x00da, B:56:0x00e0, B:58:0x00e6, B:60:0x00ec, B:65:0x00f7), top: B:75:0x0055 }] */
    /* JADX WARN: Code duplicated, block: B:81:? A[RETURN, SYNTHETIC] */
    public r35(InputStream inputStream) throws IOException {
        o35[][] o35VarArr = I;
        this.f = new HashMap[o35VarArr.length];
        this.g = new HashSet(o35VarArr.length);
        this.h = ByteOrder.BIG_ENDIAN;
        this.a = null;
        this.e = false;
        boolean z2 = inputStream instanceof AssetManager.AssetInputStream;
        boolean z3 = o;
        if (z2) {
            this.c = (AssetManager.AssetInputStream) inputStream;
            this.b = null;
        } else if (inputStream instanceof FileInputStream) {
            FileInputStream fileInputStream = (FileInputStream) inputStream;
            try {
                Os.lseek(fileInputStream.getFD(), 0L, OsConstants.SEEK_CUR);
                this.c = null;
                this.b = fileInputStream.getFD();
            } catch (Exception unused) {
                if (z3) {
                    Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
                }
                this.c = null;
                this.b = null;
            }
        } else {
            this.c = null;
            this.b = null;
        }
        boolean z4 = this.e;
        for (int i = 0; i < o35VarArr.length; i++) {
            try {
                try {
                    this.f[i] = new HashMap();
                } catch (IOException e) {
                    e = e;
                    if (z3) {
                        b1.n("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file (ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e);
                    }
                    a();
                    if (!z3) {
                        return;
                    }
                } catch (UnsupportedOperationException e2) {
                    e = e2;
                    if (z3) {
                        b1.n("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file (ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e);
                    }
                    a();
                    if (!z3) {
                        return;
                    }
                }
            } catch (Throwable th) {
                a();
                if (z3) {
                    s();
                }
                throw th;
            }
        }
        if (!z4) {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 5000);
            this.d = h(bufferedInputStream);
            inputStream = bufferedInputStream;
        }
        int i2 = this.d;
        if (i2 == 4 || i2 == 9 || i2 == 13 || i2 == 14) {
            m35 m35Var = new m35(inputStream);
            int i3 = this.d;
            if (i3 == 4) {
                g(m35Var, 0, 0);
            } else if (i3 == 13) {
                j(m35Var);
            } else if (i3 == 9) {
                k(m35Var);
            } else if (i3 == 14) {
                o(m35Var);
            }
        } else {
            q35 q35Var = new q35(inputStream);
            if (z4) {
                if (!n(q35Var)) {
                    a();
                    if (!z3) {
                        return;
                    }
                }
                s();
            }
            int i4 = this.d;
            if (i4 == 12 || i4 == 15) {
                f(q35Var, i4);
            } else if (i4 == 7) {
                i(q35Var);
            } else if (i4 == 10) {
                m(q35Var);
            } else {
                l(q35Var);
            }
            q35Var.h(this.j);
            x(q35Var);
        }
        a();
        if (!z3) {
            return;
        }
        s();
    }

    public static double b(String str, String str2) {
        try {
            String[] strArrSplit = str.split(",", -1);
            String[] strArrSplit2 = strArrSplit[0].split("/", -1);
            double d = Double.parseDouble(strArrSplit2[0].trim()) / Double.parseDouble(strArrSplit2[1].trim());
            String[] strArrSplit3 = strArrSplit[1].split("/", -1);
            double d2 = Double.parseDouble(strArrSplit3[0].trim()) / Double.parseDouble(strArrSplit3[1].trim());
            String[] strArrSplit4 = strArrSplit[2].split("/", -1);
            double d3 = ((Double.parseDouble(strArrSplit4[0].trim()) / Double.parseDouble(strArrSplit4[1].trim())) / 3600.0d) + (d2 / 60.0d) + d;
            if (!str2.equals("S") && !str2.equals("W")) {
                if (!str2.equals("N") && !str2.equals("E")) {
                    throw new IllegalArgumentException();
                }
                return d3;
            }
            return -d3;
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static ByteOrder t(m35 m35Var) throws IOException {
        short s2 = m35Var.readShort();
        boolean z2 = o;
        if (s2 == 18761) {
            if (z2) {
                Log.d("ExifInterface", "readExifSegment: Byte Align II");
            }
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (s2 != 19789) {
            v.b(Integer.toHexString(s2), "Invalid byte order: ");
            return null;
        }
        if (z2) {
            Log.d("ExifInterface", "readExifSegment: Byte Align MM");
        }
        return ByteOrder.BIG_ENDIAN;
    }

    public final void A() throws Throwable {
        y(0, 5);
        y(0, 4);
        y(5, 4);
        HashMap[] mapArr = this.f;
        n35 n35Var = (n35) mapArr[1].get("PixelXDimension");
        n35 n35Var2 = (n35) mapArr[1].get("PixelYDimension");
        if (n35Var != null && n35Var2 != null) {
            mapArr[0].put("ImageWidth", n35Var);
            mapArr[0].put("ImageLength", n35Var2);
        }
        if (mapArr[4].isEmpty() && q(mapArr[5])) {
            mapArr[4] = mapArr[5];
            mapArr[5] = new HashMap();
        }
        if (!q(mapArr[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
        w(0, "ThumbnailOrientation", "Orientation");
        w(0, "ThumbnailImageLength", "ImageLength");
        w(0, "ThumbnailImageWidth", "ImageWidth");
        w(5, "ThumbnailOrientation", "Orientation");
        w(5, "ThumbnailImageLength", "ImageLength");
        w(5, "ThumbnailImageWidth", "ImageWidth");
        w(4, "Orientation", "ThumbnailOrientation");
        w(4, "ImageLength", "ThumbnailImageLength");
        w(4, "ImageWidth", "ThumbnailImageWidth");
    }

    public final void a() {
        String strC = c("DateTimeOriginal");
        HashMap[] mapArr = this.f;
        if (strC != null && c("DateTime") == null) {
            mapArr[0].put("DateTime", n35.a(strC));
        }
        if (c("ImageWidth") == null) {
            mapArr[0].put("ImageWidth", n35.b(0L, this.h));
        }
        if (c("ImageLength") == null) {
            mapArr[0].put("ImageLength", n35.b(0L, this.h));
        }
        if (c("Orientation") == null) {
            mapArr[0].put("Orientation", n35.b(0L, this.h));
        }
        if (c("LightSource") == null) {
            mapArr[1].put("LightSource", n35.b(0L, this.h));
        }
    }

    public final String c(String str) {
        if (str == null) {
            r82.g("tag shouldn't be null");
            return null;
        }
        n35 n35VarE = e(str);
        if (n35VarE != null) {
            int i = n35VarE.a;
            if (str.equals("GPSTimeStamp")) {
                if (i != 5 && i != 10) {
                    b1.l("ExifInterface", "GPS Timestamp format is not rational. format=" + i);
                    return null;
                }
                p35[] p35VarArr = (p35[]) n35VarE.h(this.h);
                if (p35VarArr == null || p35VarArr.length != 3) {
                    b1.l("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(p35VarArr));
                    return null;
                }
                p35 p35Var = p35VarArr[0];
                Integer numValueOf = Integer.valueOf((int) (p35Var.a / p35Var.b));
                p35 p35Var2 = p35VarArr[1];
                Integer numValueOf2 = Integer.valueOf((int) (p35Var2.a / p35Var2.b));
                p35 p35Var3 = p35VarArr[2];
                return String.format("%02d:%02d:%02d", numValueOf, numValueOf2, Integer.valueOf((int) (p35Var3.a / p35Var3.b)));
            }
            boolean zContains = M.contains(str);
            ByteOrder byteOrder = this.h;
            if (!zContains) {
                return n35VarE.g(byteOrder);
            }
            try {
                return Double.toString(n35VarE.e(byteOrder));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public final int d(int i, String str) {
        n35 n35VarE = e(str);
        if (n35VarE != null) {
            try {
                return n35VarE.f(this.h);
            } catch (NumberFormatException unused) {
            }
        }
        return i;
    }

    public final n35 e(String str) {
        n35 n35Var;
        int i;
        n35 n35Var2;
        if (str == null) {
            r82.g("tag shouldn't be null");
            return null;
        }
        if ("ISOSpeedRatings".equals(str)) {
            if (o) {
                Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str = "PhotographicSensitivity";
        }
        if ("Xmp".equals(str) && (i = this.d) != 4 && ((i == 9 || i == 15 || i == 12 || i == 13) && (n35Var2 = this.n) != null)) {
            return n35Var2;
        }
        for (int i2 = 0; i2 < I.length; i2++) {
            n35 n35Var3 = (n35) this.f[i2].get(str);
            if (n35Var3 != null) {
                return n35Var3;
            }
        }
        if (!"Xmp".equals(str) || (n35Var = this.n) == null) {
            return null;
        }
        return n35Var;
    }

    public final void f(q35 q35Var, int i) {
        String strExtractMetadata;
        String strExtractMetadata2;
        String strExtractMetadata3;
        int i2;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 28) {
            s8f.i("Reading EXIF from HEIC files is supported from SDK 28 and above");
            return;
        }
        if (i == 15 && i3 < 31) {
            s8f.i("Reading EXIF from AVIF files is supported from SDK 31 and above");
            return;
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                mediaMetadataRetriever.setDataSource(new l35(q35Var));
                String strExtractMetadata4 = mediaMetadataRetriever.extractMetadata(33);
                String strExtractMetadata5 = mediaMetadataRetriever.extractMetadata(34);
                String strExtractMetadata6 = mediaMetadataRetriever.extractMetadata(26);
                String strExtractMetadata7 = mediaMetadataRetriever.extractMetadata(17);
                if ("yes".equals(strExtractMetadata6)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(29);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(30);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(31);
                } else if ("yes".equals(strExtractMetadata7)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(18);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(19);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(24);
                } else {
                    strExtractMetadata = null;
                    strExtractMetadata2 = null;
                    strExtractMetadata3 = null;
                }
                HashMap[] mapArr = this.f;
                if (strExtractMetadata != null) {
                    mapArr[0].put("ImageWidth", n35.d(Integer.parseInt(strExtractMetadata), this.h));
                }
                if (strExtractMetadata3 != null) {
                    mapArr[0].put("ImageLength", n35.d(Integer.parseInt(strExtractMetadata3), this.h));
                }
                if (strExtractMetadata2 != null) {
                    int i4 = Integer.parseInt(strExtractMetadata2);
                    if (i4 == 90) {
                        i2 = 6;
                    } else if (i4 != 180) {
                        i2 = i4 != 270 ? 1 : 8;
                    } else {
                        i2 = 3;
                    }
                    mapArr[0].put("Orientation", n35.d(i2, this.h));
                }
                if (strExtractMetadata4 != null && strExtractMetadata5 != null) {
                    int i5 = Integer.parseInt(strExtractMetadata4);
                    int i6 = Integer.parseInt(strExtractMetadata5);
                    if (i6 <= 6) {
                        throw new IOException("Invalid exif length");
                    }
                    q35Var.h(i5);
                    byte[] bArr = new byte[6];
                    q35Var.readFully(bArr);
                    int i7 = i5 + 6;
                    int i8 = i6 - 6;
                    if (!Arrays.equals(bArr, P)) {
                        throw new IOException("Invalid identifier");
                    }
                    byte[] bArr2 = new byte[i8];
                    q35Var.readFully(bArr2);
                    this.j = i7;
                    u(bArr2, 0);
                }
                String strExtractMetadata8 = mediaMetadataRetriever.extractMetadata(41);
                String strExtractMetadata9 = mediaMetadataRetriever.extractMetadata(42);
                if (strExtractMetadata8 != null && strExtractMetadata9 != null) {
                    int i9 = Integer.parseInt(strExtractMetadata8);
                    int i10 = Integer.parseInt(strExtractMetadata9);
                    long j = i9;
                    q35Var.h(j);
                    byte[] bArr3 = new byte[i10];
                    q35Var.readFully(bArr3);
                    this.n = new n35(j, bArr3, 1, i10);
                }
                if (o) {
                    Log.d("ExifInterface", "Heif meta: " + strExtractMetadata + "x" + strExtractMetadata3 + ", rotation " + strExtractMetadata2);
                }
                try {
                    mediaMetadataRetriever.release();
                } catch (IOException unused) {
                }
            } catch (RuntimeException e) {
                throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.", e);
            }
        } catch (Throwable th) {
            try {
                mediaMetadataRetriever.release();
                throw th;
            } catch (IOException unused2) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00af A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:37:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:42:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:56:0x014b A[LOOP:0: B:10:0x0033->B:56:0x014b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:74:0x0151 A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:30:0x00a1. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:31:0x00a4. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x00a7. Please report as an issue. */
    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1095)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:419)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:31)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:399)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:31)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:21)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    public final void g(defpackage.m35 r20, int r21, int r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 428
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r35.g(m35, int, int):void");
    }

    /* JADX WARN: Code duplicated, block: B:146:0x01a5  */
    public final int h(BufferedInputStream bufferedInputStream) throws Throwable {
        int i;
        m35 m35Var;
        int i2;
        m35 m35Var2;
        int i3;
        int i4;
        long j;
        bufferedInputStream.mark(5000);
        byte[] bArr = new byte[5000];
        bufferedInputStream.read(bArr);
        bufferedInputStream.reset();
        int i5 = 0;
        while (true) {
            byte[] bArr2 = r;
            if (i5 >= bArr2.length) {
                return 4;
            }
            if (bArr[i5] != bArr2[i5]) {
                byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
                for (int i6 = 0; i6 < bytes.length; i6++) {
                    if (bArr[i6] != bytes[i6]) {
                        m35 m35Var3 = null;
                        try {
                            m35Var = new m35(bArr);
                            try {
                                try {
                                    long j2 = m35Var.readInt();
                                    byte[] bArr3 = new byte[4];
                                    m35Var.readFully(bArr3);
                                    if (Arrays.equals(bArr3, s)) {
                                        if (j2 == 1) {
                                            j2 = m35Var.readLong();
                                            j = 16;
                                            if (j2 < 16) {
                                            }
                                            m35Var.close();
                                            i = 0;
                                            i2 = 0;
                                        } else {
                                            j = 8;
                                        }
                                        if (j2 > 5000) {
                                            j2 = 5000;
                                        }
                                        long j3 = j2 - j;
                                        if (j3 < 8) {
                                            m35Var.close();
                                            i = 0;
                                            i2 = 0;
                                        } else {
                                            byte[] bArr4 = new byte[4];
                                            long j4 = 0;
                                            boolean z2 = false;
                                            boolean z3 = false;
                                            boolean z4 = false;
                                            while (true) {
                                                if (j4 < j3 / 4) {
                                                    try {
                                                        m35Var.readFully(bArr4);
                                                        if (j4 != 1) {
                                                            i = 0;
                                                            try {
                                                                if (Arrays.equals(bArr4, t)) {
                                                                    z2 = true;
                                                                } else if (Arrays.equals(bArr4, u)) {
                                                                    z3 = true;
                                                                } else if (Arrays.equals(bArr4, v) || Arrays.equals(bArr4, w)) {
                                                                    z4 = true;
                                                                }
                                                                if (!z2) {
                                                                    continue;
                                                                } else if (z3) {
                                                                    m35Var.close();
                                                                    i2 = 12;
                                                                } else if (z4) {
                                                                    m35Var.close();
                                                                    i2 = 15;
                                                                }
                                                            } catch (Exception e) {
                                                                e = e;
                                                                if (o) {
                                                                    Log.d("ExifInterface", "Exception parsing HEIF file type box.", e);
                                                                }
                                                                if (m35Var != null) {
                                                                    m35Var.close();
                                                                }
                                                                i2 = i;
                                                            }
                                                        }
                                                        j4++;
                                                    } catch (EOFException unused) {
                                                        i = 0;
                                                        m35Var.close();
                                                        i2 = i;
                                                    }
                                                } else {
                                                    i = 0;
                                                }
                                                m35Var.close();
                                                i2 = i;
                                            }
                                        }
                                    } else {
                                        m35Var.close();
                                        i = 0;
                                        i2 = 0;
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    m35Var3 = m35Var;
                                    if (m35Var3 != null) {
                                        m35Var3.close();
                                    }
                                    throw th;
                                }
                            } catch (Exception e2) {
                                e = e2;
                                i = 0;
                            }
                        } catch (Exception e3) {
                            e = e3;
                            i = 0;
                            m35Var = null;
                        } catch (Throwable th2) {
                            th = th2;
                            if (m35Var3 != null) {
                                m35Var3.close();
                            }
                            throw th;
                        }
                        if (i2 != 0) {
                            return i2;
                        }
                        try {
                            m35Var2 = new m35(bArr);
                            try {
                                ByteOrder byteOrderT = t(m35Var2);
                                this.h = byteOrderT;
                                m35Var2.c = byteOrderT;
                                short s2 = m35Var2.readShort();
                                i3 = (s2 == 20306 || s2 == 21330) ? 1 : i;
                                m35Var2.close();
                            } catch (Exception unused2) {
                                if (m35Var2 != null) {
                                    m35Var2.close();
                                }
                                i3 = i;
                            } catch (Throwable th3) {
                                th = th3;
                                m35Var3 = m35Var2;
                                if (m35Var3 != null) {
                                    m35Var3.close();
                                }
                                throw th;
                            }
                        } catch (Exception unused3) {
                            m35Var2 = null;
                        } catch (Throwable th4) {
                            th = th4;
                        }
                        if (i3 != 0) {
                            return 7;
                        }
                        try {
                            m35 m35Var4 = new m35(bArr);
                            try {
                                ByteOrder byteOrderT2 = t(m35Var4);
                                this.h = byteOrderT2;
                                m35Var4.c = byteOrderT2;
                                i4 = m35Var4.readShort() != 85 ? i : 1;
                                m35Var4.close();
                            } catch (Exception unused4) {
                                m35Var3 = m35Var4;
                                if (m35Var3 != null) {
                                    m35Var3.close();
                                }
                                i4 = i;
                            } catch (Throwable th5) {
                                th = th5;
                                m35Var3 = m35Var4;
                                if (m35Var3 != null) {
                                    m35Var3.close();
                                }
                                throw th;
                            }
                        } catch (Exception unused5) {
                        } catch (Throwable th6) {
                            th = th6;
                        }
                        if (i4 != 0) {
                            return 10;
                        }
                        int i7 = i;
                        while (true) {
                            byte[] bArr5 = z;
                            if (i7 >= bArr5.length) {
                                return 13;
                            }
                            if (bArr[i7] != bArr5[i7]) {
                                int i8 = i;
                                while (true) {
                                    byte[] bArr6 = B;
                                    if (i8 >= bArr6.length) {
                                        int i9 = i;
                                        while (true) {
                                            byte[] bArr7 = C;
                                            if (i9 >= bArr7.length) {
                                                return 14;
                                            }
                                            if (bArr[bArr6.length + i9 + 4] != bArr7[i9]) {
                                                break;
                                            }
                                            i9++;
                                        }
                                    } else {
                                        if (bArr[i8] != bArr6[i8]) {
                                            break;
                                        }
                                        i8++;
                                    }
                                }
                                return i;
                            }
                            i7++;
                        }
                    }
                }
                return 9;
            }
            i5++;
        }
    }

    public final void i(q35 q35Var) throws Throwable {
        int i;
        int i2;
        l(q35Var);
        HashMap[] mapArr = this.f;
        n35 n35Var = (n35) mapArr[1].get("MakerNote");
        if (n35Var != null) {
            q35 q35Var2 = new q35(n35Var.d);
            q35Var2.c = this.h;
            byte[] bArr = x;
            byte[] bArr2 = new byte[bArr.length];
            q35Var2.readFully(bArr2);
            q35Var2.h(0L);
            byte[] bArr3 = y;
            byte[] bArr4 = new byte[bArr3.length];
            q35Var2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                q35Var2.h(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                q35Var2.h(12L);
            }
            v(q35Var2, 6);
            n35 n35Var2 = (n35) mapArr[7].get("PreviewImageStart");
            n35 n35Var3 = (n35) mapArr[7].get("PreviewImageLength");
            if (n35Var2 != null && n35Var3 != null) {
                mapArr[5].put("JPEGInterchangeFormat", n35Var2);
                mapArr[5].put("JPEGInterchangeFormatLength", n35Var3);
            }
            n35 n35Var4 = (n35) mapArr[8].get("AspectFrame");
            if (n35Var4 != null) {
                int[] iArr = (int[]) n35Var4.h(this.h);
                if (iArr == null || iArr.length != 4) {
                    b1.l("ExifInterface", "Invalid aspect frame values. frame=" + Arrays.toString(iArr));
                    return;
                }
                int i3 = iArr[2];
                int i4 = iArr[0];
                if (i3 <= i4 || (i = iArr[3]) <= (i2 = iArr[1])) {
                    return;
                }
                int i5 = (i3 - i4) + 1;
                int i6 = (i - i2) + 1;
                if (i5 < i6) {
                    int i7 = i5 + i6;
                    i6 = i7 - i6;
                    i5 = i7 - i6;
                }
                n35 n35VarD = n35.d(i5, this.h);
                n35 n35VarD2 = n35.d(i6, this.h);
                mapArr[0].put("ImageWidth", n35VarD);
                mapArr[0].put("ImageLength", n35VarD2);
            }
        }
    }

    public final void j(m35 m35Var) throws Throwable {
        if (o) {
            Log.d("ExifInterface", "getPngAttributes starting with: " + m35Var);
        }
        m35Var.c = ByteOrder.BIG_ENDIAN;
        int i = m35Var.b;
        m35Var.b(z.length);
        boolean z2 = false;
        boolean z3 = false;
        while (true) {
            if (z2 && z3) {
                return;
            }
            try {
                int i2 = m35Var.readInt();
                int i3 = m35Var.readInt();
                int i4 = m35Var.b;
                int i5 = i4 + i2 + 4;
                int i6 = i4 - i;
                if (i6 == 16 && i3 != 1229472850) {
                    throw new IOException("Encountered invalid PNG file--IHDR chunk should appear as the first chunk");
                }
                if (i3 == 1229278788) {
                    return;
                }
                if (i3 == 1700284774 && !z2) {
                    this.j = i6;
                    byte[] bArr = new byte[i2];
                    m35Var.readFully(bArr);
                    int i7 = m35Var.readInt();
                    CRC32 crc32 = new CRC32();
                    crc32.update(i3 >>> 24);
                    crc32.update(i3 >>> 16);
                    crc32.update(i3 >>> 8);
                    crc32.update(i3);
                    crc32.update(bArr);
                    if (((int) crc32.getValue()) != i7) {
                        throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + i7 + ", calculated CRC value: " + crc32.getValue());
                    }
                    u(bArr, 0);
                    A();
                    x(new m35(bArr));
                    z2 = true;
                } else if (i3 == 1767135348 && !z3) {
                    byte[] bArr2 = A;
                    if (i2 >= bArr2.length) {
                        int length = bArr2.length;
                        byte[] bArr3 = new byte[length];
                        m35Var.readFully(bArr3);
                        if (Arrays.equals(bArr3, bArr2)) {
                            int i8 = m35Var.b - i;
                            int i9 = i2 - length;
                            byte[] bArr4 = new byte[i9];
                            m35Var.readFully(bArr4);
                            this.n = new n35(i8, bArr4, 1, i9);
                            z3 = true;
                        }
                    }
                }
                m35Var.b(i5 - m35Var.b);
            } catch (EOFException e) {
                throw new IOException("Encountered corrupt PNG file.", e);
            }
        }
    }

    public final void k(m35 m35Var) throws Throwable {
        boolean z2 = o;
        if (z2) {
            Log.d("ExifInterface", "getRafAttributes starting with: " + m35Var);
        }
        m35Var.b(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        m35Var.readFully(bArr);
        m35Var.readFully(bArr2);
        m35Var.readFully(bArr3);
        int i = ByteBuffer.wrap(bArr).getInt();
        int i2 = ByteBuffer.wrap(bArr2).getInt();
        int i3 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i2];
        m35Var.b(i - m35Var.b);
        m35Var.readFully(bArr4);
        g(new m35(bArr4), i, 5);
        m35Var.b(i3 - m35Var.b);
        m35Var.c = ByteOrder.BIG_ENDIAN;
        int i4 = m35Var.readInt();
        if (z2) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + i4);
        }
        for (int i5 = 0; i5 < i4; i5++) {
            int unsignedShort = m35Var.readUnsignedShort();
            int unsignedShort2 = m35Var.readUnsignedShort();
            if (unsignedShort == H.a) {
                short s2 = m35Var.readShort();
                short s3 = m35Var.readShort();
                n35 n35VarD = n35.d(s2, this.h);
                n35 n35VarD2 = n35.d(s3, this.h);
                HashMap[] mapArr = this.f;
                mapArr[0].put("ImageLength", n35VarD);
                mapArr[0].put("ImageWidth", n35VarD2);
                if (z2) {
                    Log.d("ExifInterface", "Updated to length: " + ((int) s2) + ", width: " + ((int) s3));
                    return;
                }
                return;
            }
            m35Var.b(unsignedShort2);
        }
    }

    public final void l(q35 q35Var) throws Throwable {
        r(q35Var);
        v(q35Var, 0);
        z(q35Var, 0);
        z(q35Var, 5);
        z(q35Var, 4);
        A();
        if (this.d == 8) {
            HashMap[] mapArr = this.f;
            n35 n35Var = (n35) mapArr[1].get("MakerNote");
            if (n35Var != null) {
                q35 q35Var2 = new q35(n35Var.d);
                q35Var2.c = this.h;
                q35Var2.b(6);
                v(q35Var2, 9);
                n35 n35Var2 = (n35) mapArr[9].get("ColorSpace");
                if (n35Var2 != null) {
                    mapArr[1].put("ColorSpace", n35Var2);
                }
            }
        }
    }

    public final void m(q35 q35Var) throws Throwable {
        if (o) {
            Log.d("ExifInterface", "getRw2Attributes starting with: " + q35Var);
        }
        l(q35Var);
        HashMap[] mapArr = this.f;
        n35 n35Var = (n35) mapArr[0].get("JpgFromRaw");
        if (n35Var != null) {
            g(new m35(n35Var.d), (int) n35Var.c, 5);
        }
        n35 n35Var2 = (n35) mapArr[0].get("ISO");
        n35 n35Var3 = (n35) mapArr[1].get("PhotographicSensitivity");
        if (n35Var2 == null || n35Var3 != null) {
            return;
        }
        mapArr[1].put("PhotographicSensitivity", n35Var2);
    }

    public final boolean n(q35 q35Var) throws IOException {
        byte[] bArr = P;
        byte[] bArr2 = new byte[bArr.length];
        q35Var.readFully(bArr2);
        if (!Arrays.equals(bArr2, bArr)) {
            b1.l("ExifInterface", "Given data is not EXIF-only.");
            return false;
        }
        byte[] bArrCopyOf = new byte[UserMetadata.MAX_ATTRIBUTE_SIZE];
        int i = 0;
        while (true) {
            if (i == bArrCopyOf.length) {
                bArrCopyOf = Arrays.copyOf(bArrCopyOf, bArrCopyOf.length * 2);
            }
            int i2 = q35Var.a.read(bArrCopyOf, i, bArrCopyOf.length - i);
            if (i2 == -1) {
                byte[] bArrCopyOf2 = Arrays.copyOf(bArrCopyOf, i);
                this.j = bArr.length;
                u(bArrCopyOf2, 0);
                return true;
            }
            i += i2;
            q35Var.b += i2;
        }
    }

    public final void o(m35 m35Var) throws Throwable {
        if (o) {
            Log.d("ExifInterface", "getWebpAttributes starting with: " + m35Var);
        }
        m35Var.c = ByteOrder.LITTLE_ENDIAN;
        m35Var.b(B.length);
        int i = m35Var.readInt() + 8;
        byte[] bArr = C;
        m35Var.b(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                m35Var.readFully(bArr2);
                int i2 = m35Var.readInt();
                int i3 = length + 8;
                if (Arrays.equals(D, bArr2)) {
                    byte[] bArrCopyOfRange = new byte[i2];
                    m35Var.readFully(bArrCopyOfRange);
                    byte[] bArr3 = P;
                    if (vpf.P(bArrCopyOfRange, bArr3)) {
                        bArrCopyOfRange = Arrays.copyOfRange(bArrCopyOfRange, bArr3.length, i2);
                    }
                    this.j = i3;
                    u(bArrCopyOfRange, 0);
                    x(new m35(bArrCopyOfRange));
                    return;
                }
                if (i2 % 2 == 1) {
                    i2++;
                }
                length = i3 + i2;
                if (length == i) {
                    return;
                }
                if (length > i) {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
                m35Var.b(i2);
            } catch (EOFException e) {
                throw new IOException("Encountered corrupt WebP file.", e);
            }
        }
    }

    public final void p(m35 m35Var, HashMap map) throws Throwable {
        n35 n35Var = (n35) map.get("JPEGInterchangeFormat");
        n35 n35Var2 = (n35) map.get("JPEGInterchangeFormatLength");
        if (n35Var == null || n35Var2 == null) {
            return;
        }
        int iF = n35Var.f(this.h);
        int iF2 = n35Var2.f(this.h);
        if (this.d == 7) {
            iF += this.k;
        }
        if (iF > 0 && iF2 > 0 && this.a == null && this.c == null && this.b == null) {
            m35Var.b(iF);
            m35Var.readFully(new byte[iF2]);
        }
        if (o) {
            Log.d("ExifInterface", "Setting thumbnail attributes with offset: " + iF + ", length: " + iF2);
        }
    }

    public final boolean q(HashMap map) {
        n35 n35Var = (n35) map.get("ImageLength");
        n35 n35Var2 = (n35) map.get("ImageWidth");
        if (n35Var == null || n35Var2 == null) {
            return false;
        }
        return n35Var.f(this.h) <= 512 && n35Var2.f(this.h) <= 512;
    }

    public final void r(q35 q35Var) throws IOException {
        ByteOrder byteOrderT = t(q35Var);
        this.h = byteOrderT;
        q35Var.c = byteOrderT;
        int unsignedShort = q35Var.readUnsignedShort();
        int i = this.d;
        if (i != 7 && i != 10 && unsignedShort != 42) {
            v.b(Integer.toHexString(unsignedShort), "Invalid start code: ");
            return;
        }
        int i2 = q35Var.readInt();
        if (i2 < 8) {
            yg5.m(tec.e(i2, "Invalid first Ifd offset: "));
            return;
        }
        int i3 = i2 - 8;
        if (i3 > 0) {
            q35Var.b(i3);
        }
    }

    public final void s() {
        int i = 0;
        while (true) {
            HashMap[] mapArr = this.f;
            if (i >= mapArr.length) {
                return;
            }
            StringBuilder sbN = ub3.n(i, "The size of tag group[", "]: ");
            sbN.append(mapArr[i].size());
            Log.d("ExifInterface", sbN.toString());
            for (Map.Entry entry : mapArr[i].entrySet()) {
                n35 n35Var = (n35) entry.getValue();
                Log.d("ExifInterface", "tagName: " + ((String) entry.getKey()) + ", tagType: " + n35Var.toString() + ", tagValue: '" + n35Var.g(this.h) + "'");
            }
            i++;
        }
    }

    public final void u(byte[] bArr, int i) throws IOException {
        q35 q35Var = new q35(bArr);
        r(q35Var);
        v(q35Var, i);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0210  */
    /* JADX WARN: Code duplicated, block: B:103:0x0214  */
    /* JADX WARN: Code duplicated, block: B:108:0x0221  */
    /* JADX WARN: Code duplicated, block: B:109:0x0226  */
    /* JADX WARN: Code duplicated, block: B:110:0x0232  */
    /* JADX WARN: Code duplicated, block: B:112:0x0239  */
    /* JADX WARN: Code duplicated, block: B:115:0x0253 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:119:0x025b  */
    /* JADX WARN: Code duplicated, block: B:127:0x0299  */
    /* JADX WARN: Code duplicated, block: B:129:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:132:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:134:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:137:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:139:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:148:0x0328  */
    /* JADX WARN: Code duplicated, block: B:175:0x032b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x014f  */
    /* JADX WARN: Code duplicated, block: B:72:0x0158  */
    /* JADX WARN: Code duplicated, block: B:74:0x0160  */
    /* JADX WARN: Code duplicated, block: B:76:0x0166  */
    /* JADX WARN: Code duplicated, block: B:77:0x017a  */
    /* JADX WARN: Code duplicated, block: B:80:0x0181  */
    /* JADX WARN: Code duplicated, block: B:82:0x018b  */
    /* JADX WARN: Code duplicated, block: B:83:0x018d  */
    /* JADX WARN: Code duplicated, block: B:84:0x0191  */
    /* JADX WARN: Code duplicated, block: B:86:0x0194  */
    /* JADX WARN: Code duplicated, block: B:90:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:93:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:95:0x0206  */
    /* JADX WARN: Code duplicated, block: B:97:0x0209  */
    /* JADX WARN: Code duplicated, block: B:99:0x020c  */
    /* JADX WARN: Instruction removed from duplicated block: B:129:0x02a1, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:76:0x0166, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:93:0x01eb, please report this as an issue */
    public final void v(q35 q35Var, int i) throws IOException {
        HashMap[] mapArr;
        long j;
        long j2;
        boolean z2;
        int i2;
        long j3;
        Integer num;
        HashSet hashSet;
        long j4;
        String str;
        int unsignedShort;
        long j5;
        String strI;
        int i3;
        int i4 = q35Var.b;
        int i5 = q35Var.e;
        Integer numValueOf = Integer.valueOf(i4);
        HashSet hashSet2 = this.g;
        hashSet2.add(numValueOf);
        short s2 = q35Var.readShort();
        boolean z3 = o;
        if (z3) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + ((int) s2));
        }
        if (s2 <= 0) {
            return;
        }
        short s3 = 0;
        while (true) {
            mapArr = this.f;
            if (s3 >= s2) {
                break;
            }
            int unsignedShort2 = q35Var.readUnsignedShort();
            int unsignedShort3 = q35Var.readUnsignedShort();
            int i6 = q35Var.readInt();
            long j6 = ((long) q35Var.b) + 4;
            short s4 = s2;
            o35 o35Var = (o35) K[i].get(Integer.valueOf(unsignedShort2));
            if (z3) {
                Log.d("ExifInterface", String.format("ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d", Integer.valueOf(i), Integer.valueOf(unsignedShort2), o35Var != null ? o35Var.b : null, Integer.valueOf(unsignedShort3), Integer.valueOf(i6)));
            }
            if (o35Var != null) {
                if (unsignedShort3 > 0) {
                    int[] iArr = F;
                    if (unsignedShort3 < iArr.length) {
                        int i7 = o35Var.c;
                        if (i7 == 7 || unsignedShort3 == 7 || i7 == unsignedShort3 || (i2 = o35Var.d) == unsignedShort3 || (((i7 == 4 || i2 == 4) && unsignedShort3 == 3) || (((i7 == 9 || i2 == 9) && unsignedShort3 == 8) || ((i7 == 12 || i2 == 12) && unsignedShort3 == 11)))) {
                            if (unsignedShort3 == 7) {
                                unsignedShort3 = i7;
                            }
                            j = j6;
                            j2 = ((long) i6) * ((long) iArr[unsignedShort3]);
                            if (j2 < 0 || j2 > 2147483647L) {
                                if (z3 != 0) {
                                    Log.d("ExifInterface", "Skip the tag entry since the number of components is invalid: " + i6);
                                }
                                z2 = false;
                            } else {
                                z2 = true;
                            }
                        } else if (z3 != 0) {
                            Log.d("ExifInterface", "Skip the tag entry since data format (" + E[unsignedShort3] + ") is unexpected for tag: " + o35Var.b);
                        }
                    }
                    if (z2) {
                        j3 = j;
                        if (j2 > 4) {
                            i3 = q35Var.readInt();
                            if (z3 != 0) {
                                Log.d("ExifInterface", "seek to data offset: " + i3);
                            }
                            if (this.d == 7) {
                                if ("MakerNote".equals(o35Var.b)) {
                                    this.k = i3;
                                } else if (i != 6 && "ThumbnailImage".equals(o35Var.b)) {
                                    this.l = i3;
                                    this.m = i6;
                                    n35 n35VarD = n35.d(6, this.h);
                                    n35 n35VarB = n35.b(this.l, this.h);
                                    n35 n35VarB2 = n35.b(this.m, this.h);
                                    mapArr[4].put("Compression", n35VarD);
                                    mapArr[4].put("JPEGInterchangeFormat", n35VarB);
                                    mapArr[4].put("JPEGInterchangeFormatLength", n35VarB2);
                                }
                            }
                            q35Var.h(i3);
                        } else {
                            j3 = j3;
                            unsignedShort2 = unsignedShort2;
                            o35Var = o35Var;
                        }
                        num = (Integer) N.get(Integer.valueOf(unsignedShort2));
                        if (z3 != 0) {
                            Log.d("ExifInterface", "nextIfdType: " + num + " byteCount: " + j2);
                        }
                        if (num != null) {
                            if (unsignedShort3 != 3) {
                                if (unsignedShort3 == 4) {
                                    j5 = ((long) q35Var.readInt()) & 4294967295L;
                                } else if (unsignedShort3 == 8) {
                                    unsignedShort = q35Var.readShort();
                                } else if (unsignedShort3 != 9 || unsignedShort3 == 13) {
                                    unsignedShort = q35Var.readInt();
                                } else {
                                    j5 = -1;
                                }
                                if (z3 != 0) {
                                    Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j5), o35Var.b));
                                }
                                if (j5 > 0 || (i5 != -1 && j5 >= i5)) {
                                    hashSet = hashSet2;
                                    if (z3 != 0) {
                                        strI = ks0.i(j5, "Skip jump into the IFD since its offset is invalid: ");
                                        if (i5 != -1) {
                                            strI = strI + " (total length: " + i5 + ")";
                                        }
                                        Log.d("ExifInterface", strI);
                                    }
                                } else {
                                    hashSet = hashSet2;
                                    if (!hashSet.contains(Integer.valueOf((int) j5))) {
                                        q35Var.h(j5);
                                        v(q35Var, num.intValue());
                                    } else if (z3 != 0) {
                                        Log.d("ExifInterface", "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + j5 + ")");
                                    }
                                }
                                q35Var.h(j3);
                            } else {
                                unsignedShort = q35Var.readUnsignedShort();
                            }
                            j5 = unsignedShort;
                            if (z3 != 0) {
                                Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j5), o35Var.b));
                            }
                            if (j5 > 0) {
                                hashSet = hashSet2;
                                if (z3 != 0) {
                                    strI = ks0.i(j5, "Skip jump into the IFD since its offset is invalid: ");
                                    if (i5 != -1) {
                                        strI = strI + " (total length: " + i5 + ")";
                                    }
                                    Log.d("ExifInterface", strI);
                                }
                            } else {
                                hashSet = hashSet2;
                                if (z3 != 0) {
                                    strI = ks0.i(j5, "Skip jump into the IFD since its offset is invalid: ");
                                    if (i5 != -1) {
                                        strI = strI + " (total length: " + i5 + ")";
                                    }
                                    Log.d("ExifInterface", strI);
                                }
                            }
                            q35Var.h(j3);
                        } else {
                            hashSet = hashSet2;
                            j4 = j3;
                            int i8 = q35Var.b + this.j;
                            byte[] bArr = new byte[(int) j2];
                            q35Var.readFully(bArr);
                            n35 n35Var = new n35(i8, bArr, unsignedShort3, i6);
                            HashMap map = mapArr[i];
                            str = o35Var.b;
                            map.put(str, n35Var);
                            if ("DNGVersion".equals(str)) {
                                this.d = 3;
                            }
                            if (((!"Make".equals(str) || "Model".equals(str)) && n35Var.g(this.h).contains("PENTAX")) || ("Compression".equals(str) && n35Var.f(this.h) == 65535)) {
                                this.d = 8;
                            }
                            if (q35Var.b != j4) {
                                q35Var.h(j4);
                            }
                        }
                    } else {
                        q35Var.h(j);
                        hashSet = hashSet2;
                    }
                    s3 = (short) (s3 + 1);
                    hashSet2 = hashSet;
                    s2 = s4;
                    z3 = z3;
                }
                j = j6;
                if (z3 != 0) {
                    Log.d("ExifInterface", "Skip the tag entry since data format is invalid: " + unsignedShort3);
                }
                j2 = 0;
                z2 = false;
                if (z2) {
                    q35Var.h(j);
                    hashSet = hashSet2;
                } else {
                    j3 = j;
                    if (j2 > 4) {
                        i3 = q35Var.readInt();
                        if (z3 != 0) {
                            Log.d("ExifInterface", "seek to data offset: " + i3);
                        }
                        if (this.d == 7) {
                            if ("MakerNote".equals(o35Var.b)) {
                                this.k = i3;
                            } else if (i != 6) {
                            }
                        }
                        q35Var.h(i3);
                    } else {
                        j3 = j3;
                        unsignedShort2 = unsignedShort2;
                        o35Var = o35Var;
                    }
                    num = (Integer) N.get(Integer.valueOf(unsignedShort2));
                    if (z3 != 0) {
                        Log.d("ExifInterface", "nextIfdType: " + num + " byteCount: " + j2);
                    }
                    if (num != null) {
                        if (unsignedShort3 != 3) {
                            if (unsignedShort3 == 4) {
                                j5 = ((long) q35Var.readInt()) & 4294967295L;
                            } else if (unsignedShort3 == 8) {
                                if (unsignedShort3 != 9) {
                                }
                                unsignedShort = q35Var.readInt();
                            } else {
                                unsignedShort = q35Var.readShort();
                            }
                            if (z3 != 0) {
                                Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j5), o35Var.b));
                            }
                            if (j5 > 0) {
                                hashSet = hashSet2;
                                if (z3 != 0) {
                                    strI = ks0.i(j5, "Skip jump into the IFD since its offset is invalid: ");
                                    if (i5 != -1) {
                                        strI = strI + " (total length: " + i5 + ")";
                                    }
                                    Log.d("ExifInterface", strI);
                                }
                            } else {
                                hashSet = hashSet2;
                                if (z3 != 0) {
                                    strI = ks0.i(j5, "Skip jump into the IFD since its offset is invalid: ");
                                    if (i5 != -1) {
                                        strI = strI + " (total length: " + i5 + ")";
                                    }
                                    Log.d("ExifInterface", strI);
                                }
                            }
                            q35Var.h(j3);
                        } else {
                            unsignedShort = q35Var.readUnsignedShort();
                        }
                        j5 = unsignedShort;
                        if (z3 != 0) {
                            Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j5), o35Var.b));
                        }
                        if (j5 > 0) {
                            hashSet = hashSet2;
                            if (z3 != 0) {
                                strI = ks0.i(j5, "Skip jump into the IFD since its offset is invalid: ");
                                if (i5 != -1) {
                                    strI = strI + " (total length: " + i5 + ")";
                                }
                                Log.d("ExifInterface", strI);
                            }
                        } else {
                            hashSet = hashSet2;
                            if (z3 != 0) {
                                strI = ks0.i(j5, "Skip jump into the IFD since its offset is invalid: ");
                                if (i5 != -1) {
                                    strI = strI + " (total length: " + i5 + ")";
                                }
                                Log.d("ExifInterface", strI);
                            }
                        }
                        q35Var.h(j3);
                    } else {
                        hashSet = hashSet2;
                        j4 = j3;
                        int i9 = q35Var.b + this.j;
                        byte[] bArr2 = new byte[(int) j2];
                        q35Var.readFully(bArr2);
                        n35 n35Var2 = new n35(i9, bArr2, unsignedShort3, i6);
                        HashMap map2 = mapArr[i];
                        str = o35Var.b;
                        map2.put(str, n35Var2);
                        if ("DNGVersion".equals(str)) {
                            this.d = 3;
                        }
                        if (!"Make".equals(str)) {
                        }
                        this.d = 8;
                        if (q35Var.b != j4) {
                            q35Var.h(j4);
                        }
                    }
                }
                s3 = (short) (s3 + 1);
                hashSet2 = hashSet;
                s2 = s4;
                z3 = z3;
            } else if (z3) {
                Log.d("ExifInterface", "Skip the tag entry since tag number is not defined: " + unsignedShort2);
            }
            j = j6;
            j2 = 0;
            z2 = false;
            if (z2) {
                q35Var.h(j);
                hashSet = hashSet2;
            } else {
                j3 = j;
                if (j2 > 4) {
                    i3 = q35Var.readInt();
                    if (z3 != 0) {
                        Log.d("ExifInterface", "seek to data offset: " + i3);
                    }
                    if (this.d == 7) {
                        if ("MakerNote".equals(o35Var.b)) {
                            this.k = i3;
                        } else if (i != 6) {
                        }
                    }
                    q35Var.h(i3);
                } else {
                    j3 = j3;
                    unsignedShort2 = unsignedShort2;
                    o35Var = o35Var;
                }
                num = (Integer) N.get(Integer.valueOf(unsignedShort2));
                if (z3 != 0) {
                    Log.d("ExifInterface", "nextIfdType: " + num + " byteCount: " + j2);
                }
                if (num != null) {
                    if (unsignedShort3 != 3) {
                        if (unsignedShort3 == 4) {
                            j5 = ((long) q35Var.readInt()) & 4294967295L;
                        } else if (unsignedShort3 == 8) {
                            if (unsignedShort3 != 9) {
                            }
                            unsignedShort = q35Var.readInt();
                        } else {
                            unsignedShort = q35Var.readShort();
                        }
                        if (z3 != 0) {
                            Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j5), o35Var.b));
                        }
                        if (j5 > 0) {
                            hashSet = hashSet2;
                            if (z3 != 0) {
                                strI = ks0.i(j5, "Skip jump into the IFD since its offset is invalid: ");
                                if (i5 != -1) {
                                    strI = strI + " (total length: " + i5 + ")";
                                }
                                Log.d("ExifInterface", strI);
                            }
                        } else {
                            hashSet = hashSet2;
                            if (z3 != 0) {
                                strI = ks0.i(j5, "Skip jump into the IFD since its offset is invalid: ");
                                if (i5 != -1) {
                                    strI = strI + " (total length: " + i5 + ")";
                                }
                                Log.d("ExifInterface", strI);
                            }
                        }
                        q35Var.h(j3);
                    } else {
                        unsignedShort = q35Var.readUnsignedShort();
                    }
                    j5 = unsignedShort;
                    if (z3 != 0) {
                        Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j5), o35Var.b));
                    }
                    if (j5 > 0) {
                        hashSet = hashSet2;
                        if (z3 != 0) {
                            strI = ks0.i(j5, "Skip jump into the IFD since its offset is invalid: ");
                            if (i5 != -1) {
                                strI = strI + " (total length: " + i5 + ")";
                            }
                            Log.d("ExifInterface", strI);
                        }
                    } else {
                        hashSet = hashSet2;
                        if (z3 != 0) {
                            strI = ks0.i(j5, "Skip jump into the IFD since its offset is invalid: ");
                            if (i5 != -1) {
                                strI = strI + " (total length: " + i5 + ")";
                            }
                            Log.d("ExifInterface", strI);
                        }
                    }
                    q35Var.h(j3);
                } else {
                    hashSet = hashSet2;
                    j4 = j3;
                    int i10 = q35Var.b + this.j;
                    byte[] bArr3 = new byte[(int) j2];
                    q35Var.readFully(bArr3);
                    n35 n35Var3 = new n35(i10, bArr3, unsignedShort3, i6);
                    HashMap map3 = mapArr[i];
                    str = o35Var.b;
                    map3.put(str, n35Var3);
                    if ("DNGVersion".equals(str)) {
                        this.d = 3;
                    }
                    if (!"Make".equals(str)) {
                    }
                    this.d = 8;
                    if (q35Var.b != j4) {
                        q35Var.h(j4);
                    }
                }
            }
            s3 = (short) (s3 + 1);
            hashSet2 = hashSet;
            s2 = s4;
            z3 = z3;
        }
        HashSet hashSet3 = hashSet2;
        boolean z4 = z3;
        int i11 = q35Var.readInt();
        if (z4) {
            Log.d("ExifInterface", String.format("nextIfdOffset: %d", Integer.valueOf(i11)));
        }
        long j7 = i11;
        if (j7 <= 0) {
            if (z4) {
                Log.d("ExifInterface", "Stop reading file since a wrong offset may cause an infinite loop: " + i11);
                return;
            }
            return;
        }
        if (hashSet3.contains(Integer.valueOf(i11))) {
            if (z4) {
                Log.d("ExifInterface", "Stop reading file since re-reading an IFD may cause an infinite loop: " + i11);
                return;
            }
            return;
        }
        q35Var.h(j7);
        if (mapArr[4].isEmpty()) {
            v(q35Var, 4);
        } else if (mapArr[5].isEmpty()) {
            v(q35Var, 5);
        }
    }

    public final void w(int i, String str, String str2) {
        HashMap[] mapArr = this.f;
        if (mapArr[i].isEmpty() || mapArr[i].get(str) == null) {
            return;
        }
        HashMap map = mapArr[i];
        map.put(str2, (n35) map.get(str));
        mapArr[i].remove(str);
    }

    public final void x(m35 m35Var) throws Throwable {
        n35 n35Var;
        int iF;
        HashMap map = this.f[4];
        n35 n35Var2 = (n35) map.get("Compression");
        if (n35Var2 == null) {
            p(m35Var, map);
            return;
        }
        int iF2 = n35Var2.f(this.h);
        if (iF2 != 1) {
            if (iF2 == 6) {
                p(m35Var, map);
                return;
            } else if (iF2 != 7) {
                return;
            }
        }
        n35 n35Var3 = (n35) map.get("BitsPerSample");
        if (n35Var3 != null) {
            int[] iArr = (int[]) n35Var3.h(this.h);
            int[] iArr2 = p;
            if (Arrays.equals(iArr2, iArr) || (this.d == 3 && (n35Var = (n35) map.get("PhotometricInterpretation")) != null && (((iF = n35Var.f(this.h)) == 1 && Arrays.equals(iArr, q)) || (iF == 6 && Arrays.equals(iArr, iArr2))))) {
                n35 n35Var4 = (n35) map.get("StripOffsets");
                n35 n35Var5 = (n35) map.get("StripByteCounts");
                if (n35Var4 == null || n35Var5 == null) {
                    return;
                }
                long[] jArrU = vpf.u(n35Var4.h(this.h));
                long[] jArrU2 = vpf.u(n35Var5.h(this.h));
                if (jArrU == null || jArrU.length == 0) {
                    b1.l("ExifInterface", "stripOffsets should not be null or have zero length.");
                    return;
                }
                if (jArrU2 == null || jArrU2.length == 0) {
                    b1.l("ExifInterface", "stripByteCounts should not be null or have zero length.");
                    return;
                }
                if (jArrU.length != jArrU2.length) {
                    b1.l("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
                    return;
                }
                long j = 0;
                for (long j2 : jArrU2) {
                    j += j2;
                }
                byte[] bArr = new byte[(int) j];
                this.i = true;
                int i = 0;
                int i2 = 0;
                for (int i3 = 0; i3 < jArrU.length; i3++) {
                    int i4 = (int) jArrU[i3];
                    int i5 = (int) jArrU2[i3];
                    if (i3 < jArrU.length - 1 && i4 + i5 != jArrU[i3 + 1]) {
                        this.i = false;
                    }
                    int i6 = i4 - i;
                    if (i6 < 0) {
                        Log.d("ExifInterface", "Invalid strip offset value");
                        return;
                    }
                    try {
                        m35Var.b(i6);
                        int i7 = i + i6;
                        byte[] bArr2 = new byte[i5];
                        try {
                            m35Var.readFully(bArr2);
                            i = i7 + i5;
                            System.arraycopy(bArr2, 0, bArr, i2, i5);
                            i2 += i5;
                        } catch (EOFException unused) {
                            Log.d("ExifInterface", "Failed to read " + i5 + " bytes.");
                            return;
                        }
                    } catch (EOFException unused2) {
                        Log.d("ExifInterface", "Failed to skip " + i6 + " bytes.");
                        return;
                    }
                }
                if (this.i) {
                    long j3 = jArrU[0];
                    return;
                }
                return;
            }
        }
        if (o) {
            Log.d("ExifInterface", "Unsupported data type value");
        }
    }

    public final void y(int i, int i2) throws Throwable {
        HashMap[] mapArr = this.f;
        boolean zIsEmpty = mapArr[i].isEmpty();
        boolean z2 = o;
        if (zIsEmpty || mapArr[i2].isEmpty()) {
            if (z2) {
                Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
                return;
            }
            return;
        }
        n35 n35Var = (n35) mapArr[i].get("ImageLength");
        n35 n35Var2 = (n35) mapArr[i].get("ImageWidth");
        n35 n35Var3 = (n35) mapArr[i2].get("ImageLength");
        n35 n35Var4 = (n35) mapArr[i2].get("ImageWidth");
        if (n35Var == null || n35Var2 == null) {
            if (z2) {
                Log.d("ExifInterface", "First image does not contain valid size information");
                return;
            }
            return;
        }
        if (n35Var3 == null || n35Var4 == null) {
            if (z2) {
                Log.d("ExifInterface", "Second image does not contain valid size information");
                return;
            }
            return;
        }
        int iF = n35Var.f(this.h);
        int iF2 = n35Var2.f(this.h);
        int iF3 = n35Var3.f(this.h);
        int iF4 = n35Var4.f(this.h);
        if (iF >= iF3 || iF2 >= iF4) {
            return;
        }
        HashMap map = mapArr[i];
        mapArr[i] = mapArr[i2];
        mapArr[i2] = map;
    }

    public final void z(q35 q35Var, int i) throws Throwable {
        n35 n35VarD;
        n35 n35VarD2;
        HashMap[] mapArr = this.f;
        n35 n35Var = (n35) mapArr[i].get("DefaultCropSize");
        n35 n35Var2 = (n35) mapArr[i].get("SensorTopBorder");
        n35 n35Var3 = (n35) mapArr[i].get("SensorLeftBorder");
        n35 n35Var4 = (n35) mapArr[i].get("SensorBottomBorder");
        n35 n35Var5 = (n35) mapArr[i].get("SensorRightBorder");
        if (n35Var != null) {
            int i2 = n35Var.a;
            ByteOrder byteOrder = this.h;
            if (i2 == 5) {
                p35[] p35VarArr = (p35[]) n35Var.h(byteOrder);
                if (p35VarArr == null || p35VarArr.length != 2) {
                    b1.l("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(p35VarArr));
                    return;
                } else {
                    n35VarD = n35.c(new p35[]{p35VarArr[0]}, this.h);
                    n35VarD2 = n35.c(new p35[]{p35VarArr[1]}, this.h);
                }
            } else {
                int[] iArr = (int[]) n35Var.h(byteOrder);
                if (iArr == null || iArr.length != 2) {
                    b1.l("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                    return;
                }
                n35VarD = n35.d(iArr[0], this.h);
                n35VarD2 = n35.d(iArr[1], this.h);
            }
            mapArr[i].put("ImageWidth", n35VarD);
            mapArr[i].put("ImageLength", n35VarD2);
            return;
        }
        if (n35Var2 != null && n35Var3 != null && n35Var4 != null && n35Var5 != null) {
            int iF = n35Var2.f(this.h);
            int iF2 = n35Var4.f(this.h);
            int iF3 = n35Var5.f(this.h);
            int iF4 = n35Var3.f(this.h);
            if (iF2 <= iF || iF3 <= iF4) {
                return;
            }
            n35 n35VarD3 = n35.d(iF2 - iF, this.h);
            n35 n35VarD4 = n35.d(iF3 - iF4, this.h);
            mapArr[i].put("ImageLength", n35VarD3);
            mapArr[i].put("ImageWidth", n35VarD4);
            return;
        }
        n35 n35Var6 = (n35) mapArr[i].get("ImageLength");
        n35 n35Var7 = (n35) mapArr[i].get("ImageWidth");
        if (n35Var6 == null || n35Var7 == null) {
            n35 n35Var8 = (n35) mapArr[i].get("JPEGInterchangeFormat");
            n35 n35Var9 = (n35) mapArr[i].get("JPEGInterchangeFormatLength");
            if (n35Var8 == null || n35Var9 == null) {
                return;
            }
            int iF5 = n35Var8.f(this.h);
            int iF6 = n35Var8.f(this.h);
            q35Var.h(iF5);
            byte[] bArr = new byte[iF6];
            q35Var.readFully(bArr);
            g(new m35(bArr), iF5, i);
        }
    }
}
