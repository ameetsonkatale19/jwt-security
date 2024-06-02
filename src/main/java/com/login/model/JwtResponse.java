package com.login.model;


public class JwtResponse {

	private String jwtToken;
	
	private String username;

	public JwtResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	private JwtResponse(Builder builder) {
        this.jwtToken = builder.jwtToken;
        this.username = builder.username;
    }

	public String getJwtToken() {
		return jwtToken;
	}

	public void setJwtToken(String jwtToken) {
		this.jwtToken = jwtToken;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Override
	public String toString() {
		return "JwtResponse [jwtToken=" + jwtToken + ", username=" + username + "]";
	}

	public static Builder builder() {
        return new Builder();
    }
	
    // Builder class
    public static class Builder {
        private String jwtToken;
        private String username;

        public Builder() {}

        public Builder jwtToken(String jwtToken) {
            this.jwtToken = jwtToken;
            return this;
        }

        public Builder username(String username) {
            this.username = username;
            return this;
        }

        public JwtResponse build() {
            return new JwtResponse(this);
        }
    }
	
}
