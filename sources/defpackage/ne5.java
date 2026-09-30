package defpackage;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import io.sentry.config.a;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ne5 extends eb3 {
    public static void Z(File file, File file2) {
        if (!file.exists()) {
            throw new pf9(file, null, "The source file doesn't exist.");
        }
        if (file2.exists() && !file2.delete()) {
            throw new ed5(file, file2, "Tried to overwrite the destination, but failed to delete it.");
        }
        if (file.isDirectory()) {
            if (!file2.mkdirs()) {
                throw new ae5(file, file2, "Failed to create target directory.");
            }
            return;
        }
        File parentFile = file2.getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
        }
        FileInputStream fileInputStreamB = a.b(file, new FileInputStream(file));
        try {
            FileOutputStream fileOutputStreamE = a.e(new FileOutputStream(file2), file2);
            try {
                lmg.Y(fileInputStreamB, fileOutputStreamE);
                fileOutputStreamE.close();
                fileInputStreamB.close();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    ym8.t(fileOutputStreamE, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                ym8.t(fileInputStreamB, th3);
                throw th4;
            }
        }
    }

    public static String a0(File file) {
        file.getClass();
        String name = file.getName();
        name.getClass();
        return v4e.g0('.', name, "");
    }

    public static final md5 b0(md5 md5Var) {
        File file = md5Var.a;
        List<File> list = md5Var.b;
        ArrayList arrayList = new ArrayList(list.size());
        for (File file2 : list) {
            String name = file2.getName();
            if (!pa7.t(name, ".")) {
                if (!pa7.t(name, "..")) {
                    arrayList.add(file2);
                } else if (arrayList.isEmpty() || pa7.t(((File) s72.F0(arrayList)).getName(), "..")) {
                    arrayList.add(file2);
                }
            }
        }
        return new md5(file, arrayList);
    }

    public static File c0(File file, File file2) throws IOException {
        String string;
        file.getClass();
        md5 md5VarB0 = b0(eb3.V(file));
        List list = md5VarB0.b;
        md5 md5VarB1 = b0(eb3.V(file2));
        List list2 = md5VarB1.b;
        if (md5VarB0.a.equals(md5VarB1.a)) {
            int size = list2.size();
            int size2 = list.size();
            int iMin = Math.min(size2, size);
            int i = 0;
            while (i < iMin && pa7.t(list.get(i), list2.get(i))) {
                i++;
            }
            StringBuilder sb = new StringBuilder();
            int i2 = size - 1;
            if (i <= i2) {
                while (true) {
                    if (pa7.t(((File) list2.get(i2)).getName(), "..")) {
                        string = null;
                    } else {
                        sb.append("..");
                        if (i2 != i) {
                            sb.append(File.separatorChar);
                        }
                        if (i2 != i) {
                            i2--;
                        }
                    }
                }
            }
            if (i < size2) {
                if (i < size) {
                    sb.append(File.separatorChar);
                }
                List listR0 = s72.r0(list, i);
                String str = File.separator;
                str.getClass();
                s72.C0(listR0, sb, str, null, null, null, 124);
            }
            string = sb.toString();
        } else {
            string = null;
        }
        if (string != null) {
            return new File(string);
        }
        pd4.j("this and base files have different roots: ", file, " and ", file2, 46);
        return null;
    }

    public static void d0(File file, String str) throws IOException {
        Charset charset = ox1.a;
        charset.getClass();
        FileOutputStream fileOutputStreamE = a.e(new FileOutputStream(file), file);
        try {
            e0(fileOutputStreamE, str, charset);
            fileOutputStreamE.close();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                ym8.t(fileOutputStreamE, th);
                throw th2;
            }
        }
    }

    public static final void e0(FileOutputStream fileOutputStream, String str, Charset charset) throws IOException {
        fileOutputStream.getClass();
        if (str.length() < 16384) {
            byte[] bytes = str.getBytes(charset);
            bytes.getClass();
            fileOutputStream.write(bytes);
            return;
        }
        CharsetEncoder charsetEncoderNewEncoder = charset.newEncoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        CharsetEncoder charsetEncoderOnUnmappableCharacter = charsetEncoderNewEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
        CharBuffer charBufferAllocate = CharBuffer.allocate(UserMetadata.MAX_INTERNAL_KEY_SIZE);
        charsetEncoderOnUnmappableCharacter.getClass();
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(UserMetadata.MAX_INTERNAL_KEY_SIZE * ((int) Math.ceil(charsetEncoderOnUnmappableCharacter.maxBytesPerChar())));
        byteBufferAllocate.getClass();
        int i = 0;
        int i2 = 0;
        while (i < str.length()) {
            int iMin = Math.min(8192 - i2, str.length() - i);
            int i3 = i + iMin;
            char[] cArrArray = charBufferAllocate.array();
            cArrArray.getClass();
            str.getChars(i, i3, cArrArray, i2);
            charBufferAllocate.limit(iMin + i2);
            i2 = 1;
            if (!charsetEncoderOnUnmappableCharacter.encode(charBufferAllocate, byteBufferAllocate, i3 == str.length()).isUnderflow()) {
                qc0.p("Check failed.");
                return;
            }
            fileOutputStream.write(byteBufferAllocate.array(), 0, byteBufferAllocate.position());
            if (charBufferAllocate.position() != charBufferAllocate.limit()) {
                charBufferAllocate.put(0, charBufferAllocate.get());
            } else {
                i2 = 0;
            }
            charBufferAllocate.clear();
            byteBufferAllocate.clear();
            i = i3;
        }
    }
}
