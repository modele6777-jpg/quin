package defpackage;

import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class qz1 {
    public static final qfc b = new qfc();
    public static final ww2 c = new ww2(14);
    public static final LinkedHashMap d = new LinkedHashMap();
    public static final qz1 e;
    public static final qz1 f;
    public static final qz1 g;
    public static final qz1 h;
    public static final qz1 i;
    public static final qz1 j;
    public static final qz1 k;
    public static final qz1 l;
    public static final qz1 m;
    public static final qz1 n;
    public static final qz1 o;
    public static final qz1 p;
    public static final qz1 q;
    public static final qz1 r;
    public static final qz1 s;
    public static final qz1 t;
    public final String a;

    static {
        qfc.J0("SSL_RSA_WITH_NULL_MD5");
        qfc.J0("SSL_RSA_WITH_NULL_SHA");
        qfc.J0("SSL_RSA_EXPORT_WITH_RC4_40_MD5");
        qfc.J0("SSL_RSA_WITH_RC4_128_MD5");
        qfc.J0("SSL_RSA_WITH_RC4_128_SHA");
        qfc.J0("SSL_RSA_EXPORT_WITH_DES40_CBC_SHA");
        qfc.J0("SSL_RSA_WITH_DES_CBC_SHA");
        e = qfc.J0("SSL_RSA_WITH_3DES_EDE_CBC_SHA");
        qfc.J0("SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA");
        qfc.J0("SSL_DHE_DSS_WITH_DES_CBC_SHA");
        qfc.J0("SSL_DHE_DSS_WITH_3DES_EDE_CBC_SHA");
        qfc.J0("SSL_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA");
        qfc.J0("SSL_DHE_RSA_WITH_DES_CBC_SHA");
        qfc.J0("SSL_DHE_RSA_WITH_3DES_EDE_CBC_SHA");
        qfc.J0("SSL_DH_anon_EXPORT_WITH_RC4_40_MD5");
        qfc.J0("SSL_DH_anon_WITH_RC4_128_MD5");
        qfc.J0("SSL_DH_anon_EXPORT_WITH_DES40_CBC_SHA");
        qfc.J0("SSL_DH_anon_WITH_DES_CBC_SHA");
        qfc.J0("SSL_DH_anon_WITH_3DES_EDE_CBC_SHA");
        qfc.J0("TLS_KRB5_WITH_DES_CBC_SHA");
        qfc.J0("TLS_KRB5_WITH_3DES_EDE_CBC_SHA");
        qfc.J0("TLS_KRB5_WITH_RC4_128_SHA");
        qfc.J0("TLS_KRB5_WITH_DES_CBC_MD5");
        qfc.J0("TLS_KRB5_WITH_3DES_EDE_CBC_MD5");
        qfc.J0("TLS_KRB5_WITH_RC4_128_MD5");
        qfc.J0("TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA");
        qfc.J0("TLS_KRB5_EXPORT_WITH_RC4_40_SHA");
        qfc.J0("TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5");
        qfc.J0("TLS_KRB5_EXPORT_WITH_RC4_40_MD5");
        f = qfc.J0("TLS_RSA_WITH_AES_128_CBC_SHA");
        qfc.J0("TLS_DHE_DSS_WITH_AES_128_CBC_SHA");
        qfc.J0("TLS_DHE_RSA_WITH_AES_128_CBC_SHA");
        qfc.J0("TLS_DH_anon_WITH_AES_128_CBC_SHA");
        g = qfc.J0("TLS_RSA_WITH_AES_256_CBC_SHA");
        qfc.J0("TLS_DHE_DSS_WITH_AES_256_CBC_SHA");
        qfc.J0("TLS_DHE_RSA_WITH_AES_256_CBC_SHA");
        qfc.J0("TLS_DH_anon_WITH_AES_256_CBC_SHA");
        qfc.J0("TLS_RSA_WITH_NULL_SHA256");
        qfc.J0("TLS_RSA_WITH_AES_128_CBC_SHA256");
        qfc.J0("TLS_RSA_WITH_AES_256_CBC_SHA256");
        qfc.J0("TLS_DHE_DSS_WITH_AES_128_CBC_SHA256");
        qfc.J0("TLS_RSA_WITH_CAMELLIA_128_CBC_SHA");
        qfc.J0("TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA");
        qfc.J0("TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA");
        qfc.J0("TLS_DHE_RSA_WITH_AES_128_CBC_SHA256");
        qfc.J0("TLS_DHE_DSS_WITH_AES_256_CBC_SHA256");
        qfc.J0("TLS_DHE_RSA_WITH_AES_256_CBC_SHA256");
        qfc.J0("TLS_DH_anon_WITH_AES_128_CBC_SHA256");
        qfc.J0("TLS_DH_anon_WITH_AES_256_CBC_SHA256");
        qfc.J0("TLS_RSA_WITH_CAMELLIA_256_CBC_SHA");
        qfc.J0("TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA");
        qfc.J0("TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA");
        qfc.J0("TLS_PSK_WITH_RC4_128_SHA");
        qfc.J0("TLS_PSK_WITH_3DES_EDE_CBC_SHA");
        qfc.J0("TLS_PSK_WITH_AES_128_CBC_SHA");
        qfc.J0("TLS_PSK_WITH_AES_256_CBC_SHA");
        qfc.J0("TLS_RSA_WITH_SEED_CBC_SHA");
        h = qfc.J0("TLS_RSA_WITH_AES_128_GCM_SHA256");
        i = qfc.J0("TLS_RSA_WITH_AES_256_GCM_SHA384");
        qfc.J0("TLS_DHE_RSA_WITH_AES_128_GCM_SHA256");
        qfc.J0("TLS_DHE_RSA_WITH_AES_256_GCM_SHA384");
        qfc.J0("TLS_DHE_DSS_WITH_AES_128_GCM_SHA256");
        qfc.J0("TLS_DHE_DSS_WITH_AES_256_GCM_SHA384");
        qfc.J0("TLS_DH_anon_WITH_AES_128_GCM_SHA256");
        qfc.J0("TLS_DH_anon_WITH_AES_256_GCM_SHA384");
        qfc.J0("TLS_EMPTY_RENEGOTIATION_INFO_SCSV");
        qfc.J0("TLS_FALLBACK_SCSV");
        qfc.J0("TLS_ECDH_ECDSA_WITH_NULL_SHA");
        qfc.J0("TLS_ECDH_ECDSA_WITH_RC4_128_SHA");
        qfc.J0("TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA");
        qfc.J0("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA");
        qfc.J0("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA");
        qfc.J0("TLS_ECDHE_ECDSA_WITH_NULL_SHA");
        qfc.J0("TLS_ECDHE_ECDSA_WITH_RC4_128_SHA");
        qfc.J0("TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA");
        qfc.J0("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA");
        qfc.J0("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA");
        qfc.J0("TLS_ECDH_RSA_WITH_NULL_SHA");
        qfc.J0("TLS_ECDH_RSA_WITH_RC4_128_SHA");
        qfc.J0("TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA");
        qfc.J0("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA");
        qfc.J0("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA");
        qfc.J0("TLS_ECDHE_RSA_WITH_NULL_SHA");
        qfc.J0("TLS_ECDHE_RSA_WITH_RC4_128_SHA");
        qfc.J0("TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA");
        j = qfc.J0("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA");
        k = qfc.J0("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA");
        qfc.J0("TLS_ECDH_anon_WITH_NULL_SHA");
        qfc.J0("TLS_ECDH_anon_WITH_RC4_128_SHA");
        qfc.J0("TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA");
        qfc.J0("TLS_ECDH_anon_WITH_AES_128_CBC_SHA");
        qfc.J0("TLS_ECDH_anon_WITH_AES_256_CBC_SHA");
        qfc.J0("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256");
        qfc.J0("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384");
        qfc.J0("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256");
        qfc.J0("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384");
        qfc.J0("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256");
        qfc.J0("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384");
        qfc.J0("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256");
        qfc.J0("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384");
        l = qfc.J0("TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256");
        m = qfc.J0("TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384");
        qfc.J0("TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256");
        qfc.J0("TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384");
        n = qfc.J0("TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256");
        o = qfc.J0("TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384");
        qfc.J0("TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256");
        qfc.J0("TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384");
        qfc.J0("TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA");
        qfc.J0("TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA");
        p = qfc.J0("TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256");
        q = qfc.J0("TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256");
        qfc.J0("TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256");
        qfc.J0("TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256");
        r = qfc.J0("TLS_AES_128_GCM_SHA256");
        s = qfc.J0("TLS_AES_256_GCM_SHA384");
        t = qfc.J0("TLS_CHACHA20_POLY1305_SHA256");
        qfc.J0("TLS_AES_128_CCM_SHA256");
        qfc.J0("TLS_AES_128_CCM_8_SHA256");
    }

    public qz1(String str) {
        this.a = str;
    }

    public final String toString() {
        return this.a;
    }
}
