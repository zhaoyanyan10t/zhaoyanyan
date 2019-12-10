#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <string.h>

#define N 100
#define M 100
#define T 100
#define L 100
const char keyword[][10] = { "int", "double", "for", "return", "if", "else" };
const char id[][10] = { "id", "number", "keyword", "+", "-", "*", "/", "<", "=", "<=", "==", "(", ")", "{", "}" };
char text[N];
char objlist[T][L];
char buffer[L];
int trans[M][128];
int cnt;
void input() {
	char ch, *p = text;
	freopen("in.txt", "r", stdin);
	while ((ch = getchar()) != EOF) {
		*p++ = ch;
	}
	puts("**************************************");
	puts(text);
	puts("**************************************");
}
void build() {
	char ch;
	for (ch = '0'; ch <= '9'; ch++) {
		trans[0][ch] = 1;
		trans[1][ch] = 1;
		trans[2][ch] = 3;
		trans[3][ch] = 3;
		trans[4][ch] = 6;
		trans[5][ch] = 6;
		trans[6][ch] = 6;

		trans[7][ch] = 7;
	}
	trans[1]['.'] = 2;
	trans[3]['e'] = 4;
	trans[1]['e'] = 4;
	trans[4]['+'] = 5;
	trans[4]['-'] = 5;

	trans[0]['_'] = 7;
	trans[7]['_'] = 7;
	for (ch = 'a'; ch <= 'z'; ch++) {
		trans[0][ch] = 7;
		trans[7][ch] = 7;
	}
	for (ch = 'A'; ch <= 'Z'; ch++) {
		trans[0][ch] = 7;
		trans[7][ch] = 7;
	}

	trans[0]['<'] = 8;
	trans[0]['='] = 8;
	trans[8]['='] = 9;

	trans[0]['+'] = 10;
	trans[0]['-'] = 10;
	trans[0]['*'] = 10;
	trans[0]['/'] = 10;

	trans[0]['('] = 11;
	trans[0][')'] = 11;
	trans[0]['{'] = 11;
	trans[0]['}'] = 11;
}
int find_objlist(char *p) {
	int i;
	for (i = 0; i < cnt; i++) {
		if (strcmp(p, objlist[i]) == 0) {
			return i;
		}
	};
	strcpy(objlist[cnt++], p);
	return cnt - 1;
}
int find_keyword(char *p) {
	int i;
	for (i = 0; i < sizeof(keyword) / 10; i++) {
		if (strcmp(p, keyword[i]) == 0) {
			return i;
		}
	}
	return -1;
}
int find_id(char *p) {
	int i;
	for (i = 3; i < sizeof(id) / 10; i++) {
		if (strcmp(p, id[i]) == 0) {
			return i;
		}
	}
	return -1;
}
int isDigits(char *p) {
	return *p >= '0' && *p <= '9';
}
int find(char *p) {
	int ans;
	ans = find_keyword(p);
	if (~ans) return 2;
	else {
		ans = find_id(p);
		return ~ans ? ans : isDigits(p);
	}
}
void output(int x) {
	int y = x;
	char *p = id[x];
	x = x < 2 ? find_objlist(buffer) : -1;
	printf("< ");
	while (*p) putchar(*p++);
	if (~x) printf(" , %d > \t[ %s ]\n", x, buffer);
	else printf(" ,   > \t[ %s ]\n", buffer);
}
//buffer保存当前词法单元
void process() {
	char ch, *p = text, *pb = buffer;
	int cur = 0;
	while (ch = *p++) {
		cur = trans[cur][ch];
		if (cur == 0) {
			*pb = 0;
			if (pb != buffer) output(find(buffer));
			if (trans[0][ch]) p--;
			pb = buffer;
		}
		else {
			*pb++ = ch;
		}
	}
}

int main() {
	input();//输入
	build();//构造DFA
	process();//利用DFA分析字符串
	return 0;
}
